using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using TagSystemSimulator.Command;

namespace TagSystemSimulator
{
    class Algorithm
    {
        public static string ACCEPT = "ACCEPT";
        public static string REJECT = "REJECT";
        public static char WILDCARD = '*';

        private Dictionary<string, ICommand> commands = new Dictionary<string, ICommand>();
        private string _firstCommand = null;

        public string FirstCommand
        {
            get { return this._firstCommand; }
        }

        public void Add(string name, ICommand command)
        {
            this.commands.Add(name, command);

            if (this._firstCommand == null)
            {
                this._firstCommand = name;
            }
        }

        public ICommand Get(string commandName)
        {
            if (commandName == REJECT)
                return RejectCommand.Instance;

            if (commandName == ACCEPT)
                return AcceptCommand.Instance;

            return this.commands[commandName];
        }

        public static Algorithm CreateFromFile(string filename)
        {
            return CreateFromFile(new StreamReader(filename));
        }

        private static Algorithm CreateFromFile(StreamReader fr)
        {
            Algorithm algorthm = new Algorithm();
            ICommand command = null;
            string line;
            string name;
            string commandString;
            string[] parameters;

            while (fr.Peek() > 0)
            {
                line = fr.ReadLine();
                line = line.Trim();

                if (line.Count() > 0 && !line.StartsWith(";"))
                {
                    name = line.Substring(0, line.IndexOf(':'));
                    commandString = line.Substring(line.IndexOf(':') + 1).Trim();

                    if (commandString.StartsWith("write"))
                    {
                        commandString = commandString.Substring(6).Trim();
                        parameters = commandString.Split(new string[] { "goto" }, StringSplitOptions.None);

                        if (parameters[0].Trim() == "\" \"")
                            parameters[0] = " ";

                        parameters[1] = parameters[1].Trim();

                        algorthm.Add(name, new WriteCommand(parameters[0][0], parameters[1]));
                    }
                    else
                    {
                        if (commandString.StartsWith("read"))
                        {
                            algorthm.Add(name, new ReadCommand());
                        }
                        else
                        {
                            if (commandString.StartsWith("when"))
                            {
                                command = algorthm.Get(name);

                                commandString = commandString.Substring(5).Trim();
                                parameters = commandString.Split(new string[] { "goto" }, StringSplitOptions.None);

                                if (parameters[0].Trim() == "\" \"")
                                    parameters[0] = " ";

                                parameters[1] = parameters[1].Trim();

                                ((ReadCommand)command).AddCondiction(parameters[0][0], parameters[1]);
                            }
                        }
                    }
                }
            }

            return algorthm;
        }
    }
}

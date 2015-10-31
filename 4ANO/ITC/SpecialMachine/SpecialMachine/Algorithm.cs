using SpecialMachine.Commands;
using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SpecialMachine
{
    public class Algorithm
    {
        private string _firstCommandName = null;
        private Dictionary<string, ICommand> _commands = new Dictionary<string,ICommand>();

        public static Algorithm CreateFromFile(string filename)
        {
            return CreateFromFile(new StreamReader(filename));
        }

        public static Algorithm CreateFromFile(StreamReader content)
        {
            string line;
            string name;
            string command;
            string[] parameters;

            Algorithm a = new Algorithm();

            while (content.Peek() > 0)
            {
                line = content.ReadLine();

                if (line.Length > 0 && !line.StartsWith(";"))
                {
                    name = line.Split(':')[0].Trim();
                    command = line.Split(':')[1].Trim();
                    command = command.Replace(";", "");

                    if (command.StartsWith("if"))
                    {
                        command = command.Replace("else", "");
                        parameters = command.Split(new string[] { "goto" }, StringSplitOptions.None);
                        a.Add(name, new If(parameters[1].Trim(), parameters[2].Trim()));
                    }
                    else if (command.StartsWith("accept"))
                    {
                        a.Add(name, new Accept());
                    }
                    else if (command.StartsWith("reject"))
                    {
                        a.Add(name, new Reject());
                    }
                    else
                    {
                        parameters = command.Split(new string[] { "goto" }, StringSplitOptions.None);
                        parameters[1] = parameters[1].Trim();
                        if (command.StartsWith("check"))
                        {
                            a.Add(name, new Check(parameters[1]));
                        }
                        else if (command.StartsWith("uncheck"))
                        {
                            a.Add(name, new Uncheck(parameters[1]));
                        }
                        else if (command.StartsWith("moveright"))
                        {
                            a.Add(name, new MoveRight(parameters[1]));
                        }
                        else if (command.StartsWith("moveleft"))
                        {
                            a.Add(name, new MoveLeft(parameters[1]));
                        }
                    }
                }
            }

            return a;
        }

        public string FirstCommandName
        {
            get { return this._firstCommandName; }
        }

        public void Add(string name, ICommand command)
        {
            if (this._firstCommandName == null)
                this._firstCommandName = name;

            if (this._commands.ContainsKey(name))
                this._commands[name] = command;
            else
                this._commands.Add(name, command);
        }

        public ICommand Get(string name)
        {
            if (this._commands.ContainsKey(name))
                return this._commands[name];
            else
                return null;
        }
    }
}

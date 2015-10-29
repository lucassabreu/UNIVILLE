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

        public Algorithm CreateFromFile(string filename)
        {
            return CreateFromFile(new FileStream(filename, FileMode.Open));
        }

        public Algorithm CreateFromFile(Stream content)
        {
            return null;
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

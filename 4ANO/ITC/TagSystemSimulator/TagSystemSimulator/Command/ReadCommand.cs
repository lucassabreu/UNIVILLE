using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TagSystemSimulator.Command
{
    class ReadCommand : ICommand
    {
        private Dictionary<char, string> _condictions = new Dictionary<char,string>();
        private char _symbol;

        public void AddCondiction (char symbol, string commandName){

            if (_condictions.ContainsKey(symbol))
                this._condictions.Add(symbol, commandName);
            else
                this._condictions[symbol] = commandName;

        }

        public string Execute(Simulator sim)
        {
            _symbol = sim.Read();

            string commandName = null;

            if (this._condictions.TryGetValue(_symbol, out commandName))
            {
                commandName = this._condictions[_symbol];
            }
            else
            {
                if (this._condictions.ContainsKey(Algorithm.WILDCARD))
                {
                    _symbol = Algorithm.WILDCARD;
                    commandName = this._condictions[Algorithm.WILDCARD];
                }
                else
                {
                    commandName = Algorithm.REJECT;
                }
            }

            return commandName;
        }

        public override string ToString()
        {
            string commandName = Algorithm.REJECT;

            if (_condictions.TryGetValue(_symbol, out commandName))
            {
                commandName = _condictions[_symbol];
            }
            else
            {
                commandName = Algorithm.REJECT;
            }

            return String.Format("read(); when {0} goto {1};", _symbol, commandName);
        }
    }
}

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SimuladorProgramaMaquinaTurring.TuringMachine
{
    class Program
    {
        private Dictionary<string, List<Command>> labels = new Dictionary<string, List<Command>>();

        private string _firstLabel = null;

        public void AddCommandToLabel(string labelName, params Command[] commands)
        {
            List<Command> label = this.GetLabel(labelName.Trim());

            if (label == null)
                this.SetLabel(labelName, commands.ToList());
            else
            {
                label.AddRange(commands);
            }
        }

        public void SetLabel(string label, List<Command> commands)
        {
            label = label.Trim().ToUpper();

            if (label.Equals("ACCEPT") || label.Equals("REJECT"))
            {
                throw new InvalidOperationException("You can't create a label named \"ACCEPT\" or \"REJECT\", trey are private");
            }

            labels[label] = commands;

            if (this.FirstLabel == null)
                this.FirstLabel = label;
        }

        public List<Command> GetLabel(string label)
        {
            label = label.Trim().ToUpper();

            if (this.labels.ContainsKey(label))
                return this.labels[label];
            else
                return null;
        }

        public string[] LabelList
        {
            get { return this.labels.Keys.ToArray(); }
        }

        public string FirstLabel
        {
            set
            {
                if (!this.labels.ContainsKey(value))
                    throw new InvalidOperationException(String.Format("There is no label named \"{0}\"", value));

                this._firstLabel = value;
            }

            get { return this._firstLabel; }
        }
    }
}

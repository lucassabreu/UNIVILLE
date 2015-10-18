using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SimuladorProgramaMaquinaTurring.TuringMachine
{
    class Command
    {

        public static string ACCEPT = "ACCEPT";
        public static string REJECT = "REJECT";
        public static Nullable<char> WILDCARD = null;
        public static char EMPTY = '\0';

        public static int LEFT = -1;
        public static int STAY = 0;
        public static int RIGHT = 1;

        private Nullable<char> _equalsTo;
        private Nullable<char> _write;
        private string _goToLabel;
        private int _moveTo = 1;

        public Command(Nullable<char> equalsTo, Nullable<char> write, int moveTo, string goToLabel)
        {
            this._equalsTo = equalsTo;
            this._write = write;
            this._goToLabel = goToLabel;
            this._moveTo = moveTo;
        }

        public Nullable<char> EqualsTo
        {
            get { return this._equalsTo; }
        }

        public Nullable<char> WriteSymbol
        {
            get { return this._write; }
        }

        public string GoToLabel
        {
            get { return this._goToLabel; }
        }

        public int MoveTo
        {
            get { return this._moveTo; }
        }

    }
}

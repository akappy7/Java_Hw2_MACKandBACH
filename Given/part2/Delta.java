public class Delta extends Seq{

        protected int num;
        protected int initial;
        protected int delta;

        public Delta(int num, int initial, int delta)
        {
                this.num = num;
                this.initial = initial;
                this.delta = delta;

        }

        public String toString(){
		if(this.num == 0)
		{
			return String.format("< " + this.num + " : 0 &0 >");

		}
                return String.format("< " + this.num + " : " + this.initial + " &" + this.delta + " >");

        }


}


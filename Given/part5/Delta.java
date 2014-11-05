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

        public int min(){
                if(num == 0)
                        return 0;
                else if(delta <= 0) { // if delta is negative the last element in the sequence will be min
                        return initial + delta * (num - 1);
                } else
                        return initial;
        }


}


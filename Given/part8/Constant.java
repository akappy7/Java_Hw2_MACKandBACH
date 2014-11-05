public class Constant extends Seq{

        protected int value;

        public Constant(int num, int value){
                this.num = num;
                this.value = value;

        }

        public  String toString(){	

		if(this.num == 0)
                {
                        return String.format("[ " + this.num + " : 0 ]");

                }

                return String.format("[ " + this.num + " : " + this.value + " ]");

        }

        public int min(){
                if(num == 0)
                        return 0;
                else
                        return value;
        }

        public SeqIt createSeqIt() {
                return new ConstantIt(this);
        }

}


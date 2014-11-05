public class Jumble extends Seq{

        int[] value;
	int num;
        public Jumble(int [] value){

                this.num = value.length;
		//if(num == 0)
	//	{
	//		this.value[0] = 1;
	//	}
		this.value = new int[value.length];
		System.arraycopy(value, 0, this.value, 0, value.length);
        }

        public String toString(){
		
		String temp;
                temp = "{ " + String.valueOf(this.num) + " :";
		for(int i = 0; i < this.num; i ++)
		{
			temp = temp + " " + String.valueOf(this.value[i]); 
		}
		temp = temp + " }";	
		return String.format(temp);
        }


  public int min() {
  	if(value.length == 0)
  		return 0;
  	
  	int min = value[0];
  	for(int i = 0; i < value.length; i++)
  		if(value[i] < min)
  			min = value[i];

  	return min;
  }
}


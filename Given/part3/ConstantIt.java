public class ConstantIt implements SeqIt
{
	//public boolean hasNext();
	//public int Next();
    private int position;
    private Constant s;
	ConstantIt(Constant S)
	{
        s = S;
        position = 1;          	
	}
    
    public boolean hasNext()
    {
        if(position > s.num)
        {   
            return false;
        }   
        return true;
    }
    public int next()
    {
        if (!hasNext())
        {
            System.err.println("ConstantIt called past end");
            System.exit(1);    
        }
        position++; 
        return s.value;
        
    }

}

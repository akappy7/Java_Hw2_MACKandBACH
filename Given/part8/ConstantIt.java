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
    public int next() throws UsingIteratorPastEndException
    {
        if (!hasNext())
        {
            throw new UsingIteratorPastEndException();
        }
        position++; 
        return s.value;
        
    }

}

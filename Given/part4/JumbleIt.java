public class JumbleIt implements SeqIt
{
        private Jumble s;
        private int position;
        JumbleIt(Jumble S)
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
           
            int returnValue = s.value[position-1];
            position++;
            return returnValue;

  
        }
        
        
}






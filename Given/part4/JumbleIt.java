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
        public int next()
        {
            if (!hasNext())
            {
                System.err.println("JumbleIt called past end");
                System.exit(1);
            }
           
            int returnValue = s.value[position-1];
            position++;
            return returnValue;

  
        }
        
        
}






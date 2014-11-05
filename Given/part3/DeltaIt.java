public class DeltaIt implements SeqIt
{
        private Delta s ;
        private int position;
        DeltaIt(Delta S)
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
                 System.err.println("DeltaIt called past end");
                 System.exit(1);
            }
            int calcNum = 0;
            calcNum = (position-1) * s.delta + s.initial;
            position++;
            return calcNum;      
        }
}   


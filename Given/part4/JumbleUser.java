public class JumbleUser{

    static int lengthLongestNDCSS1(Jumble j)
    {

        int temp = 1;
        int count = 1;
        if(j.value.length ==0)
            return 0;
        if(j.value.length ==1)
            return 1;
        for(int i = 1; i < j.value.length; i++)
        {
           if(j.value[i] >= j.value[i-1] )
            {
                count++;
            }
            else
            {
                if(count > temp)
                {
                    temp = count;
                }
                count = 1;
            }       
        }
        if(count> temp)
        {
            temp = count;
        }
        return temp;
    }

    static int lengthLongestNDCSS2(Jumble j ) throws UsingIteratorPastEndException {
        JumbleIt it  = new JumbleIt(j);
        int maxCount = 0;
        int count    = 0;
        int current;
        int past;
        try {
            past     = it.next(); //will throw an exception, count and max count will not change to 1
            count    = 1;
            maxCount = 1;
            while(true) {
                current = it.next();
                if(current >= past) {
                    count++;
                    if(count > maxCount)
                        maxCount = count;
                } else
                    count = 1;
                past = current;
            }
        
        } catch(UsingIteratorPastEndException e) {
            return maxCount;
        }
    }

}

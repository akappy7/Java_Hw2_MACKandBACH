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

}

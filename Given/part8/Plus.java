import java.lang.Math.*;

public class Plus {

	public static Seq plus(Seq s1, Seq s2) {
		SeqIt it1 = s1.createSeqIt();
		SeqIt it2 = s2.createSeqIt();
		int i     = 0;
		int past;
		int current;
		int delta = 0;
		int retAr[]       = new int[Math.min(s1.num, s2.num)];
		boolean constStat = true;
		boolean deltaStat = true;

		if(retAr.length == 0)
			return new Constant(0, 0); //empty constant

		retAr[i++] = it1.next() + it2.next();
		past       = retAr[0]; //initialize past to first summed element

		while(it1.hasNext() && it2.hasNext()) {
			current  = it1.next() + it2.next();

			if(i == 1) //initialize delta
				delta = current - past;
				
			if(constStat) { //past will always == current if the sequence is a const
				if(past != current)
					constStat = false;
			}

			if(deltaStat) { //the current - past will always == the original delta if is a delta
				if((current - past) != delta)
					deltaStat = false;
			}

			retAr[i] = current;
			past = current;
			i++;
		}

		if(constStat)
			return new Constant(i, retAr[0]);
		else if(deltaStat)
			return new Delta(i, retAr[0], delta);
		else
			return new Jumble(retAr);

	}
}

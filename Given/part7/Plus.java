import java.lang.Math.*;

public class Plus {
	public static Seq plus (Constant c1, Constant c2) {
		int smaller  = Math.min(c1.num, c2.num);
		int constant = c1.value + c2.value;

		return new Constant(smaller, constant);
	}

	public static Seq plus (Delta d1, Delta d2) {
		int smaller = Math.min(d1.num, d2.num);
		int initial = d1.initial + d2.initial;
		int delta = d1.delta + d2.delta;

		return new Delta(smaller, initial, delta);
	}

	public static Seq plus (Jumble j1, Jumble j2) {
		SeqIt it1 = j1.createSeqIt();
		SeqIt it2 = j2.createSeqIt();
		int i = 0;
		int retAr[] = new int[Math.min(j1.num, j2.num)];
		//want the return array to be the size of the smaller sequence

		while(it1.hasNext() && it2.hasNext()) {
			retAr[i] = it1.next() + it2.next();
			i++;
		}

		return new Jumble(retAr);
	}

	public static Seq plus (Constant c1, Delta d1) {
		int smaller = Math.min(c1.num, d1.num);
		return new Delta(smaller, d1.initial + c1.value, d1.delta);
	}
	
	public static Seq plus (Delta d1, Constant c1) {
		return plus(c1, d1);
	}


	public static Seq plus (Constant a, Jumble b) {
		return genJumble(a, b);
	}
	public static Seq plus (Jumble a, Constant b) {
		return genJumble(a, b);
	}
	public static Seq plus (Delta a, Jumble b) {
		return genJumble(a, b);
	}
	public static Seq plus (Jumble a, Delta b) {
		return genJumble(a, b);
	}


	private static Jumble genJumble(Seq s1, Seq s2) {
		return new Jumble(calcSumAr(s1, s2));
	}

	private static int[] calcSumAr(Seq s1, Seq s2) {
		SeqIt it1 = s1.createSeqIt();
		SeqIt it2 = s2.createSeqIt();
		int i = 0;
		int retAr[] = new int[Math.min(s1.num, s2.num)];
		if(retAr.length == 0)
			return new int[0];
		//want the return array to be the size of the smaller sequence

		while(it1.hasNext() && it2.hasNext())
			retAr[i++] = it1.next() + it2.next();

		return retAr;
	}
}
	//this may come in handy for part 8
	// public static Seq plus (Seq c1, Seq c2) {
	// 	ConstantIt it1 = c1.createIt();
	// 	ConstantIt it2 = c2.createIt();
	// 	int i = 0;
	// 	int retAr[];
	// 	//want the return array to be the size of the smaller sequence
	// 	if(c1.num > c2.num)
	// 		retAr = new int[c2.num];
	// 	else
	// 		retAr = new int[c1.num];

	// 	while(it1.hasNext() && it2.hasNext())
	// 		retAr[i] = it1.next() + it2.next();
	// }

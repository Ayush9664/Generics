package testofmax;

public class Testcases {

private static void findMaxInThree(Integer a,Integer b,Integer c) {
	int max=a;
	if(b.compareTo(a)>0) {
		max=b;
	}
	if(c.compareTo(max)>0) {
		max=c;
	}
	System.out.println("Maximum in Three is:"+max);
}
}

package flyweight;

public class Main {
	public static void main(String[] args) {
		if(args.length ==0){
			System.out.println("Usage:java Main digits");
			System.out.println("Example:java Main 121212");
			System.exit(0);
		}
//		BigString bs = new BigString(args[0]);
//		bs.print();
		BigString bs = new BigString(args[0],Boolean.valueOf(args[1]));
//		System.out.println(Boolean.valueOf(args[1]));
		bs.print();
		Runtime.getRuntime().gc();
		long used = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		System.out.println("Ê¹ÓÃÄÚ´æ="+used);
		
	}
}

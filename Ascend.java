// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		// Replace this comment with your code
		int lim = int.parseInt(args[0]);
		int x =(int)Math.random();
		int y =(int)Math.random();
		int z =(int)Math.random();

		int max = (int)Math.max(x,y);
		max = (int)Math.max(max,z);
		int min = (int)Math.min(x,y);
		min = (int)Math.min(max,z);
		int mid = (x + y + z) - max - min

		System.out.println(min + " " + mid + " "+ max);



		
		

	}
}

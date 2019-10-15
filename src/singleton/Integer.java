package array;

public class Integer {
	public static void main(String[] args) {
		int[] data = new int [5];
		int total = 0;
		
		for(int i=1; i <= 10; i++) {
			if(i % 2==0) {
//				System.out.print( i +" ");
				total += i;
				}
			else {
				continue;
			}
//			System.out.println();
		}
		System.out.println("гу╟Х:" + total);
		
	}

}

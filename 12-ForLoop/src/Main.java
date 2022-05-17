public class Main {

	public static void main(String[] args) {

		// for loop = executes a block of code a limited amount of times

		for (int i = 10; i >= 0; i--) {
			System.out.println(i);
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Happy new year!");
		
		

	}
}
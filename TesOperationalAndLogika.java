package abMentoring2022;

public class TesOperationalAndLogika {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Gabungan && Logika (Min,Max)
		int a= 10;
		int b = 20;
		int c = 50;
//		if(a >= b && Math.min(a, b) >= b) {
//			System.out.println("B");
//		}else {
//			System.out.println("s");
//		}
		String player1 = "Gunting";
		String player2 = "Kertas";
		if(!(player1.equalsIgnoreCase("Gunting") || player2.equalsIgnoreCase("Batu"))) {
			System.out.println("Player 2 Menang");
		}else {
			System.out.println("Player 1 Kalah");
		}
	}

}

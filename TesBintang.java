package abMentoring2022;

public class TesBintang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int baris = 5;
		for(int i = 0; i < baris; i++) {
			for(int j = 0;  j < baris - i; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

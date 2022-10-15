package abMentoring2022;

public class TesBirthday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] lilin = {5,6,8,4,8};
		int lilinTertinggi = 0;
		int banyakLilin = 0;
//		for(int i = 0; i < lilin.length; i++) {
//			if(lilinTertinggi < lilin[i]) {
//				lilinTertinggi = lilin[i];
//			}
//		}
//		for(int j : lilin) {
//			if(lilinTertinggi == j) {
//				banyakLilin += 1;
//			}
//		}
		int max = 0;
		int count = 0;
		for (int v : lilin) {
			if (v > max) {
				max = v; 
				count = 1;
			}
			else if (v == max) {
				count++;
			};
		}
		System.out.println(count);
	}
}

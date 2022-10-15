package abMentoring2022;

public class TesClass {
	//Modifier
	static class Animal{
		int kaki = 4;
		String habitat = "Darat";
		public Animal(int kaki, String habitat) {
			this.kaki = kaki;
			this.habitat = habitat;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal elang = new Animal(2, "darat/air");
		System.out.println(elang.habitat);
		
		Animal hiu = new Animal(0, "air");
		System.out.println(hiu.habitat);
	}

}

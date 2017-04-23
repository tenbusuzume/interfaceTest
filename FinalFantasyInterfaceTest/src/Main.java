import java.util.Scanner;


public class Main {

	public static void main(String[] args) {


		Character saori = new Character("saori", 10, 1);

		Enemy slime = new Enemy("スライム",10,10);

		System.out.println(slime.name + "があらわれた。");
		System.out.println("武器を選んでください");
		System.out.println("1: 剣");
		System.out.println("2: 銃");
		System.out.println("その他: 杖");

		Scanner scanner = new Scanner(System.in);

		Weapon weapon;
		switch(scanner.nextInt()){
		case 1:
			weapon = new Sword();
			break;
		case 2:
			weapon = new Gun();
			break;
		default:
			weapon = new Rod();
			break;
		}

		saori.equipWeapon(weapon);
		saori.attack(slime);
	}
}

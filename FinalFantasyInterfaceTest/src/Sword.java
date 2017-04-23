
public class Sword implements Weapon, Item {

	public static final String name = "剣";
	private static final int attack = 10;

	@Override
	public void attack(Enemy enemy) {
		enemy.hp -= attack;
		System.out.println("剣で" + attack + "のダメージを与えた");
	}

	@Override
	public void showName() {
		System.out.println("ボロい剣");
	}

	@Override
	public void showStatus() {
		System.out.println("剣タイプで攻撃力が" + attack + "あるようだ。");
	}

	@Override
	public void equipMessage() {
		System.out.println(name + "を装備した。");

	}

}

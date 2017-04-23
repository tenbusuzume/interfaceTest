
public class Gun implements Weapon, Item {

	public static final String name = "銃";
	private static final int attack = 8;

	@Override
	public void attack(Enemy enemy) {
		enemy.hp -= attack;
		System.out.println("銃で" + attack + "のダメージを与えた");
	}

	@Override
	public void showName() {
		System.out.println("ボロい銃");
	}

	@Override
	public void showStatus() {
		System.out.println("銃タイプで攻撃力が" + attack + "あるようだ。");
	}


	@Override
	public void equipMessage() {
		System.out.println(name + "を装備した。");

	}

}

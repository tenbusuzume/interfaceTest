
public class Rod implements Weapon, Item {

	public static final String name = "杖";
	private static final int attack = 1;

	@Override
	public void attack(Enemy enemy) {
		enemy.hp -= attack;
		System.out.println("杖で" + attack + "のダメージを与えた");
	}


	@Override
	public void showName() {
		System.out.println("ボロい杖");
	}

	@Override
	public void showStatus() {
		System.out.println("杖タイプで攻撃力が" + attack + "あるようだ。");
	}


	@Override
	public void equipMessage() {
		System.out.println(name + "を装備した。");

	}

}

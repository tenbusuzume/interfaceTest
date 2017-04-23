
public class Character {

	String name;
	int hp;
	int mp;
	Weapon weapon;

	public Character(String name, int hp, int mp) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}

	public void equipWeapon(Weapon weapon){
		weapon.equipMessage();
		this.weapon = weapon;
	}

	public void attack(Enemy enemy){
		weapon.attack(enemy);
	}

	public void showItemName(Item item){
		item.showName();
	}

	public void showItemStatus(Item item){
		item.showStatus();
	}


}

package oop.poly.player;

public class Mage extends Player {

	int mana;
	
	Mage(String name){
		super(name);
		this.mana = 100;
	}
	
	public void blizzard(Player[] target) {
		System.out.println(this.name + "님의 눈보라 시전!!!");
		System.out.println("-----------------------------------");
		for(Player t : target) {
			if(t.name.equals(this.name)) continue;
			int damage = (int)(Math.random()*6 + 10);
			t.hp -= damage;
			System.out.printf("%s님이 %d의 피해를 입었습니다. (남은 체력: %d)\n"
					, t.name, damage, t.hp);
		}
		System.out.println("-----------------------------------");
	}
	
	@Override
	void characterInfo() {
		super.characterInfo();
		System.out.println("# 정신력 " + mana);
	}
	
	
}

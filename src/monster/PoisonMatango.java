package monster;

import job.Hero;

public class PoisonMatango extends Matango {
	int poisonAttackCount = 5;

	public PoisonMatango(char suffix) {
		super(suffix);
	}

	public void attack(Hero hero) {
		super.attack(hero);
		if(this.poisonAttackCount>0) {
			System.out.println("さらに毒の胞子をばらまいた");
			int damage = hero.getHp()/5;
			hero.setHp(hero.getHp()-damage);
			System.out.println(hero.getName() +"に"+ damage +"のダメージ");
			this.poisonAttackCount--;
		}
	}
}



import job.Hero;
import job.SuperHero;

public final class Main {
	public static void main(String[] args) {
		SuperHero superHero = new SuperHero();
		System.out.println(superHero.getName());
		superHero.attack();
		superHero.run();
		Hero hero = new Hero("ミナト");
		hero.run();
	}
}

package job;

public class Hero {
	private String name = "ミナト";
	private int hp = 100;

	public void attack() {
		System.out.println(this.getName() +"の攻撃");
		System.out.println("5のダメージを与えた");
	}

	public void run() {
		System.out.println(this.getName() +"は逃げ出した");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	// finalがついているため子クラスでオーバーライドできない
	public final void slip() {
		this.hp -= 5;
		System.out.println(this.name +"は転んで5のダメージを受けた");
	}
}

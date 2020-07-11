package job;
// もしクラス宣言時にfinalがついていた場合そのクラスは継承できない
public class SuperHero extends Hero {
	private boolean flying;

	public SuperHero() {
		// 先頭で必ず内部インスタンスのコンストラクタを呼び出さなければいけないというルールがある
		// 何も記述がない場合は自動的に親クラスのコンストラクタが呼び出される
		// super();
		// もし内部インスタンスのコンストラクタに引数が必要な場合は必ず定義しなければならない
		super("ミナト");
		System.out.println("SuperHeroのコンストラクタが作動");
	}

	public void fly() {
		this.flying = true;
		System.out.println("飛び上がった");
	}

	public void land() {
		this.flying = false;
		System.out.println("着地した");
	}

	public String getName() {
		// TODO 自動生成されたメソッド・スタブ
		return super.getName();
	}
	// 親クラスにもあるメソッドを子クラス側で上書きすることをオーバーライドという
	public void run() {
		System.out.println(this.getName() +"は撤退した");
	}
	// 親クラスでfinalがついているメソッドはオーバーライドできない
	// public void slip() {
	// 	System.out.println(this.getName() +"は転んだがダメージを受けなかった");
	// }

	public void attack() {
		// オーバーライドしても、子クラスのメソッドが呼び出されるだけで親クラスはなくならず、呼び出すことで使うことができる
		// superとは一つ内側のインスタンスを表す予約語
		super.attack();
		super.attack();
		System.out.println(this.getName() +"は、2回攻撃した");
	}

}

package job;
// もしクラス宣言時にfinalがついていた場合そのクラスは継承できない
public class SuperHero extends Hero {
	private boolean flying;

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

}

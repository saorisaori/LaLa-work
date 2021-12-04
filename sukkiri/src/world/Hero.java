package world;

public class Hero {
	public String name = "ミナト";
	public int hp = 100;       // HP
	
	public Hero() {
		System.out.println("Heroのコンストラクタが動作");
	}

	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃！");
		m.hp = m.hp - 5;
		System.out.println("5ポイントのダメージを与えた");
	}
	
	public void run() {
		System.out.println(this.name + "は、逃げ出した！");
	}
	
	public final void slip() {
		System.out.println("sulip");
		
	}
}
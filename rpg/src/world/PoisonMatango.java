package world;

public class PoisonMatango extends Matango {
	
	public int poisonCount = 5;
	
	public PoisonMatango(char suffix) {
		super(suffix);
	}
	
	public void attack(Hero h) {
		System.out.println("PoisonMatangoの攻撃");
		super.attack(h);
		if (this.poisonCount > 0) {
		System.out.println("さらに毒の胞子をばらまいた！");
		int dmg = h.hp / 5;
		h.hp -= dmg;
		System.out.println
			(h.name + "に" + dmg + "ポイントのダメージ！");
		System.out.println(h.name +"のHP:" + h.hp);
		this.poisonCount--;
		System.out.println("毒攻撃残り回数:" + poisonCount);
		}
	}
}

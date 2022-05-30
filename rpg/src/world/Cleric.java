package world;

import java.util.Random;

public class Cleric {
	String name;
	int hp = 50;
	final int MAX_HP = 50;
	int mp = 10;
	final int MAX_MP = 10;
	
	public void selfAid() {
		System.out.println(this.name + "はセルフエイドを唱えた！");
		this.hp = this.MAX_HP;
		this.mp -= 5;
		System.out.println("HPが最大(50)まで回復した");
	}
	
	/**
	 * 聖職者は祈ることで自分のMPを回復できる。
	 * 回復量は祈る秒数+ランダム(3未満)
	 * ただし、最大MPを超えることはない。
	 * @param sec int 祈る秒数
	 * @return int 回復量
	 */
	
	public int pray(int sec) {
		System.out.println
			(this.name + "は" + sec + "秒間天に祈った！");
		
		// 論理上の回復量を乱数を用いて決定する
		int recover = new Random().nextInt(3) + sec;
		
		//実際の回復量を計算する
		int recoverActual = Math.min(this.MAX_MP - this.mp, recover);
		
		this.mp += recoverActual;
		System.out.println("MPが" + recoverActual + "回復した");
		return recoverActual;
	}
}

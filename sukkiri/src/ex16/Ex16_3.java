package ex16;

import java.util.HashMap;
import java.util.Map;

import chap14.Hero;

public class Ex16_3 {

	public static void main(String[] args) {
		Map<Hero, Integer>heroes = new HashMap<Hero, Integer>();
		heroes.put(h1, 3);
		heroes.put(h2, 7);
		for (Hero hey : heroes.keySet()) {
			int value = heroes.get(key);
			System.out.println(key.getName() + "が倒した敵=" + value);
		}
	}

}

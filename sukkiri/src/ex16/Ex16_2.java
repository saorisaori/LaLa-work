package ex16;

import java.util.ArrayList;
import java.util.List;

import chap14.Hero;

public class Ex16_2 {

	public static void main(String[] args) {
		Hero h1 = new Hero("斎藤");
		Hero h2 = new Hero("鈴木");
		List<Hero>heroes = new ArrayList<Hero>();
		heroes.add(h1);
		heroes.add(h2);
		for (Hero h : heroes) {
			System.out.println(h.name);
		}

	}

}

package ex4;

public class Ex4_2 {

	public static void main(String[] args) {
		// (1)
		int[] moneyList = new int[3];
		moneyList[0] = 121902;
		moneyList[1] = 8302;
		moneyList[2] = 55100;
		
		// (2)
		for (int i = 0; i < moneyList.length; i++) {
			System.out.println(moneyList[i]);
		}

		// (3)
		for (int money : moneyList) {
			System.out.println(money);
		}
	}

}

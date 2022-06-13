package chap17.renshu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tool {
	public int inputNum() {
		boolean isNum = false;
		int num = -1;
		do {
			System.out.print("数字を入力 > ");
			String numTxt = new Scanner(System.in).nextLine();
			try {
				num = Integer.parseInt(numTxt);
				isNum = true;
			} catch (NumberFormatException e) {
				// e.printStackTrace();
				System.out.println("数字です");
			}
		} while (isNum == false);
		return num;
	}

	public int getNum() {
		int num = -1;
		boolean isNum = false;

		while (!isNum) {
			System.out.print("数字を入力 > ");
			try {
				num = new Scanner(System.in).nextInt();
				isNum = true;
			} catch (InputMismatchException e) {
				// e.printStackTrace();
				System.out.println("数字を入力してください");
			}
		}
		return num;
	}
}

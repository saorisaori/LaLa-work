package chap04;

public class Main07 {

	public static void main(String[] args) {
		/*
		int[][] scores = new int[2][3];
		scores[0][0] = 40;
		scores[0][1] = 50;
		scores[0][2] = 60;
		scores[1][0] = 80;
		scores[1][1] = 60;
		scores[1][2] = 70;
		*/
		
		int[][] scores = {
				{40, 50, 60},
				{80, 60, 70},
		};
		
		for (int i = 0; i < scores.length; i++) {
			for (int k = 0; k < scores[i].length; k++) {
				System.out.print(scores[i][k]);
			}
			System.out.println();
		}
	}

}

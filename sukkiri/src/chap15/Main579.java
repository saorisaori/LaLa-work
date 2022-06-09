package chap15;

public class Main579 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		// ここで何らかの時間がかかる処理
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			System.out.println("エラーが起きました");
			System.out.println(e.getMessage());
		}
		
		long end = System.currentTimeMillis();
		System.out.println("処理にかかった時間は…" 
		+ (end - start) + "ミリ秒でした");

	}

}

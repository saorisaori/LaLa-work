package ex15;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ex15_5 {

	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		System.out.println(now);
		
		LocalDate future = now.plusDays(100);
		System.out.println(future);
		
		DateTimeFormatter fmt = 
				DateTimeFormatter.ofPattern("西暦yyyy年MM月dd日");
		System.out.println(future.format(fmt));
		

	}

}

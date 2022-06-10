package ex15;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex15_4 {

	public static void main(String[] args) {
		// ①現在の日時をDate型で取得
		Date now = new Date();
		System.out.println(now);
		
		Calendar c = Calendar.getInstance();
		
		// ②取得した日時情報をCalendarにセット
		c.setTime(now);
		
		// ③Calendarから「日」の情報を取得
		int day = c.get(Calendar.DAY_OF_MONTH);
		System.out.println("day:" + day);
		
		// ④取得した値に100を足してCalendarの「日」にセット
		day += 100;
		c.set(Calendar.DAY_OF_MONTH, day);
		
		// ⑤Calendarの日付情報をDate型に変換
		Date future = c.getTime();
		System.out.println(future);
		
		// ⑥指定された形式で表示
		SimpleDateFormat f =
				new SimpleDateFormat("西暦 yyyy年MM月dd日");
		System.out.println(f.format(future));
		
	}

}

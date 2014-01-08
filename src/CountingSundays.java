import java.util.Calendar;
import java.util.GregorianCalendar;

public class CountingSundays {

	/**
	 * @param args
	 */
	public static boolean checkLeap(int year) {
		if (year % 4 == 0 && year % 100 != 0 || year % 100 == 0
				&& year % 400 == 0)
			return true;
		else
			return false;
	}

	public static int countNumberOfSundays() {
		int numberOfSundays = 0;

		Calendar cal = new GregorianCalendar();

		// We have been told that 1st of January, 1900 was a Monday
		cal.set(1900, Calendar.JANUARY, 1);
		int sundayValue = cal.get(Calendar.DAY_OF_WEEK) - 1;

		for (int year = 1901; year < 1903; year++)
			for (int month = Calendar.JANUARY; month <= Calendar.DECEMBER; month++) {
				cal.set(year, month, 1);
				if (cal.get(Calendar.DAY_OF_WEEK) == sundayValue)
					numberOfSundays++;
			}

		return numberOfSundays;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] monthDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int year = 1900;
		int day = 2;
		int curMonth = 0;
		int month = 1;
		int sunCounter = 0;
		while (year<2001) {
			
			if (day == 1 && month == 1 &&year>1900)
				sunCounter++;
			
			if (month == monthDays[curMonth]) {
				if (curMonth == 1 && checkLeap(year)) {
					day = (day + 1) % 7;
				}
				
				if (curMonth == 11 && month == 31) {
					year++;
				}
				curMonth = (curMonth + 1) % 12;
				
				month = 1;
				
				
			}
			else {
				month++;
			}
			day = (day + 1) % 7;
			
		}
		System.out.println(sunCounter);
		System.out.println(curMonth);
		System.out.println(day);
	}

}

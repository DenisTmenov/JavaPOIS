import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Lab02_02 {
	public static void main(String[] args) {
		printTask();

		int year = getInt("год своего рождения");
		int month = getInt("месяц своего рождения");
		int day = getInt("день своего рождения");

		System.out.println("=============================");
		printBurn(day, month, year);
		Date dateNow = new Date();
		Date dateBurn = null;
		try {
			dateBurn = convertStringToDate(day, month, year);
		} catch (ParseException e) {
			System.out.println("Error!!!");
		}
		if (dateBurn != null) {
			long subtractionDate = subtractionDates(dateNow, dateBurn);

			System.out.println("Вы прожили " + getLivedYears(subtractionDate) + " лет");
			System.out.println("Вы прожили " + getLivedMonths(subtractionDate) + " месяцев");
			System.out.println("Вы прожили " + getLivedDays(subtractionDate) + " дней");
			System.out.println("Вы прожили " + getLivedHours(subtractionDate) + " часов");
			System.out.println("Вы прожили " + getLivedMinutes(subtractionDate) + " минут");
			System.out.println("Вы прожили " + getLivedSeconds(subtractionDate) + " секунд");
		}

		System.out.println("=============================");

	}

	private static long getLivedYears(long date) {
		return date / 1000 / 60 / 60 / 24 / 365;
	}

	private static long getLivedMonths(long date) {
		return date / 1000 / 60 / 60 / 24 / 12;
	}

	private static long getLivedDays(long date) {
		return date / 1000 / 60 / 60 / 24;
	}

	private static long getLivedHours(long date) {
		return date / 1000 / 60 / 60;
	}

	private static long getLivedMinutes(long date) {
		return date / 1000 / 60;
	}

	private static long getLivedSeconds(long date) {
		return date / 1000;
	}

	private static long subtractionDates(Date date1, Date date2) {
		return Math.abs(date1.getTime() - date2.getTime());
	}

	private static Date convertStringToDate(int day, int month, int year) throws ParseException {
		String string = joinDateBurn(day, month, year);
		DateFormat format = new SimpleDateFormat("dd.MM.yyyy", Locale.ENGLISH);
		return format.parse(string);
	}

	private static void printTask() {
		System.out.println("Разработать интерактивную программу «What is My Age in Seconds (Minutes, Hours, …)»,");
		System.out.println(
				"которая спрашивает дату рождения пользователя, высчитывает количество прожитых пользователем");
		System.out.println("секунд (минут, часов, …) и выводит результат на экран монитора.");
		System.out.println("");
	}

	private static void printBurn(int day, int month, int year) {
		System.out.println("Вы родились " + joinDateBurn(day, month, year));
	}

	private static String joinDateBurn(int day, int month, int year) {
		StringBuilder sb = new StringBuilder();
		sb.append(day).append(".");
		sb.append(month).append(".");
		sb.append(year);
		return sb.toString();
	}

	private static int getInt(String numberName) {
		Scanner scanner = new Scanner(System.in);
		String str = "";
		do {
			System.out.println("Введите " + numberName);
			str = scanner.nextLine();
		} while (!isInteger(str));
		return Integer.parseInt(str);
	}

	public static boolean isInteger(String str) {
		try {
			double d = Integer.parseInt(str);
		} catch (NumberFormatException nfe) {
			return false;
		}
		return true;
	}

}
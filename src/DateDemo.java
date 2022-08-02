import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class DateDemo {
	public static void main(String[] args) {
		Date date = new Date();
		// LocalDate
		// Instant
		// Temporal

		// milisecoonds from GMT 1jan 1970 start of day
		// Time Zone
//		for (int i = 0; i <= 365; i++) {
//			System.out.println(date);
//			date.setDate(date.getDate() + 1);
//
//		}
//		dd/mm/yyyy 
//		mm/dd/yyyy
//		dd.mm.yyyy
//		Calendar cal = new GregorianCalendar();
//		System.out.println(cal.getTime());
//		cal.roll(Calendar.MINUTE, -20);
//		System.out.println(cal.getTime());
//		Calendar.getInstance(aLocale);
		
		Locale l = new Locale("en", "uk");
		     
		Locale[] availableLocales = Calendar.getAvailableLocales();
		for (int i = 0; i < availableLocales.length; i++) {
			System.out.println(availableLocales[i].getDisplayCountry());
		}
		TimeZone.getAvailableIDs()
		Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT +1:00"),
				Locale.FRENCH);
		System.out.println("Current Calendar's Year: " + calendar.get(Calendar.YEAR));
		System.out.println("Current Calendar's Day: " + calendar.get(Calendar.DATE));
		System.out.println("Current hour: " + calendar.get(Calendar.HOUR_OF_DAY));
		System.out.println("Current MINUTE: " + calendar.get(Calendar.MINUTE));
		System.out.println("Current SECOND: " + calendar.get(Calendar.SECOND));

		
//		1,23,45,675
//		1,112,345,675
	}
}

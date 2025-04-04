import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateOfBirthToAge {
    private static String calculateAge(String date) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate birthDate = LocalDate.parse(date, dateTimeFormatter);
        Period age = Period.between(birthDate, LocalDate.now());
        return age.getYears() + " years, " + age.getMonths() + " months, and " + age.getDays() + " days old";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter you birth date in format of (dd--mm--yyyy) : ");
        String date = sc.nextLine();
        String age = calculateAge(date);
        System.out.println(age);
    }
}

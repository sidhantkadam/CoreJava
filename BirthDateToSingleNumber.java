import java.util.Scanner;

public class BirthDateToSingleNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String birthDateStr = sc.nextLine();
        long birthDate;
        if (birthDateStr.startsWith("0")) {
            String replace = birthDateStr.replace("0", "");
            birthDate = Long.parseLong(replace);
        } else {
            birthDate = Long.parseLong(birthDateStr);
        }
        int number = convertDateIntoSingleNumber(birthDate);
        System.out.println("Final Single Number: " + number);
    }

    private static int convertDateIntoSingleNumber(long birthDate) {
        long number = 0;
        int finalD = 0;

        while (birthDate > 0) {
            number = number + birthDate % 10;
            birthDate = birthDate / 10;
            if (number >= 10) {
                finalD = doLastCheck(number);
            } else {
                finalD = (int) number;
            }
        }
        return finalD;
    }

    private static int doLastCheck(long number) {
        int returnNumber = 0;
        while (number > 9) {
            returnNumber = (int) number % 10;
            number = number / 10;
            returnNumber += (int) number;
        }
        if (returnNumber >= 10) {
            int bot1 = returnNumber % 10;
            int bot2 = returnNumber / 10;
            return bot1 + bot2;
        } else {
            return returnNumber;
        }
    }
}
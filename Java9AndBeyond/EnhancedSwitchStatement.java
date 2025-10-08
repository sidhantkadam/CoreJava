package Java9AndBeyond;

import java.time.Month;
import java.time.Year;

public class EnhancedSwitchStatement {

    public static int traditionalSwitchExpression(Month month, int year) {
        int noOfDays;
        switch (month) {
            case APRIL:
            case JUNE:
            case SEPTEMBER:
            case NOVEMBER:
                noOfDays = 30;
                break;
            case FEBRUARY:
                noOfDays = Year.isLeap(year) ? 29 : 28;
                break;
            default:
                noOfDays = 31;
                break;
        }
        return noOfDays;
    }

    public static int enhancedSwitchExpression(Month month, int year) {
        int noOfDays = switch (month) {
            case SEPTEMBER, APRIL, JUNE, NOVEMBER -> 30;
            case FEBRUARY -> Year.isLeap(year) ? 29 : 28;
            default -> 31;
        };
        return noOfDays;
    }

    public static void main(String[] args) {
        Month month = Month.FEBRUARY;
        int year = 2025;
        int result1 = traditionalSwitchExpression(month, year);
        System.out.println("No of days in " + month + " " + year +" is : " + result1);

        int result2 = traditionalSwitchExpression(month, year);
        System.out.println("No of days in " + month + " " + year + " is : " + result2);
    }
}

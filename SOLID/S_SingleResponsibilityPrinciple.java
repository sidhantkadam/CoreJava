package SOLID;

/*
A class should have only one reason to change
Means, Its only have one functionality into it.
*/

// Violates SRP: Handles both employee details and salary calculation

class Logger {
    //Violation before S
    public void printLogs(String message) {
        System.out.println(message);
    }

    public void getLogsFromDB(String logId) {
        System.out.println("Printing logs from DB");
    }

    public void EmailAlert(String message) {
        System.out.println("Email send to client with message : " + message);
    }
}

//After applying solution

class LoggerPrinter {
    public void printLogs(String message) {
        System.out.println(message);
    }
}

class GetLogs {
    public void getLogsFromDB(String logId) {
        System.out.println("Printing logs from DB");
    }
}

class EmailSender {
    public void EmailAlert(String message) {
        System.out.println("Email send to client with message : " + message);
    }
}

public class S_SingleResponsibilityPrinciple {
    public static void main(String[] args) {
        //Each class as its own single responsibility
    }
}

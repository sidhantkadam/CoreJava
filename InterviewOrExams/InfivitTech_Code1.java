package InterviewOrExams;

public class InfivitTech_Code1 {
    public static void main(String[] args) {
        String s = "Akshay Kumar";
        int count = 0;

        char[] charArray = s.toLowerCase().toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == 'k') {
                count++;
                if (count == 2) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}

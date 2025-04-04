package InterviewOrExams;


public class IBM_ReverseComplementOfDNAString {
    private static String makeComplementOfDNA(String dna) {
        StringBuilder reverse = new StringBuilder(dna).reverse();
        StringBuilder complement = new StringBuilder();

        for (int i = 0; i < reverse.length(); i++) {
            char base = reverse.charAt(i);
            switch (base) {
                case 'A':
                    complement.append('T');
                    break;
                case 'T':
                    complement.append('A');
                    break;
                case 'C':
                    complement.append('G');
                    break;
                case 'G':
                    complement.append('C');
                    break;
                default:
                    complement.append(base);
                    break;
            }
        }
        return complement.toString();
    }

    public static void main(String[] args) {
        String dna = "GTCAG";
        System.out.println(makeComplementOfDNA(dna));
    }
}

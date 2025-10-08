package Java9AndBeyond;

public class TextBlocks {

    public static String resultWithFormatting(String name1, String name2) {
        var s = """
                
                
                
                To: %s
                CC: %s
                
                Subject: Action Required: Review of Q1 Budget Proposal
                
                Dear John,
                
                Please find the attached Q1 Budget Proposal for your review. It includes the finalized figures for the Marketing and R&D departments.
                
                The deadline for submission to the executive team is end-of-day Friday. Please ensure you review the document and provide any necessary feedback or approval to me by Thursday so I have time to make final edits.
                
                Thank you for your prompt attention to this matter.
                
                Best regards,
                
                Alice Smith
                Project Lead, Finance Department
                """.formatted(name1, name2);
        return s;
    }

    public static void main(String[] args) {

        String s = resultWithFormatting("john.doe@company.com", "sarah.jones@company.com");
        System.out.println("The mail format : " + s);
    }
}

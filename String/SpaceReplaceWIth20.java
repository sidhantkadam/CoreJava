package String;

public class SpaceReplaceWIth20
{
    public static void main(String[] args) {
        String s = "Mr John Smith   ";

        StringBuilder returnStr = new StringBuilder();
        String[] s1 = s.split(" ");

        for(int i=0;i<s1.length;i++)
        {
            returnStr.append(s1[i]);
            if(returnStr.length() < s.length()-1) {
                returnStr.append("%20");
            }
        }
        System.out.println(returnStr);
    }
}

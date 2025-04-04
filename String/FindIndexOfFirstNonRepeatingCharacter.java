package String;

public class FindIndexOfFirstNonRepeatingCharacter
{
    public static void main(String[] args) {
        String s = "abcdcaf";
        char[] charArray = s.toCharArray();

        for(int i=0;i<charArray.length;i++)
        {
            boolean flag = false;
            for(int j=0;j<charArray.length;j++)
            {
                if(i!=j && charArray[i]==charArray[j])
                {
                    flag = true;
                    break;
                }
            }
            if(!flag)
            {
                System.out.println(s.indexOf(charArray[i]));
                break;
            }
        }
    }
}

/* 5) For a given String convert each the first letter of each word to uppercase */
import java.util.*;
public class LQ5
{
    public static void main(String[] args)
    {
        // inputing string
        Scanner sc = new Scanner(System.in);
        String str =sc.nextLine();
        //intializing sting bulider with  null
        StringBuilder sb = new StringBuilder("");
        // converting first letter to uppercase
        char ch = Character.toUpperCase(str.charAt(0));
        // appending the first letter to sb 
        sb.append(ch);
        // traversing to string
        for (int i = 1; i < str.length(); i++)
        {
            /// whenever we find a space 
            if (str.charAt(i) == ' ')
            {
                // firstly we append the space
                sb.append(str.charAt(i));
                i++;
                // we convert the next character to uppercase
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else
            {
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb);
    }
}

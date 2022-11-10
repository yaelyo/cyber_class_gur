import java.util.*;
public class Last_lesson
{
    public static Scanner reader = new Scanner(System.in);
    public static boolean bukbuk(String st1, String st2)
    {
        boolean isin = false;
        for(int i = 0; i<st1.length(); i++)
        {
            if (st1.charAt(i) == st2.charAt(0))
            {
                isin = true;
                for(int k = 1; k<st2.length(); k++)
                {
                     if(st1.charAt(i+1) == st2.charAt(k))
                     {
                        isin = isin;
                     } else {
                        isin = false;
                        }
                }
            }
        }
        return isin;
    }
    public static void main(String[] args)
    {
    String str1, str2, yesno;
    yesno = "yes";
    while(yesno.equals("yes"))
    {
        str1 = reader.next();
        str2 = reader.next();
        boolean ans = bukbuk(str1, str2);
        if(ans == true)
        {
            System.out.println(str2 + " is in " + str1);
        } else {
        System.out.println(str2 + " is not in " + str1);
    }
    System.out.println("do you want to go again?");
    yesno = reader.next();
}
System.out.print("end");
}
}

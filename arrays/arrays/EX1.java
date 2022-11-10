import java.util.*;
public class EX1
{
    public static Scanner reader = new Scanner(System.in);
    public static void main (String[] args)
    {
        System.out.println("Please enter numbers!");
        int sum = 0;
        int []arr = new int[10];
        for(int i=0; i<arr.length; i++)
        {
            arr[i] = reader.nextInt();
            sum +=arr[i];
            if (arr[i]%2==0){
                System.out.println(arr[i] + " " + i);
                
            }
        }
        
        
        
        
    }
}

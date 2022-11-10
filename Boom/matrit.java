import java.util.*;
public class matrit
{
    public static Scanner reader = new Scanner(System.in);
    public static int alachson(int [][] arr){
        int sum = 0;
        int num =0;
        for (int i=0; i < arr.length; i++){
            num = arr[i].length;
            sum = sum + arr[i][num-1-i];
            
        }
        return sum;
    }
    public static void main(String[] args)
    {
    int [][] arush = new int [4][4];
    for(int j = 0; j<arush.length; j++){
        for(int k=0; k<arush[j].length; k++){
            arush[j][k] = reader.nextInt();
        }
    }
    System.out.println(alachson(arush));
    }
}

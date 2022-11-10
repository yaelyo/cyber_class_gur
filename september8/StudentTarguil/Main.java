package StudentTarguil;
import java.util.*;
public class Main
{
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[]args){
        Student[] arr = new Student[4];
        for(int i=0; i<arr.length; i++){
            String name = reader.next();
            String id = reader.next();
            int lng = reader.nextInt();
            arr[i] = new Student(name, id, lng);
 
        }
    }
}

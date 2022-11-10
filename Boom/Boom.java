import java.util.*;
class Boom{
    public static Scanner reader = new Scanner(System.in);
    static void boom(int num){
        int part;
        for(int i=1; i<=10; i++){
            for(int k=1; k<=10; k++){
                part = k*i;
                if((part%num==0) || (part%10==num) || ((part/10)%10==num)){
                    System.out.print(" x ");
                } else {
                    System.out.print(" " + part + " ");
                    
                }
            }
            System.out.println("");
        }
    }
    public static void main(String[] args){
        System.out.println("Enter number");
        int number = reader.nextInt();
        boom(number);
    }
}
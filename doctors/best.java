import java.util.*;

public class best
{
    public static Scanner reader = new Scanner(System.in);
    public class Doctor{
        private String name;
        private String spec;
        private double rate;
        public Doctor(String name, String spec, double rate){
            this.name = name;
            this.spec = spec;
            this.rate = rate;
        }
        public double getRate(){
            return this.rate;
        }
        public String getSpec(){
            return this.spec;
        }
    }
    public static double best(Doctor[] arr, String spec){
        double high = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i].getRate()>high && spec.equals(arr[i].getSpec())){
                high = arr[i].getRate();
            }
        }
        return high;
    }
    public static void main(String[]args){
        Doctor[] arr = new Doctor[5];
        for(int j=0; j<arr.length; j++){
            
            arr[j].Doctor("asd", "asd", 0.0);
        }
    }
}

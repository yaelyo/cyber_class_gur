import java.util.*;
public class quest1
{
    public class Driver{
        private String name;
        private int age;
        private int year;
        private int speed;
        
        public boolean update(){
            if(this.age<24 && this.year<2){
                this.speed = this.speed - 10;
                return true;
            }
            return false;
        }
        //set
        public void setName(String name){
            this.name = name;
        }
        public void setAge(int age){
            this.age = age;
        }
        public void setYear(int year){
            this.year = year;
        }
        public void setSpeed(int speed){
            this.speed = speed;
        }
        //get
        public String getName(){
            return this.name;
        }
        public int getYear(){
            return this.year;
        }
         public int getAge(){
            return this.age;
        }
         public int getSpeed(){
            return this.speed;
        }
    }
    public static void action(Driver[] arr){
            int und24;
            double avrgAge;
            String oldNames;
            for(int i=0; i<arr.length; i++){
                if(arr[i].getAge()<24){
                    und24++;
                }
            }
            
        }
    public static void main (String[]args){
        
        
    }
}

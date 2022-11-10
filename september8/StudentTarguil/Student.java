package StudentTarguil;
import java.util.*;
public class Student
{
    private String name;
    private String id;
    private int[] grd;
    
    public Student(String name, String id, int num){
       this.grd = new int[num];
       for(int i = 0; i<num; i++){
           this.grd[i] = -1;
       }
       this.name = name;
       this.id = id;
    }
    //set
    public void addNewGrade(int grd, int ind){
        this.grd[ind] = grd;
    }
    //gets
    public String getName(){
        return this.name;
    }
    public String getId(){
        return this.id;
    }
    public int[] getGrd(){
        int [] arr = new int[this.grd.length];
        for(int i=0; i<arr.length; i++){
            arr[i] = grd[i];
        }
        return arr;
    }
    public double avrg(){
        int counter = 0;
        int sum = 0;
        int avrg = 0;
        for(int i=0; i<this.grd.length; i++){
            if(this.grd[i]!=-1){
                counter++;
                sum = sum+this.grd[i];
            }
        }
        return avrg;
    }
    public int low(){
        int low=100;
        for(int i =0; i<this.grd.length; i++){
            if(this.grd[i]!=-1 && this.grd[i]<low){
                low = this.grd[i];
            }
        }
        return low;
    }
}

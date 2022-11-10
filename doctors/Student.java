
public class Student
{
    private String id;
    private String name; 
    private int[] grd;
    

    public Student(String id,String name,int n)
    
    {
     
       this.name = name;
       this.id = id;
       this.grd = new int[n];
       
       for(int i=0; i<grd.length; i++)
       grd[i] = -1;
       
    }

}
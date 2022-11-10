package StudentTarguil;

public class Avrg
{
    public void avrg(Student[] arr){
        for(int i=0; i<arr.length; i++){
            int counter = 0;
            int sum = 0;
            int avrg = 0;
            int j=-1;
            while(j<arr[i].getGrd().length && j==-1)
                j++;
        if(j!=arr[i].getGrd().length){
            System.out.println(arr[i].getName());
            for(int k=0; k<arr[i].getGrd().length; k++){
                if(arr[i].getGrd()[k]!=-1){
                    counter++;
                    sum = sum + arr[i].getGrd()[k];
                }
            }
            avrg = sum/counter;
            System.out.println(avrg);
        }
            }
    }
}

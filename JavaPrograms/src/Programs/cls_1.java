package Programs;
//1.	Create an array with the values (1, 2, 3, 4, 5) and shuffle it.
import java.util.Random;
public class cls_1 {
    public static void Shuffle(int[] array){
        int ele=array.length;
        for(int i=0;i<ele;i++){
            int s = i+ (int)(Math.random()*(ele-i));
            int temp=array[s];
            array[s]=array[i];
            array[i]=temp;  
        }
    }   

	public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        cls_1.Shuffle(a);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }

	}

}

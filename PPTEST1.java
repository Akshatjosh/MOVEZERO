
import java.util.*;

public class PPTEST1 {
    public static void moveZero(int[] arr)
    {
        int count =0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                int temp = arr[count];
                arr[count] = arr[i];
                arr[i] = temp;
                count++;
            }

        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int length= sc.nextInt();
        int [] arr=new int[length];
        for(int i=0;i<length;i++)
        {
            arr[i]= sc.nextInt();
        }
        System.out.println("Before moving zeros : ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("AFTER MOVING ZEROS : ");
        moveZero(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}

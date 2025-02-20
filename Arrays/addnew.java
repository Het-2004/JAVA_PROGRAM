import java.util.*;

public class addnew {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter number of element : ");
       int n = sc.nextInt();
       System.out.print("Input array elements : ");
       int arr[] = new int[n];

       for(int i=0; i<n; i++) {
           arr[i] = sc.nextInt();
       }
       System.out.print("Input element to insert : ");
       int value = sc.nextInt();
       System.out.print("Input position to insert : ");
       int position = sc.nextInt();
       int answer[] = new int[n+1];
       int i = 0;
       int j = 0;
       System.out.println();
       while (i<n+1) {
           if (i == position) {
               answer[i] = value;
           }
           else {
               answer[i] = arr[j];
               j++;
           }
           i++;
        }

        System.out.print("Array after insertion : ");
        i = 0;
        while (i<n+1) {
            System.out.print(answer[i] + " ");
            i++;
        }
        System.out.println();
    }
}

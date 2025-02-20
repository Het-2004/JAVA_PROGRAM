import java.util.Scanner;

public class reverseindex{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array : ");
        int n = sc.nextInt();
        System.out.print("Enter the reverse no: ");
        int k = sc.nextInt();
        

        System.out.print("Enter the array element : ");
        int arr[] = new int[n];
        
        
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int reversed[] = new int[n];

        k = k%n;

        for(int i=0; i<n; i++){
            int newIndex = (i-k);
            if(newIndex<0){
                newIndex += n;
            }

            reversed[newIndex] = arr[i];
        }
        for(int i=0; i<n; i++){
            System.out.print(reversed[i] + " ");
        }
        System.out.println();
    }
}

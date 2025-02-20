import java.util.Scanner;

class Reverse {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int arr[] = new int[n];

        for(int i=0; i<n; i++)
        {
            arr[i] = in.nextInt();
        }

        int i = 0;  // start 
        int j = n - 1; // end 
        
        while(i < j)
        {
            // swap(arr[i], arr[j])
            // a, b 
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp; 

            i++;
            j--;
        }

        for(i=0; i<n; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
import java.util.Scanner;

class Smallest {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int arr[] = new int[n];

        for(int i=0; i<n; i++)
        {
            arr[i] = in.nextInt();
        }

        int minE = (int)(1e9);
        int sminE = (int)(1e9);

        for(int i=0; i<n; i++)
        {
            if(arr[i] < minE)
            {
                sminE = minE;
                minE = arr[i];
            }
            else if(arr[i] > minE && arr[i] < sminE)
            {
                sminE = arr[i];
            }
        }

        System.out.println(minE);
        System.out.println(sminE);
        
    }
}
import java.util.*;

public class duplicate {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int maximumNumber = 0;
        for(int i=0; i<n; i++) {
            maximumNumber = Math.max(maximumNumber, arr[i]);
        }
        int free[] = new int[maximumNumber + 1];
        for(int i=0; i<n; i++) {
            free[arr[i]]++;
        }

        int count = 0;
        for(int i=0; i<maximumNumber +1; i++) {
            if(free[i] >= 1) {
                count++;
                System.out.println(i + " " + free[i]);
            }
        }
        System.out.println(count);
        sc.close();
    }
}

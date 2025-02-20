import java.util.Scanner;

public class findIndex {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array : ");
        int n = sc.nextInt();
        System.out.print("Enter the element to find : ");
        int k = sc.nextInt();
        System.out.print("Enter the array element : ");
        int arr[] = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int answear = -1;
        for(int i=0; i<n; i++){
            if(arr[i] == k){
                answear = i;
                break;
            }
        }
        System.out.println(answear);
    }
}

import java.util.Arrays;
import java.util.Scanner;

public class sumOfTwoPointer {

    public static void main(String[] args) {
        int [] arr = {20,10,5,-1,30,90};
        Arrays.sort(arr);
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        int low = 0;
        int high = arr.length-1;
        int flag = 0;
        while (low<=high) {
            int sum = arr[low]+arr[high];
            
            if (sum==key) {
                System.out.println("Target is found");
                flag = flag+1;
                break;
            }
            else if (sum<key) {
                low++;
            }
            else{
                high--;
            }
        }
        if (flag==0) {
            System.out.println("Target is not found");
        }
    }
}
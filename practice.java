import java.util.Arrays;


public class practice {
    public static void main(String[] args) {
        int [] arr = {20,10,5,30,90};
        Arrays.sort(arr);
        
        int k= 3;
        int  n = arr.length;
        int max_sum = Integer.MIN_VALUE;
        for(int i=0;i<=n-k;i++){
            int current_sum =0;
            for(int j=0; j<k;j++){
                current_sum+=arr[i+j];
            }
            max_sum=Math.max(current_sum, max_sum);
        }
        System.out.println(max_sum);
    }
}

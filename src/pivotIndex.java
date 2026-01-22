public class pivotIndex {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        int flag=-1;
        int left_sum=0;
        int right_sum=0;
        for(int i=1;i<arr.length;i++){
            left_sum+=arr[i-1];
            right_sum=sum-left_sum-arr[i];
            if(left_sum==right_sum){
                System.out.println(arr[i]);
                flag=1;
                break;
            }


        }
        if(flag==-1){
            System.out.println(flag);
        }

    }
}

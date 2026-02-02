public class minimumTimeToEqualAllElements {
    public static void main(String[] args) {
        //in 1 second you can increase the value of 1 element by 1. find the minimum time in seconds
        //to make all element of the array equal.

        //observation
        //To minimise time ,make all elements equal to the maximum element of the array

        //Find the maximum element in the array
        //For every element calculate how much it need to be increase to reach to the maximum
        //Sum all those differences

        int []arr={3,4,5,0,2};
        int max=arr[0];
        int sum=0;
        for(int i=1;i<arr.length;i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for(int i=0;i<arr.length;i++) {
            sum+=max-arr[i];
        }
        System.out.println(sum);
    }
}

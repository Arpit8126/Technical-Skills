import java.util.Scanner;
public class pivotIndex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no of elements to store in array: ");
        int n=sc.nextInt();
        int[]arr=new int[n];
        int count=0;
        for(int i=1;i<=n;i++){
            System.out.print("Enter element "+i+": ");
            arr[i-1]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        int left_sum=0;
        int right_sum=0;
        for(int i=0;i<arr.length;i++){
            if(i==0){
                left_sum=0;
                continue;
            }
            left_sum+=arr[i-1];
            right_sum=sum-left_sum-arr[i];
            if(left_sum==right_sum){
                System.out.println("Left Sum is: "+left_sum);
                System.out.println("Right Sum is: "+right_sum);
                System.out.println("Element of pivot index and index of that element is: "+arr[i]+" " +i);
                count+=1;
            }
        }
        System.out.println("Total pivot index: "+count);
        if(count==0){
            System.out.println(-1);
        }



    }
}

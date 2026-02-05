import java.util.Scanner;
public class secondLargest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no of element in array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter element "+i+": ");
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        int second_max=-1;
        for(int element:arr){
            if(element>max){
                second_max=max;
                max=element;
            }

        }
        if(second_max==-1){
            System.out.println("No element found");
        }
        else{
            System.out.println("Second Largest element is: "+second_max);
        }



    }
}

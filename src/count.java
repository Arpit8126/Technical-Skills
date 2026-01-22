import java.util.Scanner;
public class count {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[]arr={-3,-2,1,1,5,5,5};
        int count=0;
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=max){
                count+=1;
            }
        }
        System.out.println(count);

    }

}

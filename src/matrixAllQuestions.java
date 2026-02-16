import java.util.Scanner;
public class matrixAllQuestions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no of rows: ");
        int row=sc.nextInt();
        System.out.print("Enter no of columns: ");
        int column=sc.nextInt();
        int[][] arr=new int[row][column];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print("Enter element for "+i+j+" index: ");
                arr[i][j]=sc.nextInt();

            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print(arr[i][j]+" ");


            }
            System.out.println();
        }
        System.out.println();
        int diagonal_sum=0;
        int upper_bound_sum=0;
        int lower_bound_sum=0;
        int row1_sum=0;
        int row2_sum=0;
        int row3_sum=0;
        int col1_sum=0;
        int col2_sum=0;
        int col3_sum=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                if(i==j){
                    diagonal_sum+=arr[i][j];
                }
                else if(i<j){
                    upper_bound_sum+=arr[i][j];
                }
                else{
                    lower_bound_sum+=arr[i][j];
                }



            }

        }
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                if(i==0){
                    row1_sum+=arr[i][j];
                }
                else if(i==1){
                    row2_sum+=arr[i][j];
                }
                else if(i==2){
                    row3_sum+=arr[i][j];
                }
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                if(j==0){
                    col1_sum+=arr[i][j];
                }
                else if(j==1){
                    col2_sum+=arr[i][j];
                }
                else if(j==2){
                    col3_sum+=arr[i][j];
                }
            }
        }
        System.out.println("sum of diagonals is: "+diagonal_sum);
        System.out.println("upper bound sum is: "+upper_bound_sum);
        System.out.println("lower bound sum is: "+lower_bound_sum);
        System.out.println("first row sum is: "+row1_sum);
        System.out.println("second row sum is: "+row2_sum);
        System.out.println("third row sum is: "+row3_sum);
        System.out.println("first column sum is: "+col1_sum);
        System.out.println("second column sum is: "+col2_sum);
        System.out.println("third column sum is: "+col3_sum);

    }
}

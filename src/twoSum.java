public class twoSum {
    public static void main(String[] args) {
        int []arr={3,1,2,8,0};
        int k=3;
        boolean exist=false;
        for(int i=0;i<arr.length-2;i++){
            for(int j=i+1;j<arr.length-1;j++){
                if(arr[i]+arr[j]==k ){
                    exist=true;
                }
            }
        }
        System.out.println(exist);
    }
}

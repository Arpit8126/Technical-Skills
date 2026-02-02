public class Product_array {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int product=1;
        int [] product_array=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            product*=arr[i]
        }
        for(int i=0;i<arr.length;i++){
            product_array[i]=product/arr[i];
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(product_array[i]);
        }
    }
}

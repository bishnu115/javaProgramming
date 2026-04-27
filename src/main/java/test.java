
public class test {

    public static void main(String[] args) {

       int[] arr={1,3,45,73,222,2};
       int largestNO=arr[0];

       for (int i=0;i< arr.length;i++){
           if(arr[i]>largestNO){
               largestNO=arr[i];
           }
       }
        System.out.println(largestNO);
        System.out.println(largestNO);


    }

}
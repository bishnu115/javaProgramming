package Array;

public class ThirdLargestSimple {
    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 8, 15, 2};
        int max= Integer.MIN_VALUE;
        int smax= Integer.MIN_VALUE;
        int tmax= Integer.MIN_VALUE;

        for(int num:arr){
            if(num>max){
                smax=max;
                max=num;
            }else if(num>smax){
                tmax=smax;
                smax=num;
            }
            else if(num>tmax){
                tmax=num;
            }
        }

        System.out.println(tmax);
    }
}
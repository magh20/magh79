public class dovom {
    public static void main(String[] args) {
        int max=(-10) ;
        int arr[]={0,2,4,6,8,7,9,3,5,1};
        for (int a : arr) {
            if (a > max)
                max = a;
        }
        System.out.println("Maximum: " + max);
    }
}

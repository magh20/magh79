public class home {
    public class main{
    public static void main(String[] args) {
        int b=8 , arr[]={0,1,2,3,4,5,6,7,8,9};
        boolean a = false;
        for (int num : arr) {
            if (num==b) {
                a = true;
                break;
            }
        }
        System.out.println("Result: " + a);
    }
    }
}

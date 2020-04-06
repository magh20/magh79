public class Piade_sazi implements MyInteger {
    int x;
    boolean a=false;
    @Override
    public void isEven() {
        if (x % 2 == 0) {
            a = true;
            System.out.println("isEven: " + a);
            a = false;
        }
        else
            System.out.println("isEven: " + a);
    }
    @Override
    public void isOdd() {
        if (x%2!=0) {
            a = true;
            System.out.println("isOdd: " + a);
            a = false;
        }
        else
            System.out.println("isOdd: " + a);
    }

    @Override
    public void isPositive() {
        if (x>=0) {
            a = true;
            System.out.println("isPositive: " + a);
            a = false;
        }
        else
            System.out.println("isPositive: " + a);
    }

    @Override
    public void isNegative() {
        if (x<0) {
            a = true;
            System.out.println("isNegative: " + a);
            a = false;
        }
        else
            System.out.println("isNegative: " + a);
    }

    @Override
    public void isZero() {
        if (x==0) {
            a = true;
            System.out.println("isZero: " + a);
            a = false;
        }
        else
            System.out.println("isZero: " + a);
    }
}

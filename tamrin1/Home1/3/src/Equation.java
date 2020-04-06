public class Equation {
    public float x , y , a , b , c , d , e , f;
    public String check;
    public void mohasebe_x() {
        x = ((e*d)-(b*f))/((a*d)-(b*c));
        check = String.valueOf(x);
        if (check=="NaN") {
            System.out.println("Not Calculable!");
            System.exit(0);
        }
        else
            System.out.println("X: " + x);
    }
    public void mohasebe_y() {
        y = ((a*f)-(e*c))/((a*d)-(b*c));
        check = String.valueOf(y);
        if (check=="NaN") {
            System.out.println("Not Calculable!");
            System.exit(0);
        }
        else
            System.out.println("Y: " + y);
    }
}
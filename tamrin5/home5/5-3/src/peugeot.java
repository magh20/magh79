public class peugeot implements Car {
    @Override
    public void carmodel() {
        System.out.println("car model :\n1-206\n2-207\n3-405");
    }

    @Override
    public void country() {
        System.out.println("peugeot is french car company.");
    }
}

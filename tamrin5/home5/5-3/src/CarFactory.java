public class CarFactory {
    public static Car getCar(int c)
    {
        switch (c)
        {
            case 1:
                return new BMW ();
            case 2:
                return new Benz ();
            case 3:
                return new peugeot();
            case 4:
                return new Bogati();
            case 5:
                return new Saipa ();
            default:
                return null;
        }
    }
}

public class CalcFactory {
    public static Calculate getCalc(int c){
        switch (c)
        {
            case 1:
                return new CalcPlus ();
            case 2:
                return new CalcMinus ();
            default:
                return null;
        }
    }
}

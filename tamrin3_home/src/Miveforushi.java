import java.net.PortUnreachableException;
import java.security.PublicKey;

public class Miveforushi extends Mohasebe{
    public String name;
    public int price;
    public int weight;
    public int gheimat;


    @Override
    public int factor(int weight, int price) {
            int gheimat = weight * price;
            return gheimat;
    }
}


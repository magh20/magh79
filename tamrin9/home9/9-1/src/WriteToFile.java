import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class WriteToFile {

    public void write() {
        Enti enti=new Enti();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("E:\\Advanced Programming-982 USC\\my project\\tamrin9\\home9\\9-1\\1.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(enti.getName());
            objectOutputStream.writeObject(enti.getFamily());
            objectOutputStream.writeObject(enti.getMelicode());
            objectOutputStream.close();
            fileOutputStream.close();
        }
        catch (Exception e){
            e.getMessage();
        }
    }
}

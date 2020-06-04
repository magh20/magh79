import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCreate {
    File file2 = new File("E:\\Advanced Programming-982 USC\\my project\\tamrin9\\class9\\2.txt");
    File file1 = new File("E:\\Advanced Programming-982 USC\\my project\\tamrin9\\class9\\1.txt");
    public void write() {
        try {
            FileWriter fileWriter = new FileWriter(file2);
            fileWriter.write(content);
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("writing is complited.");
    }
    String content="";
    public void read(){
        try {
            FileReader fileReader = new FileReader(file1);
            int ascii = fileReader.read();

            while (ascii!=-1)// not EoF: End of File
            {
                content+=(char) ascii;
                ascii = fileReader.read();
            }
            fileReader.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

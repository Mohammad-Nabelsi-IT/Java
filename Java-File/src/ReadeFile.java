import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadeFile {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\m7nab\\OneDrive\\Desktop\\Test-New-Project\\newfile.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

       String l;
        while ((l = bufferedReader.readLine()) != null) {
            System.out.println(l);
        }
        bufferedReader.close();
        fileReader.close();



    }
}

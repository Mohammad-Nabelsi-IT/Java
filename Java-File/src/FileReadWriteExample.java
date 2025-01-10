import java.io.*;

public class FileReadWriteExample {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\m7nab\\OneDrive\\Desktop\\Test-New-Project\\example.txt");
        FileWriter fileWriter = new FileWriter(file, true);
        PrintWriter printWriter = new PrintWriter(fileWriter);

        printWriter.println("Appending new Content");
        printWriter.println("This is another line");


        printWriter.close();
        fileWriter.close();

        FileReader fileReader=new FileReader(file);
        BufferedReader bufferedReader=new BufferedReader(fileReader);

        String l;
        while ((l = bufferedReader.readLine()) != null) {
            System.out.println(l);
        }
        bufferedReader.close();
        fileReader.close();



    }
}

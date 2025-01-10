import java.io.*;

public class WriteFile {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\m7nab\\OneDrive\\Desktop\\Test-New-Project\\myinfo.txt");
//        if (!file.exists())
//            file.createNewFile();
        FileWriter fileWriter = new FileWriter(file,true);
        PrintWriter printWriter = new PrintWriter(fileWriter);

        printWriter.println("Hello");
        printWriter.println("Mohammad");
        printWriter.println("BMW");
        printWriter.println("Ahmad");
        printWriter.println("Hi");

        printWriter.close();
        fileWriter.close();


    }
}

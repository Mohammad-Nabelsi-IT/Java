import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileOperations {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\m7nab\\" +
                "OneDrive\\Desktop\\Test-New-Project\\newdirectory");

//        System.out.println(file.createNewFile());
//        if (file.exists()) {
//            System.out.println("file was created successfully");
//        }
//
//        System.out.println(file.mkdirs());
//        if (file.exists()) {
//            System.out.println("directory was created successfully");
//        }
//        System.out.println(Arrays.toString(file.list()));
//
//        for (File f : file.listFiles()) {
//            System.out.println(f.getName() + "  : " + (f.length() / 1024) + " KB");
//
//
//        }
//        if (file.exists()) file.mkdirs();
//        System.out.println("indicating their existence");

        System.out.println(file.delete());
        if (!file.exists()) {
            System.out.println("file was deleted successfully");
        }

        System.out.println(file.delete());
        if (!file.exists()) {
            System.out.println("directory was deleted successfully");
        }

    }

}

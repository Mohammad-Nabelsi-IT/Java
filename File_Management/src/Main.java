public class Main {
    public static void main(String[] args) {
        TextFile t =new TextFile("PDF",125);
        ImageFile i =new ImageFile("img",200);
        AudioFile a =new AudioFile("mp3",3000);
        TextFile t1 =new TextFile("doc",175);
        FileOperation fo []={t,i,a,t1};
        FileManager f =new FileManager(fo);
        f.openAll();
        System.out.println("=================");
        f.closeAll();
        System.out.println("=================");
        f.readAll();
        System.out.println("=================");
        f.writeAll();
    }
}

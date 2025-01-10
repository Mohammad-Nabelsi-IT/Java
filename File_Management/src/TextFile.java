public class TextFile extends MyFile implements FileOperation {


    public TextFile(String fileName, int size) {
        super(fileName, size);
    }

    @Override
    public void open() {
        System.out.println("open text file");
    }

    @Override
    public void close() {
        System.out.println("close text file");
    }

    @Override
    public void read() {
        System.out.println("read text file");
    }

    @Override
    public void write() {
        System.out.println("write text file");

    }
}

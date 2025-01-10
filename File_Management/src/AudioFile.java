public class AudioFile extends MyFile implements FileOperation {


    public AudioFile(String fileName, int size) {
        super(fileName, size);
    }

    public void open() {
        System.out.println("open audio file");
    }

    public void close() {
        System.out.println("close audio file");
    }

    public void read() {
        System.out.println("read audio file");
    }

    public void write() {
        System.out.println("write audio file");
    }


}

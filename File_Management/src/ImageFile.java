public class ImageFile extends MyFile implements FileOperation {


    public ImageFile(String fileName, int size) {
        super(fileName, size);
    }

    @Override
    public void open() {
        System.out.println("open image file");
    }

    @Override
    public void close() {
        System.out.println("close image file");
    }

    @Override
    public void read() {
        System.out.println("read image file");
    }

    @Override
    public void write() {
        System.out.println("write image file");
    }


    }


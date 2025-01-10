public class FileManager {
    private FileOperation[] file;

    public FileManager(FileOperation[] file) {
        this.file = file;
    }

    public FileOperation[] getFile() {
        return file;
    }

    public void setFile(FileOperation[] file) {
        this.file = file;
    }

    public void openAll() {
        for (FileOperation f : file) {
            f.open();
        }
    }

    public void closeAll() {
        for (FileOperation f : file) {
            f.close();
        }
    }

    public void readAll() {
        for (FileOperation f : file) {
            f.read();
        }
    }

    public void writeAll() {
        for (FileOperation f : file) {
            f.write();
        }
    }

}

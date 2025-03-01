public class  client{
    public static void main(String[] args) {
        Filecompressor file = new Filecompressor(new Rarcompressor());
        file.compressFile();
        Filecompressor file1 = new Filecompressor(new Sevenzcompressor());
        file1.compressFile();
        Filecompressor file2 = new Filecompressor(new Zipcompressor());
        file2.compressFile();

    }
}

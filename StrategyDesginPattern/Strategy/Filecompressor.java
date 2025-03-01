public class Filecompressor {
    public  Compressor compressor;
    public Filecompressor(Compressor compressor){
        this.compressor=compressor;
    }
    // public void setCompressor(Compressor compressor) {
    //     this.compressor = compressor;
    // }
    public void compressFile(){
        compressor.compress();
    }


   
  
    
    
}

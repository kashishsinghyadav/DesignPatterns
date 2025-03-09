public class Facademain{
    public static void main(String[] args) {
        Dvd dvd = new Dvd();
        Light light = new Light();
        Projector projector = new Projector();
        Facadeclass fc = new Facadeclass(dvd,light,projector);
        fc.setUphomeThreater();
        fc.closeUphomeThreater();



    }

}

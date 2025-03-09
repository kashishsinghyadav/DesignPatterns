public class Facadeclass {
    private Dvd dvd;
    private Light light;
    private Projector projector;

    public Facadeclass(Dvd dvd, Light light, Projector projector) {
        this.dvd = dvd;
        this.light = light;
        this.projector = projector;
    }

    public void setUphomeThreater(){
        dvd.onDvd();
        light.dimLight();
        projector.onProjector();
    }

    public void closeUphomeThreater(){
        dvd.offDvd();
        light.brightenLight();
        projector.offProjector();
    }


    
}

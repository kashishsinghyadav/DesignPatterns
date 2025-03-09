public class JsonConvertor implements Json {
    private XmlConvertor xmlConvertor;

    public JsonConvertor(XmlConvertor xmlConvertor) {
        this.xmlConvertor = xmlConvertor;
    }
    @Override
    public void convertToJson(){
      
        System.out.println("convert to json");
        xmlConvertor.convertToXml();
        

    }
}

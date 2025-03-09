public class Adaptermain {
    public static void main(String[] args) {
        XmlConvertor xmldata = new XmlConvertor();
        JsonConvertor jsonconvert = new JsonConvertor(xmldata);
        jsonconvert.convertToJson();
    }
}

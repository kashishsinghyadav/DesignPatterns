public class URLBuilder {
     String Protocol;
     String HostName;
     String Port;
     String Pathparam;
    String QueryParam; 
   
    public URLBuilder SetProtocol(String Protocol){
        this.Protocol=Protocol;
        return this;
    }
    public URLBuilder SetHostName(String HostName){
        this.HostName=HostName;
        return this;
    }
    public URLBuilder SetPort(String Port){
        this.Port=Port;
        return this;
    }
    public URLBuilder SetPathparam(String Pathparam){
        this.Pathparam=Pathparam;
        return this;
    }
    public URLBuilder SetQueryParam(String QueryParam){
        this.QueryParam=QueryParam;
        return this;
    }
    public BuildURL buildurl(){
        return new BuildURL(this);
    }

}

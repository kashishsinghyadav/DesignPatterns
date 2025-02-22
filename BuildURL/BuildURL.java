public class BuildURL {
    private String Protocol;
    private String HostName;
    private String Port;
    private String Pathparam;
    private String QueryParam;

    public BuildURL(URLBuilder urlbuilder){
        this.Protocol = urlbuilder.Protocol;
        this.HostName=urlbuilder.HostName;
        this.Port=urlbuilder.Port;
        this.Pathparam=urlbuilder.Pathparam;
        this.QueryParam=urlbuilder.QueryParam;


    }
    public String getProtocol(){
        return Protocol;

    }
    public String getHostName(){
        return HostName;

    }
    public String getPort(){
        return Port;

    }
    public String getPathparam(){
        return Pathparam;

    }
    public String getQueryParam(){
        return QueryParam;

    }


}

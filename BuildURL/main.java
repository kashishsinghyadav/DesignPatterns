public class main{
    public static void main(String [] args){
        BuildURL url = new URLBuilder()
                .SetProtocol("https:")
                .SetHostName("kashish")
                .SetPort("8000")
                .SetPathparam("skills")
                .SetQueryParam("?skill=Python")
                .buildurl(); 

        System.out.print(url.getProtocol());
        System.out.print(url.getHostName());
        System.out.print(url.getPort());
        System.out.print(url.getPathparam());
        System.out.print(url.getQueryParam());

        BuildURL url1 = new URLBuilder()
        .SetProtocol("https:")
        .SetHostName("pikuu")
        .SetPort("8000")
        .SetPathparam("skills")
        .SetQueryParam("?skill=java")
        .buildurl(); 
        System.out.println();
        System.out.print(url1.getProtocol());
        System.out.print(url1.getHostName());
        System.out.print(url1.getPort());
      
        System.out.print(url1.getQueryParam());
    

    }
}

package diane.sand.box.hello.ws;

import diane.sand.box.hello.HelloService;
import diane.sand.box.hello.exceptions.HelloException;
import diane.sand.box.hello.ws.HelloPortType;
import java.util.logging.Logger;
import java.util.logging.Level;
import org.osgi.framework.BundleContext;


public class EnglishHelloWebService implements HelloPortType
{
    private static final Logger LOGGER = Logger.getLogger(EnglishHelloWebService.class.getName());
    private HelloService service;
    private BundleContext bc;


    public void setService(HelloService service)
    {
        this.service = service;
    }

    public HelloService getService()
    {
        return service;
    }
    
    public BundleContext getBc() {
        return bc;
    }

    public void setBc(BundleContext bc) {
        this.bc = bc;
    }

    

    @Override
    public String sayHello(String name)
    {
        if(name.equalsIgnoreCase("bad"))
        {
            throw new RuntimeException("Bad.");
        }
        
        LOGGER.info("Web Service Called with "+name);
        LOGGER.info("Web Service forwarding to local service");
        String returning = "noValue";
        try{
            returning = this.service.testMethod(name);
        }catch(HelloException ex)
        {
            LOGGER.log(Level.WARNING, "Exception while calling service", ex);
        }
        LOGGER.info("Web Service returning with "+returning);
        return name; 
    }
}

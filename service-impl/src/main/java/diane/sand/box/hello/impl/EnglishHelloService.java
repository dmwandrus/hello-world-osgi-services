package diane.sand.box.hello.impl;


import diane.sand.box.hello.HelloService;
import diane.sand.box.hello.exceptions.HelloException;
import java.util.logging.Logger;
import org.osgi.framework.BundleContext;

/**
 * TODO: Add overview of service implementation
 * 
 */
public class EnglishHelloService implements HelloService
{

    private static final Logger LOGGER = Logger.getLogger(EnglishHelloService.class.getName());
    private BundleContext bundleContext;
    

    @Override
    public String testMethod(String test) throws HelloException
    {
        // TODO implement methods here
        LOGGER.info("Hello from Hello Service to "+test);
        return test;
    }
    
    public BundleContext getBundleContext()
    {
        return bundleContext;
    }

    public void setBundleContext(BundleContext bundleContext)
    {
        this.bundleContext = bundleContext;
    }
}

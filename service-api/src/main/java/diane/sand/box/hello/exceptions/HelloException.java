
package diane.sand.box.hello.exceptions;

/**
 * This exception is is used by the CentralRepoMgmt Service to 
 * identify the errors when they are thrown from this service.  
 */
public class HelloException extends Exception
{

    public HelloException(String message, Throwable cause)
    {
        super(message, cause);
    }

    public HelloException(String message)
    {
        super(message);
    }

}

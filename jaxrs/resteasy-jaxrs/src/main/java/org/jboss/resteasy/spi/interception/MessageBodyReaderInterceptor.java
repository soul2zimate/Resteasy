package org.jboss.resteasy.spi.interception;

import javax.ws.rs.WebApplicationException;
import java.io.IOException;

/**
 * Wraps around invocations of MessageBodyReader.readFrom().
 *
 * @author <a href="mailto:bill@burkecentral.com">Bill Burke</a>
 * @version $Revision: 1 $
 * 
 * @deprecated The Resteasy interceptor facility introduced in release 2.x
 * is replaced by the JAX-RS 2.0 compliant interceptor facility in release 3.0.x.
 * 
 * @see jaxrs-api
 * @see javax.ws.rs.ext.ReaderInterceptor
 */
@Deprecated
public interface MessageBodyReaderInterceptor
{
   /**
    * @param context
    * @return the object read
    * @throws IOException
    * @throws WebApplicationException
    */
   Object read(MessageBodyReaderContext context) throws IOException, WebApplicationException;

}
package com.zkbizz.ddm.writer;

import com.zkbizz.model.jaxb.ObjectFactory;
import com.zkbizz.model.jaxb.PurchaseOrderType;

import javax.inject.Singleton;
import javax.ws.rs.ProcessingException;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyWriter;
import javax.ws.rs.ext.Provider;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

@Singleton
@Produces("application/xml")
@Provider
public class MyBeanMessageBodyWriter implements MessageBodyWriter<PurchaseOrderType> {


    @Override
    public boolean isWriteable(Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType) {
        return true;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public long getSize(PurchaseOrderType purchaseOrderType, Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType) {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void writeTo(PurchaseOrderType purchaseOrderType, Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType, MultivaluedMap<String, Object> httpHeaders, OutputStream entityStream) throws IOException, WebApplicationException {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(PurchaseOrderType.class);

            // serialize the entity myBean to the entity output stream
            jaxbContext.createMarshaller().marshal(new ObjectFactory().createPurchaseOrder(purchaseOrderType), entityStream);
        } catch (JAXBException jaxbException) {
            throw new ProcessingException(
                    "Error serializing a MyBean to the output stream", jaxbException);
        }
    }


}
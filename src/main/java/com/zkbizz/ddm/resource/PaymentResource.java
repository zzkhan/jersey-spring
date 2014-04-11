package com.zkbizz.ddm.resource;

import com.zkbizz.ddm.annotations.Compress;
import com.zkbizz.ddm.annotations.Speedy;
import com.zkbizz.ddm.data.SampleEntity;
import com.zkbizz.ddm.service.TransactionBo;
import com.zkbizz.ddm.service.XmlInjestor;
import com.zkbizz.model.jaxb.PurchaseOrderType;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Date;

@Named
@Singleton
@Path("/payment")
public class PaymentResource {

    @Inject
    @Speedy
    TransactionBo transactionBo;

//    public PaymentResource( TransactionBo transactionBo) {
//        System.out.println("PaymentResource created.........");
//        this.transactionBo = transactionBo;
//    }

    @GET
    @Path("/save")
    @Produces({"application/json","application/xml"})
    public PurchaseOrderType savePayment() {
        transactionBo.save();
        String result = "response from GET";
        SampleEntity entity = new SampleEntity(1L,"Zahid","Uncompressed Khan");
        PurchaseOrderType injest = new XmlInjestor().injest();
//        return Response.status(200).entity(injest).build();
        return injest;
    }

    @GET
    @Path("/save/compressed")
    @Produces(MediaType.APPLICATION_JSON)
    @Compress
    public Response savePaymentCompressed() {
        String result = "response from compressed GET";
        SampleEntity entity = new SampleEntity(1L,"Zahid","Compressed Khan");
        return Response.status(200).entity(entity).build();
    }

    @PUT
    @Path("/save")
    @Produces(MediaType.APPLICATION_JSON)
    public Response putSavePayment() {
        String result = "this has been a response from PUT";
        SampleEntity entity = new SampleEntity(1L,"Zahid","Khan");
        return Response.status(200).entity(entity).build();
    }

    @PostConstruct
    public void postConstruct(){
         System.out.print("I was born on " + new Date());
    }

}

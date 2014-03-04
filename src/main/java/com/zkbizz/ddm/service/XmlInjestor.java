package com.zkbizz.ddm.service;


import com.zkbizz.model.jaxb.PurchaseOrderType;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

public class XmlInjestor {

    public PurchaseOrderType injest(){
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance("com.zkbizz.model.jaxb");
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            JAXBElement<PurchaseOrderType> purchaseOrderType = (JAXBElement<PurchaseOrderType>) unmarshaller.unmarshal(new InputStreamReader(new FileInputStream("/Users/zzkhan/work/projects/RESTfulExample/src/main/resources/po.xml")));
            PurchaseOrderType value = purchaseOrderType.getValue();
             System.out.println(value.toString());
            return value;
        } catch (JAXBException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (FileNotFoundException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return null;
    }

    public static void main(String args[]){
        XmlInjestor xmlInjestor = new XmlInjestor();
        xmlInjestor.injest();
    }


}

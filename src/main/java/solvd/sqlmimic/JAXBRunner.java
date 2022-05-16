package solvd.sqlmimic;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import solvd.sqlmimic.entities.Concert;

import java.io.FileOutputStream;
import java.io.IOException;

public class JAXBRunner {
    public static void main(String args[]) throws JAXBException {
       try {
           Concert concert = new Concert(1, "20:30", "2hs", "27/05/2022", 2, 1);
           JAXBContext context =  JAXBContext.newInstance(Concert.class);
           Marshaller marshaller = context.createMarshaller();
           marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

           marshaller.marshal(concert, new FileOutputStream("src/main/resources/marshalled.xml"));
           System.out.println("task done 8)");

       } catch (JAXBException | IOException e){
           e.printStackTrace();
       }
    }
}

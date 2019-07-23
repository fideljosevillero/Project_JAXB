package com.fideljose.project_JAXB;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//    	toMarshallFile();
        toUnmarshallFile();
    }
    
    private static void toMarshallFile() {
      System.out.println( "Hello World!" );
      Person p = new Person();
      p.setNombre("nombre editado");
      p.setDireccion("Direccion editada");
      p.setEdad(17);
      p.setGenero(Person.Genero.masculino);
      
//      OutputStream os = new ByteArrayOutputStream();
      
      try {
      	FileOutputStream fos = new FileOutputStream(new File("src/main/ejemplo.xml"));
      	JAXBContext jc = JAXBContext.newInstance(Person.class);
      	Marshaller marshal = jc.createMarshaller(); 
      	marshal.marshal(p, fos);
      }catch(Exception er) {
      	System.out.println("error: " + er);
      }
    }
    
    private static void toUnmarshallFile() {
    	InputStream fis; 
    	try {
         	fis = new FileInputStream("src/main/ejemplo.xml");
         	JAXBContext jc = JAXBContext.newInstance(Person.class);
         	Unmarshaller u = jc.createUnmarshaller();
         	final Person p = (Person)u.unmarshal(fis);
         	System.out.println("El nombre es: " + p);
         	fis.close();
         }catch(Exception er) {
         	System.out.println("error: " + er);
         }finally {
        	 
         }
    }
}

package Model;
import java.io.*;
import java.net.*;

public class PatientUser {

    public PatientUser() {
        try{
            Socket s = new Socket("23.123.213.59", 7123);
            InputStream is = s.getInputStream();
            FileOutputStream fr = new FileOutputStream("testingxml.xml");
            byte[]b = is.readAllBytes();
            is.read(b, 0, b.length);
            fr.write(b, 0, b.length);
            // parse
            // diagnose
            // write back to xml file
            // send back to server

         
            fr.flush();
            fr.close();
            is.close();
            s.close();
        }catch(Exception e){System.out.println(e);}
    }
}


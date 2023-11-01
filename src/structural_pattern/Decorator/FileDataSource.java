package structural_pattern.Decorator;

import javax.xml.namespace.QName;
import java.io.*;

public class FileDataSource implements DataSource{

    String name;

    FileDataSource(String name){this.name=name;}
    @Override
    public String readData() {
        char[] buffer = null;
        File file = new File(name);
        try (FileReader reader = new FileReader(file)) {
            buffer = new char[(int) file.length()];
            reader.read(buffer);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return new String(buffer);
    }

    @Override
    public void writeData(String data) {
        File file=new File(name );
        try (OutputStream fos=new FileOutputStream(file)){
            fos.write(data.getBytes(),0,data.length());
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }

    }
}

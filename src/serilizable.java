import com.company.Employee;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class serilizable {


    public static void main(String[] args) {
        Employee  e=new Employee();
        e.setName("ashish");
        e.setId(54);
        e.setPassword("as");

        try{
            FileOutputStream   o=new FileOutputStream("file.txt");
            ObjectOutputStream  obj=new ObjectOutputStream(o);

            obj.writeObject(e);
            obj.close();
            o.close();;
            System.out.println("serialize data is saved");

        }
        catch (IOException ek)
        {
            ek.printStackTrace();
        }
    }

}

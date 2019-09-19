import com.company.Employee;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class deseriale {

    public static void main(String[] args) {

        Employee e=new Employee();
      try{
          FileInputStream   p=new FileInputStream("file.txt");
          ObjectInputStream  obj=new ObjectInputStream(p);
          e=(Employee)obj.readObject();
          obj.close();
          p.close();
      }
catch (IOException l)
{
    l.printStackTrace();
}
      catch(ClassNotFoundException y)
      {
          y.printStackTrace();
      }

        System.out.println("deserial");
        System.out.println(e.getName());
        System.out.println(e.getId());
    }

}

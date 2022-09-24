import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class pp {
    public static void main(String[] args){
        try(FileInputStream fin=new FileInputStream("D://pp//input.txt");
            FileOutputStream fos=new FileOutputStream("D://pp//output.txt"))
        {
            byte[] buffer = new byte[fin.available()];
            // считываем буфер
            fin.read(buffer, 0, buffer.length);
            // записываем из буфера в файл
            fos.write(buffer, 0, buffer.length);
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}

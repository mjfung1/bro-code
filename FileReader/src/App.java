import java.io.FileNotFoundException;
import java.io.FileReader;

public class App {
    public static void main(String[] args) throws Exception {
        
        // FileReader = read the contents of a file as a stream of characters. One by one
        //              read() returns an int value which contains the byte value
        //              when read() returns -1, there is no more data to be read.

        try {
            FileReader reader = new FileReader("FileReader/ascii.txt");

            int data = reader.read();

            while (data != -1) {
                System.out.print((char)data);
                data = reader.read();
            }

            reader.close();


        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        } catch (Exception e) {
            System.out.println(e);
        }
    } 
}

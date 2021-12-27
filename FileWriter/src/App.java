import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {
        
        try {
            FileWriter writer = new FileWriter("poem.txt");

            writer.write("roses are red \nviolets are blue");
            writer.append("\n(a poem by bro)");
            // be sure to close writer when done with it
            writer.close();

        } catch (IOException e) {
            System.out.println(e);
        }

    }
}

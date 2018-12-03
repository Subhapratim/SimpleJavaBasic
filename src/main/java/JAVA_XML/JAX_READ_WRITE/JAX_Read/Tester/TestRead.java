package JAX_READ_WRITE.JAX_Read.Tester;

import JAX_READ_WRITE.JAX_Read.Model.Item;
import JAX_READ_WRITE.JAX_Read.Parser.StaXParser;

import java.util.List;

public class TestRead {

    public static void main(String args[]) {
        StaXParser read = new StaXParser();
        String inputFile =  "src/Resources/config.xml";
        List<Item> readConfig = read.readConfig(inputFile);
        for (Item item : readConfig) {
            System.out.println(item);
        }
    }

}

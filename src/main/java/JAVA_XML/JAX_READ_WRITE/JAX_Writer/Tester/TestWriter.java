package JAX_READ_WRITE.JAX_Writer.Tester;

import JAX_READ_WRITE.JAX_Writer.Writer.StaXWriter;

public class TestWriter {

    public static void main(String[] args) {
        StaXWriter configFile = new StaXWriter();
        String inputFile =  "src/Resources/output.xml";

        configFile.setFile(inputFile);
        try {
            configFile.saveConfig();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

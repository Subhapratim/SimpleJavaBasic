import JAVA_8.JAVA8Class;
import IdentifierToken.CallerClass;
import SimpleDateFormat.MainClass;

import JAX_READ_WRITE.JAX_Read.Tester.TestRead;
import JAX_READ_WRITE.JAX_Writer.Tester.TestWriter;
import JAXB.Tester.BookMain;

import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.util.Scanner;

public class Root {
    public static void main(String[] args) throws IOException{
        System.out.println("Press 1 for JAVA_8 methods. ");
        System.out.println("Press 2 for UUID Token Generation. ");
        System.out.println("Press 3 for Simple Date Format. ");
        System.out.println("Press 4 for JAX_Read. ");
        System.out.println("Press 5 for JAX_Write. ");
        System.out.println("Press 6 for JAXB. ");

        System.out.print("Please Enter one option : ");
        Scanner in = new Scanner(System.in);
        int option = in.nextInt();

        switch (option){
            case 1: JAVA8Class.main(new String[]{"Hello"});
                    break;
            case 2: CallerClass.main(new String[]{"Hello"});
                    break;
            case 3: MainClass.main(new String[]{"Hello"});
                    break;
            case 4: TestRead.main(new String[]{"Hello"});
                    break;
            case 5: TestWriter.main(new String[]{"Hello"});
                    break;
            case 6: try {
                        BookMain.main(new String[]{"Hello"});
                    } catch (JAXBException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
            default: System.out.println("Please Enter Correct optrion.");
                    break;
        }
    }
}

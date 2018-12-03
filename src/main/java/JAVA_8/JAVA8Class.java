package JAVA_8;


import java.util.Scanner;

import JAVA_8.Base64.Base64Class;
import JAVA_8.DateTime.DateTimeClass;
import JAVA_8.DefaultMethod.DefaultMethodClass;
import JAVA_8.FunctionalInterFace.FunctionalInterfaceClass;
import JAVA_8.Lambda.LambdaExpressionClass;
import JAVA_8.MethodReference.MethodReferenceClass;
import JAVA_8.Optional.OptionalClass;
import JAVA_8.Streams.StreamsClass;

import java.io.IOException;

public class JAVA8Class {
    public static void main(String[] args) throws IOException {
        System.out.println("Press 1 for Lambda Expressions. ");
        System.out.println("Press 2 for Method References. ");
        System.out.println("Press 3 for Functional Interfaces. ");
        System.out.println("Press 4 for Default Methods. ");
        System.out.println("Press 5 for Streams. ");
        System.out.println("Press 6 for Optional Class. ");
        System.out.println("Press 7 for Date-Time API. ");
        System.out.println("Press 8 for Base64 Encoder-Decoder. ");

        System.out.print("Please Enter one option : ");
        Scanner in = new Scanner(System.in);
        int option = in.nextInt();

        switch (option){
            case 1: //Lambda Function
                    LambdaExpressionClass lambda = new LambdaExpressionClass();
                    lambda.lambdaMethod();
                    System.out.println("\n");
                    break;
            case 2: //Method Reference
                    MethodReferenceClass methodReferenceClass = new MethodReferenceClass();
                    methodReferenceClass.methodReference();
                    System.out.println("\n");
                    break;
            case 3: //Functional Interface
                    FunctionalInterfaceClass functionalInterfaceClass = new FunctionalInterfaceClass();
                    functionalInterfaceClass.functionalInterfaceMethod();
                    System.out.println("\n\n");
                    break;
            case 4: //Default Method
                    DefaultMethodClass defaultMethodClass = new DefaultMethodClass();
                    defaultMethodClass.defaultMethod();
                    System.out.println("\n");
                    break;
            case 5: //Streams
                    StreamsClass streamsClass = new StreamsClass();
                    streamsClass.streamsMethod();
                    System.out.println("\n");
                    break;
            case 6: //Optional
                    OptionalClass optionalClass = new OptionalClass();
                    optionalClass.optionalMethod();
                    System.out.println("\n");
                    break;
            case 7: //Date Time
                    DateTimeClass dateTimeClass = new DateTimeClass();
                    dateTimeClass.dateTimeMethod();
                    System.out.println("\n");
                    break;
            case 8: //Base64 Encoding - Decoding
                    Base64Class base64Class = new Base64Class();
                    base64Class.base64Method();
                    System.out.println("\n");
                    break;
            default:
                System.out.println("Please Enter Correct Option.");
        }
    }
}

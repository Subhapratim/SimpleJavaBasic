package JAVA_8;

import JAVA_8.Base64.Base64Class;
import JAVA_8.DateTime.DateTimeClass;
import JAVA_8.DefaultMethod.DefaultMethodClass;
import JAVA_8.FunctionalInterFace.FunctionalInterfaceClass;
import JAVA_8.Lambda.LambdaExpressionClass;
import JAVA_8.MethodReference.MethodReferenceClass;
import JAVA_8.Optional.OptionalClass;
import JAVA_8.Streams.StreamsClass;

import java.io.IOException;

public class MainClass {
    public static void main(String[] args) throws IOException {

        //Lambda Function
        LambdaExpressionClass lambda = new LambdaExpressionClass();
        lambda.lambdaMethod();
        System.out.println("\n");

        //Method Reference
        MethodReferenceClass methodReferenceClass = new MethodReferenceClass();
        methodReferenceClass.methodReference();
        System.out.println("\n");

        //Functional Interface
        FunctionalInterfaceClass functionalInterfaceClass = new FunctionalInterfaceClass();
        functionalInterfaceClass.functionalInterfaceMethod();
        System.out.println("\n\n");

        //Default Method
        DefaultMethodClass defaultMethodClass = new DefaultMethodClass();
        defaultMethodClass.defaultMethod();
        System.out.println("\n");

        //Streams
        StreamsClass streamsClass = new StreamsClass();
        streamsClass.streamsMethod();
        System.out.println("\n");

        //Optional
        OptionalClass optionalClass = new OptionalClass();
        optionalClass.optionalMethod();
        System.out.println("\n");

        //Date Time
        DateTimeClass dateTimeClass = new DateTimeClass();
        dateTimeClass.dateTimeMethod();
        System.out.println("\n");

        //Base64 Encoding - Decoding
        Base64Class base64Class = new Base64Class();
        base64Class.base64Method();
        System.out.println("\n");

    }
}

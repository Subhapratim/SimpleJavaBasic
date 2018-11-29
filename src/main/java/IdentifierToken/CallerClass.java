package IdentifierToken;

public class CallerClass {

    public static void main(String[] args) {
        UUIDTokenGeneratorClass uuidTokenGeneratorClass = new UUIDTokenGeneratorClass();

        // getting clock sequence value
        int a = uuidTokenGeneratorClass.generateUUID();
        System.out.println("Clock sequence value : "+a);

        int b = uuidTokenGeneratorClass.generateResetToken();
        System.out.println("Reset Token : "+b);

        String str = uuidTokenGeneratorClass.generateRandomUUID();
        System.out.println("Random Token : "+str);

    }

}

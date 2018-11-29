package IdentifierToken;

import com.fasterxml.uuid.Generators;

import java.util.Random;
import java.util.UUID;

public class UUIDTokenGeneratorClass {

    public int generateUUID(){
        UUID x = Generators.timeBasedGenerator().generate();
        System.out.println("UUID : "+x);
        return x.clockSequence();
    }

    public Integer generateResetToken() {
        Random r = new Random(System.currentTimeMillis());
        return ((1 + r.nextInt(2)) * 100000 + r.nextInt(100000));
    }

    public String generateRandomUUID(){
        return UUID.randomUUID().toString();
    }

}

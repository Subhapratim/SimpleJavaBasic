package JAVA_8.Base64;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Base64;

public class Base64Class {
    public void base64Method() throws IOException {

        String message = "Hello_World....";
        System.out.println("Basic String : "+message);
        String url = "https://www.google.com/";
        System.out.println("Basic url : "+url);

        String fileName = "/home/user/Desktop/SampleTable/Employee.json";
        StringBuilder stringBuilder = new StringBuilder();
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String line = br.readLine();
        while (line != null) {
            stringBuilder.append(line);
            stringBuilder.append("\n");
            line = br.readLine();
        }
        System.out.println("Basic text : "+stringBuilder);

        try {
            //Basic Encoder
            String basicEncodedString = Base64.getEncoder().encodeToString(message.getBytes("utf-8"));
            System.out.println("Basic Encoded String : "+basicEncodedString);

            //Basic Decoder
            byte[] basicDecodedByte = Base64.getDecoder().decode(basicEncodedString);
            String basicDecodedString = new String(basicDecodedByte);
            System.out.println("Basic Decoded String : "+basicDecodedString);
            System.out.println("\n");



            //url Encoder
            String basicEncodedUrl = Base64.getUrlEncoder().encodeToString(url.getBytes("utf-8"));
            System.out.println("Basic Encoded url : "+basicEncodedUrl);

            //url Decoder
            byte[] basicDecodedUrlByte = Base64.getUrlDecoder().decode(basicEncodedUrl);
            String basicDecodedUrl = new String(basicDecodedUrlByte);
            System.out.println("Basic Decoded url : "+basicDecodedUrl);
            System.out.println("\n");



            //Mime Encoder
            byte[] mimeBytes = stringBuilder.toString().getBytes("utf-8");
            String mimeEncodedtext = Base64.getMimeEncoder().encodeToString(mimeBytes);
            System.out.println("Basic Encoded text(mime) : "+mimeEncodedtext);

            //Mime Decoder
            byte[] mimeDecoderByte = Base64.getMimeDecoder().decode(mimeEncodedtext);
            StringBuilder mimeDecodedtext = new StringBuilder(new String(mimeDecoderByte));
            System.out.println("Basic Decoded text(mime) : "+mimeDecodedtext);
            System.out.println("\n");
        } catch (UnsupportedEncodingException e) {
            System.out.println("Error :" + e.getMessage());
            e.printStackTrace();
        }

    }
}

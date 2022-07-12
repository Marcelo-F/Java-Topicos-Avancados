package Aula4_Base64;

import java.nio.charset.StandardCharsets;

public class Base64 {
    public static void main(String[] args) {
        try{
            String texto = "A classe base64 no Java 8!";
            System.out.println("Texto original: "+texto);
            String textoCodificado = java.util.Base64.getEncoder().encodeToString(texto.getBytes(StandardCharsets.UTF_8));
            System.out.println("Texto codificado: "+textoCodificado);
            String textoDecodificado= new String (java.util.Base64.getDecoder().decode(textoCodificado), StandardCharsets.UTF_8);
            System.out.println("Texto decodificado: "+textoDecodificado);

        }catch (Exception e){

        }

    }
}

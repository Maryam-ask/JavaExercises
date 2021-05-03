package com.askari.Lesson29_Security_MD5_SHA;

import org.apache.commons.codec.digest.DigestUtils;

import javax.xml.bind.DatatypeConverter;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by Maryam Askari
 * Date: 2/17/2021
 * Time: 5:37 PM
 * Project: IntelliJ IDEA
 */
public class TestSecurity {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        String password = "1234";

        // Using md5Hashing Method with MessageDigest: (MD5)
        md5Hashing(password);

        // Using md5Hashing2 Method with Apache Commons: (MD5)
        md5Hashing2(password);

        // Using shaHashing Method with MessageDigest: (SHA)
        shaHashing(password);

        // Using shaHashing2 Method with Apache Commons: (SHA)
        shaHashing2(password);


    }

    /**
     * Ye Method Baraye Hashe MD5 Ba estefade az MassageDigest
     * !!!Kelasse MessageDigest thread safe nist
     * @param password
     */
    public static void md5Hashing(String password) throws NoSuchAlgorithmException { // MD5

        /* Ketabkhaneye mojod dar JDK!
        !!! MessageDigest ---> is NOT thread safe!!!!
         Methode .getInstance() ---> yek Object az MessageDigest be ma midahad.
         */

        MessageDigest md5 = MessageDigest.getInstance("MD5");

        // Keep on updating the message digest using update() function--- Vorodie an Byte mibashad.
        md5.update(password.getBytes());

        // Methode .digest() ---> Baraye ramznegari ast! --> Khorojie an ye Aray az Byte ast.
        byte[] digest = md5.digest();

        // Baraye tabdile Aray Byte be String Mitavanim az ketabkhaneye DatatypeConverter estefade kard
        String myHash = DatatypeConverter.printHexBinary(digest).toUpperCase();

        System.out.println("myHash with MessageDigest:(MD5) " + myHash);
    }

    /**
     * Ye Method Baraye Hashe MD5 Ba estefade az Apache commons
     * Ye dependencye joda ast ke bayad be poroje ezafe beshe
     * @param password
     */
    public static void md5Hashing2 (String password){ // MD5
        String md5Hex = DigestUtils.md5Hex(password).toUpperCase();
        System.out.println("myHash with Apache commons:(MD5) "+md5Hex);
    }

    /**
     * Ye Method Baraye Hashe SHA Ba estefade az MassageDigest
     * @param password
     * @throws NoSuchAlgorithmException
     */

    public static void shaHashing (String password) throws NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance("SHA-256"); // SHA3-256 or SHA-256
        byte[] encodeHash = digest.digest(
                password.getBytes(StandardCharsets.UTF_8));// Agar karaktere khasi darim befahme ke chie

        System.out.println("myHash with MessageDigest : (SHA) "+byteToHex(encodeHash).toUpperCase());
    }

    public static void shaHashing2(String password){
        String hex = DigestUtils.sha256Hex(password).toUpperCase();
        System.out.println("myHash Apache Commons : (SHA) "+hex);
    }

    /**
     * Ye Method baraye tabdile Array Byte be Hex(String)
     * @param bytes
     * @return
     */
    public static String byteToHex(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }
}

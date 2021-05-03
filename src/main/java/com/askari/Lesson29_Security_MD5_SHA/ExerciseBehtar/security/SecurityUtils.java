package com.askari.Lesson29_Security_MD5_SHA.ExerciseBehtar.security;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * Created by Maryam Askari
 * Date: 2/21/2021
 * Time: 3:09 PM
 * Project: IntelliJ IDEA
 */
public class SecurityUtils {
    public static String shaHashing(String password){
        String shaHex = DigestUtils.sha256Hex(password);
        return shaHex;
    }
    public static String md5Hashing(String password){
        String md5Hex = DigestUtils.md5Hex(password);
        return md5Hex;
    }
}

package com.askari.Lesson29_Security_MD5_SHA.exercise;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * Created by Maryam Askari
 * Date: 2/18/2021
 * Time: 11:06 AM
 * Project: IntelliJ IDEA
 */
public class HashClass {
    public String shaHashing(String password){
        String shaHex = DigestUtils.sha256Hex(password);
        return shaHex;
    }
    public String md5Hashing(String password){
        String md5Hex = DigestUtils.md5Hex(password);
        return md5Hex;
    }
}

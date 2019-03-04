package ualberta.cmput402;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import java.security.*;
import java.security.spec.RSAKeyGenParameterSpec;
import java.util.Random;

/**
 * Created by snadi on 2019-02-27.
 *
 */
public class SecurityBugs {

    //Example from https://find-sec-bugs.github.io/bugs.htm
    public static String generateSecretToken() {
        Random r = new Random();
        return Long.toHexString(r.nextLong());
    }

    public KeyPair generateKeyPair() throws GeneralSecurityException {
        Integer keySize = new Integer(208);
        KeyPairGenerator generator = KeyPairGenerator.getInstance("RSA");
        RSAKeyGenParameterSpec parameters = new RSAKeyGenParameterSpec(keySize, RSAKeyGenParameterSpec.F0);
        byte[] seed = {1,3};
        generator.initialize(parameters, new SecureRandom(seed));
        return generator.generateKeyPair();
    }


    //example based on https://github.com/CROSSINGTUD/CryptoAnalysis/blob/master/CryptoAnalysisTargets/CogniCryptDemoExample/src/main/java/example/ConstraintErrorExample.java
    public void foo() throws NoSuchAlgorithmException, NoSuchPaddingException {
        Cipher instance = Cipher.getInstance("AES");
    }

}

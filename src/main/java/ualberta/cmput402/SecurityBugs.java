package ualberta.cmput402;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
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

}

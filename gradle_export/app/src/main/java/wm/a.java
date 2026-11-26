package wm;

import android.security.keystore.KeyGenParameterSpec;
import g4.c;
import h00.n;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import kotlin.jvm.internal.m;

public abstract class a {
    public static final byte[] a = {81, 83, 69, 67};
    public static final Object b = new Object();

    public static byte[] a(byte[] bArr) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        boolean zEquals;
        if (bArr.length < 33) {
            zEquals = false;
        } else {
            zEquals = Arrays.equals(n.w0(0, 4, bArr), a);
        }
        if (!zEquals) {
            return bArr;
        }
        byte b2 = bArr[4];
        if (!(b2 == 1)) {
            throw new IllegalArgumentException(c.f(b2, "Unsupported DataStoreCipher version: ").toString());
        }
        byte[] bArrW0 = n.w0(5, 17, bArr);
        byte[] bArrW1 = n.w0(17, bArr.length, bArr);
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(2, b(), new GCMParameterSpec(128, bArrW0));
        byte[] bArrDoFinal = cipher.doFinal(bArrW1);
        m.d(bArrDoFinal, "doFinal(...)");
        return bArrDoFinal;
    }

    public static SecretKey b() {
        synchronized (b) {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            Key key = keyStore.getKey("quranify_datastore_aes", null);
            SecretKey secretKey = key instanceof SecretKey ? (SecretKey) key : null;
            if (secretKey != null) {
                return secretKey;
            }
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            keyGenerator.init(new KeyGenParameterSpec.Builder("quranify_datastore_aes", 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(256).build());
            SecretKey secretKeyGenerateKey = keyGenerator.generateKey();
            m.d(secretKeyGenerateKey, "generateKey(...)");
            return secretKeyGenerateKey;
        }
    }
}

package sh;

import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.Arrays;
import javax.crypto.KeyGenerator;
import zh.t;
import zh.u;

public final class c {

    public static final Object f14239b = new Object();

    public KeyStore f14240a;

    public c() {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            this.f14240a = keyStore;
        } catch (IOException | GeneralSecurityException e3) {
            throw new IllegalStateException(e3);
        }
    }

    public static boolean a(String str) {
        c cVar = new c();
        synchronized (f14239b) {
            try {
                if (cVar.d(str)) {
                    return false;
                }
                b(str);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void b(String str) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException {
        String strB = u.b(str);
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        keyGenerator.init(new KeyGenParameterSpec.Builder(strB, 3).setKeySize(256).setBlockModes("GCM").setEncryptionPaddings("NoPadding").build());
        keyGenerator.generateKey();
    }

    public final synchronized b c(String str) {
        b bVar;
        bVar = new b(u.b(str), this.f14240a);
        byte[] bArrA = t.a(10);
        byte[] bArr = new byte[0];
        if (!Arrays.equals(bArrA, bVar.b(bVar.a(bArrA, bArr), bArr))) {
            throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
        }
        return bVar;
    }

    public final synchronized boolean d(String str) {
        String strB;
        strB = u.b(str);
        try {
        } catch (NullPointerException unused) {
            Log.w("c", "Keystore is temporarily unavailable, wait, reinitialize Keystore and try again.");
            try {
                try {
                    Thread.sleep((int) (Math.random() * 40.0d));
                } catch (InterruptedException unused2) {
                }
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                this.f14240a = keyStore;
                keyStore.load(null);
                return this.f14240a.containsAlias(strB);
            } catch (IOException e3) {
                throw new GeneralSecurityException(e3);
            }
        }
        return this.f14240a.containsAlias(strB);
    }
}

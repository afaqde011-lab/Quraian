package tl;

import android.content.Context;
import android.security.keystore.KeyGenParameterSpec;
import com.mchutov.core.security.Obfuscated;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import javax.crypto.KeyGenerator;
import k9.x0;
import kotlin.jvm.internal.m;
import la.b;
import la.d;
import la.e;
import nh.f;
import nh.h;
import w.c;
import yh.f0;

public abstract class a {
    public static final String a;
    public static final String b;

    static {
        String strDecode = Obfuscated.INSTANCE.decode("2acc126a9a75e80e49a837f6de4b01a962");
        a = strDecode;
        b = c.j(strDecode, "_fallback");
    }

    public static d a(Context context) throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException, NoSuchProviderException, InvalidAlgorithmParameterException {
        x0 x0VarD;
        x0 x0VarD2;
        KeyGenParameterSpec keyGenParameterSpec = e.a;
        if (keyGenParameterSpec.getKeySize() != 256) {
            throw new IllegalArgumentException("invalid key size, want 256 bits got " + keyGenParameterSpec.getKeySize() + " bits");
        }
        if (!Arrays.equals(keyGenParameterSpec.getBlockModes(), new String[]{"GCM"})) {
            throw new IllegalArgumentException("invalid block mode, want GCM got " + Arrays.toString(keyGenParameterSpec.getBlockModes()));
        }
        if (keyGenParameterSpec.getPurposes() != 3) {
            throw new IllegalArgumentException("invalid purposes mode, want PURPOSE_ENCRYPT | PURPOSE_DECRYPT got " + keyGenParameterSpec.getPurposes());
        }
        if (!Arrays.equals(keyGenParameterSpec.getEncryptionPaddings(), new String[]{"NoPadding"})) {
            throw new IllegalArgumentException("invalid padding mode, want NoPadding got " + Arrays.toString(keyGenParameterSpec.getEncryptionPaddings()));
        }
        if (keyGenParameterSpec.isUserAuthenticationRequired() && keyGenParameterSpec.getUserAuthenticationValidityDurationSeconds() < 1) {
            throw new IllegalArgumentException("per-operation authentication is not supported (UserAuthenticationValidityDurationSeconds must be >0)");
        }
        String keystoreAlias = keyGenParameterSpec.getKeystoreAlias();
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        if (!keyStore.containsAlias(keystoreAlias)) {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            keyGenerator.init(keyGenParameterSpec);
            keyGenerator.generateKey();
        }
        String keystoreAlias2 = keyGenParameterSpec.getKeystoreAlias();
        m.d(keystoreAlias2, "getOrCreate(...)");
        String str = a;
        b bVar = b.B;
        la.c cVar = la.c.B;
        int i = rh.a.a;
        mh.m.h(rh.c.b);
        if (!qh.a.a()) {
            mh.m.f(new h(f0.class, new f[]{new f(9, mh.c.class)}, 8), true);
        }
        nh.a.a();
        ui.b bVar2 = new ui.b(9);
        bVar2.G = bVar.A;
        bVar2.C = context;
        bVar2.B = "__androidx_security_crypto_encrypted_prefs_key_keyset__";
        bVar2.D = str;
        String strConcat = "android-keystore://".concat(keystoreAlias2);
        if (!strConcat.startsWith("android-keystore://")) {
            throw new IllegalArgumentException("key URI must start with android-keystore://");
        }
        bVar2.E = strConcat;
        sh.a aVarD = bVar2.d();
        synchronized (aVarD) {
            x0VarD = aVarD.a.d();
        }
        ui.b bVar3 = new ui.b(9);
        bVar3.G = cVar.A;
        bVar3.C = context;
        bVar3.B = "__androidx_security_crypto_encrypted_prefs_value_keyset__";
        bVar3.D = str;
        String strConcat2 = "android-keystore://".concat(keystoreAlias2);
        if (!strConcat2.startsWith("android-keystore://")) {
            throw new IllegalArgumentException("key URI must start with android-keystore://");
        }
        bVar3.E = strConcat2;
        sh.a aVarD2 = bVar3.d();
        synchronized (aVarD2) {
            x0VarD2 = aVarD2.a.d();
        }
        return new d(str, context.getSharedPreferences(str, 0), (mh.a) x0VarD2.F(mh.a.class), (mh.c) x0VarD.F(mh.c.class));
    }
}

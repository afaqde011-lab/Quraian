package ph;

import c3.s0;
import com.google.android.gms.cast.Cast;
import g4.c;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import zh.t;
import zh.u;

public final class a implements mh.a {

    public static final s0 f12525b = new s0(9);

    public final SecretKeySpec f12526a;

    public a(byte[] bArr) throws InvalidAlgorithmParameterException {
        u.a(bArr.length);
        this.f12526a = new SecretKeySpec(bArr, "AES");
    }

    public static AlgorithmParameterSpec c(int i10, byte[] bArr) throws GeneralSecurityException {
        try {
            Class.forName("javax.crypto.spec.GCMParameterSpec");
            return new GCMParameterSpec(Cast.MAX_NAMESPACE_LENGTH, bArr, 0, i10);
        } catch (ClassNotFoundException unused) {
            if ("The Android Project".equals(System.getProperty("java.vendor"))) {
                return new IvParameterSpec(bArr, 0, i10);
            }
            throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
        }
    }

    @Override
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > 2147483619) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[bArr.length + 28];
        byte[] bArrA = t.a(12);
        System.arraycopy(bArrA, 0, bArr3, 0, 12);
        AlgorithmParameterSpec algorithmParameterSpecC = c(bArrA.length, bArrA);
        s0 s0Var = f12525b;
        ((Cipher) s0Var.get()).init(1, this.f12526a, algorithmParameterSpecC);
        if (bArr2 != null && bArr2.length != 0) {
            ((Cipher) s0Var.get()).updateAAD(bArr2);
        }
        int iDoFinal = ((Cipher) s0Var.get()).doFinal(bArr, 0, bArr.length, bArr3, 12);
        if (iDoFinal == bArr.length + 16) {
            return bArr3;
        }
        throw new GeneralSecurityException(c.i("encryption failed; GCM tag must be 16 bytes, but got only ", iDoFinal - bArr.length, " bytes"));
    }

    @Override
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        AlgorithmParameterSpec algorithmParameterSpecC = c(12, bArr);
        s0 s0Var = f12525b;
        ((Cipher) s0Var.get()).init(2, this.f12526a, algorithmParameterSpecC);
        if (bArr2 != null && bArr2.length != 0) {
            ((Cipher) s0Var.get()).updateAAD(bArr2);
        }
        return ((Cipher) s0Var.get()).doFinal(bArr, 12, bArr.length - 12);
    }
}

package zh;

import c3.s0;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class a implements q {

    public static final s0 f17453d = new s0(12);

    public final SecretKeySpec f17454a;

    public final int f17455b;

    public final int f17456c;

    public a(int i10, byte[] bArr) throws GeneralSecurityException {
        if (!oi.k.b(2)) {
            throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
        }
        u.a(bArr.length);
        this.f17454a = new SecretKeySpec(bArr, "AES");
        int blockSize = ((Cipher) f17453d.get()).getBlockSize();
        this.f17456c = blockSize;
        if (i10 < 12 || i10 > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.f17455b = i10;
    }

    public final void a(byte[] bArr, int i10, int i11, byte[] bArr2, int i12, byte[] bArr3, boolean z10) throws GeneralSecurityException {
        Cipher cipher = (Cipher) f17453d.get();
        byte[] bArr4 = new byte[this.f17456c];
        System.arraycopy(bArr3, 0, bArr4, 0, this.f17455b);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        SecretKeySpec secretKeySpec = this.f17454a;
        if (z10) {
            cipher.init(1, secretKeySpec, ivParameterSpec);
        } else {
            cipher.init(2, secretKeySpec, ivParameterSpec);
        }
        if (cipher.doFinal(bArr, i10, i11, bArr2, i12) != i11) {
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
    }
}

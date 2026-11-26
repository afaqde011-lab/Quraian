package zh;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.MessageDigest;

public final class s implements mh.i {

    public final xh.a f17500a;

    public final int f17501b;

    public s(xh.a aVar, int i10) throws InvalidAlgorithmParameterException {
        this.f17500a = aVar;
        this.f17501b = i10;
        if (i10 < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        }
        aVar.c(i10, new byte[0]);
    }

    @Override
    public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (!MessageDigest.isEqual(b(bArr2), bArr)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }

    @Override
    public final byte[] b(byte[] bArr) {
        return this.f17500a.c(this.f17501b, bArr);
    }
}

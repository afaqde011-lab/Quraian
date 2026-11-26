package zh;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

public final class l implements mh.a {

    public final q f17492a;

    public final mh.i f17493b;

    public final int f17494c;

    public l(q qVar, mh.i iVar, int i10) {
        this.f17492a = qVar;
        this.f17493b = iVar;
        this.f17494c = i10;
    }

    @Override
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        a aVar = (a) this.f17492a;
        aVar.getClass();
        int length = bArr.length;
        int i10 = aVar.f17455b;
        int i11 = Integer.MAX_VALUE - i10;
        if (length > i11) {
            throw new GeneralSecurityException(g4.c.f(i11, "plaintext length can not exceed "));
        }
        byte[] bArr3 = new byte[bArr.length + i10];
        byte[] bArrA = t.a(i10);
        System.arraycopy(bArrA, 0, bArr3, 0, i10);
        aVar.a(bArr, 0, bArr.length, bArr3, aVar.f17455b, bArrA, true);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        return i.c(bArr3, this.f17493b.b(i.c(bArr2, bArr3, Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8))));
    }

    @Override
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i10 = this.f17494c;
        if (length < i10) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length - i10);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, bArr.length - i10, bArr.length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        this.f17493b.a(bArrCopyOfRange2, i.c(bArr2, bArrCopyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8)));
        a aVar = (a) this.f17492a;
        aVar.getClass();
        int length2 = bArrCopyOfRange.length;
        int i11 = aVar.f17455b;
        if (length2 < i11) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArr3 = new byte[i11];
        System.arraycopy(bArrCopyOfRange, 0, bArr3, 0, i11);
        int length3 = bArrCopyOfRange.length;
        int i12 = aVar.f17455b;
        byte[] bArr4 = new byte[length3 - i12];
        aVar.a(bArrCopyOfRange, i12, bArrCopyOfRange.length - i12, bArr4, 0, bArr3, false);
        return bArr4;
    }
}

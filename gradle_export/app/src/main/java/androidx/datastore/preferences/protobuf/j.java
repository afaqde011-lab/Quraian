package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;

public abstract class j {

    public int f631a;

    public Object f632b;

    public static int d(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public static int e(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public static long f(long j9) {
        return (-(j9 & 1)) ^ (j9 >>> 1);
    }

    public static long g(long j9) {
        return (-(j9 & 1)) ^ (j9 >>> 1);
    }

    public static com.google.crypto.tink.shaded.protobuf.j j(byte[] bArr, int i10, int i11, boolean z10) {
        com.google.crypto.tink.shaded.protobuf.j jVar = new com.google.crypto.tink.shaded.protobuf.j(bArr, i10, i11, z10);
        try {
            jVar.n(i11);
            return jVar;
        } catch (com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException e3) {
            throw new IllegalArgumentException(e3);
        }
    }

    public abstract long A();

    public abstract int B();

    public abstract long C();

    public abstract String D();

    public abstract String E();

    public abstract int F();

    public abstract int G();

    public abstract long H();

    public abstract boolean I(int i10);

    public void J() {
        boolean zI;
        do {
            int iF = F();
            if (iF == 0) {
                return;
            }
            int i10 = this.f631a;
            if (i10 >= 100) {
                throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            }
            this.f631a = i10 + 1;
            zI = I(iF);
            this.f631a--;
        } while (zI);
    }

    public ByteBuffer a(int i10, byte[] bArr) {
        int[] iArrC = c(oh.a.c(bArr), i10);
        int[] iArr = (int[]) iArrC.clone();
        oh.a.b(iArr);
        for (int i11 = 0; i11 < iArrC.length; i11++) {
            iArrC[i11] = iArrC[i11] + iArr[i11];
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArrC, 0, 16);
        return byteBufferOrder;
    }

    public abstract void b(int i10);

    public abstract int[] c(int[] iArr, int i10);

    public abstract int h();

    public abstract boolean i();

    public abstract int k();

    public abstract void l(int i10);

    public void m(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) throws GeneralSecurityException {
        if (bArr.length != k()) {
            throw new GeneralSecurityException("The nonce length (in bytes) must be " + k());
        }
        int iRemaining = byteBuffer2.remaining();
        int i10 = iRemaining / 64;
        int i11 = i10 + 1;
        for (int i12 = 0; i12 < i11; i12++) {
            ByteBuffer byteBufferA = a(this.f631a + i12, bArr);
            if (i12 == i10) {
                zh.i.r(byteBuffer, byteBuffer2, byteBufferA, iRemaining % 64);
            } else {
                zh.i.r(byteBuffer, byteBuffer2, byteBufferA, 64);
            }
        }
    }

    public abstract int n(int i10);

    public abstract boolean o();

    public abstract g p();

    public abstract androidx.glance.appwidget.protobuf.h q();

    public abstract com.google.crypto.tink.shaded.protobuf.h r();

    public abstract double s();

    public abstract int t();

    public abstract int u();

    public abstract long v();

    public abstract float w();

    public abstract int x();

    public abstract long y();

    public abstract int z();
}

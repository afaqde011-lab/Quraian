package androidx.glance.appwidget.protobuf;

import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class o extends bi.b {

    public static final Logger f932c = Logger.getLogger(o.class.getName());

    public static final boolean f933d = i1.f896e;

    public k0 f934b;

    public static int e0(int i10, i iVar) {
        int iI0 = i0(i10);
        int size = iVar.size();
        return j0(size) + size + iI0;
    }

    public static int f0(int i10) {
        return j0((i10 >> 31) ^ (i10 << 1));
    }

    public static int g0(long j9) {
        return k0((j9 >> 63) ^ (j9 << 1));
    }

    public static int h0(String str) {
        int length;
        try {
            length = l1.b(str);
        } catch (k1 unused) {
            length = str.getBytes(e0.f885a).length;
        }
        return j0(length) + length;
    }

    public static int i0(int i10) {
        return j0(i10 << 3);
    }

    public static int j0(int i10) {
        return (352 - (Integer.numberOfLeadingZeros(i10) * 9)) >>> 6;
    }

    public static int k0(long j9) {
        return (640 - (Long.numberOfLeadingZeros(j9) * 9)) >>> 6;
    }

    public abstract void A0(int i10, long j9);

    public abstract void B0(long j9);

    public final void l0(String str, k1 k1Var) throws CodedOutputStream$OutOfSpaceException {
        f932c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) k1Var);
        byte[] bytes = str.getBytes(e0.f885a);
        try {
            z0(bytes.length);
            b0(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e3) {
            throw new CodedOutputStream$OutOfSpaceException(e3);
        }
    }

    public abstract void m0(byte b7);

    public abstract void n0(int i10, boolean z10);

    public abstract void o0(int i10, i iVar);

    public abstract void p0(int i10, int i11);

    public abstract void q0(int i10);

    public abstract void r0(int i10, long j9);

    public abstract void s0(long j9);

    public abstract void t0(int i10, int i11);

    public abstract void u0(int i10);

    public abstract void v0(int i10, a aVar, z0 z0Var);

    public abstract void w0(int i10, String str);

    public abstract void x0(int i10, int i11);

    public abstract void y0(int i10, int i11);

    public abstract void z0(int i10);
}

package a8;

import androidx.media3.common.z1;
import com.google.android.gms.cast.MediaStatus;
import com.google.protobuf.RuntimeVersion;
import d0.q1;
import java.util.concurrent.atomic.AtomicLong;
import sd.p1;

public final class i0 implements r, s, z1, l7.j, xf.d {
    public final int A;
    public long B;
    public Object C;

    public i0() {
        this.A = 3;
        this.B = 0L;
    }

    public i0(long j9, Object obj, int i10) {
        this.A = i10;
        this.B = j9;
        this.C = obj;
    }

    public i0(r rVar, long j9) {
        this.A = 0;
        this.C = rVar;
        ta.c0.s(rVar.getPosition() >= j9);
        this.B = j9;
    }

    public i0(z1 z1Var) {
        this.A = 2;
        this.C = z1Var;
        this.B = -9223372036854775807L;
    }

    public i0(q1 q1Var) {
        this(q1Var, 0L, 4);
        this.A = 4;
    }

    public i0(Object obj, long j9, int i10) {
        this.A = i10;
        this.C = obj;
        this.B = j9;
    }

    public i0(k50.k kVar) {
        this.A = 5;
        kotlin.jvm.internal.m.e(kVar, "source");
        this.C = kVar;
        this.B = MediaStatus.COMMAND_STREAM_TRANSFER;
    }

    public i0(ve.b bVar) {
        this.A = 9;
        com.google.android.gms.common.internal.d0.h(bVar);
        this.C = bVar;
    }

    public void A(int i10) {
        if (i10 < 64) {
            this.B &= ~(1 << i10);
            return;
        }
        i0 i0Var = (i0) this.C;
        if (i0Var != null) {
            i0Var.A(i10 - 64);
        }
    }

    @Override
    public long B(long j9, long j10) {
        return ((k) this.C).f282a;
    }

    public int C(int i10) {
        i0 i0Var = (i0) this.C;
        if (i0Var == null) {
            if (i10 >= 64) {
                return Long.bitCount(this.B);
            }
            return Long.bitCount(((1 << i10) - 1) & this.B);
        }
        if (i10 < 64) {
            return Long.bitCount(((1 << i10) - 1) & this.B);
        }
        return Long.bitCount(this.B) + i0Var.C(i10 - 64);
    }

    public void D() {
        if (((i0) this.C) == null) {
            this.C = new i0();
        }
    }

    public boolean E(int i10) {
        if (i10 < 64) {
            return ((1 << i10) & this.B) != 0;
        }
        D();
        return ((i0) this.C).E(i10 - 64);
    }

    public long F(float f3, long j9, boolean z10) {
        long jF;
        if (z10) {
            jF = h2.b.f(this.B, j9);
            this.B = jF;
        } else {
            jF = h2.b.f(this.B, j9);
        }
        if ((((q1) this.C) == null ? h2.b.c(jF) : Math.abs(H(jF))) < f3) {
            return 9205357640488583168L;
        }
        if (((q1) this.C) == null) {
            long j10 = this.B;
            float fC = h2.b.c(j10);
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) / fC;
            return h2.b.e(this.B, h2.b.g(f3, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j10 & 4294967295L)) / fC)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32)));
        }
        float fH = H(this.B) - (Math.signum(H(this.B)) * f3);
        long j11 = this.B;
        q1 q1Var = (q1) this.C;
        q1 q1Var2 = q1.B;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (q1Var == q1Var2 ? j11 & 4294967295L : j11 >> 32));
        if (((q1) this.C) != q1Var2) {
            return (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fH)) & 4294967295L);
        }
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L) | (((long) Float.floatToRawIntBits(fH)) << 32);
    }

    public void G(int i10, boolean z10) {
        if (i10 >= 64) {
            D();
            ((i0) this.C).G(i10 - 64, z10);
            return;
        }
        long j9 = this.B;
        boolean z11 = (Long.MIN_VALUE & j9) != 0;
        long j10 = (1 << i10) - 1;
        this.B = ((j9 & (~j10)) << 1) | (j9 & j10);
        if (z10) {
            L(i10);
        } else {
            A(i10);
        }
        if (z11 || ((i0) this.C) != null) {
            D();
            ((i0) this.C).G(0, z11);
        }
    }

    public float H(long j9) {
        return Float.intBitsToFloat((int) (((q1) this.C) == q1.B ? j9 >> 32 : j9 & 4294967295L));
    }

    public x40.p I() {
        db.g gVar = new db.g(9, (byte) 0);
        while (true) {
            String strZ = ((k50.k) this.C).z(this.B);
            this.B -= (long) strZ.length();
            if (strZ.length() == 0) {
                return gVar.j();
            }
            int iI0 = r30.k.I0(strZ, ':', 1, 4);
            if (iI0 != -1) {
                String strSubstring = strZ.substring(0, iI0);
                kotlin.jvm.internal.m.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                String strSubstring2 = strZ.substring(iI0 + 1);
                kotlin.jvm.internal.m.d(strSubstring2, "this as java.lang.String).substring(startIndex)");
                gVar.e(strSubstring, strSubstring2);
            } else if (strZ.charAt(0) == ':') {
                String strSubstring3 = strZ.substring(1);
                kotlin.jvm.internal.m.d(strSubstring3, "this as java.lang.String).substring(startIndex)");
                gVar.e(RuntimeVersion.SUFFIX, strSubstring3);
            } else {
                gVar.e(RuntimeVersion.SUFFIX, strZ);
            }
        }
    }

    public boolean J(int i10) {
        if (i10 >= 64) {
            D();
            return ((i0) this.C).J(i10 - 64);
        }
        long j9 = 1 << i10;
        long j10 = this.B;
        boolean z10 = (j10 & j9) != 0;
        long j11 = j10 & (~j9);
        this.B = j11;
        long j12 = j9 - 1;
        this.B = (j11 & j12) | Long.rotateRight((~j12) & j11, 1);
        i0 i0Var = (i0) this.C;
        if (i0Var != null) {
            if (i0Var.E(0)) {
                L(63);
            }
            ((i0) this.C).J(0);
        }
        return z10;
    }

    public void K() {
        this.B = 0L;
        i0 i0Var = (i0) this.C;
        if (i0Var != null) {
            i0Var.K();
        }
    }

    public void L(int i10) {
        if (i10 < 64) {
            this.B |= 1 << i10;
        } else {
            D();
            ((i0) this.C).L(i10 - 64);
        }
    }

    @Override
    public void a(int i10, int i11, byte[] bArr) {
        ((r) this.C).a(i10, i11, bArr);
    }

    @Override
    public void b(d0 d0Var) {
        ((s) this.C).b(new j0(this, d0Var, d0Var));
    }

    @Override
    public long c(long j9) {
        return ((k) this.C).f286e[(int) j9] - this.B;
    }

    @Override
    public boolean d(byte[] bArr, int i10, int i11, boolean z10) {
        return ((r) this.C).d(bArr, 0, i11, z10);
    }

    @Override
    public long e(long j9, long j10) {
        return ((k) this.C).f285d[(int) j9];
    }

    @Override
    public int f(int i10, int i11, byte[] bArr) {
        return ((r) this.C).f(i10, i11, bArr);
    }

    @Override
    public boolean g(int i10, boolean z10) {
        return ((r) this.C).g(i10, true);
    }

    @Override
    public long get() {
        long j9 = this.B;
        return j9 != -9223372036854775807L ? j9 : ((z1) this.C).get();
    }

    @Override
    public long getLength() {
        return ((r) this.C).getLength() - this.B;
    }

    @Override
    public long getPosition() {
        return ((r) this.C).getPosition() - this.B;
    }

    @Override
    public long h(long j9, long j10) {
        return 0L;
    }

    @Override
    public boolean i(byte[] bArr, int i10, int i11, boolean z10) {
        return ((r) this.C).i(bArr, i10, i11, z10);
    }

    @Override
    public long j() {
        return ((r) this.C).j() - this.B;
    }

    @Override
    public long k(long j9, long j10) {
        return -9223372036854775807L;
    }

    @Override
    public m7.j l(long j9) {
        k kVar = (k) this.C;
        int i10 = (int) j9;
        return new m7.j(kVar.f284c[i10], kVar.f283b[i10], null);
    }

    @Override
    public void m(int i10) {
        ((r) this.C).m(i10);
    }

    @Override
    public int n(int i10) {
        return ((r) this.C).n(i10);
    }

    @Override
    public long o(long j9, long j10) {
        return e7.i0.e(((k) this.C).f286e, j9 + this.B, true);
    }

    @Override
    public void onFailure(Exception exc) {
        p1 p1Var = (p1) this.C;
        ((AtomicLong) p1Var.D).set(this.B);
    }

    @Override
    public void q() {
        ((s) this.C).q();
    }

    @Override
    public int read(byte[] bArr, int i10, int i11) {
        return ((r) this.C).read(bArr, i10, i11);
    }

    @Override
    public void readFully(byte[] bArr, int i10, int i11) {
        ((r) this.C).readFully(bArr, i10, i11);
    }

    @Override
    public void t() {
        ((r) this.C).t();
    }

    public String toString() {
        switch (this.A) {
            case 3:
                if (((i0) this.C) == null) {
                    return Long.toBinaryString(this.B);
                }
                return ((i0) this.C).toString() + "xx" + Long.toBinaryString(this.B);
            default:
                return super.toString();
        }
    }

    @Override
    public void u(int i10) {
        ((r) this.C).u(i10);
    }

    @Override
    public boolean v() {
        return true;
    }

    @Override
    public l0 w(int i10, int i11) {
        return ((s) this.C).w(i10, i11);
    }

    @Override
    public long x() {
        return 0L;
    }

    @Override
    public long z(long j9) {
        return ((k) this.C).f282a;
    }
}

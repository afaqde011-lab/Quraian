package b8;

import a8.a0;
import a8.d0;
import a8.l0;
import a8.p;
import a8.q;
import a8.r;
import a8.s;
import a8.u;
import a8.v;
import androidx.media3.common.ParserException;
import androidx.media3.common.x0;
import e7.i0;
import java.io.EOFException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import oi.k;

public final class a implements q {

    public static final int[] f2181q = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    public static final int[] f2182r = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};

    public static final byte[] f2183s;

    public static final byte[] f2184t;

    public final p f2186b;

    public boolean f2187c;

    public long f2188d;

    public int f2189e;

    public int f2190f;

    public int f2192h;

    public long f2193i;

    public s f2194j;

    public l0 f2195k;
    public l0 l;
    public d0 m;

    public boolean f2196n;

    public long f2197o;

    public boolean f2198p;

    public final byte[] f2185a = new byte[1];

    public int f2191g = -1;

    static {
        String str = i0.f5136a;
        Charset charset = StandardCharsets.UTF_8;
        f2183s = "#!AMR\n".getBytes(charset);
        f2184t = "#!AMR-WB\n".getBytes(charset);
    }

    public a() {
        p pVar = new p();
        this.f2186b = pVar;
        this.l = pVar;
    }

    @Override
    public final void a(s sVar) {
        this.f2194j = sVar;
        l0 l0VarW = sVar.w(0, 1);
        this.f2195k = l0VarW;
        this.l = l0VarW;
        sVar.q();
    }

    @Override
    public final void b(long j9, long j10) {
        this.f2188d = 0L;
        this.f2189e = 0;
        this.f2190f = 0;
        this.f2197o = j10;
        d0 d0Var = this.m;
        if (!(d0Var instanceof a0)) {
            if (j9 == 0 || !(d0Var instanceof t8.a)) {
                this.f2193i = 0L;
                return;
            } else {
                t8.a aVar = (t8.a) d0Var;
                this.f2193i = (Math.max(0L, j9 - aVar.f14373b) * 8000000) / ((long) aVar.f14376e);
                return;
            }
        }
        a0 a0Var = (a0) d0Var;
        e7.q qVar = a0Var.f197b;
        long jD = qVar.f5166b == 0 ? -9223372036854775807L : qVar.d(i0.c(a0Var.f196a, j9));
        this.f2193i = jD;
        if (Math.abs(this.f2197o - jD) < 20000) {
            return;
        }
        this.f2196n = true;
        this.l = this.f2186b;
    }

    @Override
    public final int d(r rVar, u uVar) throws ParserException {
        r rVar2;
        int iA;
        int i10;
        this.f2195k.getClass();
        String str = i0.f5136a;
        if (rVar.getPosition() == 0 && !g(rVar)) {
            throw ParserException.a(null, "Could not find AMR header.");
        }
        if (!this.f2198p) {
            this.f2198p = true;
            boolean z10 = this.f2187c;
            String str2 = z10 ? "audio/amr-wb" : "audio/amr";
            String str3 = z10 ? "audio/amr-wb" : "audio/3gpp";
            int i11 = z10 ? 16000 : 8000;
            int i12 = z10 ? f2182r[8] : f2181q[7];
            l0 l0Var = this.f2195k;
            androidx.media3.common.s sVar = new androidx.media3.common.s();
            sVar.l = x0.n(str2);
            sVar.m = x0.n(str3);
            sVar.f1502n = i12;
            sVar.E = 1;
            sVar.F = i11;
            k.w(sVar, l0Var);
        }
        int i13 = 0;
        if (this.f2190f == 0) {
            try {
                int iF = f(rVar);
                this.f2189e = iF;
                this.f2190f = iF;
                if (this.f2191g == -1) {
                    rVar.getPosition();
                    this.f2191g = this.f2189e;
                }
                if (this.f2191g == this.f2189e) {
                    this.f2192h++;
                }
                d0 d0Var = this.m;
                if (d0Var instanceof a0) {
                    a0 a0Var = (a0) d0Var;
                    long j9 = this.f2193i + this.f2188d + 20000;
                    long position = rVar.getPosition() + ((long) this.f2189e);
                    e7.q qVar = a0Var.f197b;
                    int i14 = qVar.f5166b;
                    if (i14 == 0 || j9 - qVar.d(i14 - 1) >= 100000) {
                        e7.q qVar2 = a0Var.f196a;
                        e7.q qVar3 = a0Var.f197b;
                        if (qVar3.f5166b == 0 && j9 > 0) {
                            qVar2.a(0L);
                            qVar3.a(0L);
                        }
                        qVar2.a(position);
                        qVar3.a(j9);
                    }
                    if (this.f2196n && Math.abs(this.f2197o - j9) < 20000) {
                        this.f2196n = false;
                        this.l = this.f2195k;
                    }
                }
                rVar2 = rVar;
                iA = this.l.a(rVar2, this.f2190f, true);
                if (iA == -1) {
                    i13 = -1;
                } else {
                    i10 = this.f2190f - iA;
                    this.f2190f = i10;
                    if (i10 <= 0) {
                        this.l.d(this.f2188d + this.f2193i, 1, this.f2189e, 0, null);
                        this.f2188d += 20000;
                    }
                }
            } catch (EOFException unused) {
                rVar2 = rVar;
            }
        } else {
            rVar2 = rVar;
            iA = this.l.a(rVar2, this.f2190f, true);
            if (iA == -1) {
                i13 = -1;
            } else {
                i10 = this.f2190f - iA;
                this.f2190f = i10;
                if (i10 <= 0) {
                    this.l.d(this.f2188d + this.f2193i, 1, this.f2189e, 0, null);
                    this.f2188d += 20000;
                }
            }
        }
        rVar2.getLength();
        if (this.m == null) {
            v vVar = new v(-9223372036854775807L);
            this.m = vVar;
            this.f2194j.b(vVar);
        }
        if (i13 == -1) {
            d0 d0Var2 = this.m;
            if (d0Var2 instanceof a0) {
                long j10 = this.f2193i + this.f2188d;
                ((a0) d0Var2).f198c = j10;
                this.f2194j.b(d0Var2);
                this.f2195k.c(j10);
            }
        }
        return i13;
    }

    @Override
    public final boolean e(r rVar) {
        return g(rVar);
    }

    public final int f(r rVar) throws ParserException {
        boolean z10;
        rVar.t();
        byte[] bArr = this.f2185a;
        rVar.a(0, 1, bArr);
        byte b7 = bArr[0];
        if ((b7 & 131) > 0) {
            throw ParserException.a(null, "Invalid padding bits for frame header " + ((int) b7));
        }
        int i10 = (b7 >> 3) & 15;
        if (i10 >= 0 && i10 <= 15 && (((z10 = this.f2187c) && (i10 < 10 || i10 > 13)) || (!z10 && (i10 < 12 || i10 > 14)))) {
            return z10 ? f2182r[i10] : f2181q[i10];
        }
        StringBuilder sb2 = new StringBuilder("Illegal AMR ");
        sb2.append(this.f2187c ? "WB" : "NB");
        sb2.append(" frame type ");
        sb2.append(i10);
        throw ParserException.a(null, sb2.toString());
    }

    public final boolean g(r rVar) {
        rVar.t();
        byte[] bArr = f2183s;
        byte[] bArr2 = new byte[bArr.length];
        rVar.a(0, bArr.length, bArr2);
        if (Arrays.equals(bArr2, bArr)) {
            this.f2187c = false;
            rVar.u(bArr.length);
            return true;
        }
        rVar.t();
        byte[] bArr3 = f2184t;
        byte[] bArr4 = new byte[bArr3.length];
        rVar.a(0, bArr3.length, bArr4);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.f2187c = true;
        rVar.u(bArr3.length);
        return true;
    }

    @Override
    public final void release() {
    }
}

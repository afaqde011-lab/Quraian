package x8;

import a8.a0;
import a8.l0;
import a8.q;
import a8.r;
import androidx.media3.common.ParserException;
import androidx.media3.common.s;
import androidx.media3.common.t;
import androidx.media3.common.x0;
import e7.i0;
import e7.u;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import ta.c0;

public final class g implements q {

    public final k f16480a;

    public final t f16481b;

    public final ArrayList f16482c;

    public l0 f16485f;

    public int f16486g;

    public int f16487h;

    public long[] f16488i;

    public long f16489j;

    public byte[] f16484e = i0.f5137b;

    public final u f16483d = new u();

    public g(k kVar, t tVar) {
        t tVar2;
        this.f16480a = kVar;
        if (tVar != null) {
            s sVarA = tVar.a();
            sVarA.m = x0.n("application/x-media3-cues");
            sVarA.f1500j = tVar.f1594n;
            sVarA.K = kVar.p();
            tVar2 = new t(sVarA);
        } else {
            tVar2 = null;
        }
        this.f16481b = tVar2;
        this.f16482c = new ArrayList();
        this.f16487h = 0;
        this.f16488i = i0.f5138c;
        this.f16489j = -9223372036854775807L;
    }

    @Override
    public final void a(a8.s sVar) {
        c0.A(this.f16487h == 0);
        l0 l0VarW = sVar.w(0, 3);
        this.f16485f = l0VarW;
        t tVar = this.f16481b;
        if (tVar != null) {
            l0VarW.f(tVar);
            sVar.q();
            sVar.b(new a0(-9223372036854775807L, new long[]{0}, new long[]{0}));
        }
        this.f16487h = 1;
    }

    @Override
    public final void b(long j9, long j10) {
        int i10 = this.f16487h;
        c0.A((i10 == 0 || i10 == 5) ? false : true);
        this.f16489j = j10;
        if (this.f16487h == 2) {
            this.f16487h = 1;
        }
        if (this.f16487h == 4) {
            this.f16487h = 3;
        }
    }

    @Override
    public final int d(r rVar, a8.u uVar) throws ParserException {
        int i10;
        long j9;
        j jVar;
        int i11;
        int i12 = this.f16487h;
        c0.A((i12 == 0 || i12 == 5) ? false : true);
        if (this.f16487h == 1) {
            int iS = rVar.getLength() != -1 ? bi.b.s(rVar.getLength()) : 1024;
            if (iS > this.f16484e.length) {
                this.f16484e = new byte[iS];
            }
            this.f16486g = 0;
            this.f16487h = 2;
        }
        int i13 = this.f16487h;
        ArrayList arrayList = this.f16482c;
        if (i13 == 2) {
            byte[] bArr = this.f16484e;
            if (bArr.length == this.f16486g) {
                this.f16484e = Arrays.copyOf(bArr, bArr.length + 1024);
            }
            byte[] bArr2 = this.f16484e;
            int i14 = this.f16486g;
            int i15 = rVar.read(bArr2, i14, bArr2.length - i14);
            if (i15 != -1) {
                this.f16486g += i15;
            }
            long length = rVar.getLength();
            if (length != -1) {
                i10 = 0;
                if (this.f16486g == length) {
                    try {
                        j9 = this.f16489j;
                        if (j9 != -9223372036854775807L) {
                            jVar = new j(true, j9);
                        } else {
                            jVar = j.f16491c;
                        }
                        this.f16480a.D(this.f16484e, 0, this.f16486g, jVar, new k7.t(this, 28));
                        Collections.sort(arrayList);
                        this.f16488i = new long[arrayList.size()];
                        for (i11 = i10; i11 < arrayList.size(); i11++) {
                            this.f16488i[i11] = ((f) arrayList.get(i11)).A;
                        }
                        this.f16484e = i0.f5137b;
                        this.f16487h = 4;
                    } catch (RuntimeException e3) {
                        throw ParserException.a(e3, "SubtitleParser failed.");
                    }
                }
            } else {
                i10 = 0;
            }
            if (i15 == -1) {
                j9 = this.f16489j;
                if (j9 != -9223372036854775807L) {
                    jVar = new j(true, j9);
                } else {
                    jVar = j.f16491c;
                }
                this.f16480a.D(this.f16484e, 0, this.f16486g, jVar, new k7.t(this, 28));
                Collections.sort(arrayList);
                this.f16488i = new long[arrayList.size()];
                while (i11 < arrayList.size()) {
                    this.f16488i[i11] = ((f) arrayList.get(i11)).A;
                }
                this.f16484e = i0.f5137b;
                this.f16487h = 4;
            }
        } else {
            i10 = 0;
        }
        if (this.f16487h == 3) {
            if (rVar.n(rVar.getLength() != -1 ? bi.b.s(rVar.getLength()) : 1024) == -1) {
                long j10 = this.f16489j;
                for (int iE = j10 == -9223372036854775807L ? i10 : i0.e(this.f16488i, j10, true); iE < arrayList.size(); iE++) {
                    f((f) arrayList.get(iE));
                }
                this.f16487h = 4;
            }
        }
        if (this.f16487h == 4) {
            return -1;
        }
        return i10;
    }

    @Override
    public final boolean e(r rVar) {
        return true;
    }

    public final void f(f fVar) {
        this.f16485f.getClass();
        byte[] bArr = fVar.B;
        int length = bArr.length;
        u uVar = this.f16483d;
        uVar.getClass();
        uVar.L(bArr.length, bArr);
        this.f16485f.g(length, uVar);
        this.f16485f.d(fVar.A, 1, length, 0, null);
    }

    @Override
    public final void release() {
        if (this.f16487h == 5) {
            return;
        }
        this.f16480a.reset();
        this.f16487h = 5;
    }
}

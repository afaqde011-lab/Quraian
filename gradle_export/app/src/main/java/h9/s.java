package h9;

import a8.l0;
import androidx.media3.common.x0;
import b3.i2;
import e7.i0;
import g1.c3;
import java.util.Collections;

public final class s implements i {

    public final d0 f6852a;

    public String f6853b;

    public l0 f6854c;

    public r f6855d;

    public boolean f6856e;
    public long l;

    public final boolean[] f6857f = new boolean[3];

    public final ba.s f6858g = new ba.s(32);

    public final ba.s f6859h = new ba.s(33);

    public final ba.s f6860i = new ba.s(34);

    public final ba.s f6861j = new ba.s(39);

    public final ba.s f6862k = new ba.s(40);
    public long m = -9223372036854775807L;

    public final e7.u f6863n = new e7.u();

    public s(d0 d0Var) {
        this.f6852a = d0Var;
    }

    @Override
    public final void a() {
        this.l = 0L;
        this.m = -9223372036854775807L;
        f7.p.a(this.f6857f);
        this.f6858g.g();
        this.f6859h.g();
        this.f6860i.g();
        this.f6861j.g();
        this.f6862k.g();
        this.f6852a.f6689d.i(0);
        r rVar = this.f6855d;
        if (rVar != null) {
            rVar.f6846f = false;
            rVar.f6847g = false;
            rVar.f6848h = false;
            rVar.f6849i = false;
            rVar.f6850j = false;
        }
    }

    @Override
    public final void b(e7.u uVar) {
        int i10;
        this.f6854c.getClass();
        String str = i0.f5136a;
        while (uVar.a() > 0) {
            int i11 = uVar.f5183b;
            int i12 = uVar.f5184c;
            byte[] bArr = uVar.f5182a;
            this.l += (long) uVar.a();
            this.f6854c.g(uVar.a(), uVar);
            while (i11 < i12) {
                int iB = f7.p.b(bArr, i11, i12, this.f6857f);
                if (iB == i12) {
                    g(i11, i12, bArr);
                    return;
                }
                int i13 = (bArr[iB + 3] & 126) >> 1;
                if (iB <= 0 || bArr[iB - 1] != 0) {
                    i10 = 3;
                } else {
                    iB--;
                    i10 = 4;
                }
                int i14 = iB;
                int i15 = i10;
                int i16 = i14 - i11;
                if (i16 > 0) {
                    g(i11, i14, bArr);
                }
                int i17 = i12 - i14;
                long j9 = this.l - ((long) i17);
                f(j9, i17, i16 < 0 ? -i16 : 0, this.m);
                h(j9, i17, i13, this.m);
                i11 = i14 + i15;
            }
        }
    }

    @Override
    public final void c(a8.s sVar, c3 c3Var) {
        c3Var.a();
        c3Var.b();
        this.f6853b = (String) c3Var.E;
        c3Var.b();
        l0 l0VarW = sVar.w(c3Var.C, 2);
        this.f6854c = l0VarW;
        this.f6855d = new r(l0VarW);
        this.f6852a.b(sVar, c3Var);
    }

    @Override
    public final void d(boolean z10) {
        this.f6854c.getClass();
        String str = i0.f5136a;
        if (z10) {
            this.f6852a.f6689d.i(0);
            f(this.l, 0, 0, this.m);
            h(this.l, 0, 48, this.m);
        }
    }

    @Override
    public final void e(int i10, long j9) {
        this.m = j9;
    }

    public final void f(long j9, int i10, int i11, long j10) {
        i2 i2Var = this.f6852a.f6689d;
        r rVar = this.f6855d;
        boolean z10 = this.f6856e;
        if (rVar.f6850j && rVar.f6847g) {
            rVar.m = rVar.f6843c;
            rVar.f6850j = false;
        } else if (rVar.f6848h || rVar.f6847g) {
            if (z10 && rVar.f6849i) {
                rVar.a(i10 + ((int) (j9 - rVar.f6842b)));
            }
            rVar.f6851k = rVar.f6842b;
            rVar.l = rVar.f6845e;
            rVar.m = rVar.f6843c;
            rVar.f6849i = true;
        }
        if (!this.f6856e) {
            ba.s sVar = this.f6858g;
            sVar.e(i11);
            ba.s sVar2 = this.f6859h;
            sVar2.e(i11);
            ba.s sVar3 = this.f6860i;
            sVar3.e(i11);
            if (sVar.f2412d && sVar2.f2412d && sVar3.f2412d) {
                String str = this.f6853b;
                int i12 = sVar.f2413e;
                byte[] bArr = new byte[sVar2.f2413e + i12 + sVar3.f2413e];
                System.arraycopy((byte[]) sVar.f2414f, 0, bArr, 0, i12);
                System.arraycopy((byte[]) sVar2.f2414f, 0, bArr, sVar.f2413e, sVar2.f2413e);
                System.arraycopy((byte[]) sVar3.f2414f, 0, bArr, sVar.f2413e + sVar2.f2413e, sVar3.f2413e);
                f7.l lVarI = f7.p.i((byte[]) sVar2.f2414f, 3, sVar2.f2413e, null);
                f7.i iVar = lVarI.f5515b;
                String strA = iVar != null ? e7.e.a(iVar.f5501a, iVar.f5502b, iVar.f5503c, iVar.f5504d, iVar.f5505e, iVar.f5506f) : null;
                androidx.media3.common.s sVar4 = new androidx.media3.common.s();
                sVar4.f1491a = str;
                sVar4.l = x0.n("video/mp2t");
                sVar4.m = x0.n("video/hevc");
                sVar4.f1500j = strA;
                sVar4.f1508t = lVarI.f5518e;
                sVar4.f1509u = lVarI.f5519f;
                sVar4.f1510v = lVarI.f5520g;
                sVar4.f1511w = lVarI.f5521h;
                sVar4.C = new androidx.media3.common.i(lVarI.f5524k, lVarI.l, lVarI.m, lVarI.f5516c + 8, lVarI.f5517d + 8, null);
                sVar4.f1514z = lVarI.f5522i;
                sVar4.f1503o = lVarI.f5523j;
                sVar4.D = lVarI.f5514a + 1;
                sVar4.f1504p = Collections.singletonList(bArr);
                androidx.media3.common.t tVar = new androidx.media3.common.t(sVar4);
                this.f6854c.f(tVar);
                int i13 = tVar.f1596p;
                ta.c0.A(i13 != -1);
                i2Var.w(i13);
                this.f6856e = true;
            }
        }
        ba.s sVar5 = this.f6861j;
        boolean zE = sVar5.e(i11);
        e7.u uVar = this.f6863n;
        if (zE) {
            uVar.L(f7.p.n(sVar5.f2413e, (byte[]) sVar5.f2414f), (byte[]) sVar5.f2414f);
            uVar.O(5);
            i2Var.a(j10, uVar);
        }
        ba.s sVar6 = this.f6862k;
        if (sVar6.e(i11)) {
            uVar.L(f7.p.n(sVar6.f2413e, (byte[]) sVar6.f2414f), (byte[]) sVar6.f2414f);
            uVar.O(5);
            i2Var.a(j10, uVar);
        }
    }

    public final void g(int i10, int i11, byte[] bArr) {
        r rVar = this.f6855d;
        if (rVar.f6846f) {
            int i12 = rVar.f6844d;
            int i13 = (i10 + 2) - i12;
            if (i13 < i11) {
                rVar.f6847g = (bArr[i13] & 128) != 0;
                rVar.f6846f = false;
            } else {
                rVar.f6844d = (i11 - i10) + i12;
            }
        }
        if (!this.f6856e) {
            this.f6858g.a(i10, i11, bArr);
            this.f6859h.a(i10, i11, bArr);
            this.f6860i.a(i10, i11, bArr);
        }
        this.f6861j.a(i10, i11, bArr);
        this.f6862k.a(i10, i11, bArr);
    }

    public final void h(long j9, int i10, int i11, long j10) {
        r rVar = this.f6855d;
        boolean z10 = this.f6856e;
        rVar.f6847g = false;
        rVar.f6848h = false;
        rVar.f6845e = j10;
        rVar.f6844d = 0;
        rVar.f6842b = j9;
        if (i11 >= 32 && i11 != 40) {
            if (rVar.f6849i && !rVar.f6850j) {
                if (z10) {
                    rVar.a(i10);
                }
                rVar.f6849i = false;
            }
            if ((32 <= i11 && i11 <= 35) || i11 == 39) {
                rVar.f6848h = !rVar.f6850j;
                rVar.f6850j = true;
            }
        }
        boolean z11 = i11 >= 16 && i11 <= 21;
        rVar.f6843c = z11;
        rVar.f6846f = z11 || i11 <= 9;
        if (!this.f6856e) {
            this.f6858g.h(i11);
            this.f6859h.h(i11);
            this.f6860i.h(i11);
        }
        this.f6861j.h(i11);
        this.f6862k.h(i11);
    }
}

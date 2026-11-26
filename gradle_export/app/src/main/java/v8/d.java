package v8;

import a8.d0;
import a8.l0;
import a8.q;
import a8.r;
import a8.s;
import a8.u;
import androidx.media3.common.ParserException;
import androidx.media3.common.t;
import e7.i0;
import java.util.Arrays;
import s7.w0;
import tf.x;

public final class d implements q {

    public s f15536a;

    public i f15537b;

    public boolean f15538c;

    @Override
    public final void a(s sVar) {
        this.f15536a = sVar;
    }

    @Override
    public final void b(long j9, long j10) {
        i iVar = this.f15537b;
        if (iVar != null) {
            e eVar = iVar.f15554a;
            f fVar = eVar.f15539a;
            fVar.f15544a = 0;
            fVar.f15545b = 0L;
            fVar.f15546c = 0;
            fVar.f15547d = 0;
            fVar.f15548e = 0;
            eVar.f15540b.K(0);
            eVar.f15541c = -1;
            eVar.f15543e = false;
            if (j9 == 0) {
                iVar.d(!iVar.l);
                return;
            }
            if (iVar.f15561h != 0) {
                long j11 = (((long) iVar.f15562i) * j10) / 1000000;
                iVar.f15558e = j11;
                g gVar = iVar.f15557d;
                String str = i0.f5136a;
                gVar.l(j11);
                iVar.f15561h = 2;
            }
        }
    }

    @Override
    public final int d(r rVar, u uVar) throws ParserException {
        byte[] bArr;
        this.f15536a.getClass();
        if (this.f15537b == null) {
            if (!f(rVar)) {
                throw ParserException.a(null, "Failed to determine bitstream type");
            }
            rVar.t();
        }
        if (!this.f15538c) {
            l0 l0VarW = this.f15536a.w(0, 1);
            this.f15536a.q();
            i iVar = this.f15537b;
            iVar.f15556c = this.f15536a;
            iVar.f15555b = l0VarW;
            iVar.d(true);
            this.f15538c = true;
        }
        i iVar2 = this.f15537b;
        e eVar = iVar2.f15554a;
        iVar2.f15555b.getClass();
        String str = i0.f5136a;
        int i10 = iVar2.f15561h;
        if (i10 != 0) {
            if (i10 == 1) {
                rVar.u((int) iVar2.f15559f);
                iVar2.f15561h = 2;
                return 0;
            }
            if (i10 != 2) {
                if (i10 == 3) {
                    return -1;
                }
                throw new IllegalStateException();
            }
            long jD = iVar2.f15557d.d(rVar);
            if (jD >= 0) {
                uVar.f307a = jD;
                return 1;
            }
            if (jD < -1) {
                iVar2.a(-(jD + 2));
            }
            if (!iVar2.l) {
                d0 d0VarG = iVar2.f15557d.g();
                d0VarG.getClass();
                iVar2.f15556c.b(d0VarG);
                iVar2.f15555b.c(d0VarG.f());
                iVar2.l = true;
            }
            if (iVar2.f15564k <= 0 && !eVar.b(rVar)) {
                iVar2.f15561h = 3;
                return -1;
            }
            iVar2.f15564k = 0L;
            e7.u uVar2 = eVar.f15540b;
            long jB = iVar2.b(uVar2);
            if (jB >= 0) {
                long j9 = iVar2.f15560g;
                if (j9 + jB >= iVar2.f15558e) {
                    long j10 = (j9 * 1000000) / ((long) iVar2.f15562i);
                    iVar2.f15555b.g(uVar2.f5184c, uVar2);
                    iVar2.f15555b.d(j10, 1, uVar2.f5184c, 0, null);
                    iVar2.f15558e = -1L;
                }
            }
            iVar2.f15560g += jB;
            return 0;
        }
        while (true) {
            boolean zB = eVar.b(rVar);
            e7.u uVar3 = eVar.f15540b;
            if (!zB) {
                iVar2.f15561h = 3;
                return -1;
            }
            long position = rVar.getPosition();
            long j11 = iVar2.f15559f;
            iVar2.f15564k = position - j11;
            if (!iVar2.c(uVar3, j11, iVar2.f15563j)) {
                t tVar = (t) iVar2.f15563j.B;
                iVar2.f15562i = tVar.G;
                if (!iVar2.m) {
                    iVar2.f15555b.f(tVar);
                    iVar2.m = true;
                }
                w0 w0Var = (w0) iVar2.f15563j.C;
                if (w0Var == null) {
                    if (rVar.getLength() == -1) {
                        iVar2.f15557d = new x(15);
                    } else {
                        f fVar = eVar.f15539a;
                        iVar2.f15557d = new b(iVar2, iVar2.f15559f, rVar.getLength(), fVar.f15547d + fVar.f15548e, fVar.f15545b, (fVar.f15544a & 4) != 0);
                    }
                    iVar2.f15561h = 2;
                    bArr = uVar3.f5182a;
                    if (bArr.length == 65025) {
                        return 0;
                    }
                    uVar3.L(uVar3.f5184c, Arrays.copyOf(bArr, Math.max(65025, uVar3.f5184c)));
                    return 0;
                }
                iVar2.f15557d = w0Var;
                iVar2.f15561h = 2;
                bArr = uVar3.f5182a;
                if (bArr.length == 65025) {
                    return 0;
                }
                uVar3.L(uVar3.f5184c, Arrays.copyOf(bArr, Math.max(65025, uVar3.f5184c)));
                return 0;
            }
            iVar2.f15559f = rVar.getPosition();
        }
    }

    @Override
    public final boolean e(r rVar) {
        try {
            return f(rVar);
        } catch (ParserException unused) {
            return false;
        }
    }

    public final boolean f(r rVar) {
        boolean zY;
        f fVar = new f();
        if (fVar.a(rVar, true) && (fVar.f15544a & 2) == 2) {
            int iMin = Math.min(fVar.f15548e, 8);
            e7.u uVar = new e7.u(iMin);
            rVar.a(0, iMin, uVar.f5182a);
            uVar.N(0);
            if (uVar.a() >= 5 && uVar.A() == 127 && uVar.C() == 1179402563) {
                this.f15537b = new c();
                return true;
            }
            uVar.N(0);
            try {
                zY = a8.b.y(1, uVar, true);
            } catch (ParserException unused) {
                zY = false;
            }
            if (zY) {
                this.f15537b = new j();
            } else {
                uVar.N(0);
                if (h.e(uVar, h.f15551o)) {
                    this.f15537b = new h();
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public final void release() {
    }
}

package d0;

import kotlin.NoWhenBranchMatchedException;

public final class i extends b2.q implements b3.j, b3.d1 {
    public q1 O;
    public final u2 P;
    public boolean Q;
    public c R;
    public final h2 S;
    public boolean U;
    public boolean W;
    public final me.i T = new me.i(17);
    public long V = j.f4440a;

    public i(q1 q1Var, u2 u2Var, boolean z10, c cVar, h2 h2Var) {
        this.O = q1Var;
        this.P = u2Var;
        this.Q = z10;
        this.R = cVar;
        this.S = h2Var;
    }

    public static final float B1(i iVar, c cVar, long j9) throws NoWhenBranchMatchedException {
        char c10;
        h2.c cVar2;
        int iCompare;
        long j10 = iVar.V;
        m1.e eVar = (m1.e) iVar.T.B;
        int i10 = eVar.C - 1;
        Object[] objArr = eVar.A;
        if (i10 < objArr.length) {
            cVar2 = null;
            while (true) {
                if (i10 < 0) {
                    c10 = ' ';
                    break;
                }
                h2.c cVar3 = (h2.c) ((f) objArr[i10]).f4427a.invoke();
                if (cVar3 != null) {
                    long jD = cVar3.d();
                    long jM0 = kh.n.m0(iVar.C1());
                    c10 = ' ';
                    int iOrdinal = iVar.O.ordinal();
                    if (iOrdinal == 0) {
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jD & 4294967295L)), Float.intBitsToFloat((int) (jM0 & 4294967295L)));
                    } else {
                        if (iOrdinal != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jD >> 32)), Float.intBitsToFloat((int) (jM0 >> 32)));
                    }
                    if (iCompare > 0) {
                        if (cVar2 != null) {
                            break;
                        }
                        cVar2 = cVar3;
                        break;
                    }
                    cVar2 = cVar3;
                }
                i10--;
            }
        } else {
            c10 = ' ';
            cVar2 = null;
        }
        if (cVar2 == null) {
            h2.c cVar4 = iVar.U ? (h2.c) iVar.S.invoke() : null;
            if (cVar4 == null) {
                return 0.0f;
            }
            cVar2 = cVar4;
        }
        long jM1 = kh.n.m0(j10);
        int iOrdinal2 = iVar.O.ordinal();
        if (iOrdinal2 == 0) {
            float f3 = cVar2.f6547b;
            return cVar.a(f3 - ((int) (j9 & 4294967295L)), cVar2.f6549d - f3, Float.intBitsToFloat((int) (jM1 & 4294967295L)));
        }
        if (iOrdinal2 != 1) {
            throw new NoWhenBranchMatchedException();
        }
        float f10 = cVar2.f6546a;
        return cVar.a(f10 - ((int) (j9 >> c10)), cVar2.f6548c - f10, Float.intBitsToFloat((int) (jM1 >> c10)));
    }

    public static boolean D1(i iVar, h2.c cVar, long j9, long j10, int i10) throws NoWhenBranchMatchedException {
        if ((i10 & 1) != 0) {
            j9 = iVar.C1();
        }
        long j11 = j9;
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        long jF1 = iVar.F1(cVar, j11, j10);
        return Math.abs(Float.intBitsToFloat((int) (jF1 >> 32))) <= 0.5f && Math.abs(Float.intBitsToFloat((int) (jF1 & 4294967295L))) <= 0.5f;
    }

    public final long C1() {
        long j9 = this.V;
        if (y3.l.b(j9, j.f4440a)) {
            return 0L;
        }
        return j9;
    }

    public final void E1(long j9) {
        c cVar = this.R;
        if (cVar == null) {
            cVar = (c) b3.m.h(this, e.f4420a);
        }
        c cVar2 = cVar;
        if (this.W) {
            g0.a.c("launchAnimation called when previous animation was running");
        }
        c cVar3 = this.R;
        if (cVar3 == null) {
            cVar3 = (c) b3.m.h(this, e.f4420a);
        }
        cVar3.getClass();
        c.f4407a.getClass();
        a40.c0.y(p1(), (k00.i) null, a40.a0.D, new b1.f0(this, new n3(b.f4404b), cVar2, j9, (k00.c) null), 1);
    }

    public final long F1(h2.c cVar, long j9, long j10) throws NoWhenBranchMatchedException {
        long jFloatToRawIntBits;
        long jFloatToRawIntBits2;
        long jM0 = kh.n.m0(j9);
        int iOrdinal = this.O.ordinal();
        if (iOrdinal == 0) {
            c cVar2 = this.R;
            if (cVar2 == null) {
                cVar2 = (c) b3.m.h(this, e.f4420a);
            }
            float f3 = cVar.f6547b;
            float fA = cVar2.a(f3 - ((int) (j10 & 4294967295L)), cVar.f6549d - f3, Float.intBitsToFloat((int) (jM0 & 4294967295L)));
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
            long jFloatToRawIntBits4 = Float.floatToRawIntBits(fA);
            jFloatToRawIntBits = jFloatToRawIntBits3 << 32;
            jFloatToRawIntBits2 = jFloatToRawIntBits4 & 4294967295L;
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            c cVar3 = this.R;
            if (cVar3 == null) {
                cVar3 = (c) b3.m.h(this, e.f4420a);
            }
            float f10 = cVar.f6546a;
            jFloatToRawIntBits = ((long) Float.floatToRawIntBits(cVar3.a(f10 - ((int) (j10 >> 32)), cVar.f6548c - f10, Float.intBitsToFloat((int) (jM0 >> 32))))) << 32;
            jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(0.0f)) & 4294967295L;
        }
        return jFloatToRawIntBits | jFloatToRawIntBits2;
    }

    @Override
    public final void d(long j9) throws NoWhenBranchMatchedException {
        int iF;
        long j10;
        long j11;
        long j12;
        long jC1 = C1();
        this.V = j9;
        int iOrdinal = this.O.ordinal();
        if (iOrdinal == 0) {
            iF = kotlin.jvm.internal.m.f((int) (j9 & 4294967295L), (int) (jC1 & 4294967295L));
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            iF = kotlin.jvm.internal.m.f((int) (j9 >> 32), (int) (jC1 >> 32));
        }
        if (iF >= 0) {
            return;
        }
        if (this.Q) {
            j10 = 0;
        } else {
            if (this.O == q1.A) {
                j11 = ((long) 0) << 32;
                j12 = ((int) (jC1 & 4294967295L)) - ((int) (j9 & 4294967295L));
            } else {
                j11 = ((long) (((int) (jC1 >> 32)) - ((int) (j9 >> 32)))) << 32;
                j12 = 0;
            }
            j10 = j11 | (j12 & 4294967295L);
        }
        long j13 = j10;
        h2.c cVar = (h2.c) this.S.invoke();
        if (cVar == null || this.W || this.U || !D1(this, cVar, jC1, 0L, 2) || D1(this, cVar, 0L, j13, 1)) {
            return;
        }
        this.U = true;
        E1(j13);
    }

    @Override
    public final boolean q1() {
        return false;
    }
}

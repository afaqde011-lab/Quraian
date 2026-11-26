package j1;

import a40.c0;
import ab.a0;
import g00.b0;
import l1.e1;
import ri.t1;

public final class q extends b3.l implements u2.a {
    public boolean Q;
    public u00.a R;
    public r T;
    public float U;
    public boolean S = true;
    public final u2.i V = new u2.i(this, null);
    public final e1 W = new e1(0.0f);
    public final e1 X = new e1(0.0f);

    public q(boolean z10, u00.a aVar, r rVar, float f3) {
        this.Q = z10;
        this.R = aVar;
        this.T = rVar;
        this.U = f3;
    }

    public static final Object E1(q qVar, m00.c cVar) {
        m mVar;
        qVar.getClass();
        if (cVar instanceof m) {
            mVar = (m) cVar;
            int i10 = mVar.C;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                mVar.C = i10 - Integer.MIN_VALUE;
            } else {
                mVar = new m(qVar, cVar);
            }
        } else {
            mVar = new m(qVar, cVar);
        }
        m mVar2 = mVar;
        Object obj = mVar2.A;
        l00.a aVar = l00.a.A;
        int i11 = mVar2.C;
        b0 b0Var = b0.a;
        try {
            if (i11 == 0) {
                t1.O(obj);
                r rVar = qVar.T;
                mVar2.C = 1;
                Object objC = x.b.c(rVar.f7852a, new Float(1.0f), null, null, mVar2, 14);
                if (objC != aVar) {
                    objC = b0Var;
                }
                if (objC == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t1.O(obj);
            }
            if (qVar.N) {
                qVar.J1(qVar.H1());
                qVar.K1(qVar.H1());
            }
            return b0Var;
        } catch (Throwable th2) {
            if (!qVar.N) {
                throw th2;
            }
            qVar.J1(qVar.H1());
            qVar.K1(qVar.H1());
            throw th2;
        }
    }

    @Override
    public final Object D(long j9, k00.c cVar) {
        o oVar;
        if (cVar instanceof o) {
            oVar = (o) cVar;
            int i10 = oVar.C;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                oVar.C = i10 - Integer.MIN_VALUE;
            } else {
                oVar = new o(this, (m00.c) cVar);
            }
        } else {
            oVar = new o(this, (m00.c) cVar);
        }
        Object objI1 = oVar.A;
        Object obj = l00.a.A;
        int i11 = oVar.C;
        if (i11 == 0) {
            t1.O(objI1);
            float fC = y3.q.c(j9);
            oVar.C = 1;
            objI1 = I1(fC, oVar);
            if (objI1 == obj) {
                return obj;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(objI1);
        }
        return new y3.q(p30.f.U(0.0f, ((Number) objI1).floatValue()));
    }

    public final Object F1(m00.c cVar) {
        l lVar;
        if (cVar instanceof l) {
            lVar = (l) cVar;
            int i10 = lVar.C;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                lVar.C = i10 - Integer.MIN_VALUE;
            } else {
                lVar = new l(this, cVar);
            }
        } else {
            lVar = new l(this, cVar);
        }
        l lVar2 = lVar;
        Object obj = lVar2.A;
        l00.a aVar = l00.a.A;
        int i11 = lVar2.C;
        b0 b0Var = b0.a;
        try {
            if (i11 == 0) {
                t1.O(obj);
                r rVar = this.T;
                lVar2.C = 1;
                Object objC = x.b.c(rVar.f7852a, new Float(0.0f), null, null, lVar2, 14);
                if (objC != aVar) {
                    objC = b0Var;
                }
                if (objC == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t1.O(obj);
            }
            J1(0.0f);
            K1(0.0f);
            return b0Var;
        } catch (Throwable th2) {
            J1(0.0f);
            K1(0.0f);
            throw th2;
        }
    }

    public final long G1(long j9) {
        float fH;
        float fH1;
        if (this.Q) {
            fH = 0.0f;
        } else {
            e1 e1Var = this.X;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j9 & 4294967295L)) + e1Var.h();
            if (fIntBitsToFloat < 0.0f) {
                fIntBitsToFloat = 0.0f;
            }
            fH = fIntBitsToFloat - e1Var.h();
            J1(fIntBitsToFloat);
            if (e1Var.h() * 0.5f <= H1()) {
                fH1 = e1Var.h() * 0.5f;
            } else {
                float fX = a0.x(Math.abs((e1Var.h() * 0.5f) / H1()) - 1.0f, 0.0f, 2.0f);
                fH1 = H1() + (H1() * (fX - (((float) Math.pow(fX, 2)) / 4)));
            }
            K1(fH1);
        }
        return (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fH)) & 4294967295L);
    }

    public final int H1() {
        return b3.m.y(this).Z.R0(this.U);
    }

    public final Object I1(float f3, m00.c cVar) {
        p pVar;
        if (cVar instanceof p) {
            pVar = (p) cVar;
            int i10 = pVar.D;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                pVar.D = i10 - Integer.MIN_VALUE;
            } else {
                pVar = new p(this, cVar);
            }
        } else {
            pVar = new p(this, cVar);
        }
        Object obj = pVar.B;
        Object obj2 = l00.a.A;
        int i11 = pVar.D;
        if (i11 == 0) {
            t1.O(obj);
            if (this.Q) {
                return new Float(0.0f);
            }
            e1 e1Var = this.X;
            if (e1Var.h() * 0.5f > H1()) {
                this.R.invoke();
            }
            if (e1Var.h() == 0.0f || f3 < 0.0f) {
                f3 = 0.0f;
            }
            pVar.A = f3;
            pVar.D = 1;
            if (F1(pVar) == obj2) {
                return obj2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f3 = pVar.A;
            t1.O(obj);
        }
        J1(0.0f);
        return new Float(f3);
    }

    public final void J1(float f3) {
        this.X.i(f3);
    }

    public final void K1(float f3) {
        this.W.i(f3);
    }

    @Override
    public final long N0(int i10, long j9, long j10) {
        if (this.T.f7852a.e() || !this.S || i10 != 1) {
            return 0L;
        }
        long jG1 = G1(j10);
        c0.y(p1(), (k00.i) null, (a40.a0) null, new n(this, null, 1), 3);
        return jG1;
    }

    @Override
    public final long c0(int i10, long j9) {
        if (!this.T.f7852a.e() && this.S && i10 == 1 && Float.intBitsToFloat((int) (4294967295L & j9)) < 0.0f) {
            return G1(j9);
        }
        return 0L;
    }

    @Override
    public final boolean q1() {
        return false;
    }

    @Override
    public final void t1() {
        B1(this.V);
        c0.y(p1(), (k00.i) null, (a40.a0) null, new n(this, null, 0), 3);
        K1(this.Q ? H1() : 0.0f);
    }
}

package d0;

import android.view.ViewTreeObserver;
import java.lang.reflect.Method;

public final class u2 {

    public n2 f4512a;

    public z.h1 f4513b;

    public t0 f4514c;

    public q1 f4515d;

    public boolean f4516e;

    public u2.d f4517f;

    public final m2 f4518g;

    public final h2 f4519h;

    public boolean f4520i;

    public int f4521j = 1;

    public y1 f4522k = e2.f4424b;
    public final s2 l = new s2(this);
    public final a1.e1 m = new a1.e1(this, 9);

    public u2(n2 n2Var, z.h1 h1Var, t0 t0Var, q1 q1Var, boolean z10, u2.d dVar, m2 m2Var, h2 h2Var) {
        this.f4512a = n2Var;
        this.f4513b = h1Var;
        this.f4514c = t0Var;
        this.f4515d = q1Var;
        this.f4516e = z10;
        this.f4517f = dVar;
        this.f4518g = m2Var;
        this.f4519h = h2Var;
    }

    public final Object a(long j9, m00.c cVar) throws Throwable {
        p2 p2Var;
        u2 u2Var;
        Throwable th2;
        kotlin.jvm.internal.y yVar;
        if (cVar instanceof p2) {
            p2Var = (p2) cVar;
            int i10 = p2Var.D;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                p2Var.D = i10 - Integer.MIN_VALUE;
            } else {
                p2Var = new p2(this, cVar);
            }
        } else {
            p2Var = new p2(this, cVar);
        }
        Object obj = p2Var.B;
        l00.a aVar = l00.a.A;
        int i11 = p2Var.D;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yVar = p2Var.A;
            try {
                ri.t1.O(obj);
                u2Var = this;
                u2Var.f4520i = false;
                return new y3.q(yVar.A);
            } catch (Throwable th3) {
                th2 = th3;
                u2Var = this;
                u2Var.f4520i = false;
                throw th2;
            }
        }
        ri.t1.O(obj);
        kotlin.jvm.internal.y yVar2 = new kotlin.jvm.internal.y();
        yVar2.A = j9;
        this.f4520i = true;
        try {
            z.b1 b1Var = z.b1.A;
            u2Var = this;
            try {
                r2 r2Var = new r2(u2Var, yVar2, j9, null);
                p2Var.A = yVar2;
                p2Var.D = 1;
                if (u2Var.f(b1Var, r2Var, p2Var) == aVar) {
                    return aVar;
                }
                yVar = yVar2;
                u2Var.f4520i = false;
                return new y3.q(yVar.A);
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                u2Var.f4520i = false;
                throw th2;
            }
        } catch (Throwable th5) {
            th = th5;
            u2Var = this;
        }
    }

    public final Object b(long j9, boolean z10, m00.i iVar) {
        int i10;
        long jA;
        z.h1 h1Var;
        Object objInvokeSuspend;
        g00.b0 b0Var = g00.b0.a;
        if (z10) {
            t0 t0Var = this.f4514c;
            bw.b bVar = e2.f4423a;
            if (!(t0Var instanceof l)) {
                if (this.f4515d == q1.B) {
                    i10 = 1;
                } else {
                    i10 = 2;
                }
                jA = y3.q.a(0.0f, 0.0f, i10, j9);
                t2 t2Var = new t2(this, null);
                h1Var = this.f4513b;
                if (h1Var == null && (this.f4512a.d() || this.f4512a.b())) {
                    Object objB = h1Var.b(jA, t2Var, iVar);
                    if (objB == l00.a.A) {
                        return objB;
                    }
                } else {
                    t2 t2Var2 = new t2(this, iVar);
                    t2Var2.C = jA;
                    objInvokeSuspend = t2Var2.invokeSuspend(b0Var);
                    if (objInvokeSuspend == l00.a.A) {
                        return objInvokeSuspend;
                    }
                }
            }
        } else {
            if (this.f4515d == q1.B) {
                i10 = 1;
            } else {
                i10 = 2;
            }
            jA = y3.q.a(0.0f, 0.0f, i10, j9);
            t2 t2Var3 = new t2(this, null);
            h1Var = this.f4513b;
            if (h1Var == null) {
                t2 t2Var4 = new t2(this, iVar);
                t2Var4.C = jA;
                objInvokeSuspend = t2Var4.invokeSuspend(b0Var);
                if (objInvokeSuspend == l00.a.A) {
                    return objInvokeSuspend;
                }
            } else {
                t2 t2Var5 = new t2(this, iVar);
                t2Var5.C = jA;
                objInvokeSuspend = t2Var5.invokeSuspend(b0Var);
                if (objInvokeSuspend == l00.a.A) {
                    return objInvokeSuspend;
                }
            }
        }
        return b0Var;
    }

    public final long c(y1 y1Var, long j9, int i10) {
        u2.i iVar = this.f4517f.f14921a;
        u2.i iVarC1 = iVar != null ? iVar.C1() : null;
        long jC0 = iVarC1 != null ? iVarC1.c0(i10, j9) : 0L;
        long jE = h2.b.e(j9, jC0);
        long jE2 = e(h(y1Var.a(g(e(this.f4515d == q1.B ? h2.b.a(0.0f, 1, jE) : h2.b.a(0.0f, 2, jE))))));
        m2 m2Var = this.f4518g;
        if (m2Var.N) {
            ViewTreeObserver viewTreeObserver = ((c3.z) b3.m.z(m2Var)).getViewTreeObserver();
            try {
                if (c3.z.f2782q1 == null) {
                    Method declaredMethod = viewTreeObserver.getClass().getDeclaredMethod("dispatchOnScrollChanged", null);
                    declaredMethod.setAccessible(true);
                    c3.z.f2782q1 = declaredMethod;
                }
                Method method = c3.z.f2782q1;
                if (method != null) {
                    method.invoke(viewTreeObserver, null);
                }
            } catch (Exception unused) {
            }
        }
        long jE3 = h2.b.e(jE, jE2);
        u2.i iVar2 = this.f4517f.f14921a;
        u2.i iVarC2 = iVar2 != null ? iVar2.C1() : null;
        return h2.b.f(h2.b.f(jC0, jE2), iVarC2 != null ? iVarC2.N0(i10, jE2, jE3) : 0L);
    }

    public final float d(float f3) {
        return this.f4516e ? f3 * (-1) : f3;
    }

    public final long e(long j9) {
        return this.f4516e ? h2.b.g(-1.0f, j9) : j9;
    }

    public final Object f(z.b1 b1Var, u00.n nVar, m00.c cVar) {
        Object objC = this.f4512a.c(b1Var, new a1.e2(this, nVar, (k00.c) null, 17), cVar);
        return objC == l00.a.A ? objC : g00.b0.a;
    }

    public final float g(long j9) {
        return Float.intBitsToFloat((int) (this.f4515d == q1.B ? j9 >> 32 : j9 & 4294967295L));
    }

    public final long h(float f3) {
        if (f3 == 0.0f) {
            return 0L;
        }
        if (this.f4515d == q1.B) {
            return (((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
        }
        return (((long) Float.floatToRawIntBits(f3)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
    }

    public final float i(long j9) {
        int i10 = (int) (4294967295L & j9);
        int i11 = (int) (j9 >> 32);
        if (((float) Math.atan2(Math.abs(Float.intBitsToFloat(i10)), Math.abs(Float.intBitsToFloat(i11)))) >= 0.7853981633974483d) {
            if (this.f4515d == q1.A) {
                return Float.intBitsToFloat(i10);
            }
            return 0.0f;
        }
        if (this.f4515d == q1.B) {
            return Float.intBitsToFloat(i11);
        }
        return 0.0f;
    }
}

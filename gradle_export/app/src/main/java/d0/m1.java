package d0;

import android.view.ViewConfiguration;
import java.util.List;

public final class m1 extends p1 {

    public final qj.c f4447f;

    public final c40.h f4448g;

    public a40.u1 f4449h;

    public m1(u2 u2Var, qj.c cVar, av.o oVar, y3.c cVar2) {
        super(u2Var, oVar, cVar2);
        this.f4447f = cVar;
        this.f4448g = ri.t1.b(Integer.MAX_VALUE, 6, null);
    }

    public static final Object c(m1 m1Var, u2 u2Var, i1 i1Var, float f3, float f10, m00.c cVar) {
        j1 j1Var;
        g00.b0 b0Var;
        kotlin.jvm.internal.w wVar;
        float f11;
        u2 u2Var2;
        m1Var.getClass();
        l9.f0 f0Var = m1Var.f4491e;
        if (cVar instanceof j1) {
            j1Var = (j1) cVar;
            int i10 = j1Var.F;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                j1Var.F = i10 - Integer.MIN_VALUE;
            } else {
                j1Var = new j1(m1Var, cVar);
            }
        } else {
            j1Var = new j1(m1Var, cVar);
        }
        j1 j1Var2 = j1Var;
        Object obj = j1Var2.D;
        Object obj2 = l00.a.A;
        int i11 = j1Var2.F;
        g00.b0 b0Var2 = g00.b0.a;
        if (i11 == 0) {
            ri.t1.O(obj);
            kotlin.jvm.internal.z zVar = new kotlin.jvm.internal.z();
            zVar.A = i1Var;
            long j9 = i1Var.f4435b;
            long j10 = i1Var.f4434a;
            b0Var = b0Var2;
            ((w2.c) f0Var.B).a(Float.intBitsToFloat((int) (j10 >> 32)), j9);
            ((w2.c) f0Var.C).a(Float.intBitsToFloat((int) (j10 & 4294967295L)), j9);
            i1 i1VarG = g(m1Var.f4448g);
            if (i1VarG != null) {
                long j11 = i1VarG.f4435b;
                long j12 = i1VarG.f4434a;
                ((w2.c) f0Var.B).a(Float.intBitsToFloat((int) (j12 >> 32)), j11);
                ((w2.c) f0Var.C).a(Float.intBitsToFloat((int) (j12 & 4294967295L)), j11);
                zVar.A = ((i1) zVar.A).a(i1VarG);
            }
            kotlin.jvm.internal.w wVar2 = new kotlin.jvm.internal.w();
            float fG = u2Var.g(u2Var.e(((i1) zVar.A).f4434a));
            wVar2.A = fG;
            if (!n1.a(fG)) {
                kotlin.jvm.internal.z zVar2 = new kotlin.jvm.internal.z();
                zVar2.A = x.c.b(0.0f, 0.0f, 30);
                u00.n k1Var = new k1(wVar2, zVar2, zVar, f3, m1Var, f10, u2Var, null);
                j1Var2.A = u2Var;
                j1Var2.B = wVar2;
                j1Var2.C = f10;
                j1Var2.F = 1;
                if (m1Var.b(k1Var, j1Var2) != obj2) {
                    wVar = wVar2;
                    f11 = f10;
                    u2Var2 = u2Var;
                }
            }
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ri.t1.O(obj);
            return b0Var2;
        }
        f11 = j1Var2.C;
        wVar = j1Var2.B;
        u2Var2 = j1Var2.A;
        ri.t1.O(obj);
        b0Var = b0Var2;
        long jU = p30.f.U(((w2.c) f0Var.B).b(Float.MAX_VALUE), ((w2.c) f0Var.C).b(Float.MAX_VALUE));
        if (jU == 0) {
            float fD = u2Var2.d(Math.signum(wVar.A)) * Math.min(Math.abs(wVar.A) / 100, f11) * 1000;
            if (fD == 0.0f) {
                jU = 0;
            } else {
                jU = u2Var2.f4515d == q1.B ? p30.f.U(fD, 0.0f) : p30.f.U(0.0f, fD);
            }
        }
        kotlin.jvm.internal.a aVar = m1Var.f4488b;
        y3.q qVar = new y3.q(jU);
        j1Var2.A = null;
        j1Var2.B = null;
        j1Var2.F = 2;
        return aVar.invoke(qVar, j1Var2) == obj2 ? obj2 : b0Var;
    }

    public static final Object d(m1 m1Var, kotlin.jvm.internal.z zVar, kotlin.jvm.internal.w wVar, u2 u2Var, kotlin.jvm.internal.z zVar2, long j9, m00.c cVar) {
        l1 l1Var;
        u2 u2Var2;
        kotlin.jvm.internal.z zVar3;
        kotlin.jvm.internal.z zVar4;
        kotlin.jvm.internal.w wVar2;
        boolean z10;
        if (cVar instanceof l1) {
            l1Var = (l1) cVar;
            int i10 = l1Var.G;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                l1Var.G = i10 - Integer.MIN_VALUE;
            } else {
                l1Var = new l1(cVar);
            }
        } else {
            l1Var = new l1(cVar);
        }
        Object objL = l1Var.F;
        l00.a aVar = l00.a.A;
        int i11 = l1Var.G;
        if (i11 == 0) {
            ri.t1.O(objL);
            if (j9 < 0) {
                return Boolean.FALSE;
            }
            a1.a0 a0Var = new a1.a0(m1Var, (k00.c) null, 9);
            l1Var.A = m1Var;
            l1Var.B = zVar;
            l1Var.C = wVar;
            u2Var2 = u2Var;
            l1Var.D = u2Var2;
            zVar3 = zVar2;
            l1Var.E = zVar3;
            l1Var.G = 1;
            objL = a40.c0.L(j9, a0Var, l1Var);
            if (objL == aVar) {
                return aVar;
            }
            zVar4 = zVar;
            wVar2 = wVar;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.jvm.internal.z zVar5 = l1Var.E;
            u2 u2Var3 = l1Var.D;
            wVar2 = l1Var.C;
            zVar4 = l1Var.B;
            m1 m1Var2 = l1Var.A;
            ri.t1.O(objL);
            zVar3 = zVar5;
            u2Var2 = u2Var3;
            m1Var = m1Var2;
        }
        i1 i1Var = (i1) objL;
        if (i1Var != null) {
            boolean z11 = ((i1) zVar4.A).f4436c;
            long j10 = i1Var.f4434a;
            zVar4.A = new i1(j10, i1Var.f4435b, z11);
            wVar2.A = u2Var2.i(u2Var2.e(j10));
            zVar3.A = x.c.b(0.0f, 0.0f, 30);
            l9.f0 f0Var = m1Var.f4491e;
            long j11 = i1Var.f4435b;
            long j12 = i1Var.f4434a;
            ((w2.c) f0Var.B).a(Float.intBitsToFloat((int) (j12 >> 32)), j11);
            ((w2.c) f0Var.C).a(Float.intBitsToFloat((int) (j12 & 4294967295L)), j11);
            z10 = !n1.a(wVar2.A);
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    public static i1 g(c40.h hVar) {
        i1 i1Var = null;
        q30.k kVarF = ri.t1.F(new v0((Object) new h1(hVar, 0), (k00.c) i1Var, 1));
        while (kVarF.hasNext()) {
            i1 i1VarA = (i1) kVarF.next();
            if (i1Var != null) {
                i1VarA = i1Var.a(i1VarA);
            }
            i1Var = i1VarA;
        }
        return i1Var;
    }

    public final float e(s2 s2Var, float f3) {
        u2 u2Var = this.f4487a;
        long jH = u2Var.h(u2Var.d(f3));
        u2 u2Var2 = s2Var.f4508a;
        return u2Var.g(u2Var.e(u2Var2.c(u2Var2.f4522k, jH, 1)));
    }

    public final boolean f(v2.k kVar) {
        long j9;
        qj.c cVar = this.f4447f;
        ViewConfiguration viewConfiguration = (ViewConfiguration) cVar.B;
        float f3 = -viewConfiguration.getScaledVerticalScrollFactor();
        float f10 = -viewConfiguration.getScaledHorizontalScrollFactor();
        ?? r4 = kVar.f15387a;
        h2.b bVar = new h2.b(0L);
        int size = r4.size();
        boolean zD = false;
        int i10 = 0;
        while (true) {
            j9 = bVar.f6544a;
            if (i10 >= size) {
                break;
            }
            bVar = new h2.b(h2.b.f(j9, ((v2.s) r4.get(i10)).f15408j));
            i10++;
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j9 >> 32)) * f10)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j9 & 4294967295L)) * f3)) & 4294967295L);
        u2 u2Var = this.f4487a;
        float fI = u2Var.i(u2Var.e(jFloatToRawIntBits));
        if (fI != 0.0f) {
            zD = fI > 0.0f ? u2Var.f4512a.d() : u2Var.f4512a.b();
        }
        if (!zD) {
            return this.f4490d;
        }
        long j10 = ((v2.s) h00.q.L0((List) kVar.f15387a)).f15400b;
        cVar.getClass();
        return !(this.f4448g.j(new i1(jFloatToRawIntBits, j10, false)) instanceof c40.n);
    }
}

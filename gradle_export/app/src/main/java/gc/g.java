package gc;

import ab.a0;
import l1.i1;
import l1.p2;
import l1.q;
import l1.w;
import z.e1;

public final class g implements p2 {
    public final i1 A;
    public final i1 B;
    public final i1 C;
    public final i1 D;
    public final i1 E;
    public final i1 F;
    public final i1 G;
    public final w H;
    public final i1 I;
    public final i1 J;
    public final i1 K;
    public final i1 L;
    public final w M;
    public final e1 N;

    public g() {
        Boolean bool = Boolean.FALSE;
        this.A = q.z(bool);
        this.B = q.z(1);
        this.C = q.z(1);
        this.D = q.z(bool);
        this.E = q.z(null);
        this.F = q.z(Float.valueOf(1.0f));
        this.G = q.z(bool);
        this.H = q.r(new e(this, 1));
        this.I = q.z(null);
        Float fValueOf = Float.valueOf(0.0f);
        this.J = q.z(fValueOf);
        this.K = q.z(fValueOf);
        this.L = q.z(Long.MIN_VALUE);
        this.M = q.r(new e(this, 0));
        q.r(new e(this, 2));
        this.N = new e1();
    }

    public static final boolean a(g gVar, int i10, long j9) {
        i1 i1Var = gVar.I;
        i1 i1Var2 = gVar.E;
        i1 i1Var3 = gVar.J;
        w wVar = gVar.H;
        i1 i1Var4 = gVar.L;
        cc.a aVar = (cc.a) i1Var.getValue();
        if (aVar == null) {
            return true;
        }
        long jLongValue = ((Number) i1Var4.getValue()).longValue() == Long.MIN_VALUE ? 0L : j9 - ((Number) i1Var4.getValue()).longValue();
        i1Var4.setValue(Long.valueOf(j9));
        if (i1Var2.getValue() != null) {
            throw new ClassCastException();
        }
        if (i1Var2.getValue() != null) {
            throw new ClassCastException();
        }
        float fFloatValue = ((Number) wVar.getValue()).floatValue() * ((jLongValue / ((long) 1000000)) / aVar.b());
        float fFloatValue2 = ((Number) wVar.getValue()).floatValue() < 0.0f ? 0.0f - (((Number) i1Var3.getValue()).floatValue() + fFloatValue) : (((Number) i1Var3.getValue()).floatValue() + fFloatValue) - 1.0f;
        if (fFloatValue2 < 0.0f) {
            gVar.h(a0.x(((Number) i1Var3.getValue()).floatValue(), 0.0f, 1.0f) + fFloatValue);
            return true;
        }
        int i11 = (int) (fFloatValue2 / 1.0f);
        int i12 = i11 + 1;
        if (gVar.f() + i12 > i10) {
            gVar.h(gVar.e());
            gVar.g(i10);
            return false;
        }
        gVar.g(gVar.f() + i12);
        float f3 = fFloatValue2 - (i11 * 1.0f);
        gVar.h(((Number) wVar.getValue()).floatValue() < 0.0f ? 1.0f - f3 : 0.0f + f3);
        return true;
    }

    public static final void c(g gVar, boolean z10) {
        gVar.A.setValue(Boolean.valueOf(z10));
    }

    public final float e() {
        return ((Number) this.M.getValue()).floatValue();
    }

    public final int f() {
        return ((Number) this.B.getValue()).intValue();
    }

    public final void g(int i10) {
        this.B.setValue(Integer.valueOf(i10));
    }

    @Override
    public final Object getValue() {
        return Float.valueOf(((Number) this.K.getValue()).floatValue());
    }

    public final void h(float f3) {
        cc.a aVar;
        this.J.setValue(Float.valueOf(f3));
        if (((Boolean) this.G.getValue()).booleanValue() && (aVar = (cc.a) this.I.getValue()) != null) {
            f3 -= f3 % (1 / aVar.l);
        }
        this.K.setValue(Float.valueOf(f3));
    }
}

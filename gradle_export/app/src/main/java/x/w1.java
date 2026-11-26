package x;

public final class w1 {

    public final a0 f16379a;

    public o f16380b;

    public o f16381c;

    public o f16382d;

    public final float f16383e;

    public w1(a0 a0Var) {
        this.f16379a = a0Var;
        this.f16383e = a0Var.a();
    }

    public final o a(long j9, o oVar, o oVar2) {
        if (this.f16381c == null) {
            this.f16381c = oVar.c();
        }
        o oVar3 = this.f16381c;
        if (oVar3 == null) {
            kotlin.jvm.internal.m.k("velocityVector");
            throw null;
        }
        int iB = oVar3.b();
        for (int i10 = 0; i10 < iB; i10++) {
            o oVar4 = this.f16381c;
            if (oVar4 == null) {
                kotlin.jvm.internal.m.k("velocityVector");
                throw null;
            }
            oVar.getClass();
            oVar4.e(this.f16379a.c(oVar2.a(i10), j9), i10);
        }
        o oVar5 = this.f16381c;
        if (oVar5 != null) {
            return oVar5;
        }
        kotlin.jvm.internal.m.k("velocityVector");
        throw null;
    }
}

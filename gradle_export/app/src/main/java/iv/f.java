package iv;

import g00.b0;
import j0.v;
import l1.z0;
import ri.t1;

public final class f implements d40.j {
    public final int A = 1;
    public final float B;
    public final Object C;
    public final Object D;

    public f(d40.j jVar, tm.e eVar, float f) {
        this.C = jVar;
        this.D = eVar;
        this.B = f;
    }

    public f(v vVar, float f, z0 z0Var) {
        this.C = vVar;
        this.B = f;
        this.D = z0Var;
    }

    @Override
    public final Object emit(Object obj, k00.c cVar) {
        Object objF;
        tm.c cVar2;
        switch (this.A) {
            case 0:
                ((Boolean) obj).getClass();
                v vVar = (v) this.C;
                int iM = a.m(vVar, this.B);
                z0 z0Var = (z0) this.D;
                return (iM >= ((Number) z0Var.getValue()).intValue() || (objF = vVar.f(((Number) z0Var.getValue()).intValue(), cVar)) != l00.a.A) ? b0.a : objF;
            default:
                if (cVar instanceof tm.c) {
                    cVar2 = (tm.c) cVar;
                    int i = cVar2.B;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        cVar2.B = i - Integer.MIN_VALUE;
                    } else {
                        cVar2 = new tm.c(this, cVar);
                    }
                } else {
                    cVar2 = new tm.c(this, cVar);
                }
                Object obj2 = cVar2.A;
                l00.a aVar = l00.a.A;
                int i2 = cVar2.B;
                if (i2 == 0) {
                    t1.O(obj2);
                    d40.j jVar = (d40.j) this.C;
                    if (Math.abs(((Number) obj).floatValue() - ((Number) ((tm.e) this.D).m.e.getValue()).floatValue()) < this.B) {
                        cVar2.B = 1;
                        if (jVar.emit(obj, cVar2) == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj2);
                }
                return b0.a;
        }
    }
}

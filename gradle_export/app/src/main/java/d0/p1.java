package d0;

import com.google.android.gms.internal.measurement.z3;

public abstract class p1 {

    public final u2 f4487a;

    public final kotlin.jvm.internal.a f4488b;

    public y3.c f4489c;

    public boolean f4490d;

    public final l9.f0 f4491e = new l9.f0(16);

    public p1(u2 u2Var, u00.n nVar, y3.c cVar) {
        this.f4487a = u2Var;
        this.f4488b = (kotlin.jvm.internal.a) nVar;
        this.f4489c = cVar;
    }

    public static void a(v2.k kVar) {
        ?? r4 = kVar.f15387a;
        int size = r4.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((v2.s) r4.get(i10)).a();
        }
    }

    public final Object b(u00.n nVar, m00.c cVar) {
        o1 o1Var;
        if (cVar instanceof o1) {
            o1Var = (o1) cVar;
            int i10 = o1Var.C;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                o1Var.C = i10 - Integer.MIN_VALUE;
            } else {
                o1Var = new o1(this, cVar);
            }
        } else {
            o1Var = new o1(this, cVar);
        }
        Object obj = o1Var.A;
        l00.a aVar = l00.a.A;
        int i11 = o1Var.C;
        if (i11 == 0) {
            ri.t1.O(obj);
            this.f4490d = true;
            a1.d dVar = new a1.d(this, nVar, null, 28);
            o1Var.C = 1;
            a40.v1 v1Var = new a40.v1(o1Var.getContext(), o1Var, 0);
            if (z3.S(v1Var, v1Var, dVar) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ri.t1.O(obj);
        }
        this.f4490d = false;
        return g00.b0.a;
    }
}

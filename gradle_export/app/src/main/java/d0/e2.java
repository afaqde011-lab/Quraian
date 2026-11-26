package d0;

public abstract class e2 {

    public static final bw.b f4423a = new bw.b(15);

    public static final b2 f4424b = new b2();

    public static final a2 f4425c = new a2();

    public static final c2 f4426d = new c2();

    public static final Object a(u2 u2Var, long j9, m00.c cVar) {
        d2 d2Var;
        kotlin.jvm.internal.w wVar;
        u2 u2Var2;
        if (cVar instanceof d2) {
            d2Var = (d2) cVar;
            int i10 = d2Var.D;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                d2Var.D = i10 - Integer.MIN_VALUE;
            } else {
                d2Var = new d2(cVar);
            }
        } else {
            d2Var = new d2(cVar);
        }
        Object obj = d2Var.C;
        l00.a aVar = l00.a.A;
        int i11 = d2Var.D;
        if (i11 == 0) {
            ri.t1.O(obj);
            wVar = new kotlin.jvm.internal.w();
            z.b1 b1Var = z.b1.A;
            b1.w wVar2 = new b1.w(u2Var, j9, wVar, (k00.c) null, 3);
            d2Var.A = u2Var;
            d2Var.B = wVar;
            d2Var.D = 1;
            if (u2Var.f(b1Var, wVar2, d2Var) == aVar) {
                return aVar;
            }
            u2Var2 = u2Var;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.jvm.internal.w wVar3 = d2Var.B;
            u2 u2Var3 = d2Var.A;
            ri.t1.O(obj);
            wVar = wVar3;
            u2Var2 = u2Var3;
        }
        return new h2.b(u2Var2.h(wVar.A));
    }

    public static b2.r b(b2.r rVar, n2 n2Var, q1 q1Var, boolean z10, boolean z11, f0.i iVar) {
        return rVar.V(new z1(n2Var, q1Var, z10, z11, iVar));
    }
}

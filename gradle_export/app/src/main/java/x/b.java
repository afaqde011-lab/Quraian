package x;

public final class b {

    public final r1 f16232a;

    public final Object f16233b;

    public final j f16234c;

    public final l1.i1 f16235d;

    public final l1.i1 f16236e;

    public final n0 f16237f;

    public final b1 f16238g;

    public final o f16239h;

    public final o f16240i;

    public final o f16241j;

    public final o f16242k;

    public b(Object obj, r1 r1Var, Object obj2) {
        this.f16232a = r1Var;
        this.f16233b = obj2;
        j jVar = new j(r1Var, obj, null, 60);
        this.f16234c = jVar;
        this.f16235d = l1.q.z(Boolean.FALSE);
        this.f16236e = l1.q.z(obj);
        this.f16237f = new n0();
        this.f16238g = new b1(obj2);
        o oVar = jVar.C;
        boolean z10 = oVar instanceof k;
        o oVar2 = z10 ? c.f16252e : oVar instanceof l ? c.f16253f : oVar instanceof m ? c.f16254g : c.f16255h;
        this.f16239h = oVar2;
        o oVar3 = z10 ? c.f16248a : oVar instanceof l ? c.f16249b : oVar instanceof m ? c.f16250c : c.f16251d;
        this.f16240i = oVar3;
        this.f16241j = oVar2;
        this.f16242k = oVar3;
    }

    public b(Object obj, r1 r1Var, Object obj2, int i10) {
        this(obj, r1Var, (i10 & 4) != 0 ? null : obj2);
    }

    public static final Object a(b bVar, Object obj) {
        r1 r1Var = bVar.f16232a;
        o oVar = bVar.f16242k;
        o oVar2 = bVar.f16241j;
        if (!kotlin.jvm.internal.m.a(oVar2, bVar.f16239h) || !kotlin.jvm.internal.m.a(oVar, bVar.f16240i)) {
            o oVar3 = (o) r1Var.f16363a.invoke(obj);
            int iB = oVar3.b();
            boolean z10 = false;
            for (int i10 = 0; i10 < iB; i10++) {
                if (oVar3.a(i10) < oVar2.a(i10) || oVar3.a(i10) > oVar.a(i10)) {
                    oVar3.e(ab.a0.x(oVar3.a(i10), oVar2.a(i10), oVar.a(i10)), i10);
                    z10 = true;
                }
            }
            if (z10) {
                return r1Var.f16364b.invoke(oVar3);
            }
        }
        return obj;
    }

    public static final void b(b bVar) {
        j jVar = bVar.f16234c;
        jVar.C.d();
        jVar.D = Long.MIN_VALUE;
        bVar.f16235d.setValue(Boolean.FALSE);
    }

    public static Object c(b bVar, Object obj, i iVar, u00.k kVar, k00.c cVar, int i10) {
        if ((i10 & 2) != 0) {
            iVar = bVar.f16238g;
        }
        i iVar2 = iVar;
        Object objInvoke = bVar.f16232a.f16364b.invoke(bVar.f16234c.C);
        if ((i10 & 8) != 0) {
            kVar = null;
        }
        u00.k kVar2 = kVar;
        Object objD = bVar.d();
        r1 r1Var = bVar.f16232a;
        return n0.a(bVar.f16237f, new a(bVar, objInvoke, new h1(iVar2, r1Var, objD, obj, (o) r1Var.f16363a.invoke(objInvoke)), bVar.f16234c.D, kVar2, null), cVar);
    }

    public final Object d() {
        return this.f16234c.B.getValue();
    }

    public final boolean e() {
        return ((Boolean) this.f16235d.getValue()).booleanValue();
    }

    public final Object f(Object obj, k00.c cVar) {
        Object objA = n0.a(this.f16237f, new l6.r(this, obj, null, 2), cVar);
        return objA == l00.a.A ? objA : g00.b0.a;
    }

    public final Object g(m00.i iVar) {
        Object objA = n0.a(this.f16237f, new a1.r1(this, null, 12), iVar);
        return objA == l00.a.A ? objA : g00.b0.a;
    }
}

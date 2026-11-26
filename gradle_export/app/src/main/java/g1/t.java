package g1;

public final class t extends m00.i implements u00.n {
    public final int A;
    public int B;
    public final float C;
    public final boolean D;
    public final Object E;
    public final Object F;
    public final Object G;

    public t(Object obj, float f3, boolean z10, Object obj2, Object obj3, k00.c cVar, int i10) {
        super(2, cVar);
        this.A = i10;
        this.E = obj;
        this.C = f3;
        this.D = z10;
        this.F = obj2;
        this.G = obj3;
    }

    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new t((x.b) this.E, this.C, this.D, (u) this.F, (f0.h) this.G, cVar, 0);
            default:
                return new t((h) this.E, this.C, this.D, (l1.z0) this.F, (l1.z0) this.G, cVar, 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        a40.z zVar = (a40.z) obj;
        k00.c cVar = (k00.c) obj2;
        switch (this.A) {
            case 0:
                break;
        }
        return create(zVar, cVar).invokeSuspend(g00.b0.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object dVar;
        Object objF;
        int i10 = this.A;
        g00.b0 b0Var = g00.b0.a;
        Object obj2 = this.G;
        Object obj3 = this.E;
        Object obj4 = this.F;
        switch (i10) {
            case 0:
                u uVar = (u) obj4;
                x.b bVar = (x.b) obj3;
                l00.a aVar = l00.a.A;
                int i11 = this.B;
                if (i11 != 0) {
                    if (i11 != 1 && i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                    return b0Var;
                }
                ri.t1.O(obj);
                float f3 = ((y3.f) bVar.f16236e.getValue()).A;
                float f10 = this.C;
                if (y3.f.b(f3, f10)) {
                    return b0Var;
                }
                if (this.D) {
                    float f11 = ((y3.f) bVar.f16236e.getValue()).A;
                    x.q1 q1Var = null;
                    if (y3.f.b(f11, uVar.f5994b)) {
                        dVar = new f0.k(0L);
                    } else if (y3.f.b(f11, uVar.f5996d)) {
                        dVar = new f0.f();
                    } else {
                        dVar = y3.f.b(f11, uVar.f5995c) ? new f0.d() : null;
                    }
                    f0.h hVar = (f0.h) obj2;
                    this.B = 2;
                    x.q1 q1Var2 = h1.f0.f6509b;
                    x.q1 q1Var3 = h1.f0.f6508a;
                    if (hVar != null) {
                        if ((hVar instanceof f0.k) || (hVar instanceof f0.b) || (hVar instanceof f0.f) || (hVar instanceof f0.d)) {
                            q1Var = q1Var3;
                        }
                    } else if (dVar != null) {
                        if ((dVar instanceof f0.k) || (dVar instanceof f0.b)) {
                            q1Var = q1Var2;
                        } else if (dVar instanceof f0.f) {
                            q1Var = h1.f0.f6510c;
                        } else if (dVar instanceof f0.d) {
                            q1Var = q1Var2;
                        }
                    }
                    x.q1 q1Var4 = q1Var;
                    if (q1Var4 == null ? (objF = bVar.f(new y3.f(f10), this)) != aVar : (objF = x.b.c(bVar, new y3.f(f10), q1Var4, null, this, 12)) != aVar) {
                        objF = b0Var;
                    }
                    if (objF != aVar) {
                        return b0Var;
                    }
                } else {
                    y3.f fVar = new y3.f(f10);
                    this.B = 1;
                    if (bVar.f(fVar, this) != aVar) {
                        return b0Var;
                    }
                }
                return aVar;
            default:
                l1.z0 z0Var = (l1.z0) obj4;
                l00.a aVar2 = l00.a.A;
                int i12 = this.B;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                    return b0Var;
                }
                ri.t1.O(obj);
                float f12 = z7.f6046a;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (((h2.b) z0Var.getValue()).f6544a >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (((h2.b) z0Var.getValue()).f6544a & 4294967295L));
                long j9 = ((y3.j) ((l1.z0) obj2).getValue()).f16590a;
                x.z0 z0Var2 = new x.z0(0);
                this.B = 1;
                return z7.s((h) obj3, fIntBitsToFloat, fIntBitsToFloat2, this.C, this.D, j9, z0Var2, this) == aVar2 ? aVar2 : b0Var;
        }
    }
}

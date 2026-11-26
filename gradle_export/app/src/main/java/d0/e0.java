package d0;

public final class e0 extends m00.h implements u00.n {
    public final int B = 0;
    public int C;
    public Object D;
    public Object E;
    public final Object F;
    public final g00.e G;
    public final g00.e H;
    public final Object I;

    public e0(a2.f fVar, y yVar, u00.n nVar, u00.a aVar, ca.q qVar, k00.c cVar) {
        super(2, cVar);
        this.E = fVar;
        this.F = yVar;
        this.G = nVar;
        this.H = aVar;
        this.I = qVar;
    }

    public e0(a40.z zVar, u00.o oVar, u00.k kVar, t1 t1Var, k00.c cVar) {
        super(2, cVar);
        this.F = zVar;
        this.G = (m00.i) oVar;
        this.H = kVar;
        this.I = t1Var;
    }

    public e0(cz.f fVar, gv.a1 a1Var, g1.a1 a1Var2, gv.z0 z0Var, k00.c cVar) {
        super(2, cVar);
        this.F = fVar;
        this.G = a1Var;
        this.H = a1Var2;
        this.I = z0Var;
    }

    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.B) {
            case 0:
                e0 e0Var = new e0((a2.f) this.E, (y) this.F, this.G, this.H, (ca.q) this.I, cVar);
                e0Var.D = obj;
                return e0Var;
            case 1:
                e0 e0Var2 = new e0((cz.f) this.F, this.G, this.H, (gv.z0) this.I, cVar);
                e0Var2.D = obj;
                return e0Var2;
            default:
                e0 e0Var3 = new e0((a40.z) this.F, (u00.o) this.G, this.H, (t1) this.I, cVar);
                e0Var3.D = obj;
                return e0Var3;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        v2.i0 i0Var = (v2.i0) obj;
        k00.c cVar = (k00.c) obj2;
        switch (this.B) {
            case 0:
                break;
            case 1:
                break;
        }
        return create(i0Var, cVar).invokeSuspend(g00.b0.a);
    }

    public final Object invokeSuspend(Object obj) {
        v2.i0 i0Var;
        Object objA;
        v2.i0 i0Var2;
        Object objB;
        Object objB2;
        v2.i0 i0Var3;
        kotlin.jvm.internal.w wVar;
        v2.s sVar;
        Object objG;
        Object objB3;
        v2.i0 i0Var4;
        a40.e1 e1Var;
        Object objI;
        a40.e1 e1Var2;
        v2.s sVar2;
        switch (this.B) {
            case 0:
                l00.a aVar = l00.a.A;
                int i10 = this.C;
                if (i10 != 0) {
                    if (i10 == 1) {
                        i0Var = (v2.i0) this.D;
                        ri.t1.O(obj);
                        objA = obj;
                    } else {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ri.t1.O(obj);
                    }
                    return g00.b0.a;
                }
                ri.t1.O(obj);
                i0Var = (v2.i0) this.D;
                v2.l lVar = v2.l.A;
                this.D = i0Var;
                this.C = 1;
                objA = f3.a(i0Var, false, lVar, this);
                if (objA == aVar) {
                    return aVar;
                }
                a2.f fVar = (a2.f) this.E;
                y yVar = (y) this.F;
                u00.n nVar = this.G;
                u00.a aVar2 = this.H;
                ca.q qVar = (ca.q) this.I;
                this.D = null;
                this.C = 2;
                if (i0.j(i0Var, (v2.s) objA, fVar, yVar, nVar, aVar2, qVar, this) == aVar) {
                    return aVar;
                }
                return g00.b0.a;
            case 1:
                gv.a1 a1Var = this.G;
                l00.a aVar3 = l00.a.A;
                int i11 = this.C;
                if (i11 != 0) {
                    if (i11 == 1) {
                        i0Var2 = (v2.i0) this.D;
                        ri.t1.O(obj);
                        objB = obj;
                    } else {
                        if (i11 == 2) {
                            wVar = (kotlin.jvm.internal.w) this.E;
                            v2.i0 i0Var5 = (v2.i0) this.D;
                            ri.t1.O(obj);
                            i0Var3 = i0Var5;
                            objB2 = obj;
                            sVar = (v2.s) objB2;
                            if (sVar != null) {
                                cz.f fVar2 = (cz.f) this.F;
                                kotlin.jvm.internal.v vVar = (kotlin.jvm.internal.v) fVar2.B;
                                kotlin.jvm.internal.w wVar2 = (kotlin.jvm.internal.w) fVar2.C;
                                kotlin.jvm.internal.v vVar2 = (kotlin.jvm.internal.v) fVar2.D;
                                l1.z0 z0Var = (l1.z0) fVar2.E;
                                l1.z0 z0Var2 = (l1.z0) fVar2.F;
                                l1.z0 z0Var3 = (l1.z0) fVar2.G;
                                vVar.A = false;
                                wVar2.A = ((Number) z0Var.getValue()).floatValue();
                                vVar2.A = false;
                                z0Var2.setValue(true);
                                ((u00.k) z0Var3.getValue()).invoke(Boolean.TRUE);
                                a1Var.invoke(sVar, new Float(wVar.A));
                                long j9 = sVar.f15399a;
                                a1.e1 e1Var3 = new a1.e1(a1Var, 8);
                                this.D = null;
                                this.E = null;
                                this.C = 3;
                                objG = i0.g(i0Var3, j9, e1Var3, this);
                                if (objG == aVar3) {
                                    return aVar3;
                                }
                            }
                            return g00.b0.a;
                        }
                        if (i11 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ri.t1.O(obj);
                        objG = obj;
                    }
                    if (((Boolean) objG).booleanValue()) {
                        this.H.invoke();
                    } else {
                        ((gv.z0) this.I).invoke();
                    }
                    return g00.b0.a;
                }
                ri.t1.O(obj);
                i0Var2 = (v2.i0) this.D;
                this.D = i0Var2;
                this.C = 1;
                objB = f3.b(i0Var2, this, 2);
                if (objB == aVar3) {
                    return aVar3;
                }
                v2.s sVar3 = (v2.s) objB;
                kotlin.jvm.internal.w wVar3 = new kotlin.jvm.internal.w();
                long j10 = sVar3.f15399a;
                int i12 = sVar3.f15407i;
                a1.y1 y1Var = new a1.y1(wVar3, 8);
                this.D = i0Var2;
                this.E = wVar3;
                this.C = 2;
                objB2 = i0.b(i0Var2, j10, i12, y1Var, this);
                if (objB2 == aVar3) {
                    return aVar3;
                }
                i0Var3 = i0Var2;
                wVar = wVar3;
                sVar = (v2.s) objB2;
                if (sVar != null) {
                    cz.f fVar3 = (cz.f) this.F;
                    kotlin.jvm.internal.v vVar3 = (kotlin.jvm.internal.v) fVar3.B;
                    kotlin.jvm.internal.w wVar4 = (kotlin.jvm.internal.w) fVar3.C;
                    kotlin.jvm.internal.v vVar4 = (kotlin.jvm.internal.v) fVar3.D;
                    l1.z0 z0Var4 = (l1.z0) fVar3.E;
                    l1.z0 z0Var5 = (l1.z0) fVar3.F;
                    l1.z0 z0Var6 = (l1.z0) fVar3.G;
                    vVar3.A = false;
                    wVar4.A = ((Number) z0Var4.getValue()).floatValue();
                    vVar4.A = false;
                    z0Var5.setValue(true);
                    ((u00.k) z0Var6.getValue()).invoke(Boolean.TRUE);
                    a1Var.invoke(sVar, new Float(wVar.A));
                    long j11 = sVar.f15399a;
                    a1.e1 e1Var4 = new a1.e1(a1Var, 8);
                    this.D = null;
                    this.E = null;
                    this.C = 3;
                    objG = i0.g(i0Var3, j11, e1Var4, this);
                    if (objG == aVar3) {
                        return aVar3;
                    }
                    if (((Boolean) objG).booleanValue()) {
                        this.H.invoke();
                    } else {
                        ((gv.z0) this.I).invoke();
                    }
                }
                return g00.b0.a;
            default:
                a40.z zVar = (a40.z) this.F;
                t1 t1Var = (t1) this.I;
                l00.a aVar4 = l00.a.A;
                int i13 = this.C;
                k00.c cVar = null;
                if (i13 != 0) {
                    if (i13 == 1) {
                        e1Var = (a40.u1) this.E;
                        v2.i0 i0Var6 = (v2.i0) this.D;
                        ri.t1.O(obj);
                        i0Var4 = i0Var6;
                        objB3 = obj;
                    } else {
                        if (i13 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        e1Var2 = (a40.e1) this.D;
                        ri.t1.O(obj);
                        objI = obj;
                    }
                    sVar2 = (v2.s) objI;
                    if (sVar2 == null) {
                        f3.f(zVar, e1Var2, new y2(t1Var, cVar, 0));
                    } else {
                        sVar2.a();
                        f3.f(zVar, e1Var2, new y2(t1Var, cVar, 1));
                        this.H.invoke(new h2.b(sVar2.f15401c));
                    }
                    return g00.b0.a;
                }
                ri.t1.O(obj);
                v2.i0 i0Var7 = (v2.i0) this.D;
                a40.e1 e1VarY = a40.c0.y(zVar, (k00.i) null, a40.a0.D, new z2(t1Var, cVar, 0), 1);
                this.D = i0Var7;
                this.E = e1VarY;
                this.C = 1;
                objB3 = f3.b(i0Var7, this, 3);
                if (objB3 == aVar4) {
                    return aVar4;
                }
                i0Var4 = i0Var7;
                e1Var = e1VarY;
                v2.s sVar4 = (v2.s) objB3;
                sVar4.a();
                m00.i iVar = this.G;
                if (iVar != f3.f4430a) {
                    f3.f(zVar, e1Var, new a1.e2((u00.o) iVar, t1Var, sVar4, (k00.c) null));
                }
                this.D = e1Var;
                this.E = null;
                this.C = 2;
                objI = f3.i(i0Var4, v2.l.B, this);
                if (objI == aVar4) {
                    return aVar4;
                }
                e1Var2 = e1Var;
                sVar2 = (v2.s) objI;
                if (sVar2 == null) {
                    f3.f(zVar, e1Var2, new y2(t1Var, cVar, 0));
                } else {
                    sVar2.a();
                    f3.f(zVar, e1Var2, new y2(t1Var, cVar, 1));
                    this.H.invoke(new h2.b(sVar2.f15401c));
                }
                return g00.b0.a;
        }
    }
}

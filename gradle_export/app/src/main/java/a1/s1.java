package a1;

import d0.g3;

public final class s1 extends m00.i implements u00.n {
    public final int A = 0;
    public int B;
    public final boolean C;
    public final float D;
    public final Object E;
    public final Object F;

    public s1(t1 t1Var, float f3, boolean z10, h2.c cVar, k00.c cVar2) {
        super(2, cVar2);
        this.E = t1Var;
        this.D = f3;
        this.C = z10;
        this.F = cVar;
    }

    public s1(boolean z10, x.b bVar, x.b bVar2, float f3, k00.c cVar) {
        super(2, cVar);
        this.C = z10;
        this.E = bVar;
        this.F = bVar2;
        this.D = f3;
    }

    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new s1((t1) this.E, this.D, this.C, (h2.c) this.F, cVar);
            default:
                return new s1(this.C, (x.b) this.E, (x.b) this.F, this.D, cVar);
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
        Float f3;
        f2 f2Var;
        Float f10;
        int i10 = this.A;
        g00.b0 b0Var = g00.b0.a;
        boolean z10 = this.C;
        Object obj2 = this.E;
        Object obj3 = this.F;
        float fCeil = this.D;
        switch (i10) {
            case 0:
                t1 t1Var = (t1) obj2;
                l00.a aVar = l00.a.A;
                int i11 = this.B;
                if (i11 == 0) {
                    ri.t1.O(obj);
                    z.p1 p1Var = t1Var.X;
                    float f11 = m1.f98a;
                    if (!Float.isNaN(fCeil) && !Float.isInfinite(fCeil)) {
                        fCeil = (float) (fCeil > 0.0f ? Math.ceil(fCeil) : Math.floor(fCeil));
                    }
                    this.B = 1;
                    if (g3.i(p1Var, fCeil, this) != aVar) {
                    }
                    return aVar;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                    return b0Var;
                }
                ri.t1.O(obj);
                if (!z10) {
                    return b0Var;
                }
                this.B = 2;
                if (t1Var.S.f122g.a((h2.c) obj3, this) != aVar) {
                    return b0Var;
                }
                return aVar;
            default:
                x.b bVar = (x.b) obj3;
                x.b bVar2 = (x.b) obj2;
                l00.a aVar2 = l00.a.A;
                int i12 = this.B;
                if (i12 != 0) {
                    if (i12 == 1) {
                        ri.t1.O(obj);
                        f3 = new Float(fCeil);
                        this.B = 2;
                        if (bVar.f(f3, this) != aVar2) {
                        }
                    } else {
                        if (i12 != 2) {
                            if (i12 != 3) {
                                if (i12 == 4) {
                                    ri.t1.O(obj);
                                    f10 = new Float(fCeil);
                                    this.B = 5;
                                    if (bVar.f(f10, this) != aVar2) {
                                        return b0Var;
                                    }
                                } else if (i12 != 5) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            }
                            ri.t1.O(obj);
                            return b0Var;
                        }
                        ri.t1.O(obj);
                    }
                    f2Var = new f2(bVar2, bVar, null, 17);
                    this.B = 3;
                    if (a40.c0.k(f2Var, this) != aVar2) {
                        return b0Var;
                    }
                } else {
                    ri.t1.O(obj);
                    if (z10) {
                        Float f12 = new Float(0.0f);
                        this.B = 1;
                        if (bVar2.f(f12, this) != aVar2) {
                            f3 = new Float(fCeil);
                            this.B = 2;
                            if (bVar.f(f3, this) != aVar2) {
                                f2Var = new f2(bVar2, bVar, null, 17);
                                this.B = 3;
                                if (a40.c0.k(f2Var, this) != aVar2) {
                                    return b0Var;
                                }
                            }
                        }
                    } else {
                        Float f13 = new Float(0.0f);
                        this.B = 4;
                        if (bVar2.f(f13, this) != aVar2) {
                            f10 = new Float(fCeil);
                            this.B = 5;
                            if (bVar.f(f10, this) != aVar2) {
                                return b0Var;
                            }
                        }
                    }
                }
                return aVar2;
        }
    }
}

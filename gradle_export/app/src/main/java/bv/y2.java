package bv;

import g1.m6;

public final class y2 extends m00.i implements u00.n {
    public final int A;
    public int B;
    public float C;
    public final Object D;

    public y2(float f, l1.z0 z0Var, k00.c cVar) {
        super(2, cVar);
        this.A = 3;
        this.C = f;
        this.D = z0Var;
    }

    public y2(i3.c cVar, k00.c cVar2) {
        super(2, cVar2);
        this.A = 2;
        this.D = cVar;
    }

    public y2(Object obj, float f, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.D = obj;
        this.C = f;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new y2((e3) this.D, this.C, cVar, 0);
            case 1:
                return new y2((m6) this.D, this.C, cVar, 1);
            case 2:
                y2 y2Var = new y2((i3.c) this.D, cVar);
                y2Var.C = ((Number) obj).floatValue();
                return y2Var;
            case 3:
                return new y2(this.C, (l1.z0) this.D, cVar);
            default:
                return new y2((uu.w) this.D, this.C, cVar, 4);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                return ((y2) create((a40.z) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
            case 1:
                return ((y2) create((a40.z) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
            case 2:
                return ((y2) create(Float.valueOf(((Number) obj).floatValue()), (k00.c) obj2)).invokeSuspend(g00.b0.a);
            case 3:
                return ((y2) create((a40.z) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
            default:
                return ((y2) create((a40.z) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        Object objC;
        Object objInvoke;
        Object objG;
        int i = this.A;
        g00.b0 b0Var = g00.b0.a;
        Object[] objArr = 0;
        Object obj2 = this.D;
        switch (i) {
            case 0:
                e3 e3Var = (e3) obj2;
                l00.a aVar = l00.a.A;
                int i2 = this.B;
                if (i2 == 0) {
                    ri.t1.O(obj);
                    uu.a aVar2 = e3Var.d;
                    float f = this.C;
                    this.B = 1;
                    uu.w wVar = (uu.w) aVar2;
                    wVar.getClass();
                    if (a40.c0.J(new y2(wVar, ab.a0.x(f, 0.25f, 2.0f), objArr == true ? 1 : 0, 4), wVar.p, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                e3Var.i(o1.a((o1) e3Var.c.d.getValue(), 0L, 0L, 0.0f, 0.0f, 0.0f, null, false, false, 0, false, false, false, null, null, null, null, null, null, false, null, false, false, false, false, false, false, false, null, false, false, null, null, null, null, null, null, false, null, null, null, null, 0, false, false, false, false, null, false, null, null, false, null, false, false, false, -16777217, 16777215));
                return b0Var;
            case 1:
                l00.a aVar3 = l00.a.A;
                int i3 = this.B;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                    return b0Var;
                }
                ri.t1.O(obj);
                float f2 = this.C;
                this.B = 1;
                fc.n nVar = ((m6) obj2).d;
                Object value = ((l1.i1) nVar.g).getValue();
                Object objF = nVar.f(nVar.k(), f2, value);
                if (((Boolean) ((u00.k) nVar.d).invoke(objF)).booleanValue()) {
                    objC = nVar.c(objF, z.b1.A, new h1.c(nVar, f2, (k00.c) null), this);
                    if (objC != aVar3) {
                        objC = b0Var;
                    }
                    if (objC != aVar3) {
                        objC = b0Var;
                    }
                } else {
                    objC = nVar.c(value, z.b1.A, new h1.c(nVar, f2, (k00.c) null), this);
                    if (objC != aVar3) {
                        objC = b0Var;
                    }
                    if (objC != aVar3) {
                        objC = b0Var;
                    }
                }
                if (objC != aVar3) {
                    objC = b0Var;
                }
                return objC == aVar3 ? aVar3 : b0Var;
            case 2:
                j3.s sVar = ((i3.c) obj2).a;
                l00.a aVar4 = l00.a.A;
                int i4 = this.B;
                if (i4 == 0) {
                    ri.t1.O(obj);
                    float f3 = this.C;
                    Object objG2 = sVar.d.A.g(j3.n.e);
                    u00.n nVar2 = (u00.n) (objG2 != null ? objG2 : null);
                    if (nVar2 == null) {
                        throw a1.b.u("Required value was null.");
                    }
                    h2.b bVar = new h2.b((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L));
                    this.B = 1;
                    objInvoke = nVar2.invoke(bVar, this);
                    if (objInvoke == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                    objInvoke = obj;
                }
                return new Float(Float.intBitsToFloat((int) (((h2.b) objInvoke).a & 4294967295L)));
            case 3:
                l1.z0 z0Var = (l1.z0) obj2;
                float f4 = this.C;
                l00.a aVar5 = l00.a.A;
                int i5 = this.B;
                if (i5 == 0) {
                    ri.t1.O(obj);
                    l1.q2 q2Var = tp.h.a;
                    if (y3.f.a(f4, ((y3.f) z0Var.getValue()).A) < 0) {
                        this.B = 1;
                        if (a40.c0.l(250L, this) == aVar5) {
                            return aVar5;
                        }
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                l1.q2 q2Var2 = tp.h.a;
                z0Var.setValue(new y3.f(f4));
                return b0Var;
            default:
                float f5 = this.C;
                uu.w wVar2 = (uu.w) obj2;
                l00.a aVar6 = l00.a.A;
                int i6 = this.B;
                if (i6 == 0) {
                    ri.t1.O(obj);
                    d40.p1 p1Var = wVar2.M;
                    Float f6 = new Float(f5);
                    p1Var.getClass();
                    p1Var.k(null, f6);
                    this.B = 1;
                    objG = wVar2.g(false, this);
                    if (objG == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                    objG = obj;
                }
                k9.u uVar = (k9.u) objG;
                if (uVar == null) {
                    return null;
                }
                uVar.setPlaybackParameters(new androidx.media3.common.z0(f5));
                return b0Var;
        }
    }
}

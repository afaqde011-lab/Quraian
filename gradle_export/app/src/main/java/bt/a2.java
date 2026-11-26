package bt;

import com.google.android.gms.internal.measurement.z3;
import kotlinx.coroutines.flow.internal.AbortFlowException;

public final class a2 implements d40.i {
    public final int A;
    public final Object B;

    public a2(Object obj, int i) {
        this.A = i;
        this.B = obj;
    }

    public a2(u00.n nVar) {
        this.A = 3;
        this.B = (m00.i) nVar;
    }

    @Override
    public final Object collect(d40.j jVar, k00.c cVar) throws Throwable {
        d40.c0 c0Var;
        AbortFlowException e;
        Object obj;
        d40.a aVar;
        e40.p pVar;
        switch (this.A) {
            case 0:
                Object objCollect = ((t1) this.B).collect(new m1(jVar, 6), cVar);
                return objCollect == l00.a.A ? objCollect : g00.b0.a;
            case 1:
                Object objEmit = jVar.emit(this.B, cVar);
                return objEmit == l00.a.A ? objEmit : g00.b0.a;
            case 2:
                if (cVar instanceof d40.c0) {
                    c0Var = (d40.c0) cVar;
                    int i = c0Var.B;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0Var.B = i - Integer.MIN_VALUE;
                    } else {
                        c0Var = new d40.c0(this, cVar);
                    }
                } else {
                    c0Var = new d40.c0(this, cVar);
                }
                Object obj2 = c0Var.A;
                l00.a aVar2 = l00.a.A;
                int i2 = c0Var.B;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj = c0Var.D;
                    try {
                        ri.t1.O(obj2);
                    } catch (AbortFlowException e2) {
                        e = e2;
                        if (e.A != obj) {
                            throw e;
                        }
                    }
                    break;
                } else {
                    ri.t1.O(obj2);
                    Object obj3 = new Object();
                    kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
                    try {
                        t1 t1Var = (t1) this.B;
                        try {
                            d40.g gVar = new d40.g(xVar, jVar, obj3);
                            c0Var.D = obj3;
                            c0Var.B = 1;
                            if (t1Var.collect(gVar, c0Var) == aVar2) {
                                return aVar2;
                            }
                        } catch (AbortFlowException e3) {
                            e = e3;
                            obj = obj3;
                            if (e.A != obj) {
                                throw e;
                            }
                        }
                    } catch (AbortFlowException e4) {
                        e = e4;
                    }
                }
                return g00.b0.a;
            case 3:
                if (cVar instanceof d40.a) {
                    aVar = (d40.a) cVar;
                    int i3 = aVar.D;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        aVar.D = i3 - Integer.MIN_VALUE;
                    } else {
                        aVar = new d40.a(this, cVar);
                    }
                } else {
                    aVar = new d40.a(this, cVar);
                }
                Object obj4 = aVar.B;
                l00.a aVar3 = l00.a.A;
                int i4 = aVar.D;
                g00.b0 b0Var = g00.b0.a;
                if (i4 != 0) {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pVar = aVar.A;
                    try {
                        ri.t1.O(obj4);
                        pVar.releaseIntercepted();
                        return b0Var;
                    } catch (Throwable th) {
                        th = th;
                        pVar.releaseIntercepted();
                        throw th;
                    }
                }
                ri.t1.O(obj4);
                e40.p pVar2 = new e40.p(jVar, aVar.getContext());
                try {
                    aVar.A = pVar2;
                    aVar.D = 1;
                    try {
                        Object objInvoke = ((m00.i) this.B).invoke(pVar2, aVar);
                        if (objInvoke != aVar3) {
                            objInvoke = b0Var;
                        }
                        if (objInvoke == aVar3) {
                            return aVar3;
                        }
                        pVar = pVar2;
                        pVar.releaseIntercepted();
                        return b0Var;
                    } catch (Throwable th2) {
                        th = th2;
                        pVar = pVar2;
                        pVar.releaseIntercepted();
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
                break;
            case 4:
                d40.i[] iVarArr = (d40.i[]) this.B;
                Object objA = e40.b.a(jVar, cVar, new a30.l(iVarArr, 25), new h2(3, (k00.c) null, 1), iVarArr);
                return objA == l00.a.A ? objA : g00.b0.a;
            case 5:
                a1.e2 e2Var = new a1.e2((d40.n) this.B, jVar, (k00.c) null, 27);
                a40.v1 v1Var = new a40.v1(cVar.getContext(), cVar, 1);
                Object objS = z3.S(v1Var, v1Var, e2Var);
                return objS == l00.a.A ? objS : g00.b0.a;
            case 6:
                Object objCollect2 = ((d40.u0) this.B).collect(new m1(jVar, 19), cVar);
                return objCollect2 == l00.a.A ? objCollect2 : g00.b0.a;
            default:
                Object objCollect3 = ((ea.l) this.B).collect(new m1(jVar, 20), cVar);
                return objCollect3 == l00.a.A ? objCollect3 : g00.b0.a;
        }
    }
}

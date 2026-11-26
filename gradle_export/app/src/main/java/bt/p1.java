package bt;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class p1 implements d40.j {
    public final int A;
    public final Object B;
    public final int C;

    public p1(Object obj, int i, int i2) {
        this.A = i2;
        this.B = obj;
        this.C = i;
    }

    @Override
    public final Object emit(Object obj, k00.c cVar) {
        o1 o1Var;
        is.v0 v0Var;
        tq.e eVar;
        e40.j jVar;
        switch (this.A) {
            case 0:
                if (cVar instanceof o1) {
                    o1Var = (o1) cVar;
                    int i = o1Var.B;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        o1Var.B = i - Integer.MIN_VALUE;
                    } else {
                        o1Var = new o1(this, cVar);
                    }
                } else {
                    o1Var = new o1(this, cVar);
                }
                Object obj2 = o1Var.A;
                l00.a aVar = l00.a.A;
                int i2 = o1Var.B;
                if (i2 == 0) {
                    ri.t1.O(obj2);
                    d40.j jVar2 = (d40.j) this.B;
                    m2 m2Var = new m2(this.C, (ss.v) obj);
                    o1Var.B = 1;
                    if (jVar2.emit(m2Var, o1Var) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj2);
                }
                return g00.b0.a;
            case 1:
                if (cVar instanceof is.v0) {
                    v0Var = (is.v0) cVar;
                    int i3 = v0Var.B;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        v0Var.B = i3 - Integer.MIN_VALUE;
                    } else {
                        v0Var = new is.v0(this, cVar);
                    }
                } else {
                    v0Var = new is.v0(this, cVar);
                }
                Object obj3 = v0Var.A;
                l00.a aVar2 = l00.a.A;
                int i4 = v0Var.B;
                if (i4 == 0) {
                    ri.t1.O(obj3);
                    d40.j jVar3 = (d40.j) this.B;
                    is.q0 q0Var = (is.q0) ((Map) obj).get(new Integer(this.C));
                    ss.v vVar = q0Var != null ? q0Var.a : null;
                    v0Var.B = 1;
                    if (jVar3.emit(vVar, v0Var) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj3);
                }
                return g00.b0.a;
            case 2:
                if (cVar instanceof tq.e) {
                    eVar = (tq.e) cVar;
                    int i5 = eVar.B;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        eVar.B = i5 - Integer.MIN_VALUE;
                    } else {
                        eVar = new tq.e(this, cVar);
                    }
                } else {
                    eVar = new tq.e(this, cVar);
                }
                Object obj4 = eVar.A;
                l00.a aVar3 = l00.a.A;
                int i6 = eVar.B;
                if (i6 == 0) {
                    ri.t1.O(obj4);
                    d40.j jVar4 = (d40.j) this.B;
                    ArrayList arrayList = new ArrayList();
                    for (zq.a aVar4 : (List) obj) {
                        Long l = aVar4.b == this.C ? new Long(aVar4.a) : null;
                        if (l != null) {
                            arrayList.add(l);
                        }
                    }
                    eVar.B = 1;
                    if (jVar4.emit(arrayList, eVar) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj4);
                }
                return g00.b0.a;
            default:
                if (cVar instanceof e40.j) {
                    jVar = (e40.j) cVar;
                    int i7 = jVar.C;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        jVar.C = i7 - Integer.MIN_VALUE;
                    } else {
                        jVar = new e40.j(this, cVar);
                    }
                } else {
                    jVar = new e40.j(this, cVar);
                }
                Object obj5 = jVar.A;
                l00.a aVar5 = l00.a.A;
                int i8 = jVar.C;
                if (i8 != 0) {
                    if (i8 == 1) {
                        ri.t1.O(obj5);
                    } else {
                        if (i8 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ri.t1.O(obj5);
                    }
                    return g00.b0.a;
                }
                ri.t1.O(obj5);
                c40.h hVar = (c40.h) this.B;
                h00.a0 a0Var = new h00.a0(this.C, obj);
                jVar.C = 1;
                if (hVar.m(a0Var, jVar) == aVar5) {
                    return aVar5;
                }
                jVar.C = 2;
                if (a40.c0.M(jVar) == aVar5) {
                    return aVar5;
                }
                return g00.b0.a;
        }
    }
}

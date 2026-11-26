package nx;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ri.t1;

public final class n0 implements d40.j {
    public final int A;
    public final d40.j B;
    public final p0 C;

    public n0(d40.j jVar, p0 p0Var, int i) {
        this.A = i;
        this.B = jVar;
        this.C = p0Var;
    }

    @Override
    public final Object emit(Object obj, k00.c cVar) {
        m0 m0Var;
        o0 o0Var;
        switch (this.A) {
            case 0:
                if (cVar instanceof m0) {
                    m0Var = (m0) cVar;
                    int i = m0Var.B;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        m0Var.B = i - Integer.MIN_VALUE;
                    } else {
                        m0Var = new m0(this, cVar);
                    }
                } else {
                    m0Var = new m0(this, cVar);
                }
                Object obj2 = m0Var.A;
                l00.a aVar = l00.a.A;
                int i2 = m0Var.B;
                if (i2 == 0) {
                    t1.O(obj2);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : (List) obj) {
                        if (((yt.a) obj3).b == this.C.d.getReciterType()) {
                            arrayList.add(obj3);
                        }
                    }
                    m0Var.B = 1;
                    if (this.B.emit(arrayList, m0Var) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj2);
                }
                return g00.b0.a;
            default:
                if (cVar instanceof o0) {
                    o0Var = (o0) cVar;
                    int i3 = o0Var.B;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        o0Var.B = i3 - Integer.MIN_VALUE;
                    } else {
                        o0Var = new o0(this, cVar);
                    }
                } else {
                    o0Var = new o0(this, cVar);
                }
                Object obj4 = o0Var.A;
                l00.a aVar2 = l00.a.A;
                int i4 = o0Var.B;
                if (i4 == 0) {
                    t1.O(obj4);
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj5 : (List) obj) {
                        if (((yt.b) obj5).a == this.C.d.getReciterType()) {
                            arrayList2.add(obj5);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList(h00.r.q0(arrayList2, 10));
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(new Long(((yt.b) it.next()).b));
                    }
                    o0Var.B = 1;
                    if (this.B.emit(arrayList3, o0Var) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj4);
                }
                return g00.b0.a;
        }
    }
}

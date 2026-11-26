package wj;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import ri.t1;

public final class v0 extends m00.i implements u00.n {
    public final int A;
    public Object B;
    public final x0 C;

    public v0(x0 x0Var, k00.c cVar, int i10) {
        super(2, cVar);
        this.A = i10;
        this.C = x0Var;
    }

    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                v0 v0Var = new v0(this.C, cVar, 0);
                v0Var.B = obj;
                return v0Var;
            default:
                v0 v0Var2 = new v0(this.C, cVar, 1);
                v0Var2.B = obj;
                return v0Var2;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        f0 f0Var = (f0) obj;
        k00.c cVar = (k00.c) obj2;
        switch (this.A) {
            case 0:
                break;
        }
        return create(f0Var, cVar).invokeSuspend(g00.b0.a);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z10;
        int i10 = this.A;
        x0 x0Var = this.C;
        switch (i10) {
            case 0:
                l00.a aVar = l00.a.A;
                t1.O(obj);
                return f0.a((f0) this.B, null, x0Var.f16219d.a(), null, 5);
            default:
                l00.a aVar2 = l00.a.A;
                t1.O(obj);
                f0 f0Var = (f0) this.B;
                boolean zD = x0Var.d(f0Var);
                a0 a0Var = x0Var.f16221f;
                Map mapB = f0Var.f16152c;
                if (mapB != null) {
                    a0Var.getClass();
                    z10 = false;
                    if (!a0Var.f16113f) {
                        ArrayList<c0> arrayListA = r.a(a0Var.f16108a);
                        ArrayList arrayList = new ArrayList();
                        for (c0 c0Var : arrayListA) {
                            y yVar = (y) mapB.get(c0Var.f16127a);
                            g00.k kVar = yVar != null ? new g00.k(c0Var, yVar) : null;
                            if (kVar != null) {
                                arrayList.add(kVar);
                            }
                        }
                        if (arrayList.isEmpty()) {
                            z10 = true;
                        } else {
                            Iterator it = arrayList.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    g00.k kVar2 = (g00.k) it.next();
                                    c0 c0Var2 = (c0) kVar2.A;
                                    y yVar2 = (y) kVar2.B;
                                    String strA = a0Var.a();
                                    String str = c0Var2.f16127a;
                                    int i11 = c0Var2.f16128b;
                                    if (kotlin.jvm.internal.m.a(strA, str)) {
                                        if (i11 != yVar2.f16226a || !kotlin.jvm.internal.m.a((String) a0Var.f16111d.getValue(), yVar2.f16227b)) {
                                        }
                                    } else if (i11 != yVar2.f16226a) {
                                    }
                                } else {
                                    z10 = true;
                                }
                            }
                        }
                    }
                    if (z10) {
                        Log.d("FirebaseSessions", "Cold app start detected");
                    }
                } else {
                    Log.d("FirebaseSessions", "No process data map");
                    z10 = true;
                }
                boolean zC = x0Var.c(f0Var);
                if (z10) {
                    mapB = a0Var.b(h00.y.A);
                } else if (zC) {
                    mapB = a0Var.b(mapB);
                }
                j0 j0Var = z10 ? null : f0Var.f16150a;
                if (!zD && !z10) {
                    return zC ? f0.a(f0Var, null, null, a0Var.b(mapB), 3) : f0Var;
                }
                j0 j0VarA = x0Var.f16217b.a(j0Var);
                o0 o0Var = (o0) x0Var.f16218c;
                a40.c0.y(a40.c0.c(o0Var.f16200e), (k00.i) null, (a40.a0) null, new bt.x0(o0Var, j0VarA, (k00.c) null), 3);
                a0Var.f16113f = true;
                return new f0(j0VarA, null, mapB);
        }
    }
}

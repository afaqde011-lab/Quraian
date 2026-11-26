package l6;

import a1.o1;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.util.List;
import k9.b3;
import ri.t1;
import za.g0;
import za.h0;

public final class w {

    public static final b3 f10045a = new b3(13);

    public Object a(Context context, String str, m00.c cVar) {
        a0 a0Var;
        if (cVar instanceof a0) {
            a0Var = (a0) cVar;
            int i10 = a0Var.C;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                a0Var.C = i10 - Integer.MIN_VALUE;
            } else {
                a0Var = new a0(this, cVar);
            }
        } else {
            a0Var = new a0(this, cVar);
        }
        Object objQ = a0Var.A;
        l00.a aVar = l00.a.A;
        int i11 = a0Var.C;
        boolean z10 = true;
        if (i11 == 0) {
            t1.O(objQ);
            kotlin.jvm.internal.m.e(context, "context");
            ab.y yVarL0 = ab.y.l0(context);
            WorkDatabase workDatabase = yVarL0.f420c;
            jb.b bVar = yVarL0.f421d;
            kotlin.jvm.internal.m.e(workDatabase, "<this>");
            kotlin.jvm.internal.m.e(bVar, "executor");
            kotlin.jvm.internal.m.e(str, "name");
            hb.u uVar = new hb.u(str, 8);
            ca.z zVar = bVar.f8258a;
            kotlin.jvm.internal.m.d(zVar, "getSerialTaskExecutor(...)");
            d4.k kVarV = kh.o.v(zVar, "loadStatusFuture", new o1(uVar, workDatabase, 18));
            a0Var.C = 1;
            objQ = ab.a0.q(kVarV, a0Var);
            if (objQ == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(objQ);
        }
        List list = (List) objQ;
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            if (va.a.S(g0.B, g0.A).contains(((h0) list.get(i12)).f17371b)) {
                return Boolean.valueOf(z10);
            }
        }
        z10 = false;
        return Boolean.valueOf(z10);
    }
}

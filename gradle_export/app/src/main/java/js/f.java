package js;

import com.google.android.gms.internal.measurement.x5;
import g00.b0;
import g1.s1;
import java.util.ArrayList;
import kotlin.jvm.internal.m;
import ri.t1;

public final class f {
    public final ks.k a;

    public f(ks.k kVar) {
        this.a = kVar;
    }

    public final Object a(ArrayList arrayList, m00.c cVar) {
        boolean zIsEmpty = arrayList.isEmpty();
        b0 b0Var = b0.a;
        if (!zIsEmpty) {
            ks.k kVar = this.a;
            StringBuilder sbQ = x5.q("DELETE FROM listening_event_queue WHERE event_id IN (");
            ze.d.h(arrayList.size(), sbQ);
            sbQ.append(")");
            String string = sbQ.toString();
            m.d(string, "toString(...)");
            Object objN = rd.a.N(kVar.a, false, true, new ks.j(0, string, arrayList), cVar);
            l00.a aVar = l00.a.A;
            if (objN != aVar) {
                objN = b0Var;
            }
            if (objN == aVar) {
                return objN;
            }
        }
        return b0Var;
    }

    public final Object b(int i, int i2, m00.c cVar) {
        e eVar;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i3 = eVar.E;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                eVar.E = i3 - Integer.MIN_VALUE;
            } else {
                eVar = new e(this, cVar);
            }
        } else {
            eVar = new e(this, cVar);
        }
        Object obj = eVar.C;
        l00.a aVar = l00.a.A;
        int i4 = eVar.E;
        ks.k kVar = this.a;
        b0 b0Var = b0.a;
        if (i4 == 0) {
            t1.O(obj);
            eVar.A = i;
            eVar.B = i2;
            eVar.E = 1;
            Object objN = rd.a.N(kVar.a, false, true, new s1(i, 7), eVar);
            if (objN != aVar) {
                objN = b0Var;
            }
            if (objN != aVar) {
            }
        }
        if (i4 != 1) {
            if (i4 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(obj);
            return b0Var;
        }
        i2 = eVar.B;
        i = eVar.A;
        t1.O(obj);
        eVar.A = i;
        eVar.B = i2;
        eVar.E = 2;
        Object objN2 = rd.a.N(kVar.a, false, true, new s1(i2, 8), eVar);
        if (objN2 != aVar) {
            objN2 = b0Var;
        }
        return objN2 == aVar ? aVar : b0Var;
    }
}

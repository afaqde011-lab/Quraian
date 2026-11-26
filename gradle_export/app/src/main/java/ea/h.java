package ea;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import s10.w0;
import sd.p1;
import tf.a1;
import tf.h1;
import tf.q0;
import tf.y3;

public final class h extends u.s {

    public final int f5220g = 2;

    public final Object f5221h;

    public h(int i10, w0 w0Var) {
        super(i10);
        this.f5221h = w0Var;
    }

    public h(i iVar) {
        super(25);
        this.f5221h = iVar;
    }

    public h(a1 a1Var) {
        super(20);
        this.f5221h = a1Var;
    }

    @Override
    public Object a(Object obj) {
        LinkedHashMap linkedHashMap;
        switch (this.f5220g) {
            case 0:
                String str = (String) obj;
                kotlin.jvm.internal.m.e(str, "key");
                return ((i) this.f5221h).A.k0(str);
            case 1:
                String str2 = (String) obj;
                com.google.android.gms.common.internal.d0.e(str2);
                a1 a1Var = (a1) this.f5221h;
                a1Var.W0();
                com.google.android.gms.common.internal.d0.e(str2);
                tf.m mVar = a1Var.C.C;
                y3.R(mVar);
                p1 p1VarB2 = mVar.b2(str2);
                if (p1VarB2 == null) {
                    return null;
                }
                q0 q0Var = ((h1) a1Var.B).F;
                h1.g(q0Var);
                q0Var.O.c(str2, "Populate EES config from database on cache miss. appId");
                a1Var.d1(str2, a1Var.e1(str2, (byte[]) p1VarB2.B));
                h hVar = a1Var.K;
                synchronized (hVar.f14893c) {
                    Set setEntrySet = hVar.f14892b.A.entrySet();
                    kotlin.jvm.internal.m.d(setEntrySet, "<get-entries>(...)");
                    linkedHashMap = new LinkedHashMap(setEntrySet.size());
                    Set<Map.Entry> setEntrySet2 = hVar.f14892b.A.entrySet();
                    kotlin.jvm.internal.m.d(setEntrySet2, "<get-entries>(...)");
                    for (Map.Entry entry : setEntrySet2) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                return (com.google.android.gms.internal.measurement.e0) linkedHashMap.get(str2);
            default:
                return super.a(obj);
        }
    }

    @Override
    public void b(boolean z10, Object obj, Object obj2, Object obj3) throws Exception {
        switch (this.f5220g) {
            case 0:
                Object obj4 = (String) obj;
                ma.c cVar = (ma.c) obj2;
                kotlin.jvm.internal.m.e(obj4, "key");
                kotlin.jvm.internal.m.e(cVar, "oldValue");
                cVar.close();
                super.b(z10, obj4, cVar, (ma.c) obj3);
                break;
            case 1:
            default:
                super.b(z10, obj, obj2, obj3);
                break;
            case 2:
                ub.e eVar = (ub.e) obj2;
                ((ub.h) ((w0) this.f5221h).B).i((ub.b) obj, eVar.f15238a, eVar.f15239b, eVar.f15240c);
                break;
        }
    }

    @Override
    public int g(Object obj, Object obj2) {
        switch (this.f5220g) {
            case 2:
                return ((ub.e) obj2).f15240c;
            default:
                return super.g(obj, obj2);
        }
    }
}

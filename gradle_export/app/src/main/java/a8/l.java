package a8;

import android.graphics.RuntimeShader;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class l implements jk.j {
    public final LinkedHashMap A;

    public l(int i10) {
        switch (i10) {
            case 1:
                this.A = new LinkedHashMap();
                break;
            case 2:
                this.A = new LinkedHashMap();
                break;
            case 3:
                this.A = new LinkedHashMap();
                break;
            case 4:
                this.A = new LinkedHashMap();
                break;
            case 5:
                this.A = new LinkedHashMap(0, 0.75f, true);
                break;
            case 6:
                this.A = new LinkedHashMap();
                break;
            default:
                this.A = new LinkedHashMap();
                break;
        }
    }

    public l(wb.n nVar) {
        this.A = h00.d0.b0(nVar.A);
    }

    @Override
    public RuntimeShader a(String str, String str2) {
        LinkedHashMap linkedHashMap = this.A;
        Object runtimeShader = linkedHashMap.get(str);
        if (runtimeShader == null) {
            runtimeShader = new RuntimeShader(str2);
            linkedHashMap.put(str, runtimeShader);
        }
        return (RuntimeShader) runtimeShader;
    }

    public void b(k kVar) {
        long[] jArr = kVar.f286e;
        if (jArr.length > 0) {
            Long lValueOf = Long.valueOf(jArr[0]);
            LinkedHashMap linkedHashMap = this.A;
            if (linkedHashMap.containsKey(lValueOf)) {
                return;
            }
            linkedHashMap.put(Long.valueOf(kVar.f286e[0]), kVar);
        }
    }

    public ab.m c(hb.i iVar) {
        kotlin.jvm.internal.m.e(iVar, "id");
        return (ab.m) this.A.remove(iVar);
    }

    public List d(String str) {
        kotlin.jvm.internal.m.e(str, "workSpecId");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = this.A;
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            if (kotlin.jvm.internal.m.a(((hb.i) entry.getKey()).f6976a, str)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            linkedHashMap2.remove((hb.i) it.next());
        }
        return h00.q.n1(linkedHashMap.values());
    }

    public ab.m e(hb.i iVar) {
        LinkedHashMap linkedHashMap = this.A;
        Object mVar = linkedHashMap.get(iVar);
        if (mVar == null) {
            mVar = new ab.m(iVar);
            linkedHashMap.put(iVar, mVar);
        }
        return (ab.m) mVar;
    }
}

package c3;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class s1 implements ia.d {

    public final int f2758a;

    public final Object f2759b;

    public s1(Object obj, int i10) {
        this.f2758a = i10;
        this.f2759b = obj;
    }

    @Override
    public final Bundle a() {
        g00.k[] kVarArr;
        int i10 = this.f2758a;
        Object obj = this.f2759b;
        switch (i10) {
            case 0:
                Map mapB = ((y1.g) obj).b();
                Bundle bundle = new Bundle();
                for (Map.Entry entry : mapB.entrySet()) {
                    String str = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    bundle.putParcelableArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
                }
                return bundle;
            case 1:
                return d.n.a((d.n) obj);
            default:
                ce.c cVar = (ce.c) obj;
                for (Map.Entry entry2 : h00.d0.Z((LinkedHashMap) cVar.E).entrySet()) {
                    cVar.E(((d40.x0) entry2.getValue()).getValue(), (String) entry2.getKey());
                }
                for (Map.Entry entry3 : h00.d0.Z((LinkedHashMap) cVar.C).entrySet()) {
                    cVar.E(((ia.d) entry3.getValue()).a(), (String) entry3.getKey());
                }
                LinkedHashMap linkedHashMap = (LinkedHashMap) cVar.B;
                if (linkedHashMap.isEmpty()) {
                    kVarArr = new g00.k[0];
                } else {
                    ArrayList arrayList = new ArrayList(linkedHashMap.size());
                    for (Map.Entry entry4 : linkedHashMap.entrySet()) {
                        arrayList.add(new g00.k((String) entry4.getKey(), entry4.getValue()));
                    }
                    kVarArr = (g00.k[]) arrayList.toArray(new g00.k[0]);
                }
                return f50.c.n((g00.k[]) Arrays.copyOf(kVarArr, kVarArr.length));
        }
    }
}

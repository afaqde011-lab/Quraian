package bt;

import com.revenuecat.purchases.CustomerInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class g2 extends m00.i implements u00.o {
    public final int A;
    public Object B;
    public Object C;

    public g2(int i, k00.c cVar, int i2) {
        super(i, cVar);
        this.A = i2;
    }

    public g2(vp.x xVar, k00.c cVar) {
        super(3, cVar);
        this.A = 4;
        this.C = xVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.A) {
            case 0:
                g2 g2Var = new g2(3, (k00.c) obj3, 0);
                g2Var.B = (n2) obj;
                g2Var.C = (o2) obj2;
                return g2Var.invokeSuspend(g00.b0.a);
            case 1:
                g2 g2Var2 = new g2(3, (k00.c) obj3, 1);
                g2Var2.B = (g00.k) obj;
                g2Var2.C = (String) obj2;
                return g2Var2.invokeSuspend(g00.b0.a);
            case 2:
                g2 g2Var3 = new g2(3, (k00.c) obj3, 2);
                g2Var3.B = (u30.b) obj;
                g2Var3.C = (qr.q) obj2;
                return g2Var3.invokeSuspend(g00.b0.a);
            case 3:
                g2 g2Var4 = new g2(3, (k00.c) obj3, 3);
                g2Var4.B = (r5.e) obj;
                g2Var4.C = (t5.b) obj2;
                return g2Var4.invokeSuspend(g00.b0.a);
            default:
                ((Boolean) obj2).getClass();
                g2 g2Var5 = new g2((vp.x) this.C, (k00.c) obj3);
                g2Var5.B = (CustomerInfo) obj;
                return g2Var5.invokeSuspend(g00.b0.a);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        ys.c cVar;
        switch (this.A) {
            case 0:
                n2 n2Var = (n2) this.B;
                o2 o2Var = (o2) this.C;
                l00.a aVar = l00.a.A;
                ri.t1.O(obj);
                boolean z = n2Var != null && (cVar = n2Var.a) != null && cVar.b() == o2Var.a.b() && n2Var.c;
                boolean z2 = z && !o2Var.d;
                ys.c cVar2 = o2Var.a;
                boolean z3 = o2Var.c;
                return new n2(cVar2, (z3 || n2Var == null) ? o2Var.b : n2Var.b, z || o2Var.d, z2 && !z3);
            case 1:
                g00.k kVar = (g00.k) this.B;
                String str = (String) this.C;
                l00.a aVar2 = l00.a.A;
                ri.t1.O(obj);
                return new g00.q(kVar.A, kVar.B, str);
            case 2:
                u30.b bVar = (u30.b) this.B;
                qr.q qVar = (qr.q) this.C;
                l00.a aVar3 = l00.a.A;
                ri.t1.O(obj);
                return new g00.k(bVar, qVar);
            case 3:
                l00.a aVar4 = l00.a.A;
                ri.t1.O(obj);
                r5.e eVar = (r5.e) this.B;
                t5.b bVar2 = (t5.b) this.C;
                Set setKeySet = bVar2.a().keySet();
                ArrayList arrayList = new ArrayList(h00.r.q0(setKeySet, 10));
                Iterator it = setKeySet.iterator();
                while (it.hasNext()) {
                    arrayList.add(((t5.d) it.next()).a);
                }
                Map<String, ?> all = eVar.a.getAll();
                kotlin.jvm.internal.m.d(all, "prefs.all");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, ?> entry : all.entrySet()) {
                    String key = entry.getKey();
                    Set set = eVar.b;
                    if (set != null ? set.contains(key) : true) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(h00.d0.P(linkedHashMap.size()));
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    Object key2 = entry2.getKey();
                    Object value = entry2.getValue();
                    if (value instanceof Set) {
                        value = h00.q.r1((Iterable) value);
                    }
                    linkedHashMap2.put(key2, value);
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                    if (!arrayList.contains((String) entry3.getKey())) {
                        linkedHashMap3.put(entry3.getKey(), entry3.getValue());
                    }
                }
                t5.b bVarG = bVar2.g();
                for (Map.Entry entry4 : linkedHashMap3.entrySet()) {
                    String name = (String) entry4.getKey();
                    Object value2 = entry4.getValue();
                    if (value2 instanceof Boolean) {
                        kotlin.jvm.internal.m.e(name, "name");
                        bVarG.f(new t5.d(name), value2);
                    } else if (value2 instanceof Float) {
                        kotlin.jvm.internal.m.e(name, "name");
                        bVarG.f(new t5.d(name), value2);
                    } else if (value2 instanceof Integer) {
                        kotlin.jvm.internal.m.e(name, "name");
                        bVarG.f(new t5.d(name), value2);
                    } else if (value2 instanceof Long) {
                        bVarG.f(va.a.U(name), value2);
                    } else if (value2 instanceof String) {
                        kotlin.jvm.internal.m.e(name, "name");
                        bVarG.f(new t5.d(name), value2);
                    } else if (value2 instanceof Set) {
                        bVarG.f(va.a.i0(name), (Set) value2);
                    }
                }
                return bVarG.h();
            default:
                CustomerInfo customerInfo = (CustomerInfo) this.B;
                l00.a aVar5 = l00.a.A;
                ri.t1.O(obj);
                return Boolean.valueOf(vp.x.l(customerInfo));
        }
    }
}

package v2;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import m10.l0;
import s10.w0;

public final class b0 implements u00.k {
    public final int A;
    public Object B;

    public b0() {
        this.A = 0;
    }

    public b0(Object obj, int i10) {
        this.A = i10;
        this.B = obj;
    }

    public final Object invoke(Object obj) {
        Object next;
        int i10 = this.A;
        g00.b0 b0Var = g00.b0.a;
        switch (i10) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                y yVar = (y) this.B;
                if (yVar != null) {
                    yVar.C = zBooleanValue;
                }
                return b0Var;
            case 1:
                l0 l0Var = (l0) this.B;
                kotlin.jvm.internal.m.e((j10.c) obj, "it");
                return Boolean.valueOf(x10.e0.i.containsKey(c7.i.v(l0Var)));
            case 2:
                g00.g gVar = (g00.g) this.B;
                n20.c cVar = (n20.c) obj;
                kotlin.jvm.internal.m.e(cVar, "it");
                n20.c cVar2 = x10.q.a;
                x10.y.y.getClass();
                w0 w0Var = x10.x.b;
                kotlin.jvm.internal.m.e(w0Var, "configuredReportLevels");
                x10.z zVar = (x10.z) ((d30.j) w0Var.C).invoke(cVar);
                if (zVar != null) {
                    return zVar;
                }
                w0 w0Var2 = x10.q.c;
                w0Var2.getClass();
                x10.r rVar = (x10.r) ((d30.j) w0Var2.C).invoke(cVar);
                if (rVar == null) {
                    return x10.z.B;
                }
                g00.g gVar2 = rVar.b;
                return (gVar2 == null || gVar2.D - gVar.D > 0) ? rVar.a : rVar.c;
            case 3:
                w0 w0Var3 = (w0) this.B;
                n20.c cVar3 = (n20.c) obj;
                kotlin.jvm.internal.m.b(cVar3);
                ?? r7 = w0Var3.B;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator it = r7.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        if (linkedHashMap.isEmpty()) {
                            linkedHashMap = null;
                        }
                        if (linkedHashMap == null) {
                            return null;
                        }
                        Iterator it2 = linkedHashMap.entrySet().iterator();
                        if (it2.hasNext()) {
                            next = it2.next();
                            if (it2.hasNext()) {
                                int length = p30.f.s0((n20.c) ((Map.Entry) next).getKey(), cVar3).a.a.length();
                                do {
                                    Object next2 = it2.next();
                                    int length2 = p30.f.s0((n20.c) ((Map.Entry) next2).getKey(), cVar3).a.a.length();
                                    if (length > length2) {
                                        next = next2;
                                        length = length2;
                                    }
                                } while (it2.hasNext());
                            }
                        } else {
                            next = null;
                        }
                        Map.Entry entry = (Map.Entry) next;
                        if (entry != null) {
                            return entry.getValue();
                        }
                        return null;
                    }
                    Map.Entry entry2 = (Map.Entry) it.next();
                    n20.c cVar4 = (n20.c) entry2.getKey();
                    if (!cVar3.equals(cVar4)) {
                        kotlin.jvm.internal.m.e(cVar4, "packageName");
                        if (kotlin.jvm.internal.m.a(cVar3.a.c() ? null : cVar3.b(), cVar4)) {
                        }
                    }
                    linkedHashMap.put(entry2.getKey(), entry2.getValue());
                }
                break;
            default:
                j10.c cVar5 = (j10.c) obj;
                if (cVar5 == null) {
                    throw new IllegalArgumentException("Argument for @NotNull parameter 'descriptor' of kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1$1.invoke must not be null");
                }
                ((y10.a) this.B).c.a(cVar5);
                return b0Var;
        }
    }
}

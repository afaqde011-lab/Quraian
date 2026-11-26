package r40;

import h00.d0;
import h00.j0;
import h00.z;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.b0;
import l1.q1;
import p40.o0;

public class n extends a {
    public final q40.x f;
    public final n40.e g;
    public int h;
    public boolean i;

    public n(q40.c cVar, q40.x xVar, String str, int i) {
        this(cVar, xVar, (i & 4) != 0 ? null : str, (n40.e) null);
    }

    public n(q40.c json, q40.x value, String str, n40.e eVar) {
        super(json, str);
        kotlin.jvm.internal.m.e(json, "json");
        kotlin.jvm.internal.m.e(value, "value");
        this.f = value;
        this.g = eVar;
    }

    @Override
    public q40.l F(String tag) {
        kotlin.jvm.internal.m.e(tag, "tag");
        return (q40.l) d0.O(T(), tag);
    }

    @Override
    public String R(n40.e descriptor, int i) {
        Object next;
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        q40.c cVar = this.c;
        j.n(descriptor, cVar);
        String strF = descriptor.f(i);
        if (this.e.d && !T().A.keySet().contains(strF)) {
            kotlin.jvm.internal.m.e(cVar, "<this>");
            o10.b bVar = cVar.c;
            l6.c cVar2 = new l6.c(descriptor, cVar, 17);
            bVar.getClass();
            k kVar = j.a;
            Object objP = bVar.p(descriptor, kVar);
            if (objP == null) {
                objP = cVar2.invoke();
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) bVar.B;
                Object concurrentHashMap2 = concurrentHashMap.get(descriptor);
                if (concurrentHashMap2 == null) {
                    concurrentHashMap2 = new ConcurrentHashMap(2);
                    concurrentHashMap.put(descriptor, concurrentHashMap2);
                }
                ((Map) concurrentHashMap2).put(kVar, objP);
            }
            Map map = (Map) objP;
            Iterator it = T().A.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                Integer num = (Integer) map.get((String) next);
                if (num != null && num.intValue() == i) {
                    break;
                }
            }
            String str = (String) next;
            if (str != null) {
                return str;
            }
        }
        return strF;
    }

    @Override
    public q40.x T() {
        return this.f;
    }

    @Override
    public void a(n40.e descriptor) {
        Set setQ0;
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        q1 q1Var = this.e;
        if (q1Var.b || (descriptor.getKind() instanceof n40.b)) {
            return;
        }
        q40.c cVar = this.c;
        j.n(descriptor, cVar);
        if (q1Var.d) {
            Set setB = o0.b(descriptor);
            kotlin.jvm.internal.m.e(cVar, "<this>");
            Map map = (Map) cVar.c.p(descriptor, j.a);
            Set setKeySet = map != null ? map.keySet() : null;
            if (setKeySet == null) {
                setKeySet = z.A;
            }
            setQ0 = j0.q0(setB, setKeySet);
        } else {
            setQ0 = o0.b(descriptor);
        }
        for (String key : T().A.keySet()) {
            if (!setQ0.contains(key) && !kotlin.jvm.internal.m.a(key, this.d)) {
                String input = T().toString();
                kotlin.jvm.internal.m.e(key, "key");
                kotlin.jvm.internal.m.e(input, "input");
                StringBuilder sbN = g4.c.n("Encountered an unknown key '", key, "'.\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.\nCurrent input: ");
                sbN.append((Object) j.m(input, -1));
                throw j.c(-1, sbN.toString());
            }
        }
    }

    @Override
    public final o40.a c(n40.e descriptor) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        n40.e eVar = this.g;
        if (descriptor != eVar) {
            return super.c(descriptor);
        }
        q40.l lVarG = G();
        String strA = eVar.a();
        if (lVarG instanceof q40.x) {
            String str = this.d;
            return new n(this.c, (q40.x) lVarG, str, eVar);
        }
        StringBuilder sb = new StringBuilder("Expected ");
        b0 b0Var = a0.a;
        sb.append(b0Var.b(q40.x.class).n());
        sb.append(", but had ");
        sb.append(b0Var.b(lVarG.getClass()).n());
        sb.append(" as the serialized body of ");
        sb.append(strA);
        sb.append(" at element: ");
        sb.append(V());
        throw j.d(sb.toString(), lVarG.toString(), -1);
    }

    @Override
    public int l(n40.e descriptor) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        while (this.h < descriptor.e()) {
            int i = this.h;
            this.h = i + 1;
            String strS = S(descriptor, i);
            int i2 = this.h - 1;
            this.i = false;
            if (!T().containsKey(strS)) {
                boolean z = (this.c.a.c || descriptor.i(i2) || !descriptor.h(i2).c()) ? false : true;
                this.i = z;
                if (z) {
                }
            }
            this.e.getClass();
            return i2;
        }
        return -1;
    }

    @Override
    public final boolean w() {
        return !this.i && super.w();
    }
}

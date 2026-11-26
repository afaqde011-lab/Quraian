package n40;

import g00.k;
import g00.p;
import g1.l0;
import h00.a0;
import h00.b0;
import h00.d0;
import h00.q;
import h00.r;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.m;
import p40.o0;

public final class f implements e, p40.j {
    public final String a;
    public final va.a b;
    public final int c;
    public final List d;
    public final HashSet e;
    public final String[] f;
    public final e[] g;
    public final List[] h;
    public final boolean[] i;
    public final Map j;
    public final e[] k;
    public final p l;

    public f(String serialName, va.a aVar, int i, List list, a aVar2) {
        m.e(serialName, "serialName");
        this.a = serialName;
        this.b = aVar;
        this.c = i;
        this.d = aVar2.b;
        ArrayList arrayList = aVar2.c;
        m.e(arrayList, "<this>");
        HashSet hashSet = new HashSet(d0.P(r.q0(arrayList, 12)));
        q.l1(arrayList, hashSet);
        this.e = hashSet;
        int i2 = 0;
        this.f = (String[]) arrayList.toArray(new String[0]);
        this.g = o0.c(aVar2.e);
        this.h = (List[]) aVar2.f.toArray(new List[0]);
        ArrayList arrayList2 = aVar2.g;
        m.e(arrayList2, "<this>");
        boolean[] zArr = new boolean[arrayList2.size()];
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            zArr[i2] = ((Boolean) it.next()).booleanValue();
            i2++;
        }
        this.i = zArr;
        String[] strArr = this.f;
        m.e(strArr, "<this>");
        h00.p pVar = new h00.p(new l0(strArr, 6), 1);
        ArrayList arrayList3 = new ArrayList(r.q0(pVar, 10));
        Iterator it2 = pVar.iterator();
        while (true) {
            b0 b0Var = (b0) it2;
            if (!b0Var.B.hasNext()) {
                this.j = d0.Y(arrayList3);
                this.k = o0.c(list);
                this.l = rd.a.J(new l0(this, 21));
                return;
            }
            a0 a0Var = (a0) b0Var.next();
            arrayList3.add(new k(a0Var.b, Integer.valueOf(a0Var.a)));
        }
    }

    @Override
    public final String a() {
        return this.a;
    }

    @Override
    public final Set b() {
        return this.e;
    }

    @Override
    public final boolean c() {
        return false;
    }

    @Override
    public final int d(String name) {
        m.e(name, "name");
        Integer num = (Integer) this.j.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override
    public final int e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            e eVar = (e) obj;
            if (m.a(this.a, eVar.a()) && Arrays.equals(this.k, ((f) obj).k)) {
                int iE = eVar.e();
                int i = this.c;
                if (i == iE) {
                    for (int i2 = 0; i2 < i; i2++) {
                        e[] eVarArr = this.g;
                        if (m.a(eVarArr[i2].a(), eVar.h(i2).a()) && m.a(eVarArr[i2].getKind(), eVar.h(i2).getKind())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final String f(int i) {
        return this.f[i];
    }

    @Override
    public final List g(int i) {
        return this.h[i];
    }

    @Override
    public final List getAnnotations() {
        return this.d;
    }

    @Override
    public final va.a getKind() {
        return this.b;
    }

    @Override
    public final e h(int i) {
        return this.g[i];
    }

    public final int hashCode() {
        return ((Number) this.l.getValue()).intValue();
    }

    @Override
    public final boolean i(int i) {
        return this.i[i];
    }

    @Override
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return q.R0(ab.a0.I0(0, this.c), ", ", g4.c.k(new StringBuilder(), this.a, '('), ")", new h00.a(this, 22), 24);
    }
}

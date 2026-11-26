package w30;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public final class c extends h00.g implements u30.f {
    public static final c C = new c(k.e, 0);
    public final k A;
    public final int B;

    public c(k node, int i) {
        kotlin.jvm.internal.m.e(node, "node");
        this.A = node;
        this.B = i;
    }

    @Override
    public final Set a() {
        return new i(this, 0);
    }

    @Override
    public final Set c() {
        return new i(this, 1);
    }

    @Override
    public final boolean containsKey(Object obj) {
        return this.A.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override
    public final int e() {
        return this.B;
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (e() != map.size()) {
            return false;
        }
        boolean z = map instanceof x30.c;
        k kVar = this.A;
        if (z) {
            return kVar.g(((x30.c) obj).C.A, b.B);
        }
        if (map instanceof x30.d) {
            return kVar.g(((x30.d) obj).D.C, b.C);
        }
        if (map instanceof c) {
            return kVar.g(((c) obj).A, b.D);
        }
        return map instanceof d ? kVar.g(((d) obj).C, b.E) : super.equals(obj);
    }

    @Override
    public final Collection g() {
        return new r30.g(this, 2);
    }

    @Override
    public final Object get(Object obj) {
        return this.A.h(obj != null ? obj.hashCode() : 0, 0, obj);
    }
}

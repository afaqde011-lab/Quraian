package v1;

import l1.p1;
import l1.s2;

public final class g extends s1.e {
    public h G;

    @Override
    public final boolean containsKey(Object obj) {
        if (obj instanceof p1) {
            return super.containsKey((p1) obj);
        }
        return false;
    }

    @Override
    public final boolean containsValue(Object obj) {
        if (obj instanceof s2) {
            return super/*java.util.AbstractMap*/.containsValue((s2) obj);
        }
        return false;
    }

    @Override
    public final Object get(Object obj) {
        if (obj instanceof p1) {
            return (s2) super.get((p1) obj);
        }
        return null;
    }

    @Override
    public final Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof p1) ? obj2 : (s2) super/*java.util.AbstractMap*/.getOrDefault((p1) obj, (s2) obj2);
    }

    @Override
    public final h build() {
        s1.k kVar = this.C;
        h hVar = this.G;
        if (kVar != hVar.A) {
            this.B = new u1.b();
            hVar = new h(this.C, e());
        }
        this.G = hVar;
        return hVar;
    }

    @Override
    public final Object remove(Object obj) {
        if (obj instanceof p1) {
            return (s2) super.remove((p1) obj);
        }
        return null;
    }
}

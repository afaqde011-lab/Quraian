package k00;

import kotlin.jvm.internal.m;
import u00.n;

public abstract class a implements g {
    public final h A;

    public a(h key) {
        m.e(key, "key");
        this.A = key;
    }

    @Override
    public final Object fold(Object obj, n nVar) {
        return nVar.invoke(obj, this);
    }

    @Override
    public g get(h hVar) {
        return rd.a.C(this, hVar);
    }

    @Override
    public final h getKey() {
        return this.A;
    }

    @Override
    public i minusKey(h hVar) {
        return rd.a.K(this, hVar);
    }

    @Override
    public final i plus(i iVar) {
        return rd.a.P(this, iVar);
    }
}

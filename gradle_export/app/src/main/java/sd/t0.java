package sd;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class t0 extends v0 implements u0, s0 {

    public List f14085i = new ArrayList();

    public HashSet f14086j = null;

    public String f14087k = null;
    public HashSet l = null;
    public HashSet m = null;

    @Override
    public final List a() {
        return this.f14085i;
    }

    @Override
    public final Set b() {
        return null;
    }

    @Override
    public final String c() {
        return this.f14087k;
    }

    @Override
    public final void e(HashSet hashSet) {
        this.f14086j = hashSet;
    }

    @Override
    public final Set f() {
        return this.f14086j;
    }

    @Override
    public final void g(HashSet hashSet) {
        this.m = hashSet;
    }

    @Override
    public final void h(String str) {
        this.f14087k = str;
    }

    @Override
    public final void i(HashSet hashSet) {
        this.l = hashSet;
    }

    @Override
    public final void j(HashSet hashSet) {
    }

    @Override
    public final Set l() {
        return this.l;
    }

    public void m(y0 y0Var) {
        this.f14085i.add(y0Var);
    }

    @Override
    public final Set n() {
        return this.m;
    }
}

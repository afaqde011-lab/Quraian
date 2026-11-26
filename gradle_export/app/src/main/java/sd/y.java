package sd;

import android.graphics.Matrix;
import java.util.HashSet;
import java.util.Set;

public abstract class y extends v0 implements a0, s0 {

    public HashSet f14125i = null;

    public String f14126j = null;

    public HashSet f14127k = null;
    public HashSet l = null;
    public HashSet m = null;

    public Matrix f14128n;

    @Override
    public final Set b() {
        return this.f14127k;
    }

    @Override
    public final String c() {
        return this.f14126j;
    }

    @Override
    public final void e(HashSet hashSet) {
        this.f14125i = hashSet;
    }

    @Override
    public final Set f() {
        return this.f14125i;
    }

    @Override
    public final void g(HashSet hashSet) {
        this.m = hashSet;
    }

    @Override
    public final void h(String str) {
        this.f14126j = str;
    }

    @Override
    public final void i(HashSet hashSet) {
        this.l = hashSet;
    }

    @Override
    public final void j(HashSet hashSet) {
        this.f14127k = hashSet;
    }

    @Override
    public final void k(Matrix matrix) {
        this.f14128n = matrix;
    }

    @Override
    public final Set l() {
        return this.l;
    }

    @Override
    public final Set n() {
        return this.m;
    }
}

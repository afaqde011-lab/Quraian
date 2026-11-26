package o9;

import android.os.Bundle;
import java.util.ArrayList;

public final class q0 extends p implements o0 {

    public final String f11848f;

    public final s f11849g;

    public String f11850h;

    public String f11851i;

    public boolean f11852j;
    public int l;
    public n0 m;

    public final s0 f11855o;

    public int f11853k = -1;

    public int f11854n = -1;

    public q0(s0 s0Var, String str, s sVar) {
        this.f11855o = s0Var;
        this.f11848f = str;
        this.f11849g = sVar;
    }

    @Override
    public final int a() {
        return this.f11854n;
    }

    @Override
    public final void b(n0 n0Var) {
        p0 p0Var = new p0(this);
        this.m = n0Var;
        int i10 = n0Var.f11832e;
        n0Var.f11832e = i10 + 1;
        int i11 = n0Var.f11831d;
        n0Var.f11831d = i11 + 1;
        Bundle bundle = new Bundle();
        bundle.putString("memberRouteId", this.f11848f);
        bundle.putParcelable("routeControllerOptions", this.f11849g.f11866a);
        n0Var.b(11, i11, i10, null, bundle);
        n0Var.f11835h.put(i11, p0Var);
        this.f11854n = i10;
        if (this.f11852j) {
            n0Var.a(i10);
            int i12 = this.f11853k;
            if (i12 >= 0) {
                n0Var.c(this.f11854n, i12);
                this.f11853k = -1;
            }
            int i13 = this.l;
            if (i13 != 0) {
                n0Var.d(this.f11854n, i13);
                this.l = 0;
            }
        }
    }

    @Override
    public final void c() {
        n0 n0Var = this.m;
        if (n0Var != null) {
            int i10 = this.f11854n;
            int i11 = n0Var.f11831d;
            n0Var.f11831d = i11 + 1;
            n0Var.b(4, i11, i10, null, null);
            this.m = null;
            this.f11854n = 0;
        }
    }

    @Override
    public final void d() {
        s0 s0Var = this.f11855o;
        s0Var.K.remove(this);
        c();
        s0Var.l();
    }

    @Override
    public final void e() {
        this.f11852j = true;
        n0 n0Var = this.m;
        if (n0Var != null) {
            n0Var.a(this.f11854n);
        }
    }

    @Override
    public final void f(int i10) {
        n0 n0Var = this.m;
        if (n0Var != null) {
            n0Var.c(this.f11854n, i10);
        } else {
            this.f11853k = i10;
            this.l = 0;
        }
    }

    @Override
    public final void g() {
        h(0);
    }

    @Override
    public final void h(int i10) {
        this.f11852j = false;
        n0 n0Var = this.m;
        if (n0Var != null) {
            int i11 = this.f11854n;
            Bundle bundle = new Bundle();
            bundle.putInt("unselectReason", i10);
            int i12 = n0Var.f11831d;
            n0Var.f11831d = i12 + 1;
            n0Var.b(6, i12, i11, null, bundle);
        }
    }

    @Override
    public final void i(int i10) {
        n0 n0Var = this.m;
        if (n0Var != null) {
            n0Var.d(this.f11854n, i10);
        } else {
            this.l += i10;
        }
    }

    @Override
    public final String j() {
        return this.f11850h;
    }

    @Override
    public final String k() {
        return this.f11851i;
    }

    @Override
    public final void m(String str) {
        n0 n0Var = this.m;
        if (n0Var != null) {
            int i10 = this.f11854n;
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i11 = n0Var.f11831d;
            n0Var.f11831d = i11 + 1;
            n0Var.b(12, i11, i10, null, bundle);
        }
    }

    @Override
    public final void n(String str) {
        n0 n0Var = this.m;
        if (n0Var != null) {
            int i10 = this.f11854n;
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i11 = n0Var.f11831d;
            n0Var.f11831d = i11 + 1;
            n0Var.b(13, i11, i10, null, bundle);
        }
    }

    @Override
    public final void o(ArrayList arrayList) {
        n0 n0Var = this.m;
        if (n0Var != null) {
            int i10 = this.f11854n;
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("memberRouteIds", new ArrayList<>(arrayList));
            int i11 = n0Var.f11831d;
            n0Var.f11831d = i11 + 1;
            n0Var.b(14, i11, i10, null, bundle);
        }
    }
}

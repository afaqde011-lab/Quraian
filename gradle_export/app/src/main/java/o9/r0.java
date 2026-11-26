package o9;

import android.os.Bundle;

public final class r0 extends r implements o0 {

    public final String f11856a;

    public final String f11857b;

    public final s f11858c;

    public boolean f11859d;

    public int f11860e = -1;

    public int f11861f;

    public n0 f11862g;

    public int f11863h;

    public final s0 f11864i;

    public r0(s0 s0Var, String str, String str2, s sVar) {
        this.f11864i = s0Var;
        this.f11856a = str;
        this.f11857b = str2;
        this.f11858c = sVar;
    }

    @Override
    public final int a() {
        return this.f11863h;
    }

    @Override
    public final void b(n0 n0Var) {
        this.f11862g = n0Var;
        int i10 = n0Var.f11832e;
        n0Var.f11832e = i10 + 1;
        Bundle bundle = new Bundle();
        bundle.putString("routeId", this.f11856a);
        bundle.putString("routeGroupId", this.f11857b);
        bundle.putParcelable("routeControllerOptions", this.f11858c.f11866a);
        int i11 = n0Var.f11831d;
        n0Var.f11831d = i11 + 1;
        n0Var.b(3, i11, i10, null, bundle);
        this.f11863h = i10;
        if (this.f11859d) {
            n0Var.a(i10);
            int i12 = this.f11860e;
            if (i12 >= 0) {
                n0Var.c(this.f11863h, i12);
                this.f11860e = -1;
            }
            int i13 = this.f11861f;
            if (i13 != 0) {
                n0Var.d(this.f11863h, i13);
                this.f11861f = 0;
            }
        }
    }

    @Override
    public final void c() {
        n0 n0Var = this.f11862g;
        if (n0Var != null) {
            int i10 = this.f11863h;
            int i11 = n0Var.f11831d;
            n0Var.f11831d = i11 + 1;
            n0Var.b(4, i11, i10, null, null);
            this.f11862g = null;
            this.f11863h = 0;
        }
    }

    @Override
    public final void d() {
        s0 s0Var = this.f11864i;
        s0Var.K.remove(this);
        c();
        s0Var.l();
    }

    @Override
    public final void e() {
        this.f11859d = true;
        n0 n0Var = this.f11862g;
        if (n0Var != null) {
            n0Var.a(this.f11863h);
        }
    }

    @Override
    public final void f(int i10) {
        n0 n0Var = this.f11862g;
        if (n0Var != null) {
            n0Var.c(this.f11863h, i10);
        } else {
            this.f11860e = i10;
            this.f11861f = 0;
        }
    }

    @Override
    public final void g() {
        h(0);
    }

    @Override
    public final void h(int i10) {
        this.f11859d = false;
        n0 n0Var = this.f11862g;
        if (n0Var != null) {
            int i11 = this.f11863h;
            Bundle bundle = new Bundle();
            bundle.putInt("unselectReason", i10);
            int i12 = n0Var.f11831d;
            n0Var.f11831d = i12 + 1;
            n0Var.b(6, i12, i11, null, bundle);
        }
    }

    @Override
    public final void i(int i10) {
        n0 n0Var = this.f11862g;
        if (n0Var != null) {
            n0Var.d(this.f11863h, i10);
        } else {
            this.f11861f += i10;
        }
    }
}

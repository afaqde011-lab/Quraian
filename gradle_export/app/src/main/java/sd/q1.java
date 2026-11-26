package sd;

import java.util.ArrayList;

public final class q1 implements j0 {

    public final ArrayList f14061a;

    public float f14062b;

    public float f14063c;

    public r1 f14064d;

    public boolean f14065e;

    public boolean f14066f;

    public int f14067g;

    public boolean f14068h;

    public q1(y1 y1Var, com.google.android.gms.internal.play_billing.q1 q1Var) {
        ArrayList arrayList = new ArrayList();
        this.f14061a = arrayList;
        this.f14064d = null;
        this.f14065e = false;
        this.f14066f = true;
        this.f14067g = -1;
        if (q1Var == null) {
            return;
        }
        q1Var.z(this);
        if (this.f14068h) {
            this.f14064d.b((r1) arrayList.get(this.f14067g));
            arrayList.set(this.f14067g, this.f14064d);
            this.f14068h = false;
        }
        r1 r1Var = this.f14064d;
        if (r1Var != null) {
            arrayList.add(r1Var);
        }
    }

    @Override
    public final void a(float f3, float f10, float f11, float f12) {
        this.f14064d.a(f3, f10);
        this.f14061a.add(this.f14064d);
        this.f14064d = new r1(f11, f12, f11 - f3, f12 - f10);
        this.f14068h = false;
    }

    @Override
    public final void b(float f3, float f10) {
        boolean z10 = this.f14068h;
        ArrayList arrayList = this.f14061a;
        if (z10) {
            this.f14064d.b((r1) arrayList.get(this.f14067g));
            arrayList.set(this.f14067g, this.f14064d);
            this.f14068h = false;
        }
        r1 r1Var = this.f14064d;
        if (r1Var != null) {
            arrayList.add(r1Var);
        }
        this.f14062b = f3;
        this.f14063c = f10;
        this.f14064d = new r1(f3, f10, 0.0f, 0.0f);
        this.f14067g = arrayList.size();
    }

    @Override
    public final void c(float f3, float f10, float f11, float f12, float f13, float f14) {
        if (this.f14066f || this.f14065e) {
            this.f14064d.a(f3, f10);
            this.f14061a.add(this.f14064d);
            this.f14065e = false;
        }
        this.f14064d = new r1(f13, f14, f13 - f11, f14 - f12);
        this.f14068h = false;
    }

    @Override
    public final void close() {
        this.f14061a.add(this.f14064d);
        e(this.f14062b, this.f14063c);
        this.f14068h = true;
    }

    @Override
    public final void d(float f3, float f10, float f11, boolean z10, boolean z11, float f12, float f13) {
        this.f14065e = true;
        this.f14066f = false;
        r1 r1Var = this.f14064d;
        y1.h(r1Var.f14076a, r1Var.f14077b, f3, f10, f11, z10, z11, f12, f13, this);
        this.f14066f = true;
        this.f14068h = false;
    }

    @Override
    public final void e(float f3, float f10) {
        this.f14064d.a(f3, f10);
        this.f14061a.add(this.f14064d);
        r1 r1Var = this.f14064d;
        this.f14064d = new r1(f3, f10, f3 - r1Var.f14076a, f10 - r1Var.f14077b);
        this.f14068h = false;
    }
}

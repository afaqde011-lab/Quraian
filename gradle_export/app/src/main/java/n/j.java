package n;

import com.google.android.gms.internal.measurement.g4;
import p.s2;
import z4.o0;

public final class j extends g4 {

    public final int f10988i;

    public boolean f10989j;

    public int f10990k;
    public final Object l;

    public j(k kVar) {
        this.f10988i = 0;
        this.l = kVar;
        this.f10989j = false;
        this.f10990k = 0;
    }

    public j(s2 s2Var, int i10) {
        this.f10988i = 1;
        this.l = s2Var;
        this.f10990k = i10;
        this.f10989j = false;
    }

    @Override
    public void a() {
        switch (this.f10988i) {
            case 1:
                this.f10989j = true;
                break;
        }
    }

    @Override
    public final void b() {
        switch (this.f10988i) {
            case 0:
                if (!this.f10989j) {
                    this.f10989j = true;
                    o0 o0Var = ((k) this.l).f10994d;
                    if (o0Var != null) {
                        o0Var.b();
                    }
                    break;
                }
                break;
            default:
                ((s2) this.l).f12208a.setVisibility(0);
                break;
        }
    }

    @Override
    public final void c() {
        switch (this.f10988i) {
            case 0:
                int i10 = this.f10990k + 1;
                this.f10990k = i10;
                k kVar = (k) this.l;
                if (i10 == kVar.f10991a.size()) {
                    o0 o0Var = kVar.f10994d;
                    if (o0Var != null) {
                        o0Var.c();
                    }
                    this.f10990k = 0;
                    this.f10989j = false;
                    kVar.f10995e = false;
                }
                break;
            default:
                if (!this.f10989j) {
                    ((s2) this.l).f12208a.setVisibility(this.f10990k);
                }
                break;
        }
    }
}

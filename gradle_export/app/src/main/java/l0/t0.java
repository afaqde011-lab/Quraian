package l0;

import java.util.ArrayList;

public final class t0 {

    public final int f9795a;

    public final ArrayList f9796b = new ArrayList();

    public final v0 f9797c;

    public t0(v0 v0Var, int i10) {
        this.f9797c = v0Var;
        this.f9795a = i10;
    }

    public final void a(int i10) {
        v0 v0Var = this.f9797c;
        c7.c cVar = v0Var.f9800c;
        if (cVar == null) {
            return;
        }
        this.f9796b.add(new j1(cVar, i10, v0Var.f9799b, null));
    }
}

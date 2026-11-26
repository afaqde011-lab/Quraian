package k9;

import java.util.List;

public final class w2 implements l3, m3, e7.h {
    public final p3 A;
    public final int B;
    public final int C;

    public w2(p3 p3Var, int i10, int i11) {
        this.A = p3Var;
        this.B = i10;
        this.C = i11;
    }

    @Override
    public void accept(Object obj) {
        p3 p3Var = this.A;
        ((s1) p3Var.f9383e.get()).getClass();
        o3 o3Var = p3Var.f9388j;
        if (o3Var != null) {
            o3Var.setFixedSize(this.B, this.C);
        }
    }

    @Override
    public void b(v3 v3Var, a2 a2Var, List list) {
        p3 p3Var = this.A;
        v3Var.replaceMediaItems(p3Var.i2(a2Var, v3Var, this.B), p3Var.i2(a2Var, v3Var, this.C), list);
    }

    @Override
    public void f(v3 v3Var, a2 a2Var) {
        p3 p3Var = this.A;
        v3Var.removeMediaItems(p3Var.i2(a2Var, v3Var, this.B), p3Var.i2(a2Var, v3Var, this.C));
    }
}

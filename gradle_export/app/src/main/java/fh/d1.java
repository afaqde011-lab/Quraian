package fh;

import java.util.Objects;

public final class d1 extends m0 {
    @Override
    public final n0 a(Object obj) {
        obj.getClass();
        c(obj);
        return this;
    }

    public final e1 g() {
        int i10 = this.f5676b;
        if (i10 == 0) {
            int i11 = e1.C;
            return k2.J;
        }
        if (i10 != 1) {
            e1 e1VarM = e1.m(i10, this.f5675a);
            this.f5676b = e1VarM.size();
            this.f5677c = true;
            return e1VarM;
        }
        Object obj = this.f5675a[0];
        Objects.requireNonNull(obj);
        int i12 = e1.C;
        return new q2(obj);
    }
}

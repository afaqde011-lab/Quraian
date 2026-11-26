package p40;

import java.util.Arrays;

public final class a0 extends q0 {
    public final boolean l;

    public a0(String str, z zVar) {
        super(str, zVar, 1);
        this.l = true;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a0) {
            n40.e eVar = (n40.e) obj;
            if (this.a.equals(eVar.a())) {
                a0 a0Var = (a0) obj;
                if (a0Var.l && Arrays.equals((n40.e[]) this.j.getValue(), (n40.e[]) a0Var.j.getValue())) {
                    int iE = eVar.e();
                    int i = this.c;
                    if (i == iE) {
                        for (int i2 = 0; i2 < i; i2++) {
                            if (kotlin.jvm.internal.m.a(h(i2).a(), eVar.h(i2).a()) && kotlin.jvm.internal.m.a(h(i2).getKind(), eVar.h(i2).getKind())) {
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return super.hashCode() * 31;
    }

    @Override
    public final boolean isInline() {
        return this.l;
    }
}

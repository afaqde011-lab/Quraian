package v1;

import java.util.Set;
import l1.y1;
import l1.z1;

public final class f implements y1 {
    public final Set A;
    public final m1.e B = new m1.e(0, new z1[16]);

    public f(Set set) {
        this.A = set;
    }

    @Override
    public final void b() {
    }

    @Override
    public final void c() {
    }

    @Override
    public final void d() {
        m1.e eVar = this.B;
        Object[] objArr = eVar.A;
        int i10 = eVar.C;
        for (int i11 = 0; i11 < i10; i11++) {
            y1 y1VarA = ((z1) objArr[i11]).a();
            this.A.remove(y1VarA);
            y1VarA.d();
        }
    }
}

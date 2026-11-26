package v2;

import com.google.android.gms.internal.measurement.f4;

public class j {

    public final m1.e f15385a = new m1.e(0, new i[16]);

    public final u.d0 f15386b = new u.d0(10);

    public boolean a(u.q qVar, z2.a0 a0Var, f4 f4Var, boolean z10) {
        m1.e eVar = this.f15385a;
        Object[] objArr = eVar.A;
        int i10 = eVar.C;
        boolean z11 = false;
        for (int i11 = 0; i11 < i10; i11++) {
            z11 = ((i) objArr[i11]).a(qVar, a0Var, f4Var, z10) || z11;
        }
        return z11;
    }

    public void b(f4 f4Var) {
        m1.e eVar = this.f15385a;
        int i10 = eVar.C;
        while (true) {
            i10--;
            if (-1 >= i10) {
                return;
            }
            if (((i) eVar.A[i10]).f15378d.f5166b == 0) {
                eVar.k(i10);
            }
        }
    }
}

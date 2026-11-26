package x6;

import androidx.fragment.app.l1;
import androidx.lifecycle.a1;
import androidx.media3.common.q;
import u.t0;

public class c extends a1 {

    public static final l1 f16467e = new l1(1);

    public final t0 f16468c = new t0(0);

    public boolean f16469d = false;

    @Override
    public final void g() {
        t0 t0Var = this.f16468c;
        int i10 = t0Var.C;
        for (int i11 = 0; i11 < i10; i11++) {
            b bVar = (b) t0Var.f(i11);
            me.d dVar = bVar.l;
            dVar.a();
            dVar.f10883c = true;
            q qVar = bVar.f16466n;
            if (qVar != null) {
                bVar.g(qVar);
            }
            b bVar2 = dVar.f10881a;
            if (bVar2 == null) {
                throw new IllegalStateException("No listener register");
            }
            if (bVar2 != bVar) {
                throw new IllegalArgumentException("Attempting to unregister the wrong listener");
            }
            dVar.f10881a = null;
            if (qVar != null) {
                boolean z10 = qVar.B;
            }
            dVar.f10884d = true;
            dVar.f10882b = false;
            dVar.f10883c = false;
            dVar.f10885e = false;
        }
        int i12 = t0Var.C;
        Object[] objArr = t0Var.B;
        for (int i13 = 0; i13 < i12; i13++) {
            objArr[i13] = null;
        }
        t0Var.C = 0;
    }
}

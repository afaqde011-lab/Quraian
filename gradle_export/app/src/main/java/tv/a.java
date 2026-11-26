package tv;

import androidx.media3.common.IllegalSeekPositionException;
import androidx.media3.common.d1;
import androidx.media3.common.f1;
import androidx.media3.common.k2;
import androidx.media3.common.q0;
import kotlin.jvm.internal.m;
import su.s;
import xu.f;

public final class a implements d1 {
    public final b A;

    public a(b bVar) {
        this.A = bVar;
    }

    public final void V(boolean z) {
        this.A.l();
    }

    public final void r(int i) {
        su.a aVar;
        b bVar = this.A;
        if (i != 3) {
            if (i == 4 && bVar.g()) {
                bVar.j(true);
                return;
            }
            return;
        }
        f fVar = bVar.a;
        s sVarD = fVar.d();
        if (sVarD == null || (aVar = sVarD.d) == null) {
            return;
        }
        fVar.j(aVar);
    }

    public final void u(int i, q0 q0Var) throws IllegalSeekPositionException {
        int i2;
        b bVar = this.A;
        f1 f1Var = bVar.c;
        if (f1Var == null) {
            return;
        }
        boolean z = (!bVar.j || (i2 = bVar.i) == -1 || i2 == f1Var.getCurrentMediaItemIndex()) ? false : true;
        if (i == 1 && z) {
            bVar.j(true);
        } else {
            bVar.i();
        }
    }

    public final void v(k2 timeline, int i) throws IllegalSeekPositionException {
        f fVar;
        s sVarD;
        su.a aVar;
        m.e(timeline, "timeline");
        b bVar = this.A;
        if (i == 1 && (sVarD = (fVar = bVar.a).d()) != null && (aVar = sVarD.d) != null) {
            fVar.j(aVar);
        }
        bVar.b();
    }
}

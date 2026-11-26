package m7;

import android.net.Uri;
import androidx.media3.common.t;
import fh.t0;
import java.util.ArrayList;
import java.util.List;

public final class l extends m {
    public final j H;
    public final hf.c I;

    public l(t tVar, t0 t0Var, r rVar, ArrayList arrayList, List list, List list2) {
        super(tVar, t0Var, rVar, arrayList, list, list2);
        Uri.parse(((b) t0Var.get(0)).f10576a);
        long j9 = rVar.f10631e;
        j jVar = j9 <= 0 ? null : new j(rVar.f10630d, j9, null);
        this.H = jVar;
        this.I = jVar == null ? new hf.c(new j(0L, -1L, null), 18) : null;
    }

    @Override
    public final String a() {
        return null;
    }

    @Override
    public final l7.j b() {
        return this.I;
    }

    @Override
    public final j d() {
        return this.H;
    }
}

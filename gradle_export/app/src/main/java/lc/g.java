package lc;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import java.util.Collections;
import java.util.List;
import kc.m;

public final class g extends b {
    public final ec.d A;
    public final c B;

    public g(cc.i iVar, e eVar, c cVar, cc.a aVar) {
        super(iVar, eVar);
        this.B = cVar;
        ec.d dVar = new ec.d(iVar, this, new m("__container", eVar.f10239a, false), aVar);
        this.A = dVar;
        List list = Collections.EMPTY_LIST;
        dVar.b(list, list);
    }

    @Override
    public final void c(RectF rectF, Matrix matrix, boolean z10) {
        super.c(rectF, matrix, z10);
        this.A.c(rectF, this.f10226n, z10);
    }

    @Override
    public final void i(Canvas canvas, Matrix matrix, int i10) {
        this.A.d(canvas, matrix, i10);
    }

    @Override
    public final hf.c j() {
        hf.c cVar = this.f10228p.f10259w;
        return cVar != null ? cVar : this.B.f10228p.f10259w;
    }

    @Override
    public final ce.c k() {
        ce.c cVar = this.f10228p.f10260x;
        return cVar != null ? cVar : this.B.f10228p.f10260x;
    }
}

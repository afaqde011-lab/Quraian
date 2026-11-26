package t2;

import b2.q;
import b3.e1;
import c3.d2;
import c3.y2;
import kotlin.Metadata;
import u00.k;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lt2/c;", "Lb3/e1;", "Lt2/f;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class c extends e1 {
    public final k B;
    public final k C;

    public c(k kVar, k kVar2) {
        this.B = kVar;
        this.C = kVar2;
    }

    @Override
    public final q d() {
        f fVar = new f();
        fVar.O = this.B;
        fVar.P = this.C;
        return fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.B == cVar.B && this.C == cVar.C;
    }

    @Override
    public final void h(d2 d2Var) {
        y2 y2Var = d2Var.f2646c;
        k kVar = this.B;
        if (kVar != null) {
            d2Var.f2644a = "onKeyEvent";
            y2Var.c(kVar, "onKeyEvent");
        }
        k kVar2 = this.C;
        if (kVar2 != null) {
            d2Var.f2644a = "onPreviewKeyEvent";
            y2Var.c(kVar2, "onPreviewKeyEvent");
        }
    }

    public final int hashCode() {
        k kVar = this.B;
        int iHashCode = (kVar != null ? kVar.hashCode() : 0) * 31;
        k kVar2 = this.C;
        return iHashCode + (kVar2 != null ? kVar2.hashCode() : 0);
    }

    @Override
    public final void i(q qVar) {
        f fVar = (f) qVar;
        fVar.O = this.B;
        fVar.P = this.C;
    }
}

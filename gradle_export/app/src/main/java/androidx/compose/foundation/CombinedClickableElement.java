package androidx.compose.foundation;

import b2.q;
import b3.e1;
import c3.d2;
import c3.y2;
import f0.i;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.m;
import w.c;
import z.z;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/CombinedClickableElement;", "Lb3/e1;", "Lz/z;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class CombinedClickableElement extends e1 {
    public final i B;
    public final u00.a C;

    public CombinedClickableElement(i iVar, u00.a aVar) {
        this.B = iVar;
        this.C = aVar;
    }

    @Override
    public final q d() {
        return new z(this.B, this.C);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CombinedClickableElement.class != obj.getClass()) {
            return false;
        }
        CombinedClickableElement combinedClickableElement = (CombinedClickableElement) obj;
        return m.a(this.B, combinedClickableElement.B) && this.C == combinedClickableElement.C;
    }

    @Override
    public final void h(d2 d2Var) {
        d2Var.f2644a = "combinedClickable";
        y2 y2Var = d2Var.f2646c;
        y2Var.c(null, "indicationNodeFactory");
        y2Var.c(this.B, "interactionSource");
        Boolean bool = Boolean.TRUE;
        y2Var.c(bool, "enabled");
        y2Var.c(null, "onClickLabel");
        y2Var.c(null, "role");
        y2Var.c(this.C, "onClick");
        y2Var.c(null, "onDoubleClick");
        y2Var.c(null, "onLongClick");
        y2Var.c(null, "onLongClickLabel");
        y2Var.c(bool, "hapticFeedbackEnabled");
    }

    public final int hashCode() {
        i iVar = this.B;
        return Boolean.hashCode(true) + ((this.C.hashCode() + c.e(c.e((iVar != null ? iVar.hashCode() : 0) * 961, 31, false), 29791, true)) * 923521);
    }

    @Override
    public final void i(q qVar) throws NoWhenBranchMatchedException, KotlinNothingValueException {
        z zVar = (z) qVar;
        zVar.getClass();
        boolean z10 = !zVar.V;
        zVar.P1(this.B, null, false, true, null, null, this.C);
        if (z10) {
            zVar.Q1(false);
            zVar.Q1(true);
        }
    }
}

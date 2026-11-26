package androidx.compose.foundation;

import b2.q;
import b3.e1;
import c3.d2;
import c3.y2;
import f0.i;
import j3.k;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.m;
import w.c;
import z.v;
import z.v0;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/ClickableElement;", "Lb3/e1;", "Lz/v;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class ClickableElement extends e1 {
    public final i B;
    public final v0 C;
    public final boolean D;
    public final boolean E;
    public final String F;
    public final k G;
    public final u00.a H;

    public ClickableElement(i iVar, v0 v0Var, boolean z10, boolean z11, String str, k kVar, u00.a aVar) {
        this.B = iVar;
        this.C = v0Var;
        this.D = z10;
        this.E = z11;
        this.F = str;
        this.G = kVar;
        this.H = aVar;
    }

    @Override
    public final q d() {
        return new v(this.B, this.C, this.D, this.E, this.F, this.G, this.H);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ClickableElement.class != obj.getClass()) {
            return false;
        }
        ClickableElement clickableElement = (ClickableElement) obj;
        return m.a(this.B, clickableElement.B) && m.a(this.C, clickableElement.C) && this.D == clickableElement.D && this.E == clickableElement.E && m.a(this.F, clickableElement.F) && m.a(this.G, clickableElement.G) && this.H == clickableElement.H;
    }

    @Override
    public final void h(d2 d2Var) {
        d2Var.f2644a = "clickable";
        y2 y2Var = d2Var.f2646c;
        y2Var.c(Boolean.valueOf(this.E), "enabled");
        y2Var.c(this.H, "onClick");
        y2Var.c(this.F, "onClickLabel");
        y2Var.c(this.G, "role");
        y2Var.c(this.B, "interactionSource");
        y2Var.c(this.C, "indicationNodeFactory");
    }

    public final int hashCode() {
        i iVar = this.B;
        int iHashCode = (iVar != null ? iVar.hashCode() : 0) * 31;
        v0 v0Var = this.C;
        int iE = c.e(c.e((iHashCode + (v0Var != null ? v0Var.hashCode() : 0)) * 31, 31, this.D), 31, this.E);
        String str = this.F;
        int iHashCode2 = (iE + (str != null ? str.hashCode() : 0)) * 31;
        k kVar = this.G;
        return this.H.hashCode() + ((iHashCode2 + (kVar != null ? Integer.hashCode(kVar.f7937a) : 0)) * 31);
    }

    @Override
    public final void i(q qVar) throws NoWhenBranchMatchedException, KotlinNothingValueException {
        ((v) qVar).P1(this.B, this.C, this.D, this.E, this.F, this.G, this.H);
    }
}

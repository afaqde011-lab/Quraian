package b3;

import android.graphics.Canvas;
import androidx.compose.ui.node.Owner;
import kotlin.NoWhenBranchMatchedException;

public final class n0 extends kotlin.jvm.internal.n implements u00.k {
    public final int A;
    public final Object B;
    public final Object C;
    public final Object D;

    public n0(g2.a0 a0Var, g2.n nVar, u00.k kVar) {
        super(1);
        this.A = 4;
        this.B = a0Var;
        this.C = nVar;
        this.D = (kotlin.jvm.internal.n) kVar;
    }

    public n0(Object obj, Object obj2, Object obj3, int i10) {
        super(1);
        this.A = i10;
        this.B = obj;
        this.C = obj2;
        this.D = obj3;
    }

    public final Object invoke(Object obj) throws NoWhenBranchMatchedException {
        boolean zBooleanValue;
        switch (this.A) {
            case 0:
                k2.d dVar = (k2.d) obj;
                o0 o0Var = (o0) this.B;
                o oVar = o0Var.B;
                o0Var.B = (o) this.C;
                try {
                    y3.c cVarO = dVar.G0().o();
                    y3.m mVarP = dVar.G0().p();
                    i2.s sVarN = dVar.G0().n();
                    long jQ = dVar.G0().q();
                    l2.b bVar = (l2.b) dVar.G0().C;
                    u00.k kVar = (u00.k) this.D;
                    y3.c cVarO2 = o0Var.G0().o();
                    y3.m mVarP2 = o0Var.G0().p();
                    i2.s sVarN2 = o0Var.G0().n();
                    long jQ2 = o0Var.G0().q();
                    l2.b bVar2 = (l2.b) o0Var.G0().C;
                    a1.i iVarG0 = o0Var.G0();
                    iVarG0.z(cVarO);
                    iVarG0.B(mVarP);
                    iVarG0.y(sVarN);
                    iVarG0.C(jQ);
                    iVarG0.C = bVar;
                    sVarN.i();
                    try {
                        kVar.invoke(o0Var);
                        sVarN.q();
                        a1.i iVarG1 = o0Var.G0();
                        iVarG1.z(cVarO2);
                        iVarG1.B(mVarP2);
                        iVarG1.y(sVarN2);
                        iVarG1.C(jQ2);
                        iVarG1.C = bVar2;
                        o0Var.B = oVar;
                        return g00.b0.a;
                    } catch (Throwable th2) {
                        sVarN.q();
                        a1.i iVarG2 = o0Var.G0();
                        iVarG2.z(cVarO2);
                        iVarG2.B(mVarP2);
                        iVarG2.y(sVarN2);
                        iVarG2.C(jQ2);
                        iVarG2.C = bVar2;
                        throw th2;
                    }
                } catch (Throwable th3) {
                    o0Var.B = oVar;
                    throw th3;
                }
            case 1:
                b4.z zVar = (b4.z) this.B;
                l0 l0Var = (l0) this.C;
                b4.z zVar2 = (b4.z) this.D;
                i2.s sVarN3 = ((k2.d) obj).G0().n();
                if (zVar.getView().getVisibility() != 8) {
                    zVar.f2152b0 = true;
                    Owner owner = l0Var.O;
                    c3.z zVar3 = owner instanceof c3.z ? (c3.z) owner : null;
                    if (zVar3 != null) {
                        Canvas canvasA = i2.b.a(sVarN3);
                        zVar3.getAndroidViewsHandler$ui().getClass();
                        zVar2.draw(canvasA);
                    }
                    zVar.f2152b0 = false;
                }
                return g00.b0.a;
            case 2:
                e2.g gVar = (e2.g) obj;
                if (!gVar.N) {
                    return n2.B;
                }
                if (gVar.Q != null) {
                    y2.a.c("DragAndDropTarget self reference must be null at the start of a drag and drop session");
                }
                u00.k kVar2 = gVar.O;
                e2.h hVar = kVar2 != null ? (e2.h) kVar2.invoke((e2.d) this.B) : null;
                gVar.Q = hVar;
                boolean z10 = hVar != null;
                if (z10) {
                    ((e2.b) ((c3.z) m.z((e2.g) this.C)).m18getDragAndDropManager()).f5044b.add(gVar);
                }
                kotlin.jvm.internal.v vVar = (kotlin.jvm.internal.v) this.D;
                vVar.A = vVar.A || z10;
                return n2.A;
            case 3:
                o2 o2Var = (o2) obj;
                e2.g gVar2 = (e2.g) o2Var;
                if (!((e2.b) ((c3.z) m.z((e2.g) this.C)).m18getDragAndDropManager()).f5044b.contains(gVar2) || !kh.o.j(gVar2, p30.f.g0((e2.d) this.D))) {
                    return n2.A;
                }
                ((kotlin.jvm.internal.z) this.B).A = o2Var;
                return n2.C;
            case 4:
                g2.a0 a0Var = (g2.a0) obj;
                if (kotlin.jvm.internal.m.a(a0Var, (g2.a0) this.B)) {
                    zBooleanValue = false;
                } else {
                    if (kotlin.jvm.internal.m.a(a0Var, ((g2.n) this.C).f6073c)) {
                        throw new IllegalStateException("Focus search landed at the root.");
                    }
                    zBooleanValue = ((Boolean) ((kotlin.jvm.internal.n) this.D).invoke(a0Var)).booleanValue();
                }
                return Boolean.valueOf(zBooleanValue);
            case 5:
                return new gv.k((z1.p) this.B, this.C, (w.v) this.D, 5);
            case 6:
                return ((Boolean) obj).booleanValue() == ((Boolean) ((w.g0) this.B).f15759b.f16326d.getValue()).booleanValue() ? (h2.c) this.C : (h2.c) this.D;
            case 7:
                i2.c0 c0Var = (i2.c0) obj;
                l1.p2 p2Var = (l1.p2) this.C;
                l1.p2 p2Var2 = (l1.p2) this.B;
                c0Var.s0(p2Var2 != null ? ((Number) p2Var2.getValue()).floatValue() : 1.0f);
                c0Var.I0(p2Var != null ? ((Number) p2Var.getValue()).floatValue() : 1.0f);
                c0Var.N(p2Var != null ? ((Number) p2Var.getValue()).floatValue() : 1.0f);
                l1.p2 p2Var3 = (l1.p2) this.D;
                c0Var.S0(p2Var3 != null ? ((i2.w0) p2Var3.getValue()).f7177a : i2.w0.f7175b);
                return g00.b0.a;
            case 8:
                w.x0 x0Var = (w.x0) this.C;
                w.y0 y0Var = (w.y0) this.D;
                int iOrdinal = ((w.l0) obj).ordinal();
                i2.w0 w0Var = null;
                if (iOrdinal == 0) {
                    w.d1 d1Var = x0Var.f15820a.f15768d;
                    if (d1Var != null) {
                        w0Var = new i2.w0(d1Var.f15749b);
                    } else {
                        w.d1 d1Var2 = y0Var.f15824a.f15768d;
                        if (d1Var2 != null) {
                            w0Var = new i2.w0(d1Var2.f15749b);
                        }
                    }
                } else if (iOrdinal == 1) {
                    w0Var = (i2.w0) this.B;
                } else {
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    w.d1 d1Var3 = y0Var.f15824a.f15768d;
                    if (d1Var3 != null) {
                        w0Var = new i2.w0(d1Var3.f15749b);
                    } else {
                        w.d1 d1Var4 = x0Var.f15820a.f15768d;
                        if (d1Var4 != null) {
                            w0Var = new i2.w0(d1Var4.f15749b);
                        }
                    }
                }
                return new i2.w0(w0Var != null ? w0Var.f7177a : i2.w0.f7175b);
            default:
                z2.k1 k1Var = (z2.k1) obj;
                w.z1 z1Var = (w.z1) this.C;
                z2.a0 a0VarE = k1Var.e();
                if (a0VarE != null) {
                    if (((z2.y0) this.B).w0()) {
                        z1Var.O.F = a0VarE;
                    } else {
                        z1Var.O.E = a0VarE;
                    }
                }
                k1Var.h((z2.l1) this.D, 0, 0, 0.0f);
                return g00.b0.a;
        }
    }
}

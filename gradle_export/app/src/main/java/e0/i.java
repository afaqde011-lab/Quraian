package e0;

import d0.y1;
import g00.b0;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.w;
import l1.i1;

public final class i implements u00.k {
    public final int A;
    public final float B;
    public final w C;
    public final y1 D;
    public final u00.k E;

    public i(float f3, w wVar, y1 y1Var, u00.k kVar, int i10) {
        this.A = i10;
        this.B = f3;
        this.C = wVar;
        this.D = y1Var;
        this.E = kVar;
    }

    public final Object invoke(Object obj) {
        float fA;
        switch (this.A) {
            case 0:
                x.h hVar = (x.h) obj;
                i1 i1Var = hVar.f16286e;
                float fAbs = Math.abs(((Number) i1Var.getValue()).floatValue());
                float f3 = this.B;
                float fAbs2 = Math.abs(f3);
                w wVar = this.C;
                y1 y1Var = this.D;
                u00.k kVar = this.E;
                if (fAbs >= fAbs2) {
                    float fD = l.d(((Number) i1Var.getValue()).floatValue(), f3);
                    l.c(hVar, y1Var, kVar, fD - wVar.A);
                    hVar.a();
                    wVar.A = fD;
                } else {
                    l.c(hVar, y1Var, kVar, ((Number) i1Var.getValue()).floatValue() - wVar.A);
                    wVar.A = ((Number) i1Var.getValue()).floatValue();
                }
                break;
            default:
                y1 y1Var2 = this.D;
                x.h hVar2 = (x.h) obj;
                float fD2 = l.d(((Number) hVar2.f16286e.getValue()).floatValue(), this.B);
                w wVar2 = this.C;
                float f10 = fD2 - wVar2.A;
                try {
                    fA = y1Var2.a(f10);
                } catch (CancellationException unused) {
                    hVar2.a();
                    fA = 0.0f;
                }
                this.E.invoke(Float.valueOf(fA));
                if (Math.abs(f10 - fA) > 0.5f || fD2 != ((Number) hVar2.f16286e.getValue()).floatValue()) {
                    hVar2.a();
                }
                wVar2.A += fA;
                break;
        }
        return b0.a;
    }
}

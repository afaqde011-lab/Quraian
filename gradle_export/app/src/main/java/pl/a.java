package pl;

import ab.a0;
import com.google.android.gms.internal.measurement.g4;
import g00.b0;
import i2.c0;
import kotlin.jvm.internal.z;
import l1.p2;
import l1.z0;
import x.m1;

public final class a implements u00.k {
    public final int A = 2;
    public final float B;
    public final Object C;
    public final p2 D;
    public final Object E;
    public final Object F;

    public a(z zVar, float f, x.e eVar, x.j jVar, u00.k kVar) {
        this.E = zVar;
        this.B = f;
        this.C = eVar;
        this.D = jVar;
        this.F = kVar;
    }

    public a(m1 m1Var, m1 m1Var2, float f, z0 z0Var, z0 z0Var2) {
        this.E = m1Var;
        this.F = m1Var2;
        this.B = f;
        this.C = z0Var;
        this.D = z0Var2;
    }

    public a(z1.p pVar, z0 z0Var, z0 z0Var2, z0 z0Var3, float f) {
        this.E = pVar;
        this.C = z0Var;
        this.D = z0Var2;
        this.F = z0Var3;
        this.B = f;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.A) {
            case 0:
                z1.p pVar = (z1.p) this.E;
                z0 z0Var = (z0) this.C;
                z0 z0Var2 = this.D;
                z0 z0Var3 = (z0) this.F;
                long j = ((y3.l) obj).a;
                z0Var.setValue(new y3.l(j));
                if (((Boolean) z0Var2.getValue()).booleanValue() && !((Boolean) z0Var3.getValue()).booleanValue() && !y3.l.b(j, 0L) && pVar.isEmpty()) {
                    g4.m(pVar, this.B, (int) (j >> 32), (int) (4294967295L & j));
                }
                return b0.a;
            case 1:
                p2 p2Var = (p2) this.E;
                p2 p2Var2 = (p2) this.F;
                z0 z0Var4 = (z0) this.C;
                z0 z0Var5 = this.D;
                c0 graphicsLayer = (c0) obj;
                kotlin.jvm.internal.m.e(graphicsLayer, "$this$graphicsLayer");
                graphicsLayer.s0(((Number) p2Var.getValue()).floatValue());
                graphicsLayer.I0(((Number) p2Var2.getValue()).floatValue());
                graphicsLayer.N(((Number) p2Var2.getValue()).floatValue());
                graphicsLayer.S0(i2.b0.h(Float.intBitsToFloat((int) (graphicsLayer.b() >> 32)) > 0.0f ? a0.x(rl.d.c(this.B, z0Var4, z0Var5) / Float.intBitsToFloat((int) (graphicsLayer.b() >> 32)), 0.0f, 1.0f) : 0.5f, rl.d.d(z0Var4, z0Var5) ? 1.0f : 0.0f));
                break;
            default:
                z zVar = (z) this.E;
                x.e eVar = (x.e) this.C;
                x.j jVar = this.D;
                u00.k kVar = (u00.k) this.F;
                long jLongValue = ((Long) obj).longValue();
                Object obj2 = zVar.A;
                kotlin.jvm.internal.m.b(obj2);
                x.c.p((x.h) obj2, jLongValue, this.B, eVar, jVar, kVar);
                break;
        }
        return b0.a;
    }
}

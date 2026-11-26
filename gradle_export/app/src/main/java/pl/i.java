package pl;

import g00.b0;
import i2.c0;
import z2.a0;

public final class i implements u00.k {
    public final int A = 1;
    public final int B;
    public final boolean C;
    public final Object D;

    public i(int i, tm.e eVar, boolean z) {
        this.B = i;
        this.D = eVar;
        this.C = z;
    }

    public i(j jVar, int i, boolean z) {
        this.D = jVar;
        this.B = i;
        this.C = z;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.A) {
            case 0:
                j jVar = (j) this.D;
                a0 coordinates = (a0) obj;
                kotlin.jvm.internal.m.e(coordinates, "coordinates");
                jVar.c.invoke(Integer.valueOf(this.B), coordinates, Boolean.valueOf(this.C));
                break;
            default:
                tm.e eVar = (tm.e) this.D;
                c0 graphicsLayer = (c0) obj;
                kotlin.jvm.internal.m.e(graphicsLayer, "$this$graphicsLayer");
                float f = (-Float.intBitsToFloat((int) (graphicsLayer.b() >> 32))) / 2.0f;
                float f2 = this.B;
                float fC = (eVar.c() * f2) + f;
                float f3 = (-Float.intBitsToFloat((int) (graphicsLayer.b() >> 32))) / 4.0f;
                float fIntBitsToFloat = f2 - ((Float.intBitsToFloat((int) (graphicsLayer.b() >> 32)) * 3.0f) / 4.0f);
                if (fC < f3) {
                    fC = f3;
                }
                if (fC <= fIntBitsToFloat) {
                    fIntBitsToFloat = fC;
                }
                graphicsLayer.T0(fIntBitsToFloat * (this.C ? 1.0f : -1.0f));
                break;
        }
        return b0.a;
    }
}

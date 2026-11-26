package sm;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import d0.f3;

public final class a0 implements PointerInputEventHandler {
    public final z00.a a;
    public final int b;
    public final boolean c;
    public final tm.e d;
    public final u00.k e;

    public a0(z00.a aVar, int i, boolean z, tm.e eVar, u00.k kVar) {
        this.a = aVar;
        this.b = i;
        this.c = z;
        this.d = eVar;
        this.e = kVar;
    }

    public final Object invoke(v2.v vVar, k00.c cVar) {
        final z00.a aVar = this.a;
        final int i = this.b;
        final boolean z = this.c;
        final tm.e eVar = this.d;
        final u00.k kVar = this.e;
        Object objD = f3.d(vVar, (u00.o) null, new u00.k() {
            @Override
            public final Object invoke(Object obj) {
                z00.a aVar2 = aVar;
                float f = aVar2.B;
                float f2 = aVar2.A;
                float fIntBitsToFloat = (Float.intBitsToFloat((int) (((h2.b) obj).a >> 32)) / i) * (f - f2);
                float fFloatValue = ((Number) ab.a0.D(Float.valueOf(z ? f2 + fIntBitsToFloat : f - fIntBitsToFloat), aVar2)).floatValue();
                eVar.a(fFloatValue);
                kVar.invoke(Float.valueOf(fFloatValue));
                return g00.b0.a;
            }
        }, cVar, 7);
        return objD == l00.a.A ? objD : g00.b0.a;
    }
}

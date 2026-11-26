package i2;

import android.graphics.Paint;
import android.graphics.Shader;

public abstract class r0 extends q {

    public gi.c f7156a;

    public long f7157b = 9205357640488583168L;

    @Override
    public final void a(float f3, long j9, e eVar) {
        gi.c cVar = this.f7156a;
        if (cVar == null || !h2.e.a(this.f7157b, j9)) {
            if (h2.e.f(j9)) {
                this.f7156a = null;
                this.f7157b = 9205357640488583168L;
                cVar = null;
            } else {
                cVar = this.f7156a;
                if (cVar == null) {
                    cVar = new gi.c(5, false);
                    this.f7156a = cVar;
                }
                cVar.B = b(j9);
                this.f7156a = cVar;
                this.f7157b = j9;
            }
        }
        Paint paint = eVar.f7120a;
        long jC = b0.c(paint.getColor());
        long j10 = t.f7162b;
        if (!t.c(jC, j10)) {
            eVar.e(j10);
        }
        if (!kotlin.jvm.internal.m.a(eVar.f7122c, cVar != null ? (Shader) cVar.B : null)) {
            eVar.i(cVar != null ? (Shader) cVar.B : null);
        }
        if (paint.getAlpha() / 255.0f == f3) {
            return;
        }
        eVar.c(f3);
    }

    public abstract Shader b(long j9);
}

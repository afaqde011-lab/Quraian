package qg;

import android.graphics.Typeface;
import com.google.android.gms.internal.measurement.b5;

public final class a extends b5 {

    public final Typeface f12982b;

    public final hf.c f12983c;

    public boolean f12984d;

    public a(hf.c cVar, Typeface typeface) {
        this.f12982b = typeface;
        this.f12983c = cVar;
    }

    @Override
    public final void E(int i10) {
        if (this.f12984d) {
            return;
        }
        ng.b bVar = (ng.b) this.f12983c.B;
        if (bVar.l(this.f12982b)) {
            bVar.j(false);
        }
    }

    @Override
    public final void F(Typeface typeface, boolean z10) {
        if (this.f12984d) {
            return;
        }
        ng.b bVar = (ng.b) this.f12983c.B;
        if (bVar.l(typeface)) {
            bVar.j(false);
        }
    }
}

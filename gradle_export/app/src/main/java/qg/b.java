package qg;

import android.graphics.Typeface;
import com.google.android.gms.internal.measurement.b5;

public final class b extends p4.a {

    public final b5 f12985e;

    public final d f12986f;

    public b(d dVar, b5 b5Var) {
        this.f12986f = dVar;
        this.f12985e = b5Var;
    }

    @Override
    public final void h(int i10) {
        this.f12986f.f13002n = true;
        this.f12985e.E(i10);
    }

    @Override
    public final void i(Typeface typeface) {
        d dVar = this.f12986f;
        dVar.f13004p = Typeface.create(typeface, dVar.f12994d);
        dVar.f13002n = true;
        this.f12985e.F(dVar.f13004p, false);
    }
}

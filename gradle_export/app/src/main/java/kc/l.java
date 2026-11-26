package kc;

import android.graphics.Path;
import com.google.android.gms.internal.measurement.x5;

public final class l implements b {

    public final boolean f9630a;

    public final Path.FillType f9631b;

    public final jc.a f9632c;

    public final jc.a f9633d;

    public final boolean f9634e;

    public l(String str, boolean z10, Path.FillType fillType, jc.a aVar, jc.a aVar2, boolean z11) {
        this.f9630a = z10;
        this.f9631b = fillType;
        this.f9632c = aVar;
        this.f9633d = aVar2;
        this.f9634e = z11;
    }

    @Override
    public final ec.c a(cc.i iVar, cc.a aVar, lc.b bVar) {
        return new ec.g(iVar, bVar, this);
    }

    public final String toString() {
        return x5.o(new StringBuilder("ShapeFill{color=, fillEnabled="), this.f9630a, '}');
    }
}

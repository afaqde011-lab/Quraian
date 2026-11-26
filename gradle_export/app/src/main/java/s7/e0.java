package s7;

import java.io.IOException;

public final class e0 implements e7.h {
    public final c50.h A;
    public final r B;
    public final w C;
    public final IOException D;
    public final boolean E;

    public e0(c50.h hVar, r rVar, w wVar, IOException iOException, boolean z11) {
        this.A = hVar;
        this.B = rVar;
        this.C = wVar;
        this.D = iOException;
        this.E = z11;
    }

    @Override
    public final void accept(Object obj) {
        g0 g0Var = (g0) obj;
        c50.h hVar = this.A;
        g0Var.y(hVar.B, (a0) hVar.C, this.B, this.C, this.D, this.E);
    }
}

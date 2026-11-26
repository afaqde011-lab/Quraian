package oa;

import android.content.Context;
import g00.p;
import g1.l0;
import kotlin.jvm.internal.m;
import qd.j0;

public final class g implements na.c {
    public final Context A;
    public final String B;
    public final j0 C;
    public final boolean D;
    public final boolean E;
    public final p F;
    public boolean G;

    public g(Context context, String str, j0 j0Var, boolean z10, boolean z11) {
        m.e(context, "context");
        m.e(j0Var, "callback");
        this.A = context;
        this.B = str;
        this.C = j0Var;
        this.D = z10;
        this.E = z11;
        this.F = rd.a.J(new l0(this, 23));
    }

    @Override
    public final na.a L() {
        return ((f) this.F.getValue()).a(true);
    }

    @Override
    public final void close() {
        p pVar = this.F;
        if (pVar.isInitialized()) {
            ((f) pVar.getValue()).close();
        }
    }

    @Override
    public final String getDatabaseName() {
        return this.B;
    }

    @Override
    public final void setWriteAheadLoggingEnabled(boolean z10) {
        p pVar = this.F;
        if (pVar.isInitialized()) {
            ((f) pVar.getValue()).setWriteAheadLoggingEnabled(z10);
        }
        this.G = z10;
    }
}

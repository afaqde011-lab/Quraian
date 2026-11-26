package a30;

import com.google.android.gms.internal.measurement.z3;
import j10.n0;

public final class v extends x {
    public final i20.k E;
    public final v F;
    public final n20.b G;
    public final i20.j H;
    public final boolean I;

    public v(i20.k classProto, k20.g nameResolver, h9.f fVar, n0 n0Var, v vVar) {
        super(nameResolver, fVar, n0Var);
        kotlin.jvm.internal.m.e(classProto, "classProto");
        kotlin.jvm.internal.m.e(nameResolver, "nameResolver");
        this.E = classProto;
        this.F = vVar;
        this.G = z3.z(nameResolver, classProto.E);
        i20.j jVar = (i20.j) k20.e.f.e(classProto.D);
        this.H = jVar == null ? i20.j.CLASS : jVar;
        this.I = k20.e.g.e(classProto.D).booleanValue();
        k20.e.h.getClass();
    }

    @Override
    public final n20.c b() {
        return this.G.a();
    }
}

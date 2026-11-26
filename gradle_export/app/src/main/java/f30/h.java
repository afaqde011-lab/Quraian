package f30;

import e30.a0;
import e30.h0;
import e30.m0;
import e30.p0;
import e30.z0;
import h00.x;
import java.util.List;

public final class h extends a0 implements h30.d {
    public final h30.b B;
    public final i C;
    public final z0 D;
    public final h0 E;
    public final boolean F;
    public final boolean G;

    public h(h30.b bVar, i iVar, z0 z0Var, h0 h0Var, boolean z, int i) {
        if ((i & 8) != 0) {
            h0.B.getClass();
            h0Var = h0.C;
        }
        this(bVar, iVar, z0Var, h0Var, (i & 16) != 0 ? false : z, false);
    }

    public h(h30.b captureStatus, i constructor, z0 z0Var, h0 attributes, boolean z, boolean z2) {
        kotlin.jvm.internal.m.e(captureStatus, "captureStatus");
        kotlin.jvm.internal.m.e(constructor, "constructor");
        kotlin.jvm.internal.m.e(attributes, "attributes");
        this.B = captureStatus;
        this.C = constructor;
        this.D = z0Var;
        this.E = attributes;
        this.F = z;
        this.G = z2;
    }

    @Override
    public final a0 z0(boolean z) {
        return new h(this.B, this.C, this.D, this.E, z, 32);
    }

    @Override
    public final a0 B0(h0 newAttributes) {
        kotlin.jvm.internal.m.e(newAttributes, "newAttributes");
        return new h(this.B, this.C, this.D, newAttributes, this.F, this.G);
    }

    @Override
    public final h A0(f kotlinTypeRefiner) {
        kotlin.jvm.internal.m.e(kotlinTypeRefiner, "kotlinTypeRefiner");
        i iVar = this.C;
        iVar.getClass();
        p0 p0VarD = iVar.A.d(kotlinTypeRefiner);
        a20.a aVar = iVar.B != null ? new a20.a(iVar, kotlinTypeRefiner, 19) : null;
        i iVar2 = iVar.C;
        if (iVar2 == null) {
            iVar2 = iVar;
        }
        i iVar3 = new i(p0VarD, aVar, iVar2, iVar.D);
        z0 z0Var = this.D;
        return new h(this.B, iVar3, z0Var != null ? z0Var : null, this.E, this.F, 32);
    }

    @Override
    public final x20.n N() {
        return g30.l.a(g30.h.CAPTURED_TYPE_SCOPE, true, new String[0]);
    }

    @Override
    public final List e0() {
        return x.A;
    }

    @Override
    public final h0 k0() {
        return this.E;
    }

    @Override
    public final m0 m0() {
        return this.C;
    }

    @Override
    public final boolean t0() {
        return this.F;
    }

    @Override
    public final z0 z0(boolean z) {
        return new h(this.B, this.C, this.D, this.E, z, 32);
    }
}

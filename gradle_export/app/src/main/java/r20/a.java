package r20;

import e30.a0;
import e30.h0;
import e30.m0;
import e30.p0;
import e30.w;
import e30.z0;
import f30.f;
import g30.h;
import g30.l;
import h00.x;
import h30.d;
import java.util.List;
import kotlin.jvm.internal.m;
import x20.n;

public final class a extends a0 implements d {
    public final p0 B;
    public final c C;
    public final boolean D;
    public final h0 E;

    public a(p0 typeProjection, c cVar, boolean z, h0 attributes) {
        m.e(typeProjection, "typeProjection");
        m.e(attributes, "attributes");
        this.B = typeProjection;
        this.C = cVar;
        this.D = z;
        this.E = attributes;
    }

    @Override
    public final z0 A0(f kotlinTypeRefiner) {
        m.e(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new a(this.B.d(kotlinTypeRefiner), this.C, this.D, this.E);
    }

    @Override
    public final a0 z0(boolean z) {
        if (z == this.D) {
            return this;
        }
        return new a(this.B, this.C, z, this.E);
    }

    @Override
    public final a0 B0(h0 newAttributes) {
        m.e(newAttributes, "newAttributes");
        return new a(this.B, this.C, this.D, newAttributes);
    }

    @Override
    public final n N() {
        return l.a(h.CAPTURED_TYPE_SCOPE, true, new String[0]);
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
        return this.D;
    }

    @Override
    public final String toString() {
        StringBuilder sb = new StringBuilder("Captured(");
        sb.append(this.B);
        sb.append(')');
        sb.append(this.D ? "?" : "");
        return sb.toString();
    }

    @Override
    public final w A0(f kotlinTypeRefiner) {
        m.e(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new a(this.B.d(kotlinTypeRefiner), this.C, this.D, this.E);
    }

    @Override
    public final z0 z0(boolean z) {
        if (z == this.D) {
            return this;
        }
        return new a(this.B, this.C, z, this.E);
    }
}

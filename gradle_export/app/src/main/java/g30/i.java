package g30;

import e30.a0;
import e30.h0;
import e30.m0;
import e30.w;
import e30.z0;
import java.util.Arrays;
import java.util.List;
import x20.n;

public final class i extends a0 {
    public final m0 B;
    public final g C;
    public final k D;
    public final List E;
    public final boolean F;
    public final String[] G;
    public final String H;

    public i(m0 m0Var, g gVar, k kind, List arguments, boolean z, String... formatParams) {
        kotlin.jvm.internal.m.e(kind, "kind");
        kotlin.jvm.internal.m.e(arguments, "arguments");
        kotlin.jvm.internal.m.e(formatParams, "formatParams");
        this.B = m0Var;
        this.C = gVar;
        this.D = kind;
        this.E = arguments;
        this.F = z;
        this.G = formatParams;
        String str = kind.A;
        Object[] objArrCopyOf = Arrays.copyOf(formatParams, formatParams.length);
        this.H = String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    @Override
    public final z0 w0(f30.f kotlinTypeRefiner) {
        kotlin.jvm.internal.m.e(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @Override
    public final z0 B0(h0 newAttributes) {
        kotlin.jvm.internal.m.e(newAttributes, "newAttributes");
        return this;
    }

    @Override
    public final a0 z0(boolean z) {
        String[] strArr = this.G;
        return new i(this.B, this.C, this.D, this.E, z, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @Override
    public final a0 B0(h0 newAttributes) {
        kotlin.jvm.internal.m.e(newAttributes, "newAttributes");
        return this;
    }

    @Override
    public final n N() {
        return this.C;
    }

    @Override
    public final List e0() {
        return this.E;
    }

    @Override
    public final h0 k0() {
        h0.B.getClass();
        return h0.C;
    }

    @Override
    public final m0 m0() {
        return this.B;
    }

    @Override
    public final boolean t0() {
        return this.F;
    }

    @Override
    public final w w0(f30.f kotlinTypeRefiner) {
        kotlin.jvm.internal.m.e(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }
}

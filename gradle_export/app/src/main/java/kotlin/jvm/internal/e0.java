package kotlin.jvm.internal;

import com.google.android.gms.internal.measurement.x5;
import java.util.List;

public final class e0 implements a10.x {
    public final a10.e A;
    public final List B;
    public final int C;

    public e0(a10.e classifier, List arguments, int i) {
        m.e(classifier, "classifier");
        m.e(arguments, "arguments");
        this.A = classifier;
        this.B = arguments;
        this.C = i;
    }

    public final String d(boolean z) {
        String name;
        a10.e eVar = this.A;
        a10.d dVar = eVar instanceof a10.d ? (a10.d) eVar : null;
        Class clsD = dVar != null ? k00.f.D(dVar) : null;
        if (clsD == null) {
            name = eVar.toString();
        } else if ((this.C & 4) != 0) {
            name = "kotlin.Nothing";
        } else if (!clsD.isArray()) {
            name = (z && clsD.isPrimitive()) ? k00.f.G((a10.d) eVar).getName() : clsD.getName();
        } else if (clsD.equals(boolean[].class)) {
            name = "kotlin.BooleanArray";
        } else if (clsD.equals(char[].class)) {
            name = "kotlin.CharArray";
        } else if (clsD.equals(byte[].class)) {
            name = "kotlin.ByteArray";
        } else if (clsD.equals(short[].class)) {
            name = "kotlin.ShortArray";
        } else if (clsD.equals(int[].class)) {
            name = "kotlin.IntArray";
        } else if (clsD.equals(float[].class)) {
            name = "kotlin.FloatArray";
        } else if (clsD.equals(long[].class)) {
            name = "kotlin.LongArray";
        } else {
            name = clsD.equals(double[].class) ? "kotlin.DoubleArray" : "kotlin.Array";
        }
        return x5.m(name, this.B.isEmpty() ? "" : h00.q.R0(this.B, ", ", "<", ">", new h00.a(this, 11), 24), f() ? "?" : "");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return m.a(this.A, e0Var.A) && m.a(this.B, e0Var.B) && this.C == e0Var.C;
    }

    @Override
    public final boolean f() {
        return (this.C & 1) != 0;
    }

    @Override
    public final List getAnnotations() {
        return h00.x.A;
    }

    public final int hashCode() {
        return Integer.hashCode(this.C) + g4.c.a(this.A.hashCode() * 31, 31, this.B);
    }

    @Override
    public final List r() {
        return this.B;
    }

    @Override
    public final a10.e s() {
        return this.A;
    }

    public final String toString() {
        return d(false) + " (Kotlin reflection is not available)";
    }
}

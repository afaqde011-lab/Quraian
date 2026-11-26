package a10;

import kotlin.NoWhenBranchMatchedException;

public final class z {
    public static final z c = new z(null, null);
    public final a0 a;
    public final x b;

    public z(a0 a0Var, x xVar) {
        String str;
        this.a = a0Var;
        this.b = xVar;
        if ((a0Var == null) == (xVar == null)) {
            return;
        }
        if (a0Var == null) {
            str = "Star projection must have no type specified.";
        } else {
            str = "The projection variance " + a0Var + " requires type to be specified.";
        }
        throw new IllegalArgumentException(str.toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.a == zVar.a && kotlin.jvm.internal.m.a(this.b, zVar.b);
    }

    public final int hashCode() {
        a0 a0Var = this.a;
        int iHashCode = (a0Var == null ? 0 : a0Var.hashCode()) * 31;
        x xVar = this.b;
        return iHashCode + (xVar != null ? xVar.hashCode() : 0);
    }

    public final String toString() {
        a0 a0Var = this.a;
        int i = a0Var == null ? -1 : y.a[a0Var.ordinal()];
        if (i == -1) {
            return "*";
        }
        x xVar = this.b;
        if (i == 1) {
            return String.valueOf(xVar);
        }
        if (i == 2) {
            return "in " + xVar;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return "out " + xVar;
    }
}

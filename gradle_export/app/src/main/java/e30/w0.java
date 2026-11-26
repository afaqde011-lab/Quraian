package e30;

public final class w0 extends m {
    public final String B;

    public w0(String str) {
        this.B = str;
    }

    public static void H0(int i) {
        String str = (i == 1 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 4) ? 2 : 3];
        if (i == 1) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType";
        } else if (i == 2) {
            objArr[0] = "delegate";
        } else if (i == 3) {
            objArr[0] = "kotlinTypeRefiner";
        } else if (i != 4) {
            objArr[0] = "newAttributes";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType";
        }
        if (i == 1) {
            objArr[1] = "toString";
        } else if (i != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType";
        } else {
            objArr[1] = "refine";
        }
        if (i != 1) {
            if (i == 2) {
                objArr[2] = "replaceDelegate";
            } else if (i == 3) {
                objArr[2] = "refine";
            } else if (i != 4) {
                objArr[2] = "replaceAttributes";
            }
        }
        String str2 = String.format(str, objArr);
        if (i != 1 && i != 4) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override
    public final z0 A0(f30.f fVar) {
        if (fVar != null) {
            return this;
        }
        H0(3);
        throw null;
    }

    @Override
    public final z0 B0(h0 h0Var) {
        B0(h0Var);
        throw null;
    }

    @Override
    public final a0 z0(boolean z) {
        throw new IllegalStateException(this.B);
    }

    @Override
    public final a0 B0(h0 h0Var) {
        if (h0Var != null) {
            throw new IllegalStateException(this.B);
        }
        H0(0);
        throw null;
    }

    @Override
    public final a0 E0() {
        throw new IllegalStateException(this.B);
    }

    @Override
    public final a0 A0(f30.f fVar) {
        if (fVar != null) {
            return this;
        }
        H0(3);
        throw null;
    }

    @Override
    public final m G0(a0 a0Var) {
        throw new IllegalStateException(this.B);
    }

    @Override
    public final String toString() {
        String str = this.B;
        if (str != null) {
            return str;
        }
        H0(1);
        throw null;
    }

    @Override
    public final w w0(f30.f fVar) {
        if (fVar != null) {
            return this;
        }
        H0(3);
        throw null;
    }

    @Override
    public final z0 z0(boolean z) {
        z0(z);
        throw null;
    }
}

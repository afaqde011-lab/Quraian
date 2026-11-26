package e30;

public final class f0 extends p0 {
    public final int a = 1;
    public final Object b;
    public final Object c;

    public f0(w wVar) {
        this(wVar, a1.C);
        if (wVar != null) {
        } else {
            e(2);
            throw null;
        }
    }

    public f0(w wVar, a1 a1Var) {
        if (a1Var == null) {
            e(0);
            throw null;
        }
        if (wVar == null) {
            e(1);
            throw null;
        }
        this.b = a1Var;
        this.c = wVar;
    }

    public f0(j10.r0 typeParameter) {
        kotlin.jvm.internal.m.e(typeParameter, "typeParameter");
        this.b = typeParameter;
        this.c = rd.a.I(g00.i.B, new a30.l(this, 28));
    }

    public static void e(int i) {
        String str = (i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 4 || i == 5) ? 2 : 3];
        switch (i) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "type";
                break;
            case 4:
            case 5:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
                break;
            case 6:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "projection";
                break;
        }
        if (i == 4) {
            objArr[1] = "getProjectionKind";
        } else if (i != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
        } else {
            objArr[1] = "getType";
        }
        if (i == 3) {
            objArr[2] = "replaceType";
        } else if (i != 4 && i != 5) {
            if (i != 6) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "refine";
            }
        }
        String str2 = String.format(str, objArr);
        if (i != 4 && i != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override
    public final a1 a() {
        switch (this.a) {
            case 0:
                return a1.E;
            default:
                a1 a1Var = (a1) this.b;
                if (a1Var != null) {
                    return a1Var;
                }
                e(4);
                throw null;
        }
    }

    @Override
    public final w b() {
        switch (this.a) {
            case 0:
                return (w) this.c.getValue();
            default:
                w wVar = (w) this.c;
                if (wVar != null) {
                    return wVar;
                }
                e(5);
                throw null;
        }
    }

    @Override
    public final boolean c() {
        switch (this.a) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override
    public final p0 d(f30.f kotlinTypeRefiner) {
        switch (this.a) {
            case 0:
                kotlin.jvm.internal.m.e(kotlinTypeRefiner, "kotlinTypeRefiner");
                return this;
            default:
                if (kotlinTypeRefiner == null) {
                    e(6);
                    throw null;
                }
                a1 a1Var = (a1) this.b;
                w type = (w) this.c;
                kotlinTypeRefiner.getClass();
                kotlin.jvm.internal.m.e(type, "type");
                return new f0(type, a1Var);
        }
    }
}

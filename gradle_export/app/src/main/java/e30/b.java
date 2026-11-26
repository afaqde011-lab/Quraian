package e30;

public abstract class b extends f {
    public b(d30.o oVar) {
        super(oVar);
        if (oVar != null) {
        } else {
            i(0);
            throw null;
        }
    }

    public static void i(int i) {
        String str = (i == 1 || i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 3 || i == 4) ? 2 : 3];
        if (i == 1) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        } else if (i == 2) {
            objArr[0] = "classifier";
        } else if (i == 3 || i == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        } else {
            objArr[0] = "storageManager";
        }
        if (i == 1) {
            objArr[1] = "getBuiltIns";
        } else if (i == 3 || i == 4) {
            objArr[1] = "getAdditionalNeighboursInSupertypeGraph";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        }
        if (i != 1) {
            if (i == 2) {
                objArr[2] = "isSameClassifier";
            } else if (i != 3 && i != 4) {
                objArr[2] = "<init>";
            }
        }
        String str2 = String.format(str, objArr);
        if (i != 1 && i != 3 && i != 4) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override
    public final w b() {
        j10.e eVarG = g();
        if (eVarG == null) {
            g10.i.a(107);
            throw null;
        }
        n20.e eVar = g10.i.e;
        if (g10.i.b(eVarG, g10.o.a) || g10.i.b(eVarG, g10.o.b)) {
            return null;
        }
        return d().e();
    }

    @Override
    public final g10.i d() {
        g10.i iVarE = u20.d.e(g());
        if (iVarE != null) {
            return iVarE;
        }
        i(1);
        throw null;
    }

    @Override
    public final boolean f(j10.h hVar) {
        boolean z;
        if (hVar instanceof j10.e) {
            j10.e first = g();
            kotlin.jvm.internal.m.e(first, "first");
            if (!kotlin.jvm.internal.m.a(first.getName(), hVar.getName())) {
                z = false;
                break;
            }
            j10.k kVarL = first.l();
            j10.k kVarL2 = hVar.l();
            while (true) {
                if (kVarL != null && kVarL2 != null) {
                    if (!(kVarL instanceof j10.z)) {
                        if (!(kVarL2 instanceof j10.z)) {
                            if (kVarL instanceof j10.e0) {
                                if (!(kVarL2 instanceof j10.e0) || !kotlin.jvm.internal.m.a(((m10.c0) ((j10.e0) kVarL)).F, ((m10.c0) ((j10.e0) kVarL2)).F)) {
                                    break;
                                }
                            } else if (!(kVarL2 instanceof j10.e0) && kotlin.jvm.internal.m.a(kVarL.getName(), kVarL2.getName())) {
                                kVarL = kVarL.l();
                                kVarL2 = kVarL2.l();
                            }
                        }
                        z = false;
                        break;
                    }
                    z = kVarL2 instanceof j10.z;
                    break;
                }
                z = true;
                break;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    @Override
    public abstract j10.e g();
}

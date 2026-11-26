package m10;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;

public abstract class m extends f5.c implements j10.k {
    public final n20.e C;

    public m(k10.h hVar, n20.e eVar) {
        super(hVar);
        if (hVar == null) {
            y0(0);
            throw null;
        }
        if (eVar == null) {
            y0(1);
            throw null;
        }
        this.C = eVar;
    }

    public static String W0(j10.k kVar) {
        try {
            String str = p20.h.e.w(kVar) + "[" + kVar.getClass().getSimpleName() + "@" + Integer.toHexString(System.identityHashCode(kVar)) + "]";
            if (str != null) {
                return str;
            }
            y0(5);
            throw null;
        } catch (Throwable unused) {
            String str2 = kVar.getClass().getSimpleName() + " " + kVar.getName();
            if (str2 != null) {
                return str2;
            }
            y0(6);
            throw null;
        }
    }

    public static void y0(int i) {
        String str = (i == 2 || i == 3 || i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 2 || i == 3 || i == 5 || i == 6) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = DiagnosticsEntry.NAME_KEY;
                break;
            case 2:
            case 3:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
                break;
            case 4:
                objArr[0] = "descriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        if (i == 2) {
            objArr[1] = "getName";
        } else if (i == 3) {
            objArr[1] = "getOriginal";
        } else if (i == 5 || i == 6) {
            objArr[1] = "toString";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
        }
        if (i != 2 && i != 3) {
            if (i == 4) {
                objArr[2] = "toString";
            } else if (i != 5 && i != 6) {
                objArr[2] = "<init>";
            }
        }
        String str2 = String.format(str, objArr);
        if (i != 2 && i != 3 && i != 5 && i != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public j10.k a() {
        return this;
    }

    @Override
    public final n20.e getName() {
        n20.e eVar = this.C;
        if (eVar != null) {
            return eVar;
        }
        y0(2);
        throw null;
    }

    public String toString() {
        return W0(this);
    }
}

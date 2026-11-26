package z10;

import com.revenuecat.purchases.blockstore.BlockstoreHelper;
import e30.w;
import h00.x;
import j10.k;
import j10.n0;
import j10.u;
import java.util.ArrayList;
import k10.h;
import m10.i;
import m10.t;

public final class b extends i implements a {
    public Boolean f0;
    public Boolean g0;

    public b(j10.e eVar, b bVar, h hVar, boolean z, int i, n0 n0Var) {
        super(eVar, bVar, hVar, z, i, n0Var);
        if (eVar == null) {
            y0(0);
            throw null;
        }
        if (hVar == null) {
            y0(1);
            throw null;
        }
        if (i == 0) {
            y0(2);
            throw null;
        }
        if (n0Var == null) {
            y0(3);
            throw null;
        }
        this.f0 = null;
        this.g0 = null;
    }

    public static b p1(j10.e eVar, h hVar, boolean z, o10.g gVar) {
        if (eVar != null) {
            return new b(eVar, null, hVar, z, 1, gVar);
        }
        y0(4);
        throw null;
    }

    public static void y0(int i) {
        String str = (i == 11 || i == 18) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 11 || i == 18) ? 2 : 3];
        switch (i) {
            case 1:
            case 5:
            case 9:
            case 15:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 13:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 10:
                objArr[0] = "source";
                break;
            case 4:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 7:
            case 12:
                objArr[0] = "newOwner";
                break;
            case 11:
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
                break;
            case 14:
                objArr[0] = "sourceElement";
                break;
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 17:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i == 11) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "createJavaConstructor";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 11:
            case 18:
                break;
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[2] = "createDescriptor";
                break;
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
            case 17:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 11 && i != 18) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override
    public final boolean B() {
        return this.g0.booleanValue();
    }

    @Override
    public final t a1(int i, k kVar, u uVar, n0 n0Var, h hVar, n20.e eVar) {
        return q1(kVar, uVar, i, hVar, n0Var);
    }

    @Override
    public final void g1(boolean z) {
        this.f0 = Boolean.valueOf(z);
    }

    @Override
    public final void h1(boolean z) {
        this.g0 = Boolean.valueOf(z);
    }

    @Override
    public final i a1(int i, k kVar, u uVar, n0 n0Var, h hVar, n20.e eVar) {
        return q1(kVar, uVar, i, hVar, n0Var);
    }

    public final b q1(k kVar, u uVar, int i, h hVar, n0 n0Var) {
        if (kVar == null) {
            y0(7);
            throw null;
        }
        if (i == 0) {
            y0(8);
            throw null;
        }
        if (hVar == null) {
            y0(9);
            throw null;
        }
        if (n0Var == null) {
            y0(10);
            throw null;
        }
        if (i != 1 && i != 4) {
            throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + kVar + "\nkind: " + g4.c.u(i));
        }
        j10.e eVar = (j10.e) kVar;
        b bVar = (b) uVar;
        if (i == 0) {
            y0(13);
            throw null;
        }
        b bVar2 = new b(eVar, bVar, hVar, this.e0, i, n0Var);
        Boolean bool = this.f0;
        bool.getClass();
        bVar2.f0 = bool;
        Boolean bool2 = this.g0;
        bool2.getClass();
        bVar2.g0 = bool2;
        return bVar2;
    }

    @Override
    public final a r0(w wVar, ArrayList arrayList, w wVar2, g00.k kVar) {
        b bVarQ1 = q1(l(), null, getKind(), getAnnotations(), o());
        bVarQ1.d1(wVar == null ? null : q20.k.k(bVarQ1, wVar, k10.g.a), this.K, x.A, getTypeParameters(), bi.b.w(arrayList, O(), bVarQ1), wVar2, g(), getVisibility());
        if (kVar != null) {
            bVarQ1.f1((j10.a) kVar.A, kVar.B);
        }
        return bVarQ1;
    }
}

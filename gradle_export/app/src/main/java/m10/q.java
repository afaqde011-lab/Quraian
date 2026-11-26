package m10;

import com.revenuecat.purchases.blockstore.BlockstoreHelper;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public final class q extends j {
    public final e30.i G;
    public final p H;
    public final d30.m I;
    public final k10.h J;

    public q(d30.o oVar, j10.e eVar, e30.a0 a0Var, n20.e eVar2, d30.m mVar, k10.h hVar, j10.n0 n0Var) {
        super(oVar, eVar, eVar2, n0Var);
        if (oVar == null) {
            P(6);
            throw null;
        }
        if (eVar == null) {
            P(7);
            throw null;
        }
        if (a0Var == null) {
            P(8);
            throw null;
        }
        if (eVar2 == null) {
            P(9);
            throw null;
        }
        if (mVar == null) {
            P(10);
            throw null;
        }
        this.J = hVar;
        this.G = new e30.i(this, Collections.EMPTY_LIST, Collections.singleton(a0Var), oVar);
        this.H = new p(this, oVar);
        this.I = mVar;
    }

    public static void P(int i) {
        String str;
        int i2;
        switch (i) {
            case 14:
            case 15:
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 14:
            case 15:
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "enumClass";
                break;
            case 2:
            case 9:
                objArr[0] = DiagnosticsEntry.NAME_KEY;
                break;
            case 3:
            case 10:
                objArr[0] = "enumMemberNames";
                break;
            case 4:
            case 11:
                objArr[0] = "annotations";
                break;
            case 5:
            case 12:
                objArr[0] = "source";
                break;
            case 6:
            default:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "containingClass";
                break;
            case 8:
                objArr[0] = "supertype";
                break;
            case 13:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 14:
            case 15:
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i) {
            case 14:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 15:
                objArr[1] = "getStaticScope";
                break;
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                objArr[1] = "getConstructors";
                break;
            case 17:
                objArr[1] = "getTypeConstructor";
                break;
            case 18:
                objArr[1] = "getKind";
                break;
            case 19:
                objArr[1] = "getModality";
                break;
            case 20:
                objArr[1] = "getVisibility";
                break;
            case 21:
                objArr[1] = "getAnnotations";
                break;
            case 22:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 23:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "<init>";
                break;
            case 13:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            case 14:
            case 15:
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                break;
            default:
                objArr[2] = "create";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 14:
            case 15:
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static q e0(d30.o oVar, j10.e eVar, n20.e eVar2, d30.i iVar, k10.h hVar, j10.n0 n0Var) {
        if (oVar == null) {
            P(0);
            throw null;
        }
        if (eVar == null) {
            P(1);
            throw null;
        }
        if (eVar2 == null) {
            P(2);
            throw null;
        }
        if (iVar != null) {
            return new q(oVar, eVar, eVar.n(), eVar2, iVar, hVar, n0Var);
        }
        P(3);
        throw null;
    }

    @Override
    public final x20.n C(f30.f fVar) {
        p pVar = this.H;
        if (pVar != null) {
            return pVar;
        }
        P(14);
        throw null;
    }

    @Override
    public final boolean E() {
        return false;
    }

    @Override
    public final i J() {
        return null;
    }

    @Override
    public final x20.n K() {
        return x20.m.b;
    }

    @Override
    public final e30.m0 f() {
        e30.i iVar = this.G;
        if (iVar != null) {
            return iVar;
        }
        P(17);
        throw null;
    }

    @Override
    public final j10.y g() {
        return j10.y.B;
    }

    @Override
    public final k10.h getAnnotations() {
        k10.h hVar = this.J;
        if (hVar != null) {
            return hVar;
        }
        P(21);
        throw null;
    }

    @Override
    public final j10.f getKind() {
        return j10.f.D;
    }

    @Override
    public final j10.o getVisibility() {
        j10.o oVar = j10.p.e;
        if (oVar != null) {
            return oVar;
        }
        P(20);
        throw null;
    }

    @Override
    public final Collection i() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        P(16);
        throw null;
    }

    @Override
    public final boolean isInline() {
        return false;
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final j10.s0 j0() {
        return null;
    }

    @Override
    public final boolean k() {
        return false;
    }

    @Override
    public final List p() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        P(22);
        throw null;
    }

    @Override
    public final boolean p0() {
        return false;
    }

    @Override
    public final boolean s() {
        return false;
    }

    public final String toString() {
        return "enum entry " + getName();
    }

    @Override
    public final boolean v0() {
        return false;
    }

    @Override
    public final boolean y() {
        return false;
    }
}

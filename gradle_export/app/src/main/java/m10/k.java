package m10;

import com.revenuecat.purchases.blockstore.BlockstoreHelper;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class k extends j {
    public final j10.y G;
    public final j10.f H;
    public final e30.i I;
    public x20.n J;
    public Set K;
    public i L;

    public k(j10.k kVar, n20.e eVar, j10.y yVar, j10.f fVar, List list, d30.o oVar) {
        super(oVar, kVar, eVar, j10.n0.n);
        if (kVar == null) {
            P(0);
            throw null;
        }
        if (eVar == null) {
            P(1);
            throw null;
        }
        if (oVar == null) {
            P(6);
            throw null;
        }
        this.G = yVar;
        this.H = fVar;
        this.I = new e30.i(this, Collections.EMPTY_LIST, list, oVar);
    }

    public static void P(int i) {
        String str;
        int i2;
        switch (i) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
            case 17:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
            case 17:
            case 18:
            case 19:
                i2 = 2;
                break;
            case 12:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = DiagnosticsEntry.NAME_KEY;
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "supertypes";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "unsubstitutedMemberScope";
                break;
            case 8:
                objArr[0] = "constructors";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 12:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 9:
                objArr[1] = "getAnnotations";
                break;
            case 10:
                objArr[1] = "getTypeConstructor";
                break;
            case 11:
                objArr[1] = "getConstructors";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 13:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 14:
                objArr[1] = "getStaticScope";
                break;
            case 15:
                objArr[1] = "getKind";
                break;
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                objArr[1] = "getModality";
                break;
            case 17:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i) {
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
            case 17:
            case 18:
            case 19:
                break;
            case 12:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
            case 17:
            case 18:
            case 19:
                throw new IllegalStateException(str2);
            case 12:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override
    public final x20.n C(f30.f fVar) {
        x20.n nVar = this.J;
        if (nVar != null) {
            return nVar;
        }
        P(13);
        throw null;
    }

    @Override
    public final boolean E() {
        return false;
    }

    @Override
    public final i J() {
        return this.L;
    }

    @Override
    public final x20.n K() {
        return x20.m.b;
    }

    public final void e0(x20.n nVar, Set set, i iVar) {
        this.J = nVar;
        this.K = set;
        this.L = iVar;
    }

    @Override
    public final e30.m0 f() {
        e30.i iVar = this.I;
        if (iVar != null) {
            return iVar;
        }
        P(10);
        throw null;
    }

    @Override
    public final j10.y g() {
        j10.y yVar = this.G;
        if (yVar != null) {
            return yVar;
        }
        P(16);
        throw null;
    }

    @Override
    public final k10.h getAnnotations() {
        return k10.g.a;
    }

    @Override
    public final j10.f getKind() {
        j10.f fVar = this.H;
        if (fVar != null) {
            return fVar;
        }
        P(15);
        throw null;
    }

    @Override
    public final j10.o getVisibility() {
        j10.o oVar = j10.p.e;
        if (oVar != null) {
            return oVar;
        }
        P(17);
        throw null;
    }

    @Override
    public final Collection i() {
        Set set = this.K;
        if (set != null) {
            return set;
        }
        P(11);
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
        P(18);
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

    public String toString() {
        return "class " + getName();
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

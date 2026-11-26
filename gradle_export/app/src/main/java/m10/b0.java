package m10;

import com.revenuecat.purchases.blockstore.BlockstoreHelper;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public final class b0 extends j {
    public final j10.f G;
    public j10.y H;
    public j10.o I;
    public e30.i J;
    public ArrayList K;
    public final ArrayList L;
    public final d30.o M;

    public b0(i10.m mVar, n20.e eVar, d30.o oVar) {
        super(oVar, mVar, eVar, j10.n0.n);
        j10.f fVar = j10.f.B;
        if (oVar == null) {
            P(4);
            throw null;
        }
        this.L = new ArrayList();
        this.M = oVar;
        this.G = fVar;
    }

    public static void P(int i) {
        String str;
        int i2;
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                i2 = 2;
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "kind";
                break;
            case 2:
                objArr[0] = DiagnosticsEntry.NAME_KEY;
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 6:
                objArr[0] = "modality";
                break;
            case 9:
                objArr[0] = "visibility";
                break;
            case 12:
                objArr[0] = "supertype";
                break;
            case 14:
                objArr[0] = "typeParameters";
                break;
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 5:
                objArr[1] = "getAnnotations";
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 7:
                objArr[1] = "getModality";
                break;
            case 8:
                objArr[1] = "getKind";
                break;
            case 10:
                objArr[1] = "getVisibility";
                break;
            case 11:
                objArr[1] = "getTypeConstructor";
                break;
            case 13:
                objArr[1] = "getConstructors";
                break;
            case 15:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 17:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 18:
                objArr[1] = "getStaticScope";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                break;
            case 6:
                objArr[2] = "setModality";
                break;
            case 9:
                objArr[2] = "setVisibility";
                break;
            case 12:
                objArr[2] = "addSupertype";
                break;
            case 14:
                objArr[2] = "setTypeParameterDescriptors";
                break;
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                throw new IllegalStateException(str2);
            case 6:
            case 9:
            case 12:
            case 14:
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override
    public final x20.n C(f30.f fVar) {
        return x20.m.b;
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
        e30.i iVar = this.J;
        if (iVar != null) {
            return iVar;
        }
        P(11);
        throw null;
    }

    @Override
    public final j10.y g() {
        j10.y yVar = this.H;
        if (yVar != null) {
            return yVar;
        }
        P(7);
        throw null;
    }

    @Override
    public final k10.h getAnnotations() {
        return k10.g.a;
    }

    @Override
    public final j10.f getKind() {
        j10.f fVar = this.G;
        if (fVar != null) {
            return fVar;
        }
        P(8);
        throw null;
    }

    @Override
    public final j10.o getVisibility() {
        j10.o oVar = this.I;
        if (oVar != null) {
            return oVar;
        }
        P(10);
        throw null;
    }

    @Override
    public final Collection i() {
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        P(13);
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
        ArrayList arrayList = this.K;
        if (arrayList != null) {
            return arrayList;
        }
        P(15);
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
        return m.W0(this);
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

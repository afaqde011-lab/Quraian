package m10;

import com.revenuecat.purchases.blockstore.BlockstoreHelper;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.LinkedHashMap;
import java.util.List;

public final class s implements j10.t {
    public e30.s0 A;
    public j10.k B;
    public j10.y C;
    public j10.o D;
    public j10.u E;
    public int F;
    public List G;
    public final List H;
    public u I;
    public u J;
    public e30.w K;
    public n20.e L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public h00.x R;
    public k10.h S;
    public boolean T;
    public final LinkedHashMap U;
    public Boolean V;
    public boolean W;
    public final t X;

    public s(t tVar, e30.s0 s0Var, j10.k kVar, j10.y yVar, j10.o oVar, int i, List list, List list2, u uVar, e30.w wVar) {
        if (s0Var == null) {
            b(0);
            throw null;
        }
        if (kVar == null) {
            b(1);
            throw null;
        }
        if (yVar == null) {
            b(2);
            throw null;
        }
        if (oVar == null) {
            b(3);
            throw null;
        }
        if (i == 0) {
            b(4);
            throw null;
        }
        if (list == null) {
            b(5);
            throw null;
        }
        if (list2 == null) {
            b(6);
            throw null;
        }
        if (wVar == null) {
            b(7);
            throw null;
        }
        this.X = tVar;
        this.E = null;
        this.J = tVar.K;
        this.M = true;
        this.N = false;
        this.O = false;
        this.P = false;
        this.Q = tVar.T;
        this.R = null;
        this.S = null;
        this.T = tVar.U;
        this.U = new LinkedHashMap();
        this.V = null;
        this.W = false;
        this.A = s0Var;
        this.B = kVar;
        this.C = yVar;
        this.D = oVar;
        this.F = i;
        this.G = list;
        this.H = list2;
        this.I = uVar;
        this.K = wVar;
        this.L = null;
    }

    public static void b(int i) {
        String str;
        int i2;
        switch (i) {
            case 9:
            case 11:
            case 13:
            case 15:
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
            case 18:
            case 20:
            case 22:
            case 24:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 36:
            case 38:
            case 40:
            case 41:
            case 42:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 10:
            case 12:
            case 14:
            case 17:
            case 19:
            case 21:
            case 23:
            case 25:
            case 35:
            case 37:
            case 39:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 9:
            case 11:
            case 13:
            case 15:
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
            case 18:
            case 20:
            case 22:
            case 24:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 36:
            case 38:
            case 40:
            case 41:
            case 42:
                i2 = 2;
                break;
            case 10:
            case 12:
            case 14:
            case 17:
            case 19:
            case 21:
            case 23:
            case 25:
            case 35:
            case 37:
            case 39:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "newOwner";
                break;
            case 2:
                objArr[0] = "newModality";
                break;
            case 3:
                objArr[0] = "newVisibility";
                break;
            case 4:
            case 14:
                objArr[0] = "kind";
                break;
            case 5:
                objArr[0] = "newValueParameterDescriptors";
                break;
            case 6:
                objArr[0] = "newContextReceiverParameters";
                break;
            case 7:
                objArr[0] = "newReturnType";
                break;
            case 8:
                objArr[0] = "owner";
                break;
            case 9:
            case 11:
            case 13:
            case 15:
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
            case 18:
            case 20:
            case 22:
            case 24:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 36:
            case 38:
            case 40:
            case 41:
            case 42:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                break;
            case 10:
                objArr[0] = "modality";
                break;
            case 12:
                objArr[0] = "visibility";
                break;
            case 17:
                objArr[0] = DiagnosticsEntry.NAME_KEY;
                break;
            case 19:
            case 21:
                objArr[0] = "parameters";
                break;
            case 23:
                objArr[0] = "type";
                break;
            case 25:
                objArr[0] = "contextReceiverParameters";
                break;
            case 35:
                objArr[0] = "additionalAnnotations";
                break;
            case 37:
            default:
                objArr[0] = "substitution";
                break;
            case 39:
                objArr[0] = "userDataKey";
                break;
        }
        switch (i) {
            case 9:
                objArr[1] = "setOwner";
                break;
            case 10:
            case 12:
            case 14:
            case 17:
            case 19:
            case 21:
            case 23:
            case 25:
            case 35:
            case 37:
            case 39:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                break;
            case 11:
                objArr[1] = "setModality";
                break;
            case 13:
                objArr[1] = "setVisibility";
                break;
            case 15:
                objArr[1] = "setKind";
                break;
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                objArr[1] = "setCopyOverrides";
                break;
            case 18:
                objArr[1] = "setName";
                break;
            case 20:
                objArr[1] = "setValueParameters";
                break;
            case 22:
                objArr[1] = "setTypeParameters";
                break;
            case 24:
                objArr[1] = "setReturnType";
                break;
            case 26:
                objArr[1] = "setContextReceiverParameters";
                break;
            case 27:
                objArr[1] = "setExtensionReceiverParameter";
                break;
            case 28:
                objArr[1] = "setDispatchReceiverParameter";
                break;
            case 29:
                objArr[1] = "setOriginal";
                break;
            case 30:
                objArr[1] = "setSignatureChange";
                break;
            case 31:
                objArr[1] = "setPreserveSourceElement";
                break;
            case 32:
                objArr[1] = "setDropOriginalInContainingParts";
                break;
            case 33:
                objArr[1] = "setHiddenToOvercomeSignatureClash";
                break;
            case 34:
                objArr[1] = "setHiddenForResolutionEverywhereBesideSupercalls";
                break;
            case 36:
                objArr[1] = "setAdditionalAnnotations";
                break;
            case 38:
                objArr[1] = "setSubstitution";
                break;
            case 40:
                objArr[1] = "putUserData";
                break;
            case 41:
                objArr[1] = "getSubstitution";
                break;
            case 42:
                objArr[1] = "setJustForTypeSubstitution";
                break;
        }
        switch (i) {
            case 8:
                objArr[2] = "setOwner";
                break;
            case 9:
            case 11:
            case 13:
            case 15:
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
            case 18:
            case 20:
            case 22:
            case 24:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 36:
            case 38:
            case 40:
            case 41:
            case 42:
                break;
            case 10:
                objArr[2] = "setModality";
                break;
            case 12:
                objArr[2] = "setVisibility";
                break;
            case 14:
                objArr[2] = "setKind";
                break;
            case 17:
                objArr[2] = "setName";
                break;
            case 19:
                objArr[2] = "setValueParameters";
                break;
            case 21:
                objArr[2] = "setTypeParameters";
                break;
            case 23:
                objArr[2] = "setReturnType";
                break;
            case 25:
                objArr[2] = "setContextReceiverParameters";
                break;
            case 35:
                objArr[2] = "setAdditionalAnnotations";
                break;
            case 37:
                objArr[2] = "setSubstitution";
                break;
            case 39:
                objArr[2] = "putUserData";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 9:
            case 11:
            case 13:
            case 15:
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
            case 18:
            case 20:
            case 22:
            case 24:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 36:
            case 38:
            case 40:
            case 41:
            case 42:
                throw new IllegalStateException(str2);
            case 10:
            case 12:
            case 14:
            case 17:
            case 19:
            case 21:
            case 23:
            case 25:
            case 35:
            case 37:
            case 39:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override
    public final j10.t a(j10.o oVar) {
        if (oVar != null) {
            this.D = oVar;
            return this;
        }
        b(12);
        throw null;
    }

    @Override
    public final j10.u build() {
        return this.X.b1(this);
    }

    @Override
    public final j10.t c(e30.w wVar) {
        if (wVar != null) {
            this.K = wVar;
            return this;
        }
        b(23);
        throw null;
    }

    @Override
    public final j10.t d(List list) {
        this.G = list;
        return this;
    }

    @Override
    public final j10.t e(n20.e eVar) {
        if (eVar != null) {
            this.L = eVar;
            return this;
        }
        b(17);
        throw null;
    }

    @Override
    public final j10.t f(u uVar) {
        this.J = uVar;
        return this;
    }

    @Override
    public final j10.t h(int i) {
        if (i != 0) {
            this.F = i;
            return this;
        }
        b(14);
        throw null;
    }

    @Override
    public final j10.t i() {
        this.O = true;
        return this;
    }

    @Override
    public final j10.t m() {
        this.U.put(z10.e.h0, Boolean.TRUE);
        return this;
    }

    @Override
    public final j10.t n() {
        this.T = true;
        return this;
    }

    @Override
    public final j10.t o(j10.k kVar) {
        if (kVar != null) {
            this.B = kVar;
            return this;
        }
        b(8);
        throw null;
    }

    @Override
    public final j10.t p(k10.h hVar) {
        if (hVar != null) {
            this.S = hVar;
            return this;
        }
        b(35);
        throw null;
    }

    @Override
    public final j10.t q() {
        this.M = false;
        return this;
    }

    @Override
    public final j10.t s() {
        this.R = h00.x.A;
        return this;
    }

    @Override
    public final j10.t t() {
        this.Q = true;
        return this;
    }

    @Override
    public final j10.t u(j10.y yVar) {
        if (yVar != null) {
            this.C = yVar;
            return this;
        }
        b(10);
        throw null;
    }

    @Override
    public final j10.t v() {
        this.N = true;
        return this;
    }
}

package m10;

import com.revenuecat.purchases.blockstore.BlockstoreHelper;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import e30.u0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class i0 extends s0 implements j10.l0 {
    public final boolean G;
    public d30.h H;
    public u00.a I;
    public final j10.y J;
    public j10.o K;
    public Collection L;
    public final j10.l0 M;
    public final int N;
    public final boolean O;
    public final boolean P;
    public final boolean Q;
    public final boolean R;
    public final boolean S;
    public List T;
    public u U;
    public u V;
    public ArrayList W;
    public j0 X;
    public k0 Y;
    public r Z;
    public r a0;

    public i0(j10.k kVar, j10.l0 l0Var, k10.h hVar, j10.y yVar, j10.o oVar, boolean z, n20.e eVar, int i, j10.n0 n0Var, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        super(kVar, hVar, eVar, null, n0Var);
        if (kVar == null) {
            y0(0);
            throw null;
        }
        if (hVar == null) {
            y0(1);
            throw null;
        }
        if (yVar == null) {
            y0(2);
            throw null;
        }
        if (oVar == null) {
            y0(3);
            throw null;
        }
        if (eVar == null) {
            y0(4);
            throw null;
        }
        if (i == 0) {
            y0(5);
            throw null;
        }
        if (n0Var == null) {
            y0(6);
            throw null;
        }
        this.G = z;
        this.L = null;
        this.T = Collections.EMPTY_LIST;
        this.J = yVar;
        this.K = oVar;
        this.M = l0Var == null ? this : l0Var;
        this.N = i;
        this.O = z2;
        this.P = z3;
        this.Q = z4;
        this.R = z5;
        this.S = z6;
    }

    public static i0 Z0(j10.k kVar, j10.y yVar, j10.o oVar, boolean z, n20.e eVar, int i, j10.n0 n0Var) {
        if (kVar == null) {
            y0(7);
            throw null;
        }
        if (oVar == null) {
            y0(10);
            throw null;
        }
        if (eVar == null) {
            y0(11);
            throw null;
        }
        if (i == 0) {
            y0(12);
            throw null;
        }
        if (n0Var != null) {
            return new i0(kVar, null, k10.g.a, yVar, oVar, z, eVar, i, n0Var, false, false, false, false, false);
        }
        y0(13);
        throw null;
    }

    public static j10.u b1(u0 u0Var, j10.k0 k0Var) {
        if (k0Var == null) {
            y0(31);
            throw null;
        }
        j10.u uVar = ((g0) k0Var).M;
        if (uVar != null) {
            return uVar.e(u0Var);
        }
        return null;
    }

    public static void y0(int i) {
        String str;
        int i2;
        if (i != 28 && i != 38 && i != 39 && i != 41 && i != 42) {
            switch (i) {
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 28 && i != 38 && i != 39 && i != 41 && i != 42) {
            switch (i) {
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                    i2 = 2;
                    break;
                default:
                    i2 = 3;
                    break;
            }
        } else {
            i2 = 2;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
                objArr[0] = "modality";
                break;
            case 3:
            case 10:
            case 20:
                objArr[0] = "visibility";
                break;
            case 4:
            case 11:
                objArr[0] = DiagnosticsEntry.NAME_KEY;
                break;
            case 5:
            case 12:
            case 35:
                objArr[0] = "kind";
                break;
            case 6:
            case 13:
            case 37:
                objArr[0] = "source";
                break;
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 14:
                objArr[0] = "inType";
                break;
            case 15:
            case 17:
                objArr[0] = "outType";
                break;
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
            case 18:
                objArr[0] = "typeParameters";
                break;
            case 19:
                objArr[0] = "contextReceiverParameters";
                break;
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 28:
            case 38:
            case 39:
            case 41:
            case 42:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl";
                break;
            case 27:
                objArr[0] = "originalSubstitutor";
                break;
            case 29:
                objArr[0] = "copyConfiguration";
                break;
            case 30:
                objArr[0] = "substitutor";
                break;
            case 31:
                objArr[0] = "accessorDescriptor";
                break;
            case 32:
                objArr[0] = "newOwner";
                break;
            case 33:
                objArr[0] = "newModality";
                break;
            case 34:
                objArr[0] = "newVisibility";
                break;
            case 36:
                objArr[0] = "newName";
                break;
            case 40:
                objArr[0] = "overriddenDescriptors";
                break;
        }
        if (i == 28) {
            objArr[1] = "getSourceToUseForCopy";
        } else if (i == 38) {
            objArr[1] = "getOriginal";
        } else if (i == 39) {
            objArr[1] = "getKind";
        } else if (i == 41) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i != 42) {
            switch (i) {
                case 21:
                    objArr[1] = "getTypeParameters";
                    break;
                case 22:
                    objArr[1] = "getContextReceiverParameters";
                    break;
                case 23:
                    objArr[1] = "getReturnType";
                    break;
                case 24:
                    objArr[1] = "getModality";
                    break;
                case 25:
                    objArr[1] = "getVisibility";
                    break;
                case 26:
                    objArr[1] = "getAccessors";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl";
                    break;
            }
        } else {
            objArr[1] = "copy";
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[2] = "create";
                break;
            case 14:
                objArr[2] = "setInType";
                break;
            case 15:
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
            case 17:
            case 18:
            case 19:
                objArr[2] = "setType";
                break;
            case 20:
                objArr[2] = "setVisibility";
                break;
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 28:
            case 38:
            case 39:
            case 41:
            case 42:
                break;
            case 27:
                objArr[2] = "substitute";
                break;
            case 29:
                objArr[2] = "doSubstitute";
                break;
            case 30:
            case 31:
                objArr[2] = "getSubstitutedInitialSignatureDescriptor";
                break;
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 40:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 28 && i != 38 && i != 39 && i != 41 && i != 42) {
            switch (i) {
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    @Override
    public final boolean E() {
        return this.Q;
    }

    @Override
    public final Object G(j10.m mVar, Object obj) {
        return mVar.i(this, obj);
    }

    @Override
    public final boolean H() {
        return this.S;
    }

    @Override
    public final s20.g M() {
        d30.h hVar = this.H;
        if (hVar != null) {
            return (s20.g) hVar.invoke();
        }
        return null;
    }

    @Override
    public final u T() {
        return this.U;
    }

    @Override
    public final boolean W() {
        return this.G;
    }

    @Override
    public final u X() {
        return this.V;
    }

    @Override
    public final r Y() {
        return this.a0;
    }

    @Override
    public final i0 r(j10.k kVar, j10.y yVar, j10.o oVar) {
        h0 h0Var = new h0(this);
        if (kVar == null) {
            h0.a(0);
            throw null;
        }
        h0Var.a = kVar;
        h0Var.d = null;
        h0Var.b = yVar;
        if (oVar == null) {
            h0.a(8);
            throw null;
        }
        h0Var.c = oVar;
        h0Var.e = 2;
        h0Var.g = false;
        i0 i0VarB = h0Var.b();
        if (i0VarB != null) {
            return i0VarB;
        }
        y0(42);
        throw null;
    }

    @Override
    public final j10.l0 a() {
        j10.l0 l0Var = this.M;
        ?? A = this;
        if (l0Var != this) {
            A = l0Var.a();
        }
        if (A != 0) {
            return A;
        }
        y0(38);
        throw null;
    }

    @Override
    public final r a0() {
        return this.Z;
    }

    public i0 a1(j10.k kVar, j10.y yVar, j10.o oVar, j10.l0 l0Var, int i, n20.e eVar) {
        if (kVar == null) {
            y0(32);
            throw null;
        }
        if (yVar == null) {
            y0(33);
            throw null;
        }
        if (oVar == null) {
            y0(34);
            throw null;
        }
        if (i == 0) {
            y0(35);
            throw null;
        }
        if (eVar == null) {
            y0(36);
            throw null;
        }
        return new i0(kVar, l0Var, getAnnotations(), yVar, oVar, this.G, eVar, i, j10.n0.n, this.O, u(), this.Q, isExternal(), this.S);
    }

    @Override
    public final j0 b() {
        return this.X;
    }

    @Override
    public final List b0() {
        List list = this.T;
        if (list != null) {
            return list;
        }
        y0(22);
        throw null;
    }

    @Override
    public final k0 c() {
        return this.Y;
    }

    @Override
    public final boolean c0() {
        return this.O;
    }

    public final void c1(j0 j0Var, k0 k0Var, r rVar, r rVar2) {
        this.X = j0Var;
        this.Y = k0Var;
        this.Z = rVar;
        this.a0 = rVar2;
    }

    public final void d1(d30.h hVar, u00.a aVar) {
        if (aVar == null) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "compileTimeInitializerFactory", "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorWithInitializerImpl", "setCompileTimeInitializer"));
        }
        this.I = aVar;
        if (hVar == null) {
            hVar = (d30.h) aVar.invoke();
        }
        this.H = hVar;
    }

    @Override
    public final j10.l0 e(u0 u0Var) {
        if (u0Var == null) {
            y0(27);
            throw null;
        }
        if (u0Var.a.e()) {
            return this;
        }
        h0 h0Var = new h0(this);
        e30.s0 s0VarF = u0Var.f();
        if (s0VarF == null) {
            h0.a(15);
            throw null;
        }
        h0Var.f = s0VarF;
        h0Var.d = a();
        return h0Var.b();
    }

    public void e1(e30.w wVar) {
    }

    public final void f1(e30.w wVar, List list, u uVar, u uVar2, List list2) {
        if (wVar == null) {
            y0(17);
            throw null;
        }
        if (list == null) {
            y0(18);
            throw null;
        }
        if (list2 == null) {
            y0(19);
            throw null;
        }
        this.F = wVar;
        this.W = new ArrayList(list);
        this.V = uVar2;
        this.U = uVar;
        this.T = list2;
    }

    @Override
    public final j10.y g() {
        j10.y yVar = this.J;
        if (yVar != null) {
            return yVar;
        }
        y0(24);
        throw null;
    }

    @Override
    public final int getKind() {
        int i = this.N;
        if (i != 0) {
            return i;
        }
        y0(39);
        throw null;
    }

    @Override
    public final e30.w getReturnType() {
        e30.w type = getType();
        if (type != null) {
            return type;
        }
        y0(23);
        throw null;
    }

    @Override
    public final List getTypeParameters() {
        ArrayList arrayList = this.W;
        if (arrayList != null) {
            return arrayList;
        }
        throw new IllegalStateException("typeParameters == null for " + this);
    }

    @Override
    public final j10.o getVisibility() {
        j10.o oVar = this.K;
        if (oVar != null) {
            return oVar;
        }
        y0(25);
        throw null;
    }

    @Override
    public final void h0(Collection collection) {
        if (collection != null) {
            this.L = collection;
        } else {
            y0(40);
            throw null;
        }
    }

    public boolean isExternal() {
        return this.R;
    }

    @Override
    public final Collection m() {
        Collection collection = this.L;
        if (collection == null) {
            collection = Collections.EMPTY_LIST;
        }
        if (collection != null) {
            return collection;
        }
        y0(41);
        throw null;
    }

    @Override
    public final boolean p0() {
        return false;
    }

    @Override
    public final ArrayList q() {
        ArrayList arrayList = new ArrayList(2);
        j0 j0Var = this.X;
        if (j0Var != null) {
            arrayList.add(j0Var);
        }
        k0 k0Var = this.Y;
        if (k0Var != null) {
            arrayList.add(k0Var);
        }
        return arrayList;
    }

    @Override
    public Object q0(j10.a aVar) {
        return null;
    }

    @Override
    public boolean u() {
        return this.P;
    }
}

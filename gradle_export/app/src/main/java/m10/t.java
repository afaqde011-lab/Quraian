package m10;

import com.revenuecat.purchases.blockstore.BlockstoreHelper;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import e30.a1;
import e30.u0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract class t extends n implements j10.u {
    public List F;
    public List G;
    public e30.w H;
    public List I;
    public u J;
    public u K;
    public j10.y L;
    public j10.o M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean X;
    public Collection Y;
    public volatile a20.a Z;
    public final j10.u a0;
    public final int b0;
    public j10.u c0;
    public Map d0;

    public t(int i, j10.k kVar, j10.u uVar, j10.n0 n0Var, k10.h hVar, n20.e eVar) {
        super(kVar, hVar, eVar, n0Var);
        if (kVar == null) {
            y0(0);
            throw null;
        }
        if (hVar == null) {
            y0(1);
            throw null;
        }
        if (eVar == null) {
            y0(2);
            throw null;
        }
        if (i == 0) {
            y0(3);
            throw null;
        }
        if (n0Var == null) {
            y0(4);
            throw null;
        }
        this.M = j10.p.i;
        this.N = false;
        this.O = false;
        this.P = false;
        this.Q = false;
        this.R = false;
        this.S = false;
        this.T = false;
        this.U = false;
        this.V = false;
        this.W = true;
        this.X = false;
        this.Y = null;
        this.Z = null;
        this.c0 = null;
        this.d0 = null;
        this.a0 = uVar == null ? this : uVar;
        this.b0 = i;
    }

    public static ArrayList c1(j10.u uVar, List list, u0 u0Var, boolean z, boolean z2, boolean[] zArr) {
        j10.j0 q0Var;
        if (list == null) {
            y0(30);
            throw null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            r0 r0Var = (r0) it.next();
            r0 r0Var2 = r0Var;
            e30.w type = r0Var2.getType();
            a1 a1Var = a1.D;
            e30.w wVarI = u0Var.i(type, a1Var);
            e30.w wVar = r0Var.K;
            e30.w wVarI2 = wVar == null ? null : u0Var.i(wVar, a1Var);
            if (wVarI == null) {
                return null;
            }
            if ((wVarI != r0Var2.getType() || wVar != wVarI2) && zArr != null) {
                zArr[0] = true;
            }
            f20.a aVar = r0Var instanceof q0 ? new f20.a((List) ((q0) r0Var).M.getValue()) : null;
            r0 r0Var3 = z ? null : r0Var;
            int i = r0Var.G;
            k10.h annotations = r0Var.getAnnotations();
            n20.e name = r0Var.getName();
            boolean zZ0 = r0Var.Z0();
            boolean z3 = r0Var.I;
            boolean z4 = r0Var.J;
            j10.n0 source = z2 ? r0Var.o() : j10.n0.n;
            kotlin.jvm.internal.m.e(annotations, "annotations");
            kotlin.jvm.internal.m.e(name, "name");
            kotlin.jvm.internal.m.e(source, "source");
            if (aVar == null) {
                q0Var = new r0(uVar, r0Var3, i, annotations, name, wVarI, zZ0, z3, z4, wVarI2, source);
            } else {
                q0Var = new q0(uVar, r0Var3, i, annotations, name, wVarI, zZ0, z3, z4, wVarI2, source, aVar);
            }
            arrayList.add(q0Var);
        }
        return arrayList;
    }

    public static void y0(int i) {
        String str;
        int i2;
        switch (i) {
            case 9:
            case 13:
            case 14:
            case 15:
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 9:
            case 13:
            case 14:
            case 15:
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                i2 = 2;
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = DiagnosticsEntry.NAME_KEY;
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "source";
                break;
            case 5:
                objArr[0] = "contextReceiverParameters";
                break;
            case 6:
                objArr[0] = "typeParameters";
                break;
            case 7:
            case 28:
            case 30:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 8:
            case 10:
                objArr[0] = "visibility";
                break;
            case 9:
            case 13:
            case 14:
            case 15:
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 11:
                objArr[0] = "unsubstitutedReturnType";
                break;
            case 12:
                objArr[0] = "extensionReceiverParameter";
                break;
            case 17:
                objArr[0] = "overriddenDescriptors";
                break;
            case 22:
                objArr[0] = "originalSubstitutor";
                break;
            case 24:
            case 29:
            case 31:
                objArr[0] = "substitutor";
                break;
            case 25:
                objArr[0] = "configuration";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 9:
                objArr[1] = "initialize";
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 13:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 14:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 15:
                objArr[1] = "getModality";
                break;
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getTypeParameters";
                break;
            case 19:
                objArr[1] = "getValueParameters";
                break;
            case 20:
                objArr[1] = "getOriginal";
                break;
            case 21:
                objArr[1] = "getKind";
                break;
            case 23:
                objArr[1] = "newCopyBuilder";
                break;
            case 26:
                objArr[1] = "copy";
                break;
            case 27:
                objArr[1] = "getSourceToUseForCopy";
                break;
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 13:
            case 14:
            case 15:
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                break;
            case 10:
                objArr[2] = "setVisibility";
                break;
            case 11:
                objArr[2] = "setReturnType";
                break;
            case 12:
                objArr[2] = "setExtensionReceiverParameter";
                break;
            case 17:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case 22:
                objArr[2] = "substitute";
                break;
            case 24:
                objArr[2] = "newCopyBuilder";
                break;
            case 25:
                objArr[2] = "doSubstitute";
                break;
            case 28:
            case 29:
            case 30:
            case 31:
                objArr[2] = "getSubstitutedValueParameters";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 9:
            case 13:
            case 14:
            case 15:
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                throw new IllegalStateException(str2);
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override
    public boolean B() {
        return this.X;
    }

    @Override
    public final boolean E() {
        return this.S;
    }

    public Object G(j10.m mVar, Object obj) {
        return mVar.y(this, obj);
    }

    public boolean I() {
        return this.R;
    }

    @Override
    public final List O() {
        List list = this.G;
        if (list != null) {
            return list;
        }
        y0(19);
        throw null;
    }

    @Override
    public final j10.u S() {
        return this.c0;
    }

    @Override
    public final u T() {
        return this.K;
    }

    @Override
    public final u X() {
        return this.J;
    }

    public final j10.u Y0(j10.k kVar, j10.y yVar, j10.o oVar) {
        j10.u uVarBuild = n0().o(kVar).u(yVar).a(oVar).h(2).q().build();
        if (uVarBuild != null) {
            return uVarBuild;
        }
        y0(26);
        throw null;
    }

    @Override
    public l0 r(j10.k kVar, j10.y yVar, j10.o oVar) {
        return (l0) Y0(kVar, yVar, oVar);
    }

    @Override
    public j10.u a() {
        j10.u uVar = this.a0;
        ?? A = this;
        if (uVar != this) {
            A = uVar.a();
        }
        if (A != 0) {
            return A;
        }
        y0(20);
        throw null;
    }

    public abstract t a1(int i, j10.k kVar, j10.u uVar, j10.n0 n0Var, k10.h hVar, n20.e eVar);

    @Override
    public final List b0() {
        List list = this.I;
        if (list != null) {
            return list;
        }
        y0(13);
        throw null;
    }

    public m10.t b1(m10.s r21) {
        throw new UnsupportedOperationException("Method not decompiled: m10.t.b1(m10.s):m10.t");
    }

    public void d1(u uVar, u uVar2, List list, List list2, List list3, e30.w wVar, j10.y yVar, j10.o oVar) {
        if (list == null) {
            y0(5);
            throw null;
        }
        if (list2 == null) {
            y0(6);
            throw null;
        }
        if (list3 == null) {
            y0(7);
            throw null;
        }
        if (oVar == null) {
            y0(8);
            throw null;
        }
        this.F = h00.q.n1(list2);
        this.G = h00.q.n1(list3);
        this.H = wVar;
        this.L = yVar;
        this.M = oVar;
        this.J = uVar;
        this.K = uVar2;
        this.I = list;
        for (int i = 0; i < list2.size(); i++) {
            j10.r0 r0Var = (j10.r0) list2.get(i);
            if (r0Var.getIndex() != i) {
                throw new IllegalStateException(r0Var + " index is " + r0Var.getIndex() + " but position is " + i);
            }
        }
        for (int i2 = 0; i2 < list3.size(); i2++) {
            r0 r0Var2 = (r0) list3.get(i2);
            if (r0Var2.G != i2) {
                throw new IllegalStateException(r0Var2 + "index is " + r0Var2.G + " but position is " + i2);
            }
        }
    }

    @Override
    public j10.u e(u0 u0Var) {
        if (u0Var == null) {
            y0(22);
            throw null;
        }
        if (u0Var.a.e()) {
            return this;
        }
        s sVarE1 = e1(u0Var);
        sVarE1.E = a();
        sVarE1.O = true;
        sVarE1.W = true;
        return sVarE1.X.b1(sVarE1);
    }

    public final s e1(u0 u0Var) {
        if (u0Var != null) {
            return new s(this, u0Var.f(), l(), g(), getVisibility(), getKind(), O(), b0(), this.J, getReturnType());
        }
        y0(24);
        throw null;
    }

    public final void f1(j10.a aVar, Object obj) {
        if (this.d0 == null) {
            this.d0 = new LinkedHashMap();
        }
        this.d0.put(aVar, obj);
    }

    @Override
    public final j10.y g() {
        j10.y yVar = this.L;
        if (yVar != null) {
            return yVar;
        }
        y0(15);
        throw null;
    }

    @Override
    public final boolean g0() {
        return this.T;
    }

    public void g1(boolean z) {
        this.W = z;
    }

    @Override
    public final int getKind() {
        int i = this.b0;
        if (i != 0) {
            return i;
        }
        y0(21);
        throw null;
    }

    public e30.w getReturnType() {
        return this.H;
    }

    @Override
    public final List getTypeParameters() {
        List list = this.F;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("typeParameters == null for " + this);
    }

    @Override
    public final j10.o getVisibility() {
        j10.o oVar = this.M;
        if (oVar != null) {
            return oVar;
        }
        y0(16);
        throw null;
    }

    public void h0(Collection collection) {
        if (collection == null) {
            y0(17);
            throw null;
        }
        this.Y = collection;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (((j10.u) it.next()).l0()) {
                this.U = true;
                return;
            }
        }
    }

    public void h1(boolean z) {
        this.X = z;
    }

    public final void i1(e30.a0 a0Var) {
        if (a0Var != null) {
            this.H = a0Var;
        } else {
            y0(11);
            throw null;
        }
    }

    public boolean isExternal() {
        return this.P;
    }

    @Override
    public final boolean isInfix() {
        if (this.O) {
            return true;
        }
        Iterator it = a().m().iterator();
        while (it.hasNext()) {
            if (((j10.u) it.next()).isInfix()) {
                return true;
            }
        }
        return false;
    }

    public boolean isInline() {
        return this.Q;
    }

    @Override
    public final boolean isOperator() {
        if (this.N) {
            return true;
        }
        Iterator it = a().m().iterator();
        while (it.hasNext()) {
            if (((j10.u) it.next()).isOperator()) {
                return true;
            }
        }
        return false;
    }

    public boolean isSuspend() {
        return this.V;
    }

    @Override
    public final boolean l0() {
        return this.U;
    }

    public Collection m() {
        a20.a aVar = this.Z;
        if (aVar != null) {
            this.Y = (Collection) aVar.invoke();
            this.Z = null;
        }
        Collection collection = this.Y;
        if (collection == null) {
            collection = Collections.EMPTY_LIST;
        }
        if (collection != null) {
            return collection;
        }
        y0(14);
        throw null;
    }

    public j10.t n0() {
        return e1(u0.b);
    }

    @Override
    public final boolean p0() {
        return false;
    }

    public Object q0(j10.a aVar) {
        Map map = this.d0;
        if (map == null) {
            return null;
        }
        return map.get(aVar);
    }
}

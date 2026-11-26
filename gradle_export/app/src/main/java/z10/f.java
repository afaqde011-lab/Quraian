package z10;

import com.revenuecat.purchases.blockstore.BlockstoreHelper;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import e30.w;
import e30.x0;
import g00.k;
import g10.i;
import g10.t;
import h00.x;
import j10.l0;
import j10.n0;
import j10.o;
import j10.y;
import java.util.ArrayList;
import k10.h;
import kotlin.jvm.internal.m;
import m10.i0;
import m10.j0;
import m10.k0;
import m10.r0;
import x10.v;

public class f extends i0 implements a {
    public final boolean b0;
    public final k c0;

    public f(j10.k kVar, h hVar, y yVar, o oVar, boolean z, n20.e eVar, n0 n0Var, l0 l0Var, int i, boolean z2, k kVar2) {
        super(kVar, l0Var, hVar, yVar, oVar, z, eVar, i, n0Var, false, false, false, false, false);
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
        if (n0Var == null) {
            y0(5);
            throw null;
        }
        if (i == 0) {
            y0(6);
            throw null;
        }
        this.b0 = z2;
        this.c0 = kVar2;
    }

    public static f g1(j10.k kVar, a20.e eVar, o oVar, boolean z, n20.e eVar2, o10.g gVar, boolean z2) {
        y yVar = y.B;
        if (kVar == null) {
            y0(7);
            throw null;
        }
        if (eVar2 != null) {
            return new f(kVar, eVar, yVar, oVar, z, eVar2, gVar, null, 1, z2, null);
        }
        y0(11);
        throw null;
    }

    public static void y0(int i) {
        String str = i != 21 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 21 ? 3 : 2];
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
                objArr[0] = "visibility";
                break;
            case 4:
            case 11:
                objArr[0] = DiagnosticsEntry.NAME_KEY;
                break;
            case 5:
            case 12:
            case 18:
                objArr[0] = "source";
                break;
            case 6:
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                objArr[0] = "kind";
                break;
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 13:
                objArr[0] = "newOwner";
                break;
            case 14:
                objArr[0] = "newModality";
                break;
            case 15:
                objArr[0] = "newVisibility";
                break;
            case 17:
                objArr[0] = "newName";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
                break;
            case 22:
                objArr[0] = "inType";
                break;
        }
        if (i != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "create";
                break;
            case 13:
            case 14:
            case 15:
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
            case 17:
            case 18:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            case 21:
                break;
            case 22:
                objArr[2] = "setInType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i == 21) {
            throw new IllegalStateException(str2);
        }
    }

    @Override
    public final boolean B() {
        return false;
    }

    @Override
    public final i0 a1(j10.k kVar, y yVar, o oVar, l0 l0Var, int i, n20.e eVar) {
        if (kVar == null) {
            y0(13);
            throw null;
        }
        if (yVar == null) {
            y0(14);
            throw null;
        }
        if (oVar == null) {
            y0(15);
            throw null;
        }
        if (i == 0) {
            y0(16);
            throw null;
        }
        if (eVar == null) {
            y0(17);
            throw null;
        }
        return new f(kVar, getAnnotations(), yVar, oVar, this.G, eVar, n0.n, l0Var, i, this.b0, this.c0);
    }

    @Override
    public final void e1(w wVar) {
    }

    @Override
    public final Object q0(j10.a aVar) {
        k kVar = this.c0;
        if (kVar == null || !((j10.a) kVar.A).equals(aVar)) {
            return null;
        }
        return kVar.B;
    }

    @Override
    public final a r0(w wVar, ArrayList arrayList, w wVar2, k kVar) {
        w wVar3;
        j0 j0Var;
        k0 k0Var;
        l0 l0VarA = a() == this ? null : a();
        f fVar = new f(l(), getAnnotations(), g(), getVisibility(), this.G, getName(), o(), l0VarA, getKind(), this.b0, kVar);
        j0 j0Var2 = this.X;
        if (j0Var2 != null) {
            j0 j0Var3 = new j0(fVar, j0Var2.getAnnotations(), j0Var2.g(), j0Var2.getVisibility(), j0Var2.F, j0Var2.G, j0Var2.J, getKind(), l0VarA == null ? null : l0VarA.b(), j0Var2.o());
            j0Var3.M = j0Var2.M;
            wVar3 = wVar2;
            j0Var3.N = wVar3;
            j0Var = j0Var3;
        } else {
            wVar3 = wVar2;
            j0Var = null;
        }
        k0 k0Var2 = this.Y;
        if (k0Var2 != null) {
            k0 k0Var3 = k0Var2;
            k0Var = new k0(fVar, k0Var2.getAnnotations(), k0Var3.g(), k0Var3.getVisibility(), k0Var3.F, k0Var3.G, k0Var3.J, getKind(), l0VarA == null ? null : l0VarA.c(), k0Var2.o());
            k0Var.M = k0Var.M;
            r0 r0Var = (r0) k0Var2.O().get(0);
            if (r0Var == null) {
                k0.y0(6);
                throw null;
            }
            k0Var.N = r0Var;
        } else {
            k0Var = null;
        }
        fVar.c1(j0Var, k0Var, this.Z, this.a0);
        u00.a aVar = this.I;
        if (aVar != null) {
            fVar.d1(this.H, aVar);
        }
        fVar.h0(m());
        fVar.f1(wVar3, getTypeParameters(), this.U, wVar != null ? q20.k.k(this, wVar, k10.g.a) : null, x.A);
        return fVar;
    }

    @Override
    public final boolean u() {
        w type = getType();
        if (!this.b0) {
            return false;
        }
        m.e(type, "type");
        if (((!i.G(type) && !t.a(type)) || x0.e(type)) && !i.H(type)) {
            return false;
        }
        k10.i iVar = f20.t.a;
        n20.c ENHANCED_NULLABILITY_ANNOTATION = v.p;
        m.d(ENHANCED_NULLABILITY_ANNOTATION, "ENHANCED_NULLABILITY_ANNOTATION");
        return !f30.g.y(type, ENHANCED_NULLABILITY_ANNOTATION) || i.H(type);
    }
}

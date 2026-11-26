package z10;

import com.revenuecat.purchases.blockstore.BlockstoreHelper;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import e30.u0;
import e30.w;
import j10.k;
import j10.n0;
import j10.o;
import j10.u;
import j10.y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import k10.h;
import k30.i;
import k30.q;
import kotlin.jvm.internal.m;
import m10.l0;
import m10.s;
import m10.t;
import r30.j;

public final class e extends l0 implements a {
    public static final t20.b g0 = new t20.b();
    public static final t20.b h0 = new t20.b();
    public int e0;
    public final boolean f0;

    public e(k kVar, l0 l0Var, h hVar, n20.e eVar, int i, n0 n0Var, boolean z) {
        super(kVar, l0Var, hVar, eVar, i, n0Var);
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
        this.e0 = 0;
        this.f0 = z;
    }

    public static e n1(k kVar, a20.e eVar, n20.e eVar2, o10.g gVar, boolean z) {
        if (kVar == null) {
            y0(5);
            throw null;
        }
        if (eVar2 != null) {
            return new e(kVar, null, eVar, eVar2, 1, gVar, z);
        }
        y0(7);
        throw null;
    }

    public static void y0(int i) {
        String str = (i == 13 || i == 18 || i == 21) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 13 || i == 18 || i == 21) ? 2 : 3];
        switch (i) {
            case 1:
            case 6:
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = DiagnosticsEntry.NAME_KEY;
                break;
            case 3:
            case 15:
                objArr[0] = "kind";
                break;
            case 4:
            case 8:
            case 17:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 9:
                objArr[0] = "contextReceiverParameters";
                break;
            case 10:
                objArr[0] = "typeParameters";
                break;
            case 11:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
                objArr[0] = "visibility";
                break;
            case 13:
            case 18:
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
                break;
            case 14:
                objArr[0] = "newOwner";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i == 13) {
            objArr[1] = "initialize";
        } else if (i == 18) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "createJavaMethod";
                break;
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case 21:
                break;
            case 14:
            case 15:
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
            case 17:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 13 && i != 18 && i != 21) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override
    public final boolean B() {
        return w.c.a(this.e0);
    }

    @Override
    public final t a1(int i, k kVar, u uVar, n0 n0Var, h hVar, n20.e eVar) {
        if (kVar == null) {
            y0(14);
            throw null;
        }
        if (i == 0) {
            y0(15);
            throw null;
        }
        if (hVar == null) {
            y0(16);
            throw null;
        }
        l0 l0Var = (l0) uVar;
        if (eVar == null) {
            eVar = getName();
        }
        e eVar2 = new e(kVar, l0Var, hVar, eVar, i, n0Var, this.f0);
        int i2 = this.e0;
        boolean z = false;
        if (i2 != 1) {
            if (i2 == 2) {
                z = true;
            } else if (i2 != 3) {
                if (i2 != 4) {
                    throw null;
                }
                z = true;
            }
        }
        eVar2.o1(z, w.c.a(i2));
        return eVar2;
    }

    @Override
    public final l0 m1(m10.u uVar, m10.u uVar2, List list, List list2, List list3, w wVar, y yVar, o oVar, Map map) {
        k30.f fVar;
        if (list == null) {
            y0(9);
            throw null;
        }
        if (list2 == null) {
            y0(10);
            throw null;
        }
        if (list3 == null) {
            y0(11);
            throw null;
        }
        if (oVar == null) {
            y0(12);
            throw null;
        }
        super.m1(uVar, uVar2, list, list2, list3, wVar, yVar, oVar, map);
        for (i iVar : q.c) {
            j jVar = iVar.b;
            n20.e eVar = iVar.a;
            if (eVar == null || m.a(getName(), eVar)) {
                if (jVar != null) {
                    String strB = getName().b();
                    m.d(strB, "asString(...)");
                    if (!jVar.b(strB)) {
                        continue;
                    }
                }
                Collection collection = iVar.c;
                if (collection == null || collection.contains(getName())) {
                    for (k30.e eVar2 : iVar.e) {
                        if (eVar2.b(this) != null) {
                            fVar = new k30.f(false);
                            this.N = fVar.a;
                            return this;
                        }
                    }
                    fVar = ((String) iVar.d.invoke(this)) != null ? new k30.f(false) : k30.f.c;
                    this.N = fVar.a;
                    return this;
                }
            }
        }
        fVar = k30.f.b;
        this.N = fVar.a;
        return this;
    }

    public final void o1(boolean z, boolean z2) {
        int i;
        if (z) {
            i = z2 ? 4 : 2;
        } else {
            i = z2 ? 3 : 1;
        }
        this.e0 = i;
    }

    @Override
    public final a r0(w wVar, ArrayList arrayList, w wVar2, g00.k kVar) {
        ArrayList arrayListW = bi.b.w(arrayList, O(), this);
        m10.u uVarK = wVar == null ? null : q20.k.k(this, wVar, k10.g.a);
        s sVarE1 = e1(u0.b);
        sVarE1.G = arrayListW;
        sVarE1.K = wVar2;
        sVarE1.I = uVarK;
        sVarE1.P = true;
        sVarE1.O = true;
        e eVar = (e) sVarE1.X.b1(sVarE1);
        if (kVar != null) {
            eVar.f1((j10.a) kVar.A, kVar.B);
        }
        if (eVar != null) {
            return eVar;
        }
        y0(21);
        throw null;
    }
}

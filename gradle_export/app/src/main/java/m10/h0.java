package m10;

import com.revenuecat.purchases.blockstore.BlockstoreHelper;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import e30.a1;
import e30.u0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class h0 {
    public j10.k a;
    public j10.y b;
    public j10.o c;
    public int e;
    public final u h;
    public final n20.e i;
    public final e30.w j;
    public final i0 k;
    public j10.l0 d = null;
    public e30.s0 f = e30.s0.a;
    public boolean g = true;

    public h0(i0 i0Var) {
        this.k = i0Var;
        this.a = i0Var.l();
        this.b = i0Var.g();
        this.c = i0Var.getVisibility();
        this.e = i0Var.getKind();
        this.h = i0Var.U;
        this.i = i0Var.getName();
        this.j = i0Var.getType();
    }

    public static void a(int i) {
        String str = (i == 1 || i == 2 || i == 3 || i == 5 || i == 7 || i == 9 || i == 11 || i == 19 || i == 13 || i == 14 || i == 16 || i == 17) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 2 || i == 3 || i == 5 || i == 7 || i == 9 || i == 11 || i == 19 || i == 13 || i == 14 || i == 16 || i == 17) ? 2 : 3];
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 7:
            case 9:
            case 11:
            case 13:
            case 14:
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
            case 17:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
                break;
            case 4:
                objArr[0] = "type";
                break;
            case 6:
                objArr[0] = "modality";
                break;
            case 8:
                objArr[0] = "visibility";
                break;
            case 10:
                objArr[0] = "kind";
                break;
            case 12:
                objArr[0] = "typeParameters";
                break;
            case 15:
                objArr[0] = "substitution";
                break;
            case 18:
                objArr[0] = DiagnosticsEntry.NAME_KEY;
                break;
            default:
                objArr[0] = "owner";
                break;
        }
        if (i == 1) {
            objArr[1] = "setOwner";
        } else if (i == 2) {
            objArr[1] = "setOriginal";
        } else if (i == 3) {
            objArr[1] = "setPreserveSourceElement";
        } else if (i == 5) {
            objArr[1] = "setReturnType";
        } else if (i == 7) {
            objArr[1] = "setModality";
        } else if (i == 9) {
            objArr[1] = "setVisibility";
        } else if (i == 11) {
            objArr[1] = "setKind";
        } else if (i == 19) {
            objArr[1] = "setName";
        } else if (i == 13) {
            objArr[1] = "setTypeParameters";
        } else if (i == 14) {
            objArr[1] = "setDispatchReceiverParameter";
        } else if (i == 16) {
            objArr[1] = "setSubstitution";
        } else if (i != 17) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
        } else {
            objArr[1] = "setCopyOverrides";
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 7:
            case 9:
            case 11:
            case 13:
            case 14:
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
            case 17:
            case 19:
                break;
            case 4:
                objArr[2] = "setReturnType";
                break;
            case 6:
                objArr[2] = "setModality";
                break;
            case 8:
                objArr[2] = "setVisibility";
                break;
            case 10:
                objArr[2] = "setKind";
                break;
            case 12:
                objArr[2] = "setTypeParameters";
                break;
            case 15:
                objArr[2] = "setSubstitution";
                break;
            case 18:
                objArr[2] = "setName";
                break;
            default:
                objArr[2] = "setOwner";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 1 && i != 2 && i != 3 && i != 5 && i != 7 && i != 9 && i != 11 && i != 19 && i != 13 && i != 14 && i != 16 && i != 17) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public final i0 b() {
        u uVar;
        u uVar2;
        j0 j0Var;
        k0 k0Var;
        u0 u0Var;
        u00.a aVar;
        u uVar3;
        u uVar4;
        j10.k kVar = this.a;
        j10.y yVar = this.b;
        j10.o oVar = this.c;
        j10.l0 l0Var = this.d;
        int i = this.e;
        n20.e eVar = this.i;
        i0 i0Var = this.k;
        i0 i0VarA1 = i0Var.a1(kVar, yVar, oVar, l0Var, i, eVar);
        List typeParameters = i0Var.getTypeParameters();
        ArrayList arrayList = new ArrayList(((ArrayList) typeParameters).size());
        u0 u0VarB = e30.c.B(typeParameters, this.f, i0VarA1, arrayList);
        a1 a1Var = a1.E;
        e30.w wVar = this.j;
        e30.w wVarI = u0VarB.i(wVar, a1Var);
        if (wVarI != null) {
            a1 a1Var2 = a1.D;
            e30.w wVarI2 = u0VarB.i(wVar, a1Var2);
            if (wVarI2 != null) {
                i0VarA1.e1(wVarI2);
            }
            u uVar5 = this.h;
            if (uVar5 != null) {
                u uVarE = uVar5.e(u0VarB);
                uVar = uVarE != null ? uVarE : null;
            }
            u uVar6 = i0Var.V;
            if (uVar6 != null) {
                e30.w wVarI3 = u0VarB.i(uVar6.getType(), a1Var2);
                if (wVarI3 == null) {
                    uVar4 = null;
                } else {
                    uVar6.Y0();
                    uVar4 = new u(i0VarA1, new y20.b(i0VarA1, wVarI3), uVar6.getAnnotations());
                }
                uVar2 = uVar4;
            } else {
                uVar2 = null;
            }
            ArrayList arrayList2 = new ArrayList();
            for (u uVar7 : i0Var.T) {
                e30.w wVarI4 = u0VarB.i(uVar7.getType(), a1.D);
                if (wVarI4 == null) {
                    uVar3 = null;
                } else {
                    n20.e eVarW0 = ((y20.a) uVar7.Y0()).W0();
                    uVar7.Y0();
                    uVar3 = new u(i0VarA1, new y20.a(i0VarA1, wVarI4, eVarW0), uVar7.getAnnotations());
                }
                if (uVar3 != null) {
                    arrayList2.add(uVar3);
                }
            }
            i0VarA1.f1(wVarI, arrayList, uVar, uVar2, arrayList2);
            j0 j0Var2 = i0Var.X;
            j10.o0 o0Var = j10.n0.n;
            if (j0Var2 == null) {
                j0Var = null;
            } else {
                k10.h annotations = j0Var2.getAnnotations();
                j10.y yVar2 = this.b;
                j10.o visibility = i0Var.X.getVisibility();
                if (this.e == 2 && j10.p.e(j10.p.f(visibility.a.c()))) {
                    visibility = j10.p.h;
                }
                j10.o oVar2 = visibility;
                j0 j0Var3 = i0Var.X;
                boolean z = j0Var3.F;
                boolean z2 = j0Var3.G;
                boolean z3 = j0Var3.J;
                int i2 = this.e;
                j10.l0 l0Var2 = this.d;
                j0Var = new j0(i0VarA1, annotations, yVar2, oVar2, z, z2, z3, i2, l0Var2 == null ? null : l0Var2.b(), o0Var);
            }
            if (j0Var != null) {
                j0 j0Var4 = i0Var.X;
                e30.w wVar2 = j0Var4.N;
                j0Var.M = i0.b1(u0VarB, j0Var4);
                j0Var.b1(wVar2 != null ? u0VarB.i(wVar2, a1.E) : null);
            }
            k0 k0Var2 = i0Var.Y;
            if (k0Var2 == null) {
                k0Var = null;
            } else {
                k10.h annotations2 = k0Var2.getAnnotations();
                j10.y yVar3 = this.b;
                j10.o visibility2 = i0Var.Y.getVisibility();
                if (this.e == 2 && j10.p.e(j10.p.f(visibility2.a.c()))) {
                    visibility2 = j10.p.h;
                }
                j10.o oVar3 = visibility2;
                k0 k0Var3 = i0Var.Y;
                boolean z4 = k0Var3.F;
                boolean z5 = k0Var3.G;
                boolean z6 = k0Var3.J;
                int i3 = this.e;
                j10.l0 l0Var3 = this.d;
                k0Var = new k0(i0VarA1, annotations2, yVar3, oVar3, z4, z5, z6, i3, l0Var3 == null ? null : l0Var3.c(), o0Var);
            }
            if (k0Var != null) {
                u0Var = u0VarB;
                List listC1 = t.c1(k0Var, i0Var.Y.O(), u0Var, false, false, null);
                if (listC1 == null) {
                    listC1 = Collections.singletonList(k0.a1(k0Var, u20.d.e(this.a).o(), ((r0) i0Var.Y.O().get(0)).getAnnotations()));
                }
                if (listC1.size() != 1) {
                    throw new IllegalStateException();
                }
                k0Var.M = i0.b1(u0Var, i0Var.Y);
                r0 r0Var = (r0) listC1.get(0);
                if (r0Var == null) {
                    k0.y0(6);
                    throw null;
                }
                k0Var.N = r0Var;
            } else {
                u0Var = u0VarB;
            }
            r rVar = i0Var.Z;
            r rVar2 = rVar == null ? null : new r(rVar.getAnnotations(), i0VarA1);
            r rVar3 = i0Var.a0;
            i0VarA1.c1(j0Var, k0Var, rVar2, rVar3 != null ? new r(rVar3.getAnnotations(), i0VarA1) : null);
            if (this.g) {
                int i4 = n30.i.C;
                n30.i iVarE = n30.l.e();
                Iterator it = i0Var.m().iterator();
                while (it.hasNext()) {
                    iVarE.add(((j10.l0) it.next()).e(u0Var));
                }
                i0VarA1.L = iVarE;
            }
            if (i0Var.u() && (aVar = i0Var.I) != null) {
                i0VarA1.d1(i0Var.H, aVar);
            }
            return i0VarA1;
        }
        return null;
    }
}

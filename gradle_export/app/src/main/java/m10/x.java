package m10;

import com.revenuecat.purchases.blockstore.BlockstoreHelper;
import e30.a1;
import e30.u0;
import e30.x0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

public final class x extends y {
    public final y A;
    public final u0 B;
    public u0 C;
    public ArrayList D;
    public ArrayList E;
    public e30.i F;

    public x(y yVar, u0 u0Var) {
        this.A = yVar;
        this.B = u0Var;
    }

    public static void P(int i) {
        String str = (i == 2 || i == 3 || i == 5 || i == 6 || i == 8 || i == 10 || i == 13 || i == 23) ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[(i == 2 || i == 3 || i == 5 || i == 6 || i == 8 || i == 10 || i == 13 || i == 23) ? 3 : 2];
        if (i == 2) {
            objArr[0] = "typeArguments";
        } else if (i == 3) {
            objArr[0] = "kotlinTypeRefiner";
        } else if (i == 5) {
            objArr[0] = "typeSubstitution";
        } else if (i == 6) {
            objArr[0] = "kotlinTypeRefiner";
        } else if (i == 8) {
            objArr[0] = "typeArguments";
        } else if (i == 10) {
            objArr[0] = "typeSubstitution";
        } else if (i == 13) {
            objArr[0] = "kotlinTypeRefiner";
        } else if (i != 23) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor";
        } else {
            objArr[0] = "substitutor";
        }
        switch (i) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 10:
            case 13:
            case 23:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor";
                break;
            case 4:
            case 7:
            case 9:
            case 11:
                objArr[1] = "getMemberScope";
                break;
            case 12:
            case 14:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 15:
                objArr[1] = "getStaticScope";
                break;
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                objArr[1] = "getDefaultType";
                break;
            case 17:
                objArr[1] = "getContextReceivers";
                break;
            case 18:
                objArr[1] = "getConstructors";
                break;
            case 19:
                objArr[1] = "getAnnotations";
                break;
            case 20:
                objArr[1] = "getName";
                break;
            case 21:
                objArr[1] = "getOriginal";
                break;
            case 22:
                objArr[1] = "getContainingDeclaration";
                break;
            case 24:
                objArr[1] = "substitute";
                break;
            case 25:
                objArr[1] = "getKind";
                break;
            case 26:
                objArr[1] = "getModality";
                break;
            case 27:
                objArr[1] = "getVisibility";
                break;
            case 28:
                objArr[1] = "getUnsubstitutedInnerClassesScope";
                break;
            case 29:
                objArr[1] = "getSource";
                break;
            case 30:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 31:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "getTypeConstructor";
                break;
        }
        if (i == 2 || i == 3 || i == 5 || i == 6 || i == 8 || i == 10) {
            objArr[2] = "getMemberScope";
        } else if (i == 13) {
            objArr[2] = "getUnsubstitutedMemberScope";
        } else if (i == 23) {
            objArr[2] = "substitute";
        }
        String str2 = String.format(str, objArr);
        if (i != 2 && i != 3 && i != 5 && i != 6 && i != 8 && i != 10 && i != 13 && i != 23) {
            throw new IllegalStateException(str2);
        }
        throw new IllegalArgumentException(str2);
    }

    @Override
    public final x20.n C(f30.f fVar) {
        x20.n nVarC = this.A.C(fVar);
        if (!this.B.a.e()) {
            return new x20.s(nVarC, V());
        }
        if (nVarC != null) {
            return nVarC;
        }
        P(14);
        throw null;
    }

    @Override
    public final boolean E() {
        return this.A.E();
    }

    @Override
    public final Object G(j10.m mVar, Object obj) {
        return mVar.v(this, obj);
    }

    @Override
    public final i J() {
        return this.A.J();
    }

    @Override
    public final x20.n K() {
        x20.n nVarK = this.A.K();
        if (nVarK != null) {
            return nVarK;
        }
        P(15);
        throw null;
    }

    public final u0 V() {
        if (this.C == null) {
            u0 u0Var = this.B;
            if (u0Var.a.e()) {
                this.C = u0Var;
            } else {
                List parameters = this.A.f().getParameters();
                this.D = new ArrayList(parameters.size());
                this.C = e30.c.B(parameters, u0Var.f(), this, this.D);
                ArrayList arrayList = this.D;
                kotlin.jvm.internal.m.e(arrayList, "<this>");
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (!((j10.r0) obj).Z()) {
                        arrayList2.add(obj);
                    }
                }
                this.E = arrayList2;
            }
        }
        return this.C;
    }

    @Override
    public final j10.e a() {
        j10.e eVarA = this.A.a();
        if (eVarA != null) {
            return eVarA;
        }
        P(21);
        throw null;
    }

    @Override
    public final j10.l e(u0 u0Var) {
        if (u0Var != null) {
            return u0Var.a.e() ? this : new x(this, u0.e(u0Var.f(), V().f()));
        }
        P(23);
        throw null;
    }

    @Override
    public final e30.m0 f() {
        e30.m0 m0VarF = this.A.f();
        if (this.B.a.e()) {
            if (m0VarF != null) {
                return m0VarF;
            }
            P(0);
            throw null;
        }
        if (this.F == null) {
            u0 u0VarV = V();
            Collection collectionL = m0VarF.l();
            ArrayList arrayList = new ArrayList(collectionL.size());
            Iterator it = collectionL.iterator();
            while (it.hasNext()) {
                arrayList.add(u0VarV.i((e30.w) it.next(), a1.C));
            }
            this.F = new e30.i(this, this.D, arrayList, d30.l.e);
        }
        e30.i iVar = this.F;
        if (iVar != null) {
            return iVar;
        }
        P(1);
        throw null;
    }

    @Override
    public final j10.y g() {
        j10.y yVarG = this.A.g();
        if (yVarG != null) {
            return yVarG;
        }
        P(26);
        throw null;
    }

    @Override
    public final k10.h getAnnotations() {
        k10.h annotations = this.A.getAnnotations();
        if (annotations != null) {
            return annotations;
        }
        P(19);
        throw null;
    }

    @Override
    public final j10.f getKind() {
        j10.f kind = this.A.getKind();
        if (kind != null) {
            return kind;
        }
        P(25);
        throw null;
    }

    @Override
    public final n20.e getName() {
        n20.e name = this.A.getName();
        if (name != null) {
            return name;
        }
        P(20);
        throw null;
    }

    @Override
    public final j10.o getVisibility() {
        j10.o visibility = this.A.getVisibility();
        if (visibility != null) {
            return visibility;
        }
        P(27);
        throw null;
    }

    @Override
    public final Collection i() {
        Collection<i> collectionI = this.A.i();
        ArrayList arrayList = new ArrayList(collectionI.size());
        for (i iVar : collectionI) {
            i iVar2 = iVar;
            iVar2.getClass();
            s sVarE1 = iVar2.e1(u0.b);
            sVarE1.E = iVar.X0();
            sVarE1.u(iVar2.g());
            sVarE1.a(iVar2.getVisibility());
            sVarE1.h(iVar2.getKind());
            sVarE1.M = false;
            arrayList.add(((i) sVarE1.X.b1(sVarE1)).e(V()));
        }
        return arrayList;
    }

    @Override
    public final x20.n i0() {
        x20.n nVarI0 = this.A.i0();
        if (nVarI0 != null) {
            return nVarI0;
        }
        P(28);
        throw null;
    }

    @Override
    public final boolean isExternal() {
        return this.A.isExternal();
    }

    @Override
    public final boolean isInline() {
        return this.A.isInline();
    }

    @Override
    public final boolean j() {
        return this.A.j();
    }

    @Override
    public final j10.s0 j0() {
        j10.s0 s0VarJ0 = this.A.j0();
        if (s0VarJ0 == null) {
            return null;
        }
        boolean z = s0VarJ0 instanceof j10.v;
        u0 u0Var = this.B;
        if (z) {
            j10.v vVar = (j10.v) s0VarJ0;
            n20.e eVar = vVar.a;
            e30.a0 a0Var = (e30.a0) vVar.b;
            if (a0Var != null && !u0Var.a.e()) {
                a0Var = (e30.a0) V().i(a0Var, a1.C);
            }
            return new j10.v(eVar, a0Var);
        }
        if (!(s0VarJ0 instanceof j10.a0)) {
            throw new NoWhenBranchMatchedException();
        }
        ArrayList<g00.k> arrayList = ((j10.a0) s0VarJ0).a;
        ArrayList arrayList2 = new ArrayList(h00.r.q0(arrayList, 10));
        for (g00.k kVar : arrayList) {
            n20.e eVar2 = (n20.e) kVar.A;
            e30.a0 a0Var2 = (e30.a0) ((h30.h) kVar.B);
            if (a0Var2 != null && !u0Var.a.e()) {
                a0Var2 = (e30.a0) V().i(a0Var2, a1.C);
            }
            arrayList2.add(new g00.k(eVar2, a0Var2));
        }
        return new j10.a0(arrayList2);
    }

    @Override
    public final boolean k() {
        return this.A.k();
    }

    @Override
    public final j10.k l() {
        j10.k kVarL = this.A.l();
        if (kVarL != null) {
            return kVarL;
        }
        P(22);
        throw null;
    }

    @Override
    public final e30.a0 n() {
        e30.h0 h0VarE;
        List listD = x0.d(f().getParameters());
        k10.h annotations = getAnnotations();
        if (annotations.isEmpty()) {
            e30.h0.B.getClass();
            h0VarE = e30.h0.C;
        } else {
            l9.f0 f0Var = e30.h0.B;
            List listR = va.a.R(new e30.g(annotations));
            f0Var.getClass();
            h0VarE = l9.f0.e(listR);
        }
        return e30.c.v(h0VarE, f(), listD, o0(), false);
    }

    @Override
    public final j10.n0 o() {
        return j10.n0.n;
    }

    @Override
    public final x20.n o0() {
        u20.d.i(q20.d.c(this.A));
        return C(f30.f.a);
    }

    @Override
    public final List p() {
        V();
        ArrayList arrayList = this.E;
        if (arrayList != null) {
            return arrayList;
        }
        P(30);
        throw null;
    }

    @Override
    public final boolean p0() {
        return this.A.p0();
    }

    @Override
    public final boolean s() {
        return this.A.s();
    }

    @Override
    public final List s0() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        P(17);
        throw null;
    }

    @Override
    public final x20.n t(e30.s0 s0Var, f30.f fVar) {
        x20.n nVarT = this.A.t(s0Var, fVar);
        if (!this.B.a.e()) {
            return new x20.s(nVarT, V());
        }
        if (nVarT != null) {
            return nVarT;
        }
        P(7);
        throw null;
    }

    @Override
    public final x20.n u0(e30.s0 s0Var) {
        u20.d.i(q20.d.c(this));
        return t(s0Var, f30.f.a);
    }

    @Override
    public final boolean v0() {
        return this.A.v0();
    }

    @Override
    public final u x0() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean y() {
        return this.A.y();
    }
}

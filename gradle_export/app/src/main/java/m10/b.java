package m10;

import com.revenuecat.purchases.blockstore.BlockstoreHelper;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import e30.u0;
import java.util.Collections;
import java.util.List;

public abstract class b extends y {
    public final n20.e A;
    public final d30.i B;
    public final d30.i C;
    public final d30.i D;

    public b(d30.o oVar, n20.e eVar) {
        if (oVar == null) {
            P(0);
            throw null;
        }
        if (eVar == null) {
            P(1);
            throw null;
        }
        this.A = eVar;
        d30.l lVar = (d30.l) oVar;
        this.B = new d30.i(lVar, new a(this, 0));
        this.C = new d30.i(lVar, new a(this, 1));
        this.D = new d30.i(lVar, new a(this, 2));
    }

    public static void P(int i) {
        String str = (i == 2 || i == 3 || i == 4 || i == 5 || i == 6 || i == 9 || i == 12 || i == 14 || i == 16 || i == 17 || i == 19 || i == 20) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 2 || i == 3 || i == 4 || i == 5 || i == 6 || i == 9 || i == 12 || i == 14 || i == 16 || i == 17 || i == 19 || i == 20) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = DiagnosticsEntry.NAME_KEY;
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
            case 17:
            case 19:
            case 20:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
                break;
            case 7:
            case 13:
                objArr[0] = "typeArguments";
                break;
            case 8:
            case 11:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 10:
            case 15:
                objArr[0] = "typeSubstitution";
                break;
            case 18:
                objArr[0] = "substitutor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i == 2) {
            objArr[1] = "getName";
        } else if (i == 3) {
            objArr[1] = "getOriginal";
        } else if (i == 4) {
            objArr[1] = "getUnsubstitutedInnerClassesScope";
        } else if (i == 5) {
            objArr[1] = "getThisAsReceiverParameter";
        } else if (i == 6) {
            objArr[1] = "getContextReceivers";
        } else if (i == 9 || i == 12 || i == 14 || i == 16) {
            objArr[1] = "getMemberScope";
        } else if (i == 17) {
            objArr[1] = "getUnsubstitutedMemberScope";
        } else if (i == 19) {
            objArr[1] = "substitute";
        } else if (i != 20) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
        } else {
            objArr[1] = "getDefaultType";
        }
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
            case 17:
            case 19:
            case 20:
                break;
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
                objArr[2] = "getMemberScope";
                break;
            case 18:
                objArr[2] = "substitute";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 2 && i != 3 && i != 4 && i != 5 && i != 6 && i != 9 && i != 12 && i != 14 && i != 16 && i != 17 && i != 19 && i != 20) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override
    public final Object G(j10.m mVar, Object obj) {
        return mVar.v(this, obj);
    }

    @Override
    public j10.e e(u0 u0Var) {
        if (u0Var != null) {
            return u0Var.a.e() ? this : new x(this, u0Var);
        }
        P(18);
        throw null;
    }

    @Override
    public final j10.e a() {
        return this;
    }

    @Override
    public final j10.h a() {
        return this;
    }

    @Override
    public final j10.k a() {
        return this;
    }

    @Override
    public final n20.e getName() {
        n20.e eVar = this.A;
        if (eVar != null) {
            return eVar;
        }
        P(2);
        throw null;
    }

    @Override
    public x20.n i0() {
        x20.n nVar = (x20.n) this.C.invoke();
        if (nVar != null) {
            return nVar;
        }
        P(4);
        throw null;
    }

    @Override
    public final e30.a0 n() {
        e30.a0 a0Var = (e30.a0) this.B.invoke();
        if (a0Var != null) {
            return a0Var;
        }
        P(20);
        throw null;
    }

    @Override
    public x20.n o0() {
        u20.d.i(q20.d.c(this));
        x20.n nVarC = C(f30.f.a);
        if (nVarC != null) {
            return nVarC;
        }
        P(17);
        throw null;
    }

    @Override
    public List s0() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        P(6);
        throw null;
    }

    @Override
    public x20.n t(e30.s0 s0Var, f30.f fVar) {
        if (!s0Var.e()) {
            return new x20.s(C(fVar), new u0(s0Var));
        }
        x20.n nVarC = C(fVar);
        if (nVarC != null) {
            return nVarC;
        }
        P(12);
        throw null;
    }

    @Override
    public final x20.n u0(e30.s0 s0Var) {
        u20.d.i(q20.d.c(this));
        x20.n nVarT = t(s0Var, f30.f.a);
        if (nVarT != null) {
            return nVarT;
        }
        P(16);
        throw null;
    }

    @Override
    public final u x0() {
        u uVar = (u) this.D.invoke();
        if (uVar != null) {
            return uVar;
        }
        P(5);
        throw null;
    }
}

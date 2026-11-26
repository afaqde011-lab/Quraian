package m10;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import e30.a1;
import java.util.List;

public abstract class h extends n implements j10.r0 {
    public final a1 F;
    public final boolean G;
    public final int H;
    public final d30.i I;
    public final d30.i J;
    public final d30.l K;

    public h(d30.o oVar, j10.k kVar, k10.h hVar, n20.e eVar, a1 a1Var, boolean z, int i, j10.o0 o0Var) {
        super(kVar, hVar, eVar, j10.n0.n);
        if (oVar == null) {
            y0(0);
            throw null;
        }
        if (kVar == null) {
            y0(1);
            throw null;
        }
        if (hVar == null) {
            y0(2);
            throw null;
        }
        if (eVar == null) {
            y0(3);
            throw null;
        }
        if (a1Var == null) {
            y0(4);
            throw null;
        }
        if (o0Var == null) {
            y0(6);
            throw null;
        }
        this.F = a1Var;
        this.G = z;
        this.H = i;
        av.s sVar = new av.s(this, oVar, o0Var);
        d30.l lVar = (d30.l) oVar;
        this.I = new d30.i(lVar, sVar);
        this.J = new d30.i(lVar, new a20.a(26, this, eVar, false));
        this.K = lVar;
    }

    public static void y0(int i) {
        String str;
        int i2;
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
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
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = DiagnosticsEntry.NAME_KEY;
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 12:
                objArr[0] = "bounds";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i) {
            case 7:
                objArr[1] = "getVariance";
                break;
            case 8:
                objArr[1] = "getUpperBounds";
                break;
            case 9:
                objArr[1] = "getTypeConstructor";
                break;
            case 10:
                objArr[1] = "getDefaultType";
                break;
            case 11:
                objArr[1] = "getOriginal";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 13:
                objArr[1] = "processBoundsWithoutCycles";
                break;
            case 14:
                objArr[1] = "getStorageManager";
                break;
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                break;
            case 12:
                objArr[2] = "processBoundsWithoutCycles";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                throw new IllegalStateException(str2);
            case 12:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override
    public final boolean A() {
        return this.G;
    }

    @Override
    public final a1 F() {
        a1 a1Var = this.F;
        if (a1Var != null) {
            return a1Var;
        }
        y0(7);
        throw null;
    }

    @Override
    public final Object G(j10.m mVar, Object obj) {
        return mVar.h(this, obj);
    }

    @Override
    public final d30.o U() {
        d30.l lVar = this.K;
        if (lVar != null) {
            return lVar;
        }
        y0(14);
        throw null;
    }

    @Override
    public final j10.l a() {
        return this;
    }

    public List Y0(List list) {
        return list;
    }

    @Override
    public final boolean Z() {
        return false;
    }

    public abstract List Z0();

    @Override
    public final j10.h a() {
        return this;
    }

    @Override
    public final j10.k a() {
        return this;
    }

    @Override
    public final j10.r0 a() {
        return this;
    }

    @Override
    public final e30.m0 f() {
        e30.m0 m0Var = (e30.m0) this.I.invoke();
        if (m0Var != null) {
            return m0Var;
        }
        y0(9);
        throw null;
    }

    @Override
    public final int getIndex() {
        return this.H;
    }

    @Override
    public final List getUpperBounds() {
        List listL = ((g) f()).l();
        if (listL != null) {
            return listL;
        }
        y0(8);
        throw null;
    }

    @Override
    public final e30.a0 n() {
        e30.a0 a0Var = (e30.a0) this.J.invoke();
        if (a0Var != null) {
            return a0Var;
        }
        y0(10);
        throw null;
    }
}

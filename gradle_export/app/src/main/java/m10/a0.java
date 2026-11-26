package m10;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.InvalidModuleException;

public final class a0 extends m implements j10.z {
    public final d30.l D;
    public final g10.i E;
    public final Map F;
    public final f0 G;
    public z H;
    public j10.h0 I;
    public final boolean J;
    public final d30.e K;
    public final g00.p L;

    public a0(n20.e moduleName, d30.l lVar, g10.i iVar, int i) {
        super(k10.g.a, moduleName);
        kotlin.jvm.internal.m.e(moduleName, "moduleName");
        this.D = lVar;
        this.E = iVar;
        if (!moduleName.B) {
            throw new IllegalArgumentException("Module name must be special: " + moduleName);
        }
        this.F = h00.y.A;
        f0.a.getClass();
        f0 f0Var = (f0) D(d0.b);
        this.G = f0Var == null ? e0.b : f0Var;
        this.J = true;
        this.K = lVar.b(new a20.d(this, 23));
        this.L = rd.a.J(new g10.l(this, 2));
    }

    @Override
    public final Object D(eh.l capability) {
        kotlin.jvm.internal.m.e(capability, "capability");
        Object obj = this.F.get(capability);
        if (obj == null) {
            return null;
        }
        return obj;
    }

    @Override
    public final Object G(j10.m mVar, Object obj) {
        return mVar.o(obj, this);
    }

    public final void X0() {
        if (this.J) {
            return;
        }
        if (D(j10.w.a) != null) {
            throw new ClassCastException();
        }
        String message = "Accessing invalid module descriptor " + this;
        kotlin.jvm.internal.m.e(message, "message");
        throw new InvalidModuleException(message);
    }

    @Override
    public final g10.i d() {
        return this.E;
    }

    @Override
    public final List d0() {
        if (this.H != null) {
            return h00.x.A;
        }
        StringBuilder sb = new StringBuilder("Dependencies of module ");
        String str = getName().A;
        kotlin.jvm.internal.m.d(str, "toString(...)");
        sb.append(str);
        sb.append(" were not set");
        throw new AssertionError(sb.toString());
    }

    @Override
    public final j10.i0 f0(n20.c fqName) {
        kotlin.jvm.internal.m.e(fqName, "fqName");
        X0();
        return (j10.i0) this.K.invoke(fqName);
    }

    @Override
    public final Collection h(n20.c fqName, u00.k kVar) {
        kotlin.jvm.internal.m.e(fqName, "fqName");
        X0();
        X0();
        return ((l) this.L.getValue()).h(fqName, kVar);
    }

    @Override
    public final j10.k l() {
        return null;
    }

    @Override
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(m.W0(this));
        if (!this.J) {
            sb.append(" !isValid");
        }
        sb.append(" packageFragmentProvider: ");
        j10.h0 h0Var = this.I;
        sb.append(h0Var != null ? h0Var.getClass().getSimpleName() : null);
        return sb.toString();
    }

    @Override
    public final boolean v(j10.z targetModule) {
        kotlin.jvm.internal.m.e(targetModule, "targetModule");
        if (equals(targetModule)) {
            return true;
        }
        kotlin.jvm.internal.m.b(this.H);
        if (h00.q.F0(h00.z.A, targetModule)) {
            return true;
        }
        d0();
        return targetModule.d0().contains(this);
    }
}

package b20;

import com.google.android.gms.internal.measurement.b5;
import j10.c1;
import j10.f1;
import j10.m0;
import j10.o0;
import j10.z0;
import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.List;
import qd.s0;

public final class i extends m10.j implements z10.c {
    public final oj.q G;
    public final p10.o H;
    public final j10.e I;
    public final oj.q J;
    public final g00.p K;
    public final j10.f L;
    public final j10.y M;
    public final f1 N;
    public final boolean O;
    public final h P;
    public final n Q;
    public final m0 R;
    public final x20.i S;
    public final d0 T;
    public final a20.e U;
    public final d30.i V;

    static {
        h00.n.X0(new String[]{"equals", "hashCode", "getClass", "wait", "notify", "notifyAll", "toString"});
    }

    public i(oj.q outerContext, j10.k containingDeclaration, p10.o jClass, j10.e eVar) {
        j10.f fVar;
        j10.y yVar;
        f1 f1Var;
        kotlin.jvm.internal.m.e(outerContext, "outerContext");
        kotlin.jvm.internal.m.e(containingDeclaration, "containingDeclaration");
        kotlin.jvm.internal.m.e(jClass, "jClass");
        a20.b bVar = (a20.b) outerContext.B;
        super(bVar.a, containingDeclaration, jClass.e(), bVar.j.b(jClass));
        this.G = outerContext;
        this.H = jClass;
        this.I = eVar;
        oj.q qVarR = c7.i.r(outerContext, this, jClass, 4);
        this.J = qVarR;
        a20.b bVar2 = (a20.b) qVarR.B;
        d30.o storageManager = bVar2.a;
        bVar2.g.getClass();
        this.K = rd.a.J(new g(this, 0));
        Class cls = jClass.a;
        if (cls.isAnnotation()) {
            fVar = j10.f.E;
        } else if (cls.isInterface()) {
            fVar = j10.f.B;
        } else {
            fVar = cls.isEnum() ? j10.f.C : j10.f.A;
        }
        this.L = fVar;
        if (cls.isAnnotation() || cls.isEnum()) {
            yVar = j10.y.B;
        } else {
            o0 o0Var = j10.y.A;
            Boolean boolL0 = s0.l0(cls);
            boolean zBooleanValue = boolL0 != null ? boolL0.booleanValue() : false;
            Boolean boolL1 = s0.l0(cls);
            boolean z = (boolL1 != null ? boolL1.booleanValue() : false) || Modifier.isAbstract(cls.getModifiers()) || cls.isInterface();
            boolean zIsFinal = Modifier.isFinal(cls.getModifiers());
            o0Var.getClass();
            if (zBooleanValue) {
                yVar = j10.y.C;
            } else if (z) {
                yVar = j10.y.E;
            } else {
                yVar = !zIsFinal ? j10.y.D : j10.y.B;
            }
        }
        this.M = yVar;
        int modifiers = cls.getModifiers();
        if (Modifier.isPublic(modifiers)) {
            f1Var = c1.c;
        } else if (Modifier.isPrivate(modifiers)) {
            f1Var = z0.c;
        } else if (Modifier.isProtected(modifiers)) {
            f1Var = Modifier.isStatic(modifiers) ? n10.c.c : n10.b.c;
        } else {
            f1Var = n10.a.c;
        }
        this.N = f1Var;
        Class<?> declaringClass = cls.getDeclaringClass();
        this.O = ((declaringClass != null ? new p10.o(declaringClass) : null) == null || Modifier.isStatic(cls.getModifiers())) ? false : true;
        this.P = new h(this);
        n nVar = new n(qVarR, this, jClass, eVar != null, null);
        this.Q = nVar;
        o0 o0Var2 = m0.d;
        ((f30.l) bVar2.u).getClass();
        a20.d dVar = new a20.d(this, 5);
        o0Var2.getClass();
        kotlin.jvm.internal.m.e(storageManager, "storageManager");
        this.R = new m0(this, storageManager, dVar);
        this.S = new x20.i(nVar);
        this.T = new d0(qVarR, jClass, this);
        this.U = ca.v.F(qVarR, jClass);
        g gVar = new g(this, 1);
        d30.l lVar = (d30.l) storageManager;
        lVar.getClass();
        this.V = new d30.i(lVar, gVar);
    }

    @Override
    public final x20.n C(f30.f fVar) {
        m0 m0Var = this.R;
        u20.d.j(m0Var.a);
        return (n) ((x20.n) ze.d.A(m0Var.c, m0.e[0]));
    }

    @Override
    public final boolean E() {
        return false;
    }

    @Override
    public final m10.i J() {
        return null;
    }

    @Override
    public final x20.n K() {
        return this.T;
    }

    public final n e0() {
        return (n) super.o0();
    }

    @Override
    public final e30.m0 f() {
        return this.P;
    }

    @Override
    public final j10.y g() {
        return this.M;
    }

    @Override
    public final k10.h getAnnotations() {
        return this.U;
    }

    @Override
    public final j10.f getKind() {
        return this.L;
    }

    @Override
    public final j10.o getVisibility() {
        j10.o oVar = j10.p.a;
        f1 f1Var = this.N;
        if (kotlin.jvm.internal.m.a(f1Var, oVar)) {
            Class<?> declaringClass = this.H.a.getDeclaringClass();
            if ((declaringClass != null ? new p10.o(declaringClass) : null) == null) {
                j10.o oVar2 = x10.o.a;
                kotlin.jvm.internal.m.b(oVar2);
                return oVar2;
            }
        }
        return b5.O(f1Var);
    }

    @Override
    public final Collection i() {
        return (List) this.Q.q.invoke();
    }

    @Override
    public final x20.n i0() {
        return this.S;
    }

    @Override
    public final boolean isInline() {
        return false;
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final j10.s0 j0() {
        return null;
    }

    @Override
    public final boolean k() {
        return this.O;
    }

    @Override
    public final x20.n o0() {
        return (n) super.o0();
    }

    @Override
    public final List p() {
        return (List) this.V.invoke();
    }

    @Override
    public final boolean p0() {
        return false;
    }

    @Override
    public final boolean s() {
        return false;
    }

    public final String toString() {
        return "Lazy Java class " + u20.d.h(this);
    }

    @Override
    public final boolean v0() {
        return false;
    }

    @Override
    public final boolean y() {
        return false;
    }
}

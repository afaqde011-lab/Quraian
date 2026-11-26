package c30;

import a40.g1;
import com.google.android.gms.internal.measurement.g4;
import com.google.android.gms.internal.measurement.z3;
import e30.a0;
import i20.a1;
import i20.d0;
import i20.h1;
import i20.i1;
import i20.u0;
import j10.l0;
import j10.m0;
import j10.n0;
import j10.o0;
import j10.s0;
import j10.y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import ta.c0;

public final class i extends m10.b implements j10.k {
    public final i20.k E;
    public final k20.a F;
    public final n0 G;
    public final n20.b H;
    public final y I;
    public final j10.o J;
    public final j10.f K;
    public final a30.k L;
    public final x20.o M;
    public final b20.h N;
    public final m0 O;
    public final oj.q P;
    public final j10.k Q;
    public final d30.h R;
    public final d30.i S;
    public final d30.h T;
    public final a30.v U;
    public final k10.h V;

    public i(a30.k outerContext, i20.k classProto, k20.g nameResolver, k20.a aVar, n0 sourceElement) {
        j10.f fVar;
        x20.o rVar;
        super(((a30.i) outerContext.a).a, z3.z(nameResolver, classProto.E).f());
        kotlin.jvm.internal.m.e(outerContext, "outerContext");
        kotlin.jvm.internal.m.e(classProto, "classProto");
        kotlin.jvm.internal.m.e(nameResolver, "nameResolver");
        kotlin.jvm.internal.m.e(sourceElement, "sourceElement");
        this.E = classProto;
        this.F = aVar;
        this.G = sourceElement;
        this.H = z3.z(nameResolver, classProto.E);
        this.I = a30.j.e((d0) k20.e.e.e(classProto.D));
        this.J = g4.A((i1) k20.e.d.e(classProto.D));
        i20.j jVar = (i20.j) k20.e.f.e(classProto.D);
        switch (jVar == null ? -1 : a30.y.b[jVar.ordinal()]) {
            case 1:
                fVar = j10.f.A;
                break;
            case 2:
                fVar = j10.f.B;
                break;
            case 3:
                fVar = j10.f.C;
                break;
            case 4:
                fVar = j10.f.D;
                break;
            case 5:
                fVar = j10.f.E;
                break;
            case 6:
            case 7:
                fVar = j10.f.F;
                break;
            default:
                fVar = j10.f.A;
                break;
        }
        j10.f fVar2 = fVar;
        this.K = fVar2;
        List list = classProto.G;
        kotlin.jvm.internal.m.d(list, "getTypeParameterList(...)");
        a1 a1Var = classProto.a0;
        kotlin.jvm.internal.m.d(a1Var, "getTypeTable(...)");
        h9.f fVar3 = new h9.f(a1Var);
        k20.j jVar2 = k20.j.b;
        h1 h1Var = classProto.c0;
        kotlin.jvm.internal.m.d(h1Var, "getVersionRequirementTable(...)");
        a30.k kVarA = outerContext.a(this, list, nameResolver, fVar3, c0.D(h1Var), aVar);
        a30.i iVar = (a30.i) kVarA.a;
        d30.l storageManager = iVar.a;
        this.L = kVarA;
        boolean zBooleanValue = k20.e.m.e(classProto.D).booleanValue();
        j10.f fVar4 = j10.f.C;
        int i = 0;
        if (fVar2 == fVar4) {
            rVar = new x20.r(storageManager, this, zBooleanValue || kotlin.jvm.internal.m.a(iVar.s.d(), Boolean.TRUE));
        } else {
            rVar = x20.m.b;
        }
        this.M = rVar;
        this.N = new b20.h(this);
        o0 o0Var = m0.d;
        ((f30.l) iVar.q).getClass();
        g1 g1Var = new g1(1, this, h.class, "<init>", "<init>(Lorg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor;Lorg/jetbrains/kotlin/types/checker/KotlinTypeRefiner;)V", 0, 20);
        o0Var.getClass();
        kotlin.jvm.internal.m.e(storageManager, "storageManager");
        this.O = new m0(this, storageManager, g1Var);
        this.P = fVar2 == fVar4 ? new oj.q(this) : null;
        j10.k kVar = (j10.k) outerContext.c;
        this.Q = kVar;
        d dVar = new d(this, i);
        storageManager.getClass();
        this.R = new d30.h(storageManager, dVar);
        this.S = new d30.i(storageManager, new d(this, 1));
        new d30.h(storageManager, new d(this, 2));
        storageManager.a(new d(this, 3));
        this.T = new d30.h(storageManager, new d(this, 4));
        k20.g gVar = (k20.g) kVarA.b;
        h9.f fVar5 = (h9.f) kVarA.d;
        i iVar2 = kVar instanceof i ? (i) kVar : null;
        this.U = new a30.v(classProto, gVar, fVar5, sourceElement, iVar2 != null ? iVar2.U : null);
        this.V = !k20.e.c.e(classProto.D).booleanValue() ? k10.g.a : new w(storageManager, new d(this, 5));
    }

    @Override
    public final x20.n C(f30.f fVar) {
        m0 m0Var = this.O;
        u20.d.j(m0Var.a);
        return (x20.n) ze.d.A(m0Var.c, m0.e[0]);
    }

    @Override
    public final boolean E() {
        return k20.e.j.e(this.E.D).booleanValue();
    }

    @Override
    public final m10.i J() {
        return (m10.i) this.R.invoke();
    }

    @Override
    public final x20.n K() {
        return this.M;
    }

    public final h e0() {
        ((f30.l) ((a30.i) this.L.a).q).getClass();
        m0 m0Var = this.O;
        u20.d.j(m0Var.a);
        return (h) ((x20.n) ze.d.A(m0Var.c, m0.e[0]));
    }

    @Override
    public final e30.m0 f() {
        return this.N;
    }

    @Override
    public final y g() {
        return this.I;
    }

    @Override
    public final k10.h getAnnotations() {
        return this.V;
    }

    @Override
    public final j10.f getKind() {
        return this.K;
    }

    @Override
    public final j10.o getVisibility() {
        return this.J;
    }

    @Override
    public final Collection i() {
        return (Collection) this.S.invoke();
    }

    @Override
    public final boolean isExternal() {
        return k20.e.i.e(this.E.D).booleanValue();
    }

    @Override
    public final boolean isInline() {
        if (!k20.e.k.e(this.E.D).booleanValue()) {
            return false;
        }
        k20.a aVar = this.F;
        int i = aVar.b;
        if (i >= 1) {
            if (i > 1) {
                return false;
            }
            int i2 = aVar.c;
            if (i2 >= 4 && (i2 > 4 || aVar.d > 1)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean j() {
        return k20.e.k.e(this.E.D).booleanValue() && this.F.a(1, 4, 2);
    }

    @Override
    public final s0 j0() {
        return (s0) this.T.invoke();
    }

    @Override
    public final boolean k() {
        return k20.e.g.e(this.E.D).booleanValue();
    }

    public final a0 k0(n20.e eVar) {
        Iterator it = e0().e(eVar, r10.c.G).iterator();
        boolean z = false;
        Object obj = null;
        while (true) {
            if (!it.hasNext()) {
                if (!z) {
                    break;
                }
                break;
            }
            Object next = it.next();
            if (((l0) next).X() == null) {
                if (!z) {
                    z = true;
                    obj = next;
                }
            }
            obj = null;
            break;
        }
        l0 l0Var = (l0) obj;
        return (a0) (l0Var != null ? l0Var.getType() : null);
    }

    @Override
    public final j10.k l() {
        return this.Q;
    }

    @Override
    public final n0 o() {
        return this.G;
    }

    @Override
    public final List p() {
        return ((ui.b) this.L.h).o();
    }

    @Override
    public final boolean p0() {
        return false;
    }

    @Override
    public final boolean s() {
        return k20.e.f.e(this.E.D) == i20.j.COMPANION_OBJECT;
    }

    @Override
    public final List s0() {
        a30.k kVar = this.L;
        List listT = w50.c.t(this.E, (h9.f) kVar.d);
        ArrayList arrayList = new ArrayList(h00.r.q0(listT, 10));
        Iterator it = listT.iterator();
        while (it.hasNext()) {
            arrayList.add(new m10.u(x0(), new y20.a(this, ((ui.b) kVar.h).F((u0) it.next()), (n20.e) null), k10.g.a));
        }
        return arrayList;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("deserialized ");
        sb.append(E() ? "expect " : "");
        sb.append("class ");
        sb.append(getName());
        return sb.toString();
    }

    @Override
    public final boolean v0() {
        return k20.e.h.e(this.E.D).booleanValue();
    }

    @Override
    public final boolean y() {
        return k20.e.l.e(this.E.D).booleanValue();
    }
}

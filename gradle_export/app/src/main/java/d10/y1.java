package d10;

import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;

public class y1 extends kotlin.jvm.internal.b0 {
    public static l1 m(kotlin.jvm.internal.c cVar) {
        a10.f owner = cVar.getOwner();
        return owner instanceof l1 ? (l1) owner : p0.B;
    }

    @Override
    public final a10.g a(kotlin.jvm.internal.i iVar) {
        l1 l1VarM = m(iVar);
        String name = iVar.getName();
        String signature = iVar.getSignature();
        Object boundReceiver = iVar.getBoundReceiver();
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(signature, "signature");
        return new l(l1VarM, name, signature, null, boundReceiver);
    }

    @Override
    public final a10.d b(Class cls) {
        return c.a(cls);
    }

    @Override
    public final a10.f c(Class jClass) {
        a1.u0 u0Var = c.a;
        kotlin.jvm.internal.m.e(jClass, "jClass");
        return (a10.f) c.b.E(jClass);
    }

    @Override
    public final a10.x d(a10.x type) {
        String strM;
        kotlin.jvm.internal.m.e(type, "type");
        if (!e2.a) {
            p30.r rVar = (p30.r) type;
            a10.e eVar = rVar.B;
            a10.d dVar = eVar instanceof a10.d ? (a10.d) eVar : null;
            if (dVar == null || (strM = dVar.m()) == null) {
                throw new a40.b0("Non-class type cannot be a mutable collection type: " + type);
            }
            String str = i10.d.a;
            n20.c cVarH = i10.d.h(new n20.d(strM));
            if (cVarH != null) {
                return new p30.r(rVar.B, rVar.C, rVar.D, rVar.E, rVar.F, rVar.G, rVar.H, rVar.I, w50.c.N((a10.d) eVar, cVarH), null);
            }
            throw new IllegalArgumentException("Not a readonly collection: " + type);
        }
        e30.w wVar = ((p30.i) type).B;
        if (!(wVar instanceof e30.a0)) {
            throw new IllegalArgumentException(("Non-simple type cannot be a mutable collection type: " + type).toString());
        }
        j10.h hVarG = wVar.m0().g();
        j10.e eVar2 = hVarG instanceof j10.e ? (j10.e) hVarG : null;
        if (eVar2 == null) {
            throw new IllegalArgumentException("Non-class type cannot be a mutable collection type: " + type);
        }
        e30.a0 a0Var = (e30.a0) wVar;
        String str2 = i10.d.a;
        n20.c cVarH2 = i10.d.h(u20.d.h(eVar2));
        if (cVarH2 == null) {
            throw new IllegalArgumentException("Not a readonly collection: " + eVar2);
        }
        e30.m0 m0VarF = u20.d.e(eVar2).j(cVarH2).f();
        kotlin.jvm.internal.m.d(m0VarF, "getTypeConstructor(...)");
        e30.h0 annotations = a0Var.k0();
        List arguments = a0Var.e0();
        boolean zT0 = a0Var.t0();
        kotlin.jvm.internal.m.e(annotations, "annotations");
        kotlin.jvm.internal.m.e(arguments, "arguments");
        return new p30.i(e30.c.u(annotations, m0VarF, arguments, zT0), null);
    }

    @Override
    public final a10.j e(kotlin.jvm.internal.o oVar) {
        return new n(m(oVar), oVar.getName(), oVar.getSignature(), oVar.getBoundReceiver());
    }

    @Override
    public final a10.l f(kotlin.jvm.internal.p pVar) {
        return new p(m(pVar), pVar.getName(), pVar.getSignature(), pVar.getBoundReceiver());
    }

    @Override
    public final a10.r g(f40.h hVar) {
        return new f0(m(hVar), hVar.getName(), hVar.getSignature(), hVar.getBoundReceiver());
    }

    @Override
    public final a10.t h(kotlin.jvm.internal.s sVar) {
        return new i0(m(sVar), sVar.getName(), sVar.getSignature(), sVar.getBoundReceiver());
    }

    @Override
    public final a10.v i(kotlin.jvm.internal.t tVar) {
        return new l0(m(tVar), tVar.getName(), tVar.getSignature());
    }

    @Override
    public final String j(kotlin.jvm.internal.h hVar) throws IOException {
        l lVar;
        Metadata metadata = (Metadata) hVar.getClass().getAnnotation(Metadata.class);
        Object obj = null;
        if (metadata == null) {
            lVar = null;
        } else {
            String[] strArrD1 = metadata.d1();
            if (strArrD1.length == 0) {
                strArrD1 = null;
            }
            if (strArrD1 == null) {
                lVar = null;
            } else {
                g00.k kVarG = m20.g.g(strArrD1, metadata.d2());
                m20.f fVar = (m20.f) kVarG.A;
                i20.b0 b0Var = (i20.b0) kVarG.B;
                k20.f fVar2 = new k20.f(metadata.mv(), (metadata.xi() & 8) != 0);
                Class<?> cls = hVar.getClass();
                i20.a1 a1Var = b0Var.Q;
                kotlin.jvm.internal.m.d(a1Var, "getTypeTable(...)");
                lVar = new l(p0.B, (m10.l0) i2.e(cls, b0Var, fVar, new h9.f(a1Var), fVar2, c10.a.A));
            }
        }
        if (lVar == null) {
            return super.j(hVar);
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = lVar.getParameters().iterator();
        boolean z = false;
        Object obj2 = null;
        while (true) {
            if (!it.hasNext()) {
                if (!z) {
                    break;
                }
                obj = obj2;
                break;
            }
            Object next = it.next();
            if (((w) ((w1) next)).C == a10.n.C) {
                if (z) {
                    break;
                }
                z = true;
                obj2 = next;
            }
        }
        w1 w1Var = (w1) obj;
        if (w1Var != null) {
            sb.append(b2.f(((w) w1Var).g(), false));
            sb.append(".");
        }
        h00.q.Q0(p30.f.h0(lVar), sb, ", ", "(", ")", b.T, 48);
        sb.append(" -> ");
        sb.append(b2.f(lVar.getReturnType(), false));
        return sb.toString();
    }

    @Override
    public final String k(kotlin.jvm.internal.n nVar) {
        return j(nVar);
    }

    @Override
    public final a10.x l(a10.d dVar, List arguments, boolean z) {
        if (!(dVar instanceof kotlin.jvm.internal.d)) {
            return qd.s0.a0(dVar, arguments, z, Collections.EMPTY_LIST);
        }
        Class jClass = ((kotlin.jvm.internal.d) dVar).v();
        a1.u0 u0Var = c.a;
        kotlin.jvm.internal.m.e(jClass, "jClass");
        kotlin.jvm.internal.m.e(arguments, "arguments");
        if (arguments.isEmpty()) {
            return z ? (a10.x) c.d.E(jClass) : (a10.x) c.c.E(jClass);
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) c.e.E(jClass);
        g00.k kVar = new g00.k(arguments, Boolean.valueOf(z));
        Object obj = concurrentHashMap.get(kVar);
        if (obj == null) {
            p30.a aVarA0 = qd.s0.a0(c.a(jClass), arguments, z, h00.x.A);
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(kVar, aVarA0);
            obj = objPutIfAbsent == null ? aVarA0 : objPutIfAbsent;
        }
        return (a10.x) obj;
    }
}

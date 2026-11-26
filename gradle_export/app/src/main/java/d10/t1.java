package d10;

import com.google.android.gms.internal.measurement.f4;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public abstract class t1 {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();

    public static final o10.f a(Class cls) {
        l10.b bVarK;
        l10.d dVarK;
        kotlin.jvm.internal.m.e(cls, "<this>");
        ClassLoader classLoaderD = p10.d.d(cls);
        j2 j2Var = new j2(classLoaderD);
        ConcurrentHashMap concurrentHashMap = a;
        WeakReference weakReference = (WeakReference) concurrentHashMap.get(j2Var);
        if (weakReference != null) {
            o10.f fVar = (o10.f) weakReference.get();
            if (fVar != null) {
                return fVar;
            }
            concurrentHashMap.remove(j2Var, weakReference);
        }
        a30.j jVar = a30.j.f;
        hf.c cVar = new hf.c(classLoaderD, 27);
        ClassLoader classLoader = g00.b0.class.getClassLoader();
        kotlin.jvm.internal.m.d(classLoader, "getClassLoader(...)");
        hf.c cVar2 = new hf.c(classLoader, 27);
        o10.b bVar = new o10.b(classLoaderD, 0);
        String moduleName = "runtime module for " + classLoaderD;
        o10.e eVar = o10.e.b;
        o10.e eVar2 = o10.e.c;
        kotlin.jvm.internal.m.e(moduleName, "moduleName");
        d30.l lVar = new d30.l("DeserializationComponentsForJava.ModuleData");
        i10.h[] hVarArr = i10.h.A;
        i10.j jVar2 = new i10.j(lVar);
        m10.a0 a0Var = new m10.a0(n20.e.g("<" + moduleName + '>'), lVar, jVar2, 56);
        d30.n nVar = lVar.a;
        nVar.lock();
        try {
            if (jVar2.a == null) {
                jVar2.a = a0Var;
                nVar.unlock();
                jVar2.f = new g10.l(a0Var, 1);
                g20.e eVar3 = new g20.e();
                qj.c cVar3 = new qj.c(1, (byte) 0);
                oj.q qVar = new oj.q(lVar, a0Var);
                g20.f fVar2 = g20.f.c;
                g00.g gVar = new g00.g(1, 9, 0);
                x10.r rVar = x10.q.d;
                g00.g gVar2 = rVar.b;
                x10.z globalReportLevel = (gVar2 == null || gVar2.D - gVar.D > 0) ? rVar.a : rVar.c;
                kotlin.jvm.internal.m.e(globalReportLevel, "globalReportLevel");
                f4 f4Var = new f4(new x10.t(globalReportLevel, globalReportLevel == x10.z.WARN ? null : globalReportLevel), new v2.b0(gVar, 2));
                y10.h hVar = y10.h.c;
                y10.h hVar2 = y10.h.a;
                tf.w wVar = new tf.w(lVar);
                j10.o0 o0Var = j10.o0.C;
                g10.n nVar2 = new g10.n(a0Var, qVar);
                x10.b bVar2 = new x10.b(f4Var);
                a20.c cVar4 = a20.c.A;
                f20.d dVar = new f20.d();
                f30.k.b.getClass();
                f30.l lVar2 = f30.j.b;
                a20.f fVar3 = new a20.f(new a20.b(lVar, bVar, cVar, eVar3, hVar, eVar, hVar2, wVar, eVar2, cVar3, fVar2, o0Var, r10.b.a, a0Var, nVar2, bVar2, dVar, x10.l.a, cVar4, lVar2, f4Var, new g20.f()));
                k20.f metadataVersion = k20.f.g;
                kotlin.jvm.internal.m.e(metadataVersion, "metadataVersion");
                l9.f0 f0Var = new l9.f0(cVar, eVar3, 28);
                th.o oVar = new th.o(a0Var, qVar, lVar, cVar);
                oVar.G = metadataVersion;
                List listR = va.a.R(e30.k.a);
                g10.i iVar = a0Var.E;
                i10.j jVar3 = iVar instanceof i10.j ? (i10.j) iVar : null;
                g20.f fVar4 = g20.f.b;
                if (jVar3 == null || (bVarK = jVar3.K()) == null) {
                    bVarK = l10.a.b;
                }
                if (jVar3 == null || (dVarK = jVar3.K()) == null) {
                    dVarK = l10.a.d;
                }
                j2 j2Var2 = j2Var;
                ConcurrentHashMap concurrentHashMap2 = concurrentHashMap;
                a30.i iVar2 = new a30.i(lVar, a0Var, f0Var, oVar, fVar3, eVar, fVar4, h00.x.A, qVar, bVarK, dVarK, m20.g.a, lVar2, new tf.w(lVar), listR, jVar);
                eVar3.a = iVar2;
                cVar3.B = new o9.q(fVar3, 26);
                i10.o additionalClassPartsProvider = jVar2.K();
                i10.o platformDependentDeclarationFilter = jVar2.K();
                tf.w wVar2 = new tf.w(lVar);
                kotlin.jvm.internal.m.e(additionalClassPartsProvider, "additionalClassPartsProvider");
                kotlin.jvm.internal.m.e(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
                i10.q qVar2 = new i10.q(lVar, cVar2, a0Var);
                qj.c cVar5 = new qj.c(qVar2, 2);
                b30.a aVar = b30.a.m;
                qVar2.c = new a30.i(lVar, a0Var, cVar5, new a1.u0(a0Var, qVar, aVar), qVar2, va.a.S(new l10.c[]{new h10.a(lVar, a0Var), new i10.g(lVar, a0Var)}), qVar, additionalClassPartsProvider, platformDependentDeclarationFilter, aVar.a, lVar2, wVar2, 262144);
                a0Var.H = new m10.z(h00.n.V0(new m10.a0[]{a0Var}));
                a0Var.I = new m10.l(va.a.S(new j10.h0[]{fVar3, qVar2}), "CompositeProvider@RuntimeModuleData for " + a0Var);
                o10.f fVar5 = new o10.f(iVar2, new k9.x0(eVar3, cVar));
                while (true) {
                    ConcurrentHashMap concurrentHashMap3 = concurrentHashMap2;
                    j2 j2Var3 = j2Var2;
                    WeakReference weakReference2 = (WeakReference) concurrentHashMap3.putIfAbsent(j2Var3, new WeakReference(fVar5));
                    if (weakReference2 == null) {
                        return fVar5;
                    }
                    o10.f fVar6 = (o10.f) weakReference2.get();
                    if (fVar6 != null) {
                        return fVar6;
                    }
                    concurrentHashMap3.remove(j2Var3, weakReference2);
                    j2Var2 = j2Var3;
                    concurrentHashMap2 = concurrentHashMap3;
                }
            } else {
                try {
                    throw new AssertionError("Built-ins module is already set: " + jVar2.a + " (attempting to reset to " + a0Var + ")");
                } catch (Throwable th) {
                    th = th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            lVar.b.getClass();
            throw th;
        } catch (Throwable th3) {
            nVar.unlock();
            throw th3;
        }
    }
}

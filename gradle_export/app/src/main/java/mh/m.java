package mh;

import a30.x;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;
import s10.w0;
import yh.a1;
import yh.x0;

public abstract class m {

    public static final AtomicReference f10922a;

    public static final ConcurrentHashMap f10923b;

    public static final ConcurrentHashMap f10924c;

    public static final ConcurrentHashMap f10925d;

    static {
        Logger.getLogger(m.class.getName());
        f10922a = new AtomicReference(new e());
        f10923b = new ConcurrentHashMap();
        f10924c = new ConcurrentHashMap();
        new ConcurrentHashMap();
        f10925d = new ConcurrentHashMap();
    }

    public static synchronized void a(String str, Map map, boolean z10) {
        if (z10) {
            try {
                ConcurrentHashMap concurrentHashMap = f10924c;
                if (concurrentHashMap.containsKey(str) && !((Boolean) concurrentHashMap.get(str)).booleanValue()) {
                    throw new GeneralSecurityException("New keys are already disallowed for key type " + str);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            if (((e) f10922a.get()).f10906a.containsKey(str)) {
                for (Map.Entry entry : map.entrySet()) {
                    if (!f10925d.containsKey(entry.getKey())) {
                        throw new GeneralSecurityException("Attempted to register a new key template " + ((String) entry.getKey()) + " from an existing key manager of type " + str);
                    }
                }
            } else {
                for (Map.Entry entry2 : map.entrySet()) {
                    if (f10925d.containsKey(entry2.getKey())) {
                        throw new GeneralSecurityException("Attempted overwrite of a registered key template " + ((String) entry2.getKey()));
                    }
                }
            }
        }
    }

    public static Object b(b bVar, Class cls) {
        vh.a aVar;
        th.n nVar = (th.n) th.h.f14798b.f14799a.get();
        nVar.getClass();
        th.m mVar = new th.m(bVar.getClass(), cls);
        HashMap map = nVar.f14808a;
        if (!map.containsKey(mVar)) {
            throw new GeneralSecurityException("No PrimitiveConstructor for " + mVar + " available");
        }
        switch (((th.l) map.get(mVar)).f14805b.A) {
            case 27:
                aVar = new vh.a();
                if (!oi.k.a(1)) {
                    throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
                }
                return aVar;
            default:
                aVar = new vh.a();
                if (!oi.k.b(2)) {
                    throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
                }
                return aVar;
        }
    }

    public static Object c(String str, com.google.crypto.tink.shaded.protobuf.i iVar, Class cls) {
        e eVar = (e) f10922a.get();
        eVar.getClass();
        d dVarA = eVar.a(str);
        Set setKeySet = ((Map) dVarA.f10904a.C).keySet();
        x xVar = dVarA.f10904a;
        if (!setKeySet.contains(cls)) {
            StringBuilder sb2 = new StringBuilder("Primitive type ");
            sb2.append(cls.getName());
            sb2.append(" not supported by key manager of type ");
            sb2.append(xVar.getClass());
            sb2.append(", supported primitives: ");
            Set<Class> setKeySet2 = ((Map) xVar.C).keySet();
            StringBuilder sb3 = new StringBuilder();
            boolean z10 = true;
            for (Class cls2 : setKeySet2) {
                if (!z10) {
                    sb3.append(", ");
                }
                sb3.append(cls2.getCanonicalName());
                z10 = false;
            }
            sb2.append(sb3.toString());
            throw new GeneralSecurityException(sb2.toString());
        }
        try {
            if (!((Map) xVar.C).keySet().contains(cls) && !Void.class.equals(cls)) {
                throw new IllegalArgumentException("Given internalKeyMananger " + xVar.toString() + " does not support primitive class " + cls.getName());
            }
            try {
                com.google.crypto.tink.shaded.protobuf.a aVarS = xVar.s(iVar);
                if (Void.class.equals(cls)) {
                    throw new GeneralSecurityException("Cannot create a primitive for Void");
                }
                xVar.t(aVarS);
                return xVar.k(aVarS, cls);
            } catch (InvalidProtocolBufferException e3) {
                throw new GeneralSecurityException("Failures parsing proto of type ".concat(((Class) xVar.B).getName()), e3);
            }
        } catch (IllegalArgumentException e10) {
            throw new GeneralSecurityException("Primitive type not supported", e10);
        }
    }

    public static Object d(String str, byte[] bArr) {
        com.google.crypto.tink.shaded.protobuf.h hVar = com.google.crypto.tink.shaded.protobuf.i.B;
        return c(str, com.google.crypto.tink.shaded.protobuf.i.c(0, bArr.length, bArr), a.class);
    }

    public static synchronized x0 e(a1 a1Var) {
        f fVar;
        x xVar = ((e) f10922a.get()).a(a1Var.A()).f10904a;
        fVar = new f(xVar, (Class) xVar.D);
        if (!((Boolean) f10924c.get(a1Var.A())).booleanValue()) {
            throw new GeneralSecurityException("newKey-operation not permitted for key type " + a1Var.A());
        }
        return fVar.f(a1Var.B());
    }

    public static synchronized void f(x xVar, boolean z10) {
        try {
            AtomicReference atomicReference = f10922a;
            e eVar = new e((e) atomicReference.get());
            eVar.b(xVar);
            String strI = xVar.i();
            a(strI, z10 ? xVar.m().M0() : Collections.EMPTY_MAP, z10);
            if (!((e) atomicReference.get()).f10906a.containsKey(strI)) {
                f10923b.put(strI, new hb.f());
                if (z10) {
                    g(strI, xVar.m().M0());
                }
            }
            f10924c.put(strI, Boolean.valueOf(z10));
            atomicReference.set(eVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static void g(String str, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            f10925d.put((String) entry.getKey(), f.b(str, ((com.google.crypto.tink.shaded.protobuf.a) ((th.d) entry.getValue()).f14793a).d(), ((th.d) entry.getValue()).f14794b));
        }
    }

    public static synchronized void h(l lVar) {
        th.h hVar = th.h.f14798b;
        synchronized (hVar) {
            w0 w0Var = new w0((th.n) hVar.f14799a.get());
            w0Var.r(lVar);
            hVar.f14799a.set(new th.n(w0Var));
        }
    }
}

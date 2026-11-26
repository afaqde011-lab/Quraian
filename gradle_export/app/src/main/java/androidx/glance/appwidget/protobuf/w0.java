package androidx.glance.appwidget.protobuf;

import java.util.concurrent.ConcurrentHashMap;

public final class w0 {

    public static final w0 f961c = new w0();

    public final ConcurrentHashMap f963b = new ConcurrentHashMap();

    public final k0 f962a = new k0();

    public final z0 a(Class cls) {
        z0 z0VarV;
        Class cls2;
        e0.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f963b;
        z0 z0Var = (z0) concurrentHashMap.get(cls);
        if (z0Var != null) {
            return z0Var;
        }
        k0 k0Var = this.f962a;
        k0Var.getClass();
        Class cls3 = a1.f870a;
        if (!z.class.isAssignableFrom(cls) && (cls2 = a1.f870a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        y0 y0VarMessageInfoFor = ((j0) k0Var.f917a).messageInfoFor(cls);
        int i10 = y0VarMessageInfoFor.f967d;
        a aVar = y0VarMessageInfoFor.f964a;
        if ((i10 & 2) == 2) {
            if (z.class.isAssignableFrom(cls)) {
                z0VarV = new r0(a1.f872c, t.f955a, aVar);
            } else {
                b1 b1Var = a1.f871b;
                s sVar = t.f956b;
                if (sVar == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                z0VarV = new r0(b1Var, sVar, aVar);
            }
        } else if (z.class.isAssignableFrom(cls)) {
            s sVar2 = null;
            s0 s0Var = t0.f958b;
            g0 g0Var = h0.f890b;
            d1 d1Var = a1.f872c;
            if (e4.f.b(y0VarMessageInfoFor.a()) != 1) {
                sVar2 = t.f955a;
            }
            s sVar3 = sVar2;
            m0 m0Var = n0.f931b;
            if (!(y0VarMessageInfoFor instanceof y0)) {
                int[] iArr = q0.f937n;
                y0VarMessageInfoFor.getClass();
                throw new ClassCastException();
            }
            z0VarV = q0.v(y0VarMessageInfoFor, s0Var, g0Var, d1Var, sVar3, m0Var);
        } else {
            s sVar4 = null;
            s0 s0Var2 = t0.f957a;
            g0 g0Var2 = h0.f889a;
            b1 b1Var2 = a1.f871b;
            if (e4.f.b(y0VarMessageInfoFor.a()) != 1 && (sVar4 = t.f956b) == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            s sVar5 = sVar4;
            m0 m0Var2 = n0.f930a;
            if (!(y0VarMessageInfoFor instanceof y0)) {
                int[] iArr2 = q0.f937n;
                y0VarMessageInfoFor.getClass();
                throw new ClassCastException();
            }
            z0VarV = q0.v(y0VarMessageInfoFor, s0Var2, g0Var2, b1Var2, sVar5, m0Var2);
        }
        z0 z0Var2 = (z0) concurrentHashMap.putIfAbsent(cls, z0VarV);
        return z0Var2 != null ? z0Var2 : z0VarV;
    }
}

package com.google.crypto.tink.shaded.protobuf;

import java.util.concurrent.ConcurrentHashMap;

public final class x0 {

    public static final x0 f4333c = new x0();

    public final ConcurrentHashMap f4335b = new ConcurrentHashMap();

    public final k0 f4334a = new k0();

    public final a1 a(Class cls) {
        a1 a1VarX;
        Class cls2;
        b0.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f4335b;
        a1 a1Var = (a1) concurrentHashMap.get(cls);
        if (a1Var != null) {
            return a1Var;
        }
        k0 k0Var = this.f4334a;
        k0Var.getClass();
        Class cls3 = b1.f4246a;
        if (!x.class.isAssignableFrom(cls) && (cls2 = b1.f4246a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
        z0 z0VarMessageInfoFor = ((j0) k0Var.f4283a).messageInfoFor(cls);
        int i10 = z0VarMessageInfoFor.f4339d;
        a aVar = z0VarMessageInfoFor.f4336a;
        if ((i10 & 2) == 2) {
            if (x.class.isAssignableFrom(cls)) {
                a1VarX = new s0(b1.f4249d, r.f4310a, aVar);
            } else {
                c1 c1Var = b1.f4247b;
                q qVar = r.f4311b;
                if (qVar == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                a1VarX = new s0(c1Var, qVar, aVar);
            }
        } else if (x.class.isAssignableFrom(cls)) {
            a1VarX = (z0VarMessageInfoFor.f4339d & 1) == 1 ? r0.x(z0VarMessageInfoFor, u0.f4332b, h0.f4264b, b1.f4249d, r.f4310a, n0.f4303b) : r0.x(z0VarMessageInfoFor, u0.f4332b, h0.f4264b, b1.f4249d, null, n0.f4303b);
        } else if ((z0VarMessageInfoFor.f4339d & 1) == 1) {
            t0 t0Var = u0.f4331a;
            f0 f0Var = h0.f4263a;
            c1 c1Var2 = b1.f4247b;
            q qVar2 = r.f4311b;
            if (qVar2 == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            a1VarX = r0.x(z0VarMessageInfoFor, t0Var, f0Var, c1Var2, qVar2, n0.f4302a);
        } else {
            a1VarX = r0.x(z0VarMessageInfoFor, u0.f4331a, h0.f4263a, b1.f4248c, null, n0.f4302a);
        }
        a1 a1Var2 = (a1) concurrentHashMap.putIfAbsent(cls, a1VarX);
        return a1Var2 != null ? a1Var2 : a1VarX;
    }
}

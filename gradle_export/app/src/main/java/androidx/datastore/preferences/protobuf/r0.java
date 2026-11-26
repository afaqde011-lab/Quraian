package androidx.datastore.preferences.protobuf;

import java.util.concurrent.ConcurrentHashMap;

public final class r0 {

    public static final r0 f672c = new r0();

    public final ConcurrentHashMap f674b = new ConcurrentHashMap();

    public final d0 f673a = new d0();

    public final u0 a(Class cls) {
        u0 u0VarS;
        Class cls2;
        x.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f674b;
        u0 u0Var = (u0) concurrentHashMap.get(cls);
        if (u0Var != null) {
            return u0Var;
        }
        d0 d0Var = this.f673a;
        d0Var.getClass();
        Class cls3 = v0.f681a;
        if (!v.class.isAssignableFrom(cls) && (cls2 = v0.f681a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        t0 t0VarMessageInfoFor = ((c0) d0Var.f598a).messageInfoFor(cls);
        int i10 = t0VarMessageInfoFor.f680d;
        a aVar = t0VarMessageInfoFor.f677a;
        if ((i10 & 2) == 2) {
            if (v.class.isAssignableFrom(cls)) {
                u0VarS = new m0(v0.f683c, p.f667a, aVar);
            } else {
                a1 a1Var = v0.f682b;
                o oVar = p.f668b;
                if (oVar == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                u0VarS = new m0(a1Var, oVar, aVar);
            }
        } else if (v.class.isAssignableFrom(cls)) {
            o oVar2 = null;
            n0 n0Var = o0.f666b;
            a0 a0Var = b0.f587b;
            c1 c1Var = v0.f683c;
            if (e4.f.b(t0VarMessageInfoFor.a()) != 1) {
                oVar2 = p.f667a;
            }
            o oVar3 = oVar2;
            h0 h0Var = i0.f629b;
            if (!(t0VarMessageInfoFor instanceof t0)) {
                int[] iArr = l0.f646n;
                t0VarMessageInfoFor.getClass();
                throw new ClassCastException();
            }
            u0VarS = l0.s(t0VarMessageInfoFor, n0Var, a0Var, c1Var, oVar3, h0Var);
        } else {
            o oVar4 = null;
            n0 n0Var2 = o0.f665a;
            a0 a0Var2 = b0.f586a;
            a1 a1Var2 = v0.f682b;
            if (e4.f.b(t0VarMessageInfoFor.a()) != 1 && (oVar4 = p.f668b) == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            o oVar5 = oVar4;
            h0 h0Var2 = i0.f628a;
            if (!(t0VarMessageInfoFor instanceof t0)) {
                int[] iArr2 = l0.f646n;
                t0VarMessageInfoFor.getClass();
                throw new ClassCastException();
            }
            u0VarS = l0.s(t0VarMessageInfoFor, n0Var2, a0Var2, a1Var2, oVar5, h0Var2);
        }
        u0 u0Var2 = (u0) concurrentHashMap.putIfAbsent(cls, u0VarS);
        return u0Var2 != null ? u0Var2 : u0VarS;
    }
}

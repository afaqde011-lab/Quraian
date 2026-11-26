package com.google.crypto.tink.shaded.protobuf;

public abstract class v implements p0, Cloneable {
    public final x A;
    public x B;

    public v(x xVar) {
        this.A = xVar;
        if (xVar.m()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.B = xVar.p();
    }

    public static void e(Object obj, Object obj2) {
        x0 x0Var = x0.f4333c;
        x0Var.getClass();
        x0Var.a(obj.getClass()).mergeFrom(obj, obj2);
    }

    public final x a() {
        x xVarB = b();
        xVarB.getClass();
        if (x.l(xVarB, true)) {
            return xVarB;
        }
        throw new UninitializedMessageException();
    }

    public final x b() {
        if (!this.B.m()) {
            return this.B;
        }
        x xVar = this.B;
        xVar.getClass();
        x0 x0Var = x0.f4333c;
        x0Var.getClass();
        x0Var.a(xVar.getClass()).makeImmutable(xVar);
        xVar.n();
        return this.B;
    }

    public final v c() {
        v vVarO = this.A.c();
        vVarO.B = b();
        return vVarO;
    }

    public final void d() {
        if (this.B.m()) {
            return;
        }
        x xVarP = this.A.p();
        e(xVarP, this.B);
        this.B = xVarP;
    }
}

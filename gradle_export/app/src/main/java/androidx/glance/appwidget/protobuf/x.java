package androidx.glance.appwidget.protobuf;

public abstract class x implements Cloneable {
    public final z A;
    public z B;

    public x(z zVar) {
        this.A = zVar;
        if (zVar.h()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.B = zVar.j();
    }

    public static void d(Object obj, Object obj2) {
        w0 w0Var = w0.f961c;
        w0Var.getClass();
        w0Var.a(obj.getClass()).mergeFrom(obj, obj2);
    }

    public final z a() {
        z zVarB = b();
        zVarB.getClass();
        if (z.g(zVarB, true)) {
            return zVarB;
        }
        throw new UninitializedMessageException();
    }

    public final z b() {
        if (!this.B.h()) {
            return this.B;
        }
        z zVar = this.B;
        zVar.getClass();
        w0 w0Var = w0.f961c;
        w0Var.getClass();
        w0Var.a(zVar.getClass()).makeImmutable(zVar);
        zVar.i();
        return this.B;
    }

    public final void c() {
        if (this.B.h()) {
            return;
        }
        z zVarJ = this.A.j();
        d(zVarJ, this.B);
        this.B = zVarJ;
    }

    public final Object clone() {
        x xVar = (x) this.A.d(5);
        xVar.B = b();
        return xVar;
    }
}

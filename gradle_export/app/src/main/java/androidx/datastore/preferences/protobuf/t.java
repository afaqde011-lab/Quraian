package androidx.datastore.preferences.protobuf;

public abstract class t implements Cloneable {
    public final v A;
    public v B;

    public t(v vVar) {
        this.A = vVar;
        if (vVar.g()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.B = vVar.i();
    }

    public final v a() {
        v vVarB = b();
        vVarB.getClass();
        if (v.f(vVarB, true)) {
            return vVarB;
        }
        throw new UninitializedMessageException();
    }

    public final v b() {
        if (!this.B.g()) {
            return this.B;
        }
        v vVar = this.B;
        vVar.getClass();
        r0 r0Var = r0.f672c;
        r0Var.getClass();
        r0Var.a(vVar.getClass()).makeImmutable(vVar);
        vVar.h();
        return this.B;
    }

    public final void c() {
        if (this.B.g()) {
            return;
        }
        v vVarI = this.A.i();
        v vVar = this.B;
        r0 r0Var = r0.f672c;
        r0Var.getClass();
        r0Var.a(vVarI.getClass()).mergeFrom(vVarI, vVar);
        this.B = vVarI;
    }

    public final Object clone() {
        t tVar = (t) this.A.c(5);
        tVar.B = b();
        return tVar;
    }
}

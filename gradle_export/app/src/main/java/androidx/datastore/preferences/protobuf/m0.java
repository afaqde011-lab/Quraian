package androidx.datastore.preferences.protobuf;

public final class m0 implements u0 {

    public final a f660a;

    public final a1 f661b;

    public final o f662c;

    public m0(a1 a1Var, o oVar, a aVar) {
        this.f661b = a1Var;
        oVar.getClass();
        this.f662c = oVar;
        this.f660a = aVar;
    }

    @Override
    public final void a(Object obj, d0 d0Var) {
        this.f662c.getClass();
        a1.b.x(obj);
        throw null;
    }

    @Override
    public final int b(v vVar) {
        ((c1) this.f661b).getClass();
        b1 b1Var = vVar.unknownFields;
        int i10 = b1Var.f592d;
        if (i10 != -1) {
            return i10;
        }
        int iT = 0;
        for (int i11 = 0; i11 < b1Var.f589a; i11++) {
            int i12 = b1Var.f590b[i11] >>> 3;
            iT += l.T(3, (g) b1Var.f591c[i11]) + l.W(i12) + l.V(2) + (l.V(1) * 2);
        }
        b1Var.f592d = iT;
        return iT;
    }

    @Override
    public final int c(v vVar) {
        ((c1) this.f661b).getClass();
        return vVar.unknownFields.hashCode();
    }

    @Override
    public final boolean d(v vVar, v vVar2) {
        c1 c1Var = (c1) this.f661b;
        c1Var.getClass();
        b1 b1Var = vVar.unknownFields;
        c1Var.getClass();
        return b1Var.equals(vVar2.unknownFields);
    }

    @Override
    public final void e(Object obj, k kVar, n nVar) {
        this.f661b.a(obj);
        this.f662c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override
    public final boolean isInitialized(Object obj) {
        this.f662c.getClass();
        a1.b.x(obj);
        throw null;
    }

    @Override
    public final void makeImmutable(Object obj) {
        ((c1) this.f661b).getClass();
        b1 b1Var = ((v) obj).unknownFields;
        if (b1Var.f593e) {
            b1Var.f593e = false;
        }
        this.f662c.getClass();
        a1.b.x(obj);
        throw null;
    }

    @Override
    public final void mergeFrom(Object obj, Object obj2) {
        v0.k(this.f661b, obj, obj2);
    }

    @Override
    public final v newInstance() {
        a aVar = this.f660a;
        return aVar instanceof v ? ((v) aVar).i() : ((t) ((v) aVar).c(5)).b();
    }
}

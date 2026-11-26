package com.google.crypto.tink.shaded.protobuf;

public final class s0 implements a1 {

    public final a f4326a;

    public final c1 f4327b;

    public final q f4328c;

    public s0(c1 c1Var, q qVar, a aVar) {
        this.f4327b = c1Var;
        qVar.getClass();
        this.f4328c = qVar;
        this.f4326a = aVar;
    }

    @Override
    public final boolean a(x xVar, x xVar2) {
        e1 e1Var = (e1) this.f4327b;
        e1Var.getClass();
        d1 d1Var = xVar.unknownFields;
        e1Var.getClass();
        return d1Var.equals(xVar2.unknownFields);
    }

    @Override
    public final int b(x xVar) {
        ((e1) this.f4327b).getClass();
        return xVar.unknownFields.hashCode();
    }

    @Override
    public final int c(x xVar) {
        ((e1) this.f4327b).getClass();
        d1 d1Var = xVar.unknownFields;
        int i10 = d1Var.f4259d;
        if (i10 != -1) {
            return i10;
        }
        int iO = 0;
        for (int i11 = 0; i11 < d1Var.f4256a; i11++) {
            int i12 = d1Var.f4257b[i11] >>> 3;
            iO += m.O(3, (i) d1Var.f4258c[i11]) + m.W(i12) + m.V(2) + (m.V(1) * 2);
        }
        d1Var.f4259d = iO;
        return iO;
    }

    @Override
    public final void d(Object obj, byte[] bArr, int i10, int i11, d dVar) {
        x xVar = (x) obj;
        if (xVar.unknownFields == d1.f4255f) {
            xVar.unknownFields = d1.c();
        }
        throw a1.b.i(obj);
    }

    @Override
    public final void e(Object obj, l lVar, p pVar) {
        this.f4327b.a(obj);
        this.f4328c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override
    public final void f(Object obj, k0 k0Var) {
        this.f4328c.getClass();
        a1.b.x(obj);
        throw null;
    }

    @Override
    public final boolean isInitialized(Object obj) {
        this.f4328c.getClass();
        a1.b.x(obj);
        throw null;
    }

    @Override
    public final void makeImmutable(Object obj) {
        ((e1) this.f4327b).getClass();
        ((x) obj).unknownFields.f4260e = false;
        this.f4328c.getClass();
        a1.b.x(obj);
        throw null;
    }

    @Override
    public final void mergeFrom(Object obj, Object obj2) {
        b1.w(this.f4327b, obj, obj2);
    }

    @Override
    public final Object newInstance() {
        a aVar = this.f4326a;
        return aVar instanceof x ? ((x) aVar).p() : aVar.c().b();
    }
}

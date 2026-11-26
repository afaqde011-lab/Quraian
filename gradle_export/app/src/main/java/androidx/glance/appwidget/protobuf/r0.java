package androidx.glance.appwidget.protobuf;

public final class r0 implements z0 {

    public final a f952a;

    public final b1 f953b;

    public final s f954c;

    public r0(b1 b1Var, s sVar, a aVar) {
        this.f953b = b1Var;
        sVar.getClass();
        this.f954c = sVar;
        this.f952a = aVar;
    }

    @Override
    public final int a(z zVar) {
        ((d1) this.f953b).getClass();
        c1 c1Var = zVar.unknownFields;
        int i10 = c1Var.f879d;
        if (i10 != -1) {
            return i10;
        }
        int iE0 = 0;
        for (int i11 = 0; i11 < c1Var.f876a; i11++) {
            int i12 = c1Var.f877b[i11] >>> 3;
            iE0 += o.e0(3, (i) c1Var.f878c[i11]) + o.j0(i12) + o.i0(2) + (o.i0(1) * 2);
        }
        c1Var.f879d = iE0;
        return iE0;
    }

    @Override
    public final void b(Object obj, l lVar, r rVar) {
        this.f953b.a(obj);
        this.f954c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override
    public final int c(z zVar) {
        ((d1) this.f953b).getClass();
        return zVar.unknownFields.hashCode();
    }

    @Override
    public final void d(Object obj, k0 k0Var) {
        this.f954c.getClass();
        a1.b.x(obj);
        throw null;
    }

    @Override
    public final void e(Object obj, byte[] bArr, int i10, int i11, d dVar) {
        z zVar = (z) obj;
        if (zVar.unknownFields == c1.f875f) {
            zVar.unknownFields = c1.c();
        }
        throw a1.b.i(obj);
    }

    @Override
    public final boolean f(z zVar, z zVar2) {
        d1 d1Var = (d1) this.f953b;
        d1Var.getClass();
        c1 c1Var = zVar.unknownFields;
        d1Var.getClass();
        return c1Var.equals(zVar2.unknownFields);
    }

    @Override
    public final boolean isInitialized(Object obj) {
        this.f954c.getClass();
        a1.b.x(obj);
        throw null;
    }

    @Override
    public final void makeImmutable(Object obj) {
        ((d1) this.f953b).getClass();
        c1 c1Var = ((z) obj).unknownFields;
        if (c1Var.f880e) {
            c1Var.f880e = false;
        }
        this.f954c.getClass();
        a1.b.x(obj);
        throw null;
    }

    @Override
    public final void mergeFrom(Object obj, Object obj2) {
        a1.k(this.f953b, obj, obj2);
    }

    @Override
    public final z newInstance() {
        a aVar = this.f952a;
        return aVar instanceof z ? ((z) aVar).j() : ((x) ((z) aVar).d(5)).b();
    }
}

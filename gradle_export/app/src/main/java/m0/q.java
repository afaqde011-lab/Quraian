package m0;

import d0.q1;
import java.util.List;
import java.util.Map;
import z2.x0;

public final class q implements x0 {

    public final List f10365a;

    public final int f10366b;

    public final int f10367c;

    public final int f10368d;

    public final q1 f10369e;

    public final int f10370f;

    public final int f10371g;

    public final int f10372h;

    public final f f10373i;

    public final f f10374j;

    public final float f10375k;
    public final int l;
    public final boolean m;

    public final e0.o f10376n;

    public final x0 f10377o;

    public final boolean f10378p;

    public final List f10379q;

    public final List f10380r;

    public final a40.z f10381s;

    public final y3.c f10382t;

    public final long f10383u;

    public q(int i10, int i11, int i12, int i13, int i14, int i15, e0.o oVar, x0 x0Var, a40.z zVar, y3.c cVar, long j9) {
        q1 q1Var = q1.B;
        h00.x xVar = h00.x.A;
        this(xVar, i10, i11, i12, q1Var, i13, i14, i15, null, null, 0.0f, 0, false, oVar, x0Var, false, xVar, xVar, zVar, cVar, j9);
    }

    public q(List list, int i10, int i11, int i12, q1 q1Var, int i13, int i14, int i15, f fVar, f fVar2, float f3, int i16, boolean z10, e0.o oVar, x0 x0Var, boolean z11, List list2, List list3, a40.z zVar, y3.c cVar, long j9) {
        this.f10365a = list;
        this.f10366b = i10;
        this.f10367c = i11;
        this.f10368d = i12;
        this.f10369e = q1Var;
        this.f10370f = i13;
        this.f10371g = i14;
        this.f10372h = i15;
        this.f10373i = fVar;
        this.f10374j = fVar2;
        this.f10375k = f3;
        this.l = i16;
        this.m = z10;
        this.f10376n = oVar;
        this.f10377o = x0Var;
        this.f10378p = z11;
        this.f10379q = list2;
        this.f10380r = list3;
        this.f10381s = zVar;
        this.f10382t = cVar;
        this.f10383u = j9;
    }

    @Override
    public final Map a() {
        return this.f10377o.a();
    }

    @Override
    public final void b() {
        this.f10377o.b();
    }

    @Override
    public final int c() {
        return this.f10377o.c();
    }

    @Override
    public final int d() {
        return this.f10377o.d();
    }

    @Override
    public final u00.k e() {
        return this.f10377o.e();
    }

    public final q f(int i10) {
        int i11;
        int i12 = this.f10366b + this.f10367c;
        if (this.f10378p) {
            return null;
        }
        List list = this.f10365a;
        if (list.isEmpty() || this.f10373i == null || (i11 = this.l - i10) < 0 || i11 >= i12) {
            return null;
        }
        float f3 = this.f10375k - (i12 != 0 ? i10 / i12 : 0.0f);
        if (this.f10374j == null || f3 >= 0.5f || f3 <= -0.5f) {
            return null;
        }
        f fVar = (f) h00.q.L0(list);
        f fVar2 = (f) h00.q.T0(list);
        int i13 = this.f10371g;
        int i14 = this.f10370f;
        if (i10 < 0) {
            if (Math.min((fVar.f10330j + i12) - i14, (fVar2.f10330j + i12) - i13) <= (-i10)) {
                return null;
            }
        } else if (Math.min(i14 - fVar.f10330j, i13 - fVar2.f10330j) <= i10) {
            return null;
        }
        int size = list.size();
        for (int i15 = 0; i15 < size; i15++) {
            ((f) list.get(i15)).a(i10);
        }
        List list2 = this.f10379q;
        int size2 = list2.size();
        for (int i16 = 0; i16 < size2; i16++) {
            ((f) list2.get(i16)).a(i10);
        }
        List list3 = this.f10380r;
        int size3 = list3.size();
        for (int i17 = 0; i17 < size3; i17++) {
            ((f) list3.get(i17)).a(i10);
        }
        return new q(this.f10365a, this.f10366b, this.f10367c, this.f10368d, this.f10369e, this.f10370f, this.f10371g, this.f10372h, this.f10373i, this.f10374j, f3, i11, this.m || i10 > 0, this.f10376n, this.f10377o, this.f10378p, this.f10379q, this.f10380r, this.f10381s, this.f10382t, this.f10383u);
    }

    public final long g() {
        x0 x0Var = this.f10377o;
        return (((long) x0Var.d()) << 32) | (((long) x0Var.c()) & 4294967295L);
    }
}

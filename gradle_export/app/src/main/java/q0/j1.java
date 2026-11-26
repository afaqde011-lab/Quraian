package q0;

import c3.t2;

public final class j1 {
    public final l1.i1 A;
    public final l1.i1 B;

    public q1 f12638a;

    public final l1.r1 f12639b;

    public final t2 f12640c;

    public final q3.e0 f12641d;

    public r3.b0 f12642e;

    public final l1.i1 f12643f;

    public final l1.i1 f12644g;

    public z2.a0 f12645h;

    public final l1.i1 f12646i;

    public m3.h f12647j;

    public final l1.i1 f12648k;
    public final l1.i1 l;
    public final l1.i1 m;

    public final l1.i1 f12649n;

    public final l1.i1 f12650o;

    public boolean f12651p;

    public final l1.i1 f12652q;

    public final f1 f12653r;

    public final l1.i1 f12654s;

    public final l1.i1 f12655t;

    public u00.k f12656u;

    public final r0 f12657v;

    public final r0 f12658w;

    public final r0 f12659x;

    public final i2.e f12660y;

    public long f12661z;

    public j1(q1 q1Var, l1.r1 r1Var, t2 t2Var) {
        this.f12638a = q1Var;
        this.f12639b = r1Var;
        this.f12640c = t2Var;
        q3.e0 e0Var = new q3.e0(3, false);
        m3.h hVar = m3.i.f10456a;
        long j9 = m3.q0.f10518b;
        r3.w wVar = new r3.w(hVar, j9, (m3.q0) null);
        e0Var.B = wVar;
        e0Var.C = new com.google.android.material.datepicker.n(hVar, wVar.f13100b);
        this.f12641d = e0Var;
        Boolean bool = Boolean.FALSE;
        this.f12643f = l1.q.z(bool);
        this.f12644g = l1.q.z(new y3.f(0));
        this.f12646i = l1.q.z(null);
        this.f12648k = l1.q.z(z0.A);
        this.l = l1.q.z(bool);
        this.m = l1.q.z(bool);
        this.f12649n = l1.q.z(bool);
        this.f12650o = l1.q.z(bool);
        this.f12651p = true;
        this.f12652q = l1.q.z(Boolean.TRUE);
        this.f12653r = new f1(t2Var);
        this.f12654s = l1.q.z(bool);
        this.f12655t = l1.q.z(bool);
        this.f12656u = new pp.d(5);
        this.f12657v = new r0(this, 1);
        this.f12658w = new r0(this, 2);
        this.f12659x = new r0(this, 3);
        this.f12660y = i2.b0.g();
        this.f12661z = i2.t.f7167g;
        this.A = l1.q.z(new m3.q0(j9));
        this.B = l1.q.z(new m3.q0(j9));
    }

    public final z0 a() {
        return (z0) this.f12648k.getValue();
    }

    public final boolean b() {
        return ((Boolean) this.f12643f.getValue()).booleanValue();
    }

    public final z2.a0 c() {
        z2.a0 a0Var = this.f12645h;
        if (a0Var == null || !a0Var.A()) {
            return null;
        }
        return a0Var;
    }

    public final e2 d() {
        return (e2) this.f12646i.getValue();
    }

    public final void e(long j9) {
        this.B.setValue(new m3.q0(j9));
    }

    public final void f(long j9) {
        this.A.setValue(new m3.q0(j9));
    }
}

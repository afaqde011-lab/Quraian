package o2;

import android.graphics.Path;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

public final class h extends c0 {

    public i2.q f11582b;

    public float f11583c = 1.0f;

    public List f11584d;

    public float f11585e;

    public float f11586f;

    public i2.q f11587g;

    public int f11588h;

    public int f11589i;

    public float f11590j;

    public float f11591k;
    public float l;
    public float m;

    public boolean f11592n;

    public boolean f11593o;

    public boolean f11594p;

    public k2.h f11595q;

    public final i2.g f11596r;

    public i2.g f11597s;

    public i2.g f11598t;

    public final Object f11599u;

    public h() {
        int i10 = g0.f11581a;
        this.f11584d = h00.x.A;
        this.f11585e = 1.0f;
        this.f11588h = 0;
        this.f11589i = 0;
        this.f11590j = 4.0f;
        this.l = 1.0f;
        this.f11592n = true;
        this.f11593o = true;
        i2.g gVarA = i2.j.a();
        this.f11596r = gVarA;
        this.f11597s = gVarA;
        this.f11599u = rd.a.I(g00.i.C, g.B);
    }

    @Override
    public final void a(k2.d dVar) throws NoWhenBranchMatchedException {
        k2.h hVar;
        if (this.f11592n) {
            b.e(this.f11584d, this.f11596r);
            e();
        } else if (this.f11594p) {
            e();
        }
        this.f11592n = false;
        this.f11594p = false;
        i2.q qVar = this.f11582b;
        if (qVar != null) {
            k2.d.P0(dVar, this.f11597s, qVar, this.f11583c, null, 56);
        }
        i2.q qVar2 = this.f11587g;
        if (qVar2 != null) {
            k2.h hVar2 = this.f11595q;
            if (this.f11593o || hVar2 == null) {
                k2.h hVar3 = new k2.h(this.f11586f, this.f11590j, this.f11588h, this.f11589i, null, 16);
                this.f11595q = hVar3;
                this.f11593o = false;
                hVar = hVar3;
            } else {
                hVar = hVar2;
            }
            k2.d.P0(dVar, this.f11597s, qVar2, this.f11585e, hVar, 48);
        }
    }

    public final void e() {
        float f3 = this.f11591k;
        i2.g gVar = this.f11596r;
        if (f3 == 0.0f && this.l == 1.0f) {
            this.f11597s = gVar;
            return;
        }
        if (kotlin.jvm.internal.m.a(this.f11597s, gVar)) {
            this.f11597s = i2.j.a();
        } else {
            int i10 = this.f11597s.f7128a.getFillType() == Path.FillType.EVEN_ODD ? 1 : 0;
            this.f11597s.i();
            this.f11597s.j(i10);
        }
        ?? r4 = this.f11599u;
        ((i2.i) r4.getValue()).f7138a.setPath(gVar != null ? gVar.f7128a : null, false);
        float length = ((i2.i) r4.getValue()).f7138a.getLength();
        float f10 = this.f11591k;
        float f11 = this.m;
        float f12 = ((f10 + f11) % 1.0f) * length;
        float f13 = ((this.l + f11) % 1.0f) * length;
        if (f12 <= f13) {
            ((i2.i) r4.getValue()).a(f12, f13, this.f11597s);
            return;
        }
        i2.g gVarA = this.f11598t;
        if (gVarA == null) {
            gVarA = i2.j.a();
            this.f11598t = gVarA;
        }
        gVarA.h();
        ((i2.i) r4.getValue()).a(f12, length, gVarA);
        i2.g.a(this.f11597s, gVarA);
        gVarA.h();
        ((i2.i) r4.getValue()).a(0.0f, f13, gVarA);
        i2.g.a(this.f11597s, gVarA);
    }

    public final String toString() {
        return this.f11596r.toString();
    }
}

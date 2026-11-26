package u3;

import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextPaint;
import g1.a2;
import i2.b0;
import i2.q;
import i2.r0;
import i2.s0;
import i2.t;
import i2.v0;
import kh.o;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.m;
import l1.w;
import x3.l;

public final class d extends TextPaint {

    public i2.e f14926a;

    public l f14927b;

    public int f14928c;

    public s0 f14929d;

    public t f14930e;

    public q f14931f;

    public w f14932g;

    public h2.e f14933h;

    public k2.e f14934i;

    public final i2.e a() {
        i2.e eVar = this.f14926a;
        if (eVar != null) {
            return eVar;
        }
        i2.e eVar2 = new i2.e(this);
        this.f14926a = eVar2;
        return eVar2;
    }

    public final void b(int i10) {
        if (i10 == this.f14928c) {
            return;
        }
        a().d(i10);
        this.f14928c = i10;
    }

    public final void c(q qVar, long j9, float f3) {
        if (qVar == null) {
            this.f14932g = null;
            this.f14931f = null;
            this.f14933h = null;
            setShader(null);
            return;
        }
        if (qVar instanceof v0) {
            d(o.E(f3, ((v0) qVar).f7174a));
            return;
        }
        if (!(qVar instanceof r0)) {
            throw new NoWhenBranchMatchedException();
        }
        if (m.a(this.f14931f, qVar)) {
            h2.e eVar = this.f14933h;
            if (!(eVar == null ? false : h2.e.a(eVar.f6558a, j9))) {
                if (j9 != 9205357640488583168L) {
                    this.f14931f = qVar;
                    this.f14933h = new h2.e(j9);
                    this.f14932g = l1.q.r(new a2(qVar, j9, 1));
                }
            }
        } else {
            if (j9 != 9205357640488583168L) {
                this.f14931f = qVar;
                this.f14933h = new h2.e(j9);
                this.f14932g = l1.q.r(new a2(qVar, j9, 1));
            }
        }
        i2.e eVarA = a();
        w wVar = this.f14932g;
        eVarA.i(wVar != null ? (Shader) wVar.getValue() : null);
        this.f14930e = null;
        i.c(this, f3);
    }

    public final void d(long j9) {
        t tVar = this.f14930e;
        if (tVar == null ? false : t.c(tVar.f7169a, j9)) {
            return;
        }
        if (j9 != 16) {
            this.f14930e = new t(j9);
            setColor(b0.C(j9));
            this.f14932g = null;
            this.f14931f = null;
            this.f14933h = null;
            setShader(null);
        }
    }

    public final void e(k2.e eVar) {
        if (eVar == null || m.a(this.f14934i, eVar)) {
            return;
        }
        this.f14934i = eVar;
        if (eVar.equals(k2.g.f8922a)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (!(eVar instanceof k2.h)) {
            throw new NoWhenBranchMatchedException();
        }
        a().m(1);
        k2.h hVar = (k2.h) eVar;
        a().l(hVar.f8923a);
        i2.e eVarA = a();
        eVarA.f7120a.setStrokeMiter(hVar.f8924b);
        a().k(hVar.f8926d);
        a().j(hVar.f8925c);
        a().h(hVar.f8927e);
    }

    public final void f(s0 s0Var) {
        if (s0Var == null || m.a(this.f14929d, s0Var)) {
            return;
        }
        this.f14929d = s0Var;
        if (s0Var.equals(s0.f7158d)) {
            clearShadowLayer();
            return;
        }
        s0 s0Var2 = this.f14929d;
        float f3 = s0Var2.f7161c;
        if (f3 == 0.0f) {
            f3 = Float.MIN_VALUE;
        }
        setShadowLayer(f3, Float.intBitsToFloat((int) (s0Var2.f7160b >> 32)), Float.intBitsToFloat((int) (this.f14929d.f7160b & 4294967295L)), b0.C(this.f14929d.f7159a));
    }

    public final void g(l lVar) {
        if (lVar == null || m.a(this.f14927b, lVar)) {
            return;
        }
        this.f14927b = lVar;
        int i10 = lVar.f16420a;
        setUnderlineText((i10 | 1) == i10);
        int i11 = this.f14927b.f16420a;
        setStrikeThruText((i11 | 2) == i11);
    }
}

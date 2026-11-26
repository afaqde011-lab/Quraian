package r3;

import android.graphics.Rect;
import android.view.Choreographer;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.media3.common.q1;
import b3.j0;
import com.google.protobuf.RuntimeVersion;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import k9.x0;
import m3.n0;
import m3.q0;
import q0.r0;
import q0.t1;

public final class z implements r {

    public final View f13104a;

    public final x0 f13105b;

    public final q1 f13106c;

    public boolean f13107d;

    public u00.k f13108e;

    public u00.k f13109f;

    public w f13110g;

    public j f13111h;

    public final ArrayList f13112i;

    public final Object f13113j;

    public Rect f13114k;
    public final c l;
    public final m1.e m;

    public m9.f f13115n;

    public z(View view, c3.z zVar) {
        x0 x0Var = new x0(view);
        q1 q1Var = new q1(Choreographer.getInstance(), 5);
        this.f13104a = view;
        this.f13105b = x0Var;
        this.f13106c = q1Var;
        this.f13108e = b.D;
        this.f13109f = b.E;
        this.f13110g = new w(RuntimeVersion.SUFFIX, q0.f10518b, 4);
        this.f13111h = j.f13072g;
        this.f13112i = new ArrayList();
        this.f13113j = rd.a.I(g00.i.C, new j0(this, 23));
        this.l = new c(zVar, x0Var);
        this.m = new m1.e(0, new y[16]);
    }

    @Override
    public final void a() {
        i(y.A);
    }

    @Override
    public final void b() {
        i(y.C);
    }

    @Override
    public final void c(w wVar, w wVar2) {
        boolean z10 = (q0.c(this.f13110g.f13100b, wVar2.f13100b) && kotlin.jvm.internal.m.a(this.f13110g.f13101c, wVar2.f13101c)) ? false : true;
        this.f13110g = wVar2;
        int size = this.f13112i.size();
        for (int i10 = 0; i10 < size; i10++) {
            s sVar = (s) ((WeakReference) this.f13112i.get(i10)).get();
            if (sVar != null) {
                sVar.f13087d = wVar2;
            }
        }
        c cVar = this.l;
        synchronized (cVar.f13051c) {
            cVar.f13058j = null;
            cVar.l = null;
            cVar.f13059k = null;
            cVar.m = b.B;
            cVar.f13060n = null;
            cVar.f13061o = null;
        }
        if (kotlin.jvm.internal.m.a(wVar, wVar2)) {
            if (z10) {
                x0 x0Var = this.f13105b;
                int iG = q0.g(wVar2.f13100b);
                int iF = q0.f(wVar2.f13100b);
                q0 q0Var = this.f13110g.f13101c;
                int iG2 = q0Var != null ? q0.g(q0Var.f10520a) : -1;
                q0 q0Var2 = this.f13110g.f13101c;
                ((InputMethodManager) x0Var.C.getValue()).updateSelection((View) x0Var.B, iG, iF, iG2, q0Var2 != null ? q0.f(q0Var2.f10520a) : -1);
                return;
            }
            return;
        }
        if (wVar != null && (!kotlin.jvm.internal.m.a(wVar.f13099a.B, wVar2.f13099a.B) || (q0.c(wVar.f13100b, wVar2.f13100b) && !kotlin.jvm.internal.m.a(wVar.f13101c, wVar2.f13101c)))) {
            x0 x0Var2 = this.f13105b;
            ((InputMethodManager) x0Var2.C.getValue()).restartInput((View) x0Var2.B);
            return;
        }
        int size2 = this.f13112i.size();
        for (int i11 = 0; i11 < size2; i11++) {
            s sVar2 = (s) ((WeakReference) this.f13112i.get(i11)).get();
            if (sVar2 != null) {
                w wVar3 = this.f13110g;
                x0 x0Var3 = this.f13105b;
                if (sVar2.f13091h) {
                    sVar2.f13087d = wVar3;
                    if (sVar2.f13089f) {
                        ((InputMethodManager) x0Var3.C.getValue()).updateExtractedText((View) x0Var3.B, sVar2.f13088e, ca.v.H(wVar3));
                    }
                    q0 q0Var3 = wVar3.f13101c;
                    long j9 = wVar3.f13100b;
                    int iG3 = q0Var3 != null ? q0.g(q0Var3.f10520a) : -1;
                    q0 q0Var4 = wVar3.f13101c;
                    ((InputMethodManager) x0Var3.C.getValue()).updateSelection((View) x0Var3.B, q0.g(j9), q0.f(j9), iG3, q0Var4 != null ? q0.f(q0Var4.f10520a) : -1);
                }
            }
        }
    }

    @Override
    public final void d() {
        this.f13107d = false;
        this.f13108e = b.F;
        this.f13109f = b.G;
        this.f13114k = null;
        i(y.B);
    }

    @Override
    public final void e(w wVar, j jVar, t1 t1Var, r0 r0Var) {
        this.f13107d = true;
        this.f13110g = wVar;
        this.f13111h = jVar;
        this.f13108e = t1Var;
        this.f13109f = r0Var;
        i(y.A);
    }

    @Override
    public final void f() {
        i(y.D);
    }

    @Override
    public final void g(w wVar, p pVar, n0 n0Var, a20.d dVar, h2.c cVar, h2.c cVar2) {
        c cVar3 = this.l;
        synchronized (cVar3.f13051c) {
            try {
                cVar3.f13058j = wVar;
                cVar3.l = pVar;
                cVar3.f13059k = n0Var;
                cVar3.m = dVar;
                cVar3.f13060n = cVar;
                cVar3.f13061o = cVar2;
                if (cVar3.f13053e || cVar3.f13052d) {
                    cVar3.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void h(h2.c cVar) {
        Rect rect;
        this.f13114k = new Rect(w00.a.F(cVar.f6546a), w00.a.F(cVar.f6547b), w00.a.F(cVar.f6548c), w00.a.F(cVar.f6549d));
        if (!this.f13112i.isEmpty() || (rect = this.f13114k) == null) {
            return;
        }
        this.f13104a.requestRectangleOnScreen(new Rect(rect));
    }

    public final void i(y yVar) {
        this.m.b(yVar);
        if (this.f13115n == null) {
            m9.f fVar = new m9.f(this, 12);
            this.f13106c.execute(fVar);
            this.f13115n = fVar;
        }
    }
}

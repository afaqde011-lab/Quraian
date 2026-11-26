package ta;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import androidx.fragment.app.b2;
import androidx.fragment.app.j0;
import java.util.ArrayList;

public class m extends b2 {
    @Override
    public final void a(View view, Object obj) {
        ((t) obj).b(view);
    }

    @Override
    public final void b(Object obj, ArrayList arrayList) {
        t tVar = (t) obj;
        if (tVar == null) {
            return;
        }
        int i10 = 0;
        if (tVar instanceof z) {
            z zVar = (z) tVar;
            int size = zVar.f14504e0.size();
            while (i10 < size) {
                b(zVar.R(i10), arrayList);
                i10++;
            }
            return;
        }
        if (b2.k(tVar.E) && b2.k(tVar.F)) {
            int size2 = arrayList.size();
            while (i10 < size2) {
                tVar.b((View) arrayList.get(i10));
                i10++;
            }
        }
    }

    @Override
    public final void c(Object obj) {
        ((q) obj).g();
    }

    @Override
    public final void d(Object obj, androidx.fragment.app.m mVar) {
        q qVar = (q) obj;
        qVar.f14486g = mVar;
        if (!qVar.f14481b) {
            qVar.f14483d = 2;
        } else {
            qVar.h();
            qVar.f14484e.a(0.0f);
        }
    }

    @Override
    public final void e(ViewGroup viewGroup, Object obj) {
        x.a(viewGroup, (t) obj);
    }

    @Override
    public final boolean g(Object obj) {
        return obj instanceof t;
    }

    @Override
    public final Object h(Object obj) {
        if (obj != null) {
            return ((t) obj).clone();
        }
        return null;
    }

    @Override
    public final Object i(ViewGroup viewGroup, Object obj) {
        t tVar = (t) obj;
        ArrayList arrayList = x.f14501c;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut() || Build.VERSION.SDK_INT < 34) {
            return null;
        }
        if (!tVar.w()) {
            throw new IllegalArgumentException("The Transition must support seeking.");
        }
        arrayList.add(viewGroup);
        t tVarClone = tVar.clone();
        z zVar = new z();
        zVar.Q(tVarClone);
        x.c(viewGroup, zVar);
        viewGroup.setTag(2131363110, null);
        w wVar = new w();
        wVar.A = zVar;
        wVar.B = viewGroup;
        viewGroup.addOnAttachStateChangeListener(wVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(wVar);
        viewGroup.invalidate();
        q qVar = new q(zVar);
        zVar.Y = qVar;
        zVar.a(qVar);
        return zVar.Y;
    }

    @Override
    public final boolean l() {
        return true;
    }

    @Override
    public final boolean m(Object obj) {
        boolean zW = ((t) obj).w();
        if (!zW) {
            Log.v("FragmentManager", "Predictive back not available for AndroidX Transition " + obj + ". Please enable seeking support for the designated transition by overriding isSeekingSupported().");
        }
        return zW;
    }

    @Override
    public final Object n(Object obj, Object obj2, Object obj3) {
        t tVar = (t) obj;
        t tVar2 = (t) obj2;
        t tVar3 = (t) obj3;
        if (tVar != null && tVar2 != null) {
            z zVar = new z();
            zVar.Q(tVar);
            zVar.Q(tVar2);
            zVar.f14505f0 = false;
            tVar = zVar;
        } else if (tVar == null) {
            tVar = tVar2 != null ? tVar2 : null;
        }
        if (tVar3 == null) {
            return tVar;
        }
        z zVar2 = new z();
        if (tVar != null) {
            zVar2.Q(tVar);
        }
        zVar2.Q(tVar3);
        return zVar2;
    }

    @Override
    public final Object o(Object obj, Object obj2) {
        z zVar = new z();
        if (obj != null) {
            zVar.Q((t) obj);
        }
        zVar.Q((t) obj2);
        return zVar;
    }

    @Override
    public final void p(Object obj, View view, ArrayList arrayList) {
        ((t) obj).a(new j(view, arrayList));
    }

    @Override
    public final void q(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((t) obj).a(new k(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override
    public final void r(Object obj, float f3) {
        q qVar = (q) obj;
        boolean z10 = qVar.f14481b;
        if (z10) {
            z zVar = qVar.f14487h;
            long j9 = zVar.X;
            long j10 = (long) (f3 * j9);
            if (j10 == 0) {
                j10 = 1;
            }
            if (j10 == j9) {
                j10 = j9 - 1;
            }
            if (qVar.f14484e != null) {
                throw new IllegalStateException("setCurrentPlayTimeMillis() called after animation has been started");
            }
            long j11 = qVar.f14480a;
            if (j10 == j11 || !z10) {
                return;
            }
            if (!qVar.f14482c) {
                if (j10 == 0 && j11 > 0) {
                    j10 = -1;
                } else if (j10 == j9 && j11 < j9) {
                    j10 = j9 + 1;
                }
                if (j10 != j11) {
                    zVar.H(j10, j11);
                    qVar.f14480a = j10;
                }
            }
            c50.h hVar = qVar.f14485f;
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            int i10 = (hVar.B + 1) % 20;
            hVar.B = i10;
            ((long[]) hVar.C)[i10] = jCurrentAnimationTimeMillis;
            ((float[]) hVar.D)[i10] = j10;
        }
    }

    @Override
    public final void s(View view, Object obj) {
        if (view != null) {
            b2.j(view, new Rect());
            ((t) obj).J(new i());
        }
    }

    @Override
    public final void t(Object obj, Rect rect) {
        ((t) obj).J(new i());
    }

    @Override
    public final void u(j0 j0Var, Object obj, u4.b bVar, Runnable runnable) {
        v(obj, bVar, null, runnable);
    }

    @Override
    public final void v(Object obj, u4.b bVar, androidx.fragment.app.y yVar, Runnable runnable) {
        t tVar = (t) obj;
        ce.a aVar = new ce.a(yVar, tVar, runnable, 13);
        synchronized (bVar) {
            while (bVar.f14941c) {
                try {
                    try {
                        bVar.wait();
                    } catch (InterruptedException unused) {
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (bVar.f14940b != aVar) {
                bVar.f14940b = aVar;
                if (bVar.f14939a) {
                    Runnable runnable2 = (Runnable) aVar.D;
                    t tVar2 = (t) aVar.C;
                    Runnable runnable3 = (Runnable) aVar.B;
                    if (runnable2 == null) {
                        tVar2.cancel();
                        runnable3.run();
                    } else {
                        runnable2.run();
                    }
                }
            }
        }
        tVar.a(new l(runnable));
    }

    @Override
    public final void w(Object obj, View view, ArrayList arrayList) {
        z zVar = (z) obj;
        ArrayList arrayList2 = zVar.F;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            b2.f(arrayList2, (View) arrayList.get(i10));
        }
        arrayList2.add(view);
        arrayList.add(view);
        b(zVar, arrayList);
    }

    @Override
    public final void x(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        z zVar = (z) obj;
        if (zVar != null) {
            ArrayList arrayList3 = zVar.F;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            z(zVar, arrayList, arrayList2);
        }
    }

    @Override
    public final Object y(Object obj) {
        if (obj == null) {
            return null;
        }
        z zVar = new z();
        zVar.Q((t) obj);
        return zVar;
    }

    public final void z(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        t tVar = (t) obj;
        int i10 = 0;
        if (tVar instanceof z) {
            z zVar = (z) tVar;
            int size = zVar.f14504e0.size();
            while (i10 < size) {
                z(zVar.R(i10), arrayList, arrayList2);
                i10++;
            }
            return;
        }
        if (b2.k(tVar.E)) {
            ArrayList arrayList3 = tVar.F;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                int size2 = arrayList2 == null ? 0 : arrayList2.size();
                while (i10 < size2) {
                    tVar.b((View) arrayList2.get(i10));
                    i10++;
                }
                for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                    tVar.E((View) arrayList.get(size3));
                }
            }
        }
    }
}

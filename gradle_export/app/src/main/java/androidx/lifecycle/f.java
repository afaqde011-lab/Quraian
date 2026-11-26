package androidx.lifecycle;

import java.util.HashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

public final class f implements u {
    public final int A = 0;
    public final Object B;
    public final Object C;

    public f(DefaultLifecycleObserver defaultLifecycleObserver, u uVar) {
        kotlin.jvm.internal.m.e(defaultLifecycleObserver, "defaultLifecycleObserver");
        this.B = defaultLifecycleObserver;
        this.C = uVar;
    }

    public f(q qVar, ia.e eVar) {
        this.B = qVar;
        this.C = eVar;
    }

    public f(v vVar) {
        this.B = vVar;
        d dVar = d.f982c;
        Class<?> cls = vVar.getClass();
        b bVar = (b) dVar.f983a.get(cls);
        this.C = bVar == null ? dVar.a(cls, null) : bVar;
    }

    public f(d.y yVar, d.e0 e0Var, q qVar) {
        this.B = yVar;
        this.C = qVar;
    }

    @Override
    public final void a(w wVar, o oVar) throws NoWhenBranchMatchedException {
        switch (this.A) {
            case 0:
                DefaultLifecycleObserver defaultLifecycleObserver = (DefaultLifecycleObserver) this.B;
                switch (e.f986a[oVar.ordinal()]) {
                    case 1:
                        defaultLifecycleObserver.onCreate(wVar);
                        break;
                    case 2:
                        defaultLifecycleObserver.onStart(wVar);
                        break;
                    case 3:
                        defaultLifecycleObserver.onResume(wVar);
                        break;
                    case 4:
                        defaultLifecycleObserver.onPause(wVar);
                        break;
                    case 5:
                        defaultLifecycleObserver.onStop(wVar);
                        break;
                    case 6:
                        defaultLifecycleObserver.onDestroy(wVar);
                        break;
                    case 7:
                        throw new IllegalArgumentException("ON_ANY must not been send by anybody");
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                u uVar = (u) this.C;
                if (uVar != null) {
                    uVar.a(wVar, oVar);
                    return;
                }
                return;
            case 1:
                if (oVar == o.ON_START) {
                    ((q) this.B).d(this);
                    ((ia.e) this.C).d();
                    return;
                }
                return;
            case 2:
                HashMap map = ((b) this.C).f975a;
                List list = (List) map.get(oVar);
                Object obj = this.B;
                b.a(list, wVar, oVar, obj);
                b.a((List) map.get(o.ON_ANY), wVar, oVar, obj);
                return;
            default:
                d.y yVar = (d.y) this.B;
                int i10 = d.d0.f4381a[oVar.ordinal()];
                if (i10 == 1) {
                    yVar.h(true);
                    return;
                }
                if (i10 == 2) {
                    yVar.h(false);
                    return;
                } else {
                    if (i10 != 3) {
                        return;
                    }
                    yVar.f();
                    ((q) this.C).d(this);
                    return;
                }
        }
    }
}

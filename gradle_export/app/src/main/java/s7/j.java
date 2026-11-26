package s7;

import android.os.Handler;
import androidx.media3.common.k2;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class j extends a {

    public final HashMap f13696h = new HashMap();

    public Handler f13697i;

    public g7.s f13698j;

    @Override
    public final void d() {
        for (i iVar : this.f13696h.values()) {
            iVar.f13686a.c(iVar.f13687b);
        }
    }

    @Override
    public final void f() {
        for (i iVar : this.f13696h.values()) {
            iVar.f13686a.e(iVar.f13687b);
        }
    }

    @Override
    public void j() {
        Iterator it = this.f13696h.values().iterator();
        while (it.hasNext()) {
            ((i) it.next()).f13686a.j();
        }
    }

    @Override
    public void p() {
        HashMap map = this.f13696h;
        for (i iVar : map.values()) {
            a aVar = iVar.f13686a;
            h hVar = iVar.f13688c;
            aVar.o(iVar.f13687b);
            aVar.r(hVar);
            aVar.q(hVar);
        }
        map.clear();
    }

    public abstract a0 t(Object obj, a0 a0Var);

    public long u(Object obj, long j9) {
        return j9;
    }

    public int v(int i10, Object obj) {
        return i10;
    }

    public abstract void w(Object obj, a aVar, k2 k2Var);

    public final void x(final Object obj, a aVar) {
        HashMap map = this.f13696h;
        ta.c0.s(!map.containsKey(obj));
        ?? r4 = new b0() {
            @Override
            public final void a(a aVar2, k2 k2Var) {
                this.f13682a.w(obj, aVar2, k2Var);
            }
        };
        h hVar = new h(this, obj);
        map.put(obj, new i(aVar, r4, hVar));
        Handler handler = this.f13697i;
        handler.getClass();
        aVar.getClass();
        c50.h hVar2 = aVar.f13639c;
        hVar2.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) hVar2.D;
        f0 f0Var = new f0();
        f0Var.f13680a = handler;
        f0Var.f13681b = hVar;
        copyOnWriteArrayList.add(f0Var);
        Handler handler2 = this.f13697i;
        handler2.getClass();
        n7.h hVar3 = aVar.f13640d;
        hVar3.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList2 = hVar3.f11170c;
        n7.g gVar = new n7.g();
        gVar.f11166a = handler2;
        gVar.f11167b = hVar;
        copyOnWriteArrayList2.add(gVar);
        g7.s sVar = this.f13698j;
        j7.j jVar = this.f13643g;
        jVar.getClass();
        aVar.k(r4, sVar, jVar);
        if (this.f13638b.isEmpty()) {
            aVar.c(r4);
        }
    }
}

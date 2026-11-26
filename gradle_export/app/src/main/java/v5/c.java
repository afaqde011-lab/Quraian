package v5;

import android.os.Build;
import com.google.android.gms.common.api.internal.y;
import java.util.ArrayList;
import sd.p1;

public final class c extends w00.a {

    public final ki.b f15460b;

    public c(ki.b bVar) {
        super(24);
        this.f15460b = bVar;
    }

    public final void C(Throwable th2) {
        ((g) this.f15460b.f9680b).f(th2);
    }

    public final void D(p10.a aVar) {
        ki.b bVar = this.f15460b;
        bVar.f9681c = aVar;
        p10.a aVar2 = (p10.a) bVar.f9681c;
        g gVar = (g) bVar.f9680b;
        bVar.f9679a = new p1(aVar2, gVar.f15469g, gVar.f15471i, Build.VERSION.SDK_INT >= 34 ? j.a() : w50.c.K());
        g gVar2 = (g) bVar.f9680b;
        gVar2.getClass();
        ArrayList arrayList = new ArrayList();
        gVar2.f15463a.writeLock().lock();
        try {
            gVar2.f15465c = 1;
            arrayList.addAll(gVar2.f15464b);
            gVar2.f15464b.clear();
            gVar2.f15463a.writeLock().unlock();
            gVar2.f15466d.post(new y(arrayList, gVar2.f15465c, (Throwable) null));
        } catch (Throwable th2) {
            gVar2.f15463a.writeLock().unlock();
            throw th2;
        }
    }
}

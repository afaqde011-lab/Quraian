package z4;

import android.view.MenuItem;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class m {

    public final Runnable f17206a;

    public final CopyOnWriteArrayList f17207b = new CopyOnWriteArrayList();

    public final HashMap f17208c = new HashMap();

    public m(Runnable runnable) {
        this.f17206a = runnable;
    }

    public final boolean a(MenuItem menuItem) {
        Iterator it = this.f17207b.iterator();
        while (it.hasNext()) {
            if (((androidx.fragment.app.a1) ((n) it.next())).f689a.p(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void b(n nVar) {
        this.f17207b.remove(nVar);
        l lVar = (l) this.f17208c.remove(nVar);
        if (lVar != null) {
            lVar.f17204a.d(lVar.f17205b);
            lVar.f17205b = null;
        }
        this.f17206a.run();
    }
}

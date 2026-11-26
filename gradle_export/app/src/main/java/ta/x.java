package ta;

import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class x {

    public static final a f14499a;

    public static final ThreadLocal f14500b;

    public static final ArrayList f14501c;

    static {
        a aVar = new a();
        aVar.f14505f0 = false;
        aVar.Q(new h(2));
        aVar.Q(new f());
        aVar.Q(new h(1));
        f14499a = aVar;
        f14500b = new ThreadLocal();
        f14501c = new ArrayList();
    }

    public static void a(ViewGroup viewGroup, t tVar) {
        ArrayList arrayList = f14501c;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        arrayList.add(viewGroup);
        if (tVar == null) {
            tVar = f14499a;
        }
        t tVarClone = tVar.clone();
        c(viewGroup, tVarClone);
        viewGroup.setTag(2131363110, null);
        w wVar = new w();
        wVar.A = tVarClone;
        wVar.B = viewGroup;
        viewGroup.addOnAttachStateChangeListener(wVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(wVar);
    }

    public static u.e b() {
        u.e eVar;
        ThreadLocal threadLocal = f14500b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (eVar = (u.e) weakReference.get()) != null) {
            return eVar;
        }
        u.e eVar2 = new u.e(0);
        threadLocal.set(new WeakReference(eVar2));
        return eVar2;
    }

    public static void c(ViewGroup viewGroup, t tVar) {
        ArrayList arrayList = (ArrayList) b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((t) it.next()).B(viewGroup);
            }
        }
        if (tVar != null) {
            tVar.h(viewGroup, true);
        }
        if (viewGroup.getTag(2131363110) != null) {
            throw new ClassCastException();
        }
    }
}

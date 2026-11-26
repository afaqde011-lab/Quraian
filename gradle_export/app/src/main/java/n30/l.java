package n30;

import com.revenuecat.purchases.blockstore.BlockstoreHelper;
import h00.q;
import h00.x;
import i10.n;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.m;

public abstract class l {
    public static final j a = new j();

    public static final void a(AbstractCollection abstractCollection, Object obj) {
        if (obj != null) {
            abstractCollection.add(obj);
        }
    }

    public static final List d(ArrayList arrayList) {
        m.e(arrayList, "<this>");
        int size = arrayList.size();
        if (size == 0) {
            return x.A;
        }
        if (size == 1) {
            return va.a.R(q.L0(arrayList));
        }
        arrayList.trimToSize();
        return arrayList;
    }

    public static i e() {
        return new i(0);
    }

    public static Object f(List list, a aVar, l lVar) {
        gi.c cVar = new gi.c(25);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            g(it.next(), aVar, cVar, lVar);
        }
        return lVar.j();
    }

    public static void g(Object obj, a aVar, gi.c cVar, l lVar) {
        if (obj != null) {
            if (((HashSet) cVar.B).add(obj) && lVar.c(obj)) {
                Iterator it = aVar.b(obj).iterator();
                while (it.hasNext()) {
                    g(it.next(), aVar, cVar, lVar);
                }
                lVar.b(obj);
                return;
            }
            return;
        }
        Object[] objArr = new Object[3];
        switch (22) {
            case 1:
            case 5:
            case 8:
            case 11:
            case 15:
            case 18:
            case 21:
            case 23:
                objArr[0] = "neighbors";
                break;
            case 2:
            case 12:
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
            case 19:
            case 24:
                objArr[0] = "visited";
                break;
            case 3:
            case 6:
            case 13:
            case 25:
                objArr[0] = "handler";
                break;
            case 4:
            case 7:
            case 17:
            case 20:
            default:
                objArr[0] = "nodes";
                break;
            case 9:
                objArr[0] = "predicate";
                break;
            case 10:
            case 14:
                objArr[0] = "node";
                break;
            case 22:
                objArr[0] = "current";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/DFS";
        switch (22) {
            case 7:
            case 8:
            case 9:
                objArr[2] = "ifAny";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                objArr[2] = "dfsFromNode";
                break;
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                objArr[2] = "topologicalOrder";
                break;
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "doDfs";
                break;
            default:
                objArr[2] = "dfs";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static Boolean h(List list, a aVar, u00.k kVar) {
        return (Boolean) f(list, aVar, new n(1, new boolean[1], kVar));
    }

    public static final boolean i(Throwable th) {
        Class<?> superclass = th.getClass();
        while (!m.a(superclass.getCanonicalName(), "com.intellij.openapi.progress.ProcessCanceledException")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                return false;
            }
        }
        return true;
    }

    public static void k(Object obj) {
        if (obj instanceof k) {
            throw ((k) obj).a;
        }
    }

    public void b(Object obj) {
    }

    public abstract boolean c(Object obj);

    public abstract Object j();
}

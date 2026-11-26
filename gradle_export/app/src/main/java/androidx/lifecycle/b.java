package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class b {

    public final HashMap f975a = new HashMap();

    public final HashMap f976b;

    public b(HashMap map) {
        this.f976b = map;
        for (Map.Entry entry : map.entrySet()) {
            o oVar = (o) entry.getValue();
            List arrayList = (List) this.f975a.get(oVar);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f975a.put(oVar, arrayList);
            }
            arrayList.add((c) entry.getKey());
        }
    }

    public static void a(List list, w wVar, o oVar, Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                c cVar = (c) list.get(size);
                Method method = cVar.f981b;
                try {
                    int i10 = cVar.f980a;
                    if (i10 == 0) {
                        method.invoke(obj, null);
                    } else if (i10 == 1) {
                        method.invoke(obj, wVar);
                    } else if (i10 == 2) {
                        method.invoke(obj, wVar, oVar);
                    }
                } catch (IllegalAccessException e3) {
                    throw new RuntimeException(e3);
                } catch (InvocationTargetException e10) {
                    throw new RuntimeException("Failed to call observer method", e10.getCause());
                }
            }
        }
    }
}

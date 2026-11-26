package za;

import com.google.android.gms.internal.measurement.x5;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import z.y0;

public final class g {

    public static final g f17367b;

    public final HashMap f17368a;

    static {
        g gVar = new g(new LinkedHashMap());
        kh.n.f0(gVar);
        f17367b = gVar;
    }

    public g(LinkedHashMap linkedHashMap) {
        kotlin.jvm.internal.m.e(linkedHashMap, "values");
        this.f17368a = new HashMap(linkedHashMap);
    }

    public g(g gVar) {
        kotlin.jvm.internal.m.e(gVar, "other");
        this.f17368a = new HashMap(gVar.f17368a);
    }

    public final int a(String str, int i10) {
        Object objValueOf = Integer.valueOf(i10);
        Object obj = this.f17368a.get(str);
        if (obj instanceof Integer) {
            objValueOf = obj;
        }
        return ((Number) objValueOf).intValue();
    }

    public final long b() {
        Object obj = this.f17368a.get("surahId");
        return ((Number) (obj instanceof Long ? obj : -1L)).longValue();
    }

    public final String c(String str) {
        Object obj = this.f17368a.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final boolean d(String str) {
        Object obj = this.f17368a.get(str);
        return obj != null && String.class.isAssignableFrom(obj.getClass());
    }

    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this != obj) {
            if (obj != null && g.class.equals(obj.getClass())) {
                HashMap map = ((g) obj).f17368a;
                HashMap map2 = this.f17368a;
                Set<String> setKeySet = map2.keySet();
                if (kotlin.jvm.internal.m.a(setKeySet, map.keySet())) {
                    for (String str : setKeySet) {
                        Object obj2 = map2.get(str);
                        Object obj3 = map.get(str);
                        if (obj2 == null || obj3 == null) {
                            zEquals = obj2 == obj3;
                        } else if (obj2 instanceof Object[]) {
                            Object[] objArr = (Object[]) obj2;
                            if (obj3 instanceof Object[]) {
                                zEquals = h00.n.o0(objArr, (Object[]) obj3);
                            } else {
                                zEquals = obj2.equals(obj3);
                            }
                        } else {
                            zEquals = obj2.equals(obj3);
                        }
                        if (!zEquals) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = 0;
        for (Map.Entry entry : this.f17368a.entrySet()) {
            Object value = entry.getValue();
            iHashCode += value instanceof Object[] ? Objects.hashCode(entry.getKey()) ^ Arrays.deepHashCode((Object[]) value) : entry.hashCode();
        }
        return iHashCode * 31;
    }

    public final String toString() {
        return x5.n(new StringBuilder("Data {"), h00.q.R0(this.f17368a.entrySet(), (CharSequence) null, (String) null, (String) null, new y0(6), 31), "}");
    }
}

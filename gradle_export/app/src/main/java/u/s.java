package u;

import java.util.Map;
import java.util.Set;

public class s {

    public final int f14891a;

    public final a8.l f14892b;

    public final tf.y f14893c;

    public int f14894d;

    public int f14895e;

    public int f14896f;

    public s(int i10) {
        this.f14891a = i10;
        if (i10 <= 0) {
            v.a.c("maxSize <= 0");
            throw null;
        }
        this.f14892b = new a8.l(5);
        this.f14893c = new tf.y(13);
    }

    public Object a(Object obj) {
        kotlin.jvm.internal.m.e(obj, "key");
        return null;
    }

    public void b(boolean z10, Object obj, Object obj2, Object obj3) {
        kotlin.jvm.internal.m.e(obj, "key");
        kotlin.jvm.internal.m.e(obj2, "oldValue");
    }

    public final Object c(Object obj) {
        Object objPut;
        kotlin.jvm.internal.m.e(obj, "key");
        synchronized (this.f14893c) {
            a8.l lVar = this.f14892b;
            lVar.getClass();
            Object obj2 = lVar.A.get(obj);
            if (obj2 != null) {
                this.f14895e++;
                return obj2;
            }
            this.f14896f++;
            Object objA = a(obj);
            if (objA == null) {
                return null;
            }
            synchronized (this.f14893c) {
                try {
                    a8.l lVar2 = this.f14892b;
                    lVar2.getClass();
                    objPut = lVar2.A.put(obj, objA);
                    if (objPut != null) {
                        a8.l lVar3 = this.f14892b;
                        lVar3.getClass();
                        lVar3.A.put(obj, objPut);
                    } else {
                        this.f14894d += f(obj, objA);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (objPut != null) {
                b(false, obj, objA, objPut);
                return objPut;
            }
            h(this.f14891a);
            return objA;
        }
    }

    public final Object d(Object obj, Object obj2) {
        Object objPut;
        kotlin.jvm.internal.m.e(obj, "key");
        kotlin.jvm.internal.m.e(obj2, "value");
        synchronized (this.f14893c) {
            this.f14894d += f(obj, obj2);
            a8.l lVar = this.f14892b;
            lVar.getClass();
            objPut = lVar.A.put(obj, obj2);
            if (objPut != null) {
                this.f14894d -= f(obj, objPut);
            }
        }
        if (objPut != null) {
            b(false, obj, objPut, obj2);
        }
        h(this.f14891a);
        return objPut;
    }

    public final Object e(Object obj) {
        Object objRemove;
        kotlin.jvm.internal.m.e(obj, "key");
        synchronized (this.f14893c) {
            a8.l lVar = this.f14892b;
            lVar.getClass();
            objRemove = lVar.A.remove(obj);
            if (objRemove != null) {
                this.f14894d -= f(obj, objRemove);
            }
        }
        if (objRemove != null) {
            b(false, obj, objRemove, null);
        }
        return objRemove;
    }

    public final int f(Object obj, Object obj2) {
        int iG = g(obj, obj2);
        if (iG >= 0) {
            return iG;
        }
        String str = "Negative size: " + obj + '=' + obj2;
        kotlin.jvm.internal.m.e(str, "message");
        throw new IllegalStateException(str);
    }

    public int g(Object obj, Object obj2) {
        kotlin.jvm.internal.m.e(obj, "key");
        kotlin.jvm.internal.m.e(obj2, "value");
        return 1;
    }

    public final void h(int i10) {
        Object key;
        Object value;
        while (true) {
            synchronized (this.f14893c) {
                try {
                    if (this.f14894d < 0 || (this.f14892b.A.isEmpty() && this.f14894d != 0)) {
                        break;
                    }
                    if (this.f14894d > i10 && !this.f14892b.A.isEmpty()) {
                        Set setEntrySet = this.f14892b.A.entrySet();
                        kotlin.jvm.internal.m.d(setEntrySet, "<get-entries>(...)");
                        Map.Entry entry = (Map.Entry) h00.q.M0(setEntrySet);
                        if (entry == null) {
                            return;
                        }
                        key = entry.getKey();
                        value = entry.getValue();
                        a8.l lVar = this.f14892b;
                        lVar.getClass();
                        kotlin.jvm.internal.m.e(key, "key");
                        lVar.A.remove(key);
                        this.f14894d -= f(key, value);
                    }
                    return;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            b(true, key, value, null);
        }
        throw new IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
    }

    public final String toString() {
        String str;
        synchronized (this.f14893c) {
            try {
                int i10 = this.f14895e;
                int i11 = this.f14896f + i10;
                str = "LruCache[maxSize=" + this.f14891a + ",hits=" + this.f14895e + ",misses=" + this.f14896f + ",hitRate=" + (i11 != 0 ? (i10 * 100) / i11 : 0) + "%]";
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }
}

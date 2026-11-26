package t5;

import g00.k;
import h00.d0;
import h00.r;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.m;
import o9.q;

public final class b {

    public final LinkedHashMap f14354a;

    public final q f14355b;

    public b(LinkedHashMap linkedHashMap, boolean z10) {
        this.f14354a = linkedHashMap;
        this.f14355b = new q(z10);
    }

    public b(boolean z10) {
        this(new LinkedHashMap(), z10);
    }

    public final Map a() {
        k kVar;
        Set<Map.Entry> setEntrySet = this.f14354a.entrySet();
        int iP = d0.P(r.q0(setEntrySet, 10));
        if (iP < 16) {
            iP = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iP);
        for (Map.Entry entry : setEntrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                Object key = entry.getKey();
                byte[] bArr = (byte[]) value;
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                m.d(bArrCopyOf, "copyOf(this, size)");
                kVar = new k(key, bArrCopyOf);
            } else {
                kVar = new k(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(kVar.A, kVar.B);
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        m.d(mapUnmodifiableMap, "unmodifiableMap(map)");
        return mapUnmodifiableMap;
    }

    public final void b() {
        if (((AtomicBoolean) this.f14355b.B).get()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
    }

    public final Object c(d dVar) {
        m.e(dVar, "key");
        Object obj = this.f14354a.get(dVar);
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        m.d(bArrCopyOf, "copyOf(this, size)");
        return bArrCopyOf;
    }

    public final void d(d dVar) {
        m.e(dVar, "key");
        b();
        this.f14354a.remove(dVar);
    }

    public final void e(d dVar, Object obj) {
        m.e(dVar, "key");
        f(dVar, obj);
    }

    public final boolean equals(Object obj) {
        boolean zA;
        if (obj instanceof b) {
            LinkedHashMap linkedHashMap = ((b) obj).f14354a;
            LinkedHashMap linkedHashMap2 = this.f14354a;
            if (linkedHashMap != linkedHashMap2) {
                if (linkedHashMap.size() == linkedHashMap2.size()) {
                    if (!linkedHashMap.isEmpty()) {
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            Object obj2 = linkedHashMap2.get(entry.getKey());
                            if (obj2 != null) {
                                Object value = entry.getValue();
                                if (!(value instanceof byte[])) {
                                    zA = m.a(value, obj2);
                                } else if ((obj2 instanceof byte[]) && Arrays.equals((byte[]) value, (byte[]) obj2)) {
                                    zA = true;
                                } else {
                                    zA = false;
                                }
                            } else {
                                zA = false;
                            }
                            if (!zA) {
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final void f(d dVar, Object obj) {
        m.e(dVar, "key");
        b();
        if (obj == null) {
            d(dVar);
            return;
        }
        boolean z10 = obj instanceof Set;
        LinkedHashMap linkedHashMap = this.f14354a;
        if (z10) {
            Set setUnmodifiableSet = Collections.unmodifiableSet(h00.q.r1((Set) obj));
            m.d(setUnmodifiableSet, "unmodifiableSet(set.toSet())");
            linkedHashMap.put(dVar, setUnmodifiableSet);
        } else {
            if (!(obj instanceof byte[])) {
                linkedHashMap.put(dVar, obj);
                return;
            }
            byte[] bArr = (byte[]) obj;
            byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            m.d(bArrCopyOf, "copyOf(this, size)");
            linkedHashMap.put(dVar, bArrCopyOf);
        }
    }

    public final b g() {
        return new b(d0.b0(a()), false);
    }

    public final b h() {
        return new b(d0.b0(a()), true);
    }

    public final int hashCode() {
        Iterator it = this.f14354a.entrySet().iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            iHashCode += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return iHashCode;
    }

    public final String toString() {
        return h00.q.R0(this.f14354a.entrySet(), ",\n", "{\n", "\n}", a.A, 24);
    }
}

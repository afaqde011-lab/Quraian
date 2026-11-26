package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class g0 extends LinkedHashMap {
    public static final g0 B;
    public boolean A = true;

    static {
        g0 g0Var = new g0();
        B = g0Var;
        g0Var.A = false;
    }

    public final void a() {
        if (!this.A) {
            throw new UnsupportedOperationException();
        }
    }

    public final g0 c() {
        if (isEmpty()) {
            return new g0();
        }
        g0 g0Var = new g0(this);
        g0Var.A = true;
        return g0Var;
    }

    @Override
    public final void clear() {
        a();
        super.clear();
    }

    @Override
    public final Set entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    @Override
    public final boolean equals(Object obj) {
        boolean z10;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this != map) {
                if (size() == map.size()) {
                    Iterator it = entrySet().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            if (map.containsKey(entry.getKey())) {
                                Object value = entry.getValue();
                                Object obj2 = map.get(entry.getKey());
                                if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                                }
                            }
                        } else {
                            z10 = true;
                        }
                    }
                }
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int iHashCode;
        int i10 = 0;
        for (Map.Entry entry : entrySet()) {
            Object key = entry.getKey();
            int iHashCode2 = 1;
            if (key instanceof byte[]) {
                byte[] bArr = (byte[]) key;
                int length = bArr.length;
                Charset charset = x.f684a;
                iHashCode = length;
                for (byte b7 : bArr) {
                    iHashCode = (iHashCode * 31) + b7;
                }
                if (iHashCode == 0) {
                    iHashCode = 1;
                }
            } else {
                iHashCode = key.hashCode();
            }
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr2 = (byte[]) value;
                int length2 = bArr2.length;
                Charset charset2 = x.f684a;
                int i11 = length2;
                for (byte b10 : bArr2) {
                    i11 = (i11 * 31) + b10;
                }
                if (i11 != 0) {
                    iHashCode2 = i11;
                }
            } else {
                iHashCode2 = value.hashCode();
            }
            i10 += iHashCode ^ iHashCode2;
        }
        return i10;
    }

    @Override
    public final Object put(Object obj, Object obj2) {
        a();
        Charset charset = x.f684a;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override
    public final void putAll(Map map) {
        a();
        for (Object obj : map.keySet()) {
            Charset charset = x.f684a;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override
    public final Object remove(Object obj) {
        a();
        return super.remove(obj);
    }
}

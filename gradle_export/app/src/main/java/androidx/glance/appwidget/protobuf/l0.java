package androidx.glance.appwidget.protobuf;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class l0 extends LinkedHashMap {
    public static final l0 B;
    public boolean A = true;

    static {
        l0 l0Var = new l0();
        B = l0Var;
        l0Var.A = false;
    }

    public static int a(Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof b0) {
                throw new UnsupportedOperationException();
            }
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        Charset charset = e0.f885a;
        int i10 = length;
        for (byte b7 : bArr) {
            i10 = (i10 * 31) + b7;
        }
        if (i10 == 0) {
            return 1;
        }
        return i10;
    }

    public final void c() {
        if (!this.A) {
            throw new UnsupportedOperationException();
        }
    }

    @Override
    public final void clear() {
        c();
        super.clear();
    }

    public final l0 d() {
        if (isEmpty()) {
            return new l0();
        }
        l0 l0Var = new l0(this);
        l0Var.A = true;
        return l0Var;
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
        int iA = 0;
        for (Map.Entry entry : entrySet()) {
            iA += a(entry.getValue()) ^ a(entry.getKey());
        }
        return iA;
    }

    @Override
    public final Object put(Object obj, Object obj2) {
        c();
        Charset charset = e0.f885a;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override
    public final void putAll(Map map) {
        c();
        for (Object obj : map.keySet()) {
            Charset charset = e0.f885a;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override
    public final Object remove(Object obj) {
        c();
        return super.remove(obj);
    }
}

package h1;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public final class n0 {

    public final Map f6524a;

    public n0(Map map) {
        this.f6524a = map;
    }

    public final Object a(float f3) {
        Object next;
        Iterator it = this.f6524a.entrySet().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                float fAbs = Math.abs(f3 - ((Number) ((Map.Entry) next).getValue()).floatValue());
                do {
                    Object next2 = it.next();
                    float fAbs2 = Math.abs(f3 - ((Number) ((Map.Entry) next2).getValue()).floatValue());
                    if (Float.compare(fAbs, fAbs2) > 0) {
                        next = next2;
                        fAbs = fAbs2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return entry.getKey();
        }
        return null;
    }

    public final Object b(float f3, boolean z10) {
        Object next;
        Iterator it = this.f6524a.entrySet().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                float fFloatValue = ((Number) ((Map.Entry) next).getValue()).floatValue();
                float f10 = z10 ? fFloatValue - f3 : f3 - fFloatValue;
                if (f10 < 0.0f) {
                    f10 = Float.POSITIVE_INFINITY;
                }
                do {
                    Object next2 = it.next();
                    float fFloatValue2 = ((Number) ((Map.Entry) next2).getValue()).floatValue();
                    float f11 = z10 ? fFloatValue2 - f3 : f3 - fFloatValue2;
                    if (f11 < 0.0f) {
                        f11 = Float.POSITIVE_INFINITY;
                    }
                    if (Float.compare(f10, f11) > 0) {
                        next = next2;
                        f10 = f11;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return entry.getKey();
        }
        return null;
    }

    public final float c() {
        Float fValueOf;
        Collection collectionValues = this.f6524a.values();
        kotlin.jvm.internal.m.e(collectionValues, "<this>");
        Iterator it = collectionValues.iterator();
        if (it.hasNext()) {
            float fFloatValue = ((Number) it.next()).floatValue();
            while (it.hasNext()) {
                fFloatValue = Math.min(fFloatValue, ((Number) it.next()).floatValue());
            }
            fValueOf = Float.valueOf(fFloatValue);
        } else {
            fValueOf = null;
        }
        if (fValueOf != null) {
            return fValueOf.floatValue();
        }
        return Float.NaN;
    }

    public final float d(Object obj) {
        Float f3 = (Float) this.f6524a.get(obj);
        if (f3 != null) {
            return f3.floatValue();
        }
        return Float.NaN;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        return kotlin.jvm.internal.m.a(this.f6524a, ((n0) obj).f6524a);
    }

    public final int hashCode() {
        return this.f6524a.hashCode() * 31;
    }

    public final String toString() {
        return w.c.m(new StringBuilder("MapDraggableAnchors("), this.f6524a, ')');
    }
}

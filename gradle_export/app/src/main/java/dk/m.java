package dk;

import java.util.Map;

public final class m implements Map.Entry {
    public m A;
    public m B;
    public m C;
    public m D;
    public m E;
    public final Object F;
    public final boolean G;
    public Object H;
    public int I;

    public m(boolean z10) {
        this.F = null;
        this.G = z10;
        this.E = this;
        this.D = this;
    }

    public m(boolean z10, m mVar, Object obj, m mVar2, m mVar3) {
        this.A = mVar;
        this.F = obj;
        this.G = z10;
        this.I = 1;
        this.D = mVar2;
        this.E = mVar3;
        mVar3.D = this;
        mVar2.E = this;
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.F;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.H;
                if (obj3 == null) {
                    if (entry.getValue() == null) {
                        return true;
                    }
                } else if (obj3.equals(entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final Object getKey() {
        return this.F;
    }

    @Override
    public final Object getValue() {
        return this.H;
    }

    @Override
    public final int hashCode() {
        Object obj = this.F;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.H;
        return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override
    public final Object setValue(Object obj) {
        if (obj == null && !this.G) {
            throw new NullPointerException("value == null");
        }
        Object obj2 = this.H;
        this.H = obj;
        return obj2;
    }

    public final String toString() {
        return this.F + "=" + this.H;
    }
}

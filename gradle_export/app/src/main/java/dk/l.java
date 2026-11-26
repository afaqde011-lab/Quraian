package dk;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

public final class l extends AbstractSet {
    public final int A;
    public final n B;

    public l(n nVar, int i10) {
        this.A = i10;
        this.B = nVar;
    }

    @Override
    public final void clear() {
        switch (this.A) {
            case 0:
                this.B.clear();
                break;
            default:
                this.B.clear();
                break;
        }
    }

    @Override
    public final boolean contains(Object obj) {
        m mVarA;
        switch (this.A) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                n nVar = this.B;
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                m mVar = null;
                if (key != null) {
                    try {
                        mVarA = nVar.a(key, false);
                    } catch (ClassCastException unused) {
                        mVarA = null;
                    }
                    break;
                } else {
                    mVarA = null;
                }
                if (mVarA != null && Objects.equals(mVarA.H, entry.getValue())) {
                    mVar = mVarA;
                }
                return mVar != null;
            default:
                return this.B.containsKey(obj);
        }
    }

    @Override
    public final Iterator iterator() {
        switch (this.A) {
            case 0:
                return new k(this.B, 0);
            default:
                return new k(this.B, 1);
        }
    }

    @Override
    public final boolean remove(Object obj) {
        m mVarA;
        switch (this.A) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                n nVar = this.B;
                m mVar = null;
                if (key != null) {
                    try {
                        mVarA = nVar.a(key, false);
                    } catch (ClassCastException unused) {
                        mVarA = null;
                    }
                    break;
                } else {
                    mVarA = null;
                }
                if (mVarA != null && Objects.equals(mVarA.H, entry.getValue())) {
                    mVar = mVarA;
                }
                if (mVar == null) {
                    return false;
                }
                nVar.d(mVar, true);
                return true;
            default:
                n nVar2 = this.B;
                m mVarA2 = null;
                if (obj != null) {
                    try {
                        mVarA2 = nVar2.a(obj, false);
                        break;
                    } catch (ClassCastException unused2) {
                    }
                }
                if (mVarA2 != null) {
                    nVar2.d(mVarA2, true);
                }
                return mVarA2 != null;
        }
    }

    @Override
    public final int size() {
        switch (this.A) {
            case 0:
                break;
        }
        return this.B.D;
    }
}

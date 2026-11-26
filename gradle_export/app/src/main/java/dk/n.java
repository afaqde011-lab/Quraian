package dk;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Set;

public final class n extends AbstractMap implements Serializable {
    public static final ba.m I = new ba.m(3);
    public final boolean B;
    public m C;
    public final m F;
    public l G;
    public l H;
    public int D = 0;
    public int E = 0;
    public final Comparator A = I;

    public n(boolean z10) {
        this.B = z10;
        this.F = new m(z10);
    }

    public final m a(Object obj, boolean z10) {
        int iCompareTo;
        m mVar;
        m mVar2 = this.C;
        ba.m mVar3 = I;
        Comparator comparator = this.A;
        if (mVar2 != null) {
            Comparable comparable = comparator == mVar3 ? (Comparable) obj : null;
            while (true) {
                Object obj2 = mVar2.F;
                iCompareTo = comparable != null ? comparable.compareTo(obj2) : comparator.compare(obj, obj2);
                if (iCompareTo == 0) {
                    return mVar2;
                }
                m mVar4 = iCompareTo < 0 ? mVar2.B : mVar2.C;
                if (mVar4 == null) {
                    break;
                }
                mVar2 = mVar4;
            }
        } else {
            iCompareTo = 0;
        }
        m mVar5 = mVar2;
        if (!z10) {
            return null;
        }
        m mVar6 = this.F;
        if (mVar5 != null) {
            mVar = new m(this.B, mVar5, obj, mVar6, mVar6.E);
            if (iCompareTo < 0) {
                mVar5.B = mVar;
            } else {
                mVar5.C = mVar;
            }
            c(mVar5, true);
        } else {
            if (comparator == mVar3 && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            mVar = new m(this.B, mVar5, obj, mVar6, mVar6.E);
            this.C = mVar;
        }
        this.D++;
        this.E++;
        return mVar;
    }

    public final void c(m mVar, boolean z10) {
        while (mVar != null) {
            m mVar2 = mVar.B;
            m mVar3 = mVar.C;
            int i10 = mVar2 != null ? mVar2.I : 0;
            int i11 = mVar3 != null ? mVar3.I : 0;
            int i12 = i10 - i11;
            if (i12 == -2) {
                m mVar4 = mVar3.B;
                m mVar5 = mVar3.C;
                int i13 = (mVar4 != null ? mVar4.I : 0) - (mVar5 != null ? mVar5.I : 0);
                if (i13 == -1 || (i13 == 0 && !z10)) {
                    f(mVar);
                } else {
                    g(mVar3);
                    f(mVar);
                }
                if (z10) {
                    return;
                }
            } else if (i12 == 2) {
                m mVar6 = mVar2.B;
                m mVar7 = mVar2.C;
                int i14 = (mVar6 != null ? mVar6.I : 0) - (mVar7 != null ? mVar7.I : 0);
                if (i14 == 1 || (i14 == 0 && !z10)) {
                    g(mVar);
                } else {
                    f(mVar2);
                    g(mVar);
                }
                if (z10) {
                    return;
                }
            } else if (i12 == 0) {
                mVar.I = i10 + 1;
                if (z10) {
                    return;
                }
            } else {
                mVar.I = Math.max(i10, i11) + 1;
                if (!z10) {
                    return;
                }
            }
            mVar = mVar.A;
        }
    }

    @Override
    public final void clear() {
        this.C = null;
        this.D = 0;
        this.E++;
        m mVar = this.F;
        mVar.E = mVar;
        mVar.D = mVar;
    }

    @Override
    public final boolean containsKey(Object obj) {
        m mVarA = null;
        if (obj != null) {
            try {
                mVarA = a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return mVarA != null;
    }

    public final void d(m mVar, boolean z10) {
        m mVar2;
        m mVar3;
        int i10;
        if (z10) {
            m mVar4 = mVar.E;
            mVar4.D = mVar.D;
            mVar.D.E = mVar4;
        }
        m mVar5 = mVar.B;
        m mVar6 = mVar.C;
        m mVar7 = mVar.A;
        int i11 = 0;
        if (mVar5 == null || mVar6 == null) {
            if (mVar5 != null) {
                e(mVar, mVar5);
                mVar.B = null;
            } else if (mVar6 != null) {
                e(mVar, mVar6);
                mVar.C = null;
            } else {
                e(mVar, null);
            }
            c(mVar7, false);
            this.D--;
            this.E++;
            return;
        }
        if (mVar5.I > mVar6.I) {
            m mVar8 = mVar5.C;
            while (true) {
                m mVar9 = mVar8;
                mVar3 = mVar5;
                mVar5 = mVar9;
                if (mVar5 == null) {
                    break;
                } else {
                    mVar8 = mVar5.C;
                }
            }
        } else {
            m mVar10 = mVar6.B;
            while (true) {
                mVar2 = mVar6;
                mVar6 = mVar10;
                if (mVar6 == null) {
                    break;
                } else {
                    mVar10 = mVar6.B;
                }
            }
            mVar3 = mVar2;
        }
        d(mVar3, false);
        m mVar11 = mVar.B;
        if (mVar11 != null) {
            i10 = mVar11.I;
            mVar3.B = mVar11;
            mVar11.A = mVar3;
            mVar.B = null;
        } else {
            i10 = 0;
        }
        m mVar12 = mVar.C;
        if (mVar12 != null) {
            i11 = mVar12.I;
            mVar3.C = mVar12;
            mVar12.A = mVar3;
            mVar.C = null;
        }
        mVar3.I = Math.max(i10, i11) + 1;
        e(mVar, mVar3);
    }

    public final void e(m mVar, m mVar2) {
        m mVar3 = mVar.A;
        mVar.A = null;
        if (mVar2 != null) {
            mVar2.A = mVar3;
        }
        if (mVar3 == null) {
            this.C = mVar2;
        } else if (mVar3.B == mVar) {
            mVar3.B = mVar2;
        } else {
            mVar3.C = mVar2;
        }
    }

    @Override
    public final Set entrySet() {
        l lVar = this.G;
        if (lVar != null) {
            return lVar;
        }
        l lVar2 = new l(this, 0);
        this.G = lVar2;
        return lVar2;
    }

    public final void f(m mVar) {
        m mVar2 = mVar.B;
        m mVar3 = mVar.C;
        m mVar4 = mVar3.B;
        m mVar5 = mVar3.C;
        mVar.C = mVar4;
        if (mVar4 != null) {
            mVar4.A = mVar;
        }
        e(mVar, mVar3);
        mVar3.B = mVar;
        mVar.A = mVar3;
        int iMax = Math.max(mVar2 != null ? mVar2.I : 0, mVar4 != null ? mVar4.I : 0) + 1;
        mVar.I = iMax;
        mVar3.I = Math.max(iMax, mVar5 != null ? mVar5.I : 0) + 1;
    }

    public final void g(m mVar) {
        m mVar2 = mVar.B;
        m mVar3 = mVar.C;
        m mVar4 = mVar2.B;
        m mVar5 = mVar2.C;
        mVar.B = mVar5;
        if (mVar5 != null) {
            mVar5.A = mVar;
        }
        e(mVar, mVar2);
        mVar2.C = mVar;
        mVar.A = mVar2;
        int iMax = Math.max(mVar3 != null ? mVar3.I : 0, mVar5 != null ? mVar5.I : 0) + 1;
        mVar.I = iMax;
        mVar2.I = Math.max(iMax, mVar4 != null ? mVar4.I : 0) + 1;
    }

    @Override
    public final Object get(Object obj) {
        m mVarA;
        if (obj != null) {
            try {
                mVarA = a(obj, false);
            } catch (ClassCastException unused) {
                mVarA = null;
            }
        } else {
            mVarA = null;
        }
        if (mVarA != null) {
            return mVarA.H;
        }
        return null;
    }

    @Override
    public final Set keySet() {
        l lVar = this.H;
        if (lVar != null) {
            return lVar;
        }
        l lVar2 = new l(this, 1);
        this.H = lVar2;
        return lVar2;
    }

    @Override
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        if (obj2 == null && !this.B) {
            throw new NullPointerException("value == null");
        }
        m mVarA = a(obj, true);
        Object obj3 = mVarA.H;
        mVarA.H = obj2;
        return obj3;
    }

    @Override
    public final Object remove(Object obj) {
        m mVarA;
        if (obj != null) {
            try {
                mVarA = a(obj, false);
            } catch (ClassCastException unused) {
                mVarA = null;
            }
        } else {
            mVarA = null;
        }
        if (mVarA != null) {
            d(mVarA, true);
        }
        if (mVarA != null) {
            return mVarA.H;
        }
        return null;
    }

    @Override
    public final int size() {
        return this.D;
    }
}

package o20;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;

public final class y extends e {
    public static final int[] H;
    public final int B;
    public final e C;
    public final e D;
    public final int E;
    public final int F;
    public int G = 0;

    static {
        ArrayList arrayList = new ArrayList();
        int i = 1;
        int i2 = 1;
        while (i > 0) {
            arrayList.add(Integer.valueOf(i));
            int i3 = i2 + i;
            i2 = i;
            i = i3;
        }
        arrayList.add(Integer.MAX_VALUE);
        H = new int[arrayList.size()];
        int i4 = 0;
        while (true) {
            int[] iArr = H;
            if (i4 >= iArr.length) {
                return;
            }
            iArr[i4] = ((Integer) arrayList.get(i4)).intValue();
            i4++;
        }
    }

    public y(e eVar, e eVar2) {
        this.C = eVar;
        this.D = eVar2;
        int size = eVar.size();
        this.E = size;
        this.B = eVar2.size() + size;
        this.F = Math.max(eVar.h(), eVar2.h()) + 1;
    }

    @Override
    public final void e(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i3;
        e eVar = this.C;
        int i5 = this.E;
        if (i4 <= i5) {
            eVar.e(bArr, i, i2, i3);
            return;
        }
        e eVar2 = this.D;
        if (i >= i5) {
            eVar2.e(bArr, i - i5, i2, i3);
            return;
        }
        int i6 = i5 - i;
        eVar.e(bArr, i, i2, i6);
        eVar2.e(bArr, 0, i2 + i6, i3 - i6);
    }

    public final boolean equals(Object obj) {
        int iO;
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            int size = eVar.size();
            int i = this.B;
            if (i == size) {
                if (i == 0) {
                    return true;
                }
                if (this.G == 0 || (iO = eVar.o()) == 0 || this.G == iO) {
                    w wVar = new w(this);
                    t tVarA = wVar.next();
                    w wVar2 = new w(eVar);
                    t tVarA2 = wVar2.next();
                    int i2 = 0;
                    int i3 = 0;
                    int i4 = 0;
                    while (true) {
                        int length = tVarA.B.length - i2;
                        int length2 = tVarA2.B.length - i3;
                        int iMin = Math.min(length, length2);
                        if (!(i2 == 0 ? tVarA.s(tVarA2, i3, iMin) : tVarA2.s(tVarA, i2, iMin))) {
                            break;
                        }
                        i4 += iMin;
                        if (i4 >= i) {
                            if (i4 == i) {
                                return true;
                            }
                            throw new IllegalStateException();
                        }
                        if (iMin == length) {
                            tVarA = wVar.next();
                            i2 = 0;
                        } else {
                            i2 += iMin;
                        }
                        if (iMin == length2) {
                            tVarA2 = wVar2.next();
                            i3 = 0;
                        } else {
                            i3 += iMin;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final int h() {
        return this.F;
    }

    public final int hashCode() {
        int iM = this.G;
        if (iM == 0) {
            int i = this.B;
            iM = m(i, 0, i);
            if (iM == 0) {
                iM = 1;
            }
            this.G = iM;
        }
        return iM;
    }

    @Override
    public final boolean i() {
        return this.B >= H[this.F];
    }

    @Override
    public final Iterator iterator() {
        return new x(this);
    }

    @Override
    public final boolean k() {
        int iN = this.C.n(0, 0, this.E);
        e eVar = this.D;
        return eVar.n(iN, 0, eVar.size()) == 0;
    }

    @Override
    public final int m(int i, int i2, int i3) {
        int i4 = i2 + i3;
        e eVar = this.C;
        int i5 = this.E;
        if (i4 <= i5) {
            return eVar.m(i, i2, i3);
        }
        e eVar2 = this.D;
        if (i2 >= i5) {
            return eVar2.m(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return eVar2.m(eVar.m(i, i2, i6), 0, i3 - i6);
    }

    @Override
    public final int n(int i, int i2, int i3) {
        int i4 = i2 + i3;
        e eVar = this.C;
        int i5 = this.E;
        if (i4 <= i5) {
            return eVar.n(i, i2, i3);
        }
        e eVar2 = this.D;
        if (i2 >= i5) {
            return eVar2.n(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return eVar2.n(eVar.n(i, i2, i6), 0, i3 - i6);
    }

    @Override
    public final int o() {
        return this.G;
    }

    @Override
    public final String p() {
        byte[] bArr;
        int i = this.B;
        if (i == 0) {
            bArr = q.a;
        } else {
            byte[] bArr2 = new byte[i];
            e(bArr2, 0, 0, i);
            bArr = bArr2;
        }
        return new String(bArr, "UTF-8");
    }

    @Override
    public final void r(OutputStream outputStream, int i, int i2) {
        int i3 = i + i2;
        e eVar = this.C;
        int i4 = this.E;
        if (i3 <= i4) {
            eVar.r(outputStream, i, i2);
            return;
        }
        e eVar2 = this.D;
        if (i >= i4) {
            eVar2.r(outputStream, i - i4, i2);
            return;
        }
        int i5 = i4 - i;
        eVar.r(outputStream, i, i5);
        eVar2.r(outputStream, 0, i2 - i5);
    }

    @Override
    public final int size() {
        return this.B;
    }
}

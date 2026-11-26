package e50;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.Arrays;

public final class c {
    public final k50.i a;
    public boolean c;
    public int g;
    public int h;
    public int b = Integer.MAX_VALUE;
    public int d = 4096;
    public a[] e = new a[8];
    public int f = 7;

    public c(k50.i iVar) {
        this.a = iVar;
    }

    public final void a(int i) {
        int i2;
        if (i > 0) {
            int length = this.e.length - 1;
            int i3 = 0;
            while (true) {
                i2 = this.f;
                if (length < i2 || i <= 0) {
                    break;
                }
                a aVar = this.e[length];
                kotlin.jvm.internal.m.b(aVar);
                i -= aVar.c;
                int i4 = this.h;
                a aVar2 = this.e[length];
                kotlin.jvm.internal.m.b(aVar2);
                this.h = i4 - aVar2.c;
                this.g--;
                i3++;
                length--;
            }
            a[] aVarArr = this.e;
            int i5 = i2 + 1;
            System.arraycopy(aVarArr, i5, aVarArr, i5 + i3, this.g);
            a[] aVarArr2 = this.e;
            int i6 = this.f + 1;
            Arrays.fill(aVarArr2, i6, i6 + i3, (Object) null);
            this.f += i3;
        }
    }

    public final void b(a aVar) {
        int i = aVar.c;
        int i2 = this.d;
        if (i > i2) {
            a[] aVarArr = this.e;
            h00.n.y0(0, aVarArr.length, null, aVarArr);
            this.f = this.e.length - 1;
            this.g = 0;
            this.h = 0;
            return;
        }
        a((this.h + i) - i2);
        int i3 = this.g + 1;
        a[] aVarArr2 = this.e;
        if (i3 > aVarArr2.length) {
            a[] aVarArr3 = new a[aVarArr2.length * 2];
            System.arraycopy(aVarArr2, 0, aVarArr3, aVarArr2.length, aVarArr2.length);
            this.f = this.e.length - 1;
            this.e = aVarArr3;
        }
        int i4 = this.f;
        this.f = i4 - 1;
        this.e[i4] = aVar;
        this.g++;
        this.h += i;
    }

    public final void c(k50.l data) throws EOFException {
        kotlin.jvm.internal.m.e(data, "data");
        int[] iArr = w.a;
        int iD = data.d();
        long j = 0;
        long j2 = 0;
        for (int i = 0; i < iD; i++) {
            byte bI = data.i(i);
            byte[] bArr = y40.b.a;
            j2 += (long) w.b[bI & 255];
        }
        int i2 = (int) ((j2 + ((long) 7)) >> 3);
        int iD2 = data.d();
        k50.i iVar = this.a;
        if (i2 >= iD2) {
            e(data.d(), 127, 0);
            iVar.o0(data);
            return;
        }
        k50.i iVar2 = new k50.i();
        int[] iArr2 = w.a;
        int iD3 = data.d();
        int i3 = 0;
        for (int i4 = 0; i4 < iD3; i4++) {
            byte bI2 = data.i(i4);
            byte[] bArr2 = y40.b.a;
            int i5 = bI2 & 255;
            int i6 = w.a[i5];
            byte b = w.b[i5];
            j = (j << b) | ((long) i6);
            i3 += b;
            while (i3 >= 8) {
                i3 -= 8;
                iVar2.q0((int) (j >> i3));
            }
        }
        if (i3 > 0) {
            iVar2.q0((int) ((j << (8 - i3)) | (255 >>> i3)));
        }
        k50.l lVarM = iVar2.m(iVar2.B);
        e(lVarM.d(), 127, 128);
        iVar.o0(lVarM);
    }

    public final void d(ArrayList arrayList) throws EOFException {
        int length;
        int length2;
        if (this.c) {
            int i = this.b;
            if (i < this.d) {
                e(i, 31, 32);
            }
            this.c = false;
            this.b = Integer.MAX_VALUE;
            e(this.d, 31, 32);
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            a aVar = (a) arrayList.get(i2);
            k50.l lVarP = aVar.a.p();
            k50.l lVar = aVar.b;
            Integer num = (Integer) d.b.get(lVarP);
            if (num != null) {
                int iIntValue = num.intValue();
                length2 = iIntValue + 1;
                if (2 > length2 || length2 >= 8) {
                    length = length2;
                    length2 = -1;
                } else {
                    a[] aVarArr = d.a;
                    if (kotlin.jvm.internal.m.a(aVarArr[iIntValue].b, lVar)) {
                        length = length2;
                    } else if (kotlin.jvm.internal.m.a(aVarArr[length2].b, lVar)) {
                        length2 = iIntValue + 2;
                        length = length2;
                    } else {
                        length = length2;
                        length2 = -1;
                    }
                }
            } else {
                length = -1;
                length2 = -1;
            }
            if (length2 == -1) {
                int length3 = this.e.length;
                for (int i3 = this.f + 1; i3 < length3; i3++) {
                    a aVar2 = this.e[i3];
                    kotlin.jvm.internal.m.b(aVar2);
                    if (kotlin.jvm.internal.m.a(aVar2.a, lVarP)) {
                        a aVar3 = this.e[i3];
                        kotlin.jvm.internal.m.b(aVar3);
                        if (kotlin.jvm.internal.m.a(aVar3.b, lVar)) {
                            length2 = d.a.length + (i3 - this.f);
                            break;
                        } else if (length == -1) {
                            length = (i3 - this.f) + d.a.length;
                        }
                    }
                }
            }
            if (length2 != -1) {
                e(length2, 127, 128);
            } else if (length == -1) {
                this.a.q0(64);
                c(lVarP);
                c(lVar);
                b(aVar);
            } else {
                k50.l prefix = a.d;
                lVarP.getClass();
                kotlin.jvm.internal.m.e(prefix, "prefix");
                if (!lVarP.l(0, prefix, prefix.d()) || kotlin.jvm.internal.m.a(a.i, lVarP)) {
                    e(length, 63, 64);
                    c(lVar);
                    b(aVar);
                } else {
                    e(length, 15, 0);
                    c(lVar);
                }
            }
        }
    }

    public final void e(int i, int i2, int i3) {
        k50.i iVar = this.a;
        if (i < i2) {
            iVar.q0(i | i3);
            return;
        }
        iVar.q0(i3 | i2);
        int i4 = i - i2;
        while (i4 >= 128) {
            iVar.q0(128 | (i4 & 127));
            i4 >>>= 7;
        }
        iVar.q0(i4);
    }
}

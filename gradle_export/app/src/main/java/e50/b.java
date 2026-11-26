package e50;

import java.io.IOException;
import java.util.ArrayList;
import k50.c0;

public final class b {
    public final c0 c;
    public int f;
    public int g;
    public int a = 4096;
    public final ArrayList b = new ArrayList();
    public a[] d = new a[8];
    public int e = 7;

    public b(p pVar) {
        this.c = bi.b.r(pVar);
    }

    public final int a(int i) {
        int i2;
        int i3 = 0;
        if (i > 0) {
            int length = this.d.length;
            while (true) {
                length--;
                i2 = this.e;
                if (length < i2 || i <= 0) {
                    break;
                }
                a aVar = this.d[length];
                kotlin.jvm.internal.m.b(aVar);
                int i4 = aVar.c;
                i -= i4;
                this.g -= i4;
                this.f--;
                i3++;
            }
            a[] aVarArr = this.d;
            System.arraycopy(aVarArr, i2 + 1, aVarArr, i2 + 1 + i3, this.f);
            this.e += i3;
        }
        return i3;
    }

    public final k50.l b(int i) throws IOException {
        if (i >= 0) {
            a[] aVarArr = d.a;
            if (i <= aVarArr.length - 1) {
                return aVarArr[i].a;
            }
        }
        int length = this.e + 1 + (i - d.a.length);
        if (length >= 0) {
            a[] aVarArr2 = this.d;
            if (length < aVarArr2.length) {
                a aVar = aVarArr2[length];
                kotlin.jvm.internal.m.b(aVar);
                return aVar.a;
            }
        }
        throw new IOException("Header index too large " + (i + 1));
    }

    public final void c(a aVar) {
        this.b.add(aVar);
        int i = aVar.c;
        int i2 = this.a;
        if (i > i2) {
            a[] aVarArr = this.d;
            h00.n.y0(0, aVarArr.length, null, aVarArr);
            this.e = this.d.length - 1;
            this.f = 0;
            this.g = 0;
            return;
        }
        a((this.g + i) - i2);
        int i3 = this.f + 1;
        a[] aVarArr2 = this.d;
        if (i3 > aVarArr2.length) {
            a[] aVarArr3 = new a[aVarArr2.length * 2];
            System.arraycopy(aVarArr2, 0, aVarArr3, aVarArr2.length, aVarArr2.length);
            this.e = this.d.length - 1;
            this.d = aVarArr3;
        }
        int i4 = this.e;
        this.e = i4 - 1;
        this.d[i4] = aVar;
        this.f++;
        this.g += i;
    }

    public final k50.l d() {
        c0 source = this.c;
        byte b = source.readByte();
        byte[] bArr = y40.b.a;
        int i = b & 255;
        int i2 = 0;
        boolean z = (b & 128) == 128;
        long jE = e(i, 127);
        if (!z) {
            return source.m(jE);
        }
        k50.i iVar = new k50.i();
        int[] iArr = w.a;
        kotlin.jvm.internal.m.e(source, "source");
        bg.b bVar = w.c;
        bg.b bVar2 = bVar;
        int i3 = 0;
        for (long j = 0; j < jE; j++) {
            byte b2 = source.readByte();
            byte[] bArr2 = y40.b.a;
            i2 = (i2 << 8) | (b2 & 255);
            i3 += 8;
            while (i3 >= 8) {
                bg.b[] bVarArr = (bg.b[]) bVar2.C;
                kotlin.jvm.internal.m.b(bVarArr);
                bVar2 = bVarArr[(i2 >>> (i3 - 8)) & 255];
                kotlin.jvm.internal.m.b(bVar2);
                if (((bg.b[]) bVar2.C) == null) {
                    iVar.q0(bVar2.A);
                    i3 -= bVar2.B;
                    bVar2 = bVar;
                } else {
                    i3 -= 8;
                }
            }
        }
        while (i3 > 0) {
            bg.b[] bVarArr2 = (bg.b[]) bVar2.C;
            kotlin.jvm.internal.m.b(bVarArr2);
            bg.b bVar3 = bVarArr2[(i2 << (8 - i3)) & 255];
            kotlin.jvm.internal.m.b(bVar3);
            int i4 = bVar3.B;
            if (((bg.b[]) bVar3.C) != null || i4 > i3) {
                break;
            }
            iVar.q0(bVar3.A);
            i3 -= i4;
            bVar2 = bVar;
        }
        return iVar.m(iVar.B);
    }

    public final int e(int i, int i2) {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        int i4 = 0;
        while (true) {
            byte b = this.c.readByte();
            byte[] bArr = y40.b.a;
            int i5 = b & 255;
            if ((b & 128) == 0) {
                return i2 + (i5 << i4);
            }
            i2 += (b & 127) << i4;
            i4 += 7;
        }
    }
}

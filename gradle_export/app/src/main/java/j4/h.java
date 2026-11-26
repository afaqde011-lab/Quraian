package j4;

import java.util.Arrays;

public final class h {

    public int[] f8068a;

    public int[] f8069b;

    public int f8070c;

    public int[] f8071d;

    public float[] f8072e;

    public int f8073f;

    public int[] f8074g;

    public String[] f8075h;

    public int f8076i;

    public int[] f8077j;

    public boolean[] f8078k;
    public int l;

    public final void a(float f3, int i10) {
        int i11 = this.f8073f;
        int[] iArr = this.f8071d;
        if (i11 >= iArr.length) {
            this.f8071d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f8072e;
            this.f8072e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f8071d;
        int i12 = this.f8073f;
        iArr2[i12] = i10;
        float[] fArr2 = this.f8072e;
        this.f8073f = i12 + 1;
        fArr2[i12] = f3;
    }

    public final void b(int i10, int i11) {
        int i12 = this.f8070c;
        int[] iArr = this.f8068a;
        if (i12 >= iArr.length) {
            this.f8068a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f8069b;
            this.f8069b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f8068a;
        int i13 = this.f8070c;
        iArr3[i13] = i10;
        int[] iArr4 = this.f8069b;
        this.f8070c = i13 + 1;
        iArr4[i13] = i11;
    }

    public final void c(int i10, String str) {
        int i11 = this.f8076i;
        int[] iArr = this.f8074g;
        if (i11 >= iArr.length) {
            this.f8074g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f8075h;
            this.f8075h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.f8074g;
        int i12 = this.f8076i;
        iArr2[i12] = i10;
        String[] strArr2 = this.f8075h;
        this.f8076i = i12 + 1;
        strArr2[i12] = str;
    }

    public final void d(int i10, boolean z10) {
        int i11 = this.l;
        int[] iArr = this.f8077j;
        if (i11 >= iArr.length) {
            this.f8077j = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.f8078k;
            this.f8078k = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.f8077j;
        int i12 = this.l;
        iArr2[i12] = i10;
        boolean[] zArr2 = this.f8078k;
        this.l = i12 + 1;
        zArr2[i12] = z10;
    }
}

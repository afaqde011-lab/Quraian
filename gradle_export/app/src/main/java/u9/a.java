package u9;

public final class a {

    public final int f15134a;

    public int f15135b;

    public int f15136c;

    public int f15137d;

    public int f15138e;

    public int f15139f;

    public int f15140g;

    public int f15141h;

    public int f15142i;

    public final b f15143j;

    public a(b bVar, int i10, int i11) {
        this.f15143j = bVar;
        this.f15134a = i10;
        this.f15135b = i11;
        a();
    }

    public final void a() {
        b bVar = this.f15143j;
        int[] iArr = (int[]) bVar.f15146a;
        int[] iArr2 = (int[]) bVar.f15147b;
        int i10 = Integer.MAX_VALUE;
        int i11 = Integer.MIN_VALUE;
        int i12 = Integer.MIN_VALUE;
        int i13 = 0;
        int i14 = Integer.MAX_VALUE;
        int i15 = Integer.MAX_VALUE;
        int i16 = Integer.MIN_VALUE;
        for (int i17 = this.f15134a; i17 <= this.f15135b; i17++) {
            int i18 = iArr[i17];
            i13 += iArr2[i18];
            int i19 = (i18 >> 10) & 31;
            int i20 = (i18 >> 5) & 31;
            int i21 = i18 & 31;
            if (i19 > i16) {
                i16 = i19;
            }
            if (i19 < i10) {
                i10 = i19;
            }
            if (i20 > i11) {
                i11 = i20;
            }
            if (i20 < i14) {
                i14 = i20;
            }
            if (i21 > i12) {
                i12 = i21;
            }
            if (i21 < i15) {
                i15 = i21;
            }
        }
        this.f15137d = i10;
        this.f15138e = i16;
        this.f15139f = i14;
        this.f15140g = i11;
        this.f15141h = i15;
        this.f15142i = i12;
        this.f15136c = i13;
    }

    public final int b() {
        return ((this.f15142i - this.f15141h) + 1) * ((this.f15140g - this.f15139f) + 1) * ((this.f15138e - this.f15137d) + 1);
    }
}

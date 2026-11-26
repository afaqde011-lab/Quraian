package ba;

public final class o1 {

    public int f2372a;

    public int f2373b;

    public int f2374c;

    public int f2375d;

    public int f2376e;

    public boolean a() {
        int i10;
        int i11;
        int i12;
        int i13 = this.f2372a;
        int i14 = 2;
        if ((i13 & 7) != 0) {
            int i15 = this.f2375d;
            int i16 = this.f2373b;
            if (i15 > i16) {
                i12 = 1;
            } else {
                i12 = i15 == i16 ? 2 : 4;
            }
            if ((i12 & i13) == 0) {
                return false;
            }
        }
        if ((i13 & 112) != 0) {
            int i17 = this.f2375d;
            int i18 = this.f2374c;
            if (i17 > i18) {
                i11 = 1;
            } else {
                i11 = i17 == i18 ? 2 : 4;
            }
            if (((i11 << 4) & i13) == 0) {
                return false;
            }
        }
        if ((i13 & 1792) != 0) {
            int i19 = this.f2376e;
            int i20 = this.f2373b;
            if (i19 > i20) {
                i10 = 1;
            } else {
                i10 = i19 == i20 ? 2 : 4;
            }
            if (((i10 << 8) & i13) == 0) {
                return false;
            }
        }
        if ((i13 & 28672) != 0) {
            int i21 = this.f2376e;
            int i22 = this.f2374c;
            if (i21 > i22) {
                i14 = 1;
            } else if (i21 != i22) {
                i14 = 4;
            }
            if (((i14 << 12) & i13) == 0) {
                return false;
            }
        }
        return true;
    }
}

package a8;

import java.io.Serializable;

public final class b0 {

    public int f222a;

    public int f223b;

    public int f224c;

    public int f225d;

    public int f226e;

    public int f227f;

    public Serializable f228g;

    public boolean a(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        if ((i10 & (-2097152)) != -2097152 || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
            return false;
        }
        this.f222a = i11;
        this.f228g = b.f215s[3 - i12];
        int i15 = b.f216t[i14];
        this.f224c = i15;
        if (i11 == 2) {
            this.f224c = i15 / 2;
        } else if (i11 == 0) {
            this.f224c = i15 / 4;
        }
        int i16 = (i10 >>> 9) & 1;
        int i17 = 1152;
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 != 3) {
                    throw new IllegalArgumentException();
                }
                i17 = 384;
            }
        } else if (i11 != 3) {
            i17 = 576;
        }
        this.f227f = i17;
        if (i12 == 3) {
            int i18 = i11 == 3 ? b.f217u[i13 - 1] : b.f218v[i13 - 1];
            this.f226e = i18;
            this.f223b = (((i18 * 12) / this.f224c) + i16) * 4;
        } else {
            if (i11 == 3) {
                int i19 = i12 == 2 ? b.f219w[i13 - 1] : b.f220x[i13 - 1];
                this.f226e = i19;
                this.f223b = ((i19 * 144) / this.f224c) + i16;
            } else {
                int i20 = b.f221y[i13 - 1];
                this.f226e = i20;
                this.f223b = (((i12 == 1 ? 72 : 144) * i20) / this.f224c) + i16;
            }
        }
        this.f225d = ((i10 >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }
}

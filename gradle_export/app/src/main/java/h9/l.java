package h9;

import java.util.Arrays;

public final class l {

    public static final byte[] f6772f = {0, 0, 1};

    public boolean f6773a;

    public int f6774b;

    public int f6775c;

    public int f6776d;

    public byte[] f6777e;

    public final void a(int i10, int i11, byte[] bArr) {
        if (this.f6773a) {
            int i12 = i11 - i10;
            byte[] bArr2 = this.f6777e;
            int length = bArr2.length;
            int i13 = this.f6775c + i12;
            if (length < i13) {
                this.f6777e = Arrays.copyOf(bArr2, i13 * 2);
            }
            System.arraycopy(bArr, i10, this.f6777e, this.f6775c, i12);
            this.f6775c += i12;
        }
    }
}

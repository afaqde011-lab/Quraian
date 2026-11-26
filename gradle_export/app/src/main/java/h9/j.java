package h9;

import java.util.Arrays;

public final class j {

    public static final byte[] f6751e = {0, 0, 1};

    public boolean f6752a;

    public int f6753b;

    public int f6754c;

    public byte[] f6755d;

    public final void a(int i10, int i11, byte[] bArr) {
        if (this.f6752a) {
            int i12 = i11 - i10;
            byte[] bArr2 = this.f6755d;
            int length = bArr2.length;
            int i13 = this.f6753b + i12;
            if (length < i13) {
                this.f6755d = Arrays.copyOf(bArr2, i13 * 2);
            }
            System.arraycopy(bArr, i10, this.f6755d, this.f6753b, i12);
            this.f6753b += i12;
        }
    }
}

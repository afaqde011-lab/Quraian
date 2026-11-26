package u8;

import a8.k0;
import ta.c0;

public final class r {

    public final boolean f15104a;

    public final String f15105b;

    public final k0 f15106c;

    public final int f15107d;

    public final byte[] f15108e;

    public r(boolean z10, String str, int i10, byte[] bArr, int i11, int i12, byte[] bArr2) {
        byte b7 = 0;
        int i13 = 1;
        c0.s((i10 == 0) ^ (bArr2 == null));
        this.f15104a = z10;
        this.f15105b = str;
        this.f15107d = i10;
        this.f15108e = bArr2;
        if (str != null) {
            switch (str.hashCode()) {
                case 3046605:
                    if (!str.equals("cbc1")) {
                        b7 = -1;
                    }
                    break;
                case 3046671:
                    b7 = !str.equals("cbcs") ? (byte) -1 : (byte) 1;
                    break;
                case 3049879:
                    b7 = !str.equals("cenc") ? (byte) -1 : (byte) 2;
                    break;
                case 3049895:
                    b7 = !str.equals("cens") ? (byte) -1 : (byte) 3;
                    break;
                default:
                    b7 = -1;
                    break;
            }
            switch (b7) {
                case 0:
                case 1:
                    i13 = 2;
                    break;
                case 2:
                case 3:
                    break;
                default:
                    e7.a.m("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
                    break;
            }
        }
        this.f15106c = new k0(i13, bArr, i11, i12);
    }
}

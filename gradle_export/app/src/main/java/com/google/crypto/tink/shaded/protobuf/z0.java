package com.google.crypto.tink.shaded.protobuf;

public final class z0 {

    public final a f4336a;

    public final String f4337b;

    public final Object[] f4338c;

    public final int f4339d;

    public z0(a aVar, String str, Object[] objArr) {
        this.f4336a = aVar;
        this.f4337b = str;
        this.f4338c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f4339d = cCharAt;
            return;
        }
        int i10 = cCharAt & 8191;
        int i11 = 13;
        int i12 = 1;
        while (true) {
            int i13 = i12 + 1;
            char cCharAt2 = str.charAt(i12);
            if (cCharAt2 < 55296) {
                this.f4339d = i10 | (cCharAt2 << i11);
                return;
            } else {
                i10 |= (cCharAt2 & 8191) << i11;
                i11 += 13;
                i12 = i13;
            }
        }
    }
}

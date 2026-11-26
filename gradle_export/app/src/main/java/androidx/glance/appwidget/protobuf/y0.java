package androidx.glance.appwidget.protobuf;

public final class y0 {

    public final a f964a;

    public final String f965b;

    public final Object[] f966c;

    public final int f967d;

    public y0(a aVar, String str, Object[] objArr) {
        this.f964a = aVar;
        this.f965b = str;
        this.f966c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f967d = cCharAt;
            return;
        }
        int i10 = cCharAt & 8191;
        int i11 = 13;
        int i12 = 1;
        while (true) {
            int i13 = i12 + 1;
            char cCharAt2 = str.charAt(i12);
            if (cCharAt2 < 55296) {
                this.f967d = i10 | (cCharAt2 << i11);
                return;
            } else {
                i10 |= (cCharAt2 & 8191) << i11;
                i11 += 13;
                i12 = i13;
            }
        }
    }

    public final int a() {
        int i10 = this.f967d;
        if ((i10 & 1) != 0) {
            return 1;
        }
        return (i10 & 4) == 4 ? 3 : 2;
    }
}

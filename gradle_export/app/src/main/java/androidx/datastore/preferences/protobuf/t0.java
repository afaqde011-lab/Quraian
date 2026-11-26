package androidx.datastore.preferences.protobuf;

public final class t0 {

    public final a f677a;

    public final String f678b;

    public final Object[] f679c;

    public final int f680d;

    public t0(v vVar, String str, Object[] objArr) {
        this.f677a = vVar;
        this.f678b = str;
        this.f679c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f680d = cCharAt;
            return;
        }
        int i10 = cCharAt & 8191;
        int i11 = 13;
        int i12 = 1;
        while (true) {
            int i13 = i12 + 1;
            char cCharAt2 = str.charAt(i12);
            if (cCharAt2 < 55296) {
                this.f680d = i10 | (cCharAt2 << i11);
                return;
            } else {
                i10 |= (cCharAt2 & 8191) << i11;
                i11 += 13;
                i12 = i13;
            }
        }
    }

    public final int a() {
        int i10 = this.f680d;
        if ((i10 & 1) != 0) {
            return 1;
        }
        return (i10 & 4) == 4 ? 3 : 2;
    }
}

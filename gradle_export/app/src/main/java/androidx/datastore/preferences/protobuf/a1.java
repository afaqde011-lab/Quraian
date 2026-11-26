package androidx.datastore.preferences.protobuf;

public abstract class a1 {
    public abstract b1 a(Object obj);

    public final boolean b(int i10, k kVar, Object obj) throws InvalidProtocolBufferException {
        int i11 = kVar.f634b;
        int i12 = i11 >>> 3;
        int i13 = i11 & 7;
        if (i13 == 0) {
            kVar.w(0);
            ((b1) obj).c(i12 << 3, Long.valueOf(kVar.f633a.y()));
            return true;
        }
        if (i13 == 1) {
            kVar.w(1);
            ((b1) obj).c((i12 << 3) | 1, Long.valueOf(kVar.f633a.v()));
            return true;
        }
        if (i13 == 2) {
            ((b1) obj).c((i12 << 3) | 2, kVar.e());
            return true;
        }
        if (i13 != 3) {
            if (i13 == 4) {
                return false;
            }
            if (i13 != 5) {
                throw InvalidProtocolBufferException.b();
            }
            kVar.w(5);
            ((b1) obj).c(5 | (i12 << 3), Integer.valueOf(kVar.f633a.u()));
            return true;
        }
        b1 b1Var = new b1(0, new int[8], new Object[8], true);
        int i14 = i12 << 3;
        int i15 = i14 | 4;
        int i16 = i10 + 1;
        if (i16 >= 100) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (kVar.a() != Integer.MAX_VALUE && b(i16, kVar, b1Var)) {
        }
        if (i15 != kVar.f634b) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
        if (b1Var.f593e) {
            b1Var.f593e = false;
        }
        ((b1) obj).c(i14 | 3, b1Var);
        return true;
    }
}

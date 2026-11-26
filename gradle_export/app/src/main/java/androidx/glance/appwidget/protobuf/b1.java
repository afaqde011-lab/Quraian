package androidx.glance.appwidget.protobuf;

public abstract class b1 {
    public abstract c1 a(Object obj);

    public final boolean b(int i10, l lVar, Object obj) throws InvalidProtocolBufferException {
        int i11 = lVar.f919b;
        int i12 = i11 >>> 3;
        int i13 = i11 & 7;
        if (i13 == 0) {
            lVar.v(0);
            ((c1) obj).d(i12 << 3, Long.valueOf(lVar.f918a.y()));
            return true;
        }
        if (i13 == 1) {
            lVar.v(1);
            ((c1) obj).d((i12 << 3) | 1, Long.valueOf(lVar.f918a.v()));
            return true;
        }
        if (i13 == 2) {
            ((c1) obj).d((i12 << 3) | 2, lVar.e());
            return true;
        }
        if (i13 != 3) {
            if (i13 == 4) {
                return false;
            }
            if (i13 != 5) {
                throw InvalidProtocolBufferException.c();
            }
            lVar.v(5);
            ((c1) obj).d(5 | (i12 << 3), Integer.valueOf(lVar.f918a.u()));
            return true;
        }
        c1 c1VarC = c1.c();
        int i14 = i12 << 3;
        int i15 = i14 | 4;
        int i16 = i10 + 1;
        if (i16 >= 100) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (lVar.a() != Integer.MAX_VALUE && b(i16, lVar, c1VarC)) {
        }
        if (i15 != lVar.f919b) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
        if (c1VarC.f880e) {
            c1VarC.f880e = false;
        }
        ((c1) obj).d(i14 | 3, c1VarC);
        return true;
    }
}

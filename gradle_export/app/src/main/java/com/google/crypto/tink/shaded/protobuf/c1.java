package com.google.crypto.tink.shaded.protobuf;

public abstract class c1 {
    public abstract d1 a(Object obj);

    public final boolean b(Object obj, l lVar) throws InvalidProtocolBufferException {
        int i10 = lVar.f4285b;
        int i11 = i10 >>> 3;
        int i12 = i10 & 7;
        if (i12 == 0) {
            lVar.v(0);
            ((d1) obj).d(i11 << 3, Long.valueOf(lVar.f4284a.y()));
            return true;
        }
        if (i12 == 1) {
            lVar.v(1);
            ((d1) obj).d((i11 << 3) | 1, Long.valueOf(lVar.f4284a.v()));
            return true;
        }
        if (i12 == 2) {
            ((d1) obj).d((i11 << 3) | 2, lVar.e());
            return true;
        }
        if (i12 != 3) {
            if (i12 == 4) {
                return false;
            }
            if (i12 != 5) {
                throw InvalidProtocolBufferException.c();
            }
            lVar.v(5);
            ((d1) obj).d(5 | (i11 << 3), Integer.valueOf(lVar.f4284a.u()));
            return true;
        }
        d1 d1VarC = d1.c();
        int i13 = i11 << 3;
        int i14 = i13 | 4;
        while (lVar.a() != Integer.MAX_VALUE && b(d1VarC, lVar)) {
        }
        if (i14 != lVar.f4285b) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
        d1VarC.f4260e = false;
        ((d1) obj).d(i13 | 3, d1VarC);
        return true;
    }
}

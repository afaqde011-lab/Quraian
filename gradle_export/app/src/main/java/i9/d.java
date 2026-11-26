package i9;

import a8.r;
import e7.u;
import ta.c0;

public final class d {

    public final int f7552a;

    public final long f7553b;

    public d(int i10, long j9) {
        c0.s(j9 >= 0);
        this.f7552a = i10;
        this.f7553b = j9;
    }

    public d(int i10, long j9, boolean z10) {
        this.f7552a = i10;
        this.f7553b = j9;
    }

    public d(long j9, int i10) {
        this.f7553b = j9;
        this.f7552a = i10;
    }

    public static d a(int i10, String str, int i11) {
        if (i10 >= i11) {
            return null;
        }
        long j9 = 0;
        int i12 = i10;
        while (i12 < i11) {
            char cCharAt = str.charAt(i12);
            if (cCharAt < '0' || cCharAt > '9') {
                break;
            }
            j9 = (j9 * 10) + ((long) (cCharAt - '0'));
            if (j9 > 2147483647L) {
                return null;
            }
            i12++;
        }
        if (i12 == i10) {
            return null;
        }
        return new d(j9, i12);
    }

    public static d b(r rVar, u uVar) {
        rVar.a(0, 8, uVar.f5182a);
        uVar.N(0);
        return new d(uVar.m(), uVar.r(), false);
    }
}

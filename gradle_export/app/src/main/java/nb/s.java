package nb;

import com.google.android.gms.cast.MediaStatus;

public final class s implements g {
    @Override
    public final h a(qb.m mVar, wb.l lVar) {
        long jW;
        String str = mVar.f12825b;
        o oVar = mVar.f12824a;
        if (!kotlin.jvm.internal.m.a(str, "image/svg+xml")) {
            k50.k kVarI = oVar.i();
            if (!kVarI.m0(0L, r.f11213b)) {
                return null;
            }
            k50.l lVar2 = r.f11212a;
            byte[] bArr = lVar2.A;
            if (bArr.length <= 0) {
                throw new IllegalArgumentException("bytes is empty");
            }
            byte b7 = bArr[0];
            long length = MediaStatus.COMMAND_QUEUE_REPEAT_ALL - ((long) bArr.length);
            long j9 = 0;
            while (true) {
                if (j9 >= length) {
                    jW = -1;
                    break;
                }
                byte b10 = b7;
                long j10 = length;
                jW = kVarI.w(b10, j9, j10);
                if (jW == -1 || kVarI.m0(jW, lVar2)) {
                    break;
                }
                j9 = jW + 1;
                length = j10;
                b7 = b10;
            }
            if (jW == -1) {
                return null;
            }
        }
        return new t(oVar, lVar);
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof s);
    }

    public final int hashCode() {
        return Boolean.hashCode(true);
    }
}

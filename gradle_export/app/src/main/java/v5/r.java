package v5;

import java.nio.ByteBuffer;

public final class r {

    public static final ThreadLocal f15477d = new ThreadLocal();

    public final int f15478a;

    public final p10.a f15479b;

    public volatile int f15480c = 0;

    public r(p10.a aVar, int i10) {
        this.f15479b = aVar;
        this.f15478a = i10;
    }

    public final int a(int i10) {
        w5.a aVarB = b();
        int iA = aVarB.a(16);
        if (iA == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) ((i00.e) aVarB).D;
        int i11 = iA + ((i00.e) aVarB).A;
        return byteBuffer.getInt((i10 * 4) + byteBuffer.getInt(i11) + i11 + 4);
    }

    public final w5.a b() {
        ThreadLocal threadLocal = f15477d;
        w5.a aVar = (w5.a) threadLocal.get();
        if (aVar == null) {
            aVar = new w5.a();
            threadLocal.set(aVar);
        }
        w5.b bVar = (w5.b) this.f15479b.A;
        int iA = bVar.a(6);
        if (iA != 0) {
            int i10 = iA + ((i00.e) bVar).A;
            int i11 = (this.f15478a * 4) + ((ByteBuffer) ((i00.e) bVar).D).getInt(i10) + i10 + 4;
            int i12 = ((ByteBuffer) ((i00.e) bVar).D).getInt(i11) + i11;
            ByteBuffer byteBuffer = (ByteBuffer) ((i00.e) bVar).D;
            ((i00.e) aVar).D = byteBuffer;
            if (byteBuffer != null) {
                ((i00.e) aVar).A = i12;
                int i13 = i12 - byteBuffer.getInt(i12);
                ((i00.e) aVar).B = i13;
                ((i00.e) aVar).C = ((ByteBuffer) ((i00.e) aVar).D).getShort(i13);
                return aVar;
            }
            ((i00.e) aVar).A = 0;
            ((i00.e) aVar).B = 0;
            ((i00.e) aVar).C = 0;
        }
        return aVar;
    }

    public final String toString() {
        int i10;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(", id:");
        w5.a aVarB = b();
        int iA = aVarB.a(4);
        sb2.append(Integer.toHexString(iA != 0 ? ((ByteBuffer) ((i00.e) aVarB).D).getInt(iA + ((i00.e) aVarB).A) : 0));
        sb2.append(", codepoints:");
        w5.a aVarB2 = b();
        int iA2 = aVarB2.a(16);
        if (iA2 != 0) {
            int i11 = iA2 + ((i00.e) aVarB2).A;
            i10 = ((ByteBuffer) ((i00.e) aVarB2).D).getInt(((ByteBuffer) ((i00.e) aVarB2).D).getInt(i11) + i11);
        } else {
            i10 = 0;
        }
        for (int i12 = 0; i12 < i10; i12++) {
            sb2.append(Integer.toHexString(a(i12)));
            sb2.append(" ");
        }
        return sb2.toString();
    }
}

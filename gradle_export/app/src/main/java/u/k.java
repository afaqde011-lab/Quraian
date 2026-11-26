package u;

import com.google.protobuf.RuntimeVersion;

public abstract class k {

    public static final v f14870a = new v(0);

    public static final v a(int... iArr) {
        v vVar = new v(iArr.length);
        int i10 = vVar.f14904b;
        if (i10 < 0) {
            v.a.d(RuntimeVersion.SUFFIX);
            throw null;
        }
        if (iArr.length == 0) {
            return vVar;
        }
        vVar.b(iArr.length + i10);
        int[] iArr2 = vVar.f14903a;
        int i11 = vVar.f14904b;
        if (i10 != i11) {
            h00.n.p0(iArr.length + i10, i10, i11, iArr2, iArr2);
        }
        h00.n.u0(i10, 0, 12, iArr, iArr2);
        vVar.f14904b += iArr.length;
        return vVar;
    }
}

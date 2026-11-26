package xd;

import android.util.Base64;
import com.google.android.gms.internal.measurement.x5;
import com.google.protobuf.RuntimeVersion;
import java.util.Arrays;
import sd.p1;

public final class i {

    public final String f16547a;

    public final byte[] f16548b;

    public final ud.d f16549c;

    public i(String str, byte[] bArr, ud.d dVar) {
        this.f16547a = str;
        this.f16548b = bArr;
        this.f16549c = dVar;
    }

    public static p1 a() {
        p1 p1Var = new p1(20, false);
        p1Var.D = ud.d.A;
        return p1Var;
    }

    public final i b(ud.d dVar) {
        p1 p1VarA = a();
        p1VarA.G(this.f16547a);
        if (dVar == null) {
            throw new NullPointerException("Null priority");
        }
        p1VarA.D = dVar;
        p1VarA.C = this.f16548b;
        return p1VarA.i();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.f16547a.equals(iVar.f16547a) && Arrays.equals(this.f16548b, iVar.f16548b) && this.f16549c.equals(iVar.f16549c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f16549c.hashCode() ^ ((((this.f16547a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f16548b)) * 1000003);
    }

    public final String toString() {
        byte[] bArr = this.f16548b;
        String strEncodeToString = bArr == null ? RuntimeVersion.SUFFIX : Base64.encodeToString(bArr, 2);
        StringBuilder sb2 = new StringBuilder("TransportContext(");
        sb2.append(this.f16547a);
        sb2.append(", ");
        sb2.append(this.f16549c);
        sb2.append(", ");
        return x5.n(sb2, strEncodeToString, ")");
    }
}

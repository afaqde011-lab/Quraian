package nf;

import com.google.android.gms.internal.fido.zzhf;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public final class a1 extends c1 {
    public final int A;
    public final t B;

    public a1(t tVar) throws zzhf {
        tVar.getClass();
        this.B = tVar;
        f0 f0VarE = tVar.entrySet().e();
        int i10 = 0;
        while (f0VarE.hasNext()) {
            Map.Entry entry = (Map.Entry) f0VarE.next();
            int iB = ((c1) entry.getKey()).b();
            i10 = i10 < iB ? iB : i10;
            int iB2 = ((c1) entry.getValue()).b();
            if (i10 < iB2) {
                i10 = iB2;
            }
        }
        int i11 = i10 + 1;
        this.A = i11;
        if (i11 > 8) {
            throw new zzhf("Exceeded cutoff limit for max depth of cbor value");
        }
    }

    @Override
    public final int a() {
        return c1.d((byte) -96);
    }

    @Override
    public final int b() {
        return this.A;
    }

    @Override
    public final int compareTo(Object obj) {
        int iCompareTo;
        c1 c1Var = (c1) obj;
        int iA = c1Var.a();
        int iD = c1.d((byte) -96);
        if (iD != iA) {
            return iD - c1Var.a();
        }
        t tVar = ((a1) c1Var).B;
        t tVar2 = this.B;
        if (tVar2.D.size() != tVar.D.size()) {
            return tVar2.D.size() - tVar.D.size();
        }
        f0 f0VarE = tVar2.entrySet().e();
        f0 f0VarE2 = tVar.entrySet().e();
        do {
            if (!f0VarE.hasNext() && !f0VarE2.hasNext()) {
                return 0;
            }
            Map.Entry entry = (Map.Entry) f0VarE.next();
            Map.Entry entry2 = (Map.Entry) f0VarE2.next();
            int iCompareTo2 = ((c1) entry.getKey()).compareTo((c1) entry2.getKey());
            if (iCompareTo2 != 0) {
                return iCompareTo2;
            }
            iCompareTo = ((c1) entry.getValue()).compareTo((c1) entry2.getValue());
        } while (iCompareTo == 0);
        return iCompareTo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a1.class == obj.getClass()) {
            return this.B.equals(((a1) obj).B);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(c1.d((byte) -96)), this.B});
    }

    public final String toString() {
        t tVar = this.B;
        if (tVar.isEmpty()) {
            return "{}";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        f0 f0VarE = tVar.entrySet().e();
        while (f0VarE.hasNext()) {
            Map.Entry entry = (Map.Entry) f0VarE.next();
            linkedHashMap.put(((c1) entry.getKey()).toString().replace("\n", "\n  "), ((c1) entry.getValue()).toString().replace("\n", "\n  "));
        }
        hb.f fVar = new hb.f();
        StringBuilder sb2 = new StringBuilder("{\n  ");
        try {
            b.g(sb2, linkedHashMap.entrySet().iterator(), fVar);
            sb2.append("\n}");
            return sb2.toString();
        } catch (IOException e3) {
            throw new AssertionError(e3);
        }
    }
}

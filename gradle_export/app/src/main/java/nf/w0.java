package nf;

import com.google.android.gms.internal.fido.zzhf;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public final class w0 extends c1 {
    public final o A;
    public final int B;

    public w0(z zVar) throws zzhf {
        zVar.getClass();
        this.A = zVar;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            o oVar = this.A;
            if (i10 >= oVar.size()) {
                break;
            }
            int iB = ((c1) oVar.get(i10)).b();
            if (i11 < iB) {
                i11 = iB;
            }
            i10++;
        }
        int i12 = i11 + 1;
        this.B = i12;
        if (i12 > 8) {
            throw new zzhf("Exceeded cutoff limit for max depth of cbor value");
        }
    }

    @Override
    public final int a() {
        return c1.d((byte) -128);
    }

    @Override
    public final int b() {
        return this.B;
    }

    @Override
    public final int compareTo(Object obj) {
        c1 c1Var = (c1) obj;
        int iA = c1Var.a();
        int iD = c1.d((byte) -128);
        if (iD != iA) {
            return iD - c1Var.a();
        }
        o oVar = ((w0) c1Var).A;
        o oVar2 = this.A;
        if (oVar2.size() != oVar.size()) {
            return oVar2.size() - oVar.size();
        }
        for (int i10 = 0; i10 < oVar2.size(); i10++) {
            int iCompareTo = ((c1) oVar2.get(i10)).compareTo((c1) oVar.get(i10));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w0.class == obj.getClass()) {
            return this.A.equals(((w0) obj).A);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(c1.d((byte) -128)), this.A});
    }

    public final String toString() {
        o oVar = this.A;
        if (oVar.isEmpty()) {
            return "[]";
        }
        ArrayList arrayList = new ArrayList();
        int size = oVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(((c1) oVar.get(i10)).toString().replace("\n", "\n  "));
        }
        StringBuilder sb2 = new StringBuilder("[\n  ");
        Iterator it = arrayList.iterator();
        try {
            if (it.hasNext()) {
                sb2.append(hb.f.n(it.next()));
                while (it.hasNext()) {
                    sb2.append((CharSequence) ",\n  ");
                    sb2.append(hb.f.n(it.next()));
                }
            }
            sb2.append("\n]");
            return sb2.toString();
        } catch (IOException e3) {
            throw new AssertionError(e3);
        }
    }
}

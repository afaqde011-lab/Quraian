package b20;

import java.util.ArrayList;
import java.util.List;

public final class y {
    public final e30.w a;
    public final List b;
    public final ArrayList c;
    public final List d;

    public y(e30.w wVar, List list, ArrayList arrayList, List list2) {
        this.a = wVar;
        this.b = list;
        this.c = arrayList;
        this.d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.a.equals(yVar.a) && this.b.equals(yVar.b) && this.c.equals(yVar.c) && this.d.equals(yVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + w.c.e((this.c.hashCode() + g4.c.a(this.a.hashCode() * 961, 31, this.b)) * 31, 31, false);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MethodSignatureData(returnType=");
        sb.append(this.a);
        sb.append(", receiverType=null, valueParameters=");
        sb.append(this.b);
        sb.append(", typeParameters=");
        sb.append(this.c);
        sb.append(", hasStableParameterNames=false, errors=");
        return oi.k.n(sb, this.d, ')');
    }
}

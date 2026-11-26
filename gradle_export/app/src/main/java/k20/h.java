package k20;

import g00.q;
import i20.l0;
import i20.m0;
import i20.n0;
import i20.p0;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.m;

public final class h implements g {
    public final p0 a;
    public final n0 b;

    public h(p0 strings, n0 qualifiedNames) {
        m.e(strings, "strings");
        m.e(qualifiedNames, "qualifiedNames");
        this.a = strings;
        this.b = qualifiedNames;
    }

    @Override
    public final String a(int i) throws IOException {
        q qVarC = c(i);
        List list = (List) qVarC.A;
        String strR0 = h00.q.R0((List) qVarC.B, ".", null, null, null, 62);
        if (list.isEmpty()) {
            return strR0;
        }
        return h00.q.R0(list, "/", null, null, null, 62) + '/' + strR0;
    }

    @Override
    public final boolean b(int i) {
        return ((Boolean) c(i).C).booleanValue();
    }

    public final q c(int i) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        boolean z = false;
        while (i != -1) {
            m0 m0Var = (m0) this.b.B.get(i);
            String str = (String) this.a.B.get(m0Var.D);
            l0 l0Var = m0Var.E;
            m.b(l0Var);
            int iOrdinal = l0Var.ordinal();
            if (iOrdinal == 0) {
                linkedList2.addFirst(str);
            } else if (iOrdinal == 1) {
                linkedList.addFirst(str);
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                linkedList2.addFirst(str);
                z = true;
            }
            i = m0Var.C;
        }
        return new q(linkedList, linkedList2, Boolean.valueOf(z));
    }

    @Override
    public final String getString(int i) {
        String str = (String) this.a.B.get(i);
        m.d(str, "getString(...)");
        return str;
    }
}

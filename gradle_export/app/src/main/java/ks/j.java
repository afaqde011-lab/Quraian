package ks;

import g00.b0;
import java.util.ArrayList;
import java.util.Iterator;

public final class j implements u00.k {
    public final int A;
    public final String B;
    public final ArrayList C;

    public j(int i, String str, ArrayList arrayList) {
        this.A = i;
        this.B = str;
        this.C = arrayList;
    }

    @Override
    public final Object invoke(Object obj) throws Exception {
        switch (this.A) {
            case 0:
                ArrayList arrayList = this.C;
                ma.a _connection = (ma.a) obj;
                kotlin.jvm.internal.m.e(_connection, "_connection");
                ma.c cVarK0 = _connection.k0(this.B);
                try {
                    Iterator it = arrayList.iterator();
                    int i = 1;
                    while (it.hasNext()) {
                        cVarK0.y(i, (String) it.next());
                        i++;
                    }
                    cVarK0.d0();
                } finally {
                    cVarK0.close();
                }
                break;
            default:
                ArrayList arrayList2 = this.C;
                ma.a _connection2 = (ma.a) obj;
                kotlin.jvm.internal.m.e(_connection2, "_connection");
                ma.c cVarK1 = _connection2.k0(this.B);
                try {
                    Iterator it2 = arrayList2.iterator();
                    int i2 = 1;
                    while (it2.hasNext()) {
                        cVarK1.y(i2, (String) it2.next());
                        i2++;
                    }
                    cVarK1.d0();
                } finally {
                    cVarK1.close();
                }
                break;
        }
        return b0.a;
    }
}

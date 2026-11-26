package ha;

import a10.h0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.m;
import r30.l;
import r30.r;

public final class h {

    public final String f6954a;

    public final boolean f6955b;

    public final List f6956c;

    public final List f6957d;

    public h(String str, boolean z10, List list, List list2) {
        m.e(str, "name");
        this.f6954a = str;
        this.f6955b = z10;
        this.f6956c = list;
        this.f6957d = list2;
        if (list2.isEmpty()) {
            int size = list.size();
            list2 = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                list2.add("ASC");
            }
        }
        this.f6957d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            String str = hVar.f6954a;
            if (this.f6955b == hVar.f6955b && this.f6956c.equals(hVar.f6956c) && m.a(this.f6957d, hVar.f6957d)) {
                String str2 = this.f6954a;
                return r.x0(str2, "index_", false) ? r.x0(str, "index_", false) : str2.equals(str);
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f6954a;
        return this.f6957d.hashCode() + g4.c.a((((r.x0(str, "index_", false) ? -1184239155 : str.hashCode()) * 31) + (this.f6955b ? 1 : 0)) * 31, 31, this.f6956c);
    }

    public final String toString() {
        return l.i0(l.k0("\n            |Index {\n            |   name = '" + this.f6954a + "',\n            |   unique = '" + this.f6955b + "',\n            |   columns = {" + h0.F(this.f6956c) + "\n            |   orders = {" + h0.E(this.f6957d) + "\n            |}\n        "), "    ");
    }
}

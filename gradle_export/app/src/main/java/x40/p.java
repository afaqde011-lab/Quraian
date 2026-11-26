package x40;

import java.util.Arrays;
import java.util.Iterator;

public final class p implements Iterable, v00.a {
    public final String[] A;

    public p(String[] strArr) {
        this.A = strArr;
    }

    public final String a(String name) {
        kotlin.jvm.internal.m.e(name, "name");
        String[] strArr = this.A;
        int length = strArr.length - 2;
        int iY = ca.v.y(length, 0, -2);
        if (iY > length) {
            return null;
        }
        while (!name.equalsIgnoreCase(strArr[length])) {
            if (length == iY) {
                return null;
            }
            length -= 2;
        }
        return strArr[length + 1];
    }

    public final String c(int i) {
        return this.A[i * 2];
    }

    public final db.g e() {
        db.g gVar = new db.g(9, (byte) 0);
        h00.v.v0(gVar.B, this.A);
        return gVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p) {
            return Arrays.equals(this.A, ((p) obj).A);
        }
        return false;
    }

    public final String h(int i) {
        return this.A[(i * 2) + 1];
    }

    public final int hashCode() {
        return Arrays.hashCode(this.A);
    }

    @Override
    public final Iterator iterator() {
        int size = size();
        g00.k[] kVarArr = new g00.k[size];
        for (int i = 0; i < size; i++) {
            kVarArr[i] = new g00.k(c(i), h(i));
        }
        return kotlin.jvm.internal.m.i(kVarArr);
    }

    public final int size() {
        return this.A.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            String strC = c(i);
            String strH = h(i);
            sb.append(strC);
            sb.append(": ");
            if (y40.b.p(strC)) {
                strH = "██";
            }
            sb.append(strH);
            sb.append("\n");
        }
        String string = sb.toString();
        kotlin.jvm.internal.m.d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}

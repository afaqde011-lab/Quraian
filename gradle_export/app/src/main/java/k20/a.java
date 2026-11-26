package k20;

import h00.n;
import h00.o;
import h00.q;
import h00.x;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.m;
import oi.k;

public abstract class a {
    public final int[] a;
    public final int b;
    public final int c;
    public final int d;
    public final List e;

    public a(int... numbers) {
        List listN1;
        m.e(numbers, "numbers");
        this.a = numbers;
        Integer numH0 = n.H0(numbers, 0);
        this.b = numH0 != null ? numH0.intValue() : -1;
        Integer numH1 = n.H0(numbers, 1);
        this.c = numH1 != null ? numH1.intValue() : -1;
        Integer numH2 = n.H0(numbers, 2);
        this.d = numH2 != null ? numH2.intValue() : -1;
        if (numbers.length <= 3) {
            listN1 = x.A;
        } else {
            if (numbers.length > 1024) {
                throw new IllegalArgumentException(k.l(new StringBuilder("BinaryVersion with length more than 1024 are not supported. Provided length "), numbers.length, '.'));
            }
            listN1 = q.n1(new h00.e(new o(numbers), 3, numbers.length));
        }
        this.e = listN1;
    }

    public final boolean a(int i, int i2, int i3) {
        int i4 = this.b;
        if (i4 > i) {
            return true;
        }
        if (i4 < i) {
            return false;
        }
        int i5 = this.c;
        if (i5 > i2) {
            return true;
        }
        return i5 >= i2 && this.d >= i3;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        a aVar = (a) obj;
        return this.b == aVar.b && this.c == aVar.c && this.d == aVar.d && m.a(this.e, aVar.e);
    }

    public final int hashCode() {
        int i = this.b;
        int i2 = (i * 31) + this.c + i;
        int i3 = (i2 * 31) + this.d + i2;
        return this.e.hashCode() + (i3 * 31) + i3;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        for (int i : this.a) {
            if (i == -1) {
                break;
            }
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList.isEmpty() ? "unknown" : q.R0(arrayList, ".", null, null, null, 62);
    }
}

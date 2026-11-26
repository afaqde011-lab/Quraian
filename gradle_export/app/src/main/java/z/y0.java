package z;

import android.content.Context;
import java.util.Arrays;
import java.util.Map;
import l1.q2;

public final class y0 implements u00.k {
    public final int A;

    public y0(int i10) {
        this.A = i10;
    }

    public final Object invoke(Object obj) {
        switch (this.A) {
            case 0:
                ((Long) obj).getClass();
                return g00.b0.a;
            case 1:
                int i10 = l.f16944a;
                q2 q2Var = c3.o0.f2722b;
                l1.m1 m1Var = (l1.m1) obj;
                m1Var.getClass();
                Context context = (Context) l1.q.D(m1Var, q2Var);
                y3.c cVar = (y3.c) l1.q.D(m1Var, c3.o1.f2734h);
                f1 f1Var = (f1) l1.q.D(m1Var, g1.f16915a);
                if (f1Var == null) {
                    return null;
                }
                return new k(context, cVar, f1Var.f16913a, f1Var.f16914b);
            case 2:
                j3.y.j((j3.a0) obj, j3.j.f7934c);
                return g00.b0.a;
            case 3:
                return new p1(((Integer) obj).intValue());
            case 4:
                synchronized (z1.l.f17038c) {
                    ?? r4 = z1.l.f17044i;
                    int size = r4.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        ((u00.k) r4.get(i11)).invoke(obj);
                    }
                }
                return g00.b0.a;
            case 5:
                y0 y0Var = z1.l.f17036a;
                return g00.b0.a;
            case 6:
                Map.Entry entry = (Map.Entry) obj;
                kotlin.jvm.internal.m.e(entry, "<destruct>");
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" : ");
                if (value instanceof Object[]) {
                    value = Arrays.toString((Object[]) value);
                    kotlin.jvm.internal.m.d(value, "toString(...)");
                }
                sb2.append(value);
                return sb2.toString();
            default:
                b3.o0 o0Var = (b3.o0) obj;
                kotlin.jvm.internal.m.e(o0Var, "$this$drawWithContent");
                o0Var.a();
                k2.d.R(o0Var, i2.t.b(0.6f, dl.a.L), 0L, 0L, 0.0f, null, 0, 126);
                return g00.b0.a;
        }
    }
}

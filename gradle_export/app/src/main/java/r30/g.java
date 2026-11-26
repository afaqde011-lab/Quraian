package r30;

import ab.a0;
import java.util.Iterator;
import java.util.regex.Matcher;

public final class g extends h00.b {
    public final int A;
    public final Object B;

    public g(Object obj, int i) {
        this.A = i;
        this.B = obj;
    }

    @Override
    public final int a() {
        switch (this.A) {
            case 0:
                return ((h) this.B).a.groupCount() + 1;
            case 1:
                return ((s1.c) this.B).e();
            case 2:
                return ((w30.c) this.B).e();
            default:
                return ((x30.c) this.B).e();
        }
    }

    public f c(int i) {
        Matcher matcher = ((h) this.B).a;
        z00.e eVarI0 = a0.I0(matcher.start(i), matcher.end(i));
        if (eVarI0.A < 0) {
            return null;
        }
        String strGroup = matcher.group(i);
        kotlin.jvm.internal.m.d(strGroup, "group(...)");
        return new f(strGroup, eVarI0);
    }

    @Override
    public final boolean contains(Object obj) {
        switch (this.A) {
            case 0:
                if (obj == null ? true : obj instanceof f) {
                    return super.contains((f) obj);
                }
                return false;
            case 1:
                return ((s1.c) this.B).containsValue(obj);
            case 2:
                return ((w30.c) this.B).containsValue(obj);
            default:
                return ((x30.c) this.B).containsValue(obj);
        }
    }

    @Override
    public boolean isEmpty() {
        switch (this.A) {
            case 0:
                return false;
            default:
                return super.isEmpty();
        }
    }

    @Override
    public final Iterator iterator() {
        switch (this.A) {
            case 0:
                return new q30.q(q30.l.r0(h00.q.D0(va.a.L(this)), new q0.a(this, 8)));
            case 1:
                s1.k kVar = ((s1.c) this.B).A;
                s1.l[] lVarArr = new s1.l[8];
                for (int i = 0; i < 8; i++) {
                    lVarArr[i] = new s1.m(2);
                }
                return new s1.j(kVar, lVarArr);
            case 2:
                w30.k node = ((w30.c) this.B).A;
                kotlin.jvm.internal.m.e(node, "node");
                s1.l[] lVarArr2 = new s1.l[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    lVarArr2[i2] = new w30.l(2);
                }
                return new w30.j(node, lVarArr2);
            default:
                return new x30.h((x30.c) this.B, 2);
        }
    }
}

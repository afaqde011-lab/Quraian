package zj;

public final class j {

    public final n f17520a;

    public final n f17521b;

    public j(n nVar, n nVar2) {
        kotlin.jvm.internal.m.e(nVar, "localOverrideSettings");
        kotlin.jvm.internal.m.e(nVar2, "remoteSettings");
        this.f17520a = nVar;
        this.f17521b = nVar2;
    }

    public final double a() {
        Double dC = this.f17520a.c();
        if (dC != null) {
            double dDoubleValue = dC.doubleValue();
            if (0.0d <= dDoubleValue && dDoubleValue <= 1.0d) {
                return dDoubleValue;
            }
        }
        Double dC2 = this.f17521b.c();
        if (dC2 != null) {
            double dDoubleValue2 = dC2.doubleValue();
            if (0.0d <= dDoubleValue2 && dDoubleValue2 <= 1.0d) {
                return dDoubleValue2;
            }
        }
        return 1.0d;
    }

    public final java.lang.Object b(m00.c r6) {
        throw new UnsupportedOperationException("Method not decompiled: zj.j.b(m00.c):java.lang.Object");
    }
}

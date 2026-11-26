package tf;

public final class a implements Runnable {
    public final int A;
    public final String B;
    public final long C;
    public final v D;

    public a(v vVar, String str, long j9, int i10) {
        this.A = i10;
        this.B = str;
        this.C = j9;
        this.D = vVar;
    }

    @Override
    public final void run() {
        switch (this.A) {
            case 0:
                v vVar = this.D;
                vVar.V0();
                String str = this.B;
                com.google.android.gms.common.internal.d0.e(str);
                u.e eVar = vVar.D;
                boolean zIsEmpty = eVar.isEmpty();
                long j9 = this.C;
                if (zIsEmpty) {
                    vVar.E = j9;
                }
                Integer num = (Integer) eVar.get(str);
                if (num != null) {
                    eVar.put(str, Integer.valueOf(num.intValue() + 1));
                } else if (eVar.C < 100) {
                    eVar.put(str, 1);
                    vVar.C.put(str, Long.valueOf(j9));
                } else {
                    q0 q0Var = ((h1) vVar.B).F;
                    h1.g(q0Var);
                    q0Var.J.b("Too many ads visible");
                }
                break;
            default:
                v vVar2 = this.D;
                h1 h1Var = (h1) vVar2.B;
                vVar2.V0();
                String str2 = this.B;
                com.google.android.gms.common.internal.d0.e(str2);
                u.e eVar2 = vVar2.D;
                Integer num2 = (Integer) eVar2.get(str2);
                if (num2 == null) {
                    q0 q0Var2 = h1Var.F;
                    h1.g(q0Var2);
                    q0Var2.G.c(str2, "Call to endAdUnitExposure for unknown ad unit id");
                } else {
                    t2 t2Var = h1Var.L;
                    q0 q0Var3 = h1Var.F;
                    h1.f(t2Var);
                    q2 q2VarB1 = t2Var.b1(false);
                    int iIntValue = num2.intValue() - 1;
                    if (iIntValue != 0) {
                        eVar2.put(str2, Integer.valueOf(iIntValue));
                    } else {
                        eVar2.remove(str2);
                        u.e eVar3 = vVar2.C;
                        Long l = (Long) eVar3.get(str2);
                        long j10 = this.C;
                        if (l == null) {
                            h1.g(q0Var3);
                            q0Var3.G.b("First ad unit exposure time was never set");
                        } else {
                            long jLongValue = j10 - l.longValue();
                            eVar3.remove(str2);
                            vVar2.a1(str2, jLongValue, q2VarB1);
                        }
                        if (eVar2.isEmpty()) {
                            long j11 = vVar2.E;
                            if (j11 != 0) {
                                vVar2.Z0(j10 - j11, q2VarB1);
                                vVar2.E = 0L;
                            } else {
                                h1.g(q0Var3);
                                q0Var3.G.b("First ad exposure time was never set");
                            }
                        }
                    }
                }
                break;
        }
    }
}

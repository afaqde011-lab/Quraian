package a1;

public final class q2 implements u00.k {
    public final int A;
    public final z2.l1 B;

    public q2(z2.l1 l1Var, int i10) {
        this.A = i10;
        this.B = l1Var;
    }

    public final Object invoke(Object obj) {
        z2.k1 k1Var = (z2.k1) obj;
        switch (this.A) {
            case 0:
                k1Var.h(this.B, 0, 0, 0.0f);
                break;
            case 1:
                k1Var.h(this.B, 0, 0, 0.0f);
                break;
            case 2:
                k1Var.h(this.B, 0, 0, 0.0f);
                break;
            case 3:
                k1Var.h(this.B, 0, 0, 0.0f);
                break;
            case 4:
                k1Var.h(this.B, 0, 0, 0.0f);
                break;
            case 5:
                z2.k1.k(k1Var, this.B, 0, 0);
                break;
            case 6:
                z2.k1.k(k1Var, this.B, 0, 0);
                break;
            case 7:
                y3.m mVarF = k1Var.f();
                y3.m mVar = y3.m.A;
                z2.l1 l1Var = this.B;
                if (mVarF == mVar || k1Var.g() == 0) {
                    z2.k1.a(k1Var, l1Var);
                    l1Var.r0(y3.j.d(0L, l1Var.E), 0.0f, null);
                } else {
                    int i10 = (int) 0;
                    long jG = ((long) ((k1Var.g() - l1Var.A) - i10)) << 32;
                    z2.k1.a(k1Var, l1Var);
                    l1Var.r0(y3.j.d((((long) i10) & 4294967295L) | jG, l1Var.E), 0.0f, null);
                }
                return g00.b0.a;
            case 8:
                z2.k1.k(k1Var, this.B, 0, 0);
                break;
            case 9:
                z2.k1.k(k1Var, this.B, 0, 0);
                break;
            case 10:
                k1Var.h(this.B, 0, 0, 0.0f);
                break;
            case 11:
                k1Var.h(this.B, 0, 0, 0.0f);
                break;
            case 12:
                k1Var.h(this.B, 0, 0, 0.0f);
                break;
            case 13:
                kotlin.jvm.internal.m.e(k1Var, "$this$layout");
                k1Var.h(this.B, 0, 0, 0.0f);
                break;
            case 14:
                kotlin.jvm.internal.m.e(k1Var, "$this$layout");
                k1Var.h(this.B, 0, 0, 0.0f);
                break;
            case 15:
                kotlin.jvm.internal.m.e(k1Var, "$this$layout");
                z2.k1.k(k1Var, this.B, 0, 0);
                break;
            case 16:
                z2.k1.k(k1Var, this.B, 0, 0);
                break;
            case 17:
                z2.k1.k(k1Var, this.B, 0, 0);
                break;
            case TYPE_SINT64_VALUE:
                z2.k1.k(k1Var, this.B, 0, 0);
                break;
            case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                kotlin.jvm.internal.m.e(k1Var, "$this$layout");
                k1Var.h(this.B, 0, 0, 0.0f);
                break;
            case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                kotlin.jvm.internal.m.e(k1Var, "$this$layout");
                k1Var.h(this.B, 0, 0, 0.0f);
                break;
            default:
                kotlin.jvm.internal.m.e(k1Var, "$this$layout");
                k1Var.h(this.B, 0, 0, 0.0f);
                break;
        }
        return g00.b0.a;
    }
}

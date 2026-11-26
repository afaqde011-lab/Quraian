package d0;

import com.google.android.gms.cast.MediaError;
import com.google.protobuf.RuntimeVersion;
import g1.z7;
import java.util.List;

public final class o2 implements u00.k {
    public final int A;
    public final l1.z0 B;

    public o2(l1.z0 z0Var, int i10) {
        this.A = i10;
        this.B = z0Var;
    }

    public final Object invoke(Object obj) {
        int i10 = this.A;
        g00.b0 b0Var = g00.b0.a;
        l1.z0 z0Var = this.B;
        switch (i10) {
            case 0:
                Float f3 = (Float) obj;
                f3.getClass();
                return Float.valueOf(((Number) ((u00.k) z0Var.getValue()).invoke(f3)).floatValue());
            case 1:
                Integer num = (Integer) obj;
                num.intValue();
                z0Var.setValue(num);
                return b0Var;
            case 2:
                z2.a0 a0Var = (z2.a0) obj;
                kotlin.jvm.internal.m.e(a0Var, "it");
                z0Var.setValue(a0Var);
                return b0Var;
            case 3:
                j3.a0 a0Var2 = (j3.a0) obj;
                if (!r30.k.L0((CharSequence) z0Var.getValue())) {
                    String str = (String) z0Var.getValue();
                    a10.w[] wVarArr = j3.y.f8004a;
                    a0Var2.a(j3.w.O, str);
                }
                return b0Var;
            case 4:
                float f10 = z7.f6046a;
                z0Var.setValue((r3.w) obj);
                return b0Var;
            case 5:
                float f11 = z7.f6046a;
                z0Var.setValue((r3.w) obj);
                return b0Var;
            case 6:
                z0Var.setValue((z2.a0) obj);
                return b0Var;
            case 7:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                z0Var.setValue(bool);
                return b0Var;
            case 8:
                float f12 = hv.g.a;
                ((u00.a) z0Var.getValue()).invoke();
                return b0Var;
            case 9:
                v30.a aVar = hv.t.a;
                ((u00.a) z0Var.getValue()).invoke();
                return b0Var;
            case 10:
                String str2 = (String) obj;
                kotlin.jvm.internal.m.e(str2, "it");
                z0Var.setValue(str2);
                return b0Var;
            case 11:
                String str3 = (String) obj;
                kotlin.jvm.internal.m.e(str3, "it");
                z0Var.setValue(str3);
                return b0Var;
            case 12:
                b3.o0 o0Var = (b3.o0) obj;
                kotlin.jvm.internal.m.e(o0Var, "$this$drawWithContent");
                if (((Boolean) z0Var.getValue()).booleanValue()) {
                    o0Var.a();
                }
                return b0Var;
            case 13:
                g2.x xVar = (g2.x) obj;
                kotlin.jvm.internal.m.e(xVar, "it");
                z0Var.setValue(Boolean.valueOf(((g2.y) xVar).a()));
                return b0Var;
            case 14:
                z2.a0 a0Var3 = (z2.a0) obj;
                kotlin.jvm.internal.m.e(a0Var3, "it");
                z0Var.setValue(a0Var3);
                return b0Var;
            case 15:
                z2.a0 a0Var4 = (z2.a0) obj;
                kotlin.jvm.internal.m.e(a0Var4, "it");
                z0Var.setValue(a0Var4);
                return b0Var;
            case 16:
                kotlin.jvm.internal.m.e((w.v) obj, "$this$AnimatedContent");
                return ((Boolean) z0Var.getValue()).booleanValue() ? w.m.d(w.s0.c(x.c.w(MediaError.DetailedErrorCode.NETWORK_UNKNOWN, 0, null, 6), 2), w.s0.d(x.c.w(MediaError.DetailedErrorCode.NETWORK_UNKNOWN, 0, null, 6), 2)) : w.m.d(w.x0.f15819b, w.y0.f15822b);
            case 17:
                z0Var.setValue(new y3.l(((y3.l) obj).f16596a));
                return b0Var;
            case TYPE_SINT64_VALUE:
                if (!((Boolean) obj).booleanValue()) {
                    z0Var.setValue(null);
                }
                return b0Var;
            case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                Boolean bool2 = (Boolean) obj;
                bool2.getClass();
                ((u00.k) z0Var.getValue()).invoke(bool2);
                return b0Var;
            case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                d1.h hVar = (d1.h) obj;
                z0Var.setValue(hVar.f4579c ? hVar.f4578b : hVar.f4577a);
                return b0Var;
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                List list = (List) obj;
                if (z0Var != null) {
                    z0Var.setValue(list);
                }
                return b0Var;
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                ((u00.k) z0Var.getValue()).invoke((h2.b) obj);
                return b0Var;
            case 23:
                z2.a0 a0Var5 = (z2.a0) obj;
                kotlin.jvm.internal.m.e(a0Var5, "it");
                z0Var.setValue(bi.b.g(a0Var5.G(0L), kh.n.m0(a0Var5.p())));
                return b0Var;
            case 24:
                z2.a0 a0Var6 = (z2.a0) obj;
                kotlin.jvm.internal.m.e(a0Var6, "it");
                z0Var.setValue(bi.b.g(a0Var6.G(0L), kh.n.m0(a0Var6.p())));
                return b0Var;
            case 25:
                z0Var.setValue((y3.f) obj);
                return b0Var;
            case RuntimeVersion.MINOR:
                z0Var.setValue((z2.a0) obj);
                return b0Var;
            case 27:
                z0Var.setValue((z2.a0) obj);
                return b0Var;
            case 28:
                z0Var.setValue((z2.a0) obj);
                return b0Var;
            default:
                z0Var.setValue(new y3.f((int) (((y3.l) obj).f16596a & 4294967295L)));
                return b0Var;
        }
    }
}

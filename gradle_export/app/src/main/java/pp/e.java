package pp;

import g00.b0;
import kotlin.jvm.internal.m;
import l1.z0;
import u00.k;

public final class e implements k {
    public final int A;
    public final k B;
    public final z0 C;

    public e(k kVar, z0 z0Var, int i) {
        this.A = i;
        this.B = kVar;
        this.C = z0Var;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.A) {
            case 0:
                ep.f option = (ep.f) obj;
                m.e(option, "option");
                this.B.invoke(option);
                this.C.setValue(Boolean.FALSE);
                break;
            default:
                tm.e DampedDragAnimation = (tm.e) obj;
                m.e(DampedDragAnimation, "$this$DampedDragAnimation");
                if (((Boolean) this.C.getValue()).booleanValue()) {
                    this.B.invoke(Float.valueOf(DampedDragAnimation.d()));
                }
                break;
        }
        return b0.a;
    }
}

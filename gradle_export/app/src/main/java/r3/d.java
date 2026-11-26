package r3;

import com.google.android.gms.internal.play_billing.q1;
import com.google.protobuf.RuntimeVersion;

public final class d implements g {
    @Override
    public final void a(com.google.android.material.datepicker.n nVar) {
        nVar.e(0, RuntimeVersion.SUFFIX, ((q1) nVar.F).B());
    }

    public final boolean equals(Object obj) {
        return obj instanceof d;
    }

    public final int hashCode() {
        return kotlin.jvm.internal.a0.a.b(d.class).hashCode();
    }

    public final String toString() {
        return "DeleteAllCommand()";
    }
}

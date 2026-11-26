package wj;

import com.google.protobuf.RuntimeVersion;
import java.util.Locale;
import java.util.UUID;

public final class p0 {

    public final b1 f16201a;

    public final c1 f16202b;

    public p0(b1 b1Var, c1 c1Var) {
        kotlin.jvm.internal.m.e(b1Var, "timeProvider");
        kotlin.jvm.internal.m.e(c1Var, "uuidGenerator");
        this.f16201a = b1Var;
        this.f16202b = c1Var;
    }

    public final j0 a(j0 j0Var) {
        String str;
        this.f16202b.getClass();
        UUID uuidRandomUUID = UUID.randomUUID();
        kotlin.jvm.internal.m.d(uuidRandomUUID, "randomUUID(...)");
        String string = uuidRandomUUID.toString();
        kotlin.jvm.internal.m.d(string, "toString(...)");
        String lowerCase = r30.r.v0(string, "-", RuntimeVersion.SUFFIX).toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
        return new j0(lowerCase, j0Var != null ? j0Var.f16182c + 1 : 0, (j0Var == null || (str = j0Var.f16181b) == null) ? lowerCase : str, this.f16201a.a().f16115b);
    }
}

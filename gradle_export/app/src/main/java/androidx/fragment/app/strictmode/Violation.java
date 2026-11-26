package androidx.fragment.app.strictmode;

import androidx.fragment.app.j0;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Landroidx/fragment/app/strictmode/Violation;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class Violation extends RuntimeException {
    public final j0 A;

    public Violation(j0 j0Var, String str) {
        super(str);
        m.e(j0Var, "fragment");
        this.A = j0Var;
    }
}

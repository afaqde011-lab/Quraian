package p10;

import java.lang.reflect.Member;

public final class l extends kotlin.jvm.internal.j implements u00.k {
    public static final l A = new l(1, Member.class, "isSynthetic", "isSynthetic()Z", 0);

    @Override
    public final Object invoke(Object obj) {
        Member p0 = (Member) obj;
        kotlin.jvm.internal.m.e(p0, "p0");
        return Boolean.valueOf(p0.isSynthetic());
    }
}

package p10;

import java.lang.reflect.Field;
import java.lang.reflect.Member;

public final class u extends w {
    public final Field a;

    public u(Field member) {
        kotlin.jvm.internal.m.e(member, "member");
        this.a = member;
    }

    @Override
    public final Member b() {
        return this.a;
    }
}

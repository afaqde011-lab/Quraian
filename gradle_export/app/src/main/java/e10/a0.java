package e10;

import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;

public final class a0 implements g {
    public static final a0 a = new a0();

    @Override
    public final List a() {
        return h00.x.A;
    }

    @Override
    public final Member b() {
        return null;
    }

    @Override
    public final boolean c() {
        return false;
    }

    @Override
    public final Object call(Object[] args) {
        kotlin.jvm.internal.m.e(args, "args");
        throw new UnsupportedOperationException("call/callBy are not supported for this declaration.");
    }

    @Override
    public final Type getReturnType() {
        Class TYPE = Void.TYPE;
        kotlin.jvm.internal.m.d(TYPE, "TYPE");
        return TYPE;
    }
}

package e30;

public final class k0 extends c {
    public static final k0 b = new k0(0);
    public static final k0 c = new k0(1);
    public static final k0 d = new k0(2);
    public final int a;

    public k0(int i) {
        this.a = i;
    }

    @Override
    public final h30.h F(l0 state, h30.g type) {
        switch (this.a) {
            case 0:
                kotlin.jvm.internal.m.e(state, "state");
                kotlin.jvm.internal.m.e(type, "type");
                return state.c.y0(type);
            case 1:
                kotlin.jvm.internal.m.e(state, "state");
                kotlin.jvm.internal.m.e(type, "type");
                throw new UnsupportedOperationException("Should not be called");
            default:
                kotlin.jvm.internal.m.e(state, "state");
                kotlin.jvm.internal.m.e(type, "type");
                return state.c.v0(type);
        }
    }
}

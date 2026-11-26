package f6;

import androidx.glance.appwidget.protobuf.u0;
import androidx.glance.appwidget.protobuf.y0;

public final class g extends androidx.glance.appwidget.protobuf.z {
    private static final g DEFAULT_INSTANCE;
    private static volatile u0 PARSER;

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        androidx.glance.appwidget.protobuf.z.k(g.class, gVar);
    }

    public static f n() {
        return (f) DEFAULT_INSTANCE.c();
    }

    @Override
    public final Object d(int i10) {
        u0 yVar;
        switch (e4.f.b(i10)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new y0(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 3:
                return new g();
            case 4:
                return new f(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                u0 u0Var = PARSER;
                if (u0Var != null) {
                    return u0Var;
                }
                synchronized (g.class) {
                    try {
                        yVar = PARSER;
                        if (yVar == null) {
                            yVar = new androidx.glance.appwidget.protobuf.y();
                            PARSER = yVar;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return yVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

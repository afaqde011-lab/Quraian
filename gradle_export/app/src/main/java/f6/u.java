package f6;

import androidx.glance.appwidget.protobuf.u0;
import androidx.glance.appwidget.protobuf.y0;

public final class u extends androidx.glance.appwidget.protobuf.z {
    private static final u DEFAULT_INSTANCE;
    public static final int LAYOUT_FIELD_NUMBER = 1;
    public static final int LAYOUT_INDEX_FIELD_NUMBER = 2;
    private static volatile u0 PARSER;
    private int bitField0_;
    private int layoutIndex_;
    private w layout_;

    static {
        u uVar = new u();
        DEFAULT_INSTANCE = uVar;
        androidx.glance.appwidget.protobuf.z.k(u.class, uVar);
    }

    public static void n(u uVar, w wVar) {
        uVar.getClass();
        wVar.getClass();
        uVar.layout_ = wVar;
        uVar.bitField0_ |= 1;
    }

    public static void o(u uVar, int i10) {
        uVar.layoutIndex_ = i10;
    }

    public static t r() {
        return (t) DEFAULT_INSTANCE.c();
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
                return new y0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0004", new Object[]{"bitField0_", "layout_", "layoutIndex_"});
            case 3:
                return new u();
            case 4:
                return new t(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                u0 u0Var = PARSER;
                if (u0Var != null) {
                    return u0Var;
                }
                synchronized (u.class) {
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

    public final w p() {
        w wVar = this.layout_;
        return wVar == null ? w.z() : wVar;
    }

    public final int q() {
        return this.layoutIndex_;
    }
}

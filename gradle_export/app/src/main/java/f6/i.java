package f6;

import androidx.glance.appwidget.protobuf.u0;
import androidx.glance.appwidget.protobuf.y0;
import com.google.protobuf.RuntimeVersion;

public final class i extends androidx.glance.appwidget.protobuf.z {
    public static final int APP_WIDGET_ID_FIELD_NUMBER = 2;
    public static final int BUNDLE_FIELD_NUMBER = 3;
    private static final i DEFAULT_INSTANCE;
    private static volatile u0 PARSER = null;
    public static final int RECEIVER_FIELD_NUMBER = 1;
    private int appWidgetId_;
    private String receiver_ = RuntimeVersion.SUFFIX;
    private androidx.glance.appwidget.protobuf.i bundle_ = androidx.glance.appwidget.protobuf.i.B;

    static {
        i iVar = new i();
        DEFAULT_INSTANCE = iVar;
        androidx.glance.appwidget.protobuf.z.k(i.class, iVar);
    }

    public static void n(i iVar, String str) {
        iVar.getClass();
        str.getClass();
        iVar.receiver_ = str;
    }

    public static void o(i iVar, int i10) {
        iVar.appWidgetId_ = i10;
    }

    public static void p(i iVar, androidx.glance.appwidget.protobuf.h hVar) {
        iVar.getClass();
        iVar.bundle_ = hVar;
    }

    public static i s() {
        return DEFAULT_INSTANCE;
    }

    public static h u() {
        return (h) DEFAULT_INSTANCE.c();
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
                return new y0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003\n", new Object[]{"receiver_", "appWidgetId_", "bundle_"});
            case 3:
                return new i();
            case 4:
                return new h(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                u0 u0Var = PARSER;
                if (u0Var != null) {
                    return u0Var;
                }
                synchronized (i.class) {
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

    public final int q() {
        return this.appWidgetId_;
    }

    public final androidx.glance.appwidget.protobuf.i r() {
        return this.bundle_;
    }

    public final String t() {
        return this.receiver_;
    }
}

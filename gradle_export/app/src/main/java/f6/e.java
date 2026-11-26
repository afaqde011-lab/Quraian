package f6;

import androidx.glance.appwidget.protobuf.u0;
import androidx.glance.appwidget.protobuf.y0;
import com.google.protobuf.RuntimeVersion;

public final class e extends androidx.glance.appwidget.protobuf.z {
    public static final int ACTIONKEY_FIELD_NUMBER = 3;
    public static final int APP_WIDGET_ID_FIELD_NUMBER = 2;
    private static final e DEFAULT_INSTANCE;
    private static volatile u0 PARSER = null;
    public static final int RECEIVER_FIELD_NUMBER = 1;
    private int appWidgetId_;
    private String receiver_ = RuntimeVersion.SUFFIX;
    private String actionKey_ = RuntimeVersion.SUFFIX;

    static {
        e eVar = new e();
        DEFAULT_INSTANCE = eVar;
        androidx.glance.appwidget.protobuf.z.k(e.class, eVar);
    }

    public static void n(e eVar, String str) {
        eVar.getClass();
        str.getClass();
        eVar.receiver_ = str;
    }

    public static void o(e eVar, int i10) {
        eVar.appWidgetId_ = i10;
    }

    public static void p(e eVar, String str) {
        eVar.getClass();
        eVar.actionKey_ = str;
    }

    public static e s() {
        return DEFAULT_INSTANCE;
    }

    public static d u() {
        return (d) DEFAULT_INSTANCE.c();
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
                return new y0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003Ȉ", new Object[]{"receiver_", "appWidgetId_", "actionKey_"});
            case 3:
                return new e();
            case 4:
                return new d(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                u0 u0Var = PARSER;
                if (u0Var != null) {
                    return u0Var;
                }
                synchronized (e.class) {
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

    public final String q() {
        return this.actionKey_;
    }

    public final int r() {
        return this.appWidgetId_;
    }

    public final String t() {
        return this.receiver_;
    }
}

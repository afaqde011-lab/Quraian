package f6;

import androidx.glance.appwidget.protobuf.u0;
import androidx.glance.appwidget.protobuf.y0;
import com.google.protobuf.RuntimeVersion;

public final class k extends androidx.glance.appwidget.protobuf.z {
    public static final int ACTION_PARAMETERS_FIELD_NUMBER = 3;
    public static final int APP_WIDGET_ID_FIELD_NUMBER = 2;
    public static final int CLASS_NAME_FIELD_NUMBER = 1;
    private static final k DEFAULT_INSTANCE;
    private static volatile u0 PARSER;
    private int appWidgetId_;
    private String className_ = RuntimeVersion.SUFFIX;
    private androidx.glance.appwidget.protobuf.i actionParameters_ = androidx.glance.appwidget.protobuf.i.B;

    static {
        k kVar = new k();
        DEFAULT_INSTANCE = kVar;
        androidx.glance.appwidget.protobuf.z.k(k.class, kVar);
    }

    public static void n(k kVar, String str) {
        kVar.getClass();
        kVar.className_ = str;
    }

    public static void o(k kVar, int i10) {
        kVar.appWidgetId_ = i10;
    }

    public static void p(k kVar, androidx.glance.appwidget.protobuf.h hVar) {
        kVar.getClass();
        kVar.actionParameters_ = hVar;
    }

    public static k s() {
        return DEFAULT_INSTANCE;
    }

    public static j t() {
        return (j) DEFAULT_INSTANCE.c();
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
                return new y0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003\n", new Object[]{"className_", "appWidgetId_", "actionParameters_"});
            case 3:
                return new k();
            case 4:
                return new j(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                u0 u0Var = PARSER;
                if (u0Var != null) {
                    return u0Var;
                }
                synchronized (k.class) {
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

    public final androidx.glance.appwidget.protobuf.i q() {
        return this.actionParameters_;
    }

    public final String r() {
        return this.className_;
    }
}

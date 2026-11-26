package f6;

import androidx.glance.appwidget.protobuf.a0;
import androidx.glance.appwidget.protobuf.c0;
import androidx.glance.appwidget.protobuf.u0;
import androidx.glance.appwidget.protobuf.y0;
import com.google.protobuf.RuntimeVersion;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;

public final class c extends androidx.glance.appwidget.protobuf.z {
    public static final int APP_WIDGET_IDS_FIELD_NUMBER = 2;
    private static final c DEFAULT_INSTANCE;
    private static volatile u0 PARSER = null;
    public static final int RECEIVER_FIELD_NUMBER = 1;
    private int appWidgetIdsMemoizedSerializedSize = -1;
    private String receiver_ = RuntimeVersion.SUFFIX;
    private c0 appWidgetIds_ = a0.D;

    static {
        c cVar = new c();
        DEFAULT_INSTANCE = cVar;
        androidx.glance.appwidget.protobuf.z.k(c.class, cVar);
    }

    public static void n(c cVar, String str) {
        cVar.getClass();
        str.getClass();
        cVar.receiver_ = str;
    }

    public static void o(c cVar, List list) {
        RandomAccess randomAccess = cVar.appWidgetIds_;
        if (!((androidx.glance.appwidget.protobuf.b) randomAccess).A) {
            a0 a0Var = (a0) randomAccess;
            int i10 = a0Var.C;
            int i11 = i10 == 0 ? 10 : i10 * 2;
            if (i11 < i10) {
                throw new IllegalArgumentException();
            }
            cVar.appWidgetIds_ = new a0(Arrays.copyOf(a0Var.B, i11), a0Var.C, true);
        }
        androidx.glance.appwidget.protobuf.a.a(list, cVar.appWidgetIds_);
    }

    public static c q() {
        return DEFAULT_INSTANCE;
    }

    public static b s() {
        return (b) DEFAULT_INSTANCE.c();
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
                return new y0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002'", new Object[]{"receiver_", "appWidgetIds_"});
            case 3:
                return new c();
            case 4:
                return new b(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                u0 u0Var = PARSER;
                if (u0Var != null) {
                    return u0Var;
                }
                synchronized (c.class) {
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

    public final c0 p() {
        return this.appWidgetIds_;
    }

    public final String r() {
        return this.receiver_;
    }
}

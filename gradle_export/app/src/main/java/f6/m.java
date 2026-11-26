package f6;

import androidx.glance.appwidget.protobuf.a0;
import androidx.glance.appwidget.protobuf.c0;
import androidx.glance.appwidget.protobuf.u0;
import androidx.glance.appwidget.protobuf.y0;
import com.google.protobuf.RuntimeVersion;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;

public final class m extends androidx.glance.appwidget.protobuf.z {
    public static final int APP_WIDGET_IDS_FIELD_NUMBER = 2;
    private static final m DEFAULT_INSTANCE;
    private static volatile u0 PARSER = null;
    public static final int RECEIVER_FIELD_NUMBER = 1;
    private int appWidgetIdsMemoizedSerializedSize = -1;
    private String receiver_ = RuntimeVersion.SUFFIX;
    private c0 appWidgetIds_ = a0.D;

    static {
        m mVar = new m();
        DEFAULT_INSTANCE = mVar;
        androidx.glance.appwidget.protobuf.z.k(m.class, mVar);
    }

    public static void n(m mVar, String str) {
        mVar.getClass();
        str.getClass();
        mVar.receiver_ = str;
    }

    public static void o(m mVar, List list) {
        RandomAccess randomAccess = mVar.appWidgetIds_;
        if (!((androidx.glance.appwidget.protobuf.b) randomAccess).A) {
            a0 a0Var = (a0) randomAccess;
            int i10 = a0Var.C;
            int i11 = i10 == 0 ? 10 : i10 * 2;
            if (i11 < i10) {
                throw new IllegalArgumentException();
            }
            mVar.appWidgetIds_ = new a0(Arrays.copyOf(a0Var.B, i11), a0Var.C, true);
        }
        androidx.glance.appwidget.protobuf.a.a(list, mVar.appWidgetIds_);
    }

    public static m q() {
        return DEFAULT_INSTANCE;
    }

    public static l s() {
        return (l) DEFAULT_INSTANCE.c();
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
                return new m();
            case 4:
                return new l(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                u0 u0Var = PARSER;
                if (u0Var != null) {
                    return u0Var;
                }
                synchronized (m.class) {
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

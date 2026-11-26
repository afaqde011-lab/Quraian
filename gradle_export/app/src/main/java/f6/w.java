package f6;

import androidx.glance.appwidget.protobuf.d0;
import androidx.glance.appwidget.protobuf.u0;
import androidx.glance.appwidget.protobuf.x0;
import androidx.glance.appwidget.protobuf.y0;
import java.util.ArrayList;

public final class w extends androidx.glance.appwidget.protobuf.z {
    public static final int CHILDREN_FIELD_NUMBER = 7;
    private static final w DEFAULT_INSTANCE;
    public static final int HASACTION_FIELD_NUMBER = 9;
    public static final int HAS_IMAGE_ALPHA_FIELD_NUMBER = 12;
    public static final int HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER = 11;
    public static final int HAS_IMAGE_DESCRIPTION_FIELD_NUMBER = 10;
    public static final int HEIGHT_FIELD_NUMBER = 3;
    public static final int HORIZONTAL_ALIGNMENT_FIELD_NUMBER = 4;
    public static final int IDENTITY_FIELD_NUMBER = 8;
    public static final int IMAGE_SCALE_FIELD_NUMBER = 6;
    private static volatile u0 PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    public static final int VERTICAL_ALIGNMENT_FIELD_NUMBER = 5;
    public static final int WIDTH_FIELD_NUMBER = 2;
    private d0 children_ = x0.D;
    private boolean hasAction_;
    private boolean hasImageAlpha_;
    private boolean hasImageColorFilter_;
    private boolean hasImageDescription_;
    private int height_;
    private int horizontalAlignment_;
    private int identity_;
    private int imageScale_;
    private int type_;
    private int verticalAlignment_;
    private int width_;

    static {
        w wVar = new w();
        DEFAULT_INSTANCE = wVar;
        androidx.glance.appwidget.protobuf.z.k(w.class, wVar);
    }

    public static v A() {
        return (v) DEFAULT_INSTANCE.c();
    }

    public static void n(w wVar, x xVar) {
        wVar.getClass();
        if (xVar == x.UNRECOGNIZED) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        wVar.type_ = xVar.A;
    }

    public static void o(w wVar, p pVar) {
        wVar.getClass();
        wVar.width_ = pVar.getNumber();
    }

    public static void p(w wVar, p pVar) {
        wVar.getClass();
        wVar.height_ = pVar.getNumber();
    }

    public static void q(w wVar, q qVar) {
        wVar.getClass();
        if (qVar == q.UNRECOGNIZED) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        wVar.horizontalAlignment_ = qVar.A;
    }

    public static void r(w wVar, y yVar) {
        wVar.getClass();
        if (yVar == y.UNRECOGNIZED) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        wVar.verticalAlignment_ = yVar.A;
    }

    public static void s(w wVar, o oVar) {
        wVar.getClass();
        if (oVar == o.UNRECOGNIZED) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        wVar.imageScale_ = oVar.A;
    }

    public static void t(w wVar) {
        wVar.getClass();
        wVar.identity_ = 1;
    }

    public static void u(w wVar, boolean z10) {
        wVar.hasAction_ = z10;
    }

    public static void v(w wVar, ArrayList arrayList) {
        d0 d0Var = wVar.children_;
        if (!((androidx.glance.appwidget.protobuf.b) d0Var).A) {
            int size = d0Var.size();
            wVar.children_ = d0Var.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
        }
        androidx.glance.appwidget.protobuf.a.a(arrayList, wVar.children_);
    }

    public static void w(w wVar, boolean z10) {
        wVar.hasImageDescription_ = z10;
    }

    public static void x(w wVar, boolean z10) {
        wVar.hasImageColorFilter_ = z10;
    }

    public static void y(w wVar, boolean z10) {
        wVar.hasImageAlpha_ = z10;
    }

    public static w z() {
        return DEFAULT_INSTANCE;
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
                return new y0(DEFAULT_INSTANCE, "\u0000\f\u0000\u0000\u0001\f\f\u0000\u0001\u0000\u0001\f\u0002\f\u0003\f\u0004\f\u0005\f\u0006\f\u0007\u001b\b\f\t\u0007\n\u0007\u000b\u0007\f\u0007", new Object[]{"type_", "width_", "height_", "horizontalAlignment_", "verticalAlignment_", "imageScale_", "children_", w.class, "identity_", "hasAction_", "hasImageDescription_", "hasImageColorFilter_", "hasImageAlpha_"});
            case 3:
                return new w();
            case 4:
                return new v(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                u0 u0Var = PARSER;
                if (u0Var != null) {
                    return u0Var;
                }
                synchronized (w.class) {
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

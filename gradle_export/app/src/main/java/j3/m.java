package j3;

import i2.t0;
import java.util.ArrayList;
import java.util.List;

public final class m extends kotlin.jvm.internal.n implements u00.n {
    public static final m B;
    public static final m C;
    public static final m D;
    public static final m E;
    public static final m F;
    public static final m G;
    public static final m H;
    public static final m I;
    public static final m J;
    public static final m K;
    public static final m L;
    public static final m M;
    public static final m N;
    public static final m O;
    public static final m P;
    public static final m Q;
    public static final m R;
    public static final m S;
    public static final m T;
    public static final m U;
    public static final m V;
    public final int A;

    static {
        int i10 = 2;
        B = new m(i10, 0);
        C = new m(i10, 1);
        D = new m(i10, 2);
        E = new m(i10, 3);
        F = new m(i10, 4);
        G = new m(i10, 5);
        H = new m(i10, 6);
        I = new m(i10, 7);
        J = new m(i10, 8);
        K = new m(i10, 9);
        L = new m(i10, 10);
        M = new m(i10, 11);
        N = new m(i10, 12);
        O = new m(i10, 13);
        P = new m(i10, 14);
        Q = new m(i10, 15);
        R = new m(i10, 16);
        S = new m(i10, 17);
        T = new m(i10, 18);
        U = new m(i10, 19);
        V = new m(i10, 20);
    }

    public m(int i10, int i11) {
        super(i10);
        this.A = i11;
    }

    public final Object invoke(Object obj, Object obj2) {
        String str;
        g00.e eVar;
        switch (this.A) {
            case 0:
                h00.x xVar = (List) obj;
                List list = (List) obj2;
                if (xVar == null) {
                    xVar = h00.x.A;
                }
                return h00.q.Y0(list, xVar);
            case 1:
                return (c2.d) obj;
            case 2:
                List list2 = (List) obj;
                List list3 = (List) obj2;
                if (list2 == null) {
                    return list3;
                }
                ArrayList arrayListO1 = h00.q.o1(list2);
                arrayListO1.addAll(list3);
                return arrayListO1;
            case 3:
                return (c2.m) obj;
            case 4:
                return (c2.f) obj;
            case 5:
                return (g00.b0) obj;
            case 6:
                return (g00.b0) obj;
            case 7:
                throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
            case 8:
                throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
            case 9:
                return (g00.b0) obj;
            case 10:
                throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
            case 11:
                k kVar = (k) obj;
                int i10 = ((k) obj2).f7937a;
                return kVar;
            case 12:
                return (t0) obj;
            case 13:
                return (String) obj;
            case 14:
                List list4 = (List) obj;
                List list5 = (List) obj2;
                if (list4 == null) {
                    return list5;
                }
                ArrayList arrayListO2 = h00.q.o1(list4);
                arrayListO2.addAll(list5);
                return arrayListO2;
            case 15:
                Float f3 = (Float) obj;
                ((Number) obj2).floatValue();
                return f3;
            case 16:
                return (String) obj;
            case 17:
                Boolean bool = (Boolean) obj;
                ((Boolean) obj2).booleanValue();
                return bool;
            case TYPE_SINT64_VALUE:
                a aVar = (a) obj;
                a aVar2 = (a) obj2;
                if (aVar == null || (str = aVar.f7926a) == null) {
                    str = aVar2.f7926a;
                }
                if (aVar == null || (eVar = aVar.f7927b) == null) {
                    eVar = aVar2.f7927b;
                }
                return new a(str, eVar);
            case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                return obj == null ? obj2 : obj;
            default:
                s sVar = (s) obj2;
                Object objValueOf = Float.valueOf(0.0f);
                o oVar = ((s) obj).f7968d;
                z zVar = w.f7996u;
                Object objG = oVar.A.g(zVar);
                if (objG == null) {
                    objG = objValueOf;
                }
                float fFloatValue = ((Number) objG).floatValue();
                Object objG2 = sVar.f7968d.A.g(zVar);
                if (objG2 != null) {
                    objValueOf = objG2;
                }
                return Integer.valueOf(Float.compare(fFloatValue, ((Number) objValueOf).floatValue()));
        }
    }
}

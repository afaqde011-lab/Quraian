package c3;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import com.google.protobuf.RuntimeVersion;

public final class n0 extends kotlin.jvm.internal.n implements u00.a {
    public static final n0 B;
    public static final n0 C;
    public static final n0 D;
    public static final n0 E;
    public static final n0 F;
    public static final n0 G;
    public static final n0 H;
    public static final n0 I;
    public static final n0 J;
    public static final n0 K;
    public static final n0 L;
    public static final n0 M;
    public static final n0 N;
    public static final n0 O;
    public static final n0 P;
    public static final n0 Q;
    public static final n0 R;
    public static final n0 S;
    public static final n0 T;
    public static final n0 U;
    public static final n0 V;
    public static final n0 W;
    public static final n0 X;
    public static final n0 Y;
    public static final n0 Z;

    public static final n0 f2695a0;

    public static final n0 f2696b0;

    public static final n0 f2697c0;

    public static final n0 f2698d0;

    public static final n0 f2699e0;
    public final int A;

    static {
        int i10 = 0;
        B = new n0(i10, 0);
        C = new n0(i10, 1);
        D = new n0(i10, 2);
        E = new n0(i10, 3);
        F = new n0(i10, 4);
        G = new n0(i10, 5);
        H = new n0(i10, 6);
        I = new n0(i10, 7);
        J = new n0(i10, 8);
        K = new n0(i10, 9);
        L = new n0(i10, 10);
        M = new n0(i10, 11);
        N = new n0(i10, 12);
        O = new n0(i10, 13);
        P = new n0(i10, 14);
        Q = new n0(i10, 15);
        R = new n0(i10, 16);
        S = new n0(i10, 17);
        T = new n0(i10, 18);
        U = new n0(i10, 19);
        V = new n0(i10, 20);
        W = new n0(i10, 21);
        X = new n0(i10, 22);
        Y = new n0(i10, 23);
        Z = new n0(i10, 24);
        f2695a0 = new n0(i10, 25);
        f2696b0 = new n0(i10, 26);
        f2697c0 = new n0(i10, 27);
        f2698d0 = new n0(i10, 28);
        f2699e0 = new n0(i10, 29);
    }

    public n0(int i10, int i11) {
        super(i10);
        this.A = i11;
    }

    public final Object invoke() {
        Choreographer choreographer;
        switch (this.A) {
            case 0:
                o0.a("LocalConfiguration");
                throw null;
            case 1:
                o0.a("LocalContext");
                throw null;
            case 2:
                o0.a("LocalImageVectorCache");
                throw null;
            case 3:
                o0.a("LocalResourceIdCache");
                throw null;
            case 4:
                o0.a("LocalView");
                throw null;
            case 5:
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    choreographer = Choreographer.getInstance();
                } else {
                    h40.e eVar = a40.m0.a;
                    choreographer = (Choreographer) a40.c0.C(f40.m.a, new br.c(2, (k00.c) null, 1));
                }
                u0 u0Var = new u0(choreographer, Handler.createAsync(Looper.getMainLooper()));
                return rd.a.P(u0Var, u0Var.L);
            case 6:
            case 7:
                return null;
            case 8:
                o1.b("LocalAutofillManager");
                throw null;
            case 9:
                o1.b("LocalAutofillTree");
                throw null;
            case 10:
                o1.b("LocalClipboard");
                throw null;
            case 11:
                o1.b("LocalClipboardManager");
                throw null;
            case 12:
                return Boolean.TRUE;
            case 13:
                o1.b("LocalDensity");
                throw null;
            case 14:
                o1.b("LocalFocusManager");
                throw null;
            case 15:
                o1.b("LocalFontFamilyResolver");
                throw null;
            case 16:
                o1.b("LocalFontLoader");
                throw null;
            case 17:
                o1.b("LocalGraphicsContext");
                throw null;
            case TYPE_SINT64_VALUE:
                o1.b("LocalHapticFeedback");
                throw null;
            case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                o1.b("LocalInputManager");
                throw null;
            case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                o1.b("LocalLayoutDirection");
                throw null;
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                return null;
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                o1.b("LocalProvidableLocaleList");
                throw null;
            case 23:
                return Boolean.FALSE;
            case 24:
            case 25:
                return null;
            case RuntimeVersion.MINOR:
                o1.b("LocalTextToolbar");
                throw null;
            case 27:
                o1.b("LocalUriHandler");
                throw null;
            case 28:
                o1.b("LocalViewConfiguration");
                throw null;
            default:
                o1.b("LocalWindowInfo");
                throw null;
        }
    }
}

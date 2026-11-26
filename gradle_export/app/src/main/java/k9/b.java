package k9;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.protobuf.RuntimeVersion;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public final class b {

    public static final String f9214k;
    public static final String l;
    public static final String m;

    public static final String f9215n;

    public static final String f9216o;

    public static final String f9217p;

    public static final String f9218q;

    public static final String f9219r;

    public static final String f9220s;

    public static final String f9221t;

    public final z3 f9222a;

    public final int f9223b;

    public final int f9224c;

    public final int f9225d;

    public final Uri f9226e;

    public final CharSequence f9227f;

    public final Bundle f9228g;

    public final jh.a f9229h;

    public final boolean f9230i;

    public final Object f9231j;

    static {
        String str = e7.i0.f5136a;
        f9214k = Integer.toString(0, 36);
        l = Integer.toString(1, 36);
        m = Integer.toString(2, 36);
        f9215n = Integer.toString(3, 36);
        f9216o = Integer.toString(4, 36);
        f9217p = Integer.toString(5, 36);
        f9218q = Integer.toString(6, 36);
        f9219r = Integer.toString(7, 36);
        f9220s = Integer.toString(8, 36);
        f9221t = Integer.toString(9, 36);
    }

    public b(z3 z3Var, int i10, int i11, int i12, Uri uri, CharSequence charSequence, Bundle bundle, boolean z10, jh.a aVar, Object obj) {
        this.f9222a = z3Var;
        this.f9223b = i10;
        this.f9224c = i11;
        this.f9225d = i12;
        this.f9226e = uri;
        this.f9227f = charSequence;
        this.f9228g = new Bundle(bundle);
        this.f9230i = z10;
        this.f9229h = aVar;
        this.f9231j = obj;
    }

    public static Object a(int i10, Object obj) {
        if (obj == null) {
            return null;
        }
        switch (i10) {
            case 1:
                if (obj instanceof Integer) {
                    obj = Long.valueOf(((Integer) obj).longValue());
                }
                ta.c0.r("Parameter has incorrect type.", obj instanceof Long);
                return obj;
            case 2:
                ta.c0.r("Parameter has incorrect type.", obj instanceof Integer);
                return obj;
            case 3:
                ta.c0.r("Parameter has incorrect type.", obj instanceof Boolean);
                return obj;
            case 4:
                if (obj instanceof Double) {
                    obj = Float.valueOf(((Double) obj).floatValue());
                }
                ta.c0.r("Parameter has incorrect type.", obj instanceof Float);
                return obj;
            case 5:
                ta.c0.r("Parameter has incorrect type.", obj instanceof androidx.media3.common.g1);
                return obj;
            case 6:
                ta.c0.r("Parameter has incorrect type.", obj instanceof androidx.media3.common.q0);
                return obj;
            case 7:
                ta.c0.r("Parameter has incorrect type.", obj instanceof androidx.media3.common.t0);
                return obj;
            case 8:
                ta.c0.r("Parameter has incorrect type.", obj instanceof androidx.media3.common.q2);
                return obj;
            default:
                return null;
        }
    }

    public static boolean c(int i10, List list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            if (((b) list.get(i11)).f9229h.a(0) == i10) {
                return true;
            }
        }
        return false;
    }

    public static b d(z3 z3Var) {
        String str = z3Var.f9579b;
        Bundle bundle = z3Var.f9580c;
        if (!str.startsWith("androidx.media3.session.PLAYER_COMMAND_")) {
            int i10 = Integer.parseInt(str.substring(40));
            Object objL = l("androidx.media3.session.CUSTOM_COMMAND_PARAMETER", i10 == 40010 ? 5 : 0, bundle);
            a aVar = new a(0);
            aVar.e(new z3(i10), objL);
            return aVar.a();
        }
        int i11 = Integer.parseInt(str.substring(39));
        Object objL2 = l("androidx.media3.session.CUSTOM_COMMAND_PARAMETER", m(i11), bundle);
        a aVar2 = new a(0);
        ta.c0.r("sessionCommand is already set. Only one of sessionCommand and playerCommand should be set.", aVar2.f9197b == null);
        aVar2.f9198c = i11;
        aVar2.f9205j = a(m(i11), objL2);
        return aVar2.a();
    }

    public static fh.d2 g(List list, a4 a4Var, androidx.media3.common.b1 b1Var) {
        int i10;
        fh.q0 q0Var = new fh.q0(4);
        for (int i11 = 0; i11 < list.size(); i11++) {
            b bVar = (b) list.get(i11);
            z3 z3Var = bVar.f9222a;
            if ((z3Var == null || !a4Var.f9213a.contains(z3Var)) && ((i10 = bVar.f9223b) == -1 || !b1Var.a(i10))) {
                if (bVar.f9230i) {
                    bVar = new b(bVar.f9222a, bVar.f9223b, bVar.f9224c, bVar.f9225d, bVar.f9226e, bVar.f9227f, new Bundle(bVar.f9228g), false, bVar.f9229h, bVar.f9231j);
                }
                q0Var.c(bVar);
            } else {
                q0Var.c(bVar);
            }
        }
        return q0Var.g();
    }

    public static b i(int i10, Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(f9214k);
        z3 z3VarA = bundle2 == null ? null : z3.a(bundle2);
        int i11 = bundle.getInt(l, -1);
        int i12 = bundle.getInt(m, 0);
        CharSequence charSequence = bundle.getCharSequence(f9215n, RuntimeVersion.SUFFIX);
        Bundle bundle3 = bundle.getBundle(f9216o);
        boolean z10 = i10 < 3 || bundle.getBoolean(f9217p, true);
        Uri uri = (Uri) bundle.getParcelable(f9218q);
        int i13 = bundle.getInt(f9219r, 0);
        int[] intArray = bundle.getIntArray(f9220s);
        a aVar = new a(i13, i12);
        String str = f9221t;
        if (z3VarA != null) {
            aVar.e(z3VarA, l(str, z3VarA.f9578a == 40010 ? 5 : 0, bundle));
        }
        if (i11 != -1) {
            Object objL = l(str, m(i11), bundle);
            ta.c0.r("sessionCommand is already set. Only one of sessionCommand and playerCommand should be set.", aVar.f9197b == null);
            aVar.f9198c = i11;
            aVar.f9205j = a(m(i11), objL);
        }
        if (uri != null && (Objects.equals(uri.getScheme(), "content") || Objects.equals(uri.getScheme(), "android.resource"))) {
            aVar.b(uri);
        }
        aVar.f9201f = charSequence;
        if (bundle3 == null) {
            bundle3 = Bundle.EMPTY;
        }
        aVar.f9202g = new Bundle(bundle3);
        aVar.f9203h = z10;
        if (intArray == null) {
            intArray = new int[]{6};
        }
        aVar.f(intArray);
        return aVar.a();
    }

    public static fh.d2 j(List list, boolean z10, boolean z11) {
        int iA;
        if (list.isEmpty()) {
            fh.r0 r0Var = fh.t0.B;
            return fh.d2.E;
        }
        int i10 = -1;
        int i11 = -1;
        for (int i12 = 0; i12 < list.size(); i12++) {
            b bVar = (b) list.get(i12);
            boolean z12 = bVar.f9230i;
            jh.a aVar = bVar.f9229h;
            if (z12 && bVar.b()) {
                for (int i13 = 0; i13 < aVar.B && (iA = aVar.a(i13)) != 6; i13++) {
                    if (z10 && i10 == -1 && iA == 2) {
                        i10 = i12;
                        break;
                    }
                    if (z11 && i11 == -1 && iA == 3) {
                        i11 = i12;
                        break;
                    }
                }
            }
        }
        fh.q0 q0VarM = fh.t0.m();
        if (i10 != -1) {
            q0VarM.c(((b) list.get(i10)).e(2));
        }
        if (i11 != -1) {
            q0VarM.c(((b) list.get(i11)).e(3));
        }
        for (int i14 = 0; i14 < list.size(); i14++) {
            b bVar2 = (b) list.get(i14);
            if (bVar2.f9230i && bVar2.b() && i14 != i10 && i14 != i11) {
                jh.a aVar2 = bVar2.f9229h;
                aVar2.getClass();
                int i15 = 0;
                while (true) {
                    if (i15 >= aVar2.B) {
                        i15 = -1;
                        break;
                    }
                    if (aVar2.A[i15] == 6) {
                        break;
                    }
                    i15++;
                }
                if (i15 >= 0) {
                    q0VarM.c(bVar2.e(6));
                }
            }
        }
        return q0VarM.g();
    }

    public static fh.d2 k(List list, androidx.media3.common.b1 b1Var, Bundle bundle) {
        if (list.isEmpty()) {
            fh.r0 r0Var = fh.t0.B;
            return fh.d2.E;
        }
        boolean zA = b1Var.f1103a.a(7, 6);
        boolean zA2 = b1Var.f1103a.a(9, 8);
        boolean z10 = bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false);
        boolean z11 = bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false);
        int i10 = (zA || z10) ? -1 : 0;
        int i11 = (zA2 || z11) ? -1 : i10 == 0 ? 1 : 0;
        fh.q0 q0VarM = fh.t0.m();
        for (int i12 = 0; i12 < list.size(); i12++) {
            b bVar = (b) list.get(i12);
            if (i12 == i10) {
                if (i11 == -1) {
                    q0VarM.c(bVar.f(new jh.a(new int[]{2, 6})));
                } else {
                    q0VarM.c(bVar.f(new jh.a(new int[]{2, 3, 6})));
                }
            } else if (i12 == i11) {
                q0VarM.c(bVar.f(new jh.a(new int[]{3, 6})));
            } else {
                q0VarM.c(bVar.f(new jh.a(new int[]{6})));
            }
        }
        return q0VarM.g();
    }

    public static Object l(String str, int i10, Bundle bundle) {
        if (!bundle.containsKey(str)) {
            return null;
        }
        switch (i10) {
            case 1:
                return Long.valueOf(bundle.getLong(str));
            case 2:
                return Integer.valueOf(bundle.getInt(str));
            case 3:
                return Boolean.valueOf(bundle.getBoolean(str));
            case 4:
                return Float.valueOf(bundle.getFloat(str));
            case 5:
                Bundle bundle2 = bundle.getBundle(str);
                bundle2.getClass();
                return androidx.media3.common.g1.a(bundle2);
            case 6:
                Bundle bundle3 = bundle.getBundle(str);
                bundle3.getClass();
                return androidx.media3.common.q0.a(bundle3);
            case 7:
                Bundle bundle4 = bundle.getBundle(str);
                bundle4.getClass();
                return androidx.media3.common.t0.b(bundle4);
            case 8:
                Bundle bundle5 = bundle.getBundle(str);
                bundle5.getClass();
                return androidx.media3.common.q2.b(bundle5);
            default:
                return null;
        }
    }

    public static int m(int i10) {
        if (i10 == 1) {
            return 3;
        }
        if (i10 == 5) {
            return 1;
        }
        if (i10 == 10) {
            return 2;
        }
        if (i10 == 19) {
            return 7;
        }
        if (i10 == 24) {
            return 4;
        }
        if (i10 == 29) {
            return 8;
        }
        if (i10 == 31) {
            return 6;
        }
        switch (i10) {
            case 13:
                return 4;
            case 14:
                return 3;
            case 15:
                return 2;
            default:
                return 0;
        }
    }

    public static boolean n(String str) {
        return str.startsWith("androidx.media3.session.PLAYER_COMMAND_") || str.startsWith("androidx.media3.session.SESSION_COMMAND_");
    }

    public final boolean b() {
        Object obj = this.f9231j;
        z3 z3Var = this.f9222a;
        if (z3Var != null) {
            int i10 = z3Var.f9578a;
            if (i10 != 0) {
                return i10 == 40010 && obj != null;
            }
            return true;
        }
        int i11 = this.f9223b;
        if (i11 != 19) {
            if (i11 != 24) {
                if (i11 != 29 && i11 != 31) {
                    switch (i11) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 11:
                        case 12:
                        case 14:
                            break;
                        case 5:
                        case 10:
                        case 13:
                        case 15:
                            break;
                        default:
                            return false;
                    }
                }
            }
            return true;
        }
        return obj != null;
    }

    public final b e(int i10) {
        String str;
        z3 z3Var = this.f9222a;
        if (z3Var != null && z3Var.f9578a == 0) {
            return f(new jh.a(new int[]{i10}));
        }
        Bundle bundle = Bundle.EMPTY;
        if (this.f9231j != null) {
            bundle = new Bundle();
            p("androidx.media3.session.CUSTOM_COMMAND_PARAMETER", bundle);
        }
        if (z3Var != null) {
            str = "androidx.media3.session.SESSION_COMMAND_" + z3Var.f9578a;
        } else {
            str = "androidx.media3.session.PLAYER_COMMAND_" + this.f9223b;
        }
        return new b(new z3(str, bundle), -1, this.f9224c, this.f9225d, this.f9226e, this.f9227f, this.f9228g, this.f9230i, new jh.a(new int[]{i10}), null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Objects.equals(this.f9222a, bVar.f9222a) && this.f9223b == bVar.f9223b && this.f9224c == bVar.f9224c && this.f9225d == bVar.f9225d && Objects.equals(this.f9226e, bVar.f9226e) && TextUtils.equals(this.f9227f, bVar.f9227f) && this.f9230i == bVar.f9230i && this.f9229h.equals(bVar.f9229h) && Objects.equals(this.f9231j, bVar.f9231j);
    }

    public final b f(jh.a aVar) {
        if (this.f9229h.equals(aVar)) {
            return this;
        }
        return new b(this.f9222a, this.f9223b, this.f9224c, this.f9225d, this.f9226e, this.f9227f, new Bundle(this.f9228g), this.f9230i, aVar, this.f9231j);
    }

    public final void h(androidx.media3.common.f1 f1Var) {
        if (this.f9230i) {
            Object obj = this.f9231j;
            int i10 = this.f9223b;
            if (i10 == 19) {
                if (obj != null) {
                    f1Var.setPlaylistMetadata((androidx.media3.common.t0) obj);
                    return;
                }
                return;
            }
            if (i10 == 24) {
                if (obj != null) {
                    f1Var.setVolume(((Float) obj).floatValue());
                    return;
                } else if (f1Var.getVolume() == 0.0f) {
                    f1Var.unmute();
                    return;
                } else {
                    f1Var.mute();
                    return;
                }
            }
            if (i10 == 29) {
                if (obj != null) {
                    f1Var.setTrackSelectionParameters((androidx.media3.common.q2) obj);
                    return;
                }
                return;
            }
            if (i10 == 31) {
                if (obj != null) {
                    f1Var.setMediaItem((androidx.media3.common.q0) obj);
                    return;
                }
                return;
            }
            switch (i10) {
                case 1:
                    if (obj == null) {
                        f1Var.setPlayWhenReady(!f1Var.getPlayWhenReady());
                    } else {
                        f1Var.setPlayWhenReady(((Boolean) obj).booleanValue());
                    }
                    break;
                case 2:
                    f1Var.prepare();
                    break;
                case 3:
                    f1Var.stop();
                    break;
                case 4:
                    f1Var.seekToDefaultPosition();
                    break;
                case 5:
                    if (obj != null) {
                        f1Var.seekTo(((Long) obj).longValue());
                    }
                    break;
                case 6:
                    f1Var.seekToPreviousMediaItem();
                    break;
                case 7:
                    f1Var.seekToPrevious();
                    break;
                case 8:
                    f1Var.seekToNextMediaItem();
                    break;
                case 9:
                    f1Var.seekToNext();
                    break;
                case 10:
                    if (obj != null) {
                        f1Var.seekToDefaultPosition(((Integer) obj).intValue());
                    }
                    break;
                case 11:
                    f1Var.seekBack();
                    break;
                case 12:
                    f1Var.seekForward();
                    break;
                case 13:
                    if (obj != null) {
                        f1Var.setPlaybackSpeed(((Float) obj).floatValue());
                    }
                    break;
                case 14:
                    if (obj == null) {
                        f1Var.setShuffleModeEnabled(!f1Var.getShuffleModeEnabled());
                    } else {
                        f1Var.setShuffleModeEnabled(((Boolean) obj).booleanValue());
                    }
                    break;
                case 15:
                    if (obj != null) {
                        f1Var.setRepeatMode(((Integer) obj).intValue());
                    }
                    break;
            }
        }
    }

    public final int hashCode() {
        return Objects.hash(this.f9222a, Integer.valueOf(this.f9223b), Integer.valueOf(this.f9224c), Integer.valueOf(this.f9225d), this.f9227f, Boolean.valueOf(this.f9230i), this.f9226e, this.f9229h, this.f9231j);
    }

    public final Bundle o() {
        Bundle bundle = new Bundle();
        z3 z3Var = this.f9222a;
        if (z3Var != null) {
            bundle.putBundle(f9214k, z3Var.b());
        }
        int i10 = this.f9223b;
        if (i10 != -1) {
            bundle.putInt(l, i10);
        }
        int i11 = this.f9224c;
        if (i11 != 0) {
            bundle.putInt(f9219r, i11);
        }
        int i12 = this.f9225d;
        if (i12 != 0) {
            bundle.putInt(m, i12);
        }
        CharSequence charSequence = this.f9227f;
        if (charSequence != RuntimeVersion.SUFFIX) {
            bundle.putCharSequence(f9215n, charSequence);
        }
        Bundle bundle2 = this.f9228g;
        if (!bundle2.isEmpty()) {
            bundle.putBundle(f9216o, bundle2);
        }
        Uri uri = this.f9226e;
        if (uri != null) {
            bundle.putParcelable(f9218q, uri);
        }
        boolean z10 = this.f9230i;
        if (!z10) {
            bundle.putBoolean(f9217p, z10);
        }
        jh.a aVar = this.f9229h;
        if (aVar.B != 1 || aVar.a(0) != 6) {
            bundle.putIntArray(f9220s, Arrays.copyOfRange(aVar.A, 0, aVar.B));
        }
        if (this.f9231j != null) {
            p(f9221t, bundle);
        }
        return bundle;
    }

    public final void p(String str, Bundle bundle) {
        int iM;
        z3 z3Var = this.f9222a;
        if (z3Var != null) {
            iM = z3Var.f9578a == 40010 ? 5 : 0;
        } else {
            iM = m(this.f9223b);
        }
        Object obj = this.f9231j;
        switch (iM) {
            case 1:
                bundle.putLong(str, ((Long) obj).longValue());
                break;
            case 2:
                bundle.putInt(str, ((Integer) obj).intValue());
                break;
            case 3:
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
                break;
            case 4:
                bundle.putFloat(str, ((Float) obj).floatValue());
                break;
            case 5:
                bundle.putBundle(str, ((androidx.media3.common.g1) obj).c());
                break;
            case 6:
                bundle.putBundle(str, ((androidx.media3.common.q0) obj).c(false));
                break;
            case 7:
                bundle.putBundle(str, ((androidx.media3.common.t0) obj).c());
                break;
            case 8:
                bundle.putBundle(str, ((androidx.media3.common.q2) obj).c());
                break;
        }
    }
}

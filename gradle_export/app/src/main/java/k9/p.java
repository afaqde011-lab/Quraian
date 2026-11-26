package k9;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.media3.common.PlaybackException;
import com.google.android.gms.cast.CastStatusCodes;
import com.google.protobuf.RuntimeVersion;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public abstract class p {

    public static final fh.e1 f9381a = fh.e1.p("android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.DURATION", "android.media.metadata.ALBUM", "android.media.metadata.AUTHOR", "android.media.metadata.WRITER", "android.media.metadata.COMPOSER", "android.media.metadata.COMPILATION", "android.media.metadata.DATE", "android.media.metadata.YEAR", "android.media.metadata.GENRE", "android.media.metadata.TRACK_NUMBER", "android.media.metadata.NUM_TRACKS", "android.media.metadata.DISC_NUMBER", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.ART", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART", "android.media.metadata.ALBUM_ART_URI", "android.media.metadata.USER_RATING", "android.media.metadata.RATING", "android.media.metadata.DISPLAY_TITLE", "android.media.metadata.DISPLAY_SUBTITLE", "android.media.metadata.DISPLAY_DESCRIPTION", "android.media.metadata.DISPLAY_ICON", "android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.MEDIA_ID", "android.media.metadata.MEDIA_URI", "android.media.metadata.BT_FOLDER_TYPE", "android.media.metadata.ADVERTISEMENT", "android.media.metadata.DOWNLOAD_STATUS", "androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT");

    public static l9.g a(androidx.media3.common.q0 q0Var, Bitmap bitmap) {
        l9.x xVarI = i(q0Var, bitmap);
        androidx.media3.common.t0 t0Var = q0Var.f1416d;
        Boolean bool = t0Var.f1641q;
        int i10 = (bool == null || !bool.booleanValue()) ? 0 : 1;
        Boolean bool2 = t0Var.f1642r;
        if (bool2 != null && bool2.booleanValue()) {
            i10 |= 2;
        }
        return new l9.g(xVarI, i10);
    }

    public static long b(l9.j0 j0Var, l9.y yVar, long j9) {
        long j10 = j0Var == null ? 0L : j0Var.C;
        long jC = c(j0Var, yVar, j9);
        long jD = d(yVar);
        return jD == -9223372036854775807L ? Math.max(jC, j10) : e7.i0.i(j10, jC, jD);
    }

    public static long c(l9.j0 j0Var, l9.y yVar, long j9) {
        if (j0Var == null) {
            return 0L;
        }
        long jMax = j0Var.B;
        if (j0Var.A == 3) {
            Long lValueOf = j9 == -9223372036854775807L ? null : Long.valueOf(j9);
            jMax = Math.max(0L, jMax + ((long) (j0Var.D * (lValueOf != null ? lValueOf.longValue() : SystemClock.elapsedRealtime() - j0Var.H))));
        }
        long j10 = jMax;
        long jD = d(yVar);
        return jD == -9223372036854775807L ? Math.max(0L, j10) : e7.i0.i(j10, 0L, jD);
    }

    public static long d(l9.y yVar) {
        if (yVar == null || !yVar.A.containsKey("android.media.metadata.DURATION")) {
            return -9223372036854775807L;
        }
        long jA = yVar.a("android.media.metadata.DURATION");
        if (jA <= 0) {
            return -9223372036854775807L;
        }
        return jA;
    }

    public static long e(int i10) {
        switch (i10) {
            case 0:
                return 0L;
            case 1:
                return 1L;
            case 2:
                return 2L;
            case 3:
                return 3L;
            case 4:
                return 4L;
            case 5:
                return 5L;
            case 6:
                return 6L;
            default:
                throw new IllegalArgumentException(g4.c.f(i10, "Unrecognized FolderType: "));
        }
    }

    public static int f(long j9) {
        if (j9 == 0) {
            return 0;
        }
        if (j9 == 1) {
            return 1;
        }
        if (j9 == 2) {
            return 2;
        }
        if (j9 == 3) {
            return 3;
        }
        if (j9 == 4) {
            return 4;
        }
        if (j9 == 5) {
            return 5;
        }
        return j9 == 6 ? 6 : 0;
    }

    public static int g(int i10) {
        if (i10 == -110) {
            return 8;
        }
        if (i10 == -109) {
            return 11;
        }
        if (i10 == -6) {
            return 2;
        }
        if (i10 == -2) {
            return 1;
        }
        if (i10 == 1) {
            return 10;
        }
        switch (i10) {
            case -107:
                return 9;
            case -106:
                return 7;
            case -105:
                return 6;
            case -104:
                return 5;
            case -103:
                return 4;
            case -102:
                return 3;
            default:
                return 0;
        }
    }

    public static e1 h(Context context, Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        try {
            bundle.setClassLoader(context.getClassLoader());
            int i10 = bundle.getInt("androidx.media.MediaBrowserCompat.Extras.KEY_ROOT_CHILDREN_SUPPORTED_FLAGS", -1);
            if (i10 >= 0) {
                bundle.remove("androidx.media.MediaBrowserCompat.Extras.KEY_ROOT_CHILDREN_SUPPORTED_FLAGS");
                boolean z10 = true;
                if (i10 != 1) {
                    z10 = false;
                }
                bundle.putBoolean("androidx.media3.session.LibraryParams.Extras.KEY_ROOT_CHILDREN_BROWSABLE_ONLY", z10);
            }
            Bundle bundle2 = Bundle.EMPTY;
            return new e1(bundle, bundle.getBoolean("android.service.media.extra.RECENT"), bundle.getBoolean("android.service.media.extra.OFFLINE"), bundle.getBoolean("android.service.media.extra.SUGGESTED"));
        } catch (Exception unused) {
            Bundle bundle3 = Bundle.EMPTY;
            return new e1(bundle, false, false, false);
        }
    }

    public static l9.x i(androidx.media3.common.q0 q0Var, Bitmap bitmap) {
        int i10;
        CharSequence charSequence;
        CharSequence charSequence2;
        String str = q0Var.f1413a.equals(RuntimeVersion.SUFFIX) ? null : q0Var.f1413a;
        androidx.media3.common.t0 t0Var = q0Var.f1416d;
        Bitmap bitmap2 = bitmap != null ? bitmap : null;
        Bundle bundle = t0Var.I;
        CharSequence charSequence3 = t0Var.f1627a;
        CharSequence charSequence4 = t0Var.f1632f;
        fh.t0 t0Var2 = t0Var.J;
        Integer num = t0Var.H;
        Integer num2 = t0Var.f1640p;
        if (bundle != null) {
            bundle = new Bundle(bundle);
        }
        boolean z10 = (num2 == null || num2.intValue() == -1) ? false : true;
        boolean z11 = num != null;
        if (z10 || z11) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            if (z10) {
                num2.getClass();
                i10 = 0;
                bundle.putLong("android.media.extra.BT_FOLDER_TYPE", e(num2.intValue()));
            } else {
                i10 = 0;
            }
            if (z11) {
                num.getClass();
                bundle.putLong("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT", num.intValue());
            }
        } else {
            i10 = 0;
        }
        if (!t0Var2.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putStringArrayList("androidx.media.utils.extras.CUSTOM_BROWSER_ACTION_ID_LIST", new ArrayList<>(t0Var2));
        }
        CharSequence charSequence5 = t0Var.f1631e;
        if (charSequence5 != null) {
            charSequence = t0Var.f1633g;
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putCharSequence("androidx.media3.mediadescriptioncompat.title", charSequence3);
        } else {
            CharSequence[] charSequenceArr = new CharSequence[3];
            int i11 = i10;
            int i12 = i11;
            while (true) {
                int i13 = 2;
                if (i11 < 3) {
                    String[] strArr = l9.y.E;
                    if (i12 < strArr.length) {
                        int i14 = i12 + 1;
                        String str2 = strArr[i12];
                        str2.getClass();
                        switch (str2.hashCode()) {
                            case -1853648227:
                                if (!str2.equals("android.media.metadata.ARTIST")) {
                                    i13 = -1;
                                } else {
                                    i13 = i10;
                                }
                                break;
                            case -1224124471:
                                if (!str2.equals("android.media.metadata.WRITER")) {
                                    i13 = -1;
                                } else {
                                    i13 = 1;
                                }
                                break;
                            case 194702059:
                                if (!str2.equals("android.media.metadata.DISPLAY_SUBTITLE")) {
                                    i13 = -1;
                                }
                                break;
                            case 1684534006:
                                if (!str2.equals("android.media.metadata.COMPOSER")) {
                                    i13 = -1;
                                } else {
                                    i13 = 3;
                                }
                                break;
                            case 1879671865:
                                if (!str2.equals("android.media.metadata.ALBUM")) {
                                    i13 = -1;
                                } else {
                                    i13 = 4;
                                }
                                break;
                            case 1897146402:
                                if (!str2.equals("android.media.metadata.TITLE")) {
                                    i13 = -1;
                                } else {
                                    i13 = 5;
                                }
                                break;
                            case 1965214221:
                                if (!str2.equals("android.media.metadata.ALBUM_ARTIST")) {
                                    i13 = -1;
                                } else {
                                    i13 = 6;
                                }
                                break;
                            default:
                                i13 = -1;
                                break;
                        }
                        switch (i13) {
                            case 0:
                                charSequence2 = t0Var.f1628b;
                                break;
                            case 1:
                                charSequence2 = t0Var.f1650z;
                                break;
                            case 2:
                                charSequence2 = charSequence4;
                                break;
                            case 3:
                                charSequence2 = t0Var.A;
                                break;
                            case 4:
                                charSequence2 = t0Var.f1629c;
                                break;
                            case 5:
                                charSequence2 = charSequence3;
                                break;
                            case 6:
                                charSequence2 = t0Var.f1630d;
                                break;
                            default:
                                charSequence2 = null;
                                break;
                        }
                        if (!TextUtils.isEmpty(charSequence2)) {
                            charSequenceArr[i11] = charSequence2;
                            i11++;
                        }
                        i12 = i14;
                    }
                }
            }
            charSequence5 = charSequenceArr[i10];
            charSequence4 = charSequenceArr[1];
            charSequence = charSequenceArr[2];
        }
        return new l9.x(str, charSequence5, charSequence4, charSequence, bitmap2, t0Var.m, bundle, q0Var.f1418f.f1348a);
    }

    public static androidx.media3.common.q0 j(String str, l9.y yVar, int i10) {
        androidx.media3.common.m0 m0Var;
        androidx.media3.common.e0 e0Var = new androidx.media3.common.e0();
        fh.r0 r0Var = fh.t0.B;
        fh.d2 d2Var = fh.d2.E;
        List list = Collections.EMPTY_LIST;
        fh.d2 d2Var2 = fh.d2.E;
        androidx.media3.common.j0 j0Var = new androidx.media3.common.j0();
        androidx.media3.common.m0 m0Var2 = androidx.media3.common.m0.f1344d;
        if (str == null) {
            str = null;
        }
        CharSequence charSequence = yVar.A.getCharSequence("android.media.metadata.MEDIA_URI");
        String string = charSequence != null ? charSequence.toString() : null;
        if (string != null) {
            a1.i iVar = new a1.i(2, false);
            iVar.B = Uri.parse(string);
            m0Var = new androidx.media3.common.m0(iVar);
        } else {
            m0Var = m0Var2;
        }
        androidx.media3.common.t0 t0VarM = m(yVar, i10);
        if (str == null) {
            str = RuntimeVersion.SUFFIX;
        }
        String str2 = str;
        androidx.media3.common.g0 g0Var = new androidx.media3.common.g0(e0Var);
        androidx.media3.common.k0 k0Var = new androidx.media3.common.k0(j0Var);
        if (t0VarM == null) {
            t0VarM = androidx.media3.common.t0.K;
        }
        return new androidx.media3.common.q0(str2, g0Var, null, k0Var, t0VarM, m0Var);
    }

    public static androidx.media3.common.q0 k(l9.x xVar) {
        xVar.getClass();
        String str = xVar.A;
        androidx.media3.common.e0 e0Var = new androidx.media3.common.e0();
        fh.r0 r0Var = fh.t0.B;
        fh.d2 d2Var = fh.d2.E;
        List list = Collections.EMPTY_LIST;
        androidx.media3.common.j0 j0Var = new androidx.media3.common.j0();
        androidx.media3.common.m0 m0Var = androidx.media3.common.m0.f1344d;
        if (str == null) {
            str = RuntimeVersion.SUFFIX;
        }
        String str2 = str;
        a1.i iVar = new a1.i(2, false);
        iVar.B = xVar.I;
        androidx.media3.common.m0 m0Var2 = new androidx.media3.common.m0(iVar);
        androidx.media3.common.t0 t0VarL = l(xVar, 0);
        androidx.media3.common.g0 g0Var = new androidx.media3.common.g0(e0Var);
        androidx.media3.common.k0 k0Var = new androidx.media3.common.k0(j0Var);
        if (t0VarL == null) {
            t0VarL = androidx.media3.common.t0.K;
        }
        return new androidx.media3.common.q0(str2, g0Var, null, k0Var, t0VarL, m0Var2);
    }

    public static androidx.media3.common.t0 l(l9.x xVar, int i10) {
        l9.k0 k0Var;
        byte[] bArr;
        if (xVar == null) {
            return androidx.media3.common.t0.K;
        }
        CharSequence charSequence = xVar.B;
        androidx.media3.common.s0 s0Var = new androidx.media3.common.s0();
        s0Var.f1520f = xVar.C;
        s0Var.f1521g = xVar.D;
        s0Var.m = xVar.G;
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                k0Var = new l9.k0(i10, -1.0f);
                break;
            default:
                k0Var = null;
                break;
        }
        s0Var.f1523i = q(k0Var);
        Bitmap bitmap = xVar.E;
        if (bitmap == null) {
            bArr = null;
        } else {
            if (xVar.F == null) {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
                        xVar.F = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                    } catch (Throwable th2) {
                        try {
                            byteArrayOutputStream.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                } catch (IOException e3) {
                    e7.a.n("MediaDescriptionCompat", "Failed to compress MediaDescriptionCompat artwork", e3);
                }
            }
            bArr = xVar.F;
        }
        if (bArr != null) {
            s0Var.c(bArr, 3);
        }
        Bundle bundle = xVar.H;
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : null;
        if (bundle2 != null && bundle2.containsKey("android.media.extra.BT_FOLDER_TYPE")) {
            s0Var.f1528p = Integer.valueOf(f(bundle2.getLong("android.media.extra.BT_FOLDER_TYPE")));
            bundle2.remove("android.media.extra.BT_FOLDER_TYPE");
        }
        s0Var.f1529q = Boolean.FALSE;
        if (bundle2 != null && bundle2.containsKey("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT")) {
            s0Var.G = Integer.valueOf((int) bundle2.getLong("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT"));
            bundle2.remove("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT");
        }
        if (bundle2 != null && bundle2.containsKey("androidx.media.utils.extras.CUSTOM_BROWSER_ACTION_ID_LIST")) {
            ArrayList<String> stringArrayList = bundle2.getStringArrayList("androidx.media.utils.extras.CUSTOM_BROWSER_ACTION_ID_LIST");
            stringArrayList.getClass();
            s0Var.I = fh.t0.o(fh.t0.o(stringArrayList));
        }
        if (bundle2 == null || !bundle2.containsKey("androidx.media3.mediadescriptioncompat.title")) {
            s0Var.f1515a = charSequence;
        } else {
            s0Var.f1515a = bundle2.getCharSequence("androidx.media3.mediadescriptioncompat.title");
            s0Var.f1519e = charSequence;
            bundle2.remove("androidx.media3.mediadescriptioncompat.title");
        }
        if (bundle2 != null && !bundle2.isEmpty()) {
            s0Var.H = bundle2;
        }
        s0Var.f1530r = Boolean.TRUE;
        return new androidx.media3.common.t0(s0Var);
    }

    public static androidx.media3.common.t0 m(l9.y yVar, int i10) {
        CharSequence charSequence;
        CharSequence charSequence2;
        l9.k0 k0VarA;
        l9.k0 k0VarA2;
        l9.k0 k0Var;
        String[] strArr;
        int i11;
        String string;
        if (yVar == null) {
            return androidx.media3.common.t0.K;
        }
        Bundle bundle = yVar.A;
        androidx.media3.common.s0 s0Var = new androidx.media3.common.s0();
        CharSequence charSequence3 = bundle.getCharSequence("android.media.metadata.DISPLAY_TITLE");
        if (charSequence3 != null) {
            charSequence2 = bundle.getCharSequence("android.media.metadata.DISPLAY_SUBTITLE");
            charSequence = bundle.getCharSequence("android.media.metadata.DISPLAY_DESCRIPTION");
        } else {
            CharSequence[] charSequenceArr = new CharSequence[3];
            int i12 = 0;
            int i13 = 0;
            while (i12 < 3) {
                String[] strArr2 = l9.y.E;
                if (i13 >= strArr2.length) {
                    break;
                }
                int i14 = i13 + 1;
                CharSequence charSequence4 = bundle.getCharSequence(strArr2[i13]);
                if (!TextUtils.isEmpty(charSequence4)) {
                    charSequenceArr[i12] = charSequence4;
                    i12++;
                }
                i13 = i14;
            }
            CharSequence charSequence5 = charSequenceArr[0];
            CharSequence charSequence6 = charSequenceArr[1];
            charSequence = charSequenceArr[2];
            charSequence3 = charSequence5;
            charSequence2 = charSequence6;
        }
        CharSequence charSequence7 = bundle.getCharSequence("android.media.metadata.TITLE");
        if (charSequence7 == null) {
            charSequence7 = charSequence3;
        }
        s0Var.f1515a = charSequence7;
        s0Var.f1519e = charSequence3;
        s0Var.f1520f = charSequence2;
        s0Var.f1521g = charSequence;
        s0Var.f1516b = bundle.getCharSequence("android.media.metadata.ARTIST");
        s0Var.f1517c = bundle.getCharSequence("android.media.metadata.ALBUM");
        s0Var.f1518d = bundle.getCharSequence("android.media.metadata.ALBUM_ARTIST");
        byte[] bArr = null;
        try {
            k0VarA = l9.k0.a(bundle.getParcelable("android.media.metadata.RATING"));
        } catch (Exception e3) {
            e7.a.n("MediaMetadata", "Failed to retrieve a key as Rating.", e3);
            k0VarA = null;
        }
        s0Var.f1524j = q(k0VarA);
        if (bundle.containsKey("android.media.metadata.DURATION")) {
            long jA = yVar.a("android.media.metadata.DURATION");
            if (jA >= 0) {
                s0Var.d(Long.valueOf(jA));
            }
        }
        try {
            k0VarA2 = l9.k0.a(bundle.getParcelable("android.media.metadata.USER_RATING"));
            while (true) {
                if (i11 < 3) {
                    String str = strArr[i11];
                    if (bundle.containsKey(str)) {
                        CharSequence charSequence8 = bundle.getCharSequence(str);
                        if (charSequence8 != null) {
                            string = charSequence8.toString();
                        }
                    } else {
                        i11++;
                    }
                }
                string = null;
            }
        } catch (Exception e10) {
            e7.a.n("MediaMetadata", "Failed to retrieve a key as Rating.", e10);
            k0VarA2 = null;
        }
        androidx.media3.common.g1 g1VarQ = q(k0VarA2);
        if (g1VarQ != null) {
            s0Var.f1523i = g1VarQ;
        } else {
            switch (i10) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    k0Var = new l9.k0(i10, -1.0f);
                    break;
                default:
                    k0Var = null;
                    break;
            }
            s0Var.f1523i = q(k0Var);
        }
        if (bundle.containsKey("android.media.metadata.YEAR")) {
            s0Var.f1531s = Integer.valueOf((int) yVar.a("android.media.metadata.YEAR"));
        }
        strArr = new String[]{"android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ALBUM_ART_URI", "android.media.metadata.ART_URI"};
        i11 = 0;
        Uri uri = string != null ? Uri.parse(string) : null;
        if (uri != null) {
            s0Var.m = uri;
        }
        Bitmap bitmapB = yVar.b();
        if (bitmapB != null) {
            if (yVar.C == null) {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        bitmapB.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
                        yVar.C = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                    } catch (Throwable th2) {
                        try {
                            byteArrayOutputStream.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                } catch (IOException e11) {
                    e7.a.n("MediaMetadata", "Failed to compress MediaMetadataCompat artwork", e11);
                }
            }
            bArr = yVar.C;
        }
        if (bArr != null) {
            s0Var.c(bArr, 3);
        }
        boolean zContainsKey = bundle.containsKey("android.media.metadata.BT_FOLDER_TYPE");
        s0Var.f1529q = Boolean.valueOf(zContainsKey);
        if (zContainsKey) {
            s0Var.f1528p = Integer.valueOf(f(yVar.a("android.media.metadata.BT_FOLDER_TYPE")));
        }
        if (bundle.containsKey("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT")) {
            s0Var.G = Integer.valueOf((int) yVar.a("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT"));
        }
        s0Var.f1530r = Boolean.TRUE;
        Bundle bundle2 = new Bundle(bundle);
        fh.s2 it = f9381a.iterator();
        while (it.hasNext()) {
            bundle2.remove((String) it.next());
        }
        if (!bundle2.isEmpty()) {
            s0Var.H = bundle2;
        }
        return new androidx.media3.common.t0(s0Var);
    }

    public static l9.y n(androidx.media3.common.t0 t0Var, String str, Uri uri, long j9, Bitmap bitmap) {
        Long l;
        l9.h hVar = new l9.h();
        hVar.f10149a = new Bundle();
        hVar.g("android.media.metadata.MEDIA_ID", str);
        CharSequence charSequence = t0Var.f1627a;
        Bundle bundle = t0Var.I;
        Integer num = t0Var.f1640p;
        Uri uri2 = t0Var.m;
        if (charSequence != null) {
            hVar.h(charSequence, "android.media.metadata.TITLE");
        }
        CharSequence charSequence2 = t0Var.f1631e;
        if (charSequence2 != null) {
            hVar.h(charSequence2, "android.media.metadata.DISPLAY_TITLE");
        }
        CharSequence charSequence3 = t0Var.f1632f;
        if (charSequence3 != null) {
            hVar.h(charSequence3, "android.media.metadata.DISPLAY_SUBTITLE");
        }
        CharSequence charSequence4 = t0Var.f1633g;
        if (charSequence4 != null) {
            hVar.h(charSequence4, "android.media.metadata.DISPLAY_DESCRIPTION");
        }
        CharSequence charSequence5 = t0Var.f1628b;
        if (charSequence5 != null) {
            hVar.h(charSequence5, "android.media.metadata.ARTIST");
        }
        CharSequence charSequence6 = t0Var.f1629c;
        if (charSequence6 != null) {
            hVar.h(charSequence6, "android.media.metadata.ALBUM");
        }
        CharSequence charSequence7 = t0Var.f1630d;
        if (charSequence7 != null) {
            hVar.h(charSequence7, "android.media.metadata.ALBUM_ARTIST");
        }
        Integer num2 = t0Var.f1644t;
        if (num2 != null) {
            hVar.e(num2.intValue(), "android.media.metadata.YEAR");
        }
        if (uri != null) {
            hVar.g("android.media.metadata.MEDIA_URI", uri.toString());
        }
        if (uri2 != null) {
            hVar.g("android.media.metadata.DISPLAY_ICON_URI", uri2.toString());
            hVar.g("android.media.metadata.ALBUM_ART_URI", uri2.toString());
            hVar.g("android.media.metadata.ART_URI", uri2.toString());
        }
        if (bitmap != null) {
            hVar.d("android.media.metadata.DISPLAY_ICON", bitmap);
            hVar.d("android.media.metadata.ALBUM_ART", bitmap);
        }
        if (num != null && num.intValue() != -1) {
            hVar.e(e(num.intValue()), "android.media.metadata.BT_FOLDER_TYPE");
        }
        if (j9 == -9223372036854775807L && (l = t0Var.f1634h) != null) {
            j9 = l.longValue();
        }
        if (j9 == -9223372036854775807L) {
            j9 = -1;
        }
        hVar.e(j9, "android.media.metadata.DURATION");
        l9.k0 k0VarR = r(t0Var.f1635i);
        if (k0VarR != null) {
            hVar.f("android.media.metadata.USER_RATING", k0VarR);
        }
        l9.k0 k0VarR2 = r(t0Var.f1636j);
        if (k0VarR2 != null) {
            hVar.f("android.media.metadata.RATING", k0VarR2);
        }
        Integer num3 = t0Var.H;
        if (num3 != null) {
            hVar.e(num3.intValue(), "androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT");
        }
        if (bundle != null) {
            for (String str2 : bundle.keySet()) {
                Object obj = bundle.get(str2);
                if (obj == null || (obj instanceof CharSequence)) {
                    hVar.h((CharSequence) obj, str2);
                } else if ((obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long)) {
                    hVar.e(((Number) obj).longValue(), str2);
                }
            }
        }
        return new l9.y((Bundle) hVar.f10149a);
    }

    public static PlaybackException o(l9.j0 j0Var, Context context) {
        if (j0Var != null) {
            int i10 = j0Var.F;
            if (j0Var.A == 7) {
                CharSequence charSequenceX = j0Var.G;
                if (charSequenceX == null) {
                    charSequenceX = x(context, t(i10));
                }
                Bundle bundle = j0Var.K;
                String string = charSequenceX != null ? charSequenceX.toString() : null;
                int iT = t(i10);
                if (iT == -5) {
                    iT = CastStatusCodes.AUTHENTICATION_FAILED;
                } else if (iT == -1) {
                    iT = 1000;
                }
                int i11 = iT;
                if (bundle == null) {
                    bundle = Bundle.EMPTY;
                }
                return new PlaybackException(string, null, i11, bundle, SystemClock.elapsedRealtime());
            }
        }
        return null;
    }

    public static int p(int i10) {
        if (i10 == 0) {
            return 0;
        }
        int i11 = 1;
        if (i10 != 1) {
            i11 = 2;
            if (i10 != 2) {
                e7.a.m("LegacyConversions", "Unrecognized RepeatMode: " + i10 + " was converted to `PlaybackStateCompat.REPEAT_MODE_NONE`");
                return 0;
            }
        }
        return i11;
    }

    public static androidx.media3.common.g1 q(l9.k0 k0Var) {
        if (k0Var == null) {
            return null;
        }
        float f3 = k0Var.B;
        int i10 = k0Var.A;
        switch (i10) {
            case 1:
                if (k0Var.c()) {
                    return new androidx.media3.common.a0(i10 == 1 && f3 == 1.0f);
                }
                return new androidx.media3.common.a0();
            case 2:
                if (k0Var.c()) {
                    return new androidx.media3.common.f2(i10 == 2 && f3 == 1.0f);
                }
                return new androidx.media3.common.f2();
            case 3:
                return k0Var.c() ? new androidx.media3.common.d2(3, k0Var.b()) : new androidx.media3.common.d2(3);
            case 4:
                return k0Var.c() ? new androidx.media3.common.d2(4, k0Var.b()) : new androidx.media3.common.d2(4);
            case 5:
                return k0Var.c() ? new androidx.media3.common.d2(5, k0Var.b()) : new androidx.media3.common.d2(5);
            case 6:
                if (!k0Var.c()) {
                    return new androidx.media3.common.y0();
                }
                if (i10 != 6 || !k0Var.c()) {
                    f3 = -1.0f;
                }
                return new androidx.media3.common.y0(f3);
            default:
                return null;
        }
    }

    public static l9.k0 r(androidx.media3.common.g1 g1Var) {
        if (g1Var != null) {
            int iW = w(g1Var);
            if (!g1Var.b()) {
                switch (iW) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        return new l9.k0(iW, -1.0f);
                    default:
                        return null;
                }
            }
            switch (iW) {
                case 1:
                    return new l9.k0(1, ((androidx.media3.common.a0) g1Var).f1064c ? 1.0f : 0.0f);
                case 2:
                    return new l9.k0(2, ((androidx.media3.common.f2) g1Var).f1209c ? 1.0f : 0.0f);
                case 3:
                case 4:
                case 5:
                    return l9.k0.e(((androidx.media3.common.d2) g1Var).f1170c, iW);
                case 6:
                    return l9.k0.d(((androidx.media3.common.y0) g1Var).f1684b);
            }
        }
        return null;
    }

    public static int s(int i10) {
        if (i10 == -1 || i10 == 0) {
            return 0;
        }
        int i11 = 1;
        if (i10 != 1) {
            i11 = 2;
            if (i10 != 2 && i10 != 3) {
                e7.a.m("LegacyConversions", "Unrecognized PlaybackStateCompat.RepeatMode: " + i10 + " was converted to `Player.REPEAT_MODE_OFF`");
                return 0;
            }
        }
        return i11;
    }

    public static int t(int i10) {
        switch (i10) {
            case 1:
                return -2;
            case 2:
                return -6;
            case 3:
                return -102;
            case 4:
                return -103;
            case 5:
                return -104;
            case 6:
                return -105;
            case 7:
                return -106;
            case 8:
                return -110;
            case 9:
                return -107;
            case 10:
                return 1;
            case 11:
                return -109;
            default:
                return -1;
        }
    }

    public static boolean u(int i10) {
        if (i10 == -1 || i10 == 0) {
            return false;
        }
        if (i10 == 1 || i10 == 2) {
            return true;
        }
        throw new IllegalArgumentException(g4.c.f(i10, "Unrecognized ShuffleMode: "));
    }

    public static void v(kh.v vVar) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z10 = false;
        long j9 = 3000;
        while (true) {
            try {
                try {
                    vVar.get(j9, TimeUnit.MILLISECONDS);
                    if (z10) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    return;
                } catch (InterruptedException unused) {
                    z10 = true;
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                    if (jElapsedRealtime2 >= 3000) {
                        throw new TimeoutException();
                    }
                    j9 = 3000 - jElapsedRealtime2;
                }
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
    }

    public static int w(androidx.media3.common.g1 g1Var) {
        if (g1Var instanceof androidx.media3.common.a0) {
            return 1;
        }
        if (g1Var instanceof androidx.media3.common.f2) {
            return 2;
        }
        if (!(g1Var instanceof androidx.media3.common.d2)) {
            return g1Var instanceof androidx.media3.common.y0 ? 6 : 0;
        }
        int i10 = ((androidx.media3.common.d2) g1Var).f1169b;
        int i11 = 3;
        if (i10 != 3) {
            i11 = 4;
            if (i10 != 4) {
                i11 = 5;
                if (i10 != 5) {
                    return 0;
                }
            }
        }
        return i11;
    }

    public static String x(Context context, int i10) {
        if (i10 == -100) {
            return context.getString(2131886435);
        }
        if (i10 == 1) {
            return context.getString(2131886438);
        }
        if (i10 == -6) {
            return context.getString(2131886442);
        }
        if (i10 == -5) {
            return context.getString(2131886440);
        }
        if (i10 == -4) {
            return context.getString(2131886444);
        }
        if (i10 == -3) {
            return context.getString(2131886432);
        }
        if (i10 == -2) {
            return context.getString(2131886439);
        }
        switch (i10) {
            case -110:
                return context.getString(2131886434);
            case -109:
                return context.getString(2131886436);
            case -108:
                return context.getString(2131886446);
            case -107:
                return context.getString(2131886447);
            case -106:
                return context.getString(2131886441);
            case -105:
                return context.getString(2131886443);
            case -104:
                return context.getString(2131886433);
            case -103:
                return context.getString(2131886445);
            case -102:
                return context.getString(2131886431);
            default:
                return context.getString(2131886437);
        }
    }

    public static boolean y(long j9, long j10) {
        return (j9 & j10) != 0;
    }
}

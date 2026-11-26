package e7;

import android.app.UiModeManager;
import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.Display;
import android.view.WindowManager;
import androidx.media3.common.ParserException;
import androidx.media3.common.a1;
import androidx.media3.common.b1;
import androidx.media3.common.f1;
import com.google.android.gms.cast.Cast;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.measurement.g4;
import com.google.android.gms.internal.measurement.x5;
import com.google.android.gms.internal.measurement.z3;
import com.google.protobuf.RuntimeVersion;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

public abstract class i0 {

    public static final String f5136a;

    public static final byte[] f5137b;

    public static final long[] f5138c;

    public static final Pattern f5139d;

    public static final Pattern f5140e;

    public static final Pattern f5141f;

    public static HashMap f5142g;

    public static final String[] f5143h;

    public static final String[] f5144i;

    public static final int[] f5145j;

    public static final int[] f5146k;
    public static final int[] l;

    static {
        int i10 = Build.VERSION.SDK_INT;
        String str = Build.DEVICE;
        String str2 = Build.MANUFACTURER;
        String str3 = Build.MODEL;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(", ");
        sb2.append(str3);
        sb2.append(", ");
        sb2.append(str2);
        f5136a = x5.j(i10, ", ", sb2);
        f5137b = new byte[0];
        f5138c = new long[0];
        f5139d = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt ](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        f5140e = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        Pattern.compile("%([A-Fa-f0-9]{2})");
        f5141f = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        f5143h = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        f5144i = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        f5145j = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        f5146k = new int[]{0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
        l = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, MediaError.DetailedErrorCode.MEDIAKEYS_UNSUPPORTED, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, MediaError.DetailedErrorCode.MEDIAKEYS_NETWORK, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, MediaError.DetailedErrorCode.MEDIA_SRC_NOT_SUPPORTED, 97, MediaError.DetailedErrorCode.MEDIA_DECODE, 115, 116, 125, 122, 137, 142, 135, Cast.MAX_NAMESPACE_LENGTH, 149, 146, ModuleDescriptor.MODULE_VERSION, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, MediaError.DetailedErrorCode.MEDIAKEYS_UNKNOWN, 221, 218, 211, 212, 105, MediaError.DetailedErrorCode.SOURCE_BUFFER_FAILURE, MediaError.DetailedErrorCode.MEDIA_NETWORK, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, MediaError.DetailedErrorCode.MEDIAKEYS_WEBCRYPTO, 230, 225, 232, 239, 250, 253, 244, 243};
    }

    public static boolean A(f1 f1Var) {
        boolean z10 = false;
        if (f1Var == null) {
            return false;
        }
        int playbackState = f1Var.getPlaybackState();
        if (playbackState != 1 || !f1Var.isCommandAvailable(2)) {
            if (playbackState == 4 && f1Var.isCommandAvailable(4)) {
                f1Var.seekToDefaultPosition();
            }
            if (f1Var.isCommandAvailable(1)) {
                return z10;
            }
            f1Var.play();
            return true;
        }
        f1Var.prepare();
        z10 = true;
        if (f1Var.isCommandAvailable(1)) {
            return z10;
        }
        f1Var.play();
        return true;
    }

    public static int B(Uri uri, String str) {
        int i10;
        if (str != null) {
            switch (str) {
                case "application/x-mpegURL":
                    return 2;
                case "application/vnd.ms-sstr+xml":
                    return 1;
                case "application/dash+xml":
                    return 0;
                case "application/x-rtsp":
                    return 3;
                default:
                    return 4;
            }
        }
        String scheme = uri.getScheme();
        if (scheme == null || (!w00.a.r("rtsp", scheme) && !w00.a.r("rtspt", scheme))) {
            String lastPathSegment = uri.getLastPathSegment();
            if (lastPathSegment != null) {
                int iLastIndexOf = lastPathSegment.lastIndexOf(46);
                if (iLastIndexOf >= 0) {
                    String strI = w00.a.I(lastPathSegment.substring(iLastIndexOf + 1));
                    strI.getClass();
                    switch (strI.hashCode()) {
                        case 104579:
                            if (strI.equals("ism")) {
                            }
                            break;
                        case 108321:
                            if (strI.equals("mpd")) {
                            }
                            break;
                        case 3242057:
                            if (strI.equals("isml")) {
                            }
                            break;
                        case 3299913:
                            if (strI.equals("m3u8")) {
                            }
                            break;
                    }
                    throw new UnsupportedOperationException("Method not decompiled: e7.i0.B(android.net.Uri, java.lang.String):int");
                }

                public static boolean C(u uVar, u uVar2, Inflater inflater) {
                    if (uVar.a() == 0) {
                        return false;
                    }
                    if (uVar2.f5182a.length < uVar.a()) {
                        uVar2.c(uVar.a() * 2);
                    }
                    if (inflater == null) {
                        inflater = new Inflater();
                    }
                    inflater.setInput(uVar.f5182a, uVar.f5183b, uVar.a());
                    int iInflate = 0;
                    while (true) {
                        try {
                            byte[] bArr = uVar2.f5182a;
                            iInflate += inflater.inflate(bArr, iInflate, bArr.length - iInflate);
                            if (inflater.finished()) {
                                uVar2.M(iInflate);
                                inflater.reset();
                                return true;
                            }
                            if (!inflater.needsDictionary() && !inflater.needsInput()) {
                                byte[] bArr2 = uVar2.f5182a;
                                if (iInflate == bArr2.length) {
                                    uVar2.c(bArr2.length * 2);
                                }
                            }
                            inflater.reset();
                            return false;
                        } catch (DataFormatException unused) {
                            inflater.reset();
                            return false;
                        } catch (Throwable th2) {
                            inflater.reset();
                            throw th2;
                        }
                    }
                }

                public static boolean D(int i10) {
                    return i10 == 3 || i10 == 2 || i10 == 268435456 || i10 == 21 || i10 == 1342177280 || i10 == 22 || i10 == 1610612736 || i10 == 4;
                }

                public static boolean E(Context context) {
                    int i10 = Build.VERSION.SDK_INT;
                    if (context.getApplicationInfo().targetSdkVersion >= 29) {
                        return i10 == 34 && w00.a.r(Build.MODEL, "sm-x200");
                    }
                    return true;
                }

                public static boolean F(Context context) {
                    UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
                    return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
                }

                public static void G(ArrayList arrayList, int i10, int i11, int i12) {
                    ArrayDeque arrayDeque = new ArrayDeque();
                    for (int i13 = (i11 - i10) - 1; i13 >= 0; i13--) {
                        arrayDeque.addFirst(arrayList.remove(i10 + i13));
                    }
                    arrayList.addAll(Math.min(i12, arrayList.size()), arrayDeque);
                }

                public static long H(long j9) {
                    return (j9 == -9223372036854775807L || j9 == Long.MIN_VALUE) ? j9 : j9 * 1000;
                }

                public static String I(String str) {
                    if (str == null) {
                        return null;
                    }
                    String strReplace = str.replace('_', '-');
                    if (!strReplace.isEmpty() && !strReplace.equals("und")) {
                        str = strReplace;
                    }
                    String strI = w00.a.I(str);
                    int i10 = 0;
                    String str2 = strI.split("-", 2)[0];
                    if (f5142g == null) {
                        String[] iSOLanguages = Locale.getISOLanguages();
                        int length = iSOLanguages.length;
                        String[] strArr = f5143h;
                        HashMap map = new HashMap(length + strArr.length);
                        for (String str3 : iSOLanguages) {
                            try {
                                String iSO3Language = new Locale(str3).getISO3Language();
                                if (!TextUtils.isEmpty(iSO3Language)) {
                                    map.put(iSO3Language, str3);
                                }
                            } catch (MissingResourceException unused) {
                            }
                        }
                        for (int i11 = 0; i11 < strArr.length; i11 += 2) {
                            map.put(strArr[i11], strArr[i11 + 1]);
                        }
                        f5142g = map;
                    }
                    String str4 = (String) f5142g.get(str2);
                    if (str4 != null) {
                        StringBuilder sbQ = x5.q(str4);
                        sbQ.append(strI.substring(str2.length()));
                        strI = sbQ.toString();
                        str2 = str4;
                    }
                    if (!"no".equals(str2) && !"i".equals(str2) && !"zh".equals(str2)) {
                        return strI;
                    }
                    while (true) {
                        String[] strArr2 = f5144i;
                        if (i10 >= strArr2.length) {
                            return strI;
                        }
                        if (strI.startsWith(strArr2[i10])) {
                            return strArr2[i10 + 1] + strI.substring(strArr2[i10].length());
                        }
                        i10 += 2;
                    }
                }

                public static Object[] J(int i10, Object[] objArr) {
                    ta.c0.s(i10 <= objArr.length);
                    return Arrays.copyOf(objArr, i10);
                }

                public static long K(String str) throws ParserException {
                    Matcher matcher = f5139d.matcher(str);
                    if (!matcher.matches()) {
                        throw ParserException.a(null, "Invalid date/time format: " + str);
                    }
                    int i10 = 0;
                    if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
                        i10 = Integer.parseInt(matcher.group(13)) + (Integer.parseInt(matcher.group(12)) * 60);
                        if ("-".equals(matcher.group(11))) {
                            i10 *= -1;
                        }
                    }
                    GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
                    gregorianCalendar.clear();
                    gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
                    if (!TextUtils.isEmpty(matcher.group(8))) {
                        gregorianCalendar.set(14, new BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
                    }
                    long timeInMillis = gregorianCalendar.getTimeInMillis();
                    return i10 != 0 ? timeInMillis - (((long) i10) * 60000) : timeInMillis;
                }

                public static int L(long j9, long j10) {
                    long jQ = z3.Q(j9, 100L);
                    return bi.b.P((jQ == Long.MAX_VALUE || jQ == Long.MIN_VALUE) ? j9 / (j10 / 100) : jQ / j10);
                }

                public static void M(Handler handler, Runnable runnable) {
                    Looper looper = handler.getLooper();
                    if (looper.getThread().isAlive()) {
                        if (looper == Looper.myLooper()) {
                            runnable.run();
                        } else {
                            handler.post(runnable);
                        }
                    }
                }

                public static void N(ArrayList arrayList, int i10, int i11) {
                    if (i10 < 0 || i11 > arrayList.size() || i10 > i11) {
                        throw new IllegalArgumentException();
                    }
                    if (i10 != i11) {
                        arrayList.subList(i10, i11).clear();
                    }
                }

                public static long O(int i10, long j9) {
                    return Q(j9, 1000000L, i10, RoundingMode.DOWN);
                }

                public static void P(long[] jArr, long j9) {
                    long j10;
                    RoundingMode roundingMode = RoundingMode.DOWN;
                    int i10 = 0;
                    if (j9 >= 1000000 && j9 % 1000000 == 0) {
                        long jW = z3.w(j9, 1000000L, RoundingMode.UNNECESSARY);
                        while (i10 < jArr.length) {
                            jArr[i10] = z3.w(jArr[i10], jW, roundingMode);
                            i10++;
                        }
                        return;
                    }
                    if (j9 < 1000000 && 1000000 % j9 == 0) {
                        long jW2 = z3.w(1000000L, j9, RoundingMode.UNNECESSARY);
                        while (i10 < jArr.length) {
                            jArr[i10] = z3.Q(jArr[i10], jW2);
                            i10++;
                        }
                        return;
                    }
                    int i11 = 0;
                    while (i11 < jArr.length) {
                        long j11 = jArr[i11];
                        if (j11 != 0) {
                            if (j9 >= j11 && j9 % j11 == 0) {
                                jArr[i11] = z3.w(1000000L, z3.w(j9, j11, RoundingMode.UNNECESSARY), roundingMode);
                            } else if (j9 >= j11 || j11 % j9 != 0) {
                                j10 = j9;
                                jArr[i11] = R(j11, 1000000L, j10, roundingMode);
                            } else {
                                jArr[i11] = z3.Q(1000000L, z3.w(j11, j9, RoundingMode.UNNECESSARY));
                            }
                            j10 = j9;
                        } else {
                            j10 = j9;
                        }
                        i11++;
                        j9 = j10;
                    }
                }

                public static long Q(long j9, long j10, long j11, RoundingMode roundingMode) {
                    if (j9 == 0 || j10 == 0) {
                        return 0L;
                    }
                    if (j11 >= j10 && j11 % j10 == 0) {
                        return z3.w(j9, z3.w(j11, j10, RoundingMode.UNNECESSARY), roundingMode);
                    }
                    if (j11 < j10 && j10 % j11 == 0) {
                        return z3.Q(j9, z3.w(j10, j11, RoundingMode.UNNECESSARY));
                    }
                    if (j11 < j9 || j11 % j9 != 0) {
                        return (j11 >= j9 || j9 % j11 != 0) ? R(j9, j10, j11, roundingMode) : z3.Q(j10, z3.w(j9, j11, RoundingMode.UNNECESSARY));
                    }
                    return z3.w(j10, z3.w(j11, j9, RoundingMode.UNNECESSARY), roundingMode);
                }

                public static long R(long j9, long j10, long j11, RoundingMode roundingMode) {
                    double dRint;
                    long j12;
                    boolean z10;
                    long jQ = z3.Q(j9, j10);
                    if (jQ != Long.MAX_VALUE && jQ != Long.MIN_VALUE) {
                        return z3.w(jQ, j11, roundingMode);
                    }
                    long jY = z3.y(Math.abs(j10), Math.abs(j11));
                    RoundingMode roundingMode2 = RoundingMode.UNNECESSARY;
                    long jW = z3.w(j10, jY, roundingMode2);
                    long jW2 = z3.w(j11, jY, roundingMode2);
                    long jY2 = z3.y(Math.abs(j9), Math.abs(jW2));
                    long jW3 = z3.w(j9, jY2, roundingMode2);
                    long jW4 = z3.w(jW2, jY2, roundingMode2);
                    long jQ2 = z3.Q(jW3, jW);
                    if (jQ2 != Long.MAX_VALUE && jQ2 != Long.MIN_VALUE) {
                        return z3.w(jQ2, jW4, roundingMode);
                    }
                    double d3 = jW3 * (jW / jW4);
                    if (d3 > 9.223372036854776E18d) {
                        return Long.MAX_VALUE;
                    }
                    if (d3 < -9.223372036854776E18d) {
                        return Long.MIN_VALUE;
                    }
                    int i10 = hh.c.f7066a;
                    if (!ca.v.C(d3)) {
                        throw new ArithmeticException("input is infinite or NaN");
                    }
                    switch (hh.b.f7065a[roundingMode.ordinal()]) {
                        case 1:
                            g4.w(hh.c.a(d3));
                            dRint = d3;
                            if ((-9.223372036854776E18d) - dRint < 1.0d) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10 && (dRint < 9.223372036854776E18d)) {
                                return (long) dRint;
                            }
                            throw new ArithmeticException("rounded value is out of range for input " + d3 + " and rounding mode " + roundingMode);
                        case 2:
                            if (d3 >= 0.0d || hh.c.a(d3)) {
                                dRint = d3;
                            } else {
                                j12 = ((long) d3) - 1;
                                dRint = j12;
                            }
                            if ((-9.223372036854776E18d) - dRint < 1.0d) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10 && (dRint < 9.223372036854776E18d)) {
                                return (long) dRint;
                            }
                            throw new ArithmeticException("rounded value is out of range for input " + d3 + " and rounding mode " + roundingMode);
                        case 3:
                            if (d3 <= 0.0d || hh.c.a(d3)) {
                                dRint = d3;
                            } else {
                                j12 = ((long) d3) + 1;
                                dRint = j12;
                            }
                            if ((-9.223372036854776E18d) - dRint < 1.0d) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10 && (dRint < 9.223372036854776E18d)) {
                                return (long) dRint;
                            }
                            throw new ArithmeticException("rounded value is out of range for input " + d3 + " and rounding mode " + roundingMode);
                        case 4:
                            dRint = d3;
                            if ((-9.223372036854776E18d) - dRint < 1.0d) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10 && (dRint < 9.223372036854776E18d)) {
                                return (long) dRint;
                            }
                            throw new ArithmeticException("rounded value is out of range for input " + d3 + " and rounding mode " + roundingMode);
                        case 5:
                            if (hh.c.a(d3)) {
                                dRint = d3;
                            } else {
                                dRint = ((long) d3) + ((long) (d3 > 0.0d ? 1 : -1));
                            }
                            if ((-9.223372036854776E18d) - dRint < 1.0d) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10 && (dRint < 9.223372036854776E18d)) {
                                return (long) dRint;
                            }
                            throw new ArithmeticException("rounded value is out of range for input " + d3 + " and rounding mode " + roundingMode);
                        case 6:
                            dRint = Math.rint(d3);
                            if ((-9.223372036854776E18d) - dRint < 1.0d) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10 && (dRint < 9.223372036854776E18d)) {
                                return (long) dRint;
                            }
                            throw new ArithmeticException("rounded value is out of range for input " + d3 + " and rounding mode " + roundingMode);
                        case 7:
                            dRint = Math.rint(d3);
                            if (Math.abs(d3 - dRint) == 0.5d) {
                                dRint = Math.copySign(0.5d, d3) + d3;
                            }
                            if ((-9.223372036854776E18d) - dRint < 1.0d) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10 && (dRint < 9.223372036854776E18d)) {
                                return (long) dRint;
                            }
                            throw new ArithmeticException("rounded value is out of range for input " + d3 + " and rounding mode " + roundingMode);
                        case 8:
                            dRint = Math.rint(d3);
                            if (Math.abs(d3 - dRint) == 0.5d) {
                                dRint = d3;
                            }
                            if ((-9.223372036854776E18d) - dRint < 1.0d) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10 && (dRint < 9.223372036854776E18d)) {
                                return (long) dRint;
                            }
                            throw new ArithmeticException("rounded value is out of range for input " + d3 + " and rounding mode " + roundingMode);
                        default:
                            throw new AssertionError();
                    }
                }

                public static boolean S(f1 f1Var, boolean z10) {
                    return f1Var == null || !f1Var.getPlayWhenReady() || f1Var.getPlaybackState() == 1 || f1Var.getPlaybackState() == 4 || !(!z10 || f1Var.getPlaybackSuppressionReason() == 0 || f1Var.getPlaybackSuppressionReason() == 4);
                }

                public static String[] T(String str) {
                    return TextUtils.isEmpty(str) ? new String[0] : str.trim().split("(\\s*,\\s*)", -1);
                }

                public static String U(int i10) {
                    return new String(new byte[]{(byte) (i10 >> 24), (byte) (i10 >> 16), (byte) (i10 >> 8), (byte) i10}, StandardCharsets.US_ASCII);
                }

                public static kh.b0 V(kh.v vVar, kh.m mVar) {
                    kh.b0 b0Var = new kh.b0();
                    g0 g0Var = new g0(b0Var, vVar, 0);
                    kh.p pVar = kh.p.A;
                    b0Var.a(g0Var, pVar);
                    vVar.a(new ab.e(vVar, b0Var, mVar, 6), pVar);
                    return b0Var;
                }

                public static long W(long j9) {
                    return (j9 == -9223372036854775807L || j9 == Long.MIN_VALUE) ? j9 : j9 / 1000;
                }

                public static long a(long j9, long j10) {
                    long j11 = j9 + j10;
                    long j12 = (((j10 ^ j9) > 0L ? 1 : ((j10 ^ j9) == 0L ? 0 : -1)) < 0) | ((j9 ^ j11) >= 0) ? j11 : ((j11 >>> 63) ^ 1) + Long.MAX_VALUE;
                    if ((j12 != Long.MIN_VALUE || j11 == Long.MIN_VALUE) && (j12 != Long.MAX_VALUE || j11 == Long.MAX_VALUE)) {
                        return j12;
                    }
                    return Long.MAX_VALUE;
                }

                public static int b(long[] jArr, long j9, boolean z10) {
                    int i10;
                    int iBinarySearch = Arrays.binarySearch(jArr, j9);
                    if (iBinarySearch < 0) {
                        return ~iBinarySearch;
                    }
                    while (true) {
                        i10 = iBinarySearch + 1;
                        if (i10 >= jArr.length || jArr[i10] != j9) {
                            break;
                        }
                        iBinarySearch = i10;
                    }
                    return z10 ? iBinarySearch : i10;
                }

                public static int c(q qVar, long j9) {
                    int i10 = qVar.f5166b - 1;
                    int i11 = 0;
                    while (i11 <= i10) {
                        int i12 = (i11 + i10) >>> 1;
                        if (qVar.d(i12) < j9) {
                            i11 = i12 + 1;
                        } else {
                            i10 = i12 - 1;
                        }
                    }
                    int i13 = i10 + 1;
                    if (i13 < qVar.f5166b && qVar.d(i13) == j9) {
                        return i13;
                    }
                    if (i10 == -1) {
                        return 0;
                    }
                    return i10;
                }

                public static int d(int[] iArr, int i10, boolean z10, boolean z11) {
                    int i11;
                    int i12;
                    int iBinarySearch = Arrays.binarySearch(iArr, i10);
                    if (iBinarySearch < 0) {
                        i12 = -(iBinarySearch + 2);
                    } else {
                        while (true) {
                            i11 = iBinarySearch - 1;
                            if (i11 < 0 || iArr[i11] != i10) {
                                break;
                            }
                            iBinarySearch = i11;
                        }
                        i12 = z10 ? iBinarySearch : i11;
                    }
                    return z11 ? Math.max(0, i12) : i12;
                }

                public static int e(long[] jArr, long j9, boolean z10) {
                    int i10;
                    int iBinarySearch = Arrays.binarySearch(jArr, j9);
                    if (iBinarySearch < 0) {
                        i10 = -(iBinarySearch + 2);
                    } else {
                        while (true) {
                            int i11 = iBinarySearch - 1;
                            if (i11 < 0 || jArr[i11] != j9) {
                                break;
                            }
                            iBinarySearch = i11;
                        }
                        i10 = iBinarySearch;
                    }
                    return z10 ? Math.max(0, i10) : i10;
                }

                public static int f(int i10, int i11) {
                    return ((i10 + i11) - 1) / i11;
                }

                public static float g(float f3, float f10, float f11) {
                    return Math.max(f10, Math.min(f3, f11));
                }

                public static int h(int i10, int i11, int i12) {
                    return Math.max(i11, Math.min(i10, i12));
                }

                public static long i(long j9, long j10, long j11) {
                    return Math.max(j10, Math.min(j9, j11));
                }

                public static boolean j(SparseArray sparseArray, int i10) {
                    return sparseArray.indexOfKey(i10) >= 0;
                }

                public static int k(int i10, byte[] bArr, int i11, int i12) {
                    while (i10 < i11) {
                        i12 = f5145j[((i12 >>> 24) ^ (bArr[i10] & 255)) & 255] ^ (i12 << 8);
                        i10++;
                    }
                    return i12;
                }

                public static Handler l(Handler.Callback callback) {
                    Looper looperMyLooper = Looper.myLooper();
                    looperMyLooper.getClass();
                    return new Handler(looperMyLooper, callback);
                }

                public static int m(int i10) {
                    if (i10 == 30) {
                        return 34;
                    }
                    switch (i10) {
                        case 2:
                        case 3:
                            return 3;
                        case 4:
                        case 5:
                        case 6:
                            return 21;
                        case 7:
                        case 8:
                            return 23;
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                            return 28;
                        default:
                            switch (i10) {
                                case 14:
                                    return 25;
                                case 15:
                                case 16:
                                case 17:
                                case TYPE_SINT64_VALUE:
                                    return 28;
                                default:
                                    switch (i10) {
                                        case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                                            return 30;
                                        case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                                        case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                                            return 31;
                                        default:
                                            return Integer.MAX_VALUE;
                                    }
                            }
                    }
                }

                public static int n(int i10) {
                    if (i10 == 10) {
                        return 737532;
                    }
                    if (i10 == 16) {
                        return 205215996;
                    }
                    if (i10 == 24) {
                        return 67108860;
                    }
                    switch (i10) {
                        case 1:
                            return 4;
                        case 2:
                            return 12;
                        case 3:
                            return 28;
                        case 4:
                            return 204;
                        case 5:
                            return 220;
                        case 6:
                            return 252;
                        case 7:
                            return 1276;
                        case 8:
                            return 6396;
                        default:
                            switch (i10) {
                                case 12:
                                    return 743676;
                                case 13:
                                    return 30136348;
                                case 14:
                                    return 202070268;
                                default:
                                    return 0;
                            }
                    }
                }

                public static b1 o(androidx.media3.common.f fVar, b1 b1Var) {
                    boolean zIsPlayingAd = fVar.isPlayingAd();
                    boolean zIsCurrentMediaItemSeekable = fVar.isCurrentMediaItemSeekable();
                    boolean zHasPreviousMediaItem = fVar.hasPreviousMediaItem();
                    boolean zHasNextMediaItem = fVar.hasNextMediaItem();
                    boolean zIsCurrentMediaItemLive = fVar.isCurrentMediaItemLive();
                    boolean zIsCurrentMediaItemDynamic = fVar.isCurrentMediaItemDynamic();
                    boolean zIsEmpty = fVar.getCurrentTimeline().isEmpty();
                    a1 a1Var = new a1();
                    a1Var.f1066a = new androidx.media3.common.q();
                    ((androidx.media3.common.q) a1Var.f1066a).e(b1Var.f1103a);
                    boolean z10 = !zIsPlayingAd;
                    a1Var.a(4, z10);
                    boolean z11 = false;
                    a1Var.a(5, zIsCurrentMediaItemSeekable && !zIsPlayingAd);
                    a1Var.a(6, zHasPreviousMediaItem && !zIsPlayingAd);
                    a1Var.a(7, !zIsEmpty && (zHasPreviousMediaItem || !zIsCurrentMediaItemLive || zIsCurrentMediaItemSeekable) && !zIsPlayingAd);
                    a1Var.a(8, zHasNextMediaItem && !zIsPlayingAd);
                    a1Var.a(9, !zIsEmpty && (zHasNextMediaItem || (zIsCurrentMediaItemLive && zIsCurrentMediaItemDynamic)) && !zIsPlayingAd);
                    a1Var.a(10, z10);
                    a1Var.a(11, zIsCurrentMediaItemSeekable && !zIsPlayingAd);
                    if (zIsCurrentMediaItemSeekable && !zIsPlayingAd) {
                        z11 = true;
                    }
                    a1Var.a(12, z11);
                    return a1Var.b();
                }

                public static int p(int i10) {
                    if (i10 != 2) {
                        if (i10 == 3) {
                            return 1;
                        }
                        if (i10 != 4) {
                            if (i10 != 21) {
                                if (i10 != 22) {
                                    if (i10 != 268435456) {
                                        if (i10 != 1342177280) {
                                            if (i10 != 1610612736) {
                                                throw new IllegalArgumentException();
                                            }
                                        }
                                    }
                                }
                            }
                            return 3;
                        }
                        return 4;
                    }
                    return 2;
                }

                public static Point q(Context context) {
                    DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
                    String str = null;
                    Display display = displayManager != null ? displayManager.getDisplay(0) : null;
                    if (display == null) {
                        WindowManager windowManager = (WindowManager) context.getSystemService("window");
                        windowManager.getClass();
                        display = windowManager.getDefaultDisplay();
                    }
                    if (display.getDisplayId() == 0 && F(context)) {
                        try {
                            Class<?> cls = Class.forName("android.os.SystemProperties");
                            str = (String) cls.getMethod("get", String.class).invoke(cls, "vendor.display-size");
                        } catch (Exception e3) {
                            a.e("Util", "Failed to read system property vendor.display-size", e3);
                        }
                        if (!TextUtils.isEmpty(str)) {
                            try {
                                String[] strArrSplit = str.trim().split("x", -1);
                                if (strArrSplit.length == 2) {
                                    int i10 = Integer.parseInt(strArrSplit[0]);
                                    int i11 = Integer.parseInt(strArrSplit[1]);
                                    if (i10 > 0 && i11 > 0) {
                                        return new Point(i10, i11);
                                    }
                                }
                            } catch (NumberFormatException unused) {
                            }
                            a.d("Util", "Invalid display size: " + str);
                        }
                        if ("Sony".equals(Build.MANUFACTURER) && Build.MODEL.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                            return new Point(3840, 2160);
                        }
                    }
                    Point point = new Point();
                    Display.Mode mode = display.getMode();
                    point.x = mode.getPhysicalWidth();
                    point.y = mode.getPhysicalHeight();
                    return point;
                }

                public static Looper r() {
                    Looper looperMyLooper = Looper.myLooper();
                    return looperMyLooper != null ? looperMyLooper : Looper.getMainLooper();
                }

                public static int s(int i10) {
                    if (i10 == 2 || i10 == 4) {
                        return 6005;
                    }
                    if (i10 == 10) {
                        return 6004;
                    }
                    if (i10 == 7) {
                        return 6005;
                    }
                    if (i10 == 8) {
                        return 6003;
                    }
                    switch (i10) {
                        case 15:
                            return 6003;
                        case 16:
                        case TYPE_SINT64_VALUE:
                            return 6005;
                        case 17:
                        case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                        case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                        case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                        case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                            return 6004;
                        default:
                            switch (i10) {
                                case 24:
                                case 25:
                                case RuntimeVersion.MINOR:
                                case 27:
                                case 28:
                                    return 6002;
                                default:
                                    return 6006;
                            }
                    }
                }

                public static int t(String str) {
                    String[] strArrSplit;
                    int length;
                    int i10 = 0;
                    if (str == null || (length = (strArrSplit = str.split("_", -1)).length) < 2) {
                        return 0;
                    }
                    String str2 = strArrSplit[length - 1];
                    boolean z10 = length >= 3 && "neg".equals(strArrSplit[length - 2]);
                    try {
                        str2.getClass();
                        i10 = Integer.parseInt(str2);
                        if (z10) {
                            return -i10;
                        }
                    } catch (NumberFormatException unused) {
                    }
                    return i10;
                }

                public static long u(float f3, long j9) {
                    return f3 == 1.0f ? j9 : Math.round(j9 * ((double) f3));
                }

                public static long v(long j9) {
                    return j9 == -9223372036854775807L ? System.currentTimeMillis() : SystemClock.elapsedRealtime() + j9;
                }

                public static int w(int i10, ByteOrder byteOrder) {
                    if (i10 == 8) {
                        return 3;
                    }
                    if (i10 == 16) {
                        return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 2 : 268435456;
                    }
                    if (i10 == 24) {
                        return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 21 : 1342177280;
                    }
                    if (i10 != 32) {
                        return 0;
                    }
                    return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 22 : 1610612736;
                }

                public static long x(float f3, long j9) {
                    return f3 == 1.0f ? j9 : Math.round(j9 / ((double) f3));
                }

                public static String y(StringBuilder sb2, Formatter formatter, long j9) {
                    if (j9 == -9223372036854775807L) {
                        j9 = 0;
                    }
                    String str = j9 < 0 ? "-" : RuntimeVersion.SUFFIX;
                    long jAbs = (Math.abs(j9) + 500) / 1000;
                    long j10 = jAbs % 60;
                    long j11 = (jAbs / 60) % 60;
                    long j12 = jAbs / 3600;
                    sb2.setLength(0);
                    return j12 > 0 ? formatter.format("%s%d:%02d:%02d", str, Long.valueOf(j12), Long.valueOf(j11), Long.valueOf(j10)).toString() : formatter.format("%s%02d:%02d", str, Long.valueOf(j11), Long.valueOf(j10)).toString();
                }

                public static String z(int i10) {
                    switch (i10) {
                        case -2:
                            return "none";
                        case -1:
                            return "unknown";
                        case 0:
                            return "default";
                        case 1:
                            return "audio";
                        case 2:
                            return "video";
                        case 3:
                            return "text";
                        case 4:
                            return "image";
                        case 5:
                            return "metadata";
                        case 6:
                            return "camera motion";
                        default:
                            return i10 >= 10000 ? g4.c.i("custom (", i10, ")") : "?";
                    }
                }
            }

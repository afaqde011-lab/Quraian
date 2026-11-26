package androidx.media3.common;

import android.text.TextUtils;
import com.google.android.gms.cast.MediaError;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class x0 {

    public static final ArrayList f1681a = new ArrayList();

    public static final Pattern f1682b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    public static boolean a(String str, String str2) {
        w0 w0VarF;
        int iA;
        if (str == null) {
            return false;
        }
        switch (str) {
            case "audio/eac3-joc":
            case "audio/mpeg-L1":
            case "audio/mpeg-L2":
            case "audio/ac3":
            case "audio/raw":
            case "audio/eac3":
            case "audio/flac":
            case "audio/mpeg":
            case "audio/g711-alaw":
            case "audio/g711-mlaw":
                return true;
            case "audio/mp4a-latm":
                return (str2 == null || (w0VarF = f(str2)) == null || (iA = w0VarF.a()) == 0 || iA == 16) ? false : true;
            default:
                return false;
        }
    }

    public static String b(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : e7.i0.T(str)) {
            String strD = d(str2);
            if (strD != null && j(strD)) {
                return strD;
            }
        }
        return null;
    }

    public static int c(String str, String str2) {
        w0 w0VarF;
        str.getClass();
        switch (str) {
            case "audio/eac3-joc":
                return 18;
            case "audio/vnd.dts.hd;profile=lbr":
                return 8;
            case "audio/vnd.dts":
                return 7;
            case "audio/mp4a-latm":
                if (str2 == null || (w0VarF = f(str2)) == null) {
                    return 0;
                }
                return w0VarF.a();
            case "audio/ac3":
                return 5;
            case "audio/ac4":
                return 17;
            case "audio/vnd.dts.uhd;profile=p2":
                return 30;
            case "audio/eac3":
                return 6;
            case "audio/mpeg":
                return 9;
            case "audio/opus":
                return 20;
            case "audio/vnd.dts.hd":
                return 8;
            case "audio/true-hd":
                return 14;
            default:
                return 0;
        }
    }

    public static String d(String str) {
        w0 w0VarF;
        String strE = null;
        if (str != null) {
            String strI = w00.a.I(str.trim());
            if (strI.startsWith("avc1") || strI.startsWith("avc3")) {
                return "video/avc";
            }
            if (strI.startsWith("hev1") || strI.startsWith("hvc1")) {
                return "video/hevc";
            }
            if (strI.startsWith("dvav") || strI.startsWith("dva1") || strI.startsWith("dvhe") || strI.startsWith("dvh1")) {
                return "video/dolby-vision";
            }
            if (strI.startsWith("av01")) {
                return "video/av01";
            }
            if (strI.startsWith("vp9") || strI.startsWith("vp09")) {
                return "video/x-vnd.on2.vp9";
            }
            if (strI.startsWith("vp8") || strI.startsWith("vp08")) {
                return "video/x-vnd.on2.vp8";
            }
            if (strI.startsWith("mp4a")) {
                if (strI.startsWith("mp4a.") && (w0VarF = f(strI)) != null) {
                    strE = e(w0VarF.f1663a);
                }
                return strE == null ? "audio/mp4a-latm" : strE;
            }
            if (strI.startsWith("mha1")) {
                return "audio/mha1";
            }
            if (strI.startsWith("mhm1")) {
                return "audio/mhm1";
            }
            if (strI.startsWith("ac-3") || strI.startsWith("dac3")) {
                return "audio/ac3";
            }
            if (strI.startsWith("ec-3") || strI.startsWith("dec3")) {
                return "audio/eac3";
            }
            if (strI.startsWith("ec+3")) {
                return "audio/eac3-joc";
            }
            if (strI.startsWith("ac-4") || strI.startsWith("dac4")) {
                return "audio/ac4";
            }
            if (strI.startsWith("dtsc")) {
                return "audio/vnd.dts";
            }
            if (strI.startsWith("dtse")) {
                return "audio/vnd.dts.hd;profile=lbr";
            }
            if (strI.startsWith("dtsh") || strI.startsWith("dtsl")) {
                return "audio/vnd.dts.hd";
            }
            if (strI.startsWith("dtsx")) {
                return "audio/vnd.dts.uhd;profile=p2";
            }
            if (strI.startsWith("opus")) {
                return "audio/opus";
            }
            if (strI.startsWith("vorbis")) {
                return "audio/vorbis";
            }
            if (strI.startsWith("flac")) {
                return "audio/flac";
            }
            if (strI.startsWith("stpp")) {
                return "application/ttml+xml";
            }
            if (strI.startsWith("wvtt")) {
                return "text/vtt";
            }
            if (strI.contains("cea708")) {
                return "application/cea-708";
            }
            if (strI.contains("eia608") || strI.contains("cea608")) {
                return "application/cea-608";
            }
            ArrayList arrayList = f1681a;
            if (arrayList.size() > 0) {
                arrayList.get(0).getClass();
                throw new ClassCastException();
            }
        }
        return null;
    }

    public static String e(int i10) {
        if (i10 == 32) {
            return "video/mp4v-es";
        }
        if (i10 == 33) {
            return "video/avc";
        }
        if (i10 == 35) {
            return "video/hevc";
        }
        if (i10 == 64) {
            return "audio/mp4a-latm";
        }
        if (i10 == 163) {
            return "video/wvc1";
        }
        if (i10 == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i10 == 221) {
            return "audio/vorbis";
        }
        if (i10 == 165) {
            return "audio/ac3";
        }
        if (i10 == 166) {
            return "audio/eac3";
        }
        switch (i10) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return "video/mpeg2";
            case MediaError.DetailedErrorCode.MEDIA_DECODE:
            case MediaError.DetailedErrorCode.MEDIA_NETWORK:
            case MediaError.DetailedErrorCode.MEDIA_SRC_NOT_SUPPORTED:
                return "audio/mp4a-latm";
            case 105:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            case 108:
                return "image/jpeg";
            default:
                switch (i10) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    public static w0 f(String str) {
        Matcher matcher = f1682b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        String strGroup2 = matcher.group(2);
        try {
            return new w0(Integer.parseInt(strGroup, 16), strGroup2 != null ? Integer.parseInt(strGroup2) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static String g(String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }

    public static int h(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (j(str)) {
            return 1;
        }
        if (m(str)) {
            return 2;
        }
        if (l(str)) {
            return 3;
        }
        if (k(str)) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str) || "application/meta".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        ArrayList arrayList = f1681a;
        if (arrayList.size() <= 0) {
            return -1;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    public static String i(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : e7.i0.T(str)) {
            String strD = d(str2);
            if (strD != null && m(strD)) {
                return strD;
            }
        }
        return null;
    }

    public static boolean j(String str) {
        return "audio".equals(g(str));
    }

    public static boolean k(String str) {
        return "image".equals(g(str)) || "application/x-image-uri".equals(str);
    }

    public static boolean l(String str) {
        return "text".equals(g(str)) || "application/x-media3-cues".equals(str) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    public static boolean m(String str) {
        return "video".equals(g(str));
    }

    public static String n(String str) {
        if (str == null) {
            return null;
        }
        String strI = w00.a.I(str);
        strI.getClass();
        switch (strI) {
            case "video/x-mvhevc":
                return "video/mv-hevc";
            case "audio/x-flac":
                return "audio/flac";
            case "application/x-mpegurl":
                return "application/x-mpegURL";
            case "audio/x-wav":
                return "audio/wav";
            case "audio/mpeg-l1":
                return "audio/mpeg-L1";
            case "audio/mpeg-l2":
                return "audio/mpeg-L2";
            case "audio/mp3":
                return "audio/mpeg";
            default:
                return strI;
        }
    }
}

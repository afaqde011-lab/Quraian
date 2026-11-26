package e7;

import android.util.Pair;
import androidx.media3.common.x0;
import com.google.android.gms.cast.Cast;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.internal.measurement.x5;
import com.google.protobuf.RuntimeVersion;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class e {

    public static final byte[] f5121a = {0, 0, 0, 1};

    public static final String[] f5122b = {RuntimeVersion.SUFFIX, "A", "B", "C"};

    public static final Pattern f5123c = Pattern.compile("^\\D?(\\d+)$");

    public static String a(int i10, boolean z10, int i11, int i12, int[] iArr, int i13) {
        Object[] objArr = {f5122b[i10], Integer.valueOf(i11), Integer.valueOf(i12), Character.valueOf(z10 ? 'H' : 'L'), Integer.valueOf(i13)};
        String str = i0.f5136a;
        StringBuilder sb2 = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i14 = 0; i14 < length; i14++) {
            sb2.append(String.format(".%02X", Integer.valueOf(iArr[i14])));
        }
        return sb2.toString();
    }

    public static Pair b(androidx.media3.common.t tVar) {
        byte b7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        Integer num;
        byte b10;
        Integer num2;
        String str;
        byte b11;
        byte b12;
        Integer num3 = 1;
        String str2 = tVar.f1593k;
        String str3 = tVar.f1593k;
        if (str2 == null) {
            return null;
        }
        String[] strArrSplit = str2.split("\\.");
        if ("video/dolby-vision".equals(tVar.f1594n)) {
            Integer numValueOf = Integer.valueOf(Cast.MAX_NAMESPACE_LENGTH);
            if (strArrSplit.length < 3) {
                x5.x("Ignoring malformed Dolby Vision codec string: ", str3, "CodecSpecificDataUtil");
                return null;
            }
            Matcher matcher = f5123c.matcher(strArrSplit[1]);
            if (!matcher.matches()) {
                x5.x("Ignoring malformed Dolby Vision codec string: ", str3, "CodecSpecificDataUtil");
                return null;
            }
            String strGroup = matcher.group(1);
            if (strGroup != null) {
                switch (strGroup.hashCode()) {
                    case 1536:
                        num = 16;
                        b10 = !strGroup.equals("00") ? (byte) -1 : (byte) 0;
                        break;
                    case 1537:
                        if (!strGroup.equals("01")) {
                            num = 16;
                        } else {
                            num = 16;
                            b10 = 1;
                        }
                        break;
                    case 1538:
                        if (!strGroup.equals("02")) {
                            num = 16;
                        } else {
                            num = 16;
                            b10 = 2;
                        }
                        break;
                    case 1539:
                        if (!strGroup.equals("03")) {
                            num = 16;
                        } else {
                            num = 16;
                            b10 = 3;
                        }
                        break;
                    case 1540:
                        if (!strGroup.equals("04")) {
                            num = 16;
                        } else {
                            num = 16;
                            b10 = 4;
                        }
                        break;
                    case 1541:
                        if (!strGroup.equals("05")) {
                            num = 16;
                        } else {
                            num = 16;
                            b10 = 5;
                        }
                        break;
                    case 1542:
                        if (!strGroup.equals("06")) {
                            num = 16;
                        } else {
                            num = 16;
                            b10 = 6;
                        }
                        break;
                    case 1543:
                        if (!strGroup.equals("07")) {
                            num = 16;
                        } else {
                            num = 16;
                            b10 = 7;
                        }
                        break;
                    case 1544:
                        if (!strGroup.equals("08")) {
                            num = 16;
                        } else {
                            num = 16;
                            b10 = 8;
                        }
                        break;
                    case 1545:
                        if (!strGroup.equals("09")) {
                            num = 16;
                        } else {
                            num = 16;
                            b10 = 9;
                        }
                        break;
                    case 1567:
                        if (!strGroup.equals("10")) {
                            num = 16;
                        } else {
                            num = 16;
                            b10 = 10;
                        }
                        break;
                    default:
                        num = 16;
                        break;
                }
                switch (b10) {
                    case 0:
                        num2 = num3;
                        break;
                    case 1:
                        num2 = 2;
                        break;
                    case 2:
                        num2 = 4;
                        break;
                    case 3:
                        num2 = 8;
                        break;
                    case 4:
                        num2 = num;
                        break;
                    case 5:
                        num2 = 32;
                        break;
                    case 6:
                        num2 = 64;
                        break;
                    case 7:
                        num2 = numValueOf;
                        break;
                    case 8:
                        num2 = 256;
                        break;
                    case 9:
                        num2 = 512;
                        break;
                    case 10:
                        num2 = 1024;
                        break;
                }
                if (num2 == null) {
                    x5.x("Unknown Dolby Vision profile string: ", strGroup, "CodecSpecificDataUtil");
                    return null;
                }
                str = strArrSplit[2];
                if (str == null) {
                    switch (str.hashCode()) {
                        case 1537:
                            if (str.equals("01")) {
                                b11 = -1;
                            } else {
                                b11 = 0;
                            }
                            break;
                        case 1538:
                            if (str.equals("02")) {
                                b11 = -1;
                            } else {
                                b11 = 1;
                            }
                            break;
                        case 1539:
                            if (str.equals("03")) {
                                b11 = -1;
                            } else {
                                b11 = 2;
                            }
                            break;
                        case 1540:
                            if (str.equals("04")) {
                                b11 = -1;
                            } else {
                                b11 = 3;
                            }
                            break;
                        case 1541:
                            if (str.equals("05")) {
                                b11 = -1;
                            } else {
                                b11 = 4;
                            }
                            break;
                        case 1542:
                            if (str.equals("06")) {
                                b11 = -1;
                            } else {
                                b11 = 5;
                            }
                            break;
                        case 1543:
                            if (str.equals("07")) {
                                b11 = -1;
                            } else {
                                b11 = 6;
                            }
                            break;
                        case 1544:
                            if (str.equals("08")) {
                                b11 = -1;
                            } else {
                                b11 = 7;
                            }
                            break;
                        case 1545:
                            if (str.equals("09")) {
                                b11 = -1;
                            } else {
                                b11 = 8;
                            }
                            break;
                        case 1567:
                            if (str.equals("10")) {
                                b11 = -1;
                            } else {
                                b11 = 9;
                            }
                            break;
                        case 1568:
                            if (str.equals("11")) {
                                b11 = -1;
                            } else {
                                b11 = 10;
                            }
                            break;
                        case 1569:
                            if (str.equals("12")) {
                                b11 = -1;
                            } else {
                                b12 = 11;
                                b11 = b12;
                            }
                            break;
                        case 1570:
                            if (str.equals("13")) {
                                b11 = -1;
                            } else {
                                b12 = 12;
                                b11 = b12;
                            }
                            break;
                        default:
                            b11 = -1;
                            break;
                    }
                    switch (b11) {
                        case 0:
                            break;
                        case 1:
                            num3 = 2;
                            break;
                        case 2:
                            num3 = 4;
                            break;
                        case 3:
                            num3 = 8;
                            break;
                        case 4:
                            num3 = num;
                            break;
                        case 5:
                            num3 = 32;
                            break;
                        case 6:
                            num3 = 64;
                            break;
                        case 7:
                            num3 = numValueOf;
                            break;
                        case 8:
                            num3 = 256;
                            break;
                        case 9:
                            num3 = 512;
                            break;
                        case 10:
                            num3 = 1024;
                            break;
                        case 11:
                            num3 = 2048;
                            break;
                        case 12:
                            num3 = 4096;
                            break;
                        default:
                            num3 = null;
                            break;
                    }
                } else {
                    num3 = null;
                }
                if (num3 == null) {
                    return new Pair(num2, num3);
                }
                x5.x("Unknown Dolby Vision level string: ", str, "CodecSpecificDataUtil");
                return null;
            }
            num = 16;
            num2 = null;
            if (num2 == null) {
                x5.x("Unknown Dolby Vision profile string: ", strGroup, "CodecSpecificDataUtil");
                return null;
            }
            str = strArrSplit[2];
            if (str == null) {
                switch (str.hashCode()) {
                    case 1537:
                        if (str.equals("01")) {
                            b11 = 0;
                        } else {
                            b11 = -1;
                        }
                        break;
                    case 1538:
                        if (str.equals("02")) {
                            b11 = 1;
                        } else {
                            b11 = -1;
                        }
                        break;
                    case 1539:
                        if (str.equals("03")) {
                            b11 = 2;
                        } else {
                            b11 = -1;
                        }
                        break;
                    case 1540:
                        if (str.equals("04")) {
                            b11 = 3;
                        } else {
                            b11 = -1;
                        }
                        break;
                    case 1541:
                        if (str.equals("05")) {
                            b11 = 4;
                        } else {
                            b11 = -1;
                        }
                        break;
                    case 1542:
                        if (str.equals("06")) {
                            b11 = 5;
                        } else {
                            b11 = -1;
                        }
                        break;
                    case 1543:
                        if (str.equals("07")) {
                            b11 = 6;
                        } else {
                            b11 = -1;
                        }
                        break;
                    case 1544:
                        if (str.equals("08")) {
                            b11 = 7;
                        } else {
                            b11 = -1;
                        }
                        break;
                    case 1545:
                        if (str.equals("09")) {
                            b11 = 8;
                        } else {
                            b11 = -1;
                        }
                        break;
                    case 1567:
                        if (str.equals("10")) {
                            b11 = 9;
                        } else {
                            b11 = -1;
                        }
                        break;
                    case 1568:
                        if (str.equals("11")) {
                            b11 = 10;
                        } else {
                            b11 = -1;
                        }
                        break;
                    case 1569:
                        if (str.equals("12")) {
                            b12 = 11;
                            b11 = b12;
                        } else {
                            b11 = -1;
                        }
                        break;
                    case 1570:
                        if (str.equals("13")) {
                            b12 = 12;
                            b11 = b12;
                        } else {
                            b11 = -1;
                        }
                        break;
                    default:
                        b11 = -1;
                        break;
                }
                switch (b11) {
                    case 0:
                        break;
                    case 1:
                        num3 = 2;
                        break;
                    case 2:
                        num3 = 4;
                        break;
                    case 3:
                        num3 = 8;
                        break;
                    case 4:
                        num3 = num;
                        break;
                    case 5:
                        num3 = 32;
                        break;
                    case 6:
                        num3 = 64;
                        break;
                    case 7:
                        num3 = numValueOf;
                        break;
                    case 8:
                        num3 = 256;
                        break;
                    case 9:
                        num3 = 512;
                        break;
                    case 10:
                        num3 = 1024;
                        break;
                    case 11:
                        num3 = 2048;
                        break;
                    case 12:
                        num3 = 4096;
                        break;
                    default:
                        num3 = null;
                        break;
                }
            } else {
                num3 = null;
            }
            if (num3 == null) {
                return new Pair(num2, num3);
            }
            x5.x("Unknown Dolby Vision level string: ", str, "CodecSpecificDataUtil");
            return null;
        }
        String str4 = strArrSplit[0];
        str4.getClass();
        switch (str4) {
            case "ac-4":
                b7 = 0;
                break;
            case "apv1":
                b7 = 1;
                break;
            case "av01":
                b7 = 2;
                break;
            case "avc1":
                b7 = 3;
                break;
            case "avc2":
                b7 = 4;
                break;
            case "hev1":
                b7 = 5;
                break;
            case "hvc1":
                b7 = 6;
                break;
            case "iamf":
                b7 = 7;
                break;
            case "mp4a":
                b7 = 8;
                break;
            case "s263":
                b7 = 9;
                break;
            case "vp09":
                b7 = 10;
                break;
            default:
                b7 = -1;
                break;
        }
        int i22 = 8192;
        switch (b7) {
            case 0:
                if (strArrSplit.length != 4) {
                    x5.x("Ignoring malformed AC-4 codec string: ", str3, "CodecSpecificDataUtil");
                    return null;
                }
                try {
                    int i23 = Integer.parseInt(strArrSplit[1]);
                    int i24 = Integer.parseInt(strArrSplit[2]);
                    int i25 = Integer.parseInt(strArrSplit[3]);
                    if (i23 != 0) {
                        if (i23 != 1) {
                            if (i23 != 2) {
                                i10 = -1;
                            } else if (i24 == 1) {
                                i10 = 1026;
                            } else if (i24 == 2) {
                                i10 = 1028;
                            } else {
                                i10 = -1;
                            }
                        } else if (i24 == 0) {
                            i10 = 513;
                        } else if (i24 == 1) {
                            i10 = 514;
                        } else {
                            i10 = -1;
                        }
                    } else if (i24 == 0) {
                        i10 = 257;
                    } else {
                        i10 = -1;
                    }
                    if (i10 == -1) {
                        a.m("CodecSpecificDataUtil", "Unknown AC-4 profile: " + i23 + "." + i24);
                        return null;
                    }
                    if (i25 == 0) {
                        i11 = 1;
                    } else if (i25 == 1) {
                        i11 = 2;
                    } else if (i25 == 2) {
                        i11 = 4;
                    } else if (i25 != 3) {
                        i11 = i25 != 4 ? -1 : 16;
                    } else {
                        i11 = 8;
                    }
                    if (i11 != -1) {
                        return new Pair(Integer.valueOf(i10), Integer.valueOf(i11));
                    }
                    a1.b.y("Unknown AC-4 level: ", i25, "CodecSpecificDataUtil");
                    return null;
                } catch (NumberFormatException unused) {
                    x5.x("Ignoring malformed AC-4 codec string: ", str3, "CodecSpecificDataUtil");
                    return null;
                }
            case 1:
                if (strArrSplit.length < 4) {
                    x5.x("Ignoring malformed APV codec string: ", str3, "CodecSpecificDataUtil");
                    return null;
                }
                try {
                    int i26 = Integer.parseInt(strArrSplit[1].substring(4));
                    int i27 = Integer.parseInt(strArrSplit[2].substring(4));
                    int i28 = Integer.parseInt(strArrSplit[3].substring(4));
                    if (i26 == 33) {
                        i22 = 1;
                    } else if (i26 != 44) {
                        a1.b.y("Ignoring invalid APV profile: ", i26, "CodecSpecificDataUtil");
                        return null;
                    }
                    int i29 = (i27 / 30) * 2;
                    if (i27 % 30 == 0) {
                        i29--;
                    }
                    return new Pair(Integer.valueOf(i22), Integer.valueOf((256 << (i29 - 1)) | (1 << i28)));
                } catch (NumberFormatException e3) {
                    a.n("CodecSpecificDataUtil", "Ignoring malformed APV codec string: " + str3, e3);
                    return null;
                }
            case 2:
                androidx.media3.common.i iVar = tVar.D;
                if (strArrSplit.length < 4) {
                    x5.x("Ignoring malformed AV1 codec string: ", str3, "CodecSpecificDataUtil");
                    return null;
                }
                try {
                    int i30 = Integer.parseInt(strArrSplit[1]);
                    int i31 = Integer.parseInt(strArrSplit[2].substring(0, 2));
                    int i32 = Integer.parseInt(strArrSplit[3]);
                    if (i30 != 0) {
                        a1.b.y("Unknown AV1 profile: ", i30, "CodecSpecificDataUtil");
                        return null;
                    }
                    if (i32 != 8 && i32 != 10) {
                        a1.b.y("Unknown AV1 bit depth: ", i32, "CodecSpecificDataUtil");
                        return null;
                    }
                    int i33 = i32 == 8 ? 1 : (iVar == null || !(iVar.f1246d != null || (i12 = iVar.f1245c) == 7 || i12 == 6)) ? 2 : 4096;
                    switch (i31) {
                        case 0:
                            i13 = -1;
                            i14 = 1;
                            break;
                        case 1:
                            i13 = -1;
                            i14 = 2;
                            break;
                        case 2:
                            i13 = -1;
                            i14 = 4;
                            break;
                        case 3:
                            i14 = 8;
                            i13 = -1;
                            break;
                        case 4:
                            i14 = 16;
                            i13 = -1;
                            break;
                        case 5:
                            i14 = 32;
                            i13 = -1;
                            break;
                        case 6:
                            i14 = 64;
                            i13 = -1;
                            break;
                        case 7:
                            i14 = 128;
                            i13 = -1;
                            break;
                        case 8:
                            i14 = 256;
                            i13 = -1;
                            break;
                        case 9:
                            i14 = 512;
                            i13 = -1;
                            break;
                        case 10:
                            i14 = 1024;
                            i13 = -1;
                            break;
                        case 11:
                            i14 = 2048;
                            i13 = -1;
                            break;
                        case 12:
                            i14 = 4096;
                            i13 = -1;
                            break;
                        case 13:
                            i14 = 8192;
                            i13 = -1;
                            break;
                        case 14:
                            i14 = 16384;
                            i13 = -1;
                            break;
                        case 15:
                            i14 = 32768;
                            i13 = -1;
                            break;
                        case 16:
                            i14 = Cast.MAX_MESSAGE_LENGTH;
                            i13 = -1;
                            break;
                        case 17:
                            i14 = 131072;
                            i13 = -1;
                            break;
                        case TYPE_SINT64_VALUE:
                            i14 = 262144;
                            i13 = -1;
                            break;
                        case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                            i14 = 524288;
                            i13 = -1;
                            break;
                        case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                            i14 = 1048576;
                            i13 = -1;
                            break;
                        case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                            i14 = 2097152;
                            i13 = -1;
                            break;
                        case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                            i14 = 4194304;
                            i13 = -1;
                            break;
                        case 23:
                            i14 = 8388608;
                            i13 = -1;
                            break;
                        default:
                            i13 = -1;
                            i14 = -1;
                            break;
                    }
                    if (i14 != i13) {
                        return new Pair(Integer.valueOf(i33), Integer.valueOf(i14));
                    }
                    a1.b.y("Unknown AV1 level: ", i31, "CodecSpecificDataUtil");
                    return null;
                } catch (NumberFormatException unused2) {
                    x5.x("Ignoring malformed AV1 codec string: ", str3, "CodecSpecificDataUtil");
                    return null;
                }
            case 3:
            case 4:
                if (strArrSplit.length < 2) {
                    x5.x("Ignoring malformed AVC codec string: ", str3, "CodecSpecificDataUtil");
                    return null;
                }
                try {
                    if (strArrSplit[1].length() == 6) {
                        i15 = Integer.parseInt(strArrSplit[1].substring(0, 2), 16);
                        i16 = Integer.parseInt(strArrSplit[1].substring(4), 16);
                    } else {
                        if (strArrSplit.length < 3) {
                            a.m("CodecSpecificDataUtil", "Ignoring malformed AVC codec string: " + str3);
                            return null;
                        }
                        i15 = Integer.parseInt(strArrSplit[1]);
                        i16 = Integer.parseInt(strArrSplit[2]);
                    }
                    if (i15 == 66) {
                        i17 = -1;
                        i18 = 1;
                    } else if (i15 == 77) {
                        i17 = -1;
                        i18 = 2;
                    } else if (i15 != 88) {
                        if (i15 == 100) {
                            i18 = 8;
                        } else if (i15 == 110) {
                            i18 = 16;
                        } else if (i15 == 122) {
                            i18 = 32;
                        } else if (i15 != 244) {
                            i17 = -1;
                            i18 = -1;
                        } else {
                            i18 = 64;
                        }
                        i17 = -1;
                    } else {
                        i17 = -1;
                        i18 = 4;
                    }
                    if (i18 == i17) {
                        a1.b.y("Unknown AVC profile: ", i15, "CodecSpecificDataUtil");
                        return null;
                    }
                    switch (i16) {
                        case 10:
                            i19 = 1;
                            break;
                        case 11:
                            i19 = 4;
                            break;
                        case 12:
                            i19 = 8;
                            break;
                        case 13:
                            i19 = 16;
                            break;
                        default:
                            switch (i16) {
                                case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                                    i19 = 32;
                                    break;
                                case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                                    i19 = 64;
                                    break;
                                case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                                    i19 = 128;
                                    break;
                                default:
                                    switch (i16) {
                                        case 30:
                                            i19 = 256;
                                            break;
                                        case 31:
                                            i19 = 512;
                                            break;
                                        case CastDevice.CAPABILITY_MULTIZONE_GROUP:
                                            i19 = 1024;
                                            break;
                                        default:
                                            switch (i16) {
                                                case 40:
                                                    i19 = 2048;
                                                    break;
                                                case 41:
                                                    i19 = 4096;
                                                    break;
                                                case 42:
                                                    i19 = 8192;
                                                    break;
                                                default:
                                                    switch (i16) {
                                                        case 50:
                                                            i19 = 16384;
                                                            break;
                                                        case 51:
                                                            i19 = 32768;
                                                            break;
                                                        case 52:
                                                            i19 = Cast.MAX_MESSAGE_LENGTH;
                                                            break;
                                                        default:
                                                            i19 = -1;
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    if (i19 != -1) {
                        return new Pair(Integer.valueOf(i18), Integer.valueOf(i19));
                    }
                    a1.b.y("Unknown AVC level: ", i16, "CodecSpecificDataUtil");
                    return null;
                } catch (NumberFormatException unused3) {
                    x5.x("Ignoring malformed AVC codec string: ", str3, "CodecSpecificDataUtil");
                    return null;
                }
            case 5:
            case 6:
                return c(str3, strArrSplit, tVar.D);
            case 7:
                if (strArrSplit.length < 4) {
                    x5.x("Ignoring malformed IAMF codec string: ", str3, "CodecSpecificDataUtil");
                    return null;
                }
                try {
                    int i34 = 1 << (Integer.parseInt(strArrSplit[1]) + 16);
                    String str5 = strArrSplit[3];
                    str5.getClass();
                    switch (str5) {
                        case "Opus":
                            i20 = 1;
                            break;
                        case "fLaC":
                            i20 = 4;
                            break;
                        case "ipcm":
                            i20 = 8;
                            break;
                        case "mp4a":
                            i20 = 2;
                            break;
                        default:
                            a.m("CodecSpecificDataUtil", "Ignoring unknown codec identifier for IAMF auxiliary profile: " + strArrSplit[3]);
                            return null;
                    }
                    return new Pair(Integer.valueOf(i34 | 16777216 | i20), 0);
                } catch (NumberFormatException e10) {
                    a.n("CodecSpecificDataUtil", "Ignoring malformed primary profile in IAMF codec string: " + strArrSplit[1], e10);
                    return null;
                }
            case 8:
                if (strArrSplit.length != 3) {
                    x5.x("Ignoring malformed MP4A codec string: ", str3, "CodecSpecificDataUtil");
                    return null;
                }
                try {
                    if ("audio/mp4a-latm".equals(x0.e(Integer.parseInt(strArrSplit[1], 16)))) {
                        int i35 = Integer.parseInt(strArrSplit[2]);
                        int i36 = 17;
                        if (i35 != 17) {
                            i36 = 20;
                            if (i35 != 20) {
                                i36 = 23;
                                if (i35 != 23) {
                                    i36 = 29;
                                    if (i35 != 29) {
                                        i36 = 39;
                                        if (i35 != 39) {
                                            i36 = 42;
                                            if (i35 != 42) {
                                                switch (i35) {
                                                    case 1:
                                                        i36 = 1;
                                                        break;
                                                    case 2:
                                                        i36 = 2;
                                                        break;
                                                    case 3:
                                                        i36 = 3;
                                                        break;
                                                    case 4:
                                                        i36 = 4;
                                                        break;
                                                    case 5:
                                                        i36 = 5;
                                                        break;
                                                    case 6:
                                                        i36 = 6;
                                                        break;
                                                    default:
                                                        i36 = -1;
                                                        break;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (i36 != -1) {
                            return new Pair(Integer.valueOf(i36), 0);
                        }
                    }
                } catch (NumberFormatException unused4) {
                    x5.x("Ignoring malformed MP4A codec string: ", str3, "CodecSpecificDataUtil");
                }
                return null;
            case 9:
                Pair pair = new Pair(num3, num3);
                if (strArrSplit.length < 3) {
                    x5.x("Ignoring malformed H263 codec string: ", str3, "CodecSpecificDataUtil");
                    return pair;
                }
                try {
                    return new Pair(Integer.valueOf(Integer.parseInt(strArrSplit[1])), Integer.valueOf(Integer.parseInt(strArrSplit[2])));
                } catch (NumberFormatException unused5) {
                    x5.x("Ignoring malformed H263 codec string: ", str3, "CodecSpecificDataUtil");
                    return pair;
                }
            case 10:
                if (strArrSplit.length < 3) {
                    x5.x("Ignoring malformed VP9 codec string: ", str3, "CodecSpecificDataUtil");
                    return null;
                }
                try {
                    int i37 = Integer.parseInt(strArrSplit[1]);
                    int i38 = Integer.parseInt(strArrSplit[2]);
                    if (i37 == 0) {
                        i21 = 1;
                    } else if (i37 == 1) {
                        i21 = 2;
                    } else if (i37 != 2) {
                        i21 = i37 != 3 ? -1 : 8;
                    } else {
                        i21 = 4;
                    }
                    if (i21 == -1) {
                        a1.b.y("Unknown VP9 profile: ", i37, "CodecSpecificDataUtil");
                        return null;
                    }
                    if (i38 == 10) {
                        i22 = 1;
                    } else if (i38 == 11) {
                        i22 = 2;
                    } else if (i38 == 20) {
                        i22 = 4;
                    } else if (i38 == 21) {
                        i22 = 8;
                    } else if (i38 == 30) {
                        i22 = 16;
                    } else if (i38 == 31) {
                        i22 = 32;
                    } else if (i38 == 40) {
                        i22 = 64;
                    } else if (i38 == 41) {
                        i22 = 128;
                    } else if (i38 == 50) {
                        i22 = 256;
                    } else if (i38 != 51) {
                        switch (i38) {
                            case 60:
                                i22 = 2048;
                                break;
                            case 61:
                                i22 = 4096;
                                break;
                            case 62:
                                break;
                            default:
                                i22 = -1;
                                break;
                        }
                    } else {
                        i22 = 512;
                    }
                    if (i22 != -1) {
                        return new Pair(Integer.valueOf(i21), Integer.valueOf(i22));
                    }
                    a1.b.y("Unknown VP9 level: ", i38, "CodecSpecificDataUtil");
                    return null;
                } catch (NumberFormatException unused6) {
                    x5.x("Ignoring malformed VP9 codec string: ", str3, "CodecSpecificDataUtil");
                    return null;
                }
            default:
                return null;
        }
    }

    public static Pair c(String str, String[] strArr, androidx.media3.common.i iVar) {
        int i10;
        Integer numValueOf;
        if (strArr.length < 4) {
            x5.x("Ignoring malformed HEVC codec string: ", str, "CodecSpecificDataUtil");
            return null;
        }
        Matcher matcher = f5123c.matcher(strArr[1]);
        if (!matcher.matches()) {
            x5.x("Ignoring malformed HEVC codec string: ", str, "CodecSpecificDataUtil");
            return null;
        }
        String strGroup = matcher.group(1);
        if ("1".equals(strGroup)) {
            i10 = 1;
        } else if ("2".equals(strGroup)) {
            i10 = (iVar == null || iVar.f1245c != 6) ? 2 : 4096;
        } else {
            if (!"6".equals(strGroup)) {
                x5.x("Unknown HEVC profile string: ", strGroup, "CodecSpecificDataUtil");
                return null;
            }
            i10 = 6;
        }
        String str2 = strArr[3];
        if (str2 != null) {
            switch (str2) {
                case "H30":
                    numValueOf = 2;
                    break;
                case "H60":
                    numValueOf = 8;
                    break;
                case "H63":
                    numValueOf = 32;
                    break;
                case "H90":
                    numValueOf = Integer.valueOf(Cast.MAX_NAMESPACE_LENGTH);
                    break;
                case "H93":
                    numValueOf = 512;
                    break;
                case "L30":
                    numValueOf = 1;
                    break;
                case "L60":
                    numValueOf = 4;
                    break;
                case "L63":
                    numValueOf = 16;
                    break;
                case "L90":
                    numValueOf = 64;
                    break;
                case "L93":
                    numValueOf = 256;
                    break;
                case "H120":
                    numValueOf = 2048;
                    break;
                case "H123":
                    numValueOf = 8192;
                    break;
                case "H150":
                    numValueOf = 32768;
                    break;
                case "H153":
                    numValueOf = 131072;
                    break;
                case "H156":
                    numValueOf = 524288;
                    break;
                case "H180":
                    numValueOf = 2097152;
                    break;
                case "H183":
                    numValueOf = 8388608;
                    break;
                case "H186":
                    numValueOf = 33554432;
                    break;
                case "L120":
                    numValueOf = 1024;
                    break;
                case "L123":
                    numValueOf = 4096;
                    break;
                case "L150":
                    numValueOf = 16384;
                    break;
                case "L153":
                    numValueOf = Integer.valueOf(Cast.MAX_MESSAGE_LENGTH);
                    break;
                case "L156":
                    numValueOf = 262144;
                    break;
                case "L180":
                    numValueOf = 1048576;
                    break;
                case "L183":
                    numValueOf = 4194304;
                    break;
                case "L186":
                    numValueOf = 16777216;
                    break;
                default:
                    numValueOf = null;
                    break;
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return new Pair(Integer.valueOf(i10), numValueOf);
        }
        x5.x("Unknown HEVC level string: ", str2, "CodecSpecificDataUtil");
        return null;
    }
}

package p7;

import a10.h0;
import a8.n0;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import androidx.media3.common.t;
import androidx.media3.common.x0;
import e7.i0;
import fh.d2;
import fh.q0;
import fh.t0;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public final class k {

    public final String f12395a;

    public final String f12396b;

    public final String f12397c;

    public final MediaCodecInfo.CodecCapabilities f12398d;

    public final boolean f12399e;

    public final boolean f12400f;

    public final boolean f12401g;

    public final boolean f12402h;

    public final boolean f12403i;

    public int f12404j;

    public int f12405k;
    public float l;

    public k(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        str.getClass();
        this.f12395a = str;
        this.f12396b = str2;
        this.f12397c = str3;
        this.f12398d = codecCapabilities;
        this.f12401g = z10;
        this.f12399e = z13;
        this.f12400f = z14;
        this.f12402h = z15;
        this.f12403i = x0.m(str2);
        this.l = -3.4028235E38f;
        this.f12404j = -1;
        this.f12405k = -1;
    }

    public static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d3) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        Point point = new Point(i0.f(i10, widthAlignment) * widthAlignment, i0.f(i11, heightAlignment) * heightAlignment);
        int i12 = point.x;
        int i13 = point.y;
        if (d3 == -1.0d || d3 < 1.0d) {
            return videoCapabilities.isSizeSupported(i12, i13);
        }
        double dFloor = Math.floor(d3);
        if (!videoCapabilities.areSizeAndRateSupported(i12, i13, dFloor)) {
            return false;
        }
        Range<Double> achievableFrameRatesFor = videoCapabilities.getAchievableFrameRatesFor(i12, i13);
        return achievableFrameRatesFor == null || dFloor <= ((Double) achievableFrameRatesFor.getUpper()).doubleValue();
    }

    public static k i(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14;
        boolean z15 = codecCapabilities != null && codecCapabilities.isFeatureSupported("adaptive-playback");
        if (codecCapabilities != null) {
            codecCapabilities.isFeatureSupported("tunneled-playback");
        }
        boolean z16 = z13 || (codecCapabilities != null && codecCapabilities.isFeatureSupported("secure-playback"));
        if (Build.VERSION.SDK_INT < 35 || codecCapabilities == null || !codecCapabilities.isFeatureSupported("detached-surface")) {
            z14 = false;
        } else {
            String str4 = Build.MANUFACTURER;
            if (str4.equals("Xiaomi") || str4.equals("OPPO") || str4.equals("realme") || str4.equals("motorola") || str4.equals("LENOVO")) {
                z14 = false;
            } else {
                z14 = true;
            }
        }
        return new k(str, str2, str3, codecCapabilities, z10, z11, z12, z15, z16, z14);
    }

    public final i7.d b(t tVar, t tVar2) {
        t tVar3;
        t tVar4;
        int i10;
        String str = tVar.f1594n;
        androidx.media3.common.i iVar = tVar.D;
        String str2 = tVar2.f1594n;
        androidx.media3.common.i iVar2 = tVar2.D;
        int i11 = !Objects.equals(str, str2) ? 8 : 0;
        if (this.f12403i) {
            if (tVar.f1606z != tVar2.f1606z) {
                i11 |= 1024;
            }
            boolean z10 = (tVar.f1601u == tVar2.f1601u && tVar.f1602v == tVar2.f1602v) ? false : true;
            if (!this.f12399e && z10) {
                i11 |= 512;
            }
            if ((!androidx.media3.common.i.e(iVar) || !androidx.media3.common.i.e(iVar2)) && !Objects.equals(iVar, iVar2)) {
                i11 |= 2048;
            }
            if (Build.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.f12395a) && !tVar.b(tVar2)) {
                i11 |= 2;
            }
            int i12 = tVar.f1603w;
            if (i12 != -1 && (i10 = tVar.f1604x) != -1 && i12 == tVar2.f1603w && i10 == tVar2.f1604x && z10) {
                i11 |= 2;
            }
            if (i11 == 0 && Objects.equals(tVar2.f1594n, "video/dolby-vision")) {
                Pair pairB = e7.e.b(tVar);
                Pair pairB2 = e7.e.b(tVar2);
                if (pairB == null || pairB2 == null || !((Integer) pairB.first).equals(pairB2.first)) {
                    i11 |= 2;
                }
            }
            if (i11 == 0) {
                return new i7.d(this.f12395a, tVar, tVar2, tVar.b(tVar2) ? 3 : 2, 0);
            }
            tVar3 = tVar;
            tVar4 = tVar2;
        } else {
            tVar3 = tVar;
            tVar4 = tVar2;
            if (tVar3.F != tVar4.F) {
                i11 |= 4096;
            }
            if (tVar3.G != tVar4.G) {
                i11 |= 8192;
            }
            if (tVar3.H != tVar4.H) {
                i11 |= 16384;
            }
            String str3 = this.f12396b;
            if (i11 == 0 && (str3.equals("audio/mp4a-latm") || str3.equals("audio/ac4"))) {
                Pair pairB3 = e7.e.b(tVar3);
                Pair pairB4 = e7.e.b(tVar4);
                if (pairB3 != null && pairB4 != null) {
                    int iIntValue = ((Integer) pairB3.first).intValue();
                    int iIntValue2 = ((Integer) pairB4.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new i7.d(this.f12395a, tVar3, tVar4, 3, 0);
                    }
                    if (str3.equals("audio/ac4") && pairB3.equals(pairB4)) {
                        return new i7.d(this.f12395a, tVar3, tVar4, 3, 0);
                    }
                }
            }
            if (i11 == 0 && (str3.equals("audio/eac3-joc") || str3.equals("audio/eac3"))) {
                return new i7.d(this.f12395a, tVar3, tVar4, 3, 0);
            }
            if (!tVar3.b(tVar4)) {
                i11 |= 32;
            }
            if ("audio/opus".equals(str3)) {
                i11 |= 2;
            }
            if (i11 == 0) {
                return new i7.d(this.f12395a, tVar3, tVar4, 1, 0);
            }
        }
        return new i7.d(this.f12395a, tVar3, tVar4, 0, i11);
    }

    public final boolean c(t tVar, boolean z10) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.AudioCapabilities audioCapabilities;
        Pair pair;
        String strA;
        Pair pairB = e7.e.b(tVar);
        String str = tVar.f1594n;
        String str2 = this.f12397c;
        if (str != null && str.equals("video/mv-hevc")) {
            String strN = x0.n(str2);
            if (strN.equals("video/mv-hevc")) {
                return true;
            }
            if (strN.equals("video/hevc")) {
                HashMap map = p.f12445a;
                List list = tVar.f1597q;
                int i10 = 0;
                loop0: while (true) {
                    if (i10 >= list.size()) {
                        pair = null;
                        strA = null;
                        break;
                    }
                    byte[] bArr = (byte[]) list.get(i10);
                    int length = bArr.length;
                    if (length > 3) {
                        boolean[] zArr = new boolean[3];
                        q0 q0VarM = t0.m();
                        int i11 = 0;
                        while (i11 < bArr.length) {
                            int iB = f7.p.b(bArr, i11, bArr.length, zArr);
                            if (iB != bArr.length) {
                                q0VarM.c(Integer.valueOf(iB));
                            }
                            i11 = iB + 3;
                        }
                        d2 d2VarG = q0VarM.g();
                        for (int i12 = 0; i12 < d2VarG.D; i12++) {
                            if (((Integer) d2VarG.get(i12)).intValue() + 3 < length) {
                                n0 n0Var = new n0(bArr, ((Integer) d2VarG.get(i12)).intValue() + 3, length);
                                a8.d dVarF = f7.p.f(n0Var);
                                if (dVarF.f238a == 33 && dVarF.f239b == 0) {
                                    n0Var.t(4);
                                    int i13 = n0Var.i(3);
                                    n0Var.s();
                                    pair = null;
                                    f7.i iVarG = f7.p.g(n0Var, true, i13, null);
                                    strA = e7.e.a(iVarG.f5501a, iVarG.f5502b, iVarG.f5503c, iVarG.f5504d, iVarG.f5505e, iVarG.f5506f);
                                    break loop0;
                                }
                            }
                        }
                    }
                    i10++;
                }
                if (strA == null) {
                    pairB = pair;
                } else {
                    String strTrim = strA.trim();
                    String str3 = i0.f5136a;
                    pairB = e7.e.c(strA, strTrim.split("\\.", -1), tVar.D);
                }
            }
        }
        if (pairB == null) {
            return true;
        }
        int iIntValue = ((Integer) pairB.first).intValue();
        int iIntValue2 = ((Integer) pairB.second).intValue();
        boolean zEquals = "video/dolby-vision".equals(str);
        String str4 = this.f12396b;
        if (zEquals) {
            str4.getClass();
            switch (str4) {
                case "video/av01":
                case "video/hevc":
                    iIntValue = 2;
                    break;
                case "video/avc":
                    iIntValue = 8;
                    break;
            }
            iIntValue2 = 0;
        }
        if (!this.f12403i && !str4.equals("audio/ac4") && iIntValue != 42) {
            return true;
        }
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f12398d;
        if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
        }
        if (str4.equals("audio/ac4") && codecProfileLevelArr.length == 0) {
            int i14 = ((codecCapabilities == null || (audioCapabilities = codecCapabilities.getAudioCapabilities()) == null) ? 2 : audioCapabilities.getMaxInputChannelCount()) > 18 ? 16 : 8;
            HashMap map2 = p.f12445a;
            MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
            codecProfileLevel.profile = 257;
            codecProfileLevel.level = i14;
            MediaCodecInfo.CodecProfileLevel codecProfileLevel2 = new MediaCodecInfo.CodecProfileLevel();
            codecProfileLevel2.profile = 513;
            codecProfileLevel2.level = i14;
            MediaCodecInfo.CodecProfileLevel codecProfileLevel3 = new MediaCodecInfo.CodecProfileLevel();
            codecProfileLevel3.profile = 514;
            codecProfileLevel3.level = i14;
            MediaCodecInfo.CodecProfileLevel codecProfileLevel4 = new MediaCodecInfo.CodecProfileLevel();
            codecProfileLevel4.profile = 1026;
            codecProfileLevel4.level = i14;
            MediaCodecInfo.CodecProfileLevel codecProfileLevel5 = new MediaCodecInfo.CodecProfileLevel();
            codecProfileLevel5.profile = 1028;
            codecProfileLevel5.level = i14;
            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel, codecProfileLevel2, codecProfileLevel3, codecProfileLevel4, codecProfileLevel5};
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel6 : codecProfileLevelArr) {
            if (codecProfileLevel6.profile == iIntValue && (codecProfileLevel6.level >= iIntValue2 || !z10)) {
                if (!"video/hevc".equals(str4) || 2 != iIntValue) {
                    return true;
                }
                String str5 = Build.DEVICE;
                if (!"sailfish".equals(str5) && !"marlin".equals(str5)) {
                    return true;
                }
            }
        }
        h("codec.profileLevel, " + tVar.f1593k + ", " + str2);
        return false;
    }

    public final boolean d(t tVar) {
        return (Objects.equals(tVar.f1594n, "audio/flac") && tVar.H == 22 && Build.VERSION.SDK_INT < 34 && this.f12395a.equals("c2.android.flac.decoder")) ? false : true;
    }

    public final boolean e(t tVar) {
        int i10;
        int i11;
        String str = tVar.f1594n;
        String str2 = this.f12396b;
        if ((!str2.equals(str) && !str2.equals(p.a(tVar))) || !c(tVar, true) || !d(tVar)) {
            return false;
        }
        if (this.f12403i) {
            int i12 = tVar.f1601u;
            if (i12 > 0 && (i11 = tVar.f1602v) > 0) {
                return g(i12, i11, tVar.f1605y);
            }
        } else {
            int i13 = tVar.G;
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.f12398d;
            if (i13 != -1) {
                if (codecCapabilities == null) {
                    h("sampleRate.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities == null) {
                    h("sampleRate.aCaps");
                    return false;
                }
                if (!audioCapabilities.isSampleRateSupported(i13)) {
                    h("sampleRate.support, " + i13);
                    return false;
                }
            }
            int i14 = tVar.F;
            if (i14 != -1) {
                if (codecCapabilities == null) {
                    h("channelCount.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities2 == null) {
                    h("channelCount.aCaps");
                    return false;
                }
                int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                if (maxInputChannelCount <= 1 && maxInputChannelCount <= 0 && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2)) {
                    if ("audio/ac3".equals(str2)) {
                        i10 = 6;
                    } else {
                        i10 = "audio/eac3".equals(str2) ? 16 : 30;
                    }
                    e7.a.m("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + this.f12395a + ", [" + maxInputChannelCount + " to " + i10 + "]");
                    maxInputChannelCount = i10;
                }
                if (maxInputChannelCount < i14) {
                    h("channelCount.support, " + i14);
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean f(t tVar) {
        if (this.f12403i) {
            return this.f12399e;
        }
        Pair pairB = e7.e.b(tVar);
        return pairB != null && ((Integer) pairB.first).intValue() == 42;
    }

    public final boolean g(int i10, int i11, double d3) {
        List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints;
        char c10;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f12398d;
        if (codecCapabilities == null) {
            h("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            h("sizeAndRate.vCaps");
            return false;
        }
        int i12 = Build.VERSION.SDK_INT;
        Boolean bool = h0.e;
        if ((bool != null && bool.booleanValue()) || (supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints()) == null || supportedPerformancePoints.isEmpty()) {
            c10 = 0;
        } else {
            MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint = new MediaCodecInfo.VideoCapabilities.PerformancePoint(i10, i11, (int) d3);
            int i13 = 0;
            while (true) {
                if (i13 >= supportedPerformancePoints.size()) {
                    c10 = 1;
                    break;
                }
                if (supportedPerformancePoints.get(i13).covers(performancePoint)) {
                    c10 = 2;
                    break;
                }
                i13++;
            }
            if (c10 == 1 && h0.e == null) {
                int iV = i12 >= 35 ? 2 : a.a.v(false);
                int iV2 = a.a.v(true);
                boolean z10 = iV == 0 || (iV2 != 0 ? !(iV == 2 && iV2 == 2) : iV != 2);
                h0.e = Boolean.valueOf(z10);
                if (z10) {
                    c10 = 0;
                }
            }
        }
        if (c10 != 2) {
            if (c10 == 1) {
                StringBuilder sbP = oi.k.p(i10, i11, "sizeAndRate.cover, ", "x", "@");
                sbP.append(d3);
                h(sbP.toString());
                return false;
            }
            if (!a(videoCapabilities, i10, i11, d3)) {
                if (i10 < i11) {
                    String str = this.f12395a;
                    if ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(Build.DEVICE)) && a(videoCapabilities, i11, i10, d3)) {
                        StringBuilder sbP2 = oi.k.p(i10, i11, "sizeAndRate.rotated, ", "x", "@");
                        sbP2.append(d3);
                        StringBuilder sbS = a1.b.s("AssumedSupport [", sbP2.toString(), "] [", str, ", ");
                        sbS.append(this.f12396b);
                        sbS.append("] [");
                        sbS.append(i0.f5136a);
                        sbS.append("]");
                        e7.a.b("MediaCodecInfo", sbS.toString());
                        return true;
                    }
                }
                StringBuilder sbP3 = oi.k.p(i10, i11, "sizeAndRate.support, ", "x", "@");
                sbP3.append(d3);
                h(sbP3.toString());
                return false;
            }
        }
        return true;
    }

    public final void h(String str) {
        StringBuilder sbN = g4.c.n("NoSupport [", str, "] [");
        sbN.append(this.f12395a);
        sbN.append(", ");
        sbN.append(this.f12396b);
        sbN.append("] [");
        sbN.append(i0.f5136a);
        sbN.append("]");
        e7.a.b("MediaCodecInfo", sbN.toString());
    }

    public final String toString() {
        return this.f12395a;
    }
}

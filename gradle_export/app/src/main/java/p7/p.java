package p7;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.util.Pair;
import androidx.media3.common.t;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil$DecoderQueryException;
import fh.d2;
import fh.q0;
import fh.t0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import qd.j0;

public abstract class p {

    public static final HashMap f12445a = new HashMap();

    public static String a(t tVar) {
        Pair pairB;
        String str = tVar.f1594n;
        String str2 = tVar.f1594n;
        if ("audio/eac3-joc".equals(str)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(str2) && (pairB = e7.e.b(tVar)) != null) {
            int iIntValue = ((Integer) pairB.first).intValue();
            if (iIntValue == 16 || iIntValue == 256) {
                return "video/hevc";
            }
            if (iIntValue == 512) {
                return "video/avc";
            }
            if (iIntValue == 1024) {
                return "video/av01";
            }
        }
        if ("video/mv-hevc".equals(str2)) {
            return "video/hevc";
        }
        return null;
    }

    public static String b(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals("video/mv-hevc")) {
            if ("c2.qti.mvhevc.decoder".equals(str) || "c2.qti.mvhevc.decoder.secure".equals(str)) {
                return "video/x-mvhevc";
            }
            return null;
        }
        if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        if (str2.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    public static synchronized List c(String str, boolean z10, boolean z11) {
        try {
            n nVar = new n(str, z10, z11);
            HashMap map = f12445a;
            List list = (List) map.get(nVar);
            if (list != null) {
                return list;
            }
            ArrayList arrayListD = d(nVar, new j0(z10, z11, str.equals("video/mv-hevc")));
            if (z10) {
                arrayListD.isEmpty();
            }
            if ("audio/raw".equals(str)) {
                Collections.sort(arrayListD, new fg.d(new h(), 3));
            }
            t0 t0VarO = t0.o(arrayListD);
            map.put(nVar, t0VarO);
            return t0VarO;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static ArrayList d(n nVar, j0 j0Var) throws MediaCodecUtil$DecoderQueryException {
        int i10;
        String strB;
        String str;
        j0 j0Var2 = j0Var;
        int i11 = j0Var2.B;
        try {
            ArrayList arrayList = new ArrayList();
            String str2 = nVar.f12442a;
            boolean z10 = nVar.f12443b;
            if (((MediaCodecInfo[]) j0Var2.C) == null) {
                j0Var2.C = new MediaCodecList(i11).getCodecInfos();
            }
            int length = ((MediaCodecInfo[]) j0Var2.C).length;
            int i12 = 0;
            while (i12 < length) {
                if (((MediaCodecInfo[]) j0Var2.C) == null) {
                    j0Var2.C = new MediaCodecList(i11).getCodecInfos();
                }
                MediaCodecInfo mediaCodecInfo = ((MediaCodecInfo[]) j0Var2.C)[i12];
                if (mediaCodecInfo.isAlias()) {
                    i10 = i12;
                } else {
                    int i13 = i12;
                    String name = mediaCodecInfo.getName();
                    if (mediaCodecInfo.isEncoder() || (strB = b(mediaCodecInfo, name, str2)) == null) {
                        i10 = i13;
                    } else {
                        try {
                            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(strB);
                            boolean zIsFeatureSupported = capabilitiesForType.isFeatureSupported("tunneled-playback");
                            boolean zIsFeatureRequired = capabilitiesForType.isFeatureRequired("tunneled-playback");
                            boolean z11 = nVar.f12444c;
                            if ((z11 || !zIsFeatureRequired) && (!z11 || zIsFeatureSupported)) {
                                boolean zIsFeatureSupported2 = capabilitiesForType.isFeatureSupported("secure-playback");
                                boolean zIsFeatureRequired2 = capabilitiesForType.isFeatureRequired("secure-playback");
                                if ((z10 || !zIsFeatureRequired2) && (!z10 || zIsFeatureSupported2)) {
                                    str = strB;
                                    try {
                                        boolean zIsHardwareAccelerated = mediaCodecInfo.isHardwareAccelerated();
                                        boolean zIsSoftwareOnly = mediaCodecInfo.isSoftwareOnly();
                                        boolean zIsVendor = mediaCodecInfo.isVendor();
                                        if (z10 != zIsFeatureSupported2) {
                                            i10 = i13;
                                        } else {
                                            i10 = i13;
                                            arrayList.add(k.i(name, str2, str, capabilitiesForType, zIsHardwareAccelerated, zIsSoftwareOnly, zIsVendor, false));
                                        }
                                    } catch (Exception e3) {
                                        e = e3;
                                        e7.a.d("MediaCodecUtil", "Failed to query codec " + name + " (" + str + ")");
                                        throw e;
                                    }
                                } else {
                                    i10 = i13;
                                }
                            } else {
                                i10 = i13;
                            }
                        } catch (Exception e10) {
                            e = e10;
                            str = strB;
                        }
                    }
                }
                i12 = i10 + 1;
                j0Var2 = j0Var;
            }
            return arrayList;
        } catch (Exception e11) {
            throw new MediaCodecUtil$DecoderQueryException("Failed to query underlying media codecs", e11);
        }
    }

    public static d2 e(h hVar, t tVar, boolean z10, boolean z11) {
        List listB = hVar.b(tVar.f1594n, z10, z11);
        String strA = a(tVar);
        List listB2 = strA == null ? d2.E : hVar.b(strA, z10, z11);
        q0 q0VarM = t0.m();
        q0VarM.e(listB);
        q0VarM.e(listB2);
        return q0VarM.g();
    }
}

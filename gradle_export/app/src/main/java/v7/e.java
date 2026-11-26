package v7;

import android.media.AudioFormat;
import android.media.Spatializer;
import e7.i0;
import java.util.Objects;

public final class e implements eh.n {
    public final p A;
    public final j B;

    public e(p pVar, j jVar) {
        this.A = pVar;
        this.B = jVar;
    }

    @Override
    public final boolean apply(Object obj) {
        Boolean bool;
        c7.c cVar;
        Spatializer spatializer;
        Spatializer spatializer2;
        c7.c cVar2;
        androidx.media3.common.d dVar;
        int i10;
        int iN;
        AudioFormat.Builder channelMask;
        int i11;
        boolean zCanBeSpatialized;
        androidx.media3.common.t tVar = (androidx.media3.common.t) obj;
        p pVar = this.A;
        pVar.getClass();
        if (this.B.A0 && ((bool = pVar.f15519j) == null || !bool.booleanValue())) {
            int i12 = tVar.F;
            String str = tVar.f1594n;
            if (i12 != -1 && i12 > 2) {
                if (str == null) {
                    cVar = pVar.f15517h;
                    if (cVar != null && cVar.A) {
                        spatializer = (Spatializer) cVar.B;
                        spatializer.getClass();
                        if (spatializer.isAvailable()) {
                            spatializer2 = (Spatializer) pVar.f15517h.B;
                            spatializer2.getClass();
                            if (spatializer2.isEnabled()) {
                                cVar2 = pVar.f15517h;
                                dVar = pVar.f15518i;
                                cVar2.getClass();
                                i10 = tVar.F;
                                if (Objects.equals(str, "audio/eac3-joc")) {
                                    if (i10 == 16) {
                                        i10 = 12;
                                    }
                                } else if (Objects.equals(str, "audio/iamf")) {
                                    if (i10 == -1) {
                                        i10 = 6;
                                    }
                                } else if (Objects.equals(str, "audio/ac4") && (i10 == 18 || i10 == 21)) {
                                    i10 = 24;
                                }
                                iN = i0.n(i10);
                                if (iN == 0) {
                                    zCanBeSpatialized = false;
                                } else {
                                    channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(iN);
                                    i11 = tVar.G;
                                    if (i11 != -1) {
                                        channelMask.setSampleRate(i11);
                                    }
                                    Spatializer spatializer3 = (Spatializer) cVar2.B;
                                    spatializer3.getClass();
                                    zCanBeSpatialized = spatializer3.canBeSpatialized(dVar.b(), channelMask.build());
                                }
                                if (zCanBeSpatialized) {
                                }
                            }
                        }
                    }
                    return false;
                }
                switch (str) {
                    case "audio/eac3-joc":
                    case "audio/ac3":
                    case "audio/ac4":
                    case "audio/eac3":
                        c7.c cVar3 = pVar.f15517h;
                        if (cVar3 != null && cVar3.A) {
                        }
                    default:
                        cVar = pVar.f15517h;
                        if (cVar != null) {
                            spatializer = (Spatializer) cVar.B;
                            spatializer.getClass();
                            if (spatializer.isAvailable()) {
                                spatializer2 = (Spatializer) pVar.f15517h.B;
                                spatializer2.getClass();
                                if (spatializer2.isEnabled()) {
                                    cVar2 = pVar.f15517h;
                                    dVar = pVar.f15518i;
                                    cVar2.getClass();
                                    i10 = tVar.F;
                                    if (Objects.equals(str, "audio/eac3-joc")) {
                                        if (i10 == 16) {
                                            i10 = 12;
                                        }
                                    } else if (Objects.equals(str, "audio/iamf")) {
                                        if (i10 == -1) {
                                            i10 = 6;
                                        }
                                    } else if (Objects.equals(str, "audio/ac4")) {
                                        i10 = 24;
                                    }
                                    iN = i0.n(i10);
                                    if (iN == 0) {
                                        zCanBeSpatialized = false;
                                    } else {
                                        channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(iN);
                                        i11 = tVar.G;
                                        if (i11 != -1) {
                                            channelMask.setSampleRate(i11);
                                        }
                                        Spatializer spatializer4 = (Spatializer) cVar2.B;
                                        spatializer4.getClass();
                                        zCanBeSpatialized = spatializer4.canBeSpatialized(dVar.b(), channelMask.build());
                                    }
                                    if (zCanBeSpatialized) {
                                    }
                                }
                            }
                        }
                        return false;
                }
            }
        }
        return true;
    }
}

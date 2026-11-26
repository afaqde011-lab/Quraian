package androidx.media3.exoplayer.mediacodec;

import androidx.media3.common.t;
import com.google.protobuf.RuntimeVersion;
import p7.k;

public class MediaCodecRenderer$DecoderInitializationException extends Exception {
    public final String A;
    public final boolean B;
    public final k C;
    public final String D;

    public MediaCodecRenderer$DecoderInitializationException(t tVar, MediaCodecUtil$DecoderQueryException mediaCodecUtil$DecoderQueryException, boolean z10, int i10) {
        this("Decoder init failed: [" + i10 + "], " + tVar, mediaCodecUtil$DecoderQueryException, tVar.f1594n, z10, null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i10 < 0 ? "neg_" : RuntimeVersion.SUFFIX) + Math.abs(i10));
    }

    public MediaCodecRenderer$DecoderInitializationException(String str, Throwable th2, String str2, boolean z10, k kVar, String str3) {
        super(str, th2);
        this.A = str2;
        this.B = z10;
        this.C = kVar;
        this.D = str3;
    }
}

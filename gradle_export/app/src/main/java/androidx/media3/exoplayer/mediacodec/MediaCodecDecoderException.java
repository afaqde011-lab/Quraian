package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import androidx.media3.decoder.DecoderException;
import p7.k;

public class MediaCodecDecoderException extends DecoderException {
    public final int A;

    public MediaCodecDecoderException(IllegalStateException illegalStateException, k kVar) {
        StringBuilder sb2 = new StringBuilder("Decoder failed: ");
        sb2.append(kVar == null ? null : kVar.f12395a);
        super(sb2.toString(), illegalStateException);
        boolean z10 = illegalStateException instanceof MediaCodec.CodecException;
        if (z10) {
            ((MediaCodec.CodecException) illegalStateException).getDiagnosticInfo();
        }
        this.A = z10 ? ((MediaCodec.CodecException) illegalStateException).getErrorCode() : 0;
    }
}

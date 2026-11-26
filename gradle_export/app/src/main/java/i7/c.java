package i7;

import java.util.Locale;

public final class c {

    public int f7234a;

    public int f7235b;

    public int f7236c;

    public int f7237d;

    public int f7238e;

    public int f7239f;

    public int f7240g;

    public int f7241h;

    public int f7242i;

    public int f7243j;

    public long f7244k;
    public int l;

    public final String toString() {
        int i10 = this.f7234a;
        int i11 = this.f7235b;
        int i12 = this.f7236c;
        int i13 = this.f7237d;
        int i14 = this.f7238e;
        int i15 = this.f7239f;
        int i16 = this.f7240g;
        int i17 = this.f7241h;
        int i18 = this.f7242i;
        int i19 = this.f7243j;
        long j9 = this.f7244k;
        int i20 = this.l;
        String str = e7.i0.f5136a;
        Locale locale = Locale.US;
        StringBuilder sbP = oi.k.p(i10, i11, "DecoderCounters {\n decoderInits=", ",\n decoderReleases=", "\n queuedInputBuffers=");
        w.c.u(sbP, i12, "\n skippedInputBuffers=", i13, "\n renderedOutputBuffers=");
        w.c.u(sbP, i14, "\n skippedOutputBuffers=", i15, "\n droppedBuffers=");
        w.c.u(sbP, i16, "\n droppedInputBuffers=", i17, "\n maxConsecutiveDroppedBuffers=");
        w.c.u(sbP, i18, "\n droppedToKeyframeEvents=", i19, "\n totalVideoFrameProcessingOffsetUs=");
        sbP.append(j9);
        sbP.append("\n videoFrameProcessingOffsetCount=");
        sbP.append(i20);
        sbP.append("\n}");
        return sbP.toString();
    }
}

package u7;

import androidx.media3.decoder.DecoderException;
import androidx.media3.extractor.text.SubtitleDecoderException;
import h7.f;
import h7.h;
import java.nio.ByteBuffer;
import ta.c0;
import x8.k;

public final class b extends h implements x8.e {

    public final k f14987n;

    public b(k kVar) {
        super(new x8.h[2], new x8.c[2]);
        int i10 = this.f6624g;
        h7.e[] eVarArr = this.f6622e;
        c0.A(i10 == eVarArr.length);
        for (h7.e eVar : eVarArr) {
            eVar.s(1024);
        }
        this.f14987n = kVar;
    }

    @Override
    public final void b(long j9) {
    }

    @Override
    public final h7.e f() {
        return new x8.h(1);
    }

    @Override
    public final f g() {
        return new x8.c(this);
    }

    @Override
    public final DecoderException h(Throwable th2) {
        return new SubtitleDecoderException("Unexpected decode error", th2);
    }

    @Override
    public final DecoderException i(h7.e eVar, f fVar, boolean z10) {
        x8.h hVar = (x8.h) eVar;
        x8.c cVar = (x8.c) fVar;
        try {
            ByteBuffer byteBuffer = hVar.E;
            byteBuffer.getClass();
            byte[] bArrArray = byteBuffer.array();
            int iLimit = byteBuffer.limit();
            k kVar = this.f14987n;
            if (z10) {
                kVar.reset();
            }
            x8.d dVarM = kVar.m(0, iLimit, bArrArray);
            long j9 = hVar.G;
            long j10 = hVar.J;
            cVar.C = j9;
            cVar.E = dVarM;
            if (j10 != Long.MAX_VALUE) {
                j9 = j10;
            }
            cVar.F = j9;
            cVar.D = false;
            return null;
        } catch (SubtitleDecoderException e3) {
            return e3;
        }
    }
}

package o7;

import android.content.Context;
import android.graphics.Point;
import androidx.media3.common.ParserException;
import androidx.media3.common.t;
import androidx.media3.decoder.DecoderException;
import androidx.media3.exoplayer.image.ImageDecoderException;
import com.google.android.gms.internal.measurement.g4;
import e7.i0;
import h7.f;
import h7.h;
import java.io.IOException;
import java.nio.ByteBuffer;
import ta.c0;

public final class b extends h {

    public final Context f11667n;

    public final int f11668o;

    public b(Context context) {
        super(new h7.e[1], new a[1]);
        this.f11667n = context;
        this.f11668o = -1;
    }

    @Override
    public final h7.e f() {
        return new h7.e(1);
    }

    @Override
    public final f g() {
        return new a(this);
    }

    @Override
    public final DecoderException h(Throwable th2) {
        return new ImageDecoderException("Unexpected decode error", th2);
    }

    @Override
    public final DecoderException i(h7.e eVar, f fVar, boolean z10) {
        a aVar = (a) fVar;
        ByteBuffer byteBuffer = eVar.E;
        byteBuffer.getClass();
        c0.A(byteBuffer.hasArray());
        c0.s(byteBuffer.arrayOffset() == 0);
        try {
            int iMax = this.f11668o;
            if (iMax == -1) {
                Context context = this.f11667n;
                if (context != null) {
                    Point pointQ = i0.q(context);
                    int i10 = pointQ.x;
                    int i11 = pointQ.y;
                    t tVar = eVar.C;
                    if (tVar != null) {
                        int i12 = tVar.M;
                        if (i12 != -1) {
                            i10 *= i12;
                        }
                        int i13 = tVar.N;
                        if (i13 != -1) {
                            i11 *= i13;
                        }
                    }
                    iMax = (Math.max(i10, i11) * 2) - 1;
                } else {
                    iMax = 4096;
                }
            }
            aVar.E = g4.z(byteBuffer.remaining(), iMax, byteBuffer.array());
            aVar.C = eVar.G;
            return null;
        } catch (ParserException e3) {
            return new ImageDecoderException("Could not decode image data with BitmapFactory.", e3);
        } catch (IOException e10) {
            return new ImageDecoderException(e10);
        }
    }
}

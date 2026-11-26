package o7;

import android.graphics.Bitmap;
import android.os.Trace;
import androidx.media3.common.t;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.image.ImageDecoderException;
import androidx.media3.exoplayer.image.ImageOutput;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import dh.o;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import ta.c0;

public final class e extends i7.a {
    public final o S;
    public final h7.e T;
    public final ArrayDeque U;
    public boolean V;
    public boolean W;
    public d X;
    public long Y;
    public long Z;

    public int f11672a0;

    public int f11673b0;

    public t f11674c0;

    public b f11675d0;

    public h7.e f11676e0;

    public ImageOutput f11677f0;

    public Bitmap f11678g0;

    public boolean f11679h0;

    public com.google.crypto.tink.shaded.protobuf.d f11680i0;

    public com.google.crypto.tink.shaded.protobuf.d f11681j0;

    public int f11682k0;

    public boolean f11683l0;

    public e(o oVar) {
        super(4);
        this.S = oVar;
        this.f11677f0 = ImageOutput.f1700a;
        this.T = new h7.e(0);
        this.X = d.f11669c;
        this.U = new ArrayDeque();
        this.Z = -9223372036854775807L;
        this.Y = -9223372036854775807L;
        this.f11672a0 = 0;
        this.f11673b0 = 1;
    }

    @Override
    public final int B(t tVar) {
        this.S.getClass();
        return o.l(tVar);
    }

    public final boolean E(long j9) throws ExoPlaybackException {
        boolean z10;
        com.google.crypto.tink.shaded.protobuf.d dVar;
        Bitmap bitmap;
        long j10;
        boolean z11;
        int i10;
        boolean z12;
        int i11;
        int i12;
        t tVar;
        Bitmap bitmapCreateBitmap;
        Bitmap bitmap2 = this.f11678g0;
        if ((bitmap2 == null || this.f11680i0 != null) && (this.f11673b0 != 0 || this.H == 2)) {
            ArrayDeque arrayDeque = this.U;
            if (bitmap2 == null) {
                this.f11675d0.getClass();
                a aVar = (a) this.f11675d0.d();
                if (aVar != null) {
                    if (!aVar.c(4)) {
                        c0.w(aVar.E, "Non-EOS buffer came back from the decoder without bitmap.");
                        this.f11678g0 = aVar.E;
                        aVar.r();
                        if (this.f11679h0 && this.f11678g0 != null && this.f11680i0 != null) {
                            this.f11674c0.getClass();
                            t tVar2 = this.f11674c0;
                            int i13 = tVar2.M;
                            int i14 = tVar2.N;
                            z10 = ((i13 != 1 && i14 == 1) || i13 == -1 || i14 == -1) ? false : true;
                            dVar = this.f11680i0;
                            if (((Bitmap) dVar.f4254c) == null) {
                                if (z10) {
                                    int i15 = dVar.f4252a;
                                    this.f11678g0.getClass();
                                    int width = this.f11678g0.getWidth();
                                    t tVar3 = this.f11674c0;
                                    tVar3.getClass();
                                    int i16 = width / tVar3.M;
                                    int height = this.f11678g0.getHeight();
                                    t tVar4 = this.f11674c0;
                                    tVar4.getClass();
                                    int i17 = height / tVar4.N;
                                    int i18 = this.f11674c0.M;
                                    bitmapCreateBitmap = Bitmap.createBitmap(this.f11678g0, (i15 % i18) * i16, (i15 / i18) * i17, i16, i17);
                                } else {
                                    bitmapCreateBitmap = this.f11678g0;
                                    bitmapCreateBitmap.getClass();
                                }
                                dVar.f4254c = bitmapCreateBitmap;
                            }
                            bitmap = (Bitmap) this.f11680i0.f4254c;
                            bitmap.getClass();
                            j10 = this.f11680i0.f4253b;
                            long j11 = j10 - j9;
                            if (this.H == 2) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            i10 = this.f11673b0;
                            if (i10 != 0) {
                                if (i10 != 1) {
                                    z11 = true;
                                } else {
                                    if (i10 == 3) {
                                        throw new IllegalStateException();
                                    }
                                    z11 = false;
                                }
                            }
                            if (!z11 || j11 < NotificationOptions.SKIP_STEP_THIRTY_SECONDS_IN_MS) {
                                this.f11677f0.onImageAvailable(j10 - this.X.f11671b, bitmap);
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (z12) {
                                com.google.crypto.tink.shaded.protobuf.d dVar2 = this.f11680i0;
                                dVar2.getClass();
                                long j12 = dVar2.f4253b;
                                this.Y = j12;
                                while (!arrayDeque.isEmpty() && j12 >= ((d) arrayDeque.peek()).f11670a) {
                                    this.X = (d) arrayDeque.removeFirst();
                                }
                                this.f11673b0 = 3;
                                if (z10) {
                                    com.google.crypto.tink.shaded.protobuf.d dVar3 = this.f11680i0;
                                    dVar3.getClass();
                                    i11 = dVar3.f4252a;
                                    t tVar5 = this.f11674c0;
                                    tVar5.getClass();
                                    i12 = tVar5.N;
                                    tVar = this.f11674c0;
                                    tVar.getClass();
                                    if (i11 == (i12 * tVar.M) - 1) {
                                        this.f11678g0 = null;
                                    }
                                } else {
                                    this.f11678g0 = null;
                                }
                                this.f11680i0 = this.f11681j0;
                                this.f11681j0 = null;
                                return true;
                            }
                        }
                    } else {
                        if (this.f11672a0 == 3) {
                            H();
                            this.f11674c0.getClass();
                            G();
                            return false;
                        }
                        aVar.r();
                        if (arrayDeque.isEmpty()) {
                            this.W = true;
                            return false;
                        }
                    }
                }
            } else if (this.f11679h0) {
                this.f11674c0.getClass();
                t tVar6 = this.f11674c0;
                int i19 = tVar6.M;
                int i110 = tVar6.N;
                if (i19 != 1) {
                }
                dVar = this.f11680i0;
                if (((Bitmap) dVar.f4254c) == null) {
                    if (z10) {
                        int i111 = dVar.f4252a;
                        this.f11678g0.getClass();
                        int width2 = this.f11678g0.getWidth();
                        t tVar7 = this.f11674c0;
                        tVar7.getClass();
                        int i112 = width2 / tVar7.M;
                        int height2 = this.f11678g0.getHeight();
                        t tVar8 = this.f11674c0;
                        tVar8.getClass();
                        int i113 = height2 / tVar8.N;
                        int i114 = this.f11674c0.M;
                        bitmapCreateBitmap = Bitmap.createBitmap(this.f11678g0, (i111 % i114) * i112, (i111 / i114) * i113, i112, i113);
                    } else {
                        bitmapCreateBitmap = this.f11678g0;
                        bitmapCreateBitmap.getClass();
                    }
                    dVar.f4254c = bitmapCreateBitmap;
                }
                bitmap = (Bitmap) this.f11680i0.f4254c;
                bitmap.getClass();
                j10 = this.f11680i0.f4253b;
                long j13 = j10 - j9;
                if (this.H == 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                i10 = this.f11673b0;
                if (i10 != 0) {
                    if (i10 != 1) {
                        z11 = true;
                    } else {
                        if (i10 == 3) {
                            throw new IllegalStateException();
                        }
                        z11 = false;
                    }
                }
                if (z11) {
                    this.f11677f0.onImageAvailable(j10 - this.X.f11671b, bitmap);
                    z12 = true;
                } else {
                    this.f11677f0.onImageAvailable(j10 - this.X.f11671b, bitmap);
                    z12 = true;
                }
                if (z12) {
                    com.google.crypto.tink.shaded.protobuf.d dVar4 = this.f11680i0;
                    dVar4.getClass();
                    long j14 = dVar4.f4253b;
                    this.Y = j14;
                    while (!arrayDeque.isEmpty()) {
                        this.X = (d) arrayDeque.removeFirst();
                    }
                    this.f11673b0 = 3;
                    if (z10) {
                        com.google.crypto.tink.shaded.protobuf.d dVar5 = this.f11680i0;
                        dVar5.getClass();
                        i11 = dVar5.f4252a;
                        t tVar9 = this.f11674c0;
                        tVar9.getClass();
                        i12 = tVar9.N;
                        tVar = this.f11674c0;
                        tVar.getClass();
                        if (i11 == (i12 * tVar.M) - 1) {
                            this.f11678g0 = null;
                        }
                    } else {
                        this.f11678g0 = null;
                    }
                    this.f11680i0 = this.f11681j0;
                    this.f11681j0 = null;
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean F(long j9) {
        int iW;
        ByteBuffer byteBuffer;
        h7.e eVar;
        boolean z10;
        h7.e eVar2;
        long j10;
        boolean z11;
        com.google.crypto.tink.shaded.protobuf.d dVar;
        boolean z12;
        t tVar;
        boolean z13;
        boolean z14;
        t tVar2;
        int i10;
        h7.e eVar3;
        if (!this.f11679h0 || this.f11680i0 == null) {
            h7.b bVar = this.C;
            bVar.m();
            b bVar2 = this.f11675d0;
            if (bVar2 != null && this.f11672a0 != 3 && !this.V) {
                if (this.f11676e0 == null) {
                    h7.e eVar4 = (h7.e) bVar2.e();
                    this.f11676e0 = eVar4;
                    if (eVar4 != null) {
                        if (this.f11672a0 == 2) {
                            this.f11676e0.getClass();
                            this.f11676e0.B = 4;
                            b bVar3 = this.f11675d0;
                            bVar3.getClass();
                            bVar3.c(this.f11676e0);
                            this.f11676e0 = null;
                            this.f11672a0 = 3;
                            return false;
                        }
                        iW = w(bVar, this.f11676e0, 0);
                        if (iW != -5) {
                            t tVar3 = (t) bVar.B;
                            tVar3.getClass();
                            this.f11674c0 = tVar3;
                            this.f11683l0 = true;
                            this.f11672a0 = 2;
                            return true;
                        }
                        if (iW != -4) {
                            this.f11676e0.t();
                            byteBuffer = this.f11676e0.E;
                            if (byteBuffer != null || byteBuffer.remaining() <= 0) {
                                eVar = this.f11676e0;
                                eVar.getClass();
                                if (eVar.c(4)) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                            } else {
                                z10 = true;
                            }
                            if (z10) {
                                h7.e eVar5 = this.f11676e0;
                                eVar5.getClass();
                                eVar5.C = this.f11674c0;
                                b bVar4 = this.f11675d0;
                                bVar4.getClass();
                                h7.e eVar6 = this.f11676e0;
                                eVar6.getClass();
                                bVar4.c(eVar6);
                                this.f11682k0 = 0;
                            }
                            eVar2 = this.f11676e0;
                            eVar2.getClass();
                            if (eVar2.c(4)) {
                                this.f11679h0 = true;
                            } else {
                                int i11 = this.f11682k0;
                                j10 = eVar2.G;
                                com.google.crypto.tink.shaded.protobuf.d dVar2 = new com.google.crypto.tink.shaded.protobuf.d();
                                dVar2.f4252a = i11;
                                dVar2.f4253b = j10;
                                this.f11681j0 = dVar2;
                                this.f11682k0 = i11 + 1;
                                if (this.f11679h0) {
                                    this.f11680i0 = this.f11681j0;
                                    this.f11681j0 = null;
                                } else {
                                    if (j10 - NotificationOptions.SKIP_STEP_THIRTY_SECONDS_IN_MS <= j9 || j9 > NotificationOptions.SKIP_STEP_THIRTY_SECONDS_IN_MS + j10) {
                                        z11 = false;
                                    } else {
                                        z11 = true;
                                    }
                                    dVar = this.f11680i0;
                                    if (dVar != null || dVar.f4253b > j9 || j9 >= j10) {
                                        z12 = false;
                                    } else {
                                        z12 = true;
                                    }
                                    tVar = this.f11674c0;
                                    tVar.getClass();
                                    if (tVar.M != -1 || (i10 = (tVar2 = this.f11674c0).N) == -1 || i11 == (i10 * tVar2.M) - 1) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    if (!z11 || z12 || z13) {
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                    this.f11679h0 = z14;
                                    if (z12 || z11) {
                                        this.f11680i0 = this.f11681j0;
                                        this.f11681j0 = null;
                                    }
                                }
                            }
                            eVar3 = this.f11676e0;
                            eVar3.getClass();
                            if (eVar3.c(4)) {
                                this.V = true;
                                this.f11676e0 = null;
                                return false;
                            }
                            long j11 = this.Z;
                            h7.e eVar7 = this.f11676e0;
                            eVar7.getClass();
                            this.Z = Math.max(j11, eVar7.G);
                            if (z10) {
                                this.f11676e0 = null;
                            } else {
                                h7.e eVar8 = this.f11676e0;
                                eVar8.getClass();
                                eVar8.q();
                            }
                            return !this.f11679h0;
                        }
                        if (iW != -3) {
                            throw new IllegalStateException();
                        }
                    }
                } else {
                    if (this.f11672a0 == 2) {
                        this.f11676e0.getClass();
                        this.f11676e0.B = 4;
                        b bVar5 = this.f11675d0;
                        bVar5.getClass();
                        bVar5.c(this.f11676e0);
                        this.f11676e0 = null;
                        this.f11672a0 = 3;
                        return false;
                    }
                    iW = w(bVar, this.f11676e0, 0);
                    if (iW != -5) {
                        t tVar4 = (t) bVar.B;
                        tVar4.getClass();
                        this.f11674c0 = tVar4;
                        this.f11683l0 = true;
                        this.f11672a0 = 2;
                        return true;
                    }
                    if (iW != -4) {
                        this.f11676e0.t();
                        byteBuffer = this.f11676e0.E;
                        if (byteBuffer != null) {
                            eVar = this.f11676e0;
                            eVar.getClass();
                            if (eVar.c(4)) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                        } else {
                            eVar = this.f11676e0;
                            eVar.getClass();
                            if (eVar.c(4)) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                        }
                        if (z10) {
                            h7.e eVar9 = this.f11676e0;
                            eVar9.getClass();
                            eVar9.C = this.f11674c0;
                            b bVar6 = this.f11675d0;
                            bVar6.getClass();
                            h7.e eVar10 = this.f11676e0;
                            eVar10.getClass();
                            bVar6.c(eVar10);
                            this.f11682k0 = 0;
                        }
                        eVar2 = this.f11676e0;
                        eVar2.getClass();
                        if (eVar2.c(4)) {
                            this.f11679h0 = true;
                        } else {
                            int i12 = this.f11682k0;
                            j10 = eVar2.G;
                            com.google.crypto.tink.shaded.protobuf.d dVar3 = new com.google.crypto.tink.shaded.protobuf.d();
                            dVar3.f4252a = i12;
                            dVar3.f4253b = j10;
                            this.f11681j0 = dVar3;
                            this.f11682k0 = i12 + 1;
                            if (this.f11679h0) {
                                this.f11680i0 = this.f11681j0;
                                this.f11681j0 = null;
                            } else {
                                if (j10 - NotificationOptions.SKIP_STEP_THIRTY_SECONDS_IN_MS <= j9) {
                                    z11 = false;
                                } else {
                                    z11 = false;
                                }
                                dVar = this.f11680i0;
                                if (dVar != null) {
                                    z12 = false;
                                } else {
                                    z12 = false;
                                }
                                tVar = this.f11674c0;
                                tVar.getClass();
                                if (tVar.M != -1) {
                                    z13 = true;
                                } else {
                                    z13 = true;
                                }
                                if (z11) {
                                    z14 = true;
                                } else {
                                    z14 = true;
                                }
                                this.f11679h0 = z14;
                                if (z12) {
                                    this.f11680i0 = this.f11681j0;
                                    this.f11681j0 = null;
                                } else {
                                    this.f11680i0 = this.f11681j0;
                                    this.f11681j0 = null;
                                }
                            }
                        }
                        eVar3 = this.f11676e0;
                        eVar3.getClass();
                        if (eVar3.c(4)) {
                            this.V = true;
                            this.f11676e0 = null;
                            return false;
                        }
                        long j12 = this.Z;
                        h7.e eVar11 = this.f11676e0;
                        eVar11.getClass();
                        this.Z = Math.max(j12, eVar11.G);
                        if (z10) {
                            this.f11676e0 = null;
                        } else {
                            h7.e eVar12 = this.f11676e0;
                            eVar12.getClass();
                            eVar12.q();
                        }
                        return !this.f11679h0;
                    }
                    if (iW != -3) {
                        throw new IllegalStateException();
                    }
                }
            }
        }
        return false;
    }

    public final void G() throws ExoPlaybackException {
        if (this.f11683l0) {
            t tVar = this.f11674c0;
            tVar.getClass();
            o oVar = this.S;
            oVar.getClass();
            int iL = o.l(tVar);
            if (iL != i7.a.c(4, 0, 0, 0) && iL != i7.a.c(3, 0, 0, 0)) {
                throw d(new ImageDecoderException("Provided decoder factory can't create decoder for format."), this.f11674c0, false, 4005);
            }
            b bVar = this.f11675d0;
            if (bVar != null) {
                bVar.release();
            }
            this.f11675d0 = new b(oVar.A);
            this.f11683l0 = false;
        }
    }

    public final void H() {
        this.f11676e0 = null;
        this.f11672a0 = 0;
        this.Z = -9223372036854775807L;
        b bVar = this.f11675d0;
        if (bVar != null) {
            bVar.release();
            this.f11675d0 = null;
        }
    }

    @Override
    public final void e(int i10, Object obj) {
        if (i10 != 15) {
            return;
        }
        ImageOutput imageOutput = obj instanceof ImageOutput ? (ImageOutput) obj : null;
        if (imageOutput == null) {
            imageOutput = ImageOutput.f1700a;
        }
        this.f11677f0 = imageOutput;
    }

    @Override
    public final String i() {
        return "ImageRenderer";
    }

    @Override
    public final boolean k() {
        return this.W;
    }

    @Override
    public final boolean m() {
        int i10 = this.f11673b0;
        if (i10 != 3) {
            return i10 == 0 && this.f11679h0;
        }
        return true;
    }

    @Override
    public final void n() {
        this.f11674c0 = null;
        this.X = d.f11669c;
        this.U.clear();
        H();
        this.f11677f0.a();
    }

    @Override
    public final void o(boolean z10, boolean z11) {
        this.f11673b0 = z11 ? 1 : 0;
    }

    @Override
    public final void p(long j9, boolean z10, boolean z11) {
        this.f11673b0 = Math.min(this.f11673b0, 1);
        this.W = false;
        this.V = false;
        this.f11678g0 = null;
        this.f11680i0 = null;
        this.f11681j0 = null;
        this.f11679h0 = false;
        this.f11676e0 = null;
        b bVar = this.f11675d0;
        if (bVar != null) {
            bVar.flush();
        }
        this.U.clear();
    }

    @Override
    public final void q() {
        H();
    }

    @Override
    public final void r() {
        H();
        this.f11673b0 = Math.min(this.f11673b0, 1);
    }

    @Override
    public final void u(androidx.media3.common.t[] r5, long r6, long r8, s7.a0 r10) {
        throw new UnsupportedOperationException("Method not decompiled: o7.e.u(androidx.media3.common.t[], long, long, s7.a0):void");
    }

    @Override
    public final void x(long j9, long j10) throws ExoPlaybackException {
        if (this.W) {
            return;
        }
        if (this.f11674c0 == null) {
            h7.b bVar = this.C;
            bVar.m();
            h7.e eVar = this.T;
            eVar.q();
            int iW = w(bVar, eVar, 2);
            if (iW != -5) {
                if (iW == -4) {
                    c0.A(eVar.c(4));
                    this.V = true;
                    this.W = true;
                    return;
                }
                return;
            }
            t tVar = (t) bVar.B;
            tVar.getClass();
            this.f11674c0 = tVar;
            this.f11683l0 = true;
        }
        if (this.f11675d0 == null) {
            G();
        }
        try {
            Trace.beginSection("drainAndFeedDecoder");
            while (E(j9)) {
            }
            while (F(j9)) {
            }
            Trace.endSection();
        } catch (ImageDecoderException e3) {
            throw d(e3, null, false, 4003);
        }
    }
}

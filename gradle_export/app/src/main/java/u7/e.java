package u7;

import ab.r;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import androidx.media3.common.t;
import androidx.media3.common.x0;
import androidx.media3.extractor.text.SubtitleDecoderException;
import e7.i0;
import fh.d2;
import fh.q0;
import fh.t0;
import i7.v;
import i7.z;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Objects;
import o9.q;
import s7.a0;
import s7.a1;
import ta.c0;
import tf.w;
import tf.x;
import x8.h;
import x8.k;
import y8.f;

public final class e extends i7.a implements Handler.Callback {
    public final x S;
    public final h7.e T;
    public a U;
    public final d V;
    public boolean W;
    public int X;
    public x8.e Y;
    public h Z;

    public x8.c f14989a0;

    public x8.c f14990b0;

    public int f14991c0;

    public final Handler f14992d0;

    public final v f14993e0;

    public final h7.b f14994f0;

    public boolean f14995g0;

    public boolean f14996h0;

    public t f14997i0;

    public long f14998j0;

    public long f14999k0;

    public e(v vVar, Looper looper) {
        Handler handler;
        super(3);
        o10.b bVar = d.f14988x;
        this.f14993e0 = vVar;
        if (looper == null) {
            handler = null;
        } else {
            String str = i0.f5136a;
            handler = new Handler(looper, this);
        }
        this.f14992d0 = handler;
        this.V = bVar;
        this.S = new x(19);
        this.T = new h7.e(1);
        this.f14994f0 = new h7.b();
        this.f14999k0 = -9223372036854775807L;
        this.f14998j0 = -9223372036854775807L;
    }

    @Override
    public final int B(t tVar) {
        boolean zEquals = Objects.equals(tVar.f1594n, "application/x-media3-cues");
        String str = tVar.f1594n;
        if (!zEquals) {
            o10.b bVar = this.V;
            bVar.getClass();
            if (!((w) bVar.B).m(tVar) && !Objects.equals(str, "application/cea-608") && !Objects.equals(str, "application/x-mp4-cea-608") && !Objects.equals(str, "application/cea-708")) {
                return x0.l(str) ? i7.a.c(1, 0, 0, 0) : i7.a.c(0, 0, 0, 0);
            }
        }
        return i7.a.c(tVar.O == 0 ? 4 : 2, 0, 0, 0);
    }

    public final void E() {
        boolean z10 = Objects.equals(this.f14997i0.f1594n, "application/cea-608") || Objects.equals(this.f14997i0.f1594n, "application/x-mp4-cea-608") || Objects.equals(this.f14997i0.f1594n, "application/cea-708");
        String str = this.f14997i0.f1594n;
        if (!z10) {
            throw new IllegalStateException(ze.d.H("Legacy decoding is disabled, can't handle %s samples (expected %s).", str, "application/x-media3-cues"));
        }
    }

    public final long F() {
        if (this.f14991c0 == -1) {
            return Long.MAX_VALUE;
        }
        this.f14989a0.getClass();
        if (this.f14991c0 >= this.f14989a0.i()) {
            return Long.MAX_VALUE;
        }
        return this.f14989a0.e(this.f14991c0);
    }

    public final long G(long j9) {
        c0.A(j9 != -9223372036854775807L);
        return j9 - this.K;
    }

    public final void H() {
        x8.e bVar;
        byte b7 = 1;
        this.W = true;
        t tVar = this.f14997i0;
        tVar.getClass();
        w wVar = (w) this.V.B;
        String str = tVar.f1594n;
        int i10 = tVar.K;
        if (str != null) {
            switch (str.hashCode()) {
                case 930165504:
                    b7 = !str.equals("application/x-mp4-cea-608") ? (byte) -1 : (byte) 0;
                    break;
                case 1566015601:
                    if (!str.equals("application/cea-608")) {
                        b7 = -1;
                    }
                    break;
                case 1566016562:
                    b7 = !str.equals("application/cea-708") ? (byte) -1 : (byte) 2;
                    break;
                default:
                    b7 = -1;
                    break;
            }
            switch (b7) {
                case 0:
                case 1:
                    bVar = new y8.c(str, i10);
                    break;
                case 2:
                    bVar = new f(i10, tVar.f1597q);
                    break;
                default:
                    if (wVar.m(tVar)) {
                        throw new IllegalArgumentException(a1.b.o("Attempted to create decoder for unsupported MIME type: ", str));
                    }
                    k kVarK = wVar.k(tVar);
                    kVarK.getClass().getSimpleName().concat("Decoder");
                    bVar = new b(kVarK);
                    break;
                    break;
            }
        } else {
            if (wVar.m(tVar)) {
                throw new IllegalArgumentException(a1.b.o("Attempted to create decoder for unsupported MIME type: ", str));
            }
            k kVarK2 = wVar.k(tVar);
            kVarK2.getClass().getSimpleName().concat("Decoder");
            bVar = new b(kVarK2);
        }
        this.Y = bVar;
        bVar.a(this.L);
    }

    public final void I(d7.c cVar) {
        d2 d2Var = cVar.f4767a;
        v vVar = this.f14993e0;
        vVar.A.m.f(27, new i7.t(0, d2Var));
        z zVar = vVar.A;
        zVar.f7482h0 = cVar;
        zVar.m.f(27, new r(cVar, 24));
    }

    public final void J() {
        this.Z = null;
        this.f14991c0 = -1;
        x8.c cVar = this.f14989a0;
        if (cVar != null) {
            cVar.r();
            this.f14989a0 = null;
        }
        x8.c cVar2 = this.f14990b0;
        if (cVar2 != null) {
            cVar2.r();
            this.f14990b0 = null;
        }
    }

    @Override
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        I((d7.c) message.obj);
        return true;
    }

    @Override
    public final String i() {
        return "TextRenderer";
    }

    @Override
    public final boolean k() {
        return this.f14996h0;
    }

    @Override
    public final boolean m() {
        t tVar = this.f14997i0;
        if (tVar != null) {
            if (Objects.equals(tVar.f1594n, "application/x-media3-cues")) {
                a aVar = this.U;
                aVar.getClass();
                if (aVar.f(this.f14998j0) == Long.MIN_VALUE) {
                    try {
                        a1 a1Var = this.I;
                        a1Var.getClass();
                        a1Var.a();
                        return true;
                    } catch (IOException unused) {
                        return false;
                    }
                }
            } else {
                if (this.f14996h0) {
                    return false;
                }
                if (this.f14995g0) {
                    x8.c cVar = this.f14989a0;
                    long j9 = this.f14998j0;
                    if (cVar == null || cVar.i() <= 0 || cVar.e(cVar.i() - 1) <= j9) {
                        x8.c cVar2 = this.f14990b0;
                        long j10 = this.f14998j0;
                        if ((cVar2 == null || cVar2.i() <= 0 || cVar2.e(cVar2.i() - 1) <= j10) && this.Z != null) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    @Override
    public final void n() {
        this.f14997i0 = null;
        this.f14999k0 = -9223372036854775807L;
        d7.c cVar = new d7.c(G(this.f14998j0), d2.E);
        Handler handler = this.f14992d0;
        if (handler != null) {
            handler.obtainMessage(1, cVar).sendToTarget();
        } else {
            I(cVar);
        }
        this.f14998j0 = -9223372036854775807L;
        if (this.Y != null) {
            J();
            x8.e eVar = this.Y;
            eVar.getClass();
            eVar.release();
            this.Y = null;
            this.X = 0;
        }
    }

    @Override
    public final void p(long j9, boolean z10, boolean z11) {
        this.f14998j0 = j9;
        a aVar = this.U;
        if (aVar != null) {
            aVar.clear();
        }
        d7.c cVar = new d7.c(G(this.f14998j0), d2.E);
        Handler handler = this.f14992d0;
        if (handler != null) {
            handler.obtainMessage(1, cVar).sendToTarget();
        } else {
            I(cVar);
        }
        this.f14995g0 = false;
        this.f14996h0 = false;
        this.f14999k0 = -9223372036854775807L;
        t tVar = this.f14997i0;
        if (tVar == null || Objects.equals(tVar.f1594n, "application/x-media3-cues")) {
            return;
        }
        if (this.X == 0) {
            J();
            x8.e eVar = this.Y;
            eVar.getClass();
            eVar.flush();
            eVar.a(this.L);
            return;
        }
        J();
        x8.e eVar2 = this.Y;
        eVar2.getClass();
        eVar2.release();
        this.Y = null;
        this.X = 0;
        H();
    }

    @Override
    public final void u(t[] tVarArr, long j9, long j10, a0 a0Var) {
        t tVar = tVarArr[0];
        this.f14997i0 = tVar;
        if (Objects.equals(tVar.f1594n, "application/x-media3-cues")) {
            this.U = this.f14997i0.L == 1 ? new c() : new q(23);
            return;
        }
        E();
        if (this.Y != null) {
            this.X = 1;
        } else {
            H();
        }
    }

    @Override
    public final void x(long j9, long j10) {
        boolean z10;
        h7.b bVar;
        boolean z11;
        long jE;
        if (this.N) {
            long j11 = this.f14999k0;
            if (j11 != -9223372036854775807L && j9 >= j11) {
                J();
                this.f14996h0 = true;
            }
        }
        if (this.f14996h0) {
            return;
        }
        t tVar = this.f14997i0;
        tVar.getClass();
        boolean zEquals = Objects.equals(tVar.f1594n, "application/x-media3-cues");
        Handler handler = this.f14992d0;
        h7.b bVar2 = this.f14994f0;
        boolean zW = false;
        zW = false;
        zW = false;
        if (zEquals) {
            this.U.getClass();
            if (!this.f14995g0) {
                h7.e eVar = this.T;
                if (w(bVar2, eVar, 0) == -4) {
                    if (eVar.c(4)) {
                        this.f14995g0 = true;
                    } else {
                        eVar.t();
                        ByteBuffer byteBuffer = eVar.E;
                        byteBuffer.getClass();
                        long j12 = eVar.G;
                        byte[] bArrArray = byteBuffer.array();
                        int iArrayOffset = byteBuffer.arrayOffset();
                        int iLimit = byteBuffer.limit();
                        this.S.getClass();
                        Parcel parcelObtain = Parcel.obtain();
                        parcelObtain.unmarshall(bArrArray, iArrayOffset, iLimit);
                        parcelObtain.setDataPosition(0);
                        Bundle bundle = parcelObtain.readBundle(Bundle.class.getClassLoader());
                        parcelObtain.recycle();
                        ArrayList parcelableArrayList = bundle.getParcelableArrayList("c");
                        parcelableArrayList.getClass();
                        q0 q0VarM = t0.m();
                        for (int i10 = 0; i10 < parcelableArrayList.size(); i10++) {
                            Bundle bundle2 = (Bundle) parcelableArrayList.get(i10);
                            bundle2.getClass();
                            q0VarM.c(d7.b.b(bundle2));
                        }
                        x8.a aVar = new x8.a(j12, bundle.getLong("d"), q0VarM.g());
                        eVar.q();
                        zW = this.U.w(aVar, j9);
                    }
                }
            }
            long jF = this.U.f(this.f14998j0);
            if (jF == Long.MIN_VALUE && this.f14995g0 && !zW) {
                this.f14996h0 = true;
            }
            if (jF != Long.MIN_VALUE && jF <= j9) {
                zW = true;
            }
            if (zW) {
                t0 t0VarL = this.U.l(j9);
                long jZ = this.U.z(j9);
                d7.c cVar = new d7.c(G(jZ), t0VarL);
                if (handler != null) {
                    handler.obtainMessage(1, cVar).sendToTarget();
                } else {
                    I(cVar);
                }
                this.U.B(jZ);
            }
            this.f14998j0 = j9;
            return;
        }
        E();
        this.f14998j0 = j9;
        if (this.f14990b0 == null) {
            x8.e eVar2 = this.Y;
            eVar2.getClass();
            eVar2.b(j9);
            try {
                x8.e eVar3 = this.Y;
                eVar3.getClass();
                this.f14990b0 = (x8.c) eVar3.d();
            } catch (SubtitleDecoderException e3) {
                e7.a.e("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.f14997i0, e3);
                d7.c cVar2 = new d7.c(G(this.f14998j0), d2.E);
                if (handler != null) {
                    handler.obtainMessage(1, cVar2).sendToTarget();
                } else {
                    I(cVar2);
                }
                J();
                x8.e eVar4 = this.Y;
                eVar4.getClass();
                eVar4.release();
                this.Y = null;
                this.X = 0;
                H();
                return;
            }
        }
        if (this.H != 2) {
            return;
        }
        if (this.f14989a0 != null) {
            long jF2 = F();
            z10 = false;
            while (jF2 <= j9) {
                this.f14991c0++;
                jF2 = F();
                z10 = true;
            }
        } else {
            z10 = false;
        }
        x8.c cVar3 = this.f14990b0;
        if (cVar3 == null) {
            bVar = bVar2;
            z11 = z10;
        } else if (cVar3.c(4)) {
            if (!z10 && F() == Long.MAX_VALUE) {
                if (this.X == 2) {
                    J();
                    x8.e eVar5 = this.Y;
                    eVar5.getClass();
                    eVar5.release();
                    this.Y = null;
                    this.X = 0;
                    H();
                } else {
                    J();
                    this.f14996h0 = true;
                }
            }
            bVar = bVar2;
            z11 = z10;
        } else {
            bVar = bVar2;
            z11 = z10;
            if (cVar3.C <= j9) {
                x8.c cVar4 = this.f14989a0;
                if (cVar4 != null) {
                    cVar4.r();
                }
                this.f14991c0 = cVar3.d(j9);
                this.f14989a0 = cVar3;
                this.f14990b0 = null;
                z11 = true;
            }
        }
        if (z11) {
            this.f14989a0.getClass();
            int iD = this.f14989a0.d(j9);
            if (iD == 0 || this.f14989a0.i() == 0) {
                jE = this.f14989a0.C;
            } else if (iD == -1) {
                x8.c cVar5 = this.f14989a0;
                jE = cVar5.e(cVar5.i() - 1);
            } else {
                jE = this.f14989a0.e(iD - 1);
            }
            d7.c cVar6 = new d7.c(G(jE), this.f14989a0.g(j9));
            if (handler != null) {
                handler.obtainMessage(1, cVar6).sendToTarget();
            } else {
                I(cVar6);
            }
        }
        if (this.X == 2) {
            return;
        }
        while (!this.f14995g0) {
            try {
                h hVar = this.Z;
                if (hVar == null) {
                    x8.e eVar6 = this.Y;
                    eVar6.getClass();
                    hVar = (h) eVar6.e();
                    if (hVar == null) {
                        return;
                    } else {
                        this.Z = hVar;
                    }
                }
                if (this.X == 1) {
                    hVar.B = 4;
                    x8.e eVar7 = this.Y;
                    eVar7.getClass();
                    eVar7.c(hVar);
                    this.Z = null;
                    this.X = 2;
                    return;
                }
                int iW = w(bVar, hVar, 0);
                if (iW == -4) {
                    if (hVar.c(4)) {
                        this.f14995g0 = true;
                        this.W = false;
                    } else {
                        t tVar2 = (t) bVar.B;
                        if (tVar2 == null) {
                            return;
                        }
                        hVar.J = tVar2.f1599s;
                        hVar.t();
                        this.W &= !hVar.c(1);
                    }
                    if (!this.W) {
                        x8.e eVar8 = this.Y;
                        eVar8.getClass();
                        eVar8.c(hVar);
                        this.Z = null;
                    }
                } else if (iW == -3) {
                    return;
                }
            } catch (SubtitleDecoderException e10) {
                e7.a.e("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.f14997i0, e10);
                d7.c cVar7 = new d7.c(G(this.f14998j0), d2.E);
                if (handler != null) {
                    handler.obtainMessage(1, cVar7).sendToTarget();
                } else {
                    I(cVar7);
                }
                J();
                x8.e eVar9 = this.Y;
                eVar9.getClass();
                eVar9.release();
                this.Y = null;
                this.X = 0;
                H();
                return;
            }
        }
    }
}

package kz;

import android.content.Context;
import android.net.Uri;
import androidx.lifecycle.w;
import androidx.media3.common.q0;
import androidx.media3.exoplayer.ExoPlayer;
import b2.r;
import c3.c2;
import c3.o0;
import ct.a0;
import h0.o;
import i2.b0;
import i7.l;
import i7.z;
import kotlin.jvm.internal.m;
import l1.g0;
import l1.i;
import l1.j;
import l1.q;
import l1.r1;
import u00.k;
import z.n;

public abstract class f {
    public static final long a = b0.d(4279913020L);

    public static final void a(float f, int i, int i2, r rVar, j jVar) {
        r rVar2;
        g0 g0Var = (g0) jVar;
        g0Var.e0(-1185721371);
        int i3 = (g0Var.g(rVar) ? 4 : 2) | i2 | (g0Var.d(f) ? 32 : 16) | 384;
        if (!g0Var.S(i3 & 1, (i3 & 147) != 146)) {
            rVar2 = rVar;
            g0Var.V();
        } else {
            if (((Boolean) g0Var.k(c2.a)).booleanValue()) {
                g0Var.c0(-2014123251);
                o.a(n.f(rVar, a, b0.b), g0Var, 0);
                g0Var.r(false);
                r1 r1VarT = g0Var.t();
                if (r1VarT != null) {
                    r1VarT.d = new a0(rVar, f, i2, 3);
                    return;
                }
                return;
            }
            g0Var.c0(-2014046371);
            g0Var.r(false);
            Context context = (Context) g0Var.k(o0.b);
            w wVar = (w) g0Var.k(r6.d.a);
            Object objN = g0Var.N();
            l1.c cVar = i.a;
            Object obj = objN;
            if (objN == cVar) {
                z zVarA = new l(context).a();
                zVarA.setRepeatMode(1);
                zVarA.setVolume(0.0f);
                v7.j trackSelectionParameters = zVarA.getTrackSelectionParameters();
                trackSelectionParameters.getClass();
                v7.i iVar = new v7.i(trackSelectionParameters);
                iVar.l(1, true);
                zVarA.setTrackSelectionParameters(iVar.b());
                zVarA.setMediaItem(q0.b(Uri.parse("asset:///videos/background/premiumGlow.mp4")));
                zVarA.prepare();
                zVarA.setPlayWhenReady(true);
                g0Var.n0(zVarA);
                obj = zVarA;
            }
            ExoPlayer exoPlayer = (ExoPlayer) obj;
            m.b(exoPlayer);
            boolean zI = g0Var.i(exoPlayer) | g0Var.i(wVar);
            Object objN2 = g0Var.N();
            if (zI || objN2 == cVar) {
                objN2 = new gv.h(wVar, exoPlayer, 1);
                g0Var.n0(objN2);
            }
            q.c(wVar, exoPlayer, (k) objN2, g0Var);
            boolean zI2 = g0Var.i(exoPlayer);
            Object objN3 = g0Var.N();
            if (zI2 || objN3 == cVar) {
                objN3 = new b(exoPlayer, 0);
                g0Var.n0(objN3);
            }
            k kVar = (k) objN3;
            Object objN4 = g0Var.N();
            if (objN4 == cVar) {
                objN4 = new ks.e(24);
                g0Var.n0(objN4);
            }
            k kVar2 = (k) objN4;
            boolean zI3 = g0Var.i(exoPlayer) | ((i3 & 112) == 32);
            Object objN5 = g0Var.N();
            if (zI3 || objN5 == cVar) {
                objN5 = new c(exoPlayer, f, 0);
                g0Var.n0(objN5);
            }
            rVar2 = rVar;
            b4.l.b(kVar, rVar2, kVar2, (k) objN5, g0Var, ((i3 << 3) & 112) | 3072);
            i = 4;
        }
        r1 r1VarT2 = g0Var.t();
        if (r1VarT2 != null) {
            r1VarT2.d = new d(rVar2, f, i, i2);
        }
    }
}

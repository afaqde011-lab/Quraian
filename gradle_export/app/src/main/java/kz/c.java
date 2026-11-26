package kz;

import android.graphics.RenderEffect;
import android.graphics.Shader;
import androidx.media3.common.f1;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.ui.PlayerView;
import cs.i;
import g00.b0;
import kotlin.jvm.internal.m;
import l1.g1;
import l1.i1;
import u00.k;
import w.c2;
import w.j0;
import w.v;
import x.n1;
import z2.k1;
import z2.l1;

public final class c implements k {
    public final int A;
    public final float B;
    public final Object C;

    public c(Object obj, float f, int i) {
        this.A = i;
        this.C = obj;
        this.B = f;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.A) {
            case 0:
                f1 f1Var = (ExoPlayer) this.C;
                PlayerView playerView = (PlayerView) obj;
                m.e(playerView, "playerView");
                if (playerView.getPlayer() != f1Var) {
                    playerView.setPlayer(f1Var);
                }
                playerView.setResizeMode(4);
                float f = this.B;
                playerView.setRenderEffect(f > 0.0f ? RenderEffect.createBlurEffect(f, f, Shader.TileMode.CLAMP) : null);
                break;
            case 1:
                k kVar = (k) this.C;
                v vVar = (v) obj;
                return new j0(((j0) kVar.invoke(vVar)).a, ((j0) kVar.invoke(vVar)).b, this.B, (c2) null);
            case 2:
                l1 l1Var = (l1) this.C;
                k1 layout = (k1) obj;
                m.e(layout, "$this$layout");
                k1.s(layout, l1Var, 0, 0, new i(this.B, 5), 4);
                break;
            default:
                n1 n1Var = (n1) this.C;
                long jLongValue = ((Long) obj).longValue();
                boolean zG = n1Var.g();
                g1 g1Var = n1Var.g;
                if (!zG) {
                    if (g1Var.h() == Long.MIN_VALUE) {
                        g1Var.i(jLongValue);
                        ((i1) n1Var.a.B).setValue(Boolean.TRUE);
                    }
                    long jH = jLongValue - g1Var.h();
                    float f2 = this.B;
                    if (f2 != 0.0f) {
                        jH = w00.a.G(jH / ((double) f2));
                    }
                    n1Var.n(jH);
                    n1Var.h(f2 == 0.0f, jH);
                }
                return b0.a;
        }
        return b0.a;
    }
}

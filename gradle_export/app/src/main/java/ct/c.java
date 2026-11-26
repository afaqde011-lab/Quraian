package ct;

import android.content.Context;
import android.graphics.RenderEffect;
import android.graphics.Shader;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.common.f1;
import androidx.media3.ui.PlayerView;
import com.mchutov.Quranify.R;

public final class c implements u00.k {
    public final int A;
    public final b B;

    public c(b bVar, int i11) {
        this.A = i11;
        this.B = bVar;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.A) {
            case 0:
                l1.z DisposableEffect = (l1.z) obj;
                kotlin.jvm.internal.m.e(DisposableEffect, "$this$DisposableEffect");
                return new e(this.B, 0);
            case 1:
                l1.z DisposableEffect2 = (l1.z) obj;
                kotlin.jvm.internal.m.e(DisposableEffect2, "$this$DisposableEffect");
                b bVar = this.B;
                bVar.f5372b = true;
                i7.z zVar = bVar.f5371a;
                if (bVar.f5373c) {
                    zVar.play();
                } else {
                    zVar.pause();
                }
                return new e(bVar, 1);
            case 2:
                Context context = (Context) obj;
                kotlin.jvm.internal.m.e(context, "context");
                View viewInflate = LayoutInflater.from(context).inflate(R.layout.background_video_player_view, (ViewGroup) null);
                kotlin.jvm.internal.m.c(viewInflate, "null cannot be cast to non-null type androidx.media3.ui.PlayerView");
                PlayerView playerView = (PlayerView) viewInflate;
                playerView.setPlayer(this.B.f5371a);
                playerView.setClipToOutline(true);
                playerView.setRenderEffect(RenderEffect.createBlurEffect(32.0f, 32.0f, Shader.TileMode.CLAMP));
                return playerView;
            default:
                PlayerView playerView2 = (PlayerView) obj;
                kotlin.jvm.internal.m.e(playerView2, "playerView");
                f1 player = playerView2.getPlayer();
                i7.z zVar2 = this.B.f5371a;
                if (player != zVar2) {
                    playerView2.setPlayer(zVar2);
                }
                return g00.b0.f7770a;
        }
    }
}

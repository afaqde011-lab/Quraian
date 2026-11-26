package kz;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.ui.PlayerView;
import g00.b0;
import kotlin.jvm.internal.m;
import u00.k;

public final class b implements k {
    public final int A;
    public final ExoPlayer B;

    public b(ExoPlayer exoPlayer, int i) {
        this.A = i;
        this.B = exoPlayer;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.A) {
            case 0:
                Context viewContext = (Context) obj;
                m.e(viewContext, "viewContext");
                PlayerView playerViewInflate = LayoutInflater.from(viewContext).inflate(2131558429, (ViewGroup) null);
                m.c(playerViewInflate, "null cannot be cast to non-null type androidx.media3.ui.PlayerView");
                PlayerView playerView = playerViewInflate;
                playerView.setUseController(false);
                playerView.setShutterBackgroundColor(0);
                playerView.setImportantForAccessibility(2);
                playerView.setResizeMode(4);
                playerView.setPlayer(this.B);
                return playerView;
            case 1:
                Context context = (Context) obj;
                m.e(context, "context");
                PlayerView playerView2 = new PlayerView(context, (AttributeSet) null);
                playerView2.setUseController(false);
                playerView2.setResizeMode(4);
                playerView2.setPlayer(this.B);
                return playerView2;
            default:
                PlayerView view = (PlayerView) obj;
                m.e(view, "view");
                view.setPlayer(this.B);
                return b0.a;
        }
    }
}

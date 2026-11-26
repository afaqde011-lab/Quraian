package nv;

import androidx.media3.cast.CastPlayer;
import com.mchutov.quranify.player.presentation.service.AudioPlayerService;

public final class a implements u00.a {
    public final int A;
    public final AudioPlayerService B;

    public a(AudioPlayerService audioPlayerService, int i) {
        this.A = i;
        this.B = audioPlayerService;
    }

    @Override
    public final Object invoke() {
        int i = this.A;
        AudioPlayerService audioPlayerService = this.B;
        switch (i) {
            case 0:
                int i2 = AudioPlayerService.j0;
                return new tv.b((xu.f) audioPlayerService.b0.getValue(), audioPlayerService.d0);
            case 1:
                int i3 = AudioPlayerService.j0;
                CastPlayer castPlayer = audioPlayerService.H;
                return castPlayer != null ? castPlayer : audioPlayerService.G;
            case 2:
                int i4 = AudioPlayerService.j0;
                return (zz.a) ((b00.c) audioPlayerService.S.getValue()).h.getValue();
            default:
                int i5 = AudioPlayerService.j0;
                return Float.valueOf(((Number) ((b00.c) audioPlayerService.S.getValue()).i.getValue()).floatValue());
        }
    }
}

package nv;

import com.mchutov.quranify.player.domain.model.PlayerItem;
import com.mchutov.quranify.player.presentation.service.AudioPlayerService;
import g00.b0;

public final class g implements d40.j {
    public final int A;
    public final AudioPlayerService B;

    public g(AudioPlayerService audioPlayerService, int i) {
        this.A = i;
        this.B = audioPlayerService;
    }

    @Override
    public final Object emit(Object obj, k00.c cVar) {
        int i = this.A;
        b0 b0Var = b0.a;
        AudioPlayerService audioPlayerService = this.B;
        switch (i) {
            case 0:
                ((Boolean) obj).booleanValue();
                int i2 = AudioPlayerService.j0;
                audioPlayerService.s();
                break;
            default:
                g00.k kVar = (g00.k) obj;
                PlayerItem playerItem = (PlayerItem) kVar.A;
                boolean zBooleanValue = ((Boolean) kVar.B).booleanValue();
                int i3 = AudioPlayerService.j0;
                ((nn.k) audioPlayerService.V.getValue()).a(playerItem, zBooleanValue);
                break;
        }
        return b0Var;
    }
}

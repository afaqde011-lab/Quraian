package nv;

import com.mchutov.quranify.player.domain.model.PlayerItem;
import com.mchutov.quranify.player.presentation.service.AudioPlayerService;

public final class s extends m00.c {
    public PlayerItem A;
    public Object B;
    public final AudioPlayerService C;
    public int D;

    public s(AudioPlayerService audioPlayerService, m00.c cVar) {
        super(cVar);
        this.C = audioPlayerService;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return AudioPlayerService.r(this.C, this);
    }
}

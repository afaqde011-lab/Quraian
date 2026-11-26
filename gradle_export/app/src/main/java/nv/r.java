package nv;

import com.mchutov.quranify.player.presentation.service.AudioPlayerService;
import k9.a2;

public final class r extends m00.c {
    public a2 A;
    public Object B;
    public final AudioPlayerService C;
    public int D;

    public r(AudioPlayerService audioPlayerService, m00.c cVar) {
        super(cVar);
        this.C = audioPlayerService;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return AudioPlayerService.o(this.C, null, null, this);
    }
}

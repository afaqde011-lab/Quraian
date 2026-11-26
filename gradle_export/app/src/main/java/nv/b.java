package nv;

import com.mchutov.quranify.player.presentation.service.AudioPlayerService;
import java.util.List;

public final class b extends m00.c {
    public List A;
    public rv.q B;
    public int C;
    public long D;
    public Object E;
    public final AudioPlayerService F;
    public int G;

    public b(AudioPlayerService audioPlayerService, m00.c cVar) {
        super(cVar);
        this.F = audioPlayerService;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return AudioPlayerService.k(this.F, null, 0, 0L, this);
    }
}

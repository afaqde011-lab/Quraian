package no;

import com.mchutov.quranify.audiostories.presentation.analytics.AudioStoryEpisodeParams;

public final class j extends m00.c {
    public AudioStoryEpisodeParams A;
    public Object B;
    public final n C;
    public int D;

    public j(n nVar, m00.c cVar) {
        super(cVar);
        this.C = nVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return n.b(this.C, null, this);
    }
}

package oq;

import android.content.Context;
import com.mchutov.quranify.deeplink.presentation.share.ShareLauncher;

public final class c extends m00.c {
    public Context A;
    public Object B;
    public final ShareLauncher C;
    public int D;

    public c(ShareLauncher shareLauncher, k00.c cVar) {
        super(cVar);
        this.C = shareLauncher;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return this.C.artworkUri(null, null, this);
    }
}

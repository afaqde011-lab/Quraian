package oq;

import android.content.Context;
import android.content.Intent;
import com.mchutov.quranify.deeplink.presentation.share.ShareLauncher;

public final class d extends m00.c {
    public Context A;
    public a B;
    public Intent C;
    public Intent D;
    public Object E;
    public final ShareLauncher F;
    public int G;

    public d(ShareLauncher shareLauncher, k00.c cVar) {
        super(cVar);
        this.F = shareLauncher;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.share(null, null, this);
    }
}

package q3;

import android.util.Log;

public final class m extends k00.a implements a40.x {
    public final int B;

    public m(k00.h hVar, int i10) {
        super(hVar);
        this.B = i10;
    }

    private final void n0(Throwable th2, k00.i iVar) {
    }

    public final void v(Throwable th2, k00.i iVar) {
        switch (this.B) {
            case 0:
                break;
            case 1:
                Log.w("AudioStoryDownloads", "Background work failed", th2);
                break;
            case 2:
                Log.w("AudioStoryEvents", "Background work failed", th2);
                break;
            default:
                Log.w("AudioStoryProgress", "Background work failed", th2);
                break;
        }
    }
}

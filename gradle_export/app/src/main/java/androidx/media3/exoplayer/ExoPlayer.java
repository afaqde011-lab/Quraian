package androidx.media3.exoplayer;

import android.os.Build;
import androidx.media3.common.f1;
import androidx.media3.exoplayer.image.ImageOutput;
import e7.i0;
import w00.a;

public interface ExoPlayer extends f1 {

    public static final int f1692a;

    static {
        String str = i0.f5136a;
        String strI = a.I(Build.DEVICE);
        f1692a = (strI.contains("emulator") || strI.contains("emu64a") || strI.contains("emu64x") || strI.contains("generic")) ? 30000 : 10000;
    }

    boolean isScrubbingModeEnabled();

    void setImageOutput(ImageOutput imageOutput);

    void setScrubbingModeEnabled(boolean z10);
}

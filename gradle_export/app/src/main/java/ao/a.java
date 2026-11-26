package ao;

import android.content.Context;
import java.io.File;

public final class a {
    public final File a;

    public a(Context context) {
        this.a = new File(context.getFilesDir(), "audio_stories");
    }
}

package androidx.profileinstaller;

import android.content.Context;
import android.view.Choreographer;
import b40.d;
import java.util.Collections;
import java.util.List;
import ra.b;
import tf.w;

public class ProfileInstallerInitializer implements b {
    @Override
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override
    public final Object b(Context context) {
        Choreographer.getInstance().postFrameCallback(new d(this, context.getApplicationContext()));
        return new w(25);
    }
}

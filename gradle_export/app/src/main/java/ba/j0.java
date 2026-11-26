package ba;

import android.view.View;

public abstract class j0 {
    public static void a(View view, float f3) {
        try {
            view.setFrameContentVelocity(f3);
        } catch (LinkageError unused) {
        }
    }
}

package b5;

import android.view.inputmethod.EditorInfo;
import androidx.core.widget.NestedScrollView;

public abstract class a {
    public static void a(NestedScrollView nestedScrollView, float f3) {
        try {
            nestedScrollView.setFrameContentVelocity(f3);
        } catch (LinkageError unused) {
        }
    }

    public static void b(EditorInfo editorInfo, boolean z10) {
        editorInfo.setStylusHandwritingEnabled(z10);
    }
}

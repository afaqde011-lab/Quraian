package z4;

import android.os.Build;
import androidx.core.widget.NestedScrollView;

public final class w {

    public final v f17226a;

    public w(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f17226a = new u(nestedScrollView);
        } else {
            this.f17226a = new tf.w(24);
        }
    }
}

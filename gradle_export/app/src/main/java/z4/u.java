package z4;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;

public final class u implements v {
    public final ScrollFeedbackProvider A;

    public u(NestedScrollView nestedScrollView) {
        this.A = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    @Override
    public final void onScrollLimit(int i10, int i11, int i12, boolean z10) {
        this.A.onScrollLimit(i10, i11, i12, z10);
    }

    @Override
    public final void onScrollProgress(int i10, int i11, int i12, int i13) {
        this.A.onScrollProgress(i10, i11, i12, i13);
    }
}

package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import j.a;

public class AlertController$RecycleListView extends ListView {
    public final int A;
    public final int B;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f7733t);
        this.B = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.A = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }
}

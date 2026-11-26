package j4;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

public final class l {

    public int f8134a;

    public int f8135b;

    public float f8136c;

    public float f8137d;

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f8162g);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            if (index == 1) {
                this.f8136c = typedArrayObtainStyledAttributes.getFloat(index, this.f8136c);
            } else if (index == 0) {
                int i11 = typedArrayObtainStyledAttributes.getInt(index, this.f8134a);
                this.f8134a = i11;
                this.f8134a = n.f8150d[i11];
            } else if (index == 4) {
                this.f8135b = typedArrayObtainStyledAttributes.getInt(index, this.f8135b);
            } else if (index == 3) {
                this.f8137d = typedArrayObtainStyledAttributes.getFloat(index, this.f8137d);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}

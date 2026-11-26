package j4;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

public final class g {

    public final float f8063a;

    public final float f8064b;

    public final float f8065c;

    public final float f8066d;

    public final int f8067e;

    public g(Context context, XmlResourceParser xmlResourceParser) {
        this.f8063a = Float.NaN;
        this.f8064b = Float.NaN;
        this.f8065c = Float.NaN;
        this.f8066d = Float.NaN;
        this.f8067e = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), r.f8165j);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            if (index == 0) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f8067e);
                this.f8067e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new n().b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            } else if (index == 1) {
                this.f8066d = typedArrayObtainStyledAttributes.getDimension(index, this.f8066d);
            } else if (index == 2) {
                this.f8064b = typedArrayObtainStyledAttributes.getDimension(index, this.f8064b);
            } else if (index == 3) {
                this.f8065c = typedArrayObtainStyledAttributes.getDimension(index, this.f8065c);
            } else if (index == 4) {
                this.f8063a = typedArrayObtainStyledAttributes.getDimension(index, this.f8063a);
            } else {
                Log.v("ConstraintLayoutStates", "Unknown tag");
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}

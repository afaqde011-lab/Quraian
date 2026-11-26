package j4;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

public final class m {

    public static final SparseIntArray f8138n;

    public float f8139a;

    public float f8140b;

    public float f8141c;

    public float f8142d;

    public float f8143e;

    public float f8144f;

    public float f8145g;

    public int f8146h;

    public float f8147i;

    public float f8148j;

    public float f8149k;
    public boolean l;
    public float m;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f8138n = sparseIntArray;
        sparseIntArray.append(6, 1);
        sparseIntArray.append(7, 2);
        sparseIntArray.append(8, 3);
        sparseIntArray.append(4, 4);
        sparseIntArray.append(5, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(1, 7);
        sparseIntArray.append(2, 8);
        sparseIntArray.append(3, 9);
        sparseIntArray.append(9, 10);
        sparseIntArray.append(10, 11);
        sparseIntArray.append(11, 12);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f8164i);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            switch (f8138n.get(index)) {
                case 1:
                    this.f8139a = typedArrayObtainStyledAttributes.getFloat(index, this.f8139a);
                    break;
                case 2:
                    this.f8140b = typedArrayObtainStyledAttributes.getFloat(index, this.f8140b);
                    break;
                case 3:
                    this.f8141c = typedArrayObtainStyledAttributes.getFloat(index, this.f8141c);
                    break;
                case 4:
                    this.f8142d = typedArrayObtainStyledAttributes.getFloat(index, this.f8142d);
                    break;
                case 5:
                    this.f8143e = typedArrayObtainStyledAttributes.getFloat(index, this.f8143e);
                    break;
                case 6:
                    this.f8144f = typedArrayObtainStyledAttributes.getDimension(index, this.f8144f);
                    break;
                case 7:
                    this.f8145g = typedArrayObtainStyledAttributes.getDimension(index, this.f8145g);
                    break;
                case 8:
                    this.f8147i = typedArrayObtainStyledAttributes.getDimension(index, this.f8147i);
                    break;
                case 9:
                    this.f8148j = typedArrayObtainStyledAttributes.getDimension(index, this.f8148j);
                    break;
                case 10:
                    this.f8149k = typedArrayObtainStyledAttributes.getDimension(index, this.f8149k);
                    break;
                case 11:
                    this.l = true;
                    this.m = typedArrayObtainStyledAttributes.getDimension(index, this.m);
                    break;
                case 12:
                    this.f8146h = n.f(typedArrayObtainStyledAttributes, index, this.f8146h);
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}

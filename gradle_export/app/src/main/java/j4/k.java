package j4;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

public final class k {

    public static final SparseIntArray f8124j;

    public int f8125a;

    public int f8126b;

    public int f8127c;

    public float f8128d;

    public float f8129e;

    public float f8130f;

    public int f8131g;

    public String f8132h;

    public int f8133i;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f8124j = sparseIntArray;
        sparseIntArray.append(3, 1);
        sparseIntArray.append(5, 2);
        sparseIntArray.append(9, 3);
        sparseIntArray.append(2, 4);
        sparseIntArray.append(1, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(4, 7);
        sparseIntArray.append(8, 8);
        sparseIntArray.append(7, 9);
        sparseIntArray.append(6, 10);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f8161f);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            switch (f8124j.get(index)) {
                case 1:
                    this.f8129e = typedArrayObtainStyledAttributes.getFloat(index, this.f8129e);
                    break;
                case 2:
                    this.f8127c = typedArrayObtainStyledAttributes.getInt(index, this.f8127c);
                    break;
                case 3:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        typedArrayObtainStyledAttributes.getString(index);
                    } else {
                        String str = f4.a.f5482a[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                    }
                    break;
                case 4:
                    typedArrayObtainStyledAttributes.getInt(index, 0);
                    break;
                case 5:
                    this.f8125a = n.f(typedArrayObtainStyledAttributes, index, this.f8125a);
                    break;
                case 6:
                    this.f8126b = typedArrayObtainStyledAttributes.getInteger(index, this.f8126b);
                    break;
                case 7:
                    this.f8128d = typedArrayObtainStyledAttributes.getFloat(index, this.f8128d);
                    break;
                case 8:
                    this.f8131g = typedArrayObtainStyledAttributes.getInteger(index, this.f8131g);
                    break;
                case 9:
                    this.f8130f = typedArrayObtainStyledAttributes.getFloat(index, this.f8130f);
                    break;
                case 10:
                    int i11 = typedArrayObtainStyledAttributes.peekValue(index).type;
                    if (i11 == 1) {
                        this.f8133i = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    } else if (i11 == 3) {
                        String string = typedArrayObtainStyledAttributes.getString(index);
                        this.f8132h = string;
                        if (string.indexOf("/") > 0) {
                            this.f8133i = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                        }
                    } else {
                        typedArrayObtainStyledAttributes.getInteger(index, this.f8133i);
                    }
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}

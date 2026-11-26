package sg;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

public final class a0 {

    public int f14143a;

    public o9.q f14144b;

    public int[][] f14145c;

    public o9.q[] f14146d;

    public final void a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        z zVar;
        int depth = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlResourceParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth && xmlResourceParser.getName().equals("item")) {
                Resources resources = context.getResources();
                int[] iArr = zf.a.B;
                TypedArray typedArrayObtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                TypedValue typedValuePeekValue = typedArrayObtainAttributes.peekValue(0);
                if (typedValuePeekValue != null) {
                    int i10 = typedValuePeekValue.type;
                    if (i10 == 5) {
                        zVar = new z(2, TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArrayObtainAttributes.getResources().getDisplayMetrics()));
                    } else if (i10 == 6) {
                        zVar = new z(1, typedValuePeekValue.getFraction(1.0f, 1.0f));
                    } else {
                        zVar = null;
                    }
                } else {
                    zVar = null;
                }
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr2 = new int[attributeCount];
                int i11 = 0;
                for (int i12 = 0; i12 < attributeCount; i12++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i12);
                    if (attributeNameResource != 2130970128) {
                        int i13 = i11 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i12, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr2[i11] = attributeNameResource;
                        i11 = i13;
                    }
                }
                int[] iArrTrimStateSet = StateSet.trimStateSet(iArr2, i11);
                o9.q qVar = new o9.q(15, false);
                qVar.B = zVar;
                int i14 = this.f14143a;
                if (i14 == 0 || iArrTrimStateSet.length == 0) {
                    this.f14144b = qVar;
                }
                int[][] iArr3 = this.f14145c;
                if (i14 >= iArr3.length) {
                    int i15 = i14 + 10;
                    int[][] iArr4 = new int[i15][];
                    System.arraycopy(iArr3, 0, iArr4, 0, i14);
                    this.f14145c = iArr4;
                    o9.q[] qVarArr = new o9.q[i15];
                    System.arraycopy(this.f14146d, 0, qVarArr, 0, i14);
                    this.f14146d = qVarArr;
                }
                int[][] iArr5 = this.f14145c;
                int i16 = this.f14143a;
                iArr5[i16] = iArrTrimStateSet;
                this.f14146d[i16] = qVar;
                this.f14143a = i16 + 1;
            }
        }
    }
}

package sg;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

public final class w {

    public int f14213a;

    public d f14214b;

    public int[][] f14215c = new int[10][];

    public d[] f14216d = new d[10];

    public static w b(d dVar) {
        w wVar = new w();
        wVar.a(StateSet.WILD_CARD, dVar);
        return wVar;
    }

    public final void a(int[] iArr, d dVar) {
        int i10 = this.f14213a;
        if (i10 == 0 || iArr.length == 0) {
            this.f14214b = dVar;
        }
        int[][] iArr2 = this.f14215c;
        if (i10 >= iArr2.length) {
            int i11 = i10 + 10;
            int[][] iArr3 = new int[i11][];
            System.arraycopy(iArr2, 0, iArr3, 0, i10);
            this.f14215c = iArr3;
            d[] dVarArr = new d[i11];
            System.arraycopy(this.f14216d, 0, dVarArr, 0, i10);
            this.f14216d = dVarArr;
        }
        int[][] iArr4 = this.f14215c;
        int i12 = this.f14213a;
        iArr4[i12] = iArr;
        this.f14216d[i12] = dVar;
        this.f14213a = i12 + 1;
    }

    public final d c(int[] iArr) {
        int i10;
        int[][] iArr2 = this.f14215c;
        int i11 = 0;
        while (true) {
            i10 = -1;
            if (i11 >= this.f14213a) {
                i11 = -1;
                break;
            }
            if (StateSet.stateSetMatches(iArr2[i11], iArr)) {
                break;
            }
            i11++;
        }
        if (i11 < 0) {
            int[] iArr3 = StateSet.WILD_CARD;
            int[][] iArr4 = this.f14215c;
            for (int i12 = 0; i12 < this.f14213a; i12++) {
                if (StateSet.stateSetMatches(iArr4[i12], iArr3)) {
                    i10 = i12;
                    break;
                }
            }
            i11 = i10;
        }
        return i11 < 0 ? this.f14214b : this.f14216d[i11];
    }

    public final void d(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
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
                int[] iArr = zf.a.f17449y;
                TypedArray typedArrayObtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                d dVarC = m.c(typedArrayObtainAttributes, 5, new a(0.0f));
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr2 = new int[attributeCount];
                int i10 = 0;
                for (int i11 = 0; i11 < attributeCount; i11++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i11);
                    if (attributeNameResource != 2130969005) {
                        int i12 = i10 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i11, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr2[i10] = attributeNameResource;
                        i10 = i12;
                    }
                }
                a(StateSet.trimStateSet(iArr2, i10), dVarC);
            }
        }
    }
}

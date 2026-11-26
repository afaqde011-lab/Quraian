package sg;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import java.io.IOException;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParserException;

public final class y {

    public final int f14226a;

    public final m f14227b;

    public final int[][] f14228c;

    public final m[] f14229d;

    public final w f14230e;

    public final w f14231f;

    public final w f14232g;

    public final w f14233h;

    public y(x xVar) {
        this.f14226a = xVar.f14218b;
        this.f14227b = (m) xVar.f14219c;
        this.f14228c = (int[][]) xVar.f14220d;
        this.f14229d = (m[]) xVar.f14221e;
        this.f14230e = (w) xVar.f14222f;
        this.f14231f = (w) xVar.f14223g;
        this.f14232g = (w) xVar.f14224h;
        this.f14233h = (w) xVar.f14225i;
    }

    public static void a(x xVar, Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
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
                int[] iArr = zf.a.f17442r;
                TypedArray typedArrayObtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                m mVarA = m.a(context, typedArrayObtainAttributes.getResourceId(0, 0), typedArrayObtainAttributes.getResourceId(1, 0), new a(0)).a();
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr2 = new int[attributeCount];
                int i10 = 0;
                for (int i11 = 0; i11 < attributeCount; i11++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i11);
                    if (attributeNameResource != 2130969754 && attributeNameResource != 2130969765) {
                        int i12 = i10 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i11, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr2[i10] = attributeNameResource;
                        i10 = i12;
                    }
                }
                xVar.a(StateSet.trimStateSet(iArr2, i10), mVarA);
            }
        }
    }

    public static y b(Context context, TypedArray typedArray, int i10) {
        int next;
        int resourceId = typedArray.getResourceId(i10, 0);
        if (resourceId == 0 || !Objects.equals(context.getResources().getResourceTypeName(resourceId), "xml")) {
            return null;
        }
        x xVar = new x(0);
        xVar.d();
        try {
            XmlResourceParser xml = context.getResources().getXml(resourceId);
            try {
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                if (xml.getName().equals("selector")) {
                    a(xVar, context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                xml.close();
                if (xVar.f14218b == 0) {
                    return null;
                }
                return new y(xVar);
            } catch (Throwable th2) {
                if (xml != null) {
                    try {
                        xml.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
            xVar.d();
        }
    }

    public final m c() {
        m mVar = this.f14227b;
        w wVar = this.f14233h;
        w wVar2 = this.f14232g;
        w wVar3 = this.f14231f;
        w wVar4 = this.f14230e;
        if (wVar4 == null && wVar3 == null && wVar2 == null && wVar == null) {
            return mVar;
        }
        l lVarF = mVar.f();
        if (wVar4 != null) {
            lVarF.f14174e = wVar4.f14214b;
        }
        if (wVar3 != null) {
            lVarF.f14175f = wVar3.f14214b;
        }
        if (wVar2 != null) {
            lVarF.f14177h = wVar2.f14214b;
        }
        if (wVar != null) {
            lVarF.f14176g = wVar.f14214b;
        }
        return lVarF.a();
    }

    public final boolean d() {
        w wVar;
        w wVar2;
        w wVar3;
        w wVar4;
        return this.f14226a > 1 || ((wVar = this.f14230e) != null && wVar.f14213a > 1) || (((wVar2 = this.f14231f) != null && wVar2.f14213a > 1) || (((wVar3 = this.f14232g) != null && wVar3.f14213a > 1) || ((wVar4 = this.f14233h) != null && wVar4.f14213a > 1)));
    }
}

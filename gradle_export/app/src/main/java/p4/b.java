package p4;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import java.io.IOException;
import java.lang.reflect.Array;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public abstract class b {

    public static final ThreadLocal f12319a = new ThreadLocal();

    public static ColorStateList a(Resources resources, XmlResourceParser xmlResourceParser, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return b(resources, xmlResourceParser, attributeSetAsAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static ColorStateList b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        int color;
        float f3;
        int iE;
        resources = resources;
        attributeSet = attributeSet;
        theme = theme;
        String name = xmlPullParser.getName();
        if (!name.equals("selector")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
        }
        ?? r4 = 1;
        int depth2 = xmlPullParser.getDepth() + 1;
        Object[] objArr = new int[20][];
        int[] iArr = new int[20];
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int next = xmlPullParser.next();
            if (next == r4 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                int[] iArr2 = m4.a.f10554a;
                ?? ObtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr2) : theme.obtainStyledAttributes(attributeSet, iArr2, i10, i10);
                int resourceId = ObtainAttributes.getResourceId(i10, -1);
                if (resourceId != -1) {
                    ThreadLocal threadLocal = f12319a;
                    TypedValue typedValue = (TypedValue) threadLocal.get();
                    if (typedValue == null) {
                        typedValue = new TypedValue();
                        threadLocal.set(typedValue);
                    }
                    resources.getValue(resourceId, typedValue, r4);
                    int i12 = typedValue.type;
                    if (i12 < 28 || i12 > 31) {
                        try {
                            color = a(resources, resources.getXml(resourceId), theme).getDefaultColor();
                        } catch (Exception unused) {
                            color = ObtainAttributes.getColor(i10, -65281);
                        }
                    } else {
                        color = ObtainAttributes.getColor(i10, -65281);
                    }
                } else {
                    color = ObtainAttributes.getColor(i10, -65281);
                }
                if (ObtainAttributes.hasValue(r4)) {
                    f3 = ObtainAttributes.getFloat(r4, 1.0f);
                } else {
                    f3 = ObtainAttributes.hasValue(3) ? ObtainAttributes.getFloat(3, 1.0f) : 1.0f;
                }
                ?? r16 = r4;
                float f10 = ObtainAttributes.hasValue(2) ? ObtainAttributes.getFloat(2, -1.0f) : ObtainAttributes.getFloat(4, -1.0f);
                ObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr3 = new int[attributeCount];
                int i13 = i10;
                int i14 = i13;
                while (i13 < attributeCount) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i13);
                    if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != 2130968627 && attributeNameResource != 2130969337) {
                        int i15 = i14 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i13, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr3[i14] = attributeNameResource;
                        i14 = i15;
                    }
                    i13++;
                }
                int[] iArrTrimStateSet = StateSet.trimStateSet(iArr3, i14);
                float f11 = 100.0f;
                boolean z10 = (f10 < 0.0f || f10 > 100.0f) ? false : r16 == true ? 1 : 0;
                if (f3 != 1.0f || z10) {
                    int iK = rd.a.k((int) ((Color.alpha(color) * f3) + 0.5f), 0, 255);
                    if (z10) {
                        i1.a aVarA = i1.a.a(color);
                        float f12 = aVarA.f7080a;
                        float f13 = aVarA.f7081b;
                        j jVar = j.f12338k;
                        if (f13 >= 1.0d && Math.round(f10) > 0.0d && Math.round(f10) < 100.0d) {
                            float fMin = f12 < 0.0f ? 0.0f : Math.min(360.0f, f12);
                            float f14 = 0.0f;
                            float f15 = f13;
                            boolean z11 = r16 == true ? 1 : 0;
                            i1.a aVar = null;
                            while (true) {
                                if (Math.abs(f14 - f13) < 0.4f) {
                                    iArrTrimStateSet = iArrTrimStateSet;
                                    depth2 = depth2;
                                    if (aVar != null) {
                                        iE = aVar.d(jVar);
                                        break;
                                    }
                                    iE = a.e(f10);
                                    break;
                                }
                                float f16 = 1000.0f;
                                float f17 = f11;
                                float f18 = 0.0f;
                                float f19 = 1000.0f;
                                i1.a aVar2 = null;
                                while (true) {
                                    if (Math.abs(f18 - f17) <= 0.01f) {
                                        iArrTrimStateSet = iArrTrimStateSet;
                                        depth2 = depth2;
                                        f11 = f11;
                                        break;
                                    }
                                    f11 = f11;
                                    float f20 = ((f17 - f18) / 2.0f) + f18;
                                    iArrTrimStateSet = iArrTrimStateSet;
                                    int iD = i1.a.b(f20, f15, fMin).d(j.f12338k);
                                    float f21 = a.f(Color.red(iD));
                                    float f22 = a.f(Color.green(iD));
                                    float f23 = a.f(Color.blue(iD));
                                    float[] fArr = a.f12318d[r16 == true ? 1 : 0];
                                    float f24 = ((f23 * fArr[2]) + ((f22 * fArr[r16 == true ? 1 : 0]) + (f21 * fArr[0]))) / f11;
                                    float fCbrt = f24 <= 0.008856452f ? f24 * 903.2963f : (((float) Math.cbrt(f24)) * 116.0f) - 16.0f;
                                    float fAbs = Math.abs(f10 - fCbrt);
                                    if (fAbs < 0.2f) {
                                        i1.a aVarA2 = i1.a.a(iD);
                                        i1.a aVarB = i1.a.b(aVarA2.f7082c, aVarA2.f7081b, fMin);
                                        float f25 = aVarA2.f7083d - aVarB.f7083d;
                                        float f26 = aVarA2.f7084e - aVarB.f7084e;
                                        float f27 = aVarA2.f7085f - aVarB.f7085f;
                                        depth2 = depth2;
                                        float fPow = (float) (Math.pow(Math.sqrt((f27 * f27) + (f26 * f26) + (f25 * f25)), 0.63d) * 1.41d);
                                        if (fPow <= 1.0f) {
                                            f19 = fPow;
                                            f16 = fAbs;
                                            aVar2 = aVarA2;
                                        }
                                    } else {
                                        depth2 = depth2;
                                    }
                                    if (f16 == 0.0f && f19 == 0.0f) {
                                        break;
                                    }
                                    if (fCbrt < f10) {
                                        f18 = f20;
                                    } else {
                                        f17 = f20;
                                    }
                                    f11 = f11;
                                    iArrTrimStateSet = iArrTrimStateSet;
                                    depth2 = depth2;
                                }
                                i1.a aVar3 = aVar2;
                                if (!z11) {
                                    if (aVar3 == null) {
                                        f13 = f15;
                                    } else {
                                        aVar = aVar3;
                                        f14 = f15;
                                    }
                                    f15 = ((f13 - f14) / 2.0f) + f14;
                                } else {
                                    if (aVar3 != null) {
                                        iE = aVar3.d(jVar);
                                        break;
                                    }
                                    f15 = ((f13 - f14) / 2.0f) + f14;
                                    z11 = false;
                                }
                            }
                        } else {
                            iArrTrimStateSet = iArrTrimStateSet;
                            depth2 = depth2;
                            iE = a.e(f10);
                        }
                        color = iE;
                    } else {
                        iArrTrimStateSet = iArrTrimStateSet;
                        depth2 = depth2;
                    }
                    color = (16777215 & color) | (iK << 24);
                } else {
                    iArrTrimStateSet = iArrTrimStateSet;
                    depth2 = depth2;
                }
                int i16 = i11 + 1;
                if (i16 > iArr.length) {
                    int[] iArr4 = new int[i11 <= 4 ? 8 : i11 * 2];
                    System.arraycopy(iArr, 0, iArr4, 0, i11);
                    iArr = iArr4;
                }
                iArr[i11] = color;
                if (i16 > objArr.length) {
                    Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i11 > 4 ? i11 * 2 : 8);
                    System.arraycopy(objArr, 0, objArr2, 0, i11);
                    objArr = objArr2;
                }
                objArr[i11] = iArrTrimStateSet;
                objArr = (int[][]) objArr;
                i11 = i16;
                r4 = r16 == true ? 1 : 0;
                depth2 = depth2;
                i10 = 0;
            } else {
                int i17 = depth2;
                r4 = r4 == true ? 1 : 0;
                depth2 = i17;
                i10 = 0;
            }
        }
        int[] iArr5 = new int[i11];
        int[][] iArr6 = new int[i11][];
        System.arraycopy(iArr, 0, iArr5, 0, i11);
        System.arraycopy(objArr, 0, iArr6, 0, i11);
        return new ColorStateList(iArr6, iArr5);
    }
}

package p4;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import com.google.android.gms.cast.MediaError;
import i7.a0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public abstract class a {

    public static final float[][] f12315a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    public static final float[][] f12316b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    public static final float[] f12317c = {95.047f, 100.0f, 108.883f};

    public static final float[][] f12318d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    public static ColorStateList b(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
        if (!d(xmlPullParser, "tint")) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(1, typedValue);
        int i10 = typedValue.type;
        if (i10 == 2) {
            throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
        }
        if (i10 >= 28 && i10 <= 31) {
            return ColorStateList.valueOf(typedValue.data);
        }
        Resources resources = typedArray.getResources();
        int resourceId = typedArray.getResourceId(1, 0);
        ThreadLocal threadLocal = b.f12319a;
        try {
            return b.a(resources, resources.getXml(resourceId), theme);
        } catch (Exception e3) {
            Log.e("CSLCompat", "Failed to inflate ColorStateList.", e3);
            return null;
        }
    }

    public static c50.h c(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i10) {
        c50.h hVarF;
        if (d(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i10, typedValue);
            int i11 = typedValue.type;
            if (i11 >= 28 && i11 <= 31) {
                return new c50.h((Object) null, (Object) null, typedValue.data, 17);
            }
            try {
                hVarF = c50.h.f(typedArray.getResources(), typedArray.getResourceId(i10, 0), theme);
            } catch (Exception e3) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e3);
                hVarF = null;
            }
            if (hVarF != null) {
                return hVarF;
            }
        }
        return new c50.h((Object) null, (Object) null, 0, 17);
    }

    public static boolean d(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static int e(float f3) {
        if (f3 < 1.0f) {
            return -16777216;
        }
        if (f3 > 99.0f) {
            return -1;
        }
        float f10 = (f3 + 16.0f) / 116.0f;
        float f11 = f3 > 8.0f ? f10 * f10 * f10 : f3 / 903.2963f;
        float f12 = f10 * f10 * f10;
        boolean z10 = f12 > 0.008856452f;
        float f13 = z10 ? f12 : ((f10 * 116.0f) - 16.0f) / 903.2963f;
        if (!z10) {
            f12 = ((f10 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f12317c;
        return q4.a.b(f13 * fArr[0], f11 * fArr[1], f12 * fArr[2]);
    }

    public static float f(int i10) {
        float f3 = i10 / 255.0f;
        return (f3 <= 0.04045f ? f3 / 12.92f : (float) Math.pow((f3 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    public static TypedArray g(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static c j(XmlResourceParser xmlResourceParser, Resources resources) {
        int next;
        int i10;
        TypedArray typedArray;
        Throwable th2;
        do {
            next = xmlResourceParser.next();
            i10 = 2;
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (!xmlResourceParser.getName().equals("font-family")) {
            l(xmlResourceParser);
            return null;
        }
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), m4.a.f10555b);
        int i11 = 0;
        String string = typedArrayObtainAttributes.getString(0);
        String string2 = typedArrayObtainAttributes.getString(5);
        String string3 = typedArrayObtainAttributes.getString(6);
        String string4 = typedArrayObtainAttributes.getString(2);
        int resourceId = typedArrayObtainAttributes.getResourceId(1, 0);
        int i12 = 3;
        int integer = typedArrayObtainAttributes.getInteger(3, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(4, MediaError.DetailedErrorCode.SEGMENT_UNKNOWN);
        String string5 = typedArrayObtainAttributes.getString(7);
        typedArrayObtainAttributes.recycle();
        if (string == null || string2 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlResourceParser.next() != 3) {
                if (xmlResourceParser.getEventType() == 2) {
                    if (xmlResourceParser.getName().equals("font")) {
                        TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), m4.a.f10556c);
                        int i13 = typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(8) ? 8 : 1, MediaError.DetailedErrorCode.MANIFEST_UNKNOWN);
                        boolean z10 = 1 == typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(6) ? 6 : 2, 0);
                        int i14 = typedArrayObtainAttributes2.hasValue(9) ? 9 : 3;
                        String string6 = typedArrayObtainAttributes2.getString(typedArrayObtainAttributes2.hasValue(7) ? 7 : 4);
                        int i15 = typedArrayObtainAttributes2.getInt(i14, 0);
                        int i16 = typedArrayObtainAttributes2.hasValue(5) ? 5 : 0;
                        int resourceId2 = typedArrayObtainAttributes2.getResourceId(i16, 0);
                        String string7 = typedArrayObtainAttributes2.getString(i16);
                        typedArrayObtainAttributes2.recycle();
                        while (xmlResourceParser.next() != 3) {
                            l(xmlResourceParser);
                        }
                        arrayList.add(new e(i13, i15, resourceId2, string7, string6, z10));
                    } else {
                        l(xmlResourceParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new d((e[]) arrayList.toArray(new e[0]));
        }
        List listK = k(resources, resourceId);
        ArrayList arrayList2 = new ArrayList();
        while (xmlResourceParser.next() != i12) {
            if (xmlResourceParser.getEventType() == i10) {
                if (xmlResourceParser.getName().equals("fallback")) {
                    TypedArray typedArrayObtainAttributes3 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), m4.a.f10557d);
                    try {
                        String string8 = typedArrayObtainAttributes3.getString(i11);
                        String string9 = typedArrayObtainAttributes3.getString(1);
                        String string10 = typedArrayObtainAttributes3.getString(i10);
                        if (string8 == null) {
                            typedArray = typedArrayObtainAttributes3;
                            throw new XmlPullParserException("query attribute must be set in fallback element");
                        }
                        while (xmlResourceParser.next() != i12) {
                            try {
                                l(xmlResourceParser);
                            } catch (Throwable th3) {
                                th2 = th3;
                                typedArray = typedArrayObtainAttributes3;
                            }
                        }
                        try {
                            typedArray = typedArrayObtainAttributes3;
                            try {
                                v4.c cVar = new v4.c(string, string2, string8, listK, string9, string10);
                                typedArray.close();
                                arrayList2.add(cVar);
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            typedArray = typedArrayObtainAttributes3;
                        }
                        th = th4;
                    } catch (Throwable th6) {
                        th = th6;
                        typedArray = typedArrayObtainAttributes3;
                    }
                    th2 = th;
                    if (typedArray == null) {
                        throw th2;
                    }
                    try {
                        typedArray.close();
                        throw th2;
                    } catch (Throwable th7) {
                        th2.addSuppressed(th7);
                        throw th2;
                    }
                }
                l(xmlResourceParser);
                i12 = i12;
                integer = integer;
                i10 = 2;
                i11 = 0;
            }
        }
        int i17 = integer;
        if (!arrayList2.isEmpty()) {
            return new f(arrayList2, i17, integer2, string5);
        }
        if (string3 == null) {
            throw new IllegalArgumentException("The provider font XML requires query attribute or fallback children.");
        }
        arrayList2.add(new v4.c(string, string2, string3, listK, null, null));
        if (string4 != null) {
            arrayList2.add(new v4.c(string, string2, string4, listK, null, null));
        }
        return new f(arrayList2, i17, integer2, string5);
    }

    public static List k(Resources resources, int i10) {
        if (i10 == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i10);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (typedArrayObtainTypedArray.getType(0) == 1) {
                for (int i11 = 0; i11 < typedArrayObtainTypedArray.length(); i11++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i11, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i10);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    public static void l(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i10 = 1;
        while (i10 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i10++;
            } else if (next == 3) {
                i10--;
            }
        }
    }

    public static float m() {
        return ((float) Math.pow((((double) 50.0f) + 16.0d) / 116.0d, 3.0d)) * 100.0f;
    }

    public void a(int i10) {
        new Handler(Looper.getMainLooper()).post(new a0(this, i10, 3));
    }

    public abstract void h(int i10);

    public abstract void i(Typeface typeface);
}

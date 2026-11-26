package j4;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import android.util.Xml;
import java.util.HashMap;

public final class b {

    public boolean f8008a = false;

    public int f8009b;

    public int f8010c;

    public float f8011d;

    public String f8012e;

    public boolean f8013f;

    public int f8014g;

    public b(b bVar, Object obj) {
        bVar.getClass();
        this.f8009b = bVar.f8009b;
        b(obj);
    }

    public static void a(Context context, XmlResourceParser xmlResourceParser, HashMap map) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), r.f8159d);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        String string = null;
        int i10 = 0;
        boolean z10 = false;
        Object objValueOf = null;
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i11);
            int i12 = 1;
            if (index == 0) {
                string = typedArrayObtainStyledAttributes.getString(index);
                if (string != null && string.length() > 0) {
                    string = Character.toUpperCase(string.charAt(0)) + string.substring(1);
                }
            } else if (index == 10) {
                string = typedArrayObtainStyledAttributes.getString(index);
                z10 = true;
            } else if (index == 1) {
                objValueOf = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(index, false));
                i10 = 6;
            } else {
                int i13 = 3;
                if (index == 3) {
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else {
                    i13 = 4;
                    if (index == 2) {
                        objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                    } else {
                        if (index == 7) {
                            objValueOf = Float.valueOf(TypedValue.applyDimension(1, typedArrayObtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                        } else if (index == 4) {
                            objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                        } else {
                            i13 = 5;
                            if (index == 5) {
                                objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, Float.NaN));
                                i10 = 2;
                            } else {
                                if (index == 6) {
                                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getInteger(index, -1));
                                } else if (index == 9) {
                                    objValueOf = typedArrayObtainStyledAttributes.getString(index);
                                } else {
                                    i12 = 8;
                                    if (index == 8) {
                                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                        if (resourceId == -1) {
                                            resourceId = typedArrayObtainStyledAttributes.getInt(index, -1);
                                        }
                                        objValueOf = Integer.valueOf(resourceId);
                                    }
                                }
                                i10 = i12;
                            }
                        }
                        i10 = 7;
                    }
                }
                i10 = i13;
            }
        }
        if (string != null && objValueOf != null) {
            b bVar = new b();
            bVar.f8009b = i10;
            bVar.f8008a = z10;
            bVar.b(objValueOf);
            map.put(string, bVar);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void b(Object obj) {
        switch (e4.f.b(this.f8009b)) {
            case 0:
            case 7:
                this.f8010c = ((Integer) obj).intValue();
                break;
            case 1:
                this.f8011d = ((Float) obj).floatValue();
                break;
            case 2:
            case 3:
                this.f8014g = ((Integer) obj).intValue();
                break;
            case 4:
                this.f8012e = (String) obj;
                break;
            case 5:
                this.f8013f = ((Boolean) obj).booleanValue();
                break;
            case 6:
                this.f8011d = ((Float) obj).floatValue();
                break;
        }
    }
}

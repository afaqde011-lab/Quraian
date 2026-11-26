package p4;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.TypedValue;
import java.io.IOException;
import java.util.WeakHashMap;
import oi.p;
import org.xmlpull.v1.XmlPullParserException;

public abstract class i {

    public static final ThreadLocal f12335a = new ThreadLocal();

    public static final WeakHashMap f12336b = new WeakHashMap(0);

    public static final Object f12337c = new Object();

    public static Typeface a(Context context, int i10) {
        if (context.isRestricted()) {
            return null;
        }
        return b(context, i10, new TypedValue(), 0, null, false, false);
    }

    public static Typeface b(Context context, int i10, TypedValue typedValue, int i11, a aVar, boolean z10, boolean z11) {
        Resources resources = context.getResources();
        resources.getValue(i10, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i10) + "\" (" + Integer.toHexString(i10) + ") is not a Font: " + typedValue);
        }
        String string = charSequence.toString();
        Typeface typefaceB = null;
        if (string.startsWith("res/")) {
            Typeface typeface = (Typeface) q4.d.f12762b.c(q4.d.d(resources, i10, string, typedValue.assetCookie, i11));
            if (typeface != null) {
                if (aVar != null) {
                    new Handler(Looper.getMainLooper()).post(new p(aVar, typeface, 3));
                }
                typefaceB = typeface;
            } else if (!z11) {
                try {
                    if (string.toLowerCase().endsWith(".xml")) {
                        c cVarJ = a.j(resources.getXml(i10), resources);
                        if (cVarJ == null) {
                            Log.e("ResourcesCompat", "Failed to find font-family tag");
                            if (aVar != null) {
                                aVar.a(-3);
                            }
                        } else {
                            typefaceB = q4.d.b(context, cVarJ, resources, i10, string, typedValue.assetCookie, i11, aVar, z10);
                        }
                    } else {
                        Typeface typefaceC = q4.d.c(resources, i10, string, typedValue.assetCookie, i11);
                        if (aVar != null) {
                            if (typefaceC != null) {
                                new Handler(Looper.getMainLooper()).post(new p(aVar, typefaceC, 3));
                            } else {
                                aVar.a(-3);
                            }
                        }
                        typefaceB = typefaceC;
                    }
                } catch (IOException e3) {
                    Log.e("ResourcesCompat", "Failed to read xml resource ".concat(string), e3);
                    if (aVar != null) {
                        aVar.a(-3);
                    }
                } catch (XmlPullParserException e10) {
                    Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(string), e10);
                    if (aVar != null) {
                        aVar.a(-3);
                    }
                }
            }
        } else if (aVar != null) {
            aVar.a(-3);
        }
        if (typefaceB != null || aVar != null || z11) {
            return typefaceB;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i10) + " could not be retrieved.");
    }
}

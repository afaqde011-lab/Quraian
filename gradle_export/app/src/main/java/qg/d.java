package qg;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import com.google.android.gms.internal.measurement.b5;
import com.google.android.gms.internal.measurement.g4;
import p4.i;

public final class d {

    public final ColorStateList f12991a;

    public final String f12992b;

    public final String f12993c;

    public final int f12994d;

    public final int f12995e;

    public final float f12996f;

    public final float f12997g;

    public final float f12998h;

    public final boolean f12999i;

    public final float f13000j;

    public final ColorStateList f13001k;
    public float l;
    public final int m;

    public boolean f13002n = false;

    public boolean f13003o = false;

    public Typeface f13004p;

    public d(Context context, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, j.a.f7735v);
        this.l = typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
        this.f13001k = g4.J(context, typedArrayObtainStyledAttributes, 3);
        g4.J(context, typedArrayObtainStyledAttributes, 4);
        g4.J(context, typedArrayObtainStyledAttributes, 5);
        this.f12994d = typedArrayObtainStyledAttributes.getInt(2, 0);
        this.f12995e = typedArrayObtainStyledAttributes.getInt(1, 1);
        int i11 = typedArrayObtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.m = typedArrayObtainStyledAttributes.getResourceId(i11, 0);
        this.f12992b = typedArrayObtainStyledAttributes.getString(i11);
        typedArrayObtainStyledAttributes.getBoolean(14, false);
        this.f12991a = g4.J(context, typedArrayObtainStyledAttributes, 6);
        this.f12996f = typedArrayObtainStyledAttributes.getFloat(7, 0.0f);
        this.f12997g = typedArrayObtainStyledAttributes.getFloat(8, 0.0f);
        this.f12998h = typedArrayObtainStyledAttributes.getFloat(9, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i10, zf.a.f17444t);
        this.f12999i = typedArrayObtainStyledAttributes2.hasValue(0);
        this.f13000j = typedArrayObtainStyledAttributes2.getFloat(0, 0.0f);
        this.f12993c = typedArrayObtainStyledAttributes2.getString(typedArrayObtainStyledAttributes2.hasValue(3) ? 3 : 1);
        typedArrayObtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        Typeface typeface = this.f13004p;
        int i10 = this.f12994d;
        if (typeface == null && (str = this.f12992b) != null) {
            this.f13004p = Typeface.create(str, i10);
        }
        if (this.f13004p == null) {
            int i11 = this.f12995e;
            if (i11 == 1) {
                this.f13004p = Typeface.SANS_SERIF;
            } else if (i11 == 2) {
                this.f13004p = Typeface.SERIF;
            } else if (i11 != 3) {
                this.f13004p = Typeface.DEFAULT;
            } else {
                this.f13004p = Typeface.MONOSPACE;
            }
            this.f13004p = Typeface.create(this.f13004p, i10);
        }
    }

    public final void b(Context context, b5 b5Var) {
        if (!c(context)) {
            a();
        }
        int i10 = this.m;
        if (i10 == 0) {
            this.f13002n = true;
        }
        if (this.f13002n) {
            b5Var.F(this.f13004p, true);
            return;
        }
        try {
            b bVar = new b(this, b5Var);
            ThreadLocal threadLocal = i.f12335a;
            if (context.isRestricted()) {
                bVar.a(-4);
            } else {
                i.b(context, i10, new TypedValue(), 0, bVar, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f13002n = true;
            b5Var.E(1);
        } catch (Exception e3) {
            Log.d("TextAppearance", "Error loading font " + this.f12992b, e3);
            this.f13002n = true;
            b5Var.E(-3);
        }
    }

    public final boolean c(Context context) {
        Context context2;
        Typeface typefaceB;
        String string;
        Typeface typefaceCreate;
        if (this.f13002n) {
            return true;
        }
        int i10 = this.m;
        if (i10 != 0) {
            ThreadLocal threadLocal = i.f12335a;
            Typeface typefaceCreate2 = null;
            if (context.isRestricted()) {
                context2 = context;
                typefaceB = null;
            } else {
                context2 = context;
                typefaceB = i.b(context2, i10, new TypedValue(), 0, null, false, true);
            }
            if (typefaceB != null) {
                this.f13004p = typefaceB;
                this.f13002n = true;
                return true;
            }
            if (!this.f13003o) {
                this.f13003o = true;
                Resources resources = context2.getResources();
                int i11 = this.m;
                if (i11 == 0 || !resources.getResourceTypeName(i11).equals("font")) {
                    string = null;
                    break;
                }
                try {
                    XmlResourceParser xml = resources.getXml(i11);
                    while (true) {
                        if (xml.getEventType() == 1) {
                            string = null;
                            break;
                        }
                        if (xml.getEventType() == 2 && xml.getName().equals("font-family")) {
                            TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xml), m4.a.f10555b);
                            string = typedArrayObtainAttributes.getString(7);
                            typedArrayObtainAttributes.recycle();
                            break;
                        }
                        xml.next();
                        string = null;
                        break;
                    }
                } catch (Throwable unused) {
                }
                if (string != null && (typefaceCreate = Typeface.create(string, 0)) != Typeface.DEFAULT) {
                    typefaceCreate2 = Typeface.create(typefaceCreate, this.f12994d);
                }
            }
            if (typefaceCreate2 != null) {
                this.f13004p = typefaceCreate2;
                this.f13002n = true;
                return true;
            }
        }
        return false;
    }

    public final void d(Context context, TextPaint textPaint, b5 b5Var) {
        e(context, textPaint, b5Var);
        ColorStateList colorStateList = this.f13001k;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.f12991a;
        textPaint.setShadowLayer(this.f12998h, this.f12996f, this.f12997g, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void e(Context context, TextPaint textPaint, b5 b5Var) {
        Typeface typeface;
        if (c(context) && this.f13002n && (typeface = this.f13004p) != null) {
            f(context, textPaint, typeface);
            return;
        }
        a();
        f(context, textPaint, this.f13004p);
        b(context, new c(this, context, textPaint, b5Var));
    }

    public final void f(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface typefaceP = f50.c.P(context.getResources().getConfiguration(), typeface);
        if (typefaceP != null) {
            typeface = typefaceP;
        }
        textPaint.setTypeface(typeface);
        int i10 = (~typeface.getStyle()) & this.f12994d;
        textPaint.setFakeBoldText((i10 & 1) != 0);
        textPaint.setTextSkewX((i10 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.l);
        textPaint.setFontVariationSettings(this.f12993c);
        if (this.f12999i) {
            textPaint.setLetterSpacing(this.f13000j);
        }
    }
}

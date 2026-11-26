package l1;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import android.widget.TextView;
import java.util.WeakHashMap;
import kotlin.KotlinNothingValueException;

public final class q1 {

    public final int f9909a;

    public boolean f9910b;

    public boolean f9911c;

    public boolean f9912d;

    public final Object f9913e;

    public Object f9914f;

    public Object f9915g;

    public q1(TextView textView, int i10) {
        this.f9909a = i10;
        this.f9914f = null;
        this.f9915g = null;
        this.f9910b = false;
        this.f9911c = false;
        this.f9913e = textView;
    }

    public q1(p1 p1Var, Object obj, boolean z10, k2 k2Var, boolean z11) {
        this.f9909a = 0;
        this.f9913e = p1Var;
        this.f9910b = z10;
        this.f9914f = k2Var;
        this.f9911c = z11;
        this.f9915g = obj;
        this.f9912d = true;
    }

    public q1(boolean z10, boolean z11, String str, String str2, boolean z12, q40.a aVar) {
        this.f9909a = 3;
        kotlin.jvm.internal.m.e(str, "prettyPrintIndent");
        kotlin.jvm.internal.m.e(str2, "classDiscriminator");
        kotlin.jvm.internal.m.e(aVar, "classDiscriminatorMode");
        this.f9910b = z10;
        this.f9911c = z11;
        this.f9913e = str;
        this.f9914f = str2;
        this.f9912d = z12;
        this.f9915g = aVar;
    }

    public void a() {
        CompoundButton compoundButton = (CompoundButton) this.f9913e;
        Drawable buttonDrawable = compoundButton.getButtonDrawable();
        if (buttonDrawable != null) {
            if (this.f9910b || this.f9911c) {
                Drawable drawableMutate = buttonDrawable.mutate();
                if (this.f9910b) {
                    drawableMutate.setTintList((ColorStateList) this.f9914f);
                }
                if (this.f9911c) {
                    drawableMutate.setTintMode((PorterDuff.Mode) this.f9915g);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(drawableMutate);
            }
        }
    }

    public void b() {
        p.q qVar = (p.q) this.f9913e;
        Drawable checkMarkDrawable = qVar.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f9910b || this.f9911c) {
                Drawable drawableMutate = checkMarkDrawable.mutate();
                if (this.f9910b) {
                    drawableMutate.setTintList((ColorStateList) this.f9914f);
                }
                if (this.f9911c) {
                    drawableMutate.setTintMode((PorterDuff.Mode) this.f9915g);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(qVar.getDrawableState());
                }
                qVar.setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    public Object c() throws KotlinNothingValueException {
        if (this.f9910b) {
            return null;
        }
        Object obj = this.f9915g;
        if (obj != null) {
            return obj;
        }
        l.b("Unexpected form of a provided value");
        throw new KotlinNothingValueException();
    }

    public void d(AttributeSet attributeSet, int i10) {
        int resourceId;
        int resourceId2;
        CompoundButton compoundButton = (CompoundButton) this.f9913e;
        Context context = compoundButton.getContext();
        int[] iArr = j.a.m;
        k9.x0 x0VarK = k9.x0.K(context, attributeSet, iArr, i10);
        TypedArray typedArray = (TypedArray) x0VarK.C;
        Context context2 = compoundButton.getContext();
        TypedArray typedArray2 = (TypedArray) x0VarK.C;
        WeakHashMap weakHashMap = z4.j0.f17198a;
        z4.h0.b(compoundButton, context2, iArr, attributeSet, typedArray2, i10, 0);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(p30.f.f0(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(0)) {
                        compoundButton.setButtonDrawable(p30.f.f0(compoundButton.getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(p30.f.f0(compoundButton.getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                compoundButton.setButtonTintList(x0VarK.t(2));
            }
            if (typedArray.hasValue(3)) {
                compoundButton.setButtonTintMode(p.e1.a(typedArray.getInt(3, -1), null));
            }
        } finally {
            x0VarK.O();
        }
    }

    public String toString() {
        switch (this.f9909a) {
            case 3:
                return "JsonConfiguration(encodeDefaults=false, ignoreUnknownKeys=" + this.f9910b + ", isLenient=false, allowStructuredMapKeys=false, prettyPrint=false, explicitNulls=" + this.f9911c + ", prettyPrintIndent='" + ((String) this.f9913e) + "', coerceInputValues=false, useArrayPolymorphism=false, classDiscriminator='" + ((String) this.f9914f) + "', allowSpecialFloatingPointValues=false, useAlternativeNames=" + this.f9912d + ", namingStrategy=null, decodeEnumsCaseInsensitive=false, allowTrailingComma=false, allowComments=false, classDiscriminatorMode=" + ((q40.a) this.f9915g) + ')';
            default:
                return super.toString();
        }
    }
}

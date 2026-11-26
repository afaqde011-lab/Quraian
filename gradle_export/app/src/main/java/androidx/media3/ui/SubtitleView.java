package androidx.media3.ui;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import d7.a;
import d7.b;
import d7.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import m9.d;
import m9.e;
import m9.j0;
import m9.p0;

public final class SubtitleView extends FrameLayout {
    public List A;
    public e B;
    public float C;
    public float D;
    public boolean E;
    public boolean F;
    public int G;
    public j0 H;
    public View I;

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A = Collections.EMPTY_LIST;
        this.B = e.f10647g;
        this.C = 0.0533f;
        this.D = 0.08f;
        this.E = true;
        this.F = true;
        d dVar = new d(context, 0);
        this.H = dVar;
        this.I = dVar;
        addView(dVar);
        this.G = 1;
    }

    private List<b> getCuesWithStylingPreferencesApplied() {
        if (this.E && this.F) {
            return this.A;
        }
        ArrayList arrayList = new ArrayList(this.A.size());
        for (int i10 = 0; i10 < this.A.size(); i10++) {
            a aVarA = ((b) this.A.get(i10)).a();
            if (!this.E) {
                aVarA.f4734n = false;
                CharSequence charSequence = aVarA.f4723a;
                if (charSequence instanceof Spanned) {
                    if (!(charSequence instanceof Spannable)) {
                        aVarA.f4723a = SpannableString.valueOf(charSequence);
                        aVarA.f4724b = null;
                    }
                    CharSequence charSequence2 = aVarA.f4723a;
                    charSequence2.getClass();
                    Spannable spannable = (Spannable) charSequence2;
                    for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                        if (!(obj instanceof f)) {
                            spannable.removeSpan(obj);
                        }
                    }
                }
                a.a.Z(aVarA);
            } else if (!this.F) {
                a.a.Z(aVarA);
            }
            arrayList.add(aVarA.a());
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private e getUserCaptionStyle() {
        CaptioningManager captioningManager;
        boolean zIsInEditMode = isInEditMode();
        e eVar = e.f10647g;
        if (zIsInEditMode || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return eVar;
        }
        CaptioningManager.CaptionStyle userStyle = captioningManager.getUserStyle();
        return new e(userStyle.hasForegroundColor() ? userStyle.foregroundColor : -1, userStyle.hasBackgroundColor() ? userStyle.backgroundColor : -16777216, userStyle.hasWindowColor() ? userStyle.windowColor : 0, userStyle.hasEdgeType() ? userStyle.edgeType : 0, userStyle.hasEdgeColor() ? userStyle.edgeColor : -1, userStyle.getTypeface());
    }

    private <T extends View & j0> void setView(T t4) {
        removeView(this.I);
        View view = this.I;
        if (view instanceof p0) {
            ((p0) view).B.destroy();
        }
        this.I = t4;
        this.H = t4;
        addView(t4);
    }

    public final void a() {
        setStyle(getUserCaptionStyle());
    }

    public final void b() {
        setFractionalTextSize(getUserCaptionFontScale() * 0.0533f);
    }

    public final void c() {
        this.H.a(getCuesWithStylingPreferencesApplied(), this.B, this.C, this.D);
    }

    public void setApplyEmbeddedFontSizes(boolean z10) {
        this.F = z10;
        c();
    }

    public void setApplyEmbeddedStyles(boolean z10) {
        this.E = z10;
        c();
    }

    public void setBottomPaddingFraction(float f3) {
        this.D = f3;
        c();
    }

    public void setCues(List<b> list) {
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        this.A = list;
        c();
    }

    public void setFractionalTextSize(float f3) {
        this.C = f3;
        c();
    }

    public void setStyle(e eVar) {
        this.B = eVar;
        c();
    }

    public void setViewType(int i10) {
        if (this.G == i10) {
            return;
        }
        if (i10 == 1) {
            setView(new d(getContext(), 0));
        } else {
            if (i10 != 2) {
                throw new IllegalArgumentException();
            }
            setView(new p0(getContext()));
        }
        this.G = i10;
    }
}

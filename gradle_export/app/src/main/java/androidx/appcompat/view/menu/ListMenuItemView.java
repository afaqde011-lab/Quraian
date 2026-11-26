package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.google.android.gms.cast.Cast;
import com.google.protobuf.RuntimeVersion;
import j.a;
import k9.x0;
import o.l;
import o.n;
import o.y;

public class ListMenuItemView extends LinearLayout implements y, AbsListView.SelectionBoundsAdjuster {
    public n A;
    public ImageView B;
    public RadioButton C;
    public TextView D;
    public CheckBox E;
    public TextView F;
    public ImageView G;
    public ImageView H;
    public LinearLayout I;
    public final Drawable J;
    public final int K;
    public final Context L;
    public boolean M;
    public final Drawable N;
    public final boolean O;
    public LayoutInflater P;
    public boolean Q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        x0 x0VarK = x0.K(getContext(), attributeSet, a.f7731r, 2130969433);
        this.J = x0VarK.v(5);
        TypedArray typedArray = (TypedArray) x0VarK.C;
        this.K = typedArray.getResourceId(1, -1);
        this.M = typedArray.getBoolean(7, false);
        this.L = context;
        this.N = x0VarK.v(8);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, 2130969079, 0);
        this.O = typedArrayObtainStyledAttributes.hasValue(0);
        x0VarK.O();
        typedArrayObtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.P == null) {
            this.P = LayoutInflater.from(getContext());
        }
        return this.P;
    }

    private void setSubMenuArrowVisible(boolean z10) {
        ImageView imageView = this.G;
        if (imageView != null) {
            imageView.setVisibility(z10 ? 0 : 8);
        }
    }

    @Override
    public final void a(n nVar) {
        boolean z10;
        int i10;
        String string;
        boolean z11;
        this.A = nVar;
        boolean zIsVisible = nVar.isVisible();
        l lVar = nVar.f11435n;
        setVisibility(zIsVisible ? 0 : 8);
        setTitle(nVar.f11428e);
        setCheckable(nVar.isCheckable());
        if (lVar.o()) {
            if ((lVar.n() ? nVar.f11433j : nVar.f11431h) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        lVar.n();
        if (z10) {
            n nVar2 = this.A;
            l lVar2 = nVar2.f11435n;
            if (lVar2.o()) {
                if ((lVar2.n() ? nVar2.f11433j : nVar2.f11431h) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            } else {
                z11 = false;
            }
            i10 = z11 ? 0 : 8;
        }
        if (i10 == 0) {
            TextView textView = this.F;
            n nVar3 = this.A;
            l lVar3 = nVar3.f11435n;
            Context context = lVar3.f11402a;
            char c10 = lVar3.n() ? nVar3.f11433j : nVar3.f11431h;
            if (c10 == 0) {
                string = RuntimeVersion.SUFFIX;
            } else {
                Resources resources = context.getResources();
                StringBuilder sb2 = new StringBuilder();
                if (ViewConfiguration.get(context).hasPermanentMenuKey()) {
                    sb2.append(resources.getString(2131886097));
                }
                int i11 = lVar3.n() ? nVar3.f11434k : nVar3.f11432i;
                n.c(sb2, i11, Cast.MAX_MESSAGE_LENGTH, resources.getString(2131886093));
                n.c(sb2, i11, 4096, resources.getString(2131886089));
                n.c(sb2, i11, 2, resources.getString(2131886088));
                n.c(sb2, i11, 1, resources.getString(2131886094));
                n.c(sb2, i11, 4, resources.getString(2131886096));
                n.c(sb2, i11, 8, resources.getString(2131886092));
                if (c10 == '\b') {
                    sb2.append(resources.getString(2131886090));
                } else if (c10 == '\n') {
                    sb2.append(resources.getString(2131886091));
                } else if (c10 != ' ') {
                    sb2.append(c10);
                } else {
                    sb2.append(resources.getString(2131886095));
                }
                string = sb2.toString();
            }
            textView.setText(string);
        }
        if (this.F.getVisibility() != i10) {
            this.F.setVisibility(i10);
        }
        setIcon(nVar.getIcon());
        setEnabled(nVar.isEnabled());
        setSubMenuArrowVisible(nVar.hasSubMenu());
        setContentDescription(nVar.f11438q);
    }

    @Override
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.H;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.H.getLayoutParams();
        rect.top = this.H.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    @Override
    public n getItemData() {
        return this.A;
    }

    @Override
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.J);
        TextView textView = (TextView) findViewById(2131363094);
        this.D = textView;
        int i10 = this.K;
        if (i10 != -1) {
            textView.setTextAppearance(this.L, i10);
        }
        this.F = (TextView) findViewById(2131363005);
        ImageView imageView = (ImageView) findViewById(2131363048);
        this.G = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.N);
        }
        this.H = (ImageView) findViewById(2131362720);
        this.I = (LinearLayout) findViewById(2131362069);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (this.B != null && this.M) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.B.getLayoutParams();
            int i12 = layoutParams.height;
            if (i12 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i12;
            }
        }
        super.onMeasure(i10, i11);
    }

    public void setCheckable(boolean z10) {
        CompoundButton compoundButton;
        View view;
        if (!z10 && this.C == null && this.E == null) {
            return;
        }
        if ((this.A.f11445x & 4) != 0) {
            if (this.C == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(2131558417, (ViewGroup) this, false);
                this.C = radioButton;
                LinearLayout linearLayout = this.I;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.C;
            view = this.E;
        } else {
            if (this.E == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(2131558414, (ViewGroup) this, false);
                this.E = checkBox;
                LinearLayout linearLayout2 = this.I;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.E;
            view = this.C;
        }
        if (z10) {
            compoundButton.setChecked(this.A.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.E;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.C;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z10) {
        CompoundButton compoundButton;
        if ((this.A.f11445x & 4) != 0) {
            if (this.C == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(2131558417, (ViewGroup) this, false);
                this.C = radioButton;
                LinearLayout linearLayout = this.I;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.C;
        } else {
            if (this.E == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(2131558414, (ViewGroup) this, false);
                this.E = checkBox;
                LinearLayout linearLayout2 = this.I;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.E;
        }
        compoundButton.setChecked(z10);
    }

    public void setForceShowIcon(boolean z10) {
        this.Q = z10;
        this.M = z10;
    }

    public void setGroupDividerEnabled(boolean z10) {
        ImageView imageView = this.H;
        if (imageView != null) {
            imageView.setVisibility((this.O || !z10) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        l lVar = this.A.f11435n;
        boolean z10 = this.Q;
        if (z10 || this.M) {
            ImageView imageView = this.B;
            if (imageView == null && drawable == null && !this.M) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(2131558415, (ViewGroup) this, false);
                this.B = imageView2;
                LinearLayout linearLayout = this.I;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.M) {
                this.B.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.B;
            if (!z10) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.B.getVisibility() != 0) {
                this.B.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.D.getVisibility() != 8) {
                this.D.setVisibility(8);
            }
        } else {
            this.D.setText(charSequence);
            if (this.D.getVisibility() != 0) {
                this.D.setVisibility(0);
            }
        }
    }
}

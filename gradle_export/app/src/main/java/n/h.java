package n;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;
import o.s;

public final class h {
    public CharSequence A;
    public CharSequence B;
    public final i E;

    public final Menu f10958a;

    public boolean f10965h;

    public int f10966i;

    public int f10967j;

    public CharSequence f10968k;
    public CharSequence l;
    public int m;

    public char f10969n;

    public int f10970o;

    public char f10971p;

    public int f10972q;

    public int f10973r;

    public boolean f10974s;

    public boolean f10975t;

    public boolean f10976u;

    public int f10977v;

    public int f10978w;

    public String f10979x;

    public String f10980y;

    public z4.c f10981z;
    public ColorStateList C = null;
    public PorterDuff.Mode D = null;

    public int f10959b = 0;

    public int f10960c = 0;

    public int f10961d = 0;

    public int f10962e = 0;

    public boolean f10963f = true;

    public boolean f10964g = true;

    public h(i iVar, Menu menu) {
        this.E = iVar;
        this.f10958a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.E.f10986c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e3) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e3);
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        i iVar = this.E;
        Context context = iVar.f10986c;
        boolean z10 = false;
        menuItem.setChecked(this.f10974s).setVisible(this.f10975t).setEnabled(this.f10976u).setCheckable(this.f10973r >= 1).setTitleCondensed(this.l).setIcon(this.m);
        int i10 = this.f10977v;
        if (i10 >= 0) {
            menuItem.setShowAsAction(i10);
        }
        if (this.f10980y != null) {
            if (context.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (iVar.f10987d == null) {
                iVar.f10987d = i.a(context);
            }
            Object obj = iVar.f10987d;
            String str = this.f10980y;
            g gVar = new g();
            gVar.f10956a = obj;
            Class<?> cls = obj.getClass();
            try {
                gVar.f10957b = cls.getMethod(str, g.f10955c);
                menuItem.setOnMenuItemClickListener(gVar);
            } catch (Exception e3) {
                StringBuilder sbN = g4.c.n("Couldn't resolve menu item onClick handler ", str, " in class ");
                sbN.append(cls.getName());
                InflateException inflateException = new InflateException(sbN.toString());
                inflateException.initCause(e3);
                throw inflateException;
            }
        }
        if (this.f10973r >= 2) {
            if (menuItem instanceof o.n) {
                o.n nVar = (o.n) menuItem;
                nVar.f11445x = (nVar.f11445x & (-5)) | 4;
            } else if (menuItem instanceof s) {
                s sVar = (s) menuItem;
                s4.a aVar = sVar.f11454c;
                try {
                    if (sVar.f11455d == null) {
                        sVar.f11455d = aVar.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    sVar.f11455d.invoke(aVar, Boolean.TRUE);
                } catch (Exception e10) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e10);
                }
            }
        }
        String str2 = this.f10979x;
        if (str2 != null) {
            menuItem.setActionView((View) a(str2, i.f10982e, iVar.f10984a));
            z10 = true;
        }
        int i11 = this.f10978w;
        if (i11 > 0) {
            if (z10) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i11);
            }
        }
        z4.c cVar = this.f10981z;
        if (cVar != null) {
            if (menuItem instanceof s4.a) {
                ((s4.a) menuItem).b(cVar);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.A;
        boolean z11 = menuItem instanceof s4.a;
        if (z11) {
            ((s4.a) menuItem).setContentDescription(charSequence);
        } else {
            menuItem.setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.B;
        if (z11) {
            ((s4.a) menuItem).setTooltipText(charSequence2);
        } else {
            menuItem.setTooltipText(charSequence2);
        }
        char c10 = this.f10969n;
        int i12 = this.f10970o;
        if (z11) {
            ((s4.a) menuItem).setAlphabeticShortcut(c10, i12);
        } else {
            menuItem.setAlphabeticShortcut(c10, i12);
        }
        char c11 = this.f10971p;
        int i13 = this.f10972q;
        if (z11) {
            ((s4.a) menuItem).setNumericShortcut(c11, i13);
        } else {
            menuItem.setNumericShortcut(c11, i13);
        }
        PorterDuff.Mode mode = this.D;
        if (mode != null) {
            if (z11) {
                ((s4.a) menuItem).setIconTintMode(mode);
            } else {
                menuItem.setIconTintMode(mode);
            }
        }
        ColorStateList colorStateList = this.C;
        if (colorStateList != null) {
            if (z11) {
                ((s4.a) menuItem).setIconTintList(colorStateList);
            } else {
                menuItem.setIconTintList(colorStateList);
            }
        }
    }
}

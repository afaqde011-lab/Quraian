package o;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class l implements Menu {

    public static final int[] f11401y = {1, 4, 5, 3, 2, 0};

    public final Context f11402a;

    public final Resources f11403b;

    public boolean f11404c;

    public final boolean f11405d;

    public j f11406e;

    public final ArrayList f11407f;

    public final ArrayList f11408g;

    public boolean f11409h;

    public final ArrayList f11410i;

    public final ArrayList f11411j;

    public boolean f11412k;
    public CharSequence m;

    public Drawable f11413n;

    public View f11414o;

    public n f11421v;

    public boolean f11423x;
    public int l = 0;

    public boolean f11415p = false;

    public boolean f11416q = false;

    public boolean f11417r = false;

    public boolean f11418s = false;

    public final ArrayList f11419t = new ArrayList();

    public final CopyOnWriteArrayList f11420u = new CopyOnWriteArrayList();

    public boolean f11422w = false;

    public l(Context context) {
        boolean z10 = false;
        this.f11402a = context;
        Resources resources = context.getResources();
        this.f11403b = resources;
        this.f11407f = new ArrayList();
        this.f11408g = new ArrayList();
        this.f11409h = true;
        this.f11410i = new ArrayList();
        this.f11411j = new ArrayList();
        this.f11412k = true;
        if (resources.getConfiguration().keyboard != 1 && ViewConfiguration.get(context).shouldShowMenuShortcutsWhenKeyboardPresent()) {
            z10 = true;
        }
        this.f11405d = z10;
    }

    public final n a(int i10, int i11, int i12, CharSequence charSequence) {
        int i13;
        int i14 = ((-65536) & i12) >> 16;
        if (i14 < 0 || i14 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i15 = (f11401y[i14] << 16) | (65535 & i12);
        n nVar = new n(this, i10, i11, i12, i15, charSequence, this.l);
        ArrayList arrayList = this.f11407f;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((n) arrayList.get(size)).f11427d <= i15) {
                i13 = size + 1;
                arrayList.add(i13, nVar);
                p(true);
                return nVar;
            }
        }
        i13 = 0;
        arrayList.add(i13, nVar);
        p(true);
        return nVar;
    }

    @Override
    public final MenuItem add(int i10) {
        return a(0, 0, 0, this.f11403b.getString(i10));
    }

    @Override
    public final MenuItem add(int i10, int i11, int i12, int i13) {
        return a(i10, i11, i12, this.f11403b.getString(i13));
    }

    @Override
    public final MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return a(i10, i11, i12, charSequence);
    }

    @Override
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override
    public final int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        int i14;
        PackageManager packageManager = this.f11402a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i13 & 1) == 0) {
            removeGroup(i10);
        }
        for (int i15 = 0; i15 < size; i15++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i15);
            int i16 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i16 < 0 ? intent : intentArr[i16]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            n nVarA = a(i10, i11, i12, resolveInfo.loadLabel(packageManager));
            nVarA.setIcon(resolveInfo.loadIcon(packageManager));
            nVarA.f11430g = intent2;
            if (menuItemArr != null && (i14 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i14] = nVarA;
            }
        }
        return size;
    }

    @Override
    public final SubMenu addSubMenu(int i10) {
        return addSubMenu(0, 0, 0, this.f11403b.getString(i10));
    }

    @Override
    public final SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return addSubMenu(i10, i11, i12, this.f11403b.getString(i13));
    }

    @Override
    public final SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        n nVarA = a(i10, i11, i12, charSequence);
        d0 d0Var = new d0(this.f11402a, this, nVarA);
        nVarA.f11436o = d0Var;
        d0Var.setHeaderTitle(nVarA.f11428e);
        return d0Var;
    }

    @Override
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(x xVar, Context context) {
        this.f11420u.add(new WeakReference(xVar));
        xVar.b(context, this);
        this.f11412k = true;
    }

    public final void c(boolean z10) {
        if (this.f11418s) {
            return;
        }
        this.f11418s = true;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f11420u;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            x xVar = (x) weakReference.get();
            if (xVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                xVar.c(this, z10);
            }
        }
        this.f11418s = false;
    }

    @Override
    public final void clear() {
        n nVar = this.f11421v;
        if (nVar != null) {
            d(nVar);
        }
        this.f11407f.clear();
        p(true);
    }

    public final void clearHeader() {
        this.f11413n = null;
        this.m = null;
        this.f11414o = null;
        p(false);
    }

    @Override
    public final void close() {
        c(true);
    }

    public boolean d(n nVar) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f11420u;
        boolean zJ = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f11421v == nVar) {
            w();
            for (WeakReference weakReference : copyOnWriteArrayList) {
                x xVar = (x) weakReference.get();
                if (xVar != null) {
                    zJ = xVar.j(nVar);
                    if (zJ) {
                        break;
                    }
                } else {
                    copyOnWriteArrayList.remove(weakReference);
                }
            }
            v();
            if (zJ) {
                this.f11421v = null;
            }
        }
        return zJ;
    }

    public boolean e(l lVar, MenuItem menuItem) {
        j jVar = this.f11406e;
        return jVar != null && jVar.n(lVar, menuItem);
    }

    public boolean f(n nVar) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f11420u;
        boolean zG = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        w();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            x xVar = (x) weakReference.get();
            if (xVar != null) {
                zG = xVar.g(nVar);
                if (zG) {
                    break;
                }
            } else {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        v();
        if (zG) {
            this.f11421v = nVar;
        }
        return zG;
    }

    @Override
    public final MenuItem findItem(int i10) {
        MenuItem menuItemFindItem;
        ArrayList arrayList = this.f11407f;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            n nVar = (n) arrayList.get(i11);
            if (nVar.f11424a == i10) {
                return nVar;
            }
            if (nVar.hasSubMenu() && (menuItemFindItem = nVar.f11436o.findItem(i10)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    public final n g(int i10, KeyEvent keyEvent) {
        ArrayList arrayList = this.f11419t;
        arrayList.clear();
        h(arrayList, i10, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (n) arrayList.get(0);
        }
        boolean zN = n();
        for (int i11 = 0; i11 < size; i11++) {
            n nVar = (n) arrayList.get(i11);
            char c10 = zN ? nVar.f11433j : nVar.f11431h;
            char[] cArr = keyData.meta;
            if ((c10 == cArr[0] && (metaState & 2) == 0) || ((c10 == cArr[2] && (metaState & 2) != 0) || (zN && c10 == '\b' && i10 == 67))) {
                return nVar;
            }
        }
        return null;
    }

    @Override
    public final MenuItem getItem(int i10) {
        return (MenuItem) this.f11407f.get(i10);
    }

    public final void h(List list, int i10, KeyEvent keyEvent) {
        boolean zN = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i10 == 67) {
            ArrayList arrayList = this.f11407f;
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                n nVar = (n) arrayList.get(i11);
                if (nVar.hasSubMenu()) {
                    nVar.f11436o.h(list, i10, keyEvent);
                }
                char c10 = zN ? nVar.f11433j : nVar.f11431h;
                if ((modifiers & 69647) == ((zN ? nVar.f11434k : nVar.f11432i) & 69647) && c10 != 0) {
                    char[] cArr = keyData.meta;
                    if ((c10 == cArr[0] || c10 == cArr[2] || (zN && c10 == '\b' && i10 == 67)) && nVar.isEnabled()) {
                        list.add(nVar);
                    }
                }
            }
        }
    }

    @Override
    public final boolean hasVisibleItems() {
        if (this.f11423x) {
            return true;
        }
        ArrayList arrayList = this.f11407f;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((n) arrayList.get(i10)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList arrayListL = l();
        if (this.f11412k) {
            CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f11420u;
            boolean zD = false;
            for (WeakReference weakReference : copyOnWriteArrayList) {
                x xVar = (x) weakReference.get();
                if (xVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zD |= xVar.d();
                }
            }
            ArrayList arrayList = this.f11410i;
            ArrayList arrayList2 = this.f11411j;
            if (zD) {
                arrayList.clear();
                arrayList2.clear();
                int size = arrayListL.size();
                for (int i10 = 0; i10 < size; i10++) {
                    n nVar = (n) arrayListL.get(i10);
                    if ((nVar.f11445x & 32) == 32) {
                        arrayList.add(nVar);
                    } else {
                        arrayList2.add(nVar);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(l());
            }
            this.f11412k = false;
        }
    }

    @Override
    public final boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        return g(i10, keyEvent) != null;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public l k() {
        return this;
    }

    public final ArrayList l() {
        boolean z10 = this.f11409h;
        ArrayList arrayList = this.f11408g;
        if (!z10) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f11407f;
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            n nVar = (n) arrayList2.get(i10);
            if (nVar.isVisible()) {
                arrayList.add(nVar);
            }
        }
        this.f11409h = false;
        this.f11412k = true;
        return arrayList;
    }

    public boolean m() {
        return this.f11422w;
    }

    public boolean n() {
        return this.f11404c;
    }

    public boolean o() {
        return this.f11405d;
    }

    public final void p(boolean z10) {
        if (this.f11415p) {
            this.f11416q = true;
            if (z10) {
                this.f11417r = true;
                return;
            }
            return;
        }
        if (z10) {
            this.f11409h = true;
            this.f11412k = true;
        }
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f11420u;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        w();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            x xVar = (x) weakReference.get();
            if (xVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                xVar.f();
            }
        }
        v();
    }

    @Override
    public final boolean performIdentifierAction(int i10, int i11) {
        return q(findItem(i10), null, i11);
    }

    @Override
    public final boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        n nVarG = g(i10, keyEvent);
        boolean zQ = nVarG != null ? q(nVarG, null, i11) : false;
        if ((i11 & 2) != 0) {
            c(true);
        }
        return zQ;
    }

    public final boolean q(MenuItem menuItem, x xVar, int i10) {
        z4.c cVar;
        boolean zExpandActionView;
        z4.c cVar2;
        boolean z10;
        d0 d0Var;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList;
        x xVar2;
        n nVar = (n) menuItem;
        boolean zE = false;
        if (nVar == null || !nVar.isEnabled()) {
            return false;
        }
        l lVar = nVar.f11435n;
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = nVar.f11437p;
        if ((onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(nVar)) && !lVar.e(lVar, nVar)) {
            Intent intent = nVar.f11430g;
            if (intent != null) {
                try {
                    lVar.f11402a.startActivity(intent);
                } catch (ActivityNotFoundException e3) {
                    Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e3);
                    cVar = nVar.A;
                    if (cVar == null) {
                    }
                    zExpandActionView = false;
                    cVar2 = nVar.A;
                    if (cVar2 == null) {
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                    if (nVar.e()) {
                        zExpandActionView |= nVar.expandActionView();
                        if (zExpandActionView) {
                            c(true);
                        }
                    } else if (nVar.hasSubMenu()) {
                        if ((i10 & 4) == 0) {
                            c(false);
                        }
                        if (!nVar.hasSubMenu()) {
                            d0 d0Var2 = new d0(this.f11402a, this, nVar);
                            nVar.f11436o = d0Var2;
                            d0Var2.setHeaderTitle(nVar.f11428e);
                        }
                        d0Var = nVar.f11436o;
                        if (z10) {
                            ((o) cVar2).f11449b.onPrepareSubMenu(d0Var);
                        }
                        copyOnWriteArrayList = this.f11420u;
                        if (!copyOnWriteArrayList.isEmpty()) {
                            if (xVar != null) {
                            }
                            for (WeakReference weakReference : copyOnWriteArrayList) {
                                xVar2 = (x) weakReference.get();
                                if (xVar2 == null) {
                                    copyOnWriteArrayList.remove(weakReference);
                                } else if (!zE) {
                                    zE = xVar2.e(d0Var);
                                }
                            }
                        }
                        zExpandActionView |= zE;
                        if (!zExpandActionView) {
                            c(true);
                        }
                    } else {
                        if ((i10 & 4) == 0) {
                            c(false);
                        }
                        if (!nVar.hasSubMenu()) {
                            d0 d0Var3 = new d0(this.f11402a, this, nVar);
                            nVar.f11436o = d0Var3;
                            d0Var3.setHeaderTitle(nVar.f11428e);
                        }
                        d0Var = nVar.f11436o;
                        if (z10) {
                            ((o) cVar2).f11449b.onPrepareSubMenu(d0Var);
                        }
                        copyOnWriteArrayList = this.f11420u;
                        if (!copyOnWriteArrayList.isEmpty()) {
                            zE = xVar != null ? xVar.e(d0Var) : false;
                            while (r8.hasNext()) {
                                xVar2 = (x) weakReference.get();
                                if (xVar2 == null) {
                                    copyOnWriteArrayList.remove(weakReference);
                                } else if (!zE) {
                                    zE = xVar2.e(d0Var);
                                }
                            }
                        }
                        zExpandActionView |= zE;
                        if (!zExpandActionView) {
                            c(true);
                        }
                    }
                    return zExpandActionView;
                }
                zExpandActionView = true;
            } else {
                cVar = nVar.A;
                if (cVar == null && ((o) cVar).f11449b.onPerformDefaultAction()) {
                    zExpandActionView = true;
                } else {
                    zExpandActionView = false;
                }
            }
        } else {
            zExpandActionView = true;
        }
        cVar2 = nVar.A;
        if (cVar2 == null && ((o) cVar2).f11449b.hasSubMenu()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (nVar.e()) {
            zExpandActionView |= nVar.expandActionView();
            if (zExpandActionView) {
                c(true);
            }
        } else if (nVar.hasSubMenu() || z10) {
            if ((i10 & 4) == 0) {
                c(false);
            }
            if (!nVar.hasSubMenu()) {
                d0 d0Var4 = new d0(this.f11402a, this, nVar);
                nVar.f11436o = d0Var4;
                d0Var4.setHeaderTitle(nVar.f11428e);
            }
            d0Var = nVar.f11436o;
            if (z10) {
                ((o) cVar2).f11449b.onPrepareSubMenu(d0Var);
            }
            copyOnWriteArrayList = this.f11420u;
            if (!copyOnWriteArrayList.isEmpty()) {
                if (xVar != null) {
                }
                while (r8.hasNext()) {
                    xVar2 = (x) weakReference.get();
                    if (xVar2 == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else if (!zE) {
                        zE = xVar2.e(d0Var);
                    }
                }
            }
            zExpandActionView |= zE;
            if (!zExpandActionView) {
                c(true);
            }
        } else if ((i10 & 1) == 0) {
            c(true);
        }
        return zExpandActionView;
    }

    public final void r(x xVar) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f11420u;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            x xVar2 = (x) weakReference.get();
            if (xVar2 == null || xVar2 == xVar) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override
    public final void removeGroup(int i10) {
        ArrayList arrayList = this.f11407f;
        int size = arrayList.size();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i12 >= size) {
                i12 = -1;
                break;
            } else if (((n) arrayList.get(i12)).f11425b == i10) {
                break;
            } else {
                i12++;
            }
        }
        if (i12 >= 0) {
            int size2 = arrayList.size() - i12;
            while (true) {
                int i13 = i11 + 1;
                if (i11 >= size2 || ((n) arrayList.get(i12)).f11425b != i10) {
                    break;
                }
                if (i12 >= 0 && i12 < arrayList.size()) {
                    arrayList.remove(i12);
                }
                i11 = i13;
            }
            p(true);
        }
    }

    @Override
    public final void removeItem(int i10) {
        ArrayList arrayList = this.f11407f;
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                i11 = -1;
                break;
            } else if (((n) arrayList.get(i11)).f11424a == i10) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 < 0 || i11 >= arrayList.size()) {
            return;
        }
        arrayList.remove(i11);
        p(true);
    }

    public final void s(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(j());
        int size = this.f11407f.size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((d0) item.getSubMenu()).s(bundle);
            }
        }
        int i11 = bundle.getInt("android:menu:expandedactionview");
        if (i11 <= 0 || (menuItemFindItem = findItem(i11)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    @Override
    public final void setGroupCheckable(int i10, boolean z10, boolean z11) {
        ArrayList arrayList = this.f11407f;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            n nVar = (n) arrayList.get(i11);
            if (nVar.f11425b == i10) {
                nVar.f11445x = (nVar.f11445x & (-5)) | (z11 ? 4 : 0);
                nVar.setCheckable(z10);
            }
        }
    }

    @Override
    public void setGroupDividerEnabled(boolean z10) {
        this.f11422w = z10;
    }

    @Override
    public final void setGroupEnabled(int i10, boolean z10) {
        ArrayList arrayList = this.f11407f;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            n nVar = (n) arrayList.get(i11);
            if (nVar.f11425b == i10) {
                nVar.setEnabled(z10);
            }
        }
    }

    @Override
    public final void setGroupVisible(int i10, boolean z10) {
        ArrayList arrayList = this.f11407f;
        int size = arrayList.size();
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            n nVar = (n) arrayList.get(i11);
            if (nVar.f11425b == i10) {
                int i12 = nVar.f11445x;
                int i13 = (i12 & (-9)) | (z10 ? 0 : 8);
                nVar.f11445x = i13;
                if (i12 != i13) {
                    z11 = true;
                }
            }
        }
        if (z11) {
            p(true);
        }
    }

    @Override
    public void setQwertyMode(boolean z10) {
        this.f11404c = z10;
        p(false);
    }

    @Override
    public final int size() {
        return this.f11407f.size();
    }

    public final void t(Bundle bundle) {
        int size = this.f11407f.size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((d0) item.getSubMenu()).t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void u(int i10, CharSequence charSequence, int i11, Drawable drawable, View view) {
        if (view != null) {
            this.f11414o = view;
            this.m = null;
            this.f11413n = null;
        } else {
            if (i10 > 0) {
                this.m = this.f11403b.getText(i10);
            } else if (charSequence != null) {
                this.m = charSequence;
            }
            if (i11 > 0) {
                this.f11413n = this.f11402a.getDrawable(i11);
            } else if (drawable != null) {
                this.f11413n = drawable;
            }
            this.f11414o = null;
        }
        p(false);
    }

    public final void v() {
        this.f11415p = false;
        if (this.f11416q) {
            this.f11416q = false;
            p(this.f11417r);
        }
    }

    public final void w() {
        if (this.f11415p) {
            return;
        }
        this.f11415p = true;
        this.f11416q = false;
        this.f11417r = false;
    }
}

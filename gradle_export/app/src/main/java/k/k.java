package k;

import android.R;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import p.d2;
import p.u2;

public abstract class k extends androidx.fragment.app.o0 implements l, n4.w {
    private static final String DELEGATE_TAG = "androidx:appcompat";
    private p mDelegate;
    private Resources mResources;

    public k() {
        getSavedStateRegistry().c(DELEGATE_TAG, new ia.a(this));
        addOnContextAvailableListener(new j(this));
    }

    @Override
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        b0 b0Var = (b0) getDelegate();
        b0Var.v();
        ((ViewGroup) b0Var.Y.findViewById(R.id.content)).addView(view, layoutParams);
        b0Var.K.a(b0Var.J.getCallback());
    }

    @Override
    public void attachBaseContext(Context context) {
        Configuration configuration;
        Configuration configuration2;
        n.d dVar;
        float f3;
        float f10;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i40;
        int i41;
        int i42;
        int i43;
        int i44;
        int i45;
        int i46;
        int i47;
        int i48;
        int i49;
        b0 b0Var = (b0) getDelegate();
        b0Var.f8352m0 = true;
        int i50 = b0Var.f8356q0;
        if (i50 == -100) {
            i50 = p.B;
        }
        int iC = b0Var.C(context, i50);
        if (p.c(context) && p.c(context) && !p.D) {
            p.A.execute(new m(context, 0));
        }
        Configuration configuration3 = null;
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(b0.s(context, iC, null, false));
            } catch (IllegalStateException unused) {
                if (context instanceof n.d) {
                    try {
                        ((n.d) context).a(b0.s(context, iC, null, false));
                    } catch (IllegalStateException unused2) {
                        if (b0.H0) {
                            Configuration configuration4 = new Configuration();
                            configuration4.uiMode = -1;
                            configuration4.fontScale = 0.0f;
                            configuration = context.createConfigurationContext(configuration4).getResources().getConfiguration();
                            configuration2 = context.getResources().getConfiguration();
                            configuration.uiMode = configuration2.uiMode;
                            if (!configuration.equals(configuration2)) {
                                configuration3 = new Configuration();
                                configuration3.fontScale = 0.0f;
                                if (configuration.diff(configuration2) != 0) {
                                    f3 = configuration.fontScale;
                                    f10 = configuration2.fontScale;
                                    if (f3 != f10) {
                                        configuration3.fontScale = f10;
                                    }
                                    i10 = configuration.mcc;
                                    i11 = configuration2.mcc;
                                    if (i10 != i11) {
                                        configuration3.mcc = i11;
                                    }
                                    i12 = configuration.mnc;
                                    i13 = configuration2.mnc;
                                    if (i12 != i13) {
                                        configuration3.mnc = i13;
                                    }
                                    v.a(configuration, configuration2, configuration3);
                                    i14 = configuration.touchscreen;
                                    i15 = configuration2.touchscreen;
                                    if (i14 != i15) {
                                        configuration3.touchscreen = i15;
                                    }
                                    i16 = configuration.keyboard;
                                    i17 = configuration2.keyboard;
                                    if (i16 != i17) {
                                        configuration3.keyboard = i17;
                                    }
                                    i18 = configuration.keyboardHidden;
                                    i19 = configuration2.keyboardHidden;
                                    if (i18 != i19) {
                                        configuration3.keyboardHidden = i19;
                                    }
                                    i20 = configuration.navigation;
                                    i21 = configuration2.navigation;
                                    if (i20 != i21) {
                                        configuration3.navigation = i21;
                                    }
                                    i22 = configuration.navigationHidden;
                                    i23 = configuration2.navigationHidden;
                                    if (i22 != i23) {
                                        configuration3.navigationHidden = i23;
                                    }
                                    i24 = configuration.orientation;
                                    i25 = configuration2.orientation;
                                    if (i24 != i25) {
                                        configuration3.orientation = i25;
                                    }
                                    i26 = configuration.screenLayout & 15;
                                    i27 = configuration2.screenLayout & 15;
                                    if (i26 != i27) {
                                        configuration3.screenLayout |= i27;
                                    }
                                    i28 = configuration.screenLayout & 192;
                                    i29 = configuration2.screenLayout & 192;
                                    if (i28 != i29) {
                                        configuration3.screenLayout |= i29;
                                    }
                                    i30 = configuration.screenLayout & 48;
                                    i31 = configuration2.screenLayout & 48;
                                    if (i30 != i31) {
                                        configuration3.screenLayout |= i31;
                                    }
                                    i32 = configuration.screenLayout & 768;
                                    i33 = configuration2.screenLayout & 768;
                                    if (i32 != i33) {
                                        configuration3.screenLayout |= i33;
                                    }
                                    i34 = configuration.colorMode & 3;
                                    i35 = configuration2.colorMode & 3;
                                    if (i34 != i35) {
                                        configuration3.colorMode |= i35;
                                    }
                                    i36 = configuration.colorMode & 12;
                                    i37 = configuration2.colorMode & 12;
                                    if (i36 != i37) {
                                        configuration3.colorMode |= i37;
                                    }
                                    i38 = configuration.uiMode & 15;
                                    i39 = configuration2.uiMode & 15;
                                    if (i38 != i39) {
                                        configuration3.uiMode |= i39;
                                    }
                                    i40 = configuration.uiMode & 48;
                                    i41 = configuration2.uiMode & 48;
                                    if (i40 != i41) {
                                        configuration3.uiMode |= i41;
                                    }
                                    i42 = configuration.screenWidthDp;
                                    i43 = configuration2.screenWidthDp;
                                    if (i42 != i43) {
                                        configuration3.screenWidthDp = i43;
                                    }
                                    i44 = configuration.screenHeightDp;
                                    i45 = configuration2.screenHeightDp;
                                    if (i44 != i45) {
                                        configuration3.screenHeightDp = i45;
                                    }
                                    i46 = configuration.smallestScreenWidthDp;
                                    i47 = configuration2.smallestScreenWidthDp;
                                    if (i46 != i47) {
                                        configuration3.smallestScreenWidthDp = i47;
                                    }
                                    i48 = configuration.densityDpi;
                                    i49 = configuration2.densityDpi;
                                    if (i48 != i49) {
                                        configuration3.densityDpi = i49;
                                    }
                                }
                            }
                            Configuration configurationS = b0.s(context, iC, configuration3, true);
                            dVar = new n.d(context, 2131952325);
                            dVar.a(configurationS);
                            try {
                                if (context.getTheme() != null) {
                                    dVar.getTheme().rebase();
                                }
                            } catch (NullPointerException unused3) {
                            }
                            context = dVar;
                        }
                    }
                } else if (b0.H0) {
                    Configuration configuration5 = new Configuration();
                    configuration5.uiMode = -1;
                    configuration5.fontScale = 0.0f;
                    configuration = context.createConfigurationContext(configuration5).getResources().getConfiguration();
                    configuration2 = context.getResources().getConfiguration();
                    configuration.uiMode = configuration2.uiMode;
                    if (!configuration.equals(configuration2)) {
                        configuration3 = new Configuration();
                        configuration3.fontScale = 0.0f;
                        if (configuration.diff(configuration2) != 0) {
                            f3 = configuration.fontScale;
                            f10 = configuration2.fontScale;
                            if (f3 != f10) {
                                configuration3.fontScale = f10;
                            }
                            i10 = configuration.mcc;
                            i11 = configuration2.mcc;
                            if (i10 != i11) {
                                configuration3.mcc = i11;
                            }
                            i12 = configuration.mnc;
                            i13 = configuration2.mnc;
                            if (i12 != i13) {
                                configuration3.mnc = i13;
                            }
                            v.a(configuration, configuration2, configuration3);
                            i14 = configuration.touchscreen;
                            i15 = configuration2.touchscreen;
                            if (i14 != i15) {
                                configuration3.touchscreen = i15;
                            }
                            i16 = configuration.keyboard;
                            i17 = configuration2.keyboard;
                            if (i16 != i17) {
                                configuration3.keyboard = i17;
                            }
                            i18 = configuration.keyboardHidden;
                            i19 = configuration2.keyboardHidden;
                            if (i18 != i19) {
                                configuration3.keyboardHidden = i19;
                            }
                            i20 = configuration.navigation;
                            i21 = configuration2.navigation;
                            if (i20 != i21) {
                                configuration3.navigation = i21;
                            }
                            i22 = configuration.navigationHidden;
                            i23 = configuration2.navigationHidden;
                            if (i22 != i23) {
                                configuration3.navigationHidden = i23;
                            }
                            i24 = configuration.orientation;
                            i25 = configuration2.orientation;
                            if (i24 != i25) {
                                configuration3.orientation = i25;
                            }
                            i26 = configuration.screenLayout & 15;
                            i27 = configuration2.screenLayout & 15;
                            if (i26 != i27) {
                                configuration3.screenLayout |= i27;
                            }
                            i28 = configuration.screenLayout & 192;
                            i29 = configuration2.screenLayout & 192;
                            if (i28 != i29) {
                                configuration3.screenLayout |= i29;
                            }
                            i30 = configuration.screenLayout & 48;
                            i31 = configuration2.screenLayout & 48;
                            if (i30 != i31) {
                                configuration3.screenLayout |= i31;
                            }
                            i32 = configuration.screenLayout & 768;
                            i33 = configuration2.screenLayout & 768;
                            if (i32 != i33) {
                                configuration3.screenLayout |= i33;
                            }
                            i34 = configuration.colorMode & 3;
                            i35 = configuration2.colorMode & 3;
                            if (i34 != i35) {
                                configuration3.colorMode |= i35;
                            }
                            i36 = configuration.colorMode & 12;
                            i37 = configuration2.colorMode & 12;
                            if (i36 != i37) {
                                configuration3.colorMode |= i37;
                            }
                            i38 = configuration.uiMode & 15;
                            i39 = configuration2.uiMode & 15;
                            if (i38 != i39) {
                                configuration3.uiMode |= i39;
                            }
                            i40 = configuration.uiMode & 48;
                            i41 = configuration2.uiMode & 48;
                            if (i40 != i41) {
                                configuration3.uiMode |= i41;
                            }
                            i42 = configuration.screenWidthDp;
                            i43 = configuration2.screenWidthDp;
                            if (i42 != i43) {
                                configuration3.screenWidthDp = i43;
                            }
                            i44 = configuration.screenHeightDp;
                            i45 = configuration2.screenHeightDp;
                            if (i44 != i45) {
                                configuration3.screenHeightDp = i45;
                            }
                            i46 = configuration.smallestScreenWidthDp;
                            i47 = configuration2.smallestScreenWidthDp;
                            if (i46 != i47) {
                                configuration3.smallestScreenWidthDp = i47;
                            }
                            i48 = configuration.densityDpi;
                            i49 = configuration2.densityDpi;
                            if (i48 != i49) {
                                configuration3.densityDpi = i49;
                            }
                        }
                    }
                    Configuration configurationS2 = b0.s(context, iC, configuration3, true);
                    dVar = new n.d(context, 2131952325);
                    dVar.a(configurationS2);
                    if (context.getTheme() != null) {
                        dVar.getTheme().rebase();
                    }
                    context = dVar;
                }
            }
        } else if (context instanceof n.d) {
            ((n.d) context).a(b0.s(context, iC, null, false));
        } else if (b0.H0) {
            Configuration configuration6 = new Configuration();
            configuration6.uiMode = -1;
            configuration6.fontScale = 0.0f;
            configuration = context.createConfigurationContext(configuration6).getResources().getConfiguration();
            configuration2 = context.getResources().getConfiguration();
            configuration.uiMode = configuration2.uiMode;
            if (!configuration.equals(configuration2)) {
                configuration3 = new Configuration();
                configuration3.fontScale = 0.0f;
                if (configuration.diff(configuration2) != 0) {
                    f3 = configuration.fontScale;
                    f10 = configuration2.fontScale;
                    if (f3 != f10) {
                        configuration3.fontScale = f10;
                    }
                    i10 = configuration.mcc;
                    i11 = configuration2.mcc;
                    if (i10 != i11) {
                        configuration3.mcc = i11;
                    }
                    i12 = configuration.mnc;
                    i13 = configuration2.mnc;
                    if (i12 != i13) {
                        configuration3.mnc = i13;
                    }
                    v.a(configuration, configuration2, configuration3);
                    i14 = configuration.touchscreen;
                    i15 = configuration2.touchscreen;
                    if (i14 != i15) {
                        configuration3.touchscreen = i15;
                    }
                    i16 = configuration.keyboard;
                    i17 = configuration2.keyboard;
                    if (i16 != i17) {
                        configuration3.keyboard = i17;
                    }
                    i18 = configuration.keyboardHidden;
                    i19 = configuration2.keyboardHidden;
                    if (i18 != i19) {
                        configuration3.keyboardHidden = i19;
                    }
                    i20 = configuration.navigation;
                    i21 = configuration2.navigation;
                    if (i20 != i21) {
                        configuration3.navigation = i21;
                    }
                    i22 = configuration.navigationHidden;
                    i23 = configuration2.navigationHidden;
                    if (i22 != i23) {
                        configuration3.navigationHidden = i23;
                    }
                    i24 = configuration.orientation;
                    i25 = configuration2.orientation;
                    if (i24 != i25) {
                        configuration3.orientation = i25;
                    }
                    i26 = configuration.screenLayout & 15;
                    i27 = configuration2.screenLayout & 15;
                    if (i26 != i27) {
                        configuration3.screenLayout |= i27;
                    }
                    i28 = configuration.screenLayout & 192;
                    i29 = configuration2.screenLayout & 192;
                    if (i28 != i29) {
                        configuration3.screenLayout |= i29;
                    }
                    i30 = configuration.screenLayout & 48;
                    i31 = configuration2.screenLayout & 48;
                    if (i30 != i31) {
                        configuration3.screenLayout |= i31;
                    }
                    i32 = configuration.screenLayout & 768;
                    i33 = configuration2.screenLayout & 768;
                    if (i32 != i33) {
                        configuration3.screenLayout |= i33;
                    }
                    i34 = configuration.colorMode & 3;
                    i35 = configuration2.colorMode & 3;
                    if (i34 != i35) {
                        configuration3.colorMode |= i35;
                    }
                    i36 = configuration.colorMode & 12;
                    i37 = configuration2.colorMode & 12;
                    if (i36 != i37) {
                        configuration3.colorMode |= i37;
                    }
                    i38 = configuration.uiMode & 15;
                    i39 = configuration2.uiMode & 15;
                    if (i38 != i39) {
                        configuration3.uiMode |= i39;
                    }
                    i40 = configuration.uiMode & 48;
                    i41 = configuration2.uiMode & 48;
                    if (i40 != i41) {
                        configuration3.uiMode |= i41;
                    }
                    i42 = configuration.screenWidthDp;
                    i43 = configuration2.screenWidthDp;
                    if (i42 != i43) {
                        configuration3.screenWidthDp = i43;
                    }
                    i44 = configuration.screenHeightDp;
                    i45 = configuration2.screenHeightDp;
                    if (i44 != i45) {
                        configuration3.screenHeightDp = i45;
                    }
                    i46 = configuration.smallestScreenWidthDp;
                    i47 = configuration2.smallestScreenWidthDp;
                    if (i46 != i47) {
                        configuration3.smallestScreenWidthDp = i47;
                    }
                    i48 = configuration.densityDpi;
                    i49 = configuration2.densityDpi;
                    if (i48 != i49) {
                        configuration3.densityDpi = i49;
                    }
                }
            }
            Configuration configurationS3 = b0.s(context, iC, configuration3, true);
            dVar = new n.d(context, 2131952325);
            dVar.a(configurationS3);
            if (context.getTheme() != null) {
                dVar.getTheme().rebase();
            }
            context = dVar;
        }
        super.attachBaseContext(context);
    }

    @Override
    public void closeOptionsMenu() {
        a supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.a()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        a supportActionBar = getSupportActionBar();
        if (keyCode == 82 && supportActionBar != null && supportActionBar.j(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override
    public <T extends View> T findViewById(int i10) {
        b0 b0Var = (b0) getDelegate();
        b0Var.v();
        return (T) b0Var.J.findViewById(i10);
    }

    public p getDelegate() {
        if (this.mDelegate == null) {
            ca.z zVar = p.A;
            this.mDelegate = new b0(this, null, this, this);
        }
        return this.mDelegate;
    }

    public b getDrawerToggleDelegate() {
        ((b0) getDelegate()).getClass();
        return new gj.e(17);
    }

    @Override
    public MenuInflater getMenuInflater() {
        b0 b0Var = (b0) getDelegate();
        if (b0Var.N == null) {
            b0Var.A();
            a aVar = b0Var.M;
            b0Var.N = new n.i(aVar != null ? aVar.e() : b0Var.I);
        }
        return b0Var.N;
    }

    @Override
    public Resources getResources() {
        Resources resources = this.mResources;
        if (resources == null) {
            int i10 = u2.f12226a;
        }
        return resources == null ? super.getResources() : resources;
    }

    public a getSupportActionBar() {
        b0 b0Var = (b0) getDelegate();
        b0Var.A();
        return b0Var.M;
    }

    @Override
    public Intent getSupportParentActivityIntent() {
        return n4.b.d(this);
    }

    @Override
    public void invalidateOptionsMenu() {
        getDelegate().b();
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        b0 b0Var = (b0) getDelegate();
        if (b0Var.f8343d0 && b0Var.X) {
            b0Var.A();
            a aVar = b0Var.M;
            if (aVar != null) {
                aVar.g();
            }
        }
        p.r rVarA = p.r.a();
        Context context = b0Var.I;
        synchronized (rVarA) {
            d2 d2Var = rVarA.f12195a;
            synchronized (d2Var) {
                u.q qVar = (u.q) d2Var.f12150b.get(context);
                if (qVar != null) {
                    qVar.a();
                }
            }
        }
        b0Var.f8355p0 = new Configuration(b0Var.I.getResources().getConfiguration());
        b0Var.m(false);
        if (this.mResources != null) {
            this.mResources.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
        }
    }

    @Override
    public void onContentChanged() {
        onSupportContentChanged();
    }

    public void onCreateSupportNavigateUpTaskStack(n4.x xVar) {
        xVar.getClass();
        ArrayList arrayList = xVar.A;
        k kVar = xVar.B;
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            supportParentActivityIntent = n4.b.d(this);
        }
        if (supportParentActivityIntent != null) {
            ComponentName component = supportParentActivityIntent.getComponent();
            if (component == null) {
                component = supportParentActivityIntent.resolveActivity(kVar.getPackageManager());
            }
            int size = arrayList.size();
            try {
                for (Intent intentC = n4.b.c(kVar, component); intentC != null; intentC = n4.b.c(kVar, intentC.getComponent())) {
                    arrayList.add(size, intentC);
                }
                arrayList.add(supportParentActivityIntent);
            } catch (PackageManager.NameNotFoundException e3) {
                Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                throw new IllegalArgumentException(e3);
            }
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        getDelegate().e();
    }

    @Override
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        return super.onKeyDown(i10, keyEvent);
    }

    public void onLocalesChanged(u4.d dVar) {
    }

    @Override
    public final boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        a supportActionBar = getSupportActionBar();
        if (menuItem.getItemId() != 16908332 || supportActionBar == null || (supportActionBar.d() & 4) == 0) {
            return false;
        }
        return onSupportNavigateUp();
    }

    @Override
    public boolean onMenuOpened(int i10, Menu menu) {
        return super.onMenuOpened(i10, menu);
    }

    public void onNightModeChanged(int i10) {
    }

    @Override
    public void onPanelClosed(int i10, Menu menu) {
        super.onPanelClosed(i10, menu);
    }

    @Override
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((b0) getDelegate()).v();
    }

    @Override
    public void onPostResume() {
        super.onPostResume();
        b0 b0Var = (b0) getDelegate();
        b0Var.A();
        a aVar = b0Var.M;
        if (aVar != null) {
            aVar.o(true);
        }
    }

    public void onPrepareSupportNavigateUpTaskStack(n4.x xVar) {
    }

    @Override
    public void onStart() {
        super.onStart();
        ((b0) getDelegate()).m(true);
    }

    @Override
    public void onStop() {
        super.onStop();
        b0 b0Var = (b0) getDelegate();
        b0Var.A();
        a aVar = b0Var.M;
        if (aVar != null) {
            aVar.o(false);
        }
    }

    @Override
    public void onSupportActionModeFinished(n.b bVar) {
    }

    @Override
    public void onSupportActionModeStarted(n.b bVar) {
    }

    @Deprecated
    public void onSupportContentChanged() {
    }

    public boolean onSupportNavigateUp() {
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            return false;
        }
        if (!supportShouldUpRecreateTask(supportParentActivityIntent)) {
            supportNavigateUpTo(supportParentActivityIntent);
            return true;
        }
        n4.x xVar = new n4.x(this);
        onCreateSupportNavigateUpTaskStack(xVar);
        onPrepareSupportNavigateUpTaskStack(xVar);
        ArrayList arrayList = xVar.A;
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        xVar.B.startActivities(intentArr, null);
        try {
            finishAffinity();
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    @Override
    public void onTitleChanged(CharSequence charSequence, int i10) {
        super.onTitleChanged(charSequence, i10);
        getDelegate().k(charSequence);
    }

    @Override
    public n.b onWindowStartingSupportActionMode(n.a aVar) {
        return null;
    }

    @Override
    public void openOptionsMenu() {
        a supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.k()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override
    public void setContentView(int i10) {
        initializeViewTreeOwners();
        getDelegate().h(i10);
    }

    @Override
    public void setContentView(View view) {
        initializeViewTreeOwners();
        getDelegate().i(view);
    }

    @Override
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        getDelegate().j(view, layoutParams);
    }

    public void setSupportActionBar(Toolbar toolbar) {
        b0 b0Var = (b0) getDelegate();
        if (b0Var.H instanceof Activity) {
            b0Var.A();
            a aVar = b0Var.M;
            if (aVar instanceof o0) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            b0Var.N = null;
            if (aVar != null) {
                aVar.h();
            }
            b0Var.M = null;
            if (toolbar != null) {
                Object obj = b0Var.H;
                k0 k0Var = new k0(toolbar, obj instanceof Activity ? ((Activity) obj).getTitle() : b0Var.O, b0Var.K);
                b0Var.M = k0Var;
                b0Var.K.B = k0Var.f8416c;
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                b0Var.K.B = null;
            }
            b0Var.b();
        }
    }

    @Deprecated
    public void setSupportProgress(int i10) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminate(boolean z10) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminateVisibility(boolean z10) {
    }

    @Deprecated
    public void setSupportProgressBarVisibility(boolean z10) {
    }

    @Override
    public void setTheme(int i10) {
        super.setTheme(i10);
        ((b0) getDelegate()).f8357r0 = i10;
    }

    public n.b startSupportActionMode(n.a aVar) {
        return getDelegate().l(aVar);
    }

    public void supportInvalidateOptionsMenu() {
        getDelegate().b();
    }

    public void supportNavigateUpTo(Intent intent) {
        navigateUpTo(intent);
    }

    public boolean supportRequestWindowFeature(int i10) {
        return getDelegate().g(i10);
    }

    public boolean supportShouldUpRecreateTask(Intent intent) {
        return shouldUpRecreateTask(intent);
    }
}

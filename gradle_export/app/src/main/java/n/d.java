package n;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;

public final class d extends ContextWrapper {

    public static Configuration f10947f;

    public int f10948a;

    public Resources.Theme f10949b;

    public LayoutInflater f10950c;

    public Configuration f10951d;

    public Resources f10952e;

    public d(Context context, int i10) {
        super(context);
        this.f10948a = i10;
    }

    public final void a(Configuration configuration) {
        if (this.f10952e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f10951d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f10951d = new Configuration(configuration);
    }

    @Override
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void b() {
        if (this.f10949b == null) {
            this.f10949b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f10949b.setTo(theme);
            }
        }
        this.f10949b.applyStyle(this.f10948a, true);
    }

    @Override
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override
    public final Resources getResources() {
        if (this.f10952e == null) {
            Configuration configuration = this.f10951d;
            if (configuration == null) {
                this.f10952e = super.getResources();
            } else {
                if (f10947f == null) {
                    Configuration configuration2 = new Configuration();
                    configuration2.fontScale = 0.0f;
                    f10947f = configuration2;
                }
                if (configuration.equals(f10947f)) {
                    this.f10952e = super.getResources();
                } else {
                    this.f10952e = createConfigurationContext(this.f10951d).getResources();
                }
            }
        }
        return this.f10952e;
    }

    @Override
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f10950c == null) {
            this.f10950c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f10950c;
    }

    @Override
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f10949b;
        if (theme != null) {
            return theme;
        }
        if (this.f10948a == 0) {
            this.f10948a = 2131952326;
        }
        b();
        return this.f10949b;
    }

    @Override
    public final void setTheme(int i10) {
        if (this.f10948a != i10) {
            this.f10948a = i10;
            b();
        }
    }
}

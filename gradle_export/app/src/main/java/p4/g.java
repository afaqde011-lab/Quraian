package p4;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

public final class g {

    public final ColorStateList f12330a;

    public final Configuration f12331b;

    public final int f12332c;

    public g(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.f12330a = colorStateList;
        this.f12331b = configuration;
        this.f12332c = theme == null ? 0 : theme.hashCode();
    }
}

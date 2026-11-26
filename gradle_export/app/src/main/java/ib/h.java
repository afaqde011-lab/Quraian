package ib;

import android.content.ComponentName;
import android.content.Context;
import android.util.Log;
import za.v;

public abstract class h {

    public static final String f7573a = v.f("PackageManagerHelper");

    public static void a(Context context, Class cls, boolean z10) {
        String str = f7573a;
        try {
            int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, cls.getName()));
            boolean z11 = false;
            if (componentEnabledSetting != 0 && componentEnabledSetting == 1) {
                z11 = true;
            }
            if (z10 == z11) {
                v.d().a(str, "Skipping component enablement for ".concat(cls.getName()));
                return;
            }
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z10 ? 1 : 2, 1);
            v vVarD = v.d();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(cls.getName());
            sb2.append(" ");
            sb2.append(z10 ? "enabled" : "disabled");
            vVarD.a(str, sb2.toString());
        } catch (Exception e3) {
            v vVarD2 = v.d();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(cls.getName());
            sb3.append("could not be ");
            sb3.append(z10 ? "enabled" : "disabled");
            String string = sb3.toString();
            if (vVarD2.f17403a <= 3) {
                Log.d(str, string, e3);
            }
        }
    }
}

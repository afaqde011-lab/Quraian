package tf;

import android.content.SharedPreferences;

public final class v0 {

    public final String f14742a;

    public final boolean f14743b;

    public boolean f14744c;

    public boolean f14745d;

    public final w0 f14746e;

    public v0(w0 w0Var, String str, boolean z10) {
        this.f14746e = w0Var;
        com.google.android.gms.common.internal.d0.e(str);
        this.f14742a = str;
        this.f14743b = z10;
    }

    public final boolean a() {
        if (!this.f14744c) {
            this.f14744c = true;
            this.f14745d = this.f14746e.Z0().getBoolean(this.f14742a, this.f14743b);
        }
        return this.f14745d;
    }

    public final void b(boolean z10) {
        SharedPreferences.Editor editorEdit = this.f14746e.Z0().edit();
        editorEdit.putBoolean(this.f14742a, z10);
        editorEdit.apply();
        this.f14745d = z10;
    }
}

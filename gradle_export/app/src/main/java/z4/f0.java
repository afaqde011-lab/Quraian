package z4;

import android.view.View;

public abstract class f0 {
    public static int a(View view) {
        return view.getImportantForAutofill();
    }

    public static void b(View view, int i10) {
        view.setImportantForAutofill(i10);
    }
}

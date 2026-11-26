package xc;

import com.amplitude.android.internal.locators.ComposeViewTargetLocator;
import com.google.android.gms.internal.measurement.z3;
import java.util.ArrayList;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import u00.k;

public final class c extends n implements k {
    public static final c A = new c(1);

    public final Object invoke(Object obj) {
        cd.b bVar = (cd.b) obj;
        m.e(bVar, "logger");
        ArrayList arrayList = new ArrayList();
        if (z3.H("androidx.compose.ui.node.Owner", null) && z3.H("com.amplitude.android.internal.locators.ComposeViewTargetLocator", null)) {
            arrayList.add(new ComposeViewTargetLocator(bVar));
        }
        arrayList.add(new a());
        return arrayList;
    }
}

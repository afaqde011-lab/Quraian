package xc;

import android.content.res.Resources;
import android.view.View;
import android.widget.Button;
import com.google.android.gms.internal.measurement.z3;
import com.google.protobuf.RuntimeVersion;
import g00.k;
import g00.n;
import h00.q;
import java.util.ArrayList;
import kotlin.jvm.internal.m;
import ri.t1;

public final class a implements b {

    public final int[] f16515a = new int[2];

    @Override
    public final tc.c a(View view, k kVar) {
        String strS;
        String string;
        CharSequence text;
        tc.b[] bVarArr = tc.b.A;
        m.e(view, "<this>");
        float fFloatValue = ((Number) kVar.A).floatValue();
        float fFloatValue2 = ((Number) kVar.B).floatValue();
        int[] iArr = this.f16515a;
        view.getLocationOnScreen(iArr);
        int i10 = iArr[0];
        int i11 = iArr[1];
        if (((fFloatValue < ((float) i10) || fFloatValue > ((float) (i10 + view.getWidth())) || fFloatValue2 < ((float) i11) || fFloatValue2 > ((float) (i11 + view.getHeight())) || !view.isClickable() || view.getVisibility() != 0) ? null : view) == null) {
            return null;
        }
        String canonicalName = view.getClass().getCanonicalName();
        if (canonicalName == null) {
            canonicalName = view.getClass().getSimpleName();
        }
        String str = canonicalName;
        try {
            if (view.getId() == -1 || ((view.getId() & (-16777216)) == 0 && (view.getId() & 16777215) != 0)) {
                throw new Resources.NotFoundException();
            }
            Resources resources = view.getContext().getResources();
            strS = resources != null ? resources.getResourceEntryName(view.getId()) : null;
            if (strS == null) {
                strS = RuntimeVersion.SUFFIX;
            }
            if (n.a(strS) != null) {
                if (view.getId() == -1) {
                    strS = null;
                } else {
                    int id2 = view.getId();
                    z3.r(16);
                    String string2 = Integer.toString(id2, 16);
                    m.d(string2, "toString(...)");
                    strS = "0x".concat(string2);
                }
            }
            String str2 = strS;
            ArrayList arrayList = new ArrayList();
            View view2 = view;
            while (view2 != null) {
                arrayList.add(view2.getClass().getSimpleName());
                Object parent = view2.getParent();
                view2 = parent instanceof View ? (View) parent : null;
            }
            String strR0 = q.R0(arrayList, " → ", (String) null, (String) null, (u00.k) null, 62);
            Object tag = view.getTag();
            if (tag == null) {
                string = null;
            } else {
                if (!(tag instanceof String) && !(tag instanceof Number) && !(tag instanceof Boolean) && !(tag instanceof Character)) {
                    tag = null;
                }
                if (tag != null) {
                    string = tag.toString();
                } else {
                    string = null;
                }
            }
            Button button = view instanceof Button ? (Button) view : null;
            String string3 = (button == null || (text = button.getText()) == null) ? null : text.toString();
            Object tag2 = view.getTag(-1989905945);
            Boolean bool = tag2 instanceof Boolean ? (Boolean) tag2 : null;
            boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
            Object tag3 = view.getTag(-633031234);
            Boolean bool2 = tag3 instanceof Boolean ? (Boolean) tag3 : null;
            boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : false;
            Object tag4 = view.getTag(457577948);
            Boolean bool3 = tag4 instanceof Boolean ? (Boolean) tag4 : null;
            boolean zBooleanValue3 = bool3 != null ? bool3.booleanValue() : false;
            return new tc.c(view, str, str2, string, string3, "android_view", strR0, zBooleanValue || zBooleanValue3, zBooleanValue2 || zBooleanValue3);
        } catch (Throwable th2) {
            strS = t1.s(th2);
        }
    }
}

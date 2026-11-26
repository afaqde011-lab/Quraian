package k;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import com.google.protobuf.RuntimeVersion;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class f0 implements View.OnClickListener {
    public final View A;
    public final String B;
    public Method C;
    public Context D;

    public f0(View view, String str) {
        this.A = view;
        this.B = str;
    }

    @Override
    public final void onClick(View view) {
        String str;
        Method method;
        if (this.C != null) {
            break;
        }
        View view2 = this.A;
        Context context = view2.getContext();
        while (true) {
            String str2 = this.B;
            if (context == null) {
                int id2 = view2.getId();
                if (id2 == -1) {
                    str = RuntimeVersion.SUFFIX;
                } else {
                    str = " with id '" + view2.getContext().getResources().getResourceEntryName(id2) + "'";
                }
                StringBuilder sbN = g4.c.n("Could not find method ", str2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                sbN.append(view2.getClass());
                sbN.append(str);
                throw new IllegalStateException(sbN.toString());
            }
            try {
                if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                    this.C = method;
                    this.D = context;
                    break;
                }
            } catch (NoSuchMethodException unused) {
            }
            context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
        }
        try {
            this.C.invoke(this.D, view);
        } catch (IllegalAccessException e3) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e3);
        } catch (InvocationTargetException e10) {
            throw new IllegalStateException("Could not execute method for android:onClick", e10);
        }
    }
}

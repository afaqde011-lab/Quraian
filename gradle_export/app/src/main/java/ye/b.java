package ye;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.internal.d0;
import com.google.android.gms.internal.measurement.x5;
import java.lang.reflect.Field;

public final class b extends bh.a implements a {

    public final Object f16861f;

    public b(Object obj) {
        super("com.google.android.gms.dynamic.IObjectWrapper", 5);
        this.f16861f = obj;
    }

    public static a k2(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
        return iInterfaceQueryLocalInterface instanceof a ? (a) iInterfaceQueryLocalInterface : new c(iBinder, "com.google.android.gms.dynamic.IObjectWrapper", 4);
    }

    public static Object l2(a aVar) {
        if (aVar instanceof b) {
            return ((b) aVar).f16861f;
        }
        IBinder iBinderAsBinder = aVar.asBinder();
        Field[] declaredFields = iBinderAsBinder.getClass().getDeclaredFields();
        Field field = null;
        int i10 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i10++;
                field = field2;
            }
        }
        if (i10 != 1) {
            int length = declaredFields.length;
            throw new IllegalArgumentException(x5.j(length, "Unexpected number of IObjectWrapper declared fields: ", new StringBuilder(String.valueOf(length).length() + 53)));
        }
        d0.h(field);
        if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return field.get(iBinderAsBinder);
        } catch (IllegalAccessException e3) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e3);
        } catch (NullPointerException e10) {
            throw new IllegalArgumentException("Binder object is null.", e10);
        }
    }
}

package n;

import android.view.MenuItem;
import java.lang.reflect.Method;

public final class g implements MenuItem.OnMenuItemClickListener {

    public static final Class[] f10955c = {MenuItem.class};

    public Object f10956a;

    public Method f10957b;

    @Override
    public final boolean onMenuItemClick(MenuItem menuItem) {
        Object obj = this.f10956a;
        Method method = this.f10957b;
        try {
            if (method.getReturnType() == Boolean.TYPE) {
                return ((Boolean) method.invoke(obj, menuItem)).booleanValue();
            }
            method.invoke(obj, menuItem);
            return true;
        } catch (Exception e3) {
            throw new RuntimeException(e3);
        }
    }
}

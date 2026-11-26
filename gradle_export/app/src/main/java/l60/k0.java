package l60;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public final class k0 extends a {
    public final int H;

    public k0(int i) {
        super(7);
        this.H = i;
    }

    @Override
    public String c(Method method, int i) {
        switch (this.H) {
            case 1:
                Parameter parameter = method.getParameters()[i];
                if (!parameter.isNamePresent()) {
                    return super.c(method, i);
                }
                return "parameter '" + parameter.getName() + '\'';
            default:
                return super.c(method, i);
        }
    }

    @Override
    public final Object d(Method method, Class cls, Object obj, Object[] objArr) {
        switch (this.H) {
            case 0:
                break;
        }
        return w0.k(method, cls, obj, objArr);
    }

    @Override
    public final boolean e(Method method) {
        switch (this.H) {
            case 0:
                break;
        }
        return method.isDefault();
    }
}

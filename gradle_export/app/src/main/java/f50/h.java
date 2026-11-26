package f50;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class h implements InvocationHandler {
    public final ArrayList a;
    public boolean b;
    public String c;

    public h(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override
    public final Object invoke(Object proxy, Method method, Object[] objArr) {
        kotlin.jvm.internal.m.e(proxy, "proxy");
        kotlin.jvm.internal.m.e(method, "method");
        if (objArr == null) {
            objArr = new Object[0];
        }
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        if (kotlin.jvm.internal.m.a(name, "supports") && kotlin.jvm.internal.m.a(Boolean.TYPE, returnType)) {
            return Boolean.TRUE;
        }
        if (kotlin.jvm.internal.m.a(name, "unsupported") && kotlin.jvm.internal.m.a(Void.TYPE, returnType)) {
            this.b = true;
            return null;
        }
        boolean zA = kotlin.jvm.internal.m.a(name, "protocols");
        ArrayList arrayList = this.a;
        if (zA && objArr.length == 0) {
            return arrayList;
        }
        if ((kotlin.jvm.internal.m.a(name, "selectProtocol") || kotlin.jvm.internal.m.a(name, "select")) && String.class.equals(returnType) && objArr.length == 1) {
            Object obj = objArr[0];
            if (obj instanceof List) {
                List list = (List) obj;
                int size = list.size();
                if (size >= 0) {
                    int i = 0;
                    while (true) {
                        Object obj2 = list.get(i);
                        kotlin.jvm.internal.m.c(obj2, "null cannot be cast to non-null type kotlin.String");
                        String str = (String) obj2;
                        if (arrayList.contains(str)) {
                            this.c = str;
                            return str;
                        }
                        if (i != size) {
                            i++;
                        }
                    }
                }
                String str2 = (String) arrayList.get(0);
                this.c = str2;
                return str2;
            }
        }
        if ((!kotlin.jvm.internal.m.a(name, "protocolSelected") && !kotlin.jvm.internal.m.a(name, "selected")) || objArr.length != 1) {
            return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
        }
        Object obj3 = objArr[0];
        kotlin.jvm.internal.m.c(obj3, "null cannot be cast to non-null type kotlin.String");
        this.c = (String) obj3;
        return null;
    }
}

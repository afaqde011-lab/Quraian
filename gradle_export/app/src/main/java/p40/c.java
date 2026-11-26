package p40;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public final class c extends n {
    public final b b;

    public c(l40.a element) {
        super(element);
        kotlin.jvm.internal.m.e(element, "element");
        n40.e elementDesc = element.getDescriptor();
        kotlin.jvm.internal.m.e(elementDesc, "elementDesc");
        this.b = new b(elementDesc);
    }

    @Override
    public final Object a() {
        return new ArrayList();
    }

    @Override
    public final int b(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        kotlin.jvm.internal.m.e(arrayList, "<this>");
        return arrayList.size();
    }

    @Override
    public final Iterator c(Object obj) {
        Collection collection = (Collection) obj;
        kotlin.jvm.internal.m.e(collection, "<this>");
        return collection.iterator();
    }

    @Override
    public final int d(Object obj) {
        Collection collection = (Collection) obj;
        kotlin.jvm.internal.m.e(collection, "<this>");
        return collection.size();
    }

    @Override
    public final Object g(Object obj) {
        kotlin.jvm.internal.m.e(null, "<this>");
        return new ArrayList((Collection) null);
    }

    @Override
    public final n40.e getDescriptor() {
        return this.b;
    }

    @Override
    public final Object h(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        kotlin.jvm.internal.m.e(arrayList, "<this>");
        return arrayList;
    }

    @Override
    public final void i(int i, Object obj, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        kotlin.jvm.internal.m.e(arrayList, "<this>");
        arrayList.add(i, obj2);
    }
}

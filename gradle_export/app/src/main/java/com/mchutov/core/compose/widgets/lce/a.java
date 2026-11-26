package com.mchutov.core.compose.widgets.lce;

import android.content.res.Resources;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.m;

public abstract class a {
    public static final String a(ResourceText resourceText, Resources resources) {
        m.e(resourceText, "<this>");
        if (resourceText instanceof ResourceText.String) {
            ResourceText.String string = (ResourceText.String) resourceText;
            if (string.getArgs().length == 0) {
                return string.getValue();
            }
            String value = string.getValue();
            Object[] args = string.getArgs();
            ArrayList arrayList = new ArrayList(args.length);
            for (Object objA : args) {
                if (objA instanceof ResourceText) {
                    objA = a((ResourceText) objA, resources);
                }
                arrayList.add(objA);
            }
            Object[] array = arrayList.toArray(new Object[0]);
            Object[] objArrCopyOf = Arrays.copyOf(array, array.length);
            return String.format(value, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        }
        if (!(resourceText instanceof ResourceText.Res)) {
            throw new NoWhenBranchMatchedException();
        }
        ResourceText.Res res = (ResourceText.Res) resourceText;
        if (res.getArgs().length == 0) {
            String string2 = resources.getString(res.getValue());
            m.b(string2);
            return string2;
        }
        int value2 = res.getValue();
        Object[] args2 = res.getArgs();
        ArrayList arrayList2 = new ArrayList(args2.length);
        for (Object objA2 : args2) {
            if (objA2 instanceof ResourceText) {
                objA2 = a((ResourceText) objA2, resources);
            }
            arrayList2.add(objA2);
        }
        Object[] array2 = arrayList2.toArray(new Object[0]);
        String string3 = resources.getString(value2, Arrays.copyOf(array2, array2.length));
        m.b(string3);
        return string3;
    }
}

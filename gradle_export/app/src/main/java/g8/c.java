package g8;

import e7.u;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public final class c extends f5.c {
    public long C;
    public long[] D;
    public long[] E;

    public static Serializable W0(int i10, u uVar) {
        if (i10 == 0) {
            return Double.valueOf(Double.longBitsToDouble(uVar.u()));
        }
        if (i10 == 1) {
            return Boolean.valueOf(uVar.A() == 1);
        }
        if (i10 == 2) {
            return Y0(uVar);
        }
        if (i10 != 3) {
            if (i10 == 8) {
                return X0(uVar);
            }
            if (i10 != 10) {
                if (i10 != 11) {
                    return null;
                }
                Date date = new Date((long) Double.longBitsToDouble(uVar.u()));
                uVar.O(2);
                return date;
            }
            int iE = uVar.E();
            ArrayList arrayList = new ArrayList(iE);
            for (int i11 = 0; i11 < iE; i11++) {
                Serializable serializableW0 = W0(uVar.A(), uVar);
                if (serializableW0 != null) {
                    arrayList.add(serializableW0);
                }
            }
            return arrayList;
        }
        HashMap map = new HashMap();
        while (true) {
            String strY0 = Y0(uVar);
            int iA = uVar.A();
            if (iA == 9) {
                return map;
            }
            Serializable serializableW1 = W0(iA, uVar);
            if (serializableW1 != null) {
                map.put(strY0, serializableW1);
            }
        }
    }

    public static HashMap X0(u uVar) {
        int iE = uVar.E();
        HashMap map = new HashMap(iE);
        for (int i10 = 0; i10 < iE; i10++) {
            String strY0 = Y0(uVar);
            Serializable serializableW0 = W0(uVar.A(), uVar);
            if (serializableW0 != null) {
                map.put(strY0, serializableW0);
            }
        }
        return map;
    }

    public static String Y0(u uVar) {
        int iH = uVar.H();
        int i10 = uVar.f5183b;
        uVar.O(iH);
        return new String(uVar.f5182a, i10, iH);
    }
}

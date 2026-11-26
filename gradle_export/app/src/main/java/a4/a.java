package a4;

import com.google.protobuf.RuntimeVersion;
import java.util.List;
import java.util.NoSuchElementException;
import u00.k;

public abstract class a {
    public static String a(List list, String str, k kVar, int i10) {
        if ((i10 & 1) != 0) {
            str = ", ";
        }
        int i11 = i10 & 2;
        String str2 = RuntimeVersion.SUFFIX;
        String str3 = i11 != 0 ? RuntimeVersion.SUFFIX : "[\n\t";
        if ((i10 & 4) == 0) {
            str2 = "\n]";
        }
        if ((i10 & 32) != 0) {
            kVar = null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) str3);
        int size = list.size();
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            Object obj = list.get(i13);
            i12++;
            if (i12 > 1) {
                sb2.append((CharSequence) str);
            }
            if (kVar != null) {
                sb2.append((CharSequence) kVar.invoke(obj));
            } else if (obj != null ? obj instanceof CharSequence : true) {
                sb2.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb2.append(((Character) obj).charValue());
            } else {
                sb2.append((CharSequence) obj.toString());
            }
        }
        sb2.append((CharSequence) str2);
        return sb2.toString();
    }

    public static final Void b(String str) {
        throw new NoSuchElementException(str);
    }

    public static final void c(String str) {
        throw new UnsupportedOperationException(str);
    }
}

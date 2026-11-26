package g1;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.WeakHashMap;

public abstract class y {

    public static final WeakHashMap f6027a = new WeakHashMap();

    public static String a(int i10, Locale locale, int i11) {
        int i12 = (i11 & 1) != 0 ? 1 : 2;
        if ((i11 & 8) != 0) {
            locale = null;
        }
        if (locale == null) {
            locale = Locale.getDefault();
        }
        String str = i12 + ".40.false." + locale.toLanguageTag();
        WeakHashMap weakHashMap = f6027a;
        Object obj = weakHashMap.get(str);
        Object obj2 = obj;
        if (obj == null) {
            NumberFormat integerInstance = NumberFormat.getIntegerInstance(locale);
            integerInstance.setGroupingUsed(false);
            integerInstance.setMinimumIntegerDigits(i12);
            integerInstance.setMaximumIntegerDigits(40);
            weakHashMap.put(str, integerInstance);
            obj2 = integerInstance;
        }
        return ((NumberFormat) obj2).format(Integer.valueOf(i10));
    }
}

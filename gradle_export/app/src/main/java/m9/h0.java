package m9;

import android.text.Html;
import java.util.regex.Pattern;

public abstract class h0 {

    public static final Pattern f10686a = Pattern.compile("(&#13;)?&#10;");

    public static String a(CharSequence charSequence) {
        return f10686a.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }
}

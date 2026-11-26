package l7;

import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.common.ParserException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class g implements w7.n {
    public static final Pattern A = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

    @Override
    public final Object p(Uri uri, g7.h hVar) throws IOException {
        String line = new BufferedReader(new InputStreamReader(hVar, StandardCharsets.UTF_8)).readLine();
        try {
            Matcher matcher = A.matcher(line);
            if (!matcher.matches()) {
                throw ParserException.b("Couldn't parse timestamp: " + line, null);
            }
            String strGroup = matcher.group(1);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            long time = simpleDateFormat.parse(strGroup).getTime();
            if (!"Z".equals(matcher.group(2))) {
                long j9 = "+".equals(matcher.group(4)) ? 1L : -1L;
                long j10 = Long.parseLong(matcher.group(5));
                String strGroup2 = matcher.group(7);
                time -= (((j10 * 60) + (TextUtils.isEmpty(strGroup2) ? 0L : Long.parseLong(strGroup2))) * 60000) * j9;
            }
            return Long.valueOf(time);
        } catch (ParseException e3) {
            throw ParserException.b(null, e3);
        }
    }
}

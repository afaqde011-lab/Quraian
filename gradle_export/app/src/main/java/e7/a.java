package e7;

import android.media.MediaFormat;
import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.xmlpull.v1.XmlPullParser;

public abstract class a {

    public static ExecutorService f5110a;

    public static final Object f5111b = new Object();

    public static String a(String str, Throwable th2) {
        String strReplace;
        if (th2 != null) {
            synchronized (f5111b) {
                Throwable cause = th2;
                while (true) {
                    if (cause == null) {
                        strReplace = Log.getStackTraceString(th2).trim().replace("\t", "    ");
                        break;
                    }
                    try {
                        if (cause instanceof UnknownHostException) {
                            strReplace = "UnknownHostException (no network)";
                            break;
                        }
                        cause = cause.getCause();
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            }
        } else {
            strReplace = null;
        }
        if (TextUtils.isEmpty(strReplace)) {
            return str;
        }
        return str + "\n  " + strReplace.replace("\n", "\n  ") + '\n';
    }

    public static void b(String str, String str2) {
        synchronized (f5111b) {
            Log.d(str, a(str2, null));
        }
    }

    public static void c(String str, String str2, Exception exc) {
        synchronized (f5111b) {
            Log.d(str, a(str2, exc));
        }
    }

    public static void d(String str, String str2) {
        synchronized (f5111b) {
            Log.e(str, a(str2, null));
        }
    }

    public static void e(String str, String str2, Throwable th2) {
        synchronized (f5111b) {
            Log.e(str, a(str2, th2));
        }
    }

    public static synchronized Executor f() {
        try {
            if (f5110a == null) {
                String str = i0.f5136a;
                f5110a = Executors.newSingleThreadExecutor(new f0("ExoPlayer:BackgroundExecutor", 0));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f5110a;
    }

    public static String g(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            if (xmlPullParser.getAttributeName(i10).equals(str)) {
                return xmlPullParser.getAttributeValue(i10);
            }
        }
        return null;
    }

    public static void h(String str, String str2) {
        synchronized (f5111b) {
            Log.i(str, a(str2, null));
        }
    }

    public static boolean i(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str);
    }

    public static boolean j(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals(str);
    }

    public static void k(MediaFormat mediaFormat, String str, int i10) {
        if (i10 != -1) {
            mediaFormat.setInteger(str, i10);
        }
    }

    public static void l(MediaFormat mediaFormat, List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            mediaFormat.setByteBuffer(g4.c.f(i10, "csd-"), ByteBuffer.wrap((byte[]) list.get(i10)));
        }
    }

    public static void m(String str, String str2) {
        synchronized (f5111b) {
            Log.w(str, a(str2, null));
        }
    }

    public static void n(String str, String str2, Throwable th2) {
        synchronized (f5111b) {
            Log.w(str, a(str2, th2));
        }
    }
}

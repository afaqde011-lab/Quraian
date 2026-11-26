package k;

import android.content.ComponentName;
import android.content.Context;
import android.util.Log;
import android.util.Xml;
import com.google.protobuf.RuntimeVersion;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class m implements Runnable {
    public final int A;
    public final Context B;

    public m(Context context, int i10) {
        this.A = i10;
        this.B = context;
    }

    @Override
    public final void run() {
        Object systemService;
        String attributeValue;
        Context context;
        int i10 = this.A;
        Context context2 = this.B;
        switch (i10) {
            case 0:
                ComponentName componentName = new ComponentName(context2, "androidx.appcompat.app.AppLocalesMetadataHolderService");
                if (context2.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                    u.f fVar = p.E;
                    fVar.getClass();
                    u.a aVar = new u.a(fVar);
                    while (true) {
                        if (aVar.hasNext()) {
                            p pVar = (p) ((WeakReference) aVar.next()).get();
                            if (pVar != null && (context = ((b0) pVar).I) != null) {
                                systemService = context.getSystemService("locale");
                            }
                        } else {
                            systemService = null;
                        }
                    }
                    if ((systemService != null ? new u4.d(new u4.e(o.a(systemService))) : u4.d.f14942b).f14943a.f14944a.isEmpty()) {
                        synchronized (n4.b.f11055a) {
                            attributeValue = RuntimeVersion.SUFFIX;
                            try {
                                try {
                                    FileInputStream fileInputStreamOpenFileInput = context2.openFileInput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                                    try {
                                        try {
                                            XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                                            xmlPullParserNewPullParser.setInput(fileInputStreamOpenFileInput, "UTF-8");
                                            int depth = xmlPullParserNewPullParser.getDepth();
                                            while (true) {
                                                int next = xmlPullParserNewPullParser.next();
                                                if (next != 1 && (next != 3 || xmlPullParserNewPullParser.getDepth() > depth)) {
                                                    if (next != 3 && next != 4 && xmlPullParserNewPullParser.getName().equals("locales")) {
                                                        attributeValue = xmlPullParserNewPullParser.getAttributeValue(null, "application_locales");
                                                    }
                                                    break;
                                                }
                                            }
                                            if (fileInputStreamOpenFileInput != null) {
                                                try {
                                                    fileInputStreamOpenFileInput.close();
                                                    break;
                                                } catch (IOException unused) {
                                                }
                                            }
                                        } catch (Throwable th2) {
                                            if (fileInputStreamOpenFileInput == null) {
                                                throw th2;
                                            }
                                            try {
                                                fileInputStreamOpenFileInput.close();
                                                throw th2;
                                            } catch (IOException unused2) {
                                                throw th2;
                                            }
                                        }
                                    } catch (IOException | XmlPullParserException unused3) {
                                        Log.w("AppLocalesStorageHelper", "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                                        if (fileInputStreamOpenFileInput != null) {
                                            fileInputStreamOpenFileInput.close();
                                        }
                                        break;
                                    }
                                    if (attributeValue.isEmpty()) {
                                        context2.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                                    }
                                } catch (FileNotFoundException unused4) {
                                }
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                        Object systemService2 = context2.getSystemService("locale");
                        if (systemService2 != null) {
                            o.b(systemService2, n.a(attributeValue));
                        }
                    }
                    context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                }
                p.D = true;
                return;
            case 1:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new m(context2, 2));
                return;
            default:
                z9.c.t(context2, new f5.d(0), z9.c.f17316a, false);
                return;
        }
    }
}

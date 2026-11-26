package cc;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import k50.c0;
import mc.r;

public abstract class d {

    public static final HashMap f3122a = new HashMap();

    public static final HashSet f3123b = new HashSet();

    public static final byte[] f3124c = {80, 75, 3, 4};

    public static l a(nc.d dVar, String str, boolean z10) {
        try {
            a aVarA = r.a(dVar);
            if (str != null) {
                ic.e.f7605b.f7606a.d(str, aVarA);
            }
            return new l(aVarA);
        } catch (Exception e3) {
            return new l((Throwable) e3);
        } finally {
            if (z10) {
                oc.e.b(dVar);
            }
        }
    }

    public static l b(Context context, ZipInputStream zipInputStream, String str) {
        j jVar;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            a aVar = null;
            while (nextEntry != null) {
                String name = nextEntry.getName();
                if (name.contains("__MACOSX")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().contains(".json")) {
                    c0 c0VarR = bi.b.r(bi.b.S(zipInputStream));
                    String[] strArr = nc.c.E;
                    aVar = (a) a(new nc.d(c0VarR), null, false).f3135a;
                } else if (name.contains(".png") || name.contains(".webp") || name.contains(".jpg") || name.contains(".jpeg")) {
                    String[] strArrSplit = name.split("/");
                    map.put(strArrSplit[strArrSplit.length - 1], BitmapFactory.decodeStream(zipInputStream));
                } else if (name.contains(".ttf") || name.contains(".otf")) {
                    String[] strArrSplit2 = name.split("/");
                    String str2 = strArrSplit2[strArrSplit2.length - 1];
                    String str3 = str2.split("\\.")[0];
                    File file = new File(context.getCacheDir(), str2);
                    new FileOutputStream(file);
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        try {
                            byte[] bArr = new byte[4096];
                            while (true) {
                                int i10 = zipInputStream.read(bArr);
                                if (i10 == -1) {
                                    break;
                                }
                                fileOutputStream.write(bArr, 0, i10);
                            }
                            fileOutputStream.flush();
                            fileOutputStream.close();
                        } catch (Throwable th2) {
                            try {
                                fileOutputStream.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    } catch (Throwable th4) {
                        oc.b.b("Unable to save font " + str3 + " to the temporary file: " + str2 + ". ", th4);
                    }
                    Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                    if (!file.delete()) {
                        oc.b.a("Failed to delete temp font file " + file.getAbsolutePath() + ".");
                    }
                    map2.put(str3, typefaceCreateFromFile);
                } else {
                    zipInputStream.closeEntry();
                }
                nextEntry = zipInputStream.getNextEntry();
            }
            if (aVar == null) {
                return new l((Throwable) new IllegalArgumentException("Unable to parse composition"));
            }
            for (Map.Entry entry : map.entrySet()) {
                String str4 = (String) entry.getKey();
                Iterator it = aVar.f3109d.values().iterator();
                do {
                    if (!it.hasNext()) {
                        jVar = null;
                        break;
                    }
                    jVar = (j) it.next();
                } while (!jVar.f3133c.equals(str4));
                if (jVar != null) {
                    jVar.f3134d = oc.e.e((Bitmap) entry.getValue(), jVar.f3131a, jVar.f3132b);
                }
            }
            for (Map.Entry entry2 : map2.entrySet()) {
                boolean z10 = false;
                for (ic.c cVar : aVar.f3110e.values()) {
                    if (cVar.f7597a.equals(entry2.getKey())) {
                        cVar.f7599c = (Typeface) entry2.getValue();
                        z10 = true;
                    }
                }
                if (!z10) {
                    oc.b.a("Parsed font for " + ((String) entry2.getKey()) + " however it was not found in the animation.");
                }
            }
            if (map.isEmpty()) {
                Iterator it2 = aVar.f3109d.entrySet().iterator();
                while (it2.hasNext()) {
                    j jVar2 = (j) ((Map.Entry) it2.next()).getValue();
                    if (jVar2 == null) {
                        return null;
                    }
                    String str5 = jVar2.f3133c;
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inScaled = true;
                    options.inDensity = 160;
                    if (str5.startsWith("data:") && str5.indexOf("base64,") > 0) {
                        try {
                            byte[] bArrDecode = Base64.decode(str5.substring(str5.indexOf(44) + 1), 0);
                            jVar2.f3134d = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
                        } catch (IllegalArgumentException e3) {
                            oc.b.b("data URL did not have correct base64 format.", e3);
                            return null;
                        }
                    }
                }
            }
            for (Map.Entry entry3 : aVar.f3109d.entrySet()) {
                if (((j) entry3.getValue()).f3134d == null) {
                    return new l((Throwable) new IllegalStateException("There is no image for ".concat(((j) entry3.getValue()).f3133c)));
                }
            }
            if (str != null) {
                ic.e.f7605b.f7606a.d(str, aVar);
            }
            return new l(aVar);
        } catch (IOException e10) {
            return new l((Throwable) e10);
        }
    }

    public static void c() {
        ArrayList arrayList = new ArrayList(f3123b);
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }
}

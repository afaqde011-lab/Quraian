package ui;

import a30.k;
import android.util.Log;
import b3.c0;
import com.google.protobuf.RuntimeVersion;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;
import oi.h;
import oi.j;
import ri.j2;

public final class a {

    public static final Charset f15295e = Charset.forName("UTF-8");

    public static final int f15296f = 15;

    public static final si.a f15297g = new si.a();

    public static final c0 f15298h = new c0(12);

    public static final h f15299i = new h(2);

    public final AtomicInteger f15300a = new AtomicInteger(0);

    public final b f15301b;

    public final k f15302c;

    public final j f15303d;

    public a(b bVar, k kVar, j jVar) {
        this.f15301b = bVar;
        this.f15302c = kVar;
        this.f15303d = jVar;
    }

    public static void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    public static String e(File file) {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int i10 = fileInputStream.read(bArr);
                if (i10 <= 0) {
                    String str = new String(byteArrayOutputStream.toByteArray(), f15295e);
                    fileInputStream.close();
                    return str;
                }
                byteArrayOutputStream.write(bArr, 0, i10);
            } catch (Throwable th2) {
                try {
                    fileInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    public static void f(File file, String str) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f15295e);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th2) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        b bVar = this.f15301b;
        arrayList.addAll(b.z(((File) bVar.G).listFiles()));
        arrayList.addAll(b.z(((File) bVar.H).listFiles()));
        c0 c0Var = f15298h;
        Collections.sort(arrayList, c0Var);
        List listZ = b.z(((File) bVar.F).listFiles());
        Collections.sort(listZ, c0Var);
        arrayList.addAll(listZ);
        return arrayList;
    }

    public final NavigableSet c() {
        return new TreeSet(b.z(((File) this.f15301b.E).list())).descendingSet();
    }

    public final void d(j2 j2Var, String str, boolean z10) {
        b bVar = this.f15301b;
        int i10 = this.f15302c.d().f16088a.A;
        f15297g.getClass();
        try {
            f(bVar.p(str, a1.b.p("event", String.format(Locale.US, "%010d", Integer.valueOf(this.f15300a.getAndIncrement())), z10 ? "_" : RuntimeVersion.SUFFIX)), si.a.f14241a.C(j2Var));
        } catch (IOException e3) {
            Log.w("FirebaseCrashlytics", "Could not persist event for session " + str, e3);
        }
        h hVar = new h(3);
        bVar.getClass();
        File file = new File((File) bVar.E, str);
        file.mkdirs();
        List<File> listZ = b.z(file.listFiles(hVar));
        Collections.sort(listZ, new c0(13));
        int size = listZ.size();
        for (File file2 : listZ) {
            if (size <= i10) {
                return;
            }
            b.y(file2);
            size--;
        }
    }
}

package oi;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Base64;
import android.util.JsonReader;
import android.util.Log;
import com.google.android.gms.tasks.Tasks;
import com.google.protobuf.RuntimeVersion;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicMarkableReference;
import ri.a0;
import ri.b0;
import ri.c0;
import ri.d0;
import ri.e0;
import ri.h1;
import ri.i0;
import ri.j0;
import ri.j1;
import ri.k0;
import ri.k1;
import ri.l1;
import ri.m0;
import ri.m1;
import ri.m2;
import ri.n1;
import ri.n2;
import ri.o0;
import ri.p0;
import ri.q0;
import ri.r0;
import ri.u0;
import ri.y0;
import ri.z0;

public final class n {

    public static final h f12015r = new h(1);

    public static final Charset f12016s = Charset.forName("UTF-8");

    public final Context f12017a;

    public final a2.o f12018b;

    public final h1.l f12019c;

    public final ui.b f12020d;

    public final pi.e f12021e;

    public final x f12022f;

    public final ui.b f12023g;

    public final a f12024h;

    public final qi.f f12025i;

    public final li.a f12026j;

    public final mi.a f12027k;
    public final j l;
    public final ui.b m;

    public u f12028n;

    public final xf.g f12029o = new xf.g();

    public final xf.g f12030p = new xf.g();

    public final xf.g f12031q = new xf.g();

    public n(Context context, x xVar, a2.o oVar, ui.b bVar, h1.l lVar, a aVar, ui.b bVar2, qi.f fVar, ui.b bVar3, li.a aVar2, mi.a aVar3, j jVar, pi.e eVar) {
        new AtomicBoolean(false);
        this.f12017a = context;
        this.f12022f = xVar;
        this.f12018b = oVar;
        this.f12023g = bVar;
        this.f12019c = lVar;
        this.f12024h = aVar;
        this.f12020d = bVar2;
        this.f12025i = fVar;
        this.f12026j = aVar2;
        this.f12027k = aVar3;
        this.l = jVar;
        this.m = bVar3;
        this.f12021e = eVar;
    }

    public static xf.n a(n nVar) {
        xf.n nVarB;
        nVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (File file : ui.b.z(((File) nVar.f12023g.D).listFiles(f12015r))) {
            try {
                long j9 = Long.parseLong(file.getName().substring(3));
                try {
                    Class.forName("com.google.firebase.crash.FirebaseCrash");
                    Log.w("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, FirebaseCrash exists", null);
                    nVarB = Tasks.d(null);
                } catch (ClassNotFoundException unused) {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Logging app exception event to Firebase Analytics", null);
                    }
                    nVarB = Tasks.b(new ScheduledThreadPoolExecutor(1), new m(nVar, j9));
                }
                arrayList.add(nVarB);
            } catch (NumberFormatException unused2) {
                Log.w("FirebaseCrashlytics", "Could not parse app exception timestamp from file " + file.getName(), null);
            }
            file.delete();
        }
        return Tasks.e(arrayList);
    }

    public final void b(boolean z10, a30.k kVar, boolean z11) throws Throwable {
        ArrayList arrayList;
        ui.b bVar;
        int i10;
        boolean z12;
        int i11;
        int i12;
        ?? r11;
        boolean z13;
        String str;
        String strSubstring;
        boolean z14;
        String[] list;
        List listB;
        ApplicationExitInfo next;
        String strG;
        List listUnmodifiableList;
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2;
        li.a aVar = this.f12026j;
        pi.e.a();
        ui.b bVar2 = this.m;
        ArrayList arrayList2 = new ArrayList(((ui.a) bVar2.C).c());
        if (arrayList2.size() <= z10) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No open sessions to be closed.", null);
                return;
            }
            return;
        }
        String str2 = (String) arrayList2.get(z10 == true ? 1 : 0);
        if (z11 && kVar.d().f16089b.f9048b) {
            ui.b bVar3 = this.f12023g;
            i11 = 4;
            List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) this.f12017a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
            if (historicalProcessExitReasons.size() != 0) {
                qi.f fVar = new qi.f(bVar3);
                i12 = 8;
                fVar.B = qi.f.C;
                if (str2 != null) {
                    fVar.B = new qi.m(bVar3.p(str2, "userlog"));
                }
                pi.e eVar = this.f12021e;
                qi.h hVar = new qi.h(bVar3);
                ui.b bVar4 = new ui.b(str2, bVar3, eVar);
                ((qi.e) ((AtomicMarkableReference) ((c7.c) bVar4.E).B).getReference()).c(hVar.c(str2, false));
                ((qi.e) ((AtomicMarkableReference) ((c7.c) bVar4.F).B).getReference()).c(hVar.c(str2, true));
                ((AtomicMarkableReference) bVar4.H).set(hVar.d(str2), false);
                b50.o oVar = (b50.o) bVar4.G;
                File fileP = bVar3.p(str2, "rollouts-state");
                if (!fileP.exists() || fileP.length() == 0) {
                    qi.h.g(fileP, "The file has a length of zero for session: " + str2);
                    listB = Collections.EMPTY_LIST;
                } else {
                    try {
                        fileInputStream2 = new FileInputStream(fileP);
                        try {
                            try {
                                listB = qi.h.b(g.i(fileInputStream2));
                                String str3 = "Loaded rollouts state:\n" + listB + "\nfor session " + str2;
                                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                    Log.d("FirebaseCrashlytics", str3, null);
                                }
                                g.b(fileInputStream2, "Failed to close rollouts state file.");
                            } catch (Exception e3) {
                                e = e3;
                                Log.w("FirebaseCrashlytics", "Error deserializing rollouts state.", e);
                                qi.h.f(fileP);
                                g.b(fileInputStream2, "Failed to close rollouts state file.");
                                listB = Collections.EMPTY_LIST;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            fileInputStream = fileInputStream2;
                            g.b(fileInputStream, "Failed to close rollouts state file.");
                            throw th;
                        }
                    } catch (Exception e10) {
                        e = e10;
                        fileInputStream2 = null;
                    } catch (Throwable th3) {
                        th = th3;
                        fileInputStream = null;
                        g.b(fileInputStream, "Failed to close rollouts state file.");
                        throw th;
                    }
                }
                oVar.c(listB);
                ui.a aVar2 = (ui.a) bVar2.C;
                long jLastModified = aVar2.f15301b.p(str2, "start-time").lastModified();
                Iterator<ApplicationExitInfo> it = historicalProcessExitReasons.iterator();
                do {
                    if (it.hasNext()) {
                        next = it.next();
                        if (next.getTimestamp() < jLastModified) {
                        }
                    }
                    next = null;
                    break;
                } while (next.getReason() != 6);
                if (next == null) {
                    String strO = a1.b.o("No relevant ApplicationExitInfo occurred during session: ", str2);
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", strO, null);
                    }
                    arrayList = arrayList2;
                    bVar = bVar2;
                    z12 = true;
                } else {
                    t tVar = (t) bVar2.B;
                    try {
                        InputStream traceInputStream = next.getTraceInputStream();
                        strG = traceInputStream != null ? ui.b.g(traceInputStream) : null;
                    } catch (IOException e11) {
                        Log.w("FirebaseCrashlytics", "Could not get input trace in application exit info: " + next.toString() + " Error: " + e11, null);
                    }
                    c0 c0Var = new c0();
                    c0Var.f13289d = next.getImportance();
                    c0Var.f13295j = (byte) (c0Var.f13295j | 4);
                    String processName = next.getProcessName();
                    if (processName == null) {
                        throw new NullPointerException("Null processName");
                    }
                    c0Var.f13287b = processName;
                    c0Var.f13288c = next.getReason();
                    c0Var.f13295j = (byte) (c0Var.f13295j | 2);
                    c0Var.f13292g = next.getTimestamp();
                    c0Var.f13295j = (byte) (c0Var.f13295j | 32);
                    c0Var.f13286a = next.getPid();
                    c0Var.f13295j = (byte) (c0Var.f13295j | 1);
                    c0Var.f13290e = next.getPss();
                    c0Var.f13295j = (byte) (c0Var.f13295j | 8);
                    c0Var.f13291f = next.getRss();
                    c0Var.f13295j = (byte) (c0Var.f13295j | 16);
                    c0Var.f13293h = strG;
                    d0 d0VarA = c0Var.a();
                    int i13 = tVar.f12048a.getResources().getConfiguration().orientation;
                    o0 o0Var = new o0();
                    o0Var.f13478b = "anr";
                    long j9 = d0VarA.f13314g;
                    o0Var.f13477a = j9;
                    o0Var.f13483g = (byte) (o0Var.f13483g | 1);
                    a aVar3 = tVar.f12050c;
                    if (!tVar.f12052e.d().f16089b.f9049c || aVar3.f11981c.size() <= 0) {
                        arrayList = arrayList2;
                        bVar = bVar2;
                        listUnmodifiableList = null;
                    } else {
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it2 = aVar3.f11981c.iterator();
                        while (it2.hasNext()) {
                            Iterator it3 = it2;
                            d dVar = (d) it2.next();
                            ui.b bVar5 = bVar2;
                            String str4 = dVar.f11993a;
                            if (str4 == null) {
                                throw new NullPointerException("Null libraryName");
                            }
                            String str5 = dVar.f11994b;
                            if (str5 == null) {
                                throw new NullPointerException("Null arch");
                            }
                            String str6 = dVar.f11995c;
                            if (str6 == null) {
                                throw new NullPointerException("Null buildId");
                            }
                            arrayList3.add(new e0(str5, str4, str6));
                            it2 = it3;
                            bVar2 = bVar5;
                            arrayList2 = arrayList2;
                        }
                        arrayList = arrayList2;
                        bVar = bVar2;
                        listUnmodifiableList = Collections.unmodifiableList(arrayList3);
                    }
                    c0 c0Var2 = new c0();
                    c0Var2.f13289d = d0VarA.f13311d;
                    byte b7 = (byte) (c0Var2.f13295j | 4);
                    c0Var2.f13295j = b7;
                    String str7 = d0VarA.f13309b;
                    if (str7 == null) {
                        throw new NullPointerException("Null processName");
                    }
                    c0Var2.f13287b = str7;
                    c0Var2.f13288c = d0VarA.f13310c;
                    c0Var2.f13292g = j9;
                    c0Var2.f13286a = d0VarA.f13308a;
                    c0Var2.f13290e = d0VarA.f13312e;
                    c0Var2.f13291f = d0VarA.f13313f;
                    c0Var2.f13295j = (byte) (((byte) (((byte) (((byte) (((byte) (b7 | 2)) | 32)) | 1)) | 8)) | 16);
                    c0Var2.f13293h = d0VarA.f13315h;
                    c0Var2.f13294i = listUnmodifiableList;
                    d0 d0VarA2 = c0Var2.a();
                    Boolean boolValueOf = Boolean.valueOf(d0VarA2.f13311d != 100);
                    String str8 = d0VarA2.f13309b;
                    int i14 = d0VarA2.f13308a;
                    int i15 = d0VarA2.f13311d;
                    kotlin.jvm.internal.m.e(str8, "processName");
                    if ((8 & 4) != 0) {
                        i15 = 0;
                    }
                    y0 y0Var = new y0();
                    y0Var.f13574a = str8;
                    y0Var.f13575b = i14;
                    byte b10 = (byte) (y0Var.f13578e | 1);
                    y0Var.f13576c = i15;
                    y0Var.f13577d = false;
                    y0Var.f13578e = (byte) (((byte) (b10 | 2)) | 4);
                    z0 z0VarA = y0Var.a();
                    byte b11 = (byte) 1;
                    u0 u0VarE = t.e();
                    List listA = tVar.a();
                    if (listA == null) {
                        throw new NullPointerException("Null binaries");
                    }
                    r0 r0Var = new r0(null, null, d0VarA2, u0VarE, listA);
                    if (b11 != 1) {
                        StringBuilder sb2 = new StringBuilder();
                        if (b11 == 0) {
                            sb2.append(" uiOrientation");
                        }
                        throw new IllegalStateException(k.j("Missing required properties:", sb2));
                    }
                    o0Var.f13479c = new q0(r0Var, null, null, boolValueOf, z0VarA, null, i13);
                    o0Var.f13480d = tVar.b(i13);
                    p0 p0VarA = o0Var.a();
                    String strO2 = a1.b.o("Persisting anr for session ", str2);
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", strO2, null);
                    }
                    z12 = true;
                    aVar2.d(ui.b.c(ui.b.b(p0VarA, fVar, bVar4, Collections.EMPTY_MAP), bVar4), str2, true);
                }
                i10 = 2;
            } else {
                arrayList = arrayList2;
                bVar = bVar2;
                z12 = true;
                i12 = 8;
                String strO3 = a1.b.o("No ApplicationExitInfo available. Session: ", str2);
                i10 = 2;
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    r11 = 0;
                    Log.v("FirebaseCrashlytics", strO3, null);
                }
            }
            r11 = 0;
        } else {
            arrayList = arrayList2;
            bVar = bVar2;
            i10 = 2;
            Object obj = null;
            z12 = true;
            i11 = 4;
            i12 = 8;
            r11 = obj;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "ANR feature disabled.", null);
                r11 = obj;
            }
        }
        if (z11 && aVar.c(str2)) {
            String strO4 = a1.b.o("Finalizing native report for session ", str2);
            if (Log.isLoggable("FirebaseCrashlytics", i10)) {
                Log.v("FirebaseCrashlytics", strO4, r11);
            }
            aVar.a(str2).getClass();
            Log.w("FirebaseCrashlytics", "No minidump data found for session " + str2, r11);
            Log.i("FirebaseCrashlytics", "No Tombstones data found for session " + str2, r11);
            Log.w("FirebaseCrashlytics", "No native core present", r11);
        }
        if (z10 != 0) {
            z13 = false;
            str = (String) arrayList.get(0);
        } else {
            z13 = false;
            this.l.a(r11);
            str = null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        ui.a aVar4 = (ui.a) bVar.C;
        ui.b bVar6 = aVar4.f15301b;
        bVar6.e(".com.google.firebase.crashlytics");
        bVar6.e(".com.google.firebase.crashlytics-ndk");
        if (!((String) bVar6.B).isEmpty()) {
            bVar6.e(".com.google.firebase.crashlytics.files.v1");
            String str9 = ".com.google.firebase.crashlytics.files.v2" + File.pathSeparator;
            File file = (File) bVar6.C;
            if (file.exists() && (list = file.list(new ld.b(str9, 3))) != null) {
                int length = list.length;
                for (?? r10 = z13; r10 < length; r10++) {
                    bVar6.e(list[r10]);
                }
            }
        }
        NavigableSet<String> navigableSetC = aVar4.c();
        if (str != null) {
            navigableSetC.remove(str);
        }
        int i16 = i12;
        if (navigableSetC.size() > i16) {
            while (navigableSetC.size() > i16) {
                String str10 = (String) navigableSetC.last();
                String strO5 = a1.b.o("Removing session over cap: ", str10);
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", strO5, null);
                }
                ui.b.y(new File((File) bVar6.E, str10));
                navigableSetC.remove(str10);
            }
        }
        for (String str11 : navigableSetC) {
            String strO6 = a1.b.o("Finalizing report for session ", str11);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", strO6, null);
            }
            si.a aVar5 = ui.a.f15297g;
            h hVar2 = ui.a.f15299i;
            File file2 = new File((File) bVar6.E, str11);
            file2.mkdirs();
            List<File> listZ = ui.b.z(file2.listFiles(hVar2));
            if (listZ.isEmpty()) {
                String strP = a1.b.p("Session ", str11, " has no events.");
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", strP, null);
                }
            } else {
                Collections.sort(listZ);
                ArrayList arrayList4 = new ArrayList();
                boolean z15 = z13;
                for (File file3 : listZ) {
                    try {
                        String strE = ui.a.e(file3);
                        aVar5.getClass();
                        try {
                            JsonReader jsonReader = new JsonReader(new StringReader(strE));
                            try {
                                p0 p0VarE = si.a.e(jsonReader);
                                jsonReader.close();
                                arrayList4.add(p0VarE);
                                if (z15) {
                                    z14 = z12;
                                } else {
                                    String name = file3.getName();
                                    if (name.startsWith("event") && name.endsWith("_")) {
                                        z14 = z12;
                                    } else {
                                        z14 = false;
                                    }
                                }
                                z15 = z14;
                            } catch (Throwable th4) {
                                try {
                                    jsonReader.close();
                                } catch (Throwable th5) {
                                    th4.addSuppressed(th5);
                                }
                                throw th4;
                            }
                        } catch (IllegalStateException e12) {
                            throw new IOException(e12);
                        }
                    } catch (IOException e13) {
                        Log.w("FirebaseCrashlytics", "Could not add event to report for " + file3, e13);
                    }
                }
                if (arrayList4.isEmpty()) {
                    Log.w("FirebaseCrashlytics", "Could not parse event files for session " + str11, null);
                } else {
                    String strD = new qi.h(bVar6).d(str11);
                    i iVar = aVar4.f15303d.f12007b;
                    synchronized (iVar) {
                        if (Objects.equals(iVar.f12004b, str11)) {
                            strSubstring = iVar.f12005c;
                        } else {
                            ui.b bVar7 = iVar.f12003a;
                            h hVar3 = i.f12001d;
                            File file4 = new File((File) bVar7.E, str11);
                            file4.mkdirs();
                            List listZ2 = ui.b.z(file4.listFiles(hVar3));
                            if (listZ2.isEmpty()) {
                                Log.w("FirebaseCrashlytics", "Unable to read App Quality Sessions session id.", null);
                                strSubstring = null;
                            } else {
                                strSubstring = ((File) Collections.min(listZ2, i.f12002e)).getName().substring(i11);
                            }
                        }
                    }
                    File fileP2 = bVar6.p(str11, "report");
                    try {
                        String strE2 = ui.a.e(fileP2);
                        aVar5.getClass();
                        b0 b0VarI = si.a.i(strE2);
                        a0 a0VarA = b0VarI.a();
                        m2 m2Var = b0VarI.f13276k;
                        if (m2Var != null) {
                            try {
                                i0 i0VarA = m2Var.a();
                                i0VarA.f13372e = Long.valueOf(jCurrentTimeMillis);
                                i0VarA.f13373f = z15;
                                try {
                                    i0VarA.m = (byte) (i0VarA.m | 2);
                                    if (strD != null) {
                                        i0VarA.f13375h = new j1(strD);
                                    }
                                    a0VarA.f13248j = i0VarA.a();
                                } catch (IOException e14) {
                                    e = e14;
                                    Log.w("FirebaseCrashlytics", "Could not synthesize final report file for " + fileP2, e);
                                    ui.b.y(new File((File) bVar6.E, str11));
                                    z13 = false;
                                    z12 = true;
                                    i11 = 4;
                                }
                            } catch (IOException e15) {
                                e = e15;
                            }
                        }
                        b0 b0VarA = a0VarA.a();
                        a0 a0VarA2 = b0VarA.a();
                        a0VarA2.f13245g = strSubstring;
                        m2 m2Var2 = b0VarA.f13276k;
                        if (m2Var2 != null) {
                            i0 i0VarA2 = m2Var2.a();
                            i0VarA2.f13370c = strSubstring;
                            a0VarA2.f13248j = i0VarA2.a();
                        }
                        b0 b0VarA2 = a0VarA2.a();
                        m2 m2Var3 = b0VarA2.f13276k;
                        if (m2Var3 == null) {
                            throw new IllegalStateException("Reports without sessions cannot have events added to them.");
                        }
                        a0 a0VarA3 = b0VarA2.a();
                        i0 i0VarA3 = m2Var3.a();
                        i0VarA3.f13378k = arrayList4;
                        a0VarA3.f13248j = i0VarA3.a();
                        b0 b0VarA3 = a0VarA3.a();
                        m2 m2Var4 = b0VarA3.f13276k;
                        if (m2Var4 != null) {
                            String str12 = "appQualitySessionId: " + strSubstring;
                            try {
                                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                    try {
                                        Log.d("FirebaseCrashlytics", str12, null);
                                    } catch (IOException e16) {
                                        e = e16;
                                        Log.w("FirebaseCrashlytics", "Could not synthesize final report file for " + fileP2, e);
                                    }
                                }
                                ui.a.f(z15 ? new File((File) bVar6.G, ((j0) m2Var4).f13395b) : new File((File) bVar6.F, ((j0) m2Var4).f13395b), si.a.f14241a.C(b0VarA3));
                            } catch (IOException e17) {
                                e = e17;
                                Log.w("FirebaseCrashlytics", "Could not synthesize final report file for " + fileP2, e);
                            }
                        }
                        e = e16;
                    } catch (IOException e18) {
                        e = e18;
                    }
                    Log.w("FirebaseCrashlytics", "Could not synthesize final report file for " + fileP2, e);
                }
                ui.b.y(new File((File) bVar6.E, str11));
                z13 = false;
                z12 = true;
                i11 = 4;
            }
            ui.b.y(new File((File) bVar6.E, str11));
            z13 = false;
            z12 = true;
            i11 = 4;
        }
        com.google.android.gms.internal.cast.o oVar2 = aVar4.f15302c.d().f16088a;
        ArrayList arrayListB = aVar4.b();
        int size = arrayListB.size();
        if (size <= 4) {
            return;
        }
        Iterator it4 = arrayListB.subList(4, size).iterator();
        while (it4.hasNext()) {
            ((File) it4.next()).delete();
        }
    }

    public final void c(String str, Boolean bool) {
        String str2;
        String str3;
        String str4;
        int i10;
        Integer num;
        Map mapUnmodifiableMap;
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        String strO = a1.b.o("Opening a new session with ID ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", strO, null);
        }
        Locale locale = Locale.US;
        x xVar = this.f12022f;
        a aVar = this.f12024h;
        l1 l1Var = new l1(xVar.f12064c, aVar.f11984f, aVar.f11985g, xVar.c().f11990a, k.c(aVar.f11982d != null ? 4 : 1), aVar.f11986h);
        String str5 = Build.VERSION.RELEASE;
        String str6 = Build.VERSION.CODENAME;
        n1 n1Var = new n1(g.g());
        Context context = this.f12017a;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        f fVar = f.A;
        String str7 = Build.CPU_ABI;
        if (!TextUtils.isEmpty(str7)) {
            f fVar2 = (f) f.B.get(str7.toLowerCase(locale));
            if (fVar2 != null) {
                fVar = fVar2;
            }
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Architecture#getValue()::Build.CPU_ABI returned null or empty", null);
        }
        int iOrdinal = fVar.ordinal();
        String str8 = Build.MODEL;
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        long jA = g.a(context);
        boolean zF = g.f();
        int iC = g.c();
        String str9 = Build.MANUFACTURER;
        String str10 = Build.PRODUCT;
        this.f12026j.d(str, jCurrentTimeMillis, new k1(l1Var, n1Var, new m1(iOrdinal, iAvailableProcessors, jA, blockCount, zF, iC)));
        if (!bool.booleanValue() || str == null) {
            str2 = str6;
            str3 = str9;
            str4 = str10;
            i10 = 4;
        } else {
            ui.b bVar = this.f12020d;
            synchronized (((String) bVar.B)) {
                bVar.B = str;
                qi.e eVar = (qi.e) ((AtomicMarkableReference) ((c7.c) bVar.E).B).getReference();
                synchronized (eVar) {
                    mapUnmodifiableMap = Collections.unmodifiableMap(new HashMap(eVar.f13021a));
                }
                str3 = str9;
                str2 = str6;
                str4 = str10;
                i10 = 4;
                ((pi.e) bVar.D).f12530b.a(new ab.k((Object) bVar, (Object) str, (Object) mapUnmodifiableMap, ((b50.o) bVar.G).a(), 16));
            }
        }
        qi.f fVar3 = this.f12025i;
        ((qi.d) fVar3.B).a();
        fVar3.B = qi.f.C;
        if (str != null) {
            fVar3.B = new qi.m(((ui.b) fVar3.A).p(str, "userlog"));
        }
        this.l.a(str);
        ui.b bVar2 = this.m;
        t tVar = (t) bVar2.B;
        Charset charset = n2.f13472a;
        a0 a0Var = new a0();
        a0Var.f13239a = "20.0.3";
        a aVar2 = tVar.f12050c;
        String str11 = aVar2.f11979a;
        if (str11 == null) {
            throw new NullPointerException("Null gmpAppId");
        }
        a0Var.f13240b = str11;
        x xVar2 = tVar.f12049b;
        String str12 = xVar2.c().f11990a;
        if (str12 == null) {
            throw new NullPointerException("Null installationUuid");
        }
        a0Var.f13242d = str12;
        a0Var.f13243e = xVar2.c().f11991b;
        a0Var.f13244f = xVar2.c().f11992c;
        String str13 = aVar2.f11984f;
        if (str13 == null) {
            throw new NullPointerException("Null buildVersion");
        }
        a0Var.f13246h = str13;
        String str14 = aVar2.f11985g;
        if (str14 == null) {
            throw new NullPointerException("Null displayVersion");
        }
        a0Var.f13247i = str14;
        a0Var.f13241c = i10;
        a0Var.m = (byte) (a0Var.m | 1);
        i0 i0Var = new i0();
        i0Var.f13373f = false;
        byte b7 = (byte) (i0Var.m | 2);
        i0Var.f13371d = jCurrentTimeMillis;
        i0Var.m = (byte) (b7 | 1);
        if (str == null) {
            throw new NullPointerException("Null identifier");
        }
        i0Var.f13369b = str;
        String str15 = t.f12047g;
        if (str15 == null) {
            throw new NullPointerException("Null generator");
        }
        i0Var.f13368a = str15;
        String str16 = xVar2.f12064c;
        if (str16 == null) {
            throw new NullPointerException("Null identifier");
        }
        String str17 = xVar2.c().f11990a;
        h7.b bVar3 = aVar2.f11986h;
        if (((gd.d) bVar3.B) == null) {
            bVar3.B = new gd.d(bVar3);
        }
        gd.d dVar = (gd.d) bVar3.B;
        String str18 = dVar.f6314b;
        if (dVar == null) {
            bVar3.B = new gd.d(bVar3);
        }
        i0Var.f13374g = new k0(str16, str13, str14, str17, str18, ((gd.d) bVar3.B).f6315c);
        h1 h1Var = new h1();
        h1Var.f13353a = 3;
        h1Var.f13357e = (byte) (h1Var.f13357e | 1);
        if (str5 == null) {
            throw new NullPointerException("Null version");
        }
        h1Var.f13354b = str5;
        if (str2 == null) {
            throw new NullPointerException("Null buildVersion");
        }
        h1Var.f13355c = str2;
        h1Var.f13356d = g.g();
        h1Var.f13357e = (byte) (h1Var.f13357e | 2);
        i0Var.f13376i = h1Var.a();
        StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
        int iIntValue = 7;
        if (!TextUtils.isEmpty(str7) && (num = (Integer) t.f12046f.get(str7.toLowerCase(locale))) != null) {
            iIntValue = num.intValue();
        }
        int iAvailableProcessors2 = Runtime.getRuntime().availableProcessors();
        long jA2 = g.a(tVar.f12048a);
        long blockCount2 = ((long) statFs2.getBlockCount()) * ((long) statFs2.getBlockSize());
        boolean zF2 = g.f();
        int iC2 = g.c();
        m0 m0Var = new m0();
        m0Var.f13440a = iIntValue;
        byte b10 = (byte) (m0Var.f13449j | 1);
        m0Var.f13449j = b10;
        if (str8 == 0) {
            throw new NullPointerException("Null model");
        }
        m0Var.f13441b = str8;
        m0Var.f13442c = iAvailableProcessors2;
        m0Var.f13443d = jA2;
        m0Var.f13444e = blockCount2;
        m0Var.f13445f = zF2;
        m0Var.f13446g = iC2;
        m0Var.f13449j = (byte) (((byte) (((byte) (((byte) (((byte) (b10 | 2)) | 4)) | 8)) | 16)) | 32);
        String str19 = str3;
        if (str19 == null) {
            throw new NullPointerException("Null manufacturer");
        }
        m0Var.f13447h = str19;
        String str20 = str4;
        if (str20 == null) {
            throw new NullPointerException("Null modelClass");
        }
        m0Var.f13448i = str20;
        i0Var.f13377j = m0Var.a();
        i0Var.l = 3;
        i0Var.m = (byte) (i0Var.m | 4);
        a0Var.f13248j = i0Var.a();
        b0 b0VarA = a0Var.a();
        ui.b bVar4 = ((ui.a) bVar2.C).f15301b;
        m2 m2Var = b0VarA.f13276k;
        if (m2Var == null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not get session for report", null);
                return;
            }
            return;
        }
        String str21 = ((j0) m2Var).f13395b;
        try {
            ui.a.f15297g.getClass();
            ui.a.f(bVar4.p(str21, "report"), si.a.f14241a.C(b0VarA));
            File fileP = bVar4.p(str21, "start-time");
            long j9 = ((j0) m2Var).f13397d;
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(fileP), ui.a.f15295e);
            try {
                outputStreamWriter.write(RuntimeVersion.SUFFIX);
                fileP.setLastModified(j9 * 1000);
                outputStreamWriter.close();
            } catch (Throwable th2) {
                try {
                    outputStreamWriter.close();
                    throw th2;
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                    throw th2;
                }
            }
        } catch (IOException e3) {
            String strO2 = a1.b.o("Could not persist report for session ", str21);
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", strO2, e3);
            }
        }
    }

    public final boolean d(a30.k kVar) throws Throwable {
        pi.e.a();
        u uVar = this.f12028n;
        if (uVar != null && uVar.f12057e.get()) {
            Log.w("FirebaseCrashlytics", "Skipping session finalization because a crash has already occurred.", null);
            return false;
        }
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Finalizing previously open sessions.", null);
        }
        try {
            b(true, kVar, true);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Closed all previously open sessions.", null);
            }
            return true;
        } catch (Exception e3) {
            Log.e("FirebaseCrashlytics", "Unable to finalize previously open sessions.", e3);
            return false;
        }
    }

    public final String e() {
        NavigableSet navigableSetC = ((ui.a) this.m.C).c();
        if (navigableSetC.isEmpty()) {
            return null;
        }
        return (String) navigableSetC.first();
    }

    public final String f() throws IOException {
        InputStream resourceAsStream;
        Context context = this.f12017a;
        int iD = g.d(context, "com.google.firebase.crashlytics.version_control_info", "string");
        String string = iD == 0 ? null : context.getResources().getString(iD);
        if (string != null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Read version control info from string resource", null);
            }
            return Base64.encodeToString(string.getBytes(f12016s), 0);
        }
        ClassLoader classLoader = n.class.getClassLoader();
        if (classLoader == null) {
            Log.w("FirebaseCrashlytics", "Couldn't get Class Loader", null);
            resourceAsStream = null;
        } else {
            resourceAsStream = classLoader.getResourceAsStream("META-INF/version-control-info.textproto");
        }
        if (resourceAsStream == null) {
            if (resourceAsStream != null) {
                resourceAsStream.close();
            }
            Log.i("FirebaseCrashlytics", "No version control information found", null);
            return null;
        }
        try {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Read version control info from file", null);
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i10 = resourceAsStream.read(bArr);
                    if (i10 == -1) {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        String strEncodeToString = Base64.encodeToString(byteArray, 0);
                        resourceAsStream.close();
                        return strEncodeToString;
                    }
                    byteArrayOutputStream.write(bArr, 0, i10);
                    try {
                        resourceAsStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (Throwable th5) {
            resourceAsStream.close();
            throw th5;
        }
    }

    public final void g() {
        try {
            String strF = f();
            if (strF != null) {
                try {
                    this.f12020d.B(strF);
                } catch (IllegalArgumentException e3) {
                    Context context = this.f12017a;
                    if (context != null && (context.getApplicationInfo().flags & 2) != 0) {
                        throw e3;
                    }
                    Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
                }
                Log.i("FirebaseCrashlytics", "Saved version control info", null);
            }
        } catch (IOException e10) {
            Log.w("FirebaseCrashlytics", "Unable to save version control info", e10);
        }
    }

    public final void h(xf.n nVar) {
        xf.n nVar2;
        xf.n nVarA;
        xf.g gVar = this.f12029o;
        ui.b bVar = ((ui.a) this.m.C).f15301b;
        if (ui.b.z(((File) bVar.F).listFiles()).isEmpty() && ui.b.z(((File) bVar.G).listFiles()).isEmpty() && ui.b.z(((File) bVar.H).listFiles()).isEmpty()) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No crash reports are available to be sent.", null);
            }
            gVar.d(Boolean.FALSE);
            return;
        }
        li.c cVar = li.c.f10296a;
        cVar.e("Crash reports are available to be sent.");
        a2.o oVar = this.f12018b;
        if (oVar.c()) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Automatic data collection is enabled. Allowing upload.", null);
            }
            gVar.d(Boolean.FALSE);
            nVarA = Tasks.d(Boolean.TRUE);
        } else {
            cVar.b("Automatic data collection is disabled.");
            cVar.e("Notifying that unsent reports are available.");
            gVar.d(Boolean.TRUE);
            synchronized (oVar.E) {
                nVar2 = ((xf.g) oVar.B).f16565a;
            }
            gj.e eVar = new gj.e(25);
            nVar2.getClass();
            jb.a aVar = xf.h.f16566a;
            xf.n nVar3 = new xf.n();
            nVar2.f16569b.m(new xf.l(aVar, eVar, nVar3));
            nVar2.v();
            cVar.b("Waiting for send/deleteUnsentReports to be called.");
            nVarA = pi.a.a(nVar3, this.f12030p.f16565a);
        }
        nVarA.p(this.f12021e.f12529a, new h7.b(this, nVar, false));
    }
}

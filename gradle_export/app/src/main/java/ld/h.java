package ld;

import a40.c0;
import com.google.protobuf.RuntimeVersion;
import g00.b0;
import h00.n;
import h00.q;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import r30.r;
import ri.t1;

public final class h {
    public static final ConcurrentHashMap l = new ConcurrentHashMap();
    public static final ConcurrentHashMap m = new ConcurrentHashMap();

    public final File f10266a;

    public final String f10267b;

    public final bd.d f10268c;

    public final cd.b f10269d;

    public final h7.b f10270e;

    public final String f10271f;

    public final String f10272g;

    public final Set f10273h;

    public final ConcurrentHashMap f10274i;

    public final j40.a f10275j;

    public final j40.a f10276k;

    public h(File file, String str, bd.d dVar, cd.b bVar, h7.b bVar2) {
        Object objPutIfAbsent;
        Object objPutIfAbsent2;
        kotlin.jvm.internal.m.e(str, "storageKey");
        kotlin.jvm.internal.m.e(bVar, "logger");
        kotlin.jvm.internal.m.e(bVar2, "diagnostics");
        this.f10266a = file;
        this.f10267b = str;
        this.f10268c = dVar;
        this.f10269d = bVar;
        this.f10270e = bVar2;
        this.f10271f = "amplitude.events.file.index.".concat(str);
        this.f10272g = "amplitude.events.file.version.".concat(str);
        Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        kotlin.jvm.internal.m.d(setNewSetFromMap, "newSetFromMap(...)");
        this.f10273h = setNewSetFromMap;
        this.f10274i = new ConcurrentHashMap();
        ConcurrentHashMap concurrentHashMap = l;
        Object objA = concurrentHashMap.get(str);
        if (objA == null && (objPutIfAbsent2 = concurrentHashMap.putIfAbsent(str, (objA = j40.d.a()))) != null) {
            objA = objPutIfAbsent2;
        }
        this.f10275j = (j40.a) objA;
        ConcurrentHashMap concurrentHashMap2 = m;
        Object objA2 = concurrentHashMap2.get(str);
        if (objA2 == null && (objPutIfAbsent = concurrentHashMap2.putIfAbsent(str, (objA2 = j40.d.a()))) != null) {
            objA2 = objPutIfAbsent;
        }
        this.f10276k = (j40.a) objA2;
        e();
        c0.D(new l6.d(this, null, 1));
    }

    public static final Object a(h hVar, m00.c cVar) {
        d dVar;
        j40.a aVar;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i10 = dVar.E;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar.E = i10 - Integer.MIN_VALUE;
            } else {
                dVar = new d(hVar, cVar);
            }
        } else {
            dVar = new d(hVar, cVar);
        }
        Object obj = dVar.C;
        l00.a aVar2 = l00.a.A;
        int i11 = dVar.E;
        if (i11 == 0) {
            t1.O(obj);
            aVar = hVar.f10275j;
            kotlin.jvm.internal.m.d(aVar, "writeMutex");
            dVar.A = hVar;
            dVar.B = aVar;
            dVar.E = 1;
            if (aVar.l(dVar) == aVar2) {
                return aVar2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j40.a aVar3 = dVar.B;
            h hVar2 = dVar.A;
            t1.O(obj);
            aVar = aVar3;
            hVar = hVar2;
        }
        try {
            if (hVar.f10268c.b(hVar.f10272g, 1L) <= 1) {
                File[] fileArrListFiles = hVar.f10266a.listFiles(new b(hVar, 2));
                if (fileArrListFiles == null) {
                    fileArrListFiles = new File[0];
                }
                ArrayList<File> arrayList = new ArrayList();
                for (File file : fileArrListFiles) {
                    if (file.exists()) {
                        arrayList.add(file);
                    }
                }
                for (File file2 : arrayList) {
                    kotlin.jvm.internal.m.b(file2);
                    Charset charset = r30.a.a;
                    kotlin.jvm.internal.m.e(charset, "charset");
                    InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file2), charset);
                    try {
                        String strY = a.a.Y(inputStreamReader);
                        inputStreamReader.close();
                        if (!r.p0(strY, "\u0000", false)) {
                            String str = '[' + r30.k.k1(r30.k.l1(strY, new char[]{'[', ','}), new char[]{']', ','}) + ']';
                            try {
                                hVar.j(bi.b.Y(new JSONArray(str)), file2, false);
                                if (r00.i.Z(file2).equals("tmp")) {
                                    hVar.c(file2);
                                }
                            } catch (JSONException unused) {
                                hVar.f10269d.a("Failed to parse events: " + str + ", dropping file: " + file2.getPath());
                                String path = file2.getPath();
                                kotlin.jvm.internal.m.d(path, "getPath(...)");
                                hVar.f(path);
                            }
                        }
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            ta.c0.C(inputStreamReader, th2);
                            throw th3;
                        }
                    }
                }
                hVar.f10268c.c(2L, hVar.f10272g);
            }
            b0 b0Var = b0.a;
            aVar.i((Object) null);
            return b0Var;
        } catch (Throwable th4) {
            aVar.i((Object) null);
            throw th4;
        }
    }

    public final File b() {
        ConcurrentHashMap concurrentHashMap = this.f10274i;
        String str = this.f10267b;
        File file = (File) concurrentHashMap.get(str);
        File file2 = this.f10266a;
        if (file == null) {
            File[] fileArrListFiles = file2.listFiles(new b(this, 1));
            if (fileArrListFiles == null) {
                fileArrListFiles = new File[0];
            }
            file = (File) n.I0(0, fileArrListFiles);
        }
        long jB = this.f10268c.b(this.f10271f, 0L);
        if (file == null) {
            file = new File(file2, str + '-' + jB + ".tmp");
        }
        concurrentHashMap.put(str, file);
        Object obj = concurrentHashMap.get(str);
        kotlin.jvm.internal.m.b(obj);
        return (File) obj;
    }

    public final void c(File file) {
        g(file);
        bd.d dVar = this.f10268c;
        String str = this.f10271f;
        dVar.c(dVar.b(str, 0L) + 1, str);
        this.f10274i.remove(this.f10267b);
    }

    public final Object d(String str, m00.c cVar) {
        c cVar2;
        j40.a aVar;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i10 = cVar2.F;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar2.F = i10 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(this, cVar);
            }
        } else {
            cVar2 = new c(this, cVar);
        }
        Object obj = cVar2.D;
        l00.a aVar2 = l00.a.A;
        int i11 = cVar2.F;
        if (i11 == 0) {
            t1.O(obj);
            aVar = this.f10276k;
            kotlin.jvm.internal.m.d(aVar, "readMutex");
            cVar2.A = this;
            cVar2.B = str;
            cVar2.C = aVar;
            cVar2.F = 1;
            if (aVar.l(cVar2) == aVar2) {
                return aVar2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j40.a aVar3 = cVar2.C;
            str = cVar2.B;
            h hVar = cVar2.A;
            t1.O(obj);
            aVar = aVar3;
            this = hVar;
        }
        try {
            Set set = this.f10273h;
            boolean zContains = set.contains(str);
            String string = RuntimeVersion.SUFFIX;
            if (zContains) {
                set.remove(str);
            } else {
                set.add(str);
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(new File(str)), r30.a.a), 8192);
                try {
                    String strY = a.a.Y(bufferedReader);
                    if (r.p0(strY, "\u0000", false)) {
                        JSONArray jSONArray = new JSONArray();
                        for (String str2 : r30.k.W0(strY, new String[]{"\u0000"}, 6)) {
                            if (str2.length() > 0) {
                                try {
                                    jSONArray.put(new JSONObject(str2));
                                } catch (JSONException unused) {
                                    h7.b bVar = this.f10270e;
                                    bVar.getClass();
                                    if (((List) bVar.A) == null) {
                                        bVar.A = Collections.synchronizedList(new ArrayList());
                                    }
                                    List list = (List) bVar.A;
                                    if (list != null) {
                                        list.add(str2);
                                    }
                                    this.f10269d.a("Failed to parse event: " + str2);
                                }
                            }
                        }
                        if (jSONArray.length() > 0) {
                            string = jSONArray.toString();
                        }
                        kotlin.jvm.internal.m.b(string);
                    } else {
                        String str3 = "[" + r30.k.k1(r30.k.l1(strY, new char[]{'[', ','}), new char[]{']', ','}) + ']';
                        try {
                            String string2 = new JSONArray(str3).toString();
                            kotlin.jvm.internal.m.d(string2, "toString(...)");
                            string = string2;
                        } catch (JSONException unused2) {
                            h7.b bVar2 = this.f10270e;
                            bVar2.getClass();
                            kotlin.jvm.internal.m.e(str3, "event");
                            if (((List) bVar2.A) == null) {
                                bVar2.A = Collections.synchronizedList(new ArrayList());
                            }
                            List list2 = (List) bVar2.A;
                            if (list2 != null) {
                                list2.add(str3);
                            }
                            this.f10269d.a("Failed to parse events: " + str3 + ", dropping file: " + str);
                            this.f(str);
                            string = str3;
                        }
                    }
                    bufferedReader.close();
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        ta.c0.C(bufferedReader, th2);
                        throw th3;
                    }
                }
            }
            aVar.i((Object) null);
            return string;
        } catch (Throwable th4) {
            aVar.i((Object) null);
            throw th4;
        }
    }

    public final boolean e() {
        File file = this.f10266a;
        try {
            c7.i.y(file);
            return true;
        } catch (IOException e3) {
            this.f10270e.j("Failed to create directory: " + e3.getMessage());
            this.f10269d.a("Failed to create directory for events storage: " + file.getPath());
            return false;
        }
    }

    public final boolean f(String str) {
        kotlin.jvm.internal.m.e(str, "filePath");
        this.f10273h.remove(str);
        return new File(str).delete();
    }

    public final void g(File file) {
        if (!file.exists() || r00.i.Z(file).length() == 0) {
            return;
        }
        String strA0 = r00.i.a0(file);
        File file2 = this.f10266a;
        File file3 = new File(file2, strA0);
        if (!file3.exists()) {
            file.renameTo(new File(file2, r00.i.a0(file)));
            return;
        }
        this.f10269d.b("File already exists: " + file3 + ", handle gracefully.");
        file.renameTo(new File(file2, strA0 + '-' + System.currentTimeMillis() + '-' + new Random().nextInt(1000)));
    }

    public final Object h(m00.c cVar) {
        e eVar;
        j40.a aVar;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i10 = eVar.E;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.E = i10 - Integer.MIN_VALUE;
            } else {
                eVar = new e(this, cVar);
            }
        } else {
            eVar = new e(this, cVar);
        }
        Object obj = eVar.C;
        l00.a aVar2 = l00.a.A;
        int i11 = eVar.E;
        if (i11 == 0) {
            t1.O(obj);
            aVar = this.f10275j;
            kotlin.jvm.internal.m.d(aVar, "writeMutex");
            eVar.A = this;
            eVar.B = aVar;
            eVar.E = 1;
            if (aVar.l(eVar) == aVar2) {
                return aVar2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j40.a aVar3 = eVar.B;
            h hVar = eVar.A;
            t1.O(obj);
            aVar = aVar3;
            this = hVar;
        }
        try {
            File fileB = this.b();
            if (fileB.exists() && fileB.length() > 0) {
                this.c(fileB);
            }
            return b0.a;
        } finally {
            aVar.i((Object) null);
        }
    }

    public final Object i(String str, m00.c cVar) {
        f fVar;
        j40.a aVar;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i10 = fVar.F;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fVar.F = i10 - Integer.MIN_VALUE;
            } else {
                fVar = new f(this, cVar);
            }
        } else {
            fVar = new f(this, cVar);
        }
        Object obj = fVar.D;
        l00.a aVar2 = l00.a.A;
        int i11 = fVar.F;
        if (i11 == 0) {
            t1.O(obj);
            aVar = this.f10275j;
            kotlin.jvm.internal.m.d(aVar, "writeMutex");
            fVar.A = this;
            fVar.B = str;
            fVar.C = aVar;
            fVar.F = 1;
            if (aVar.l(fVar) == aVar2) {
                return aVar2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j40.a aVar3 = fVar.C;
            str = fVar.B;
            h hVar = fVar.A;
            t1.O(obj);
            aVar = aVar3;
            this = hVar;
        }
        try {
            boolean zE = this.e();
            cd.b bVar = this.f10269d;
            h7.b bVar2 = this.f10270e;
            if (zE) {
                File fileB = this.b();
                if (fileB.exists()) {
                    while (fileB.length() > 975000) {
                        this.c(fileB);
                        fileB = this.b();
                        if (!fileB.exists()) {
                            fileB.createNewFile();
                        }
                    }
                    byte[] bytes = (r.v0(str, "\u0000", RuntimeVersion.SUFFIX) + (char) 0).getBytes(r30.a.a);
                    kotlin.jvm.internal.m.d(bytes, "getBytes(...)");
                    this.k(bytes, fileB, true);
                } else {
                    try {
                        fileB.createNewFile();
                        while (fileB.length() > 975000) {
                            this.c(fileB);
                            fileB = this.b();
                            if (!fileB.exists()) {
                                try {
                                    fileB.createNewFile();
                                } catch (IOException e3) {
                                    bVar2.j("Failed to create new storage file: " + e3.getMessage());
                                    bVar.a("Failed to create new storage file: " + fileB.getPath());
                                    b0 b0Var = b0.a;
                                    aVar.i((Object) null);
                                    return b0Var;
                                }
                            }
                        }
                        byte[] bytes2 = (r.v0(str, "\u0000", RuntimeVersion.SUFFIX) + (char) 0).getBytes(r30.a.a);
                        kotlin.jvm.internal.m.d(bytes2, "getBytes(...)");
                        this.k(bytes2, fileB, true);
                    } catch (IOException e10) {
                        bVar2.j("Failed to create new storage file: " + e10.getMessage());
                        bVar.a("Failed to create new storage file: " + fileB.getPath());
                    }
                }
            }
            b0 b0Var2 = b0.a;
            aVar.i((Object) null);
            return b0Var2;
        } catch (Throwable th2) {
            aVar.i((Object) null);
            throw th2;
        }
    }

    public final void j(List list, File file, boolean z10) {
        cd.b bVar = this.f10269d;
        h7.b bVar2 = this.f10270e;
        try {
            String strR0 = q.R0(list, "\u0000", (String) null, "\u0000", g.A, 26);
            file.createNewFile();
            byte[] bytes = strR0.getBytes(r30.a.a);
            kotlin.jvm.internal.m.d(bytes, "getBytes(...)");
            k(bytes, file, z10);
            g(file);
        } catch (IOException e3) {
            bVar2.j("Failed to create or write to split file: " + e3.getMessage());
            bVar.a("Failed to create or write to split file: " + file.getPath());
        } catch (Exception e10) {
            bVar2.j("Failed to write to split file: " + e10.getMessage());
            bVar.a("Failed to write to split file: " + file.getPath() + " for error: " + e10.getMessage());
        }
    }

    public final void k(byte[] bArr, File file, boolean z10) {
        cd.b bVar = this.f10269d;
        h7.b bVar2 = this.f10270e;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file, z10);
            try {
                fileOutputStream.write(bArr);
                fileOutputStream.flush();
                fileOutputStream.close();
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    ta.c0.C(fileOutputStream, th2);
                    throw th3;
                }
            }
        } catch (FileNotFoundException e3) {
            bVar2.j("Error writing to file: " + e3.getMessage());
            bVar.a("File not found: " + file.getPath());
        } catch (IOException e10) {
            bVar2.j("Error writing to file: " + e10.getMessage());
            bVar.a("Failed to write to file: " + file.getPath());
        } catch (SecurityException e11) {
            bVar2.j("Error writing to file: " + e11.getMessage());
            bVar.a("Security exception when saving event: " + e11.getMessage());
        } catch (Exception e12) {
            bVar2.j("Error writing to file: " + e12.getMessage());
            bVar.a("Failed to write to file: " + file.getPath());
        }
    }
}

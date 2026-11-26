package h7;

import a10.h0;
import a2.o;
import a8.n0;
import a8.s;
import android.content.Context;
import android.content.res.XmlResourceParser;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.session.MediaController;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import androidx.datastore.preferences.protobuf.z0;
import androidx.media3.common.t;
import androidx.media3.common.x0;
import ba.n1;
import com.google.android.gms.cast.Cast;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.common.api.k;
import com.google.android.gms.internal.play_billing.q1;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.protobuf.RuntimeVersion;
import e7.u;
import g1.c3;
import h00.q;
import h00.x;
import h00.y;
import h9.b0;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.m;
import l1.r0;
import l1.t0;
import l60.n;
import l60.w0;
import l9.e0;
import l9.j0;
import l9.v;
import l9.w;
import md.j;
import o20.l;
import o20.l0;
import org.json.JSONException;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParserException;
import s7.r;
import ta.c0;
import u.d0;
import u.f0;
import u.i0;
import u.u0;
import z2.x1;

public final class b implements b0, x1, l60.f, x40.f, o3.b, xf.f {
    public Object A;
    public Object B;

    public b(int i10) {
        switch (i10) {
            case k.REMOTE_EXCEPTION:
                this.A = new HashSet();
                break;
            case RuntimeVersion.MINOR:
                this.A = new AtomicInteger();
                this.B = new AtomicInteger();
                break;
            default:
                this.A = new i0();
                this.B = new i0();
                break;
        }
    }

    public b(Context context, int i10) {
        switch (i10) {
            case 17:
                this.A = context;
                this.B = null;
                break;
            default:
                this.A = context == null ? null : context.getApplicationContext();
                break;
        }
    }

    public b(Context context, e0 e0Var) {
        this.B = Collections.synchronizedSet(new HashSet());
        this.A = new v(context, e0Var);
    }

    public b(IBinder iBinder) throws RemoteException {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.A = new Messenger(iBinder);
            this.B = null;
        } else {
            if (!Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
                Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
                throw new RemoteException();
            }
            this.B = new oe.g(iBinder);
            this.A = null;
        }
    }

    public b(Object obj, Object obj2) {
        this.A = obj;
        this.B = obj2;
    }

    public b(Object obj, Object obj2, boolean z10) {
        this.B = obj;
        this.A = obj2;
    }

    public b(l lVar) {
        Iterator it = ((z0) lVar.A.a.entrySet()).iterator();
        this.A = it;
        if (it.hasNext()) {
            this.B = (Map.Entry) it.next();
        }
    }

    public static b i(Context context) {
        FileChannel channel;
        FileLock fileLockLock;
        try {
            channel = new RandomAccessFile(new File(context.getFilesDir(), "generatefid.lock"), "rw").getChannel();
            try {
                fileLockLock = channel.lock();
                try {
                    return new b(channel, fileLockLock);
                } catch (IOException | Error | OverlappingFileLockException e3) {
                    e = e3;
                    Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
                    if (fileLockLock != null) {
                        try {
                            fileLockLock.release();
                        } catch (IOException unused) {
                        }
                    }
                    if (channel != null) {
                        try {
                            channel.close();
                        } catch (IOException unused2) {
                        }
                    }
                    return null;
                }
            } catch (IOException | Error | OverlappingFileLockException e10) {
                e = e10;
                fileLockLock = null;
            }
        } catch (IOException | Error | OverlappingFileLockException e11) {
            e = e11;
            channel = null;
            fileLockLock = null;
        }
    }

    public static b t(String... strArr) {
        String str;
        try {
            k50.l[] lVarArr = new k50.l[strArr.length];
            k50.i iVar = new k50.i();
            for (int i10 = 0; i10 < strArr.length; i10++) {
                String str2 = strArr[i10];
                String[] strArr2 = nc.c.E;
                iVar.q0(34);
                int length = str2.length();
                int i11 = 0;
                for (int i12 = 0; i12 < length; i12++) {
                    char cCharAt = str2.charAt(i12);
                    if (cCharAt < 128) {
                        str = strArr2[cCharAt];
                        if (str != null) {
                            if (i11 < i12) {
                                iVar.v0(i11, str2, i12);
                            }
                            iVar.w0(str);
                            i11 = i12 + 1;
                        }
                    } else {
                        if (cCharAt == 8232) {
                            str = "\\u2028";
                        } else if (cCharAt == 8233) {
                            str = "\\u2029";
                        }
                        if (i11 < i12) {
                            iVar.v0(i11, str2, i12);
                        }
                        iVar.w0(str);
                        i11 = i12 + 1;
                    }
                }
                if (i11 < length) {
                    iVar.v0(i11, str2, length);
                }
                iVar.q0(34);
                iVar.readByte();
                lVarArr[i10] = iVar.m(iVar.B);
            }
            return new b((String[]) strArr.clone(), c7.i.P(lVarArr));
        } catch (IOException e3) {
            throw new AssertionError(e3);
        }
    }

    public f5.c A(String str, String str2) throws JSONException {
        md.e eVar;
        InputStream inputStreamP;
        m.e(str, "events");
        rc.g gVar = (rc.g) this.A;
        String str3 = gVar.f13180i == fd.b.B ? "https://api.eu.amplitude.com/2/httpapi" : "https://api2.amplitude.com/2/httpapi";
        String str4 = gVar.f13172a;
        long jCurrentTimeMillis = System.currentTimeMillis();
        m.e(str4, "apiKey");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sbN = g4.c.n("{\"api_key\":\"", str4, "\",\"client_upload_time\":\"");
        String str5 = simpleDateFormat.format(new Date(jCurrentTimeMillis));
        m.d(str5, "format(...)");
        sbN.append(str5);
        sbN.append("\",\"events\":");
        sbN.append(str);
        sb2.append(sbN.toString());
        if (str2 != null) {
            sb2.append(",\"request_metadata\":{\"sdk\":" + str2 + '}');
        }
        sb2.append("}");
        String string = sb2.toString();
        m.d(string, "toString(...)");
        md.c cVar = md.c.A;
        md.d dVar = new md.d(str3, string);
        y yVar = y.A;
        cd.b bVar = (cd.b) this.B;
        try {
            ?? url = new URL(str3);
            try {
                try {
                    URLConnection uRLConnectionOpenConnection = url.openConnection();
                    m.c(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                    url = (HttpURLConnection) uRLConnectionOpenConnection;
                    try {
                        url.setRequestMethod("POST");
                        url.setConnectTimeout(15000);
                        url.setReadTimeout(20000);
                        url.setDoInput(true);
                        for (Map.Entry entry : md.d.f10869d.entrySet()) {
                            url.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                        }
                        for (Map.Entry entry2 : dVar.f10871b.entrySet()) {
                            url.setRequestProperty((String) entry2.getKey(), (String) entry2.getValue());
                        }
                        try {
                            String str6 = dVar.f10872c;
                            url.setDoOutput(true);
                            Charset charset = r30.a.a;
                            byte[] bytes = str6.getBytes(charset);
                            m.d(bytes, "getBytes(...)");
                            url.getOutputStream().write(bytes, 0, bytes.length);
                            url.getOutputStream().close();
                            int responseCode = url.getResponseCode();
                            String responseMessage = url.getResponseMessage();
                            try {
                                inputStreamP = p(url);
                                try {
                                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamP, charset), 8192);
                                    try {
                                        String strY = a.a.Y(bufferedReader);
                                        bufferedReader.close();
                                        inputStreamP.close();
                                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                                        Map<String, List<String>> headerFields = url.getHeaderFields();
                                        m.d(headerFields, "getHeaderFields(...)");
                                        for (Map.Entry<String, List<String>> entry3 : headerFields.entrySet()) {
                                            String key = entry3.getKey();
                                            x xVar = (List) entry3.getValue();
                                            if (key != null) {
                                                if (xVar == null) {
                                                    xVar = x.A;
                                                }
                                                linkedHashMap.put(key, xVar);
                                            }
                                        }
                                        eVar = new md.e(responseCode, strY, linkedHashMap, responseMessage);
                                    } catch (Throwable th2) {
                                        try {
                                            throw th2;
                                        } catch (Throwable th3) {
                                            c0.C(bufferedReader, th2);
                                            throw th3;
                                        }
                                    }
                                } catch (IOException e3) {
                                    e = e3;
                                    bVar.a("Failed to read response from server: " + e.getMessage());
                                    eVar = new md.e(408, null, yVar, "Request timeout");
                                    if (inputStreamP != null) {
                                        inputStreamP.close();
                                    }
                                }
                            } catch (IOException e10) {
                                e = e10;
                                inputStreamP = null;
                            } catch (Throwable th4) {
                                th = th4;
                                this = 0;
                                if (this != 0) {
                                    this.close();
                                }
                                throw th;
                            }
                            url.disconnect();
                            md.f fVar = md.f.SUCCESS;
                            z00.e eVar2 = fVar.A;
                            int i10 = ((z00.c) eVar2).A;
                            int i11 = ((z00.c) eVar2).B;
                            int i12 = 7;
                            int i13 = eVar.f10873a;
                            if (i13 <= i11 && i10 <= i13) {
                                return new md.h(fVar, i12);
                            }
                            z00.e eVar3 = md.f.BAD_REQUEST.A;
                            int i14 = ((z00.c) eVar3).A;
                            int i15 = ((z00.c) eVar3).B;
                            String str7 = eVar.f10874b;
                            if (i13 <= i15 && i14 <= i13) {
                                return new md.a(new JSONObject(str7));
                            }
                            z00.e eVar4 = md.f.PAYLOAD_TOO_LARGE.A;
                            int i16 = ((z00.c) eVar4).A;
                            if (i13 <= ((z00.c) eVar4).B && i16 <= i13) {
                                return new md.g(new JSONObject(str7));
                            }
                            z00.e eVar5 = md.f.TOO_MANY_REQUESTS.A;
                            int i17 = ((z00.c) eVar5).A;
                            if (i13 <= ((z00.c) eVar5).B && i17 <= i13) {
                                return new j(new JSONObject(str7));
                            }
                            md.f fVar2 = md.f.TIMEOUT;
                            z00.e eVar6 = fVar2.A;
                            int i18 = ((z00.c) eVar6).A;
                            if (i13 <= ((z00.c) eVar6).B && i18 <= i13) {
                                return new md.i(fVar2, i12);
                            }
                            JSONObject jSONObject = new JSONObject();
                            if (str7 != null && str7.length() != 0) {
                                try {
                                    jSONObject = new JSONObject(str7);
                                } catch (Exception unused) {
                                    jSONObject.put("error", str7);
                                }
                            }
                            return new md.b(jSONObject);
                        } catch (Throwable th5) {
                            th = th5;
                        }
                    } catch (Exception e11) {
                        bVar.a("Request failed: " + e11.getClass().getName() + ": " + e11.getMessage());
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Request failed: ");
                        sb3.append(e11.getMessage());
                        eVar = new md.e(MediaError.DetailedErrorCode.SEGMENT_UNKNOWN, null, yVar, sb3.toString());
                    }
                } catch (IOException e12) {
                    bVar.a("Failed to open connection: " + e12.getMessage());
                    eVar = new md.e(MediaError.DetailedErrorCode.SEGMENT_UNKNOWN, null, yVar, "Connection failed");
                }
            } catch (Throwable th6) {
                url.disconnect();
                throw th6;
            }
        } catch (MalformedURLException e13) {
            StringBuilder sbN2 = g4.c.n("Attempted to use malformed url: ", str3, ", error: ");
            sbN2.append(e13.getMessage());
            bVar.a(sbN2.toString());
            eVar = new md.e(MediaError.DetailedErrorCode.MANIFEST_UNKNOWN, null, yVar, "Malformed URL");
        }
    }

    public void B(t0 t0Var) {
        i0 i0Var = (i0) this.A;
        Object objG = ((i0) this.B).g(t0Var);
        if (objG != null) {
            if (!(objG instanceof d0)) {
                m1.a.c(i0Var, (r0) objG, new h00.a(t0Var, 15));
                return;
            }
            d0 d0Var = (d0) objG;
            Object[] objArr = d0Var.f14837a;
            int i10 = d0Var.f14838b;
            for (int i11 = 0; i11 < i10; i11++) {
                Object obj = objArr[i11];
                m.c(obj, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
                m1.a.c(i0Var, (r0) obj, new h00.a(t0Var, 15));
            }
        }
    }

    public void C(int i10, q1 q1Var) {
        Iterator it = (Iterator) this.A;
        while (true) {
            Map.Entry entry = (Map.Entry) this.B;
            if (entry == null || ((o20.m) entry.getKey()).A >= i10) {
                return;
            }
            o20.m mVar = (o20.m) ((Map.Entry) this.B).getKey();
            Object value = ((Map.Entry) this.B).getValue();
            o20.i iVar = o20.i.c;
            o20.i0 i0Var = mVar.B;
            int i11 = mVar.A;
            if (mVar.C) {
                for (Object obj : (List) value) {
                    if (i0Var == l0.E) {
                        q1Var.p0(i11, 3);
                        ((o20.b) obj).d(q1Var);
                        q1Var.p0(i11, 4);
                    } else {
                        q1Var.p0(i11, ((l0) i0Var).B);
                        o20.i.k(q1Var, i0Var, obj);
                    }
                }
            } else if (i0Var == l0.E) {
                q1Var.p0(i11, 3);
                ((o20.b) value).d(q1Var);
                q1Var.p0(i11, 4);
            } else {
                q1Var.p0(i11, ((l0) i0Var).B);
                o20.i.k(q1Var, i0Var, value);
            }
            if (it.hasNext()) {
                this.B = (Map.Entry) it.next();
            } else {
                this.B = null;
            }
        }
    }

    @Override
    public int N(int i10) {
        CharSequence charSequence = (CharSequence) this.A;
        do {
            i10 = ((q1) this.B).K(i10);
            if (i10 == -1 || i10 == charSequence.length()) {
                return -1;
            }
        } while (Character.isWhitespace(charSequence.charAt(i10)));
        return i10;
    }

    @Override
    public int P(int i10) {
        do {
            i10 = ((q1) this.B).X(i10);
            if (i10 == -1 || i10 == 0) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.A).charAt(i10 - 1)));
        return i10;
    }

    public Object a(l60.y yVar) {
        Executor executor = (Executor) this.B;
        return executor == null ? yVar : new n(executor, yVar);
    }

    @Override
    public void b(u uVar) {
        h9.e0 e0Var = (h9.e0) this.B;
        SparseArray sparseArray = e0Var.f6718g;
        n0 n0Var = (n0) this.A;
        if (uVar.A() == 0 && (uVar.A() & Cast.MAX_NAMESPACE_LENGTH) != 0) {
            uVar.O(6);
            int iA = uVar.a() / 4;
            for (int i10 = 0; i10 < iA; i10++) {
                uVar.k(0, 4, n0Var.f300b);
                n0Var.q(0);
                int i11 = n0Var.i(16);
                n0Var.t(3);
                if (i11 == 0) {
                    n0Var.t(13);
                } else {
                    int i12 = n0Var.i(13);
                    if (sparseArray.get(i12) == null) {
                        sparseArray.put(i12, new h9.c0(new a20.g(e0Var, i12)));
                        e0Var.m++;
                    }
                }
            }
            sparseArray.remove(0);
        }
    }

    @Override
    public void c(e7.e0 e0Var, s sVar, c3 c3Var) {
    }

    @Override
    public int c0(int i10) {
        do {
            i10 = ((q1) this.B).X(i10);
            if (i10 == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.A).charAt(i10)));
        return i10;
    }

    public Type d() {
        return (Type) this.A;
    }

    @Override
    public boolean e(Object obj, Object obj2) {
        l0.i0 i0Var = (l0.i0) this.A;
        return m.a(i0Var.b(obj), i0Var.b(obj2));
    }

    public void f(x40.b0 b0Var) {
        l60.g gVar = (l60.g) this.A;
        l60.y yVar = (l60.y) this.B;
        try {
            try {
                gVar.l(yVar, yVar.c(b0Var));
            } catch (Throwable th2) {
                w0.r(th2);
                th2.printStackTrace();
            }
        } catch (Throwable th3) {
            w0.r(th3);
            try {
                gVar.w0(yVar, th3);
            } catch (Throwable th4) {
                w0.r(th4);
                th4.printStackTrace();
            }
        }
    }

    @Override
    public int f0(int i10) {
        do {
            i10 = ((q1) this.B).K(i10);
            if (i10 == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.A).charAt(i10 - 1)));
        return i10;
    }

    @Override
    public void g(u0 u0Var) {
        u.c0 c0Var = (u.c0) this.B;
        c0Var.a();
        f0 f0Var = (f0) u0Var.B;
        Object[] objArr = f0Var.f14847b;
        long[] jArr = f0Var.f14848c;
        int i10 = f0Var.f14850e;
        while (i10 != Integer.MAX_VALUE) {
            int i11 = (int) ((jArr[i10] >> 31) & 2147483647L);
            Object obj = objArr[i10];
            Object objB = ((l0.i0) this.A).b(obj);
            int iD = c0Var.d(objB);
            int i12 = iD >= 0 ? c0Var.f14833c[iD] : 0;
            if (i12 == 7) {
                u0Var.remove(obj);
            } else {
                c0Var.g(i12 + 1, objB);
            }
            i10 = i11;
        }
    }

    public void h(b50.j jVar, IOException iOException) {
        try {
            ((l60.g) this.A).w0((l60.y) this.B, iOException);
        } catch (Throwable th2) {
            w0.r(th2);
            th2.printStackTrace();
        }
    }

    public void j(String str) {
        m.e(str, "log");
        Set set = (Set) this.B;
        set.add(str);
        while (set.size() > 10) {
            set.remove(q.K0(set));
        }
    }

    @Override
    public Task k(Object obj) {
        Boolean bool = (Boolean) obj;
        oi.n nVar = (oi.n) this.B;
        if (bool.booleanValue()) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Sending cached crash reports...", null);
            }
            boolean zBooleanValue = bool.booleanValue();
            o oVar = nVar.f12018b;
            if (zBooleanValue) {
                ((xf.g) oVar.F).d(null);
                return ((Task) this.A).p(nVar.f12021e.f12529a, new o10.b(this, 4));
            }
            oVar.getClass();
            throw new IllegalStateException("An invalid data collection token was used.");
        }
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Deleting cached crash reports...", null);
        }
        ui.b bVar = nVar.f12023g;
        Iterator it = ui.b.z(((File) bVar.D).listFiles(oi.n.f12015r)).iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
        ui.b bVar2 = ((ui.a) nVar.m.C).f15301b;
        ui.a.a(ui.b.z(((File) bVar2.F).listFiles()));
        ui.a.a(ui.b.z(((File) bVar2.G).listFiles()));
        ui.a.a(ui.b.z(((File) bVar2.H).listFiles()));
        nVar.f12031q.d(null);
        return Tasks.d(null);
    }

    public void l(l9.x xVar, int i10) {
        v vVar = (v) this.A;
        if ((vVar.f10183a.getFlags() & 4) == 0) {
            throw new UnsupportedOperationException("This session doesn't support queue management operations");
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION", a.a.p(xVar, MediaDescriptionCompat.CREATOR));
        bundle.putInt("android.support.v4.media.session.command.ARGUMENT_INDEX", i10);
        vVar.f10183a.sendCommand("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT", bundle, null);
    }

    public void m() {
        this.A = null;
        this.B = null;
    }

    public String n() {
        Set set = (Set) this.B;
        List list = (List) this.A;
        if ((list == null || list.isEmpty()) && set.isEmpty()) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List list2 = (List) this.A;
        if (list2 != null) {
            m.b(list2);
            if (!list2.isEmpty()) {
                List list3 = (List) this.A;
                m.b(list3);
                linkedHashMap.put("malformed_events", list3);
            }
        }
        if (!set.isEmpty()) {
            linkedHashMap.put("error_logs", q.n1(set));
        }
        String strValueOf = String.valueOf(h0.S(linkedHashMap));
        List list4 = (List) this.A;
        if (list4 != null) {
            list4.clear();
        }
        set.clear();
        return strValueOf;
    }

    public k7.g o(t tVar, androidx.media3.common.d dVar) {
        boolean zBooleanValue;
        tVar.getClass();
        dVar.getClass();
        int i10 = Build.VERSION.SDK_INT;
        int i11 = tVar.G;
        if (i11 == -1) {
            return k7.g.f9055d;
        }
        Context context = (Context) this.A;
        Boolean bool = (Boolean) this.B;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            if (context != null) {
                String parameters = c7.i.C(context).getParameters("offloadVariableRateSupported");
                this.B = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
            } else {
                this.B = Boolean.FALSE;
            }
            zBooleanValue = ((Boolean) this.B).booleanValue();
        }
        String str = tVar.f1594n;
        str.getClass();
        int iC = x0.c(str, tVar.f1593k);
        if (iC == 0 || i10 < e7.i0.m(iC)) {
            return k7.g.f9055d;
        }
        int iN = e7.i0.n(tVar.F);
        if (iN == 0) {
            return k7.g.f9055d;
        }
        try {
            int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(new AudioFormat.Builder().setSampleRate(i11).setChannelMask(iN).setEncoding(iC).build(), dVar.b());
            if (playbackOffloadSupport == 0) {
                return k7.g.f9055d;
            }
            k7.f fVar = new k7.f();
            boolean z10 = playbackOffloadSupport == 2;
            fVar.f9047a = true;
            fVar.f9048b = z10;
            fVar.f9049c = zBooleanValue;
            return fVar.a();
        } catch (IllegalArgumentException unused) {
            return k7.g.f9055d;
        }
    }

    public InputStream p(HttpURLConnection httpURLConnection) {
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            m.b(inputStream);
            return inputStream;
        } catch (IOException e3) {
            ((cd.b) this.B).c("Failed to get input stream, falling back to error stream: " + e3.getMessage());
            InputStream errorStream = httpURLConnection.getErrorStream();
            m.b(errorStream);
            return errorStream;
        }
    }

    public n1 q() {
        MediaController.PlaybackInfo playbackInfo = ((v) this.A).f10183a.getPlaybackInfo();
        if (playbackInfo == null) {
            return null;
        }
        int playbackType = playbackInfo.getPlaybackType();
        AudioAttributes audioAttributes = playbackInfo.getAudioAttributes();
        androidx.media3.common.d dVar = androidx.media3.common.d.f1142i;
        return new n1(playbackType, new androidx.media3.common.d(audioAttributes.getContentType(), audioAttributes.getFlags(), audioAttributes.getUsage(), audioAttributes.getAllowedCapturePolicy(), audioAttributes.getSpatializationBehavior(), audioAttributes.isContentSpatialized(), audioAttributes.areHapticChannelsMuted()), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume(), playbackInfo.getVolumeControlId());
    }

    public j0 r() {
        v vVar = (v) this.A;
        l9.d dVarA = vVar.f10187e.a();
        if (dVarA != null) {
            try {
                return dVarA.getPlaybackState();
            } catch (RemoteException | SecurityException e3) {
                e7.a.e("MediaControllerCompat", "Dead object in getPlaybackState.", e3);
            }
        }
        PlaybackState playbackState = vVar.f10183a.getPlaybackState();
        if (playbackState != null) {
            return j0.a(playbackState);
        }
        return null;
    }

    public w s() {
        return new w(((v) this.A).f10183a.getTransportControls(), 6);
    }

    public void u(int i10, Bundle bundle) {
        Locale locale = Locale.US;
        String str = "Analytics listener received message. ID: " + i10 + ", Extras: " + bundle;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str, null);
        }
        String string = bundle.getString("name");
        if (string != null) {
            Bundle bundle2 = bundle.getBundle("params");
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            mi.b bVar = "clx".equals(bundle2.getString("_o")) ? (k9.x0) this.A : (gi.c) this.B;
            if (bVar == null) {
                return;
            }
            bVar.i(string, bundle2);
        }
    }

    public void v(Exception exc, boolean z10) {
        this.B = null;
        HashSet hashSet = (HashSet) this.A;
        fh.t0 t0VarO = fh.t0.o(hashSet);
        hashSet.clear();
        fh.r0 r0VarQ = t0VarO.listIterator(0);
        while (r0VarQ.hasNext()) {
            n7.b bVar = (n7.b) r0VarQ.next();
            bVar.getClass();
            bVar.j(exc, z10 ? 1 : 3);
        }
    }

    public void w(Context context, XmlResourceParser xmlResourceParser) {
        j4.n nVar = new j4.n();
        int attributeCount = xmlResourceParser.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            String attributeName = xmlResourceParser.getAttributeName(i10);
            String attributeValue = xmlResourceParser.getAttributeValue(i10);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                try {
                    int eventType = xmlResourceParser.getEventType();
                    j4.i iVarD = null;
                    while (eventType != 1) {
                        if (eventType == 0) {
                            xmlResourceParser.getName();
                        } else if (eventType == 2) {
                            String name = xmlResourceParser.getName();
                            switch (name.hashCode()) {
                                case -2025855158:
                                    if (name.equals("Layout")) {
                                        if (iVarD == null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        iVarD.f8082d.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    } else {
                                        continue;
                                    }
                                    break;
                                case -1984451626:
                                    if (name.equals("Motion")) {
                                        if (iVarD == null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        iVarD.f8081c.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    } else {
                                        continue;
                                    }
                                    break;
                                case -1962203927:
                                    if (name.equals("ConstraintOverride")) {
                                        iVarD = j4.n.d(context, Xml.asAttributeSet(xmlResourceParser), true);
                                    }
                                    break;
                                case -1269513683:
                                    if (name.equals("PropertySet")) {
                                        if (iVarD == null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        iVarD.f8080b.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    } else {
                                        continue;
                                    }
                                    break;
                                case -1238332596:
                                    if (name.equals("Transform")) {
                                        if (iVarD == null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        iVarD.f8083e.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    } else {
                                        continue;
                                    }
                                    break;
                                case -71750448:
                                    if (name.equals("Guideline")) {
                                        iVarD = j4.n.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                        iVarD.f8082d.f8086a = true;
                                    }
                                    break;
                                case 366511058:
                                    if (name.equals("CustomMethod")) {
                                        if (iVarD != null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        j4.b.a(context, xmlResourceParser, iVarD.f8084f);
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 1331510167:
                                    if (name.equals("Barrier")) {
                                        iVarD = j4.n.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                        iVarD.f8082d.f8099g0 = 1;
                                    }
                                    break;
                                case 1791837707:
                                    if (name.equals("CustomAttribute")) {
                                        if (iVarD != null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        j4.b.a(context, xmlResourceParser, iVarD.f8084f);
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 1803088381:
                                    if (name.equals("Constraint")) {
                                        iVarD = j4.n.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    }
                                    break;
                            }
                        } else if (eventType == 3) {
                            String lowerCase = xmlResourceParser.getName().toLowerCase(Locale.ROOT);
                            switch (lowerCase.hashCode()) {
                                case -2075718416:
                                    if (lowerCase.equals("guideline")) {
                                        nVar.f8155c.put(Integer.valueOf(iVarD.f8079a), iVarD);
                                        iVarD = null;
                                    }
                                    break;
                                case -190376483:
                                    if (lowerCase.equals("constraint")) {
                                        nVar.f8155c.put(Integer.valueOf(iVarD.f8079a), iVarD);
                                        iVarD = null;
                                    }
                                    break;
                                case 426575017:
                                    if (lowerCase.equals("constraintoverride")) {
                                        nVar.f8155c.put(Integer.valueOf(iVarD.f8079a), iVarD);
                                        iVarD = null;
                                    }
                                    break;
                                case 2146106725:
                                    if (lowerCase.equals("constraintset")) {
                                        ((SparseArray) this.B).put(identifier, nVar);
                                        return;
                                    }
                                    break;
                                    break;
                                default:
                                    break;
                            }
                        }
                        eventType = xmlResourceParser.next();
                    }
                } catch (IOException e3) {
                    e3.printStackTrace();
                } catch (XmlPullParserException e10) {
                    e10.printStackTrace();
                }
                ((SparseArray) this.B).put(identifier, nVar);
                return;
            }
        }
    }

    public void x(n7.b bVar) {
        ((HashSet) this.A).add(bVar);
        if (((n7.b) this.B) != null) {
            return;
        }
        this.B = bVar;
        n7.o oVarG = bVar.f11122b.g();
        bVar.f11144z = oVarG;
        android.support.v4.media.session.f fVar = bVar.f11137s;
        String str = e7.i0.f5136a;
        oVarG.getClass();
        fVar.getClass();
        fVar.obtainMessage(1, new n7.a(r.f13729f.getAndIncrement(), true, SystemClock.elapsedRealtime(), oVarG)).sendToTarget();
    }

    public void y() {
        try {
            ((FileLock) this.B).release();
            ((FileChannel) this.A).close();
        } catch (IOException e3) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e3);
        }
    }

    public void z(l9.x xVar) {
        v vVar = (v) this.A;
        if ((vVar.f10183a.getFlags() & 4) == 0) {
            throw new UnsupportedOperationException("This session doesn't support queue management operations");
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION", a.a.p(xVar, MediaDescriptionCompat.CREATOR));
        vVar.f10183a.sendCommand("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM", bundle, null);
    }
}

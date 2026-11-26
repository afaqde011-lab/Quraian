package qi;

import android.util.Log;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class h {

    public static final Charset f13024b = Charset.forName("UTF-8");

    public final ui.b f13025a;

    public h(ui.b bVar) {
        this.f13025a = bVar;
    }

    public static HashMap a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString = null;
            if (!jSONObject.isNull(next)) {
                strOptString = jSONObject.optString(next, null);
            }
            map.put(next, strOptString);
        }
        return map;
    }

    public static ArrayList b(String str) throws JSONException {
        JSONArray jSONArray = new JSONObject(str).getJSONArray("rolloutsState");
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            String string = jSONArray.getString(i10);
            try {
                me.i iVar = n.f13029a;
                JSONObject jSONObject = new JSONObject(string);
                String string2 = jSONObject.getString("rolloutId");
                String string3 = jSONObject.getString("parameterKey");
                String string4 = jSONObject.getString("parameterValue");
                String string5 = jSONObject.getString("variantId");
                long j9 = jSONObject.getLong("templateVersion");
                if (string4.length() > 256) {
                    string4 = string4.substring(0, 256);
                }
                arrayList.add(new b(string2, string3, string4, string5, j9));
            } catch (Exception e3) {
                Log.w("FirebaseCrashlytics", "Failed de-serializing rollouts state. " + string, e3);
            }
        }
        return arrayList;
    }

    public static String e(List list) {
        HashMap map = new HashMap();
        JSONArray jSONArray = new JSONArray();
        for (int i10 = 0; i10 < list.size(); i10++) {
            try {
                jSONArray.put(new JSONObject(n.f13029a.C(list.get(i10))));
            } catch (JSONException e3) {
                Log.w("FirebaseCrashlytics", "Exception parsing rollout assignment!", e3);
            }
        }
        map.put("rolloutsState", jSONArray);
        return new JSONObject(map).toString();
    }

    public static void f(File file) {
        if (file.exists() && file.delete()) {
            Log.i("FirebaseCrashlytics", "Deleted corrupt file: " + file.getAbsolutePath(), null);
        }
    }

    public static void g(File file, String str) {
        if (file.exists() && file.delete()) {
            Log.i("FirebaseCrashlytics", "Deleted corrupt file: " + file.getAbsolutePath() + "\nReason: " + str, null);
        }
    }

    public final Map c(String str, boolean z10) throws Throwable {
        ?? r10;
        FileInputStream fileInputStream;
        Exception e3;
        ui.b bVar = this.f13025a;
        File fileP = z10 ? bVar.p(str, "internal-keys") : bVar.p(str, "keys");
        if (!fileP.exists() || fileP.length() == 0) {
            g(fileP, "The file has a length of zero for session: " + str);
            return Collections.EMPTY_MAP;
        }
        ?? r7 = 0;
        try {
            try {
                fileInputStream = new FileInputStream(fileP);
                try {
                    HashMap mapA = a(oi.g.i(fileInputStream));
                    oi.g.b(fileInputStream, "Failed to close user metadata file.");
                    return mapA;
                } catch (Exception e10) {
                    e3 = e10;
                    Log.w("FirebaseCrashlytics", "Error deserializing user metadata.", e3);
                    f(fileP);
                    oi.g.b(fileInputStream, "Failed to close user metadata file.");
                    return Collections.EMPTY_MAP;
                }
            } catch (Throwable th2) {
                th = th2;
                r7 = r10;
                oi.g.b(r7, "Failed to close user metadata file.");
                throw th;
            }
        } catch (Exception e11) {
            fileInputStream = null;
            e3 = e11;
        } catch (Throwable th3) {
            th = th3;
            oi.g.b(r7, "Failed to close user metadata file.");
            throw th;
        }
    }

    public final String d(String str) {
        FileInputStream fileInputStream;
        File fileP = this.f13025a.p(str, "user-data");
        ?? r7 = 0;
        if (fileP.exists()) {
            ?? r4 = (fileP.length() > 0L ? 1 : (fileP.length() == 0L ? 0 : -1));
            try {
                if (r4 != 0) {
                    try {
                        fileInputStream = new FileInputStream(fileP);
                        try {
                            JSONObject jSONObject = new JSONObject(oi.g.i(fileInputStream));
                            String strOptString = !jSONObject.isNull("userId") ? jSONObject.optString("userId", null) : null;
                            String str2 = "Loaded userId " + strOptString + " for session " + str;
                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                Log.d("FirebaseCrashlytics", str2, null);
                            }
                            oi.g.b(fileInputStream, "Failed to close user metadata file.");
                            return strOptString;
                        } catch (Exception e3) {
                            e = e3;
                            Log.w("FirebaseCrashlytics", "Error deserializing user metadata.", e);
                            f(fileP);
                            oi.g.b(fileInputStream, "Failed to close user metadata file.");
                            return null;
                        }
                    } catch (Exception e10) {
                        e = e10;
                        fileInputStream = null;
                    } catch (Throwable th2) {
                        th = th2;
                        oi.g.b(r7, "Failed to close user metadata file.");
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                r7 = r4;
            }
        }
        String strO = a1.b.o("No userId set for session ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", strO, null);
        }
        f(fileP);
        return null;
    }

    public final void h(String str, Map map, boolean z10) {
        BufferedWriter bufferedWriter;
        Exception e3;
        ui.b bVar = this.f13025a;
        File fileP = z10 ? bVar.p(str, "internal-keys") : bVar.p(str, "keys");
        BufferedWriter bufferedWriter2 = null;
        try {
            String string = new JSONObject(map).toString();
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileP), f13024b));
            try {
                try {
                    bufferedWriter.write(string);
                    bufferedWriter.flush();
                    oi.g.b(bufferedWriter, "Failed to close key/value metadata file.");
                } catch (Exception e10) {
                    e3 = e10;
                    Log.w("FirebaseCrashlytics", "Error serializing key/value metadata.", e3);
                    f(fileP);
                    oi.g.b(bufferedWriter, "Failed to close key/value metadata file.");
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedWriter2 = bufferedWriter;
                oi.g.b(bufferedWriter2, "Failed to close key/value metadata file.");
                throw th;
            }
        } catch (Exception e11) {
            bufferedWriter = null;
            e3 = e11;
        } catch (Throwable th3) {
            th = th3;
            oi.g.b(bufferedWriter2, "Failed to close key/value metadata file.");
            throw th;
        }
    }

    public final void i(String str, List list) {
        BufferedWriter bufferedWriter;
        Exception e3;
        File fileP = this.f13025a.p(str, "rollouts-state");
        ?? IsEmpty = list.isEmpty();
        if (IsEmpty != 0) {
            g(fileP, "Rollout state is empty for session: " + str);
            return;
        }
        ?? r7 = 0;
        try {
            try {
                String strE = e(list);
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileP), f13024b));
                try {
                    bufferedWriter.write(strE);
                    bufferedWriter.flush();
                    oi.g.b(bufferedWriter, "Failed to close rollouts state file.");
                } catch (Exception e10) {
                    e3 = e10;
                    Log.w("FirebaseCrashlytics", "Error serializing rollouts state.", e3);
                    f(fileP);
                    oi.g.b(bufferedWriter, "Failed to close rollouts state file.");
                }
            } catch (Throwable th2) {
                th = th2;
                r7 = IsEmpty;
                oi.g.b(r7, "Failed to close rollouts state file.");
                throw th;
            }
        } catch (Exception e11) {
            bufferedWriter = null;
            e3 = e11;
        } catch (Throwable th3) {
            th = th3;
            oi.g.b(r7, "Failed to close rollouts state file.");
            throw th;
        }
    }
}

package la;

import android.content.SharedPreferences;
import android.util.ArraySet;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import zh.f;

public final class d implements SharedPreferences {

    public final SharedPreferences f10192a;

    public final ArrayList f10193b = new ArrayList();

    public final String f10194c;

    public final mh.a f10195d;

    public final mh.c f10196e;

    public d(String str, SharedPreferences sharedPreferences, mh.a aVar, mh.c cVar) {
        this.f10194c = str;
        this.f10192a = sharedPreferences;
        this.f10195d = aVar;
        this.f10196e = cVar;
    }

    public static boolean c(String str) {
        return "__androidx_security_crypto_encrypted_prefs_key_keyset__".equals(str) || "__androidx_security_crypto_encrypted_prefs_value_keyset__".equals(str);
    }

    public final String a(String str) {
        if (str == null) {
            str = "__NULL__";
        }
        try {
            try {
                return new String(f.b(this.f10196e.a(str.getBytes(StandardCharsets.UTF_8), this.f10194c.getBytes())), "US-ASCII");
            } catch (UnsupportedEncodingException e3) {
                throw new AssertionError(e3);
            }
        } catch (GeneralSecurityException e10) {
            throw new SecurityException("Could not encrypt key. " + e10.getMessage(), e10);
        }
    }

    public final Object b(String str) {
        int i10;
        if (c(str)) {
            throw new SecurityException(w.c.j(str, " is a reserved key for the encryption keyset."));
        }
        if (str == null) {
            str = "__NULL__";
        }
        try {
            String strA = a(str);
            String string = this.f10192a.getString(strA, null);
            if (string != null) {
                byte[] bArrA = f.a(string);
                mh.a aVar = this.f10195d;
                Charset charset = StandardCharsets.UTF_8;
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(aVar.b(bArrA, strA.getBytes(charset)));
                byteBufferWrap.position(0);
                int i11 = byteBufferWrap.getInt();
                if (i11 == 0) {
                    i10 = 1;
                } else if (i11 == 1) {
                    i10 = 2;
                } else if (i11 == 2) {
                    i10 = 3;
                } else if (i11 == 3) {
                    i10 = 4;
                } else if (i11 != 4) {
                    i10 = i11 != 5 ? 0 : 6;
                } else {
                    i10 = 5;
                }
                int iB = e4.f.b(i10);
                if (iB == 0) {
                    int i12 = byteBufferWrap.getInt();
                    ByteBuffer byteBufferSlice = byteBufferWrap.slice();
                    byteBufferWrap.limit(i12);
                    String string2 = charset.decode(byteBufferSlice).toString();
                    if (!string2.equals("__NULL__")) {
                        return string2;
                    }
                } else if (iB == 1) {
                    ArraySet arraySet = new ArraySet();
                    while (byteBufferWrap.hasRemaining()) {
                        int i13 = byteBufferWrap.getInt();
                        ByteBuffer byteBufferSlice2 = byteBufferWrap.slice();
                        byteBufferSlice2.limit(i13);
                        byteBufferWrap.position(byteBufferWrap.position() + i13);
                        arraySet.add(StandardCharsets.UTF_8.decode(byteBufferSlice2).toString());
                    }
                    if (arraySet.size() != 1 || !"__NULL__".equals(arraySet.valueAt(0))) {
                        return arraySet;
                    }
                } else {
                    if (iB == 2) {
                        return Integer.valueOf(byteBufferWrap.getInt());
                    }
                    if (iB == 3) {
                        return Long.valueOf(byteBufferWrap.getLong());
                    }
                    if (iB == 4) {
                        return Float.valueOf(byteBufferWrap.getFloat());
                    }
                    if (iB == 5) {
                        return Boolean.valueOf(byteBufferWrap.get() != 0);
                    }
                }
            }
            return null;
        } catch (GeneralSecurityException e3) {
            throw new SecurityException("Could not decrypt value. " + e3.getMessage(), e3);
        }
    }

    @Override
    public final boolean contains(String str) {
        if (c(str)) {
            throw new SecurityException(w.c.j(str, " is a reserved key for the encryption keyset."));
        }
        return this.f10192a.contains(a(str));
    }

    @Override
    public final SharedPreferences.Editor edit() {
        return new a(this, this.f10192a.edit());
    }

    @Override
    public final Map getAll() {
        HashMap map = new HashMap();
        for (Map.Entry<String, ?> entry : this.f10192a.getAll().entrySet()) {
            if (!c(entry.getKey())) {
                try {
                    String str = new String(this.f10196e.b(f.a(entry.getKey()), this.f10194c.getBytes()), StandardCharsets.UTF_8);
                    if (str.equals("__NULL__")) {
                        str = null;
                    }
                    map.put(str, b(str));
                } catch (GeneralSecurityException e3) {
                    throw new SecurityException("Could not decrypt key. " + e3.getMessage(), e3);
                }
            }
        }
        return map;
    }

    @Override
    public final boolean getBoolean(String str, boolean z10) {
        Object objB = b(str);
        return (objB == null || !(objB instanceof Boolean)) ? z10 : ((Boolean) objB).booleanValue();
    }

    @Override
    public final float getFloat(String str, float f3) {
        Object objB = b(str);
        return (objB == null || !(objB instanceof Float)) ? f3 : ((Float) objB).floatValue();
    }

    @Override
    public final int getInt(String str, int i10) {
        Object objB = b(str);
        return (objB == null || !(objB instanceof Integer)) ? i10 : ((Integer) objB).intValue();
    }

    @Override
    public final long getLong(String str, long j9) {
        Object objB = b(str);
        return (objB == null || !(objB instanceof Long)) ? j9 : ((Long) objB).longValue();
    }

    @Override
    public final String getString(String str, String str2) {
        Object objB = b(str);
        return (objB == null || !(objB instanceof String)) ? str2 : (String) objB;
    }

    @Override
    public final Set getStringSet(String str, Set set) {
        Object objB = b(str);
        Set arraySet = objB instanceof Set ? (Set) objB : new ArraySet();
        return arraySet.size() > 0 ? arraySet : set;
    }

    @Override
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f10193b.add(onSharedPreferenceChangeListener);
    }

    @Override
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f10193b.remove(onSharedPreferenceChangeListener);
    }
}

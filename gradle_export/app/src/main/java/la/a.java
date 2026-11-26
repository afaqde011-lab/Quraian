package la;

import android.content.SharedPreferences;
import android.util.ArraySet;
import android.util.Pair;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import zh.f;

public final class a implements SharedPreferences.Editor {

    public final d f10188a;

    public final SharedPreferences.Editor f10189b;

    public final AtomicBoolean f10191d = new AtomicBoolean(false);

    public final CopyOnWriteArrayList f10190c = new CopyOnWriteArrayList();

    public a(d dVar, SharedPreferences.Editor editor) {
        this.f10188a = dVar;
        this.f10189b = editor;
    }

    public final void a() {
        if (this.f10191d.getAndSet(false)) {
            d dVar = this.f10188a;
            for (String str : ((HashMap) dVar.getAll()).keySet()) {
                if (!this.f10190c.contains(str) && !d.c(str)) {
                    this.f10189b.remove(dVar.a(str));
                }
            }
        }
    }

    @Override
    public final void apply() {
        a();
        this.f10189b.apply();
        b();
        this.f10190c.clear();
    }

    public final void b() {
        d dVar = this.f10188a;
        for (SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener : dVar.f10193b) {
            Iterator it = this.f10190c.iterator();
            while (it.hasNext()) {
                onSharedPreferenceChangeListener.onSharedPreferenceChanged(dVar, (String) it.next());
            }
        }
    }

    public final void c(String str, byte[] bArr) {
        d dVar = this.f10188a;
        dVar.getClass();
        if (d.c(str)) {
            throw new SecurityException(w.c.j(str, " is a reserved key for the encryption keyset."));
        }
        this.f10190c.add(str);
        if (str == null) {
            str = "__NULL__";
        }
        try {
            String strA = dVar.a(str);
            try {
                Pair pair = new Pair(strA, new String(f.b(dVar.f10195d.a(bArr, strA.getBytes(StandardCharsets.UTF_8))), "US-ASCII"));
                this.f10189b.putString((String) pair.first, (String) pair.second);
            } catch (UnsupportedEncodingException e3) {
                throw new AssertionError(e3);
            }
        } catch (GeneralSecurityException e10) {
            throw new SecurityException("Could not encrypt data: " + e10.getMessage(), e10);
        }
    }

    @Override
    public final SharedPreferences.Editor clear() {
        this.f10191d.set(true);
        return this;
    }

    @Override
    public final boolean commit() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f10190c;
        a();
        try {
            return this.f10189b.commit();
        } finally {
            b();
            copyOnWriteArrayList.clear();
        }
    }

    @Override
    public final SharedPreferences.Editor putBoolean(String str, boolean z10) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(5);
        byteBufferAllocate.putInt(5);
        byteBufferAllocate.put(z10 ? (byte) 1 : (byte) 0);
        c(str, byteBufferAllocate.array());
        return this;
    }

    @Override
    public final SharedPreferences.Editor putFloat(String str, float f3) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.putInt(4);
        byteBufferAllocate.putFloat(f3);
        c(str, byteBufferAllocate.array());
        return this;
    }

    @Override
    public final SharedPreferences.Editor putInt(String str, int i10) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.putInt(2);
        byteBufferAllocate.putInt(i10);
        c(str, byteBufferAllocate.array());
        return this;
    }

    @Override
    public final SharedPreferences.Editor putLong(String str, long j9) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(12);
        byteBufferAllocate.putInt(3);
        byteBufferAllocate.putLong(j9);
        c(str, byteBufferAllocate.array());
        return this;
    }

    @Override
    public final SharedPreferences.Editor putString(String str, String str2) {
        if (str2 == null) {
            str2 = "__NULL__";
        }
        byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
        int length = bytes.length;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length + 8);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(length);
        byteBufferAllocate.put(bytes);
        c(str, byteBufferAllocate.array());
        return this;
    }

    @Override
    public final SharedPreferences.Editor putStringSet(String str, Set set) {
        Set set2 = set;
        if (set == null) {
            ArraySet arraySet = new ArraySet();
            arraySet.add("__NULL__");
            set2 = arraySet;
        }
        ArrayList<byte[]> arrayList = new ArrayList(set2.size());
        int size = set2.size() * 4;
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            byte[] bytes = ((String) it.next()).getBytes(StandardCharsets.UTF_8);
            arrayList.add(bytes);
            size += bytes.length;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(size + 4);
        byteBufferAllocate.putInt(1);
        for (byte[] bArr : arrayList) {
            byteBufferAllocate.putInt(bArr.length);
            byteBufferAllocate.put(bArr);
        }
        c(str, byteBufferAllocate.array());
        return this;
    }

    @Override
    public final SharedPreferences.Editor remove(String str) {
        d dVar = this.f10188a;
        dVar.getClass();
        if (d.c(str)) {
            throw new SecurityException(w.c.j(str, " is a reserved key for the encryption keyset."));
        }
        this.f10189b.remove(dVar.a(str));
        this.f10190c.remove(str);
        return this;
    }
}

package jt;

import a40.z;
import android.content.SharedPreferences;
import bk.m;
import g00.b0;
import h00.d0;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import m00.i;
import ot.e;
import ri.t1;
import u00.n;

public final class b extends i implements n {
    public File A;
    public j40.a B;
    public d C;
    public String D;
    public String E;
    public int F;
    public int G;
    public final d H;
    public final String I;
    public final String J;
    public final int K;

    public b(d dVar, String str, String str2, int i, k00.c cVar) {
        super(2, cVar);
        this.H = dVar;
        this.I = str;
        this.J = str2;
        this.K = i;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        return new b(this.H, this.I, this.J, this.K, cVar);
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((z) obj, (k00.c) obj2)).invokeSuspend(b0.a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        d dVar;
        String str;
        String str2;
        File file;
        j40.a aVar;
        int i;
        Object objPutIfAbsent;
        l00.a aVar2 = l00.a.A;
        int i2 = this.G;
        if (i2 == 0) {
            t1.O(obj);
            dVar = this.H;
            String str3 = this.I;
            str = this.J;
            File fileB = dVar.b(str3, str);
            if (fileB == null) {
                throw new IllegalStateException("Invalid remote file URL");
            }
            ConcurrentHashMap concurrentHashMap = dVar.f;
            Object objA = concurrentHashMap.get(str3);
            if (objA == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(str3, (objA = j40.d.a()))) != null) {
                objA = objPutIfAbsent;
            }
            j40.a aVar3 = (j40.a) objA;
            this.A = fileB;
            this.B = aVar3;
            this.C = dVar;
            this.D = str3;
            this.E = str;
            int i3 = this.K;
            this.F = i3;
            this.G = 1;
            if (aVar3.l(this) == aVar2) {
                return aVar2;
            }
            str2 = str3;
            file = fileB;
            aVar = aVar3;
            i = i3;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.F;
            str = this.E;
            str2 = this.D;
            dVar = this.C;
            aVar = this.B;
            file = this.A;
            t1.O(obj);
        }
        try {
            Map mapC = dVar.c();
            m mVar = dVar.d;
            e eVar = dVar.e;
            SharedPreferences sharedPreferences = dVar.c;
            Integer num = (Integer) mapC.get(str2);
            if (!file.exists() || num == null || num.intValue() != i) {
                if (file.exists()) {
                    file.delete();
                    LinkedHashMap linkedHashMapB0 = d0.b0(dVar.c());
                    linkedHashMapB0.remove(str2);
                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    editorEdit.putString(eVar.B, mVar.i(linkedHashMapB0));
                    editorEdit.apply();
                }
                d.a(dVar, str, file);
                LinkedHashMap linkedHashMapB1 = d0.b0(dVar.c());
                linkedHashMapB1.put(str2, Integer.valueOf(i));
                SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
                editorEdit2.putString(eVar.B, mVar.i(linkedHashMapB1));
                editorEdit2.apply();
            }
            return file;
        } finally {
            aVar.i(null);
        }
    }
}

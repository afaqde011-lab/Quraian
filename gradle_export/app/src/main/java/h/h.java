package h;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public final class h extends c {

    public final int f6366a;

    public final i f6367b;

    public final String f6368c;

    public final i.a f6369d;

    public h(i iVar, String str, i.a aVar, int i10) {
        this.f6366a = i10;
        this.f6367b = iVar;
        this.f6368c = str;
        this.f6369d = aVar;
    }

    @Override
    public final void a(Object obj, hf.c cVar) {
        switch (this.f6366a) {
            case 0:
                i iVar = this.f6367b;
                ArrayList arrayList = iVar.f6373d;
                LinkedHashMap linkedHashMap = iVar.f6371b;
                String str = this.f6368c;
                Object obj2 = linkedHashMap.get(str);
                i.a aVar = this.f6369d;
                if (obj2 == null) {
                    throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + aVar + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
                }
                int iIntValue = ((Number) obj2).intValue();
                arrayList.add(str);
                try {
                    iVar.b(iIntValue, aVar, obj, cVar);
                    return;
                } catch (Exception e3) {
                    arrayList.remove(str);
                    throw e3;
                }
            default:
                i iVar2 = this.f6367b;
                ArrayList arrayList2 = iVar2.f6373d;
                LinkedHashMap linkedHashMap2 = iVar2.f6371b;
                String str2 = this.f6368c;
                Object obj3 = linkedHashMap2.get(str2);
                i.a aVar2 = this.f6369d;
                if (obj3 == null) {
                    throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + aVar2 + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
                }
                int iIntValue2 = ((Number) obj3).intValue();
                arrayList2.add(str2);
                try {
                    iVar2.b(iIntValue2, aVar2, obj, cVar);
                    return;
                } catch (Exception e10) {
                    arrayList2.remove(str2);
                    throw e10;
                }
        }
    }

    public void b() {
        this.f6367b.f(this.f6368c);
    }
}

package l9;

import android.os.Bundle;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import java.util.ArrayList;
import java.util.List;

public final class m extends q {

    public final int f10169e;

    public final h f10170f;

    public m(String str, h hVar, int i10) {
        super(str);
        this.f10169e = i10;
        this.f10170f = hVar;
    }

    public m(p pVar, String str, h hVar, Bundle bundle) {
        super(str);
        this.f10169e = 2;
        this.f10170f = hVar;
    }

    @Override
    public final void a() {
        switch (this.f10169e) {
            case 0:
                ((MediaBrowserService.Result) this.f10170f.f10149a).detach();
                break;
            case 1:
                ((MediaBrowserService.Result) this.f10170f.f10149a).detach();
                break;
            default:
                ((MediaBrowserService.Result) this.f10170f.f10149a).detach();
                break;
        }
    }

    @Override
    public final void d(Object obj) {
        ArrayList arrayList;
        switch (this.f10169e) {
            case 0:
                List<g> list = (List) obj;
                if (list == null) {
                    arrayList = null;
                } else {
                    ArrayList arrayList2 = new ArrayList(list.size());
                    for (g gVar : list) {
                        Parcel parcelObtain = Parcel.obtain();
                        gVar.writeToParcel(parcelObtain, 0);
                        arrayList2.add(parcelObtain);
                    }
                    arrayList = arrayList2;
                }
                this.f10170f.i(arrayList);
                break;
            case 1:
                g gVar2 = (g) obj;
                h hVar = this.f10170f;
                if (gVar2 == null) {
                    hVar.i(null);
                } else {
                    Parcel parcelObtain2 = Parcel.obtain();
                    gVar2.writeToParcel(parcelObtain2, 0);
                    hVar.i(parcelObtain2);
                }
                break;
            default:
                List<g> list2 = (List) obj;
                h hVar2 = this.f10170f;
                if (list2 == null) {
                    hVar2.i(null);
                } else {
                    ArrayList arrayList3 = new ArrayList(list2.size());
                    for (g gVar3 : list2) {
                        Parcel parcelObtain3 = Parcel.obtain();
                        gVar3.writeToParcel(parcelObtain3, 0);
                        arrayList3.add(parcelObtain3);
                    }
                    hVar2.i(arrayList3);
                }
                break;
        }
    }
}

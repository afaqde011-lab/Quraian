package fg;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import java.util.Comparator;
import p7.o;
import u00.k;
import u00.n;

public final class d implements Comparator {
    public final int A;
    public final Object B;

    public d(Object obj, int i10) {
        this.A = i10;
        this.B = obj;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int i10 = this.A;
        Object obj3 = this.B;
        switch (i10) {
            case 0:
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj3;
                MaterialButton materialButton = (MaterialButton) obj;
                MaterialButton materialButton2 = (MaterialButton) obj2;
                int iCompareTo = Boolean.valueOf(materialButton.O).compareTo(Boolean.valueOf(materialButton2.O));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
                int iCompareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
                return iCompareTo2 != 0 ? iCompareTo2 : Integer.compare(materialButtonToggleGroup.indexOfChild(materialButton), materialButtonToggleGroup.indexOfChild(materialButton2));
            case 1:
                for (k kVar : (k[]) obj3) {
                    int iZ = p30.f.Z((Comparable) kVar.invoke(obj), (Comparable) kVar.invoke(obj2));
                    if (iZ != 0) {
                        return iZ;
                    }
                }
                return 0;
            case 2:
                return ((Number) ((n) obj3).invoke(obj, obj2)).intValue();
            default:
                o oVar = (o) obj3;
                return oVar.a(obj2) - oVar.a(obj);
        }
    }
}

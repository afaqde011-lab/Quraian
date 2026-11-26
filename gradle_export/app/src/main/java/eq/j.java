package eq;

public final class j implements u00.k {
    public final int A;
    public final e6.c B;

    public j(e6.c cVar, int i) {
        this.A = i;
        this.B = cVar;
    }

    @Override
    public final Object invoke(Object obj) {
        int iIntValue;
        int iIntValue2;
        int i = this.A;
        Integer num = (Integer) obj;
        num.getClass();
        switch (i) {
            case 0:
                iIntValue = ((Number) this.B.invoke(num)).intValue();
                break;
            case 1:
                iIntValue2 = ((Number) this.B.invoke(num)).intValue();
                iIntValue = -iIntValue2;
                break;
            case 2:
                iIntValue2 = ((Number) this.B.invoke(num)).intValue();
                iIntValue = -iIntValue2;
                break;
            default:
                iIntValue = ((Number) this.B.invoke(num)).intValue();
                break;
        }
        return Integer.valueOf(iIntValue);
    }
}

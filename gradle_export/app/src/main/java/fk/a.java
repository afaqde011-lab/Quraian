package fk;

import com.google.protobuf.RuntimeVersion;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import oi.k;

public abstract class a {

    public static final TimeZone f5700a = TimeZone.getTimeZone("UTC");

    public static boolean a(String str, int i10, char c10) {
        return i10 < str.length() && str.charAt(i10) == c10;
    }

    public static void b(StringBuilder sb2, int i10, int i11) {
        String string = Integer.toString(i10);
        for (int length = i11 - string.length(); length > 0; length--) {
            sb2.append('0');
        }
        sb2.append(string);
    }

    public static Date c(String str, ParsePosition parsePosition) throws ParseException {
        int i10;
        int i11;
        int iD;
        int iD2;
        char cCharAt;
        TimeZone timeZone;
        String strSubstring;
        int length;
        String str2;
        String id2;
        char cCharAt2;
        int length2;
        try {
            int index = parsePosition.getIndex();
            int i12 = index + 4;
            int iD3 = d(str, index, i12);
            if (a(str, i12, '-')) {
                i12 = index + 5;
            }
            int i13 = i12 + 2;
            int iD4 = d(str, i12, i13);
            if (a(str, i13, '-')) {
                i13 = i12 + 3;
            }
            int i14 = i13 + 2;
            int iD5 = d(str, i13, i14);
            boolean zA = a(str, i14, 'T');
            if (!zA && str.length() <= i14) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(iD3, iD4 - 1, iD5);
                gregorianCalendar.setLenient(false);
                parsePosition.setIndex(i14);
                return gregorianCalendar.getTime();
            }
            if (zA) {
                int i15 = i13 + 5;
                int iD6 = d(str, i13 + 3, i15);
                if (a(str, i15, ':')) {
                    i15 = i13 + 6;
                }
                int i16 = i15 + 2;
                int iD7 = d(str, i15, i16);
                if (a(str, i16, ':')) {
                    i16 = i15 + 3;
                }
                if (str.length() <= i16 || (cCharAt2 = str.charAt(i16)) == 'Z' || cCharAt2 == '+' || cCharAt2 == '-') {
                    i14 = i16;
                    i10 = iD6;
                    i11 = iD7;
                } else {
                    int i17 = i16 + 2;
                    iD2 = d(str, i16, i17);
                    if (iD2 > 59 && iD2 < 63) {
                        iD2 = 59;
                    }
                    if (a(str, i17, '.')) {
                        int i18 = i16 + 3;
                        int i19 = i16 + 4;
                        while (true) {
                            if (i19 >= str.length()) {
                                length2 = str.length();
                                break;
                            }
                            char cCharAt3 = str.charAt(i19);
                            if (cCharAt3 >= '0' && cCharAt3 <= '9') {
                                i19++;
                            }
                            length2 = i19;
                            break;
                        }
                        int iMin = Math.min(length2, i16 + 6);
                        iD = d(str, i18, iMin);
                        int i20 = iMin - i18;
                        if (i20 == 1) {
                            iD *= 100;
                        } else if (i20 == 2) {
                            iD *= 10;
                        }
                        i10 = iD6;
                        i14 = length2;
                        i11 = iD7;
                    } else {
                        i10 = iD6;
                        i14 = i17;
                        i11 = iD7;
                        iD = 0;
                    }
                }
                if (str.length() > i14) {
                    throw new IllegalArgumentException("No time zone indicator");
                }
                cCharAt = str.charAt(i14);
                timeZone = f5700a;
                if (cCharAt == 'Z') {
                    length = i14 + 1;
                } else {
                    if (cCharAt == '+' && cCharAt != '-') {
                        throw new IndexOutOfBoundsException("Invalid time zone indicator '" + cCharAt + "'");
                    }
                    strSubstring = str.substring(i14);
                    if (strSubstring.length() >= 5) {
                        strSubstring = strSubstring + "00";
                    }
                    length = i14 + strSubstring.length();
                    if (!strSubstring.equals("+0000") && !strSubstring.equals("+00:00")) {
                        str2 = "GMT" + strSubstring;
                        timeZone = TimeZone.getTimeZone(str2);
                        id2 = timeZone.getID();
                        if (!id2.equals(str2) && !id2.replace(":", RuntimeVersion.SUFFIX).equals(str2)) {
                            throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + str2 + " given, resolves to " + timeZone.getID());
                        }
                    }
                }
                GregorianCalendar gregorianCalendar2 = new GregorianCalendar(timeZone);
                gregorianCalendar2.setLenient(false);
                gregorianCalendar2.set(1, iD3);
                gregorianCalendar2.set(2, iD4 - 1);
                gregorianCalendar2.set(5, iD5);
                gregorianCalendar2.set(11, i10);
                gregorianCalendar2.set(12, i11);
                gregorianCalendar2.set(13, iD2);
                gregorianCalendar2.set(14, iD);
                parsePosition.setIndex(length);
                return gregorianCalendar2.getTime();
            }
            i10 = 0;
            i11 = 0;
            iD = 0;
            iD2 = 0;
            if (str.length() > i14) {
                throw new IllegalArgumentException("No time zone indicator");
            }
            cCharAt = str.charAt(i14);
            timeZone = f5700a;
            if (cCharAt == 'Z') {
                length = i14 + 1;
            } else {
                if (cCharAt == '+') {
                }
                strSubstring = str.substring(i14);
                if (strSubstring.length() >= 5) {
                    strSubstring = strSubstring + "00";
                }
                length = i14 + strSubstring.length();
                if (!strSubstring.equals("+0000")) {
                    str2 = "GMT" + strSubstring;
                    timeZone = TimeZone.getTimeZone(str2);
                    id2 = timeZone.getID();
                    if (!id2.equals(str2)) {
                        throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + str2 + " given, resolves to " + timeZone.getID());
                    }
                }
            }
            GregorianCalendar gregorianCalendar3 = new GregorianCalendar(timeZone);
            gregorianCalendar3.setLenient(false);
            gregorianCalendar3.set(1, iD3);
            gregorianCalendar3.set(2, iD4 - 1);
            gregorianCalendar3.set(5, iD5);
            gregorianCalendar3.set(11, i10);
            gregorianCalendar3.set(12, i11);
            gregorianCalendar3.set(13, iD2);
            gregorianCalendar3.set(14, iD);
            parsePosition.setIndex(length);
            return gregorianCalendar3.getTime();
        } catch (IllegalArgumentException | IndexOutOfBoundsException e3) {
            String strG = str == null ? null : k.g('\"', "\"", str);
            String message = e3.getMessage();
            if (message == null || message.isEmpty()) {
                message = "(" + e3.getClass().getName() + ")";
            }
            ParseException parseException = new ParseException("Failed to parse date [" + strG + "]: " + message, parsePosition.getIndex());
            parseException.initCause(e3);
            throw parseException;
        }
    }

    public static int d(String str, int i10, int i11) {
        int i12;
        int i13;
        if (i10 < 0 || i11 > str.length() || i10 > i11) {
            throw new NumberFormatException(str);
        }
        if (i10 < i11) {
            i13 = i10 + 1;
            int iDigit = Character.digit(str.charAt(i10), 10);
            if (iDigit < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i10, i11));
            }
            i12 = -iDigit;
        } else {
            i12 = 0;
            i13 = i10;
        }
        while (i13 < i11) {
            int i14 = i13 + 1;
            int iDigit2 = Character.digit(str.charAt(i13), 10);
            if (iDigit2 < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i10, i11));
            }
            i12 = (i12 * 10) - iDigit2;
            i13 = i14;
        }
        return -i12;
    }
}

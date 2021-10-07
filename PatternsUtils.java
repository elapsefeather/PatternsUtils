package rich.maja3.utils;

import android.util.Log;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternsUtils {

    public static boolean isNull(String s) {
        if (s == null || s.equals(""))
            return true;
        else
            return false;
    }

    //英文大小寫、半型空格及部分标点：单点(.)、减号(-)、逗号(,)
    public static boolean isEnSMulti(String s, boolean canNull) {
        if (canNull) {
            if (s == null || s.equals(""))
                return true;
        } else {
            if (s == null || s.equals(""))
                return false;
        }
        return isEnSMulti(s);
    }

    public static boolean isEnSMulti(String s) {
        String rule;
        rule = "^[A-Za-z\\s\\.,\\-]*$";
        Pattern pattern = Pattern.compile(rule, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(s);
        return matcher.matches();
    }

    //區間位數 英文大小寫、半型空格及部分标点：单点(.)、减号(-)、逗号(,)
    public static boolean isEnSMulti(String s, boolean canNull, int rangeS, int rangeE) {
        if (canNull) {
            if (s == null || s.equals(""))
                return true;
        } else {
            if (s == null || s.equals(""))
                return false;
        }
        return isEnSMulti(s, rangeS, rangeE);
    }

    public static boolean isEnSMulti(String s, int rangeS, int rangeE) {
        String rule;
        rule = "^[A-Za-z\\s\\.,\\-]{" + rangeS + "," + rangeE + "}$";
        Pattern pattern = Pattern.compile(rule, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(s);
        return matcher.matches();
    }

    //英文大小寫、半型空格及部分标点：单点(.)、减号(-)
    public static boolean isEnSMulti2(String s, boolean canNull) {
        if (canNull) {
            if (s == null || s.equals(""))
                return true;
        } else {
            if (s == null || s.equals(""))
                return false;
        }
        return isEnSMulti2(s);
    }

    public static boolean isEnSMulti2(String s) {
        String rule;
        rule = "^[A-Za-z\\s\\.\\-]*$";
        Pattern pattern = Pattern.compile(rule, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(s);
        return matcher.matches();
    }

    //區間位數 英文大小寫、半型空格及部分标点：单点(.)、减号(-)
    public static boolean isEnSMulti2(String s, boolean canNull, int rangeS, int rangeE) {
        if (canNull) {
            if (s == null || s.equals(""))
                return true;
        } else {
            if (s == null || s.equals(""))
                return false;
        }
        return isEnSMulti2(s, rangeS, rangeE);
    }

    public static boolean isEnSMulti2(String s, int rangeS, int rangeE) {
        String rule;
        rule = "^[A-Za-z\\s\\.\\-]{" + rangeS + "," + rangeE + "}$";
        Pattern pattern = Pattern.compile(rule, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(s);
        return matcher.matches();
    }

    //英文大小寫、半型空格及部分标点：中单点(•·)、减号(-)、逗号(,)
    public static boolean isEnSMulti3(String s, boolean canNull) {
        if (canNull) {
            if (s == null || s.equals(""))
                return true;
        } else {
            if (s == null || s.equals(""))
                return false;
        }
        return isEnSMulti3(s);
    }

    public static boolean isEnSMulti3(String s) {
        String rule;
        rule = "^[A-Za-z\\s\\u00b7\\u2022,\\-]*$";
        Pattern pattern = Pattern.compile(rule, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(s);
        return matcher.matches();
    }

    //英文大小寫、半型空格及部分标点：中单点(•·)、减号(-)、逗号(,)
    public static boolean isEnSMulti3(String s, boolean canNull, int rangeS, int rangeE) {
        if (canNull) {
            if (s == null || s.equals(""))
                return true;
        } else {
            if (s == null || s.equals(""))
                return false;
        }
        return isEnSMulti3(s, rangeS, rangeE);
    }

    public static boolean isEnSMulti3(String s, int rangeS, int rangeE) {
        String rule;
        rule = "^[A-Za-z\\s\\u00b7\\u2022,\\-]{" + rangeS + "," + rangeE + "}$";
        Pattern pattern = Pattern.compile(rule, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(s);
        return matcher.matches();
    }

    //  支持英文、数字、半形空格及部份标点：半形单点(.)、半形逗点(,)
    public static boolean isEnNumMulti(String s, boolean canNull) {
        if (canNull) {
            if (s == null || s.equals(""))
                return true;
        } else {
            if (s == null || s.equals(""))
                return false;
        }
        return isEnNumMulti(s);
    }

    public static boolean isEnNumMulti(String s) {
        String rule;
        rule = "^[0-9A-Za-z\\s\\.,]*$";
        Pattern pattern = Pattern.compile(rule, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(s);
        return matcher.matches();
    }

    //  支持英文、数字、半形空格及部份标点：半形单点(.)、减号(-)、半形逗点(,)
    public static boolean isEnNumMulti2(String s, boolean canNull) {
        if (canNull) {
            if (s == null || s.equals(""))
                return true;
        } else {
            if (s == null || s.equals(""))
                return false;
        }
        return isEnNumMulti2(s);
    }

    public static boolean isEnNumMulti2(String s) {
        String rule;
        rule = "^[0-9A-Za-z\\s\\.,\\-]*$";
        Pattern pattern = Pattern.compile(rule, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(s);
        return matcher.matches();
    }

    //  支持英文、数字、半形空格及部份标点：半形单点(.)、减号(-)、半形逗点(,)
    public static boolean isEnNumMulti2(String s, boolean canNull, int rangeS, int rangeE) {
        if (canNull) {
            if (s == null || s.equals(""))
                return true;
        } else {
            if (s == null || s.equals(""))
                return false;
        }
        return isEnNumMulti2(s, rangeS, rangeE);
    }

    public static boolean isEnNumMulti2(String s, int rangeS, int rangeE) {
        String rule;
        rule = "^[0-9A-Za-z\\s\\.,\\-]{" + rangeS + "," + rangeE + "}$";
        Pattern pattern = Pattern.compile(rule, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(s);
        return matcher.matches();
    }

    //  支持英文、数字、半形空格及部份标点：半形单点(.)、减号(-)
    public static boolean isEnNumMulti3(String s, boolean canNull) {
        if (canNull) {
            if (s == null || s.equals(""))
                return true;
        } else {
            if (s == null || s.equals(""))
                return false;
        }
        return isEnNumMulti3(s);
    }

    public static boolean isEnNumMulti3(String s) {
        String rule;
        rule = "^[0-9A-Za-z\\s\\.\\-]*$";
        Pattern pattern = Pattern.compile(rule, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(s);
        return matcher.matches();
    }

    //  支持英文、数字、半形空格及部份标点：半形单点(.)、减号(-)
    public static boolean isEnNumMulti3(String s, boolean canNull, int rangeS, int rangeE) {
        if (canNull) {
            if (s == null || s.equals(""))
                return true;
        } else {
            if (s == null || s.equals(""))
                return false;
        }
        return isEnNumMulti3(s, rangeS, rangeE);
    }

    public static boolean isEnNumMulti3(String s, int rangeS, int rangeE) {
        String rule;
        rule = "^[0-9A-Za-z\\s\\.\\-]{" + rangeS + "," + rangeE + "}$";
        Pattern pattern = Pattern.compile(rule, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(s);
        return matcher.matches();
    }

    public static boolean isIFSC(String IFSC, boolean canNull) {
        if (canNull) {
            if (IFSC == null || IFSC.equals(""))
                return true;
        } else {
            if (IFSC == null || IFSC.equals(""))
                return false;
        }
        String rule;
        rule = "^[0-9A-Za-z]{4}0[0-9]{6}$";
        Pattern pattern = Pattern.compile(rule, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(IFSC);
        return matcher.matches();
    }

    //  email
    public static boolean isEmail(String s, boolean canNull) {
        if (canNull) {
            if (s == null || s.equals(""))
                return true;
        } else {
            if (s == null || s.equals(""))
                return false;
        }
        return isEmail(s);
    }

    // is upi id
    public static boolean isUpiId(String s, boolean canNull) {
        if (canNull) {
            if (s == null || s.equals(""))
                return true;
        } else {
            if (s == null || s.equals(""))
                return false;
        }
        String upiid;
        upiid = "^[0-9A-Za-z]+@[0-9A-Za-z]+$";
        Pattern pattern = Pattern.compile(upiid, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(s);
        return matcher.matches();
    }

    public static boolean isEmail(String s) {
        String email;
//        只有到＠
//        email = "^[_a-z0-9-]+([.][_a-z0-9-]+)*@[a-z0-9-]+([.][a-z0-9-]+)*$";
//        有＠及.後兩碼
        email = "^[A-Za-z0-9]+(\\.[_A-Za-z0-9]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{1,})$";
        Pattern pattern = Pattern.compile(email, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(s);
        if (matcher.matches() && s.length() <= 255) {
            String[] emailS = s.split("@");
            if (emailS[0].length() <= 64)
                return true;
            else
                return false;
        } else {
            return false;
        }
//        if email{
//            if let fC = input.first{//郵件帳號應該要以 a-z、A-Z、0-9 開頭
//                let set = CharacterSet(charactersIn: "abcdefghijklmnopqrstuvwxyzABCEFGHIJKLMNOPQRSTUVWXYZ0123456789")
//                if String(fC).rangeOfCharacter(from: set) == nil{
//                    return ""
//                }
//            }
//            if input.contains("@"){
//                if input.trimmingCharacters(in: CharacterSet(charactersIn: "@").inverted).count > 1{
//                    return ""
//                }
//
//                if let account = input.split(separator: "@").first ,let domain = input.split(separator: "@").last{
//                    if account == domain{
//                        return text
//                    }
//                    if text.count >= 255{ return ""}
//                    print("account",account,"domain",domain)
//                    let accChecker = CharacterSet(charactersIn: "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789_.")
//                    let domChecker = CharacterSet(charactersIn: "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789_.-")
//                    let corrAcc = account.trimmingCharacters(in: accChecker.inverted)
//
//                    let corrDom = domain.trimmingCharacters(in: domChecker.inverted)
//                    if corrDom.contains(".."){
//                        return ""
//                    }
//                    return corrAcc+"@"+corrDom
//                }
//            }else{
//                let cha = CharacterSet(charactersIn: "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789_.")
//                let inp = input.trimmingCharacters(in: cha.inverted).prefix(64)
//                return String(inp)
//            }
//        }
    }

    //  英數中文
    public static boolean isEnNumCn(String s, boolean canNull) {
        if (canNull) {
            if (s == null || s.equals(""))
                return true;
        } else {
            if (s == null || s.equals(""))
                return false;
        }
        return isEnNumCn(s);
    }

    public static boolean isEnNumCn(String s) {
        String rule;
        rule = "^[a-zA-Z0-9\\u4e00-\\u9fa5]+$";
        Pattern pattern = Pattern.compile(rule, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(s);
        return matcher.matches();
    }

    //  英數字
    public static boolean isEnNum(String s, boolean canNull) {
        if (canNull) {
            if (s == null || s.equals(""))
                return true;
        } else {
            if (s == null || s.equals(""))
                return false;
        }
        return isEnNum(s);
    }

    public static boolean isEnNum(String s) {
        String rule;
        rule = "^[0-9A-Za-z]*$";
        Pattern pattern = Pattern.compile(rule, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(s);
        return matcher.matches();
    }

    //  區間位數英數
    public static boolean isEnNum(String s, boolean canNull, int rangeS, int rangeE) {
        if (canNull) {
            if (s == null || s.equals(""))
                return true;
        } else {
            if (s == null || s.equals(""))
                return false;
        }
        return isEnNum(s, rangeS, rangeE);
    }

    public static boolean isEnNum(String s, int rangeS, int rangeE) {
        String rule;
        rule = "^[0-9A-Za-z]{" + rangeS + "," + rangeE + "}$";
        Pattern pattern = Pattern.compile(rule, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(s);
        return matcher.matches();
    }

    public static boolean isEnNumSpace(String s) {
        Log.e("isEnNumSpace", ": call");
        String rule;
        rule = "^[\\d\\sA-Za-z]*$";
        Pattern pattern = Pattern.compile(rule, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(s);
        return matcher.matches();
    }

    //  英數下底線
    public static boolean isEnNumL(String s, boolean canNull) {
        if (canNull) {
            if (s == null || s.equals(""))
                return true;
        } else {
            if (s == null || s.equals(""))
                return false;
        }
        return isEnNumL(s);
    }

    public static boolean isEnNumL(String s) {
        String rule;
        rule = "^\\w+$";
        Pattern pattern = Pattern.compile(rule, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(s);
        return matcher.matches();
    }

    //  區間位數英數下底線
    public static boolean isEnNumL(String s, boolean canNull, int rangeS, int rangeE) {
        if (canNull) {
            if (s == null || s.equals(""))
                return true;
        } else {
            if (s == null || s.equals(""))
                return false;
        }
        return isEnNumL(s, rangeS, rangeE);
    }

    public static boolean isEnNumL(String s, int rangeS, int rangeE) {
        String rule;
        rule = "^\\w{" + rangeS + "," + rangeE + "}$";
        Pattern pattern = Pattern.compile(rule, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(s);
        return matcher.matches();
    }

    //  只有英文
    public static boolean onlyEn(String s, boolean canNull) {
        if (canNull) {
            if (s == null || s.equals(""))
                return true;
        } else {
            if (s == null || s.equals(""))
                return false;
        }
        return onlyEn(s);
    }

    public static boolean onlyEn(String s) {
        String rule;
        rule = "^[A-Za-z]+$";
        Pattern pattern = Pattern.compile(rule, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(s);
        return matcher.matches();
    }

    //  英文 space
    public static boolean isEnS(String s, boolean canNull) {
        if (canNull) {
            if (s == null || s.equals(""))
                return true;
        } else {
            if (s == null || s.equals(""))
                return false;
        }
        return isEnS(s);
    }

    public static boolean isEnS(String s) {
        String rule;
        rule = "^[A-Za-z\\s]+$";
        Pattern pattern = Pattern.compile(rule, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(s);
        return matcher.matches();
    }

    //  英文 space
    public static boolean isEnS(String s, boolean canNull, int rangeS, int rangeE) {
        if (canNull) {
            if (s == null || s.equals(""))
                return true;
        } else {
            if (s == null || s.equals(""))
                return false;
        }
        return isEnS(s, rangeS, rangeE);
    }

    public static boolean isEnS(String s, int rangeS, int rangeE) {
        String rule;
        rule = "^[A-Za-z\\s]{" + rangeS + "," + rangeE + "}$";
        Pattern pattern = Pattern.compile(rule, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(s);
        return matcher.matches();
    }

    //    數字長度
    public static boolean isNumLength(String s, int length, boolean canNull) {
        if (canNull) {
            if (s == null || s.equals(""))
                return true;
        } else {
            if (s == null || s.equals(""))
                return false;
        }
        return isNumLength(s, length);
    }

    public static boolean isNumLength(String s, int length) {
        String rule;
        rule = "^\\d{" + length + "}$";
        Pattern pattern = Pattern.compile(rule, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(s);
        return matcher.matches();
    }

    //  只有數字
    public static boolean onlyNum(String s, boolean canNull) {
        if (canNull) {
            if (s == null || s.equals(""))
                return true;
        } else {
            if (s == null || s.equals(""))
                return false;
        }
        return onlyNum(s);
    }

    public static boolean onlyNum(String s) {
        String rule;
        rule = "^[0-9]*$";
        Pattern pattern = Pattern.compile(rule, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(s);
        return matcher.matches();
    }

    //  只有數字
    public static boolean onlyNum(String s, boolean canNull, int rangeS, int rangeE) {
        if (canNull) {
            if (s == null || s.equals(""))
                return true;
        } else {
            if (s == null || s.equals(""))
                return false;
        }
        return onlyNum(s, rangeS, rangeE);
    }

    public static boolean onlyNum(String s, int rangeS, int rangeE) {
        String rule;
        rule = "^[0-9]{" + rangeS + "," + rangeE + "}$";
        Pattern pattern = Pattern.compile(rule, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(s);
        return matcher.matches();
    }

    public static boolean isDate(String s) {
        String str = s;
        String regex = "[0-9]{4}-[0-9]{2}-[0-9]{2}";
        Pattern pattern = Pattern.compile(regex);
        Matcher m = pattern.matcher(str);
        boolean dateFlag = m.matches();
        if (!dateFlag) {
            return false;
        }
        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        formatter.setLenient(false);
        try {
            Date date = formatter.parse(str);
            Date now = new Date();
            if (now.getTime() - date.getYear() >= 18) {
                return true;
            } else {
                return false;
            }


        } catch (Exception e) {
            return false;
        }
    }

    public static boolean isSame(String s) {
        String rule;
        rule = "^(.)\\1{5,11}$";
        Pattern pattern = Pattern.compile(rule, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(s);
        return matcher.matches();
    }

    public static boolean isValidNumber(String s) {
        boolean result = false;
        int firsti = 0;
        int prei = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            char charAt = s.charAt(i);
            char charAtpre = s.charAt(i + 1);
            try {
                firsti = Integer.parseInt(String.valueOf(charAt));
                prei = Integer.parseInt(String.valueOf(charAtpre));
                if (Math.abs(firsti - prei) != 1) {
                    result = true;
                    break;
                }
            } catch (Exception ex) {
                result = true;
                break;
            }
        }
        if (isSame(s)) {
            result = false;
        }

        return result;
    }

    public static final String TAG_START = "<\\w+((\\s+\\w+(\\s*=\\s*(?:\".*?\"|'.*?'|[^'\">\\s]+))?)+\\s*|\\s*)>";
    public static final String TAG_END = "</\\w+>";
    public static final String TAG_SELF_CLOSING = "<\\w+((\\s+\\w+(\\s*=\\s*(?:\".*?\"|'.*?'|[^'\">\\s]+))?)+\\s*|\\s*)/>";
    public static final String HTML_ENTITY = "&[a-zA-Z][a-zA-Z0-9]+;";
    public static final Pattern htmlPattern = Pattern.compile(
            "(" + TAG_START + ".*" + TAG_END + ")|(" + TAG_SELF_CLOSING + ")|(" + HTML_ENTITY + ")", Pattern.DOTALL);

    public static boolean isHtml(String htmlString) {
        boolean isHTML = false;
        if (htmlString != null) {
            isHTML = htmlPattern.matcher(htmlString).find();
        }
        return isHTML;
    }
}

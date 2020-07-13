package cn.tuodayun;

import java.util.regex.Pattern;

/**
 * @description: excel正则表达式，以及错误信息
 * @author: duanyashu
 * @time: 2020-07-10 09:10
 */
public class ExcelPatternMsg {

    //只能输入整数或者小数
    public static final String DECIMAL = "^[0-9]+\\.{0,1}[0-9]{0,2}$";
    public static final String DECIMAL_MSG = "只能输入整数或者小数";

    //日期格式 yyyy/MM/dd
    public static final String DATE1 = "(([0-9]{3}[1-9]|[0-9]{2}[1-9][0-9]{1}|[0-9]{1}[1-9][0-9]{2}|[1-9][0-9]{3})\\/(((0[13578]|1[02])\\/(0[1-9]|[12][0-9]|3[01]))|"+
            "((0[469]|11)\\/(0[1-9]|[12][0-9]|30))|(02\\/(0[1-9]|[1][0-9]|2[0-8]))))|((([0-9]{2})(0[48]|[2468][048]|[13579][26])|"+
            "((0[48]|[2468][048]|[3579][26])00))\\/02\\/29)$";
    public static final String DATE1_MSG = "输入正确的日期格式：yyyy/MM/dd";

    //日期格式 yyyy-MM-dd
    public static final String DATE2 = "(([0-9]{3}[1-9]|[0-9]{2}[1-9][0-9]{1}|[0-9]{1}[1-9][0-9]{2}|[1-9][0-9]{3})-(((0[13578]|1[02])-(0[1-9]|[12][0-9]|3[01]))|"+
            "((0[469]|11)-(0[1-9]|[12][0-9]|30))|(02-(0[1-9]|[1][0-9]|2[0-8]))))|((([0-9]{2})(0[48]|[2468][048]|[13579][26])|"+
            "((0[48]|[2468][048]|[3579][26])00))-02-29)$";
    public static final String DATE2_MSG = "输入正确的日期格式：yyyy-MM-dd";


    //日期格式 yyyyMMdd
    public static final String DATE3 = "(([0-9]{3}[1-9]|[0-9]{2}[1-9][0-9]{1}|[0-9]{1}[1-9][0-9]{2}|[1-9][0-9]{3})(((0[13578]|1[02])(0[1-9]|[12][0-9]|3[01]))|"+
            "((0[469]|11)(0[1-9]|[12][0-9]|30))|(02(0[1-9]|[1][0-9]|2[0-8]))))|((([0-9]{2})(0[48]|[2468][048]|[13579][26])|"+
            "((0[48]|[2468][048]|[3579][26])00))0229)$";
    public static final String DATE3_MSG = "输入正确的日期格式：yyyyMMdd";

    //日期格式 yyyy-MM-dd HH:mm:ss
    public static final String DATE_TIME1 = "^((([0-9]{3}[1-9]|[0-9]{2}[1-9][0-9]{1}|[0-9]{1}[1-9][0-9]{2}|[1-9][0-9]{3})-(((0[13578]|1[02])-(0[1-9]|[12][0-9]|3[01]))|" +
            "((0[469]|11)-(0[1-9]|[12][0-9]|30))|(02-(0[1-9]|[1][0-9]|2[0-8]))))|((([0-9]{2})(0[48]|[2468][048]|[13579][26])|((0[48]|[2468][048]|[3579][26])00))-02-29))\\s+([0-1]?[0-9]|2[0-3]):([0-5][0-9]):([0-5][0-9])$";
    public static final String DATE_TIME1_MSG = "输入正确的日期格式：yyyy-MM-dd HH:mm:ss";


    //日期格式 yyyy/MM/dd HH:mm:ss
    public static final String DATE_TIME2 = "((([0-9]{3}[1-9]|[0-9]{2}[1-9][0-9]{1}|[0-9]{1}[1-9][0-9]{2}|[1-9][0-9]{3})\\/(((0[13578]|1[02])\\/(0[1-9]|[12][0-9]|3[01]))|"+
            "((0[469]|11)\\/(0[1-9]|[12][0-9]|30))|(02\\/(0[1-9]|[1][0-9]|2[0-8]))))|((([0-9]{2})(0[48]|[2468][048]|[13579][26])|"+
            "((0[48]|[2468][048]|[3579][26])00))\\/02\\/29))\\s([0-1][0-9]|2[0-3]):([0-5][0-9]):([0-5][0-9])$";
    public static final String DATE_TIME2_MSG = "输入正确的日期格式：yyyy/MM/dd HH:mm:ss";

    //日期格式 yyyyMMddHHmmss
    public static final String DATE_TIME3 = "((([0-9]{3}[1-9]|[0-9]{2}[1-9][0-9]{1}|[0-9]{1}[1-9][0-9]{2}|[1-9][0-9]{3})(((0[13578]|1[02])(0[1-9]|[12][0-9]|3[01]))|"+
            "((0[469]|11)(0[1-9]|[12][0-9]|30))|(02(0[1-9]|[1][0-9]|2[0-8]))))|((([0-9]{2})(0[48]|[2468][048]|[13579][26])|((0[48]|[2468][048]|[3579][26])00))0229))"+
            "([0-1][0-9]|2[0-3])([0-5][0-9])([0-5][0-9])$";
    public static final String DATE_TIME3_MSG = "输入正确的日期格式：yyyyMMddHHmmss";


    //日期格式 yyyyMMddHHmmssSSS
    public static final String DATE_TIME4 = "((([0-9]{3}[1-9]|[0-9]{2}[1-9][0-9]{1}|[0-9]{1}[1-9][0-9]{2}|[1-9][0-9]{3})(((0[13578]|1[02])(0[1-9]|[12][0-9]|3[01]))|"+
            "((0[469]|11)(0[1-9]|[12][0-9]|30))|(02(0[1-9]|[1][0-9]|2[0-8]))))|((([0-9]{2})(0[48]|[2468][048]|[13579][26])|"+
            "((0[48]|[2468][048]|[3579][26])00))0229))([0-1][0-9]|2[0-3])([0-5][0-9])([0-5][0-9])([0-9]{3})$";
    public static final String DATE_TIME4_MSG = "输入正确的日期格式：yyyyMMddHHmmssSSS";


    //日期格式 yyyyMMdd HH:mm:ss
    public static final String DATE_TIME5 = "((([0-9]{3}[1-9]|[0-9]{2}[1-9][0-9]{1}|[0-9]{1}[1-9][0-9]{2}|[1-9][0-9]{3})(((0[13578]|1[02])(0[1-9]|[12][0-9]|3[01]))|"+
            "((0[469]|11)(0[1-9]|[12][0-9]|30))|(02(0[1-9]|[1][0-9]|2[0-8]))))|((([0-9]{2})(0[48]|[2468][048]|[13579][26])|"+
            "((0[48]|[2468][048]|[3579][26])00))0229))\\s([0-1][0-9]|2[0-3]):([0-5][0-9]):([0-5][0-9])$";
    public static final String DATE_TIME5_MSG = "输入正确的日期格式：yyyyMMdd HH:mm:ss";


    //数字和字母
    public static final String NUMBER_LETTER = "^[a-z0-9A-Z]+$";
    public static final String NUMBER_LETTER_MSG = "只能输入数字和字母";

    //数字
    public static final String NUMBER = "^[0-9]*$";
    public static final String NUMBER_MSG = "只能输入数字";

    //性别
    public static final String SEX ="^[男女]$";
    public static final String SEX_MSG="性别只能为【男女】";

    //手机号
    public static final String PHONE="^[1]([3][0-9]{1}|59|58|86|88|77|89)[0-9]{8}$";
    public static final String PHONE_MSG="手机号格式不正确";

    //身份证
    public static final String IDENTITY="^[1-9][0-9]{5}(19[0-9]{2}|200[0-9]|2010)(0[1-9]|1[0-2])(0[1-9]|[12][0-9]|3[01])[0-9]{3}[0-9xX]$";
    public static final String IDENTITY_MSG="身份证格式不正确";

    public static final String TEXT="[\u4E00-\u9FA5]";
    public static final String TEXT_MSG="只能是中文";


    public static void main(String[] args) {
        System.out.println(Pattern.matches(DATE1,"2020/02/30"));
    }
}

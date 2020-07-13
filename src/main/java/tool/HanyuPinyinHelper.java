package tool;

/**
 * @ClassName : Hanyu
 * @Description : pinyin
 * @Author : Caoguodong
 * @Date: 2020-07-13
 */

import net.sourceforge.pinyin4j.PinyinHelper;
import net.sourceforge.pinyin4j.format.HanyuPinyinCaseType;
import net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat;
import net.sourceforge.pinyin4j.format.HanyuPinyinToneType;
import net.sourceforge.pinyin4j.format.HanyuPinyinVCharType;
import net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination;

public class HanyuPinyinHelper {

    /**
     * 将文字转为汉语拼音
     */
    public static String toHanyuPinyin(String ChineseLanguage){
        char[] cl_chars = ChineseLanguage.trim().toCharArray();
        StringBuilder hanyupinyin = new StringBuilder();
        HanyuPinyinOutputFormat defaultFormat = new HanyuPinyinOutputFormat();
        defaultFormat.setCaseType(HanyuPinyinCaseType.LOWERCASE);// 输出拼音全部小写
        defaultFormat.setToneType(HanyuPinyinToneType.WITHOUT_TONE);// 不带声调
        defaultFormat.setVCharType(HanyuPinyinVCharType.WITH_V) ;
        try {
            for (char cl_char : cl_chars) {
                if (String.valueOf(cl_char).matches("[\u4e00-\u9fa5]+")) {// 如果字符是中文,则将中文转为汉语拼音
                    hanyupinyin.append(PinyinHelper.toHanyuPinyinStringArray(cl_char, defaultFormat)[0]);
                } else {// 如果字符不是中文,则不转换
                    hanyupinyin.append(cl_char);
                }
            }
        } catch (BadHanyuPinyinOutputFormatCombination e) {

            System.out.println("字符不能转成汉语拼音");
        }
        return hanyupinyin.toString();
    }

}
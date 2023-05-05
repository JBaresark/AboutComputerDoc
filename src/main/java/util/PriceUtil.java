package util;

import java.math.BigDecimal;


public class PriceUtil {

    /**
     * 获取保留两位小数的价格字串
     *
     * @param price
     * @return
     */
    public static String toString(BigDecimal price) {
        // 为空或小于等于零时返回空串
        if (null == price || price.min(new BigDecimal(0)).equals(price)) {
            return "";
        }
        // 返回保留两位小数的价格
        else {
            return price.setScale(2, BigDecimal.ROUND_DOWN).stripTrailingZeros().toPlainString();
        }
    }


}

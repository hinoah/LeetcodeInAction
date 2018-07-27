package leetcode.medium;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * @link https://leetcode-cn.com/problems/encode-and-decode-tinyurl/description/
 *
 * @author <a href="mailto:hefangzhou@vpgame.cn">hefangzhou</a>
 * @date 2018/7/27 下午6:06
 */
public class EncodeAndDecodeTinyURL {

    private Map<String, String> urlMap = new HashMap<>();

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        String shortUrl;
        do {
            shortUrl = generateRandomStr(10);
        } while (urlMap.containsKey(shortUrl));
        urlMap.put(shortUrl, longUrl);
        return shortUrl;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return urlMap.get(shortUrl);
    }

    public static String generateRandomStr(Integer length) {
        String base = "abcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(base.length());
            sb.append(base.charAt(number));
        }
        return sb.toString();
    }

}

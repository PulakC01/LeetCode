public class Codec {
    HashMap<String ,String> m = new HashMap<>();
    static String charset = "abcdefghijklmnopqrstuvwxyzAbCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    static String base = "http://tinyurl.com/";
    
    public static String getCode(int x) {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for(int i=0;i<x;i++) {
            sb.append(charset.charAt(random.nextInt(charset.length())));
        }
        return sb.toString();
        
    }
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        int n = ThreadLocalRandom.current().nextInt(1, 62+1);
        String temp = getCode(n);
        while(m.containsKey(temp))
            temp = getCode(n);
        
        m.put(base+temp,longUrl);
        return base+temp;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return m.get(shortUrl);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));
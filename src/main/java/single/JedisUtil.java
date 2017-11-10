package single;


import org.springframework.util.StringUtils;

import redis.clients.jedis.Jedis;

public class JedisUtil {

    public static Jedis createJedis() {
        Jedis jedis = new Jedis("192.168.49.128");
        return jedis;
    }

    public static Jedis createJedis(String host, int port) {
        Jedis jedis = new Jedis(host, port);

        return jedis;
    }

    public static Jedis createJedis(String host, int port, String passwrod) {
        Jedis jedis = new Jedis(host, port);

//        if (StringUtils.isEmpty(passwrod))
            jedis.auth(passwrod);
        
        return jedis;
    }
    public static void main(String[] args) {
    	Jedis jedis =createJedis("192.168.49.128",6379,"123456");
    	System.out.println(jedis.get("arraytest"));
	}
}
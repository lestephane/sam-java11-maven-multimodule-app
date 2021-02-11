package helloworld;

import java.util.HashMap;
import java.util.Map;

public class Shared {
    static Map<String, String> DEFAULT_HEADERS = new HashMap<>();

    static {
        DEFAULT_HEADERS.put("Content-Type", "application/json");
        DEFAULT_HEADERS.put("X-Custom-Header", "application/json");
    }
}

package it.blog.designpatterns.flyweight;

import java.util.HashMap;
import java.util.Map;

public class OriginFactory {

	static Map<String, Origin> origins = new HashMap<>();
	
	public static Origin getOrigin(String type, String country) {
		Origin result = origins.get(type);
    if (result == null) {
        result = new Origin(type, country);
        origins.put(type, result);
    }
    return result;
}
}

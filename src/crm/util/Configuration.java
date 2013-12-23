package crm.util;

import java.util.HashMap;
import java.util.Map;

/**
 * 系统配置从参数
 * @author <a mailto="hwangsyin@gmail.com">King</a>
 *
 */
public class Configuration {
	private static Map<String, String> container = new HashMap<String, String>();
	
	public static void put(String key, String value) {
		if (key != null && !"".equals(key.trim()) &&
				value != null && !"".equals(value.trim())) {
			container.put(key, value);
		}
	}

	public static String get(String key) {
		if (key != null && !"".equals(key.trim())) {
			return container.get(key);
		}
		
		return null;
	}
}

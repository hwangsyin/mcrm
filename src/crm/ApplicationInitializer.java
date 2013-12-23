package crm;

import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import crm.util.Configuration;

/**
 * 应用程序初始化
 * @author <a mailto="hwangsyin@gmail.com">King</a>
 *
 */
public class ApplicationInitializer {
	// 解析配置参数
	private static void  parseConfig() {
		InputStream is = ApplicationInitializer.class.getClassLoader()
			.getResourceAsStream("app.config.properties");
		Properties props = new Properties();
		try {
			props.load(is);
			Set<Map.Entry<Object, Object>> entries = props.entrySet();
			if (entries != null && entries.size() > 0) {
				Map.Entry<Object, Object> entry = null;
				Iterator<Map.Entry<Object, Object>> it = entries.iterator();
				while (it.hasNext()) {
					entry = it.next();
					Configuration.put(entry.getKey().toString(), entry.getValue().toString());
				}
			} 
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 初始化应用程序 
	 */
	public static void init() {
		// 1. 解析配置参数
		parseConfig();
	}
}

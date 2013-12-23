package crm;

import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import crm.util.Configuration;

/**
 * Ӧ�ó����ʼ��
 * @author <a mailto="hwangsyin@gmail.com">King</a>
 *
 */
public class ApplicationInitializer {
	// �������ò���
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
	 * ��ʼ��Ӧ�ó��� 
	 */
	public static void init() {
		// 1. �������ò���
		parseConfig();
	}
}

package crm.domain;

/**
 * 性别
 * @author <a mailto="hwangsyin@gmail.com">King</a>
 *
 */
public enum Gender {
	MALE {
		public String description() {
			return "男性";
		}
	}, FEMALE {
		public String description() {
			return "女性";
		}
	};
	public abstract String description();
}

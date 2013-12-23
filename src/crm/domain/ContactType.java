package crm.domain;

/**
 * 联系人类型
 * @author <a mailto="hwangsyin@gmail.com">King</a>
 *
 */
public enum ContactType {
	CUSTOMER {
		public String description() {
			return "客户";
		}
	}, 
	USER {
		public String description() {
			return "用户";
		}
	};
	public abstract String description();
}

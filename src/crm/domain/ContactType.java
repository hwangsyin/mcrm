package crm.domain;

/**
 * ��ϵ������
 * @author <a mailto="hwangsyin@gmail.com">King</a>
 *
 */
public enum ContactType {
	CUSTOMER {
		public String description() {
			return "�ͻ�";
		}
	}, 
	USER {
		public String description() {
			return "�û�";
		}
	};
	public abstract String description();
}

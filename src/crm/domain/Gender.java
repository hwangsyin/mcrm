package crm.domain;

/**
 * �Ա�
 * @author <a mailto="hwangsyin@gmail.com">King</a>
 *
 */
public enum Gender {
	MALE {
		public String description() {
			return "����";
		}
	}, FEMALE {
		public String description() {
			return "Ů��";
		}
	};
	public abstract String description();
}

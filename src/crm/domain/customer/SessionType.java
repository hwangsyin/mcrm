package crm.domain.customer;

/**
 * �Ự����
 * @author <a mailto="hwangsyin@gmail.com">King</a>
 *
 */
public class SessionType {
	/** System ID **/
	private Integer id;
	/** ��ʶ **/
	private String key;
	/** ���� **/
	private String name;
	/** ��ʾ���� **/
	private String displayName;
	/** ���÷� **/
	private String enable = "1";
	/** ���� **/
	private String description;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public String getEnable() {
		return enable;
	}
	public void setEnable(String enable) {
		this.enable = enable;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}

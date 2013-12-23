package crm.domain.customer;

/**
 * 会话类型
 * @author <a mailto="hwangsyin@gmail.com">King</a>
 *
 */
public class SessionType {
	/** System ID **/
	private Integer id;
	/** 标识 **/
	private String key;
	/** 名称 **/
	private String name;
	/** 显示名称 **/
	private String displayName;
	/** 启用否 **/
	private String enable = "1";
	/** 描述 **/
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

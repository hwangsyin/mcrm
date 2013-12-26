package crm.domain.user;

import java.util.Date;
import java.util.List;

import crm.domain.Gender;
import crm.domain.customer.Phone;

/**
 * 用户 or trade agent
 * @author <a mailto="hwangsyin@gmail.com">King</a>
 *
 */
public class User {
	/** System ID **/
	private String id;
	/** 姓名 **/
	private String name;
	/** 性别 **/
	private Gender gender;
	/** 年龄 **/
	private Integer age;
	/** 联系电话 **/
	private Phone contactPhone;
	/** 电话 **/
	private List<Phone> phones;
	/** 电子邮件 **/
	private String email;
	/** 加入时间 **/
	private Date joinTime;
	/** 退出时间 **/
	private Date quitTime;
	/** 员工 ID **/
	private String employeeId;
	/** 启禁用 **/
	private Boolean enable;
	/** 描述 **/
	private String description;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public List<Phone> getPhones() {
		return phones;
	}
	public void setPhones(List<Phone> phones) {
		this.phones = phones;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getJoinTime() {
		return joinTime;
	}
	public void setJoinTime(Date joinTime) {
		this.joinTime = joinTime;
	}
	public Date getQuitTime() {
		return quitTime;
	}
	public void setQuitTime(Date quitTime) {
		this.quitTime = quitTime;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public Boolean getEnable() {
		return enable;
	}
	public void setEnable(Boolean enable) {
		this.enable = enable;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Phone getContactPhone() {
		return contactPhone;
	}
	public void setContactPhone(Phone contactPhone) {
		this.contactPhone = contactPhone;
	}
}

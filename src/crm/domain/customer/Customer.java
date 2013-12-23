package crm.domain.customer;

import java.util.Date;
import java.util.List;

/**
 * 客户
 * @author <a mailto="hwangsyin@gmail.com">King</a>
 *
 */
public class Customer {
	/** System ID **/
	private Long id;
	/** 称呼 **/
	private String title;
	/** 电话 **/
	private List<Phone> phones;
	/** 姓名 **/
	private String name;
	/** 年龄 **/
	private Integer age;
	/** 电子邮件 **/
	private String email;
	/** 地址 **/
	private String address;
	/** 客户类型 **/
	private CustomerType type;
	/** 职务 **/
	private String position;
	/** 启用否 **/
	private String enable;
	/** 加入时间 **/
	private Date startTime;
	/** 退出时间 **/
	private Date endTime;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<Phone> getPhones() {
		return phones;
	}
	public void setPhones(List<Phone> phones) {
		this.phones = phones;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public CustomerType getType() {
		return type;
	}
	public void setType(CustomerType type) {
		this.type = type;
	}
	public String getEnable() {
		return enable;
	}
	public void setEnable(String enable) {
		this.enable = enable;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
}

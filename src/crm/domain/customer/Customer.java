package crm.domain.customer;

import java.util.Date;
import java.util.List;

/**
 * �ͻ�
 * @author <a mailto="hwangsyin@gmail.com">King</a>
 *
 */
public class Customer {
	/** System ID **/
	private Long id;
	/** �ƺ� **/
	private String title;
	/** �绰 **/
	private List<Phone> phones;
	/** ���� **/
	private String name;
	/** ���� **/
	private Integer age;
	/** �����ʼ� **/
	private String email;
	/** ��ַ **/
	private String address;
	/** �ͻ����� **/
	private CustomerType type;
	/** ְ�� **/
	private String position;
	/** ���÷� **/
	private String enable;
	/** ����ʱ�� **/
	private Date startTime;
	/** �˳�ʱ�� **/
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

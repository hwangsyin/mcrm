package crm.domain.customer;

import crm.domain.ContactType;

/**
 * �绰
 * @author <a mailto="hwangsyin@gmail.com">King</a>
 *
 */
public class Phone {
	/** System ID **/
	private Long id;
	/** �绰���� **/
	private String number;
	/** ��ϵ������ **/
	private ContactType type;
	/** ��ϵ��ID **/
	private String contactId;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public ContactType getType() {
		return type;
	}
	public void setType(ContactType type) {
		this.type = type;
	}
	public String getContactId() {
		return contactId;
	}
	public void setContactId(String contactId) {
		this.contactId = contactId;
	}
}

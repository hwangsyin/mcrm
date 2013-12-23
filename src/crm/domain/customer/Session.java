package crm.domain.customer;

import java.util.Date;

import crm.domain.user.User;

/**
 * �Ự
 * @author <a mailto="hwangsyin@gmail.com">King</a>
 *
 */
public class Session {
	/** System ID **/
	private String id;
	/** �Ự���� **/
	private String content;
	/** ��ʼʱ�� **/
	private Date startTime;
	/** ����ʱ�� **/
	private Date endTime;
	/** ��ͨ�ͻ� **/
	private Customer customer;
	/** ҵ����� **/
	private User agent;
	/** �Ự���� **/
	private SessionType type;
	/** ҵ���������λ�� **/
	private String agentPlace;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
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
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public User getAgent() {
		return agent;
	}
	public void setAgent(User agent) {
		this.agent = agent;
	}
	public SessionType getType() {
		return type;
	}
	public void setType(SessionType type) {
		this.type = type;
	}
	public String getAgentPlace() {
		return agentPlace;
	}
	public void setAgentPlace(String agentPlace) {
		this.agentPlace = agentPlace;
	}
}

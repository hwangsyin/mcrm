package crm.domain.customer;

import java.util.Date;

import crm.domain.user.User;

/**
 * 会话
 * @author <a mailto="hwangsyin@gmail.com">King</a>
 *
 */
public class Session {
	/** System ID **/
	private String id;
	/** 会话内容 **/
	private String content;
	/** 开始时间 **/
	private Date startTime;
	/** 结束时间 **/
	private Date endTime;
	/** 沟通客户 **/
	private Customer customer;
	/** 业务代表 **/
	private User agent;
	/** 会话类型 **/
	private SessionType type;
	/** 业务代表所在位置 **/
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

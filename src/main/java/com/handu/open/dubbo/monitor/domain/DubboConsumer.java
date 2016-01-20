package com.handu.open.dubbo.monitor.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Jinkai.Ma
 */
public class DubboConsumer implements Serializable {

	private static final long serialVersionUID = -1140894843784583237L;

	private String service; /* 消费者所引用的服务名称 */

	private String parameters;

	private String result; /* 路由结果 */

	private String address; /* 消费者地址 */

	private String registry; /* 消费者连接的注册中心地址 */

	private String application; /* 应用名 */

	private String username; /* 消费者用户名 */

	private String statistics; /* 服务调用统计信息 */

	private Date collected; /* 服务调用统计时间 */

	private Date expired; /* 过期时间 */

	private long alived; /* 存活时间，单位秒 */

	public DubboConsumer() {
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public String getParameters() {
		return parameters;
	}

	public void setParameters(String parameters) {
		this.parameters = parameters;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getRegistry() {
		return registry;
	}

	public void setRegistry(String registry) {
		this.registry = registry;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getStatistics() {
		return statistics;
	}

	public void setStatistics(String statistics) {
		this.statistics = statistics;
	}

	public Date getCollected() {
		return collected;
	}

	public void setCollected(Date collected) {
		this.collected = collected;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getApplication() {
		return application;
	}

	public void setApplication(String application) {
		this.application = application;
	}

	public Date getExpired() {
		return expired;
	}

	public void setExpired(Date expired) {
		this.expired = expired;
	}

	public long getAlived() {
		return alived;
	}

	public void setAlived(long alived) {
		this.alived = alived;
	}

	public String toString() {
		return "Consumer [service=" + service + ", parameters=" + parameters + ", result=" + result + ", address=" + address + ", registry=" + registry + ", application=" + application
				+ ", username=" + username + ", statistics=" + statistics + ", collected=" + collected + ", expired=" + expired + ", alived=" + alived + "]";
	}

}

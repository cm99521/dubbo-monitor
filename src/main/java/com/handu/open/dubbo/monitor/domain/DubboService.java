/**
 * Copyright 2006-2015 handu.com
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.handu.open.dubbo.monitor.domain;

import java.io.Serializable;
import java.util.List;

/**
 * DubboService
 *
 * @author Jinkai.Ma
 */
public class DubboService implements Serializable {

    private String name;
    private String application;
    private String organization;
    private String owner;
    private int providerCount;
    private int consumerCount;
    
    private List<DubboProvider> providers;
    public List<DubboProvider> getProviders() {
		return providers;
	}

	public void setProviders(List<DubboProvider> providers) {
		this.providers = providers;
	}

	public List<DubboConsumer> getConsumers() {
		return consumers;
	}

	public void setConsumers(List<DubboConsumer> consumers) {
		this.consumers = consumers;
	}

	private List<DubboConsumer> consumers;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getProviderCount() {
        return providerCount;
    }

    public void setProviderCount(int providerCount) {
        this.providerCount = providerCount;
    }

    public int getConsumerCount() {
        return consumerCount;
    }

    public void setConsumerCount(int consumerCount) {
        this.consumerCount = consumerCount;
    }
}

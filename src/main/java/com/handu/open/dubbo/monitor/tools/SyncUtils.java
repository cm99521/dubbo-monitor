package com.handu.open.dubbo.monitor.tools;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.dubbo.common.Constants;
import com.alibaba.dubbo.common.URL;
import com.handu.open.dubbo.monitor.domain.DubboConsumer;
import com.handu.open.dubbo.monitor.domain.DubboProvider;

/**
 * @author ding.lid
 */
public class SyncUtils {

	public static final String SERVICE_FILTER_KEY = ".service";

	public static final String ADDRESS_FILTER_KEY = ".address";

	public static final String ID_FILTER_KEY = ".id";

	public static DubboProvider url2Provider(URL url) {

		DubboProvider p = new DubboProvider();
		p.setService(url.getServiceKey());
		p.setAddress(url.getAddress());
		p.setApplication(url.getParameter(Constants.APPLICATION_KEY));
		p.setUrl(url.toIdentityString());
		p.setParameters(url.toParameterString());

		p.setDynamic(url.getParameter("dynamic", true));
		p.setEnabled(url.getParameter(Constants.ENABLED_KEY, true));
		p.setWeight(url.getParameter(Constants.WEIGHT_KEY, Constants.DEFAULT_WEIGHT));
		p.setUsername(url.getParameter("owner"));

		return p;
	}

	public static List<DubboProvider> url2Providers(List<URL> urls) {

		List<DubboProvider> result = new ArrayList<DubboProvider>();
		if (urls != null) {
			for (URL url : urls) {
				result.add(url2Provider(url));

			}
		}
		return result;
	}

	public static DubboConsumer url2Consumer(URL url) {
		DubboConsumer c = new DubboConsumer();
		c.setService(url.getServiceKey());
		c.setAddress(url.getHost());
		c.setApplication(url.getParameter(Constants.APPLICATION_KEY));
		c.setParameters(url.toParameterString());

		return c;
	}

	public static List<DubboConsumer> url2Consumers(List<URL> urls) {

		List<DubboConsumer> result = new ArrayList<DubboConsumer>();
		if (urls != null) {
			for (URL url : urls) {
				result.add(url2Consumer(url));

			}
		}
		return result;
	}

}

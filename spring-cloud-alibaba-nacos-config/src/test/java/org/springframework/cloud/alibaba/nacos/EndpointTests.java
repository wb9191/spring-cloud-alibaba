/*
 * Copyright (C) 2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.cloud.alibaba.nacos;

import org.junit.Test;
import org.springframework.cloud.alibaba.nacos.endpoint.NacosConfigEndpoint;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author pbting
 * @date 2019-01-17 2:25 PM
 */
public class EndpointTests extends NacosPowerMockitBaseTests {

	@Test
	public void nacosConfigEndpoint() {

		NacosConfigEndpoint nacosConfigEndpoint = super.context
				.getBean(NacosConfigEndpoint.class);
		assertThat(nacosConfigEndpoint != null).isEqualTo(true);
	}

	@Test
	public void endpointInvoke() {
		NacosConfigEndpoint nacosConfigEndpoint = this.context
				.getBean(NacosConfigEndpoint.class);
		assertThat(nacosConfigEndpoint.invoke() != null).isEqualTo(true);
	}
}
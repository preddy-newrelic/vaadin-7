package com.newrelic.fit.vaadin7;

import org.jsoup.nodes.Document;

import com.newrelic.api.agent.NewRelic;
import com.newrelic.api.agent.weaver.MatchType;
import com.newrelic.api.agent.weaver.Weave;
import com.newrelic.api.agent.weaver.Weaver;
import com.vaadin.server.BootstrapPageResponse;

//@Weave(originalName="com.vaadin.server.BootstrapHandler", type=MatchType.BaseClass)
public abstract class BootstrapHandler_Instrumentation {

	@SuppressWarnings("unused")
	private void setupStandaloneDocument(BootstrapContext_Instrumentation context,
            BootstrapPageResponse response) {
		Weaver.callOriginal();
		Document document = response.getDocument();
		document.head().append(NewRelic.getBrowserTimingHeader());
		document.body().append(NewRelic.getBrowserTimingFooter());
	}
}

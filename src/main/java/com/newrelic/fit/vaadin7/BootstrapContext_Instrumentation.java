package com.newrelic.fit.vaadin7;

import com.newrelic.api.agent.weaver.MatchType;
import com.newrelic.api.agent.weaver.Weave;

@Weave(originalName="com.vaadin.server.BootstrapHandler$BootstrapContext", type=MatchType.ExactClass)
public abstract class BootstrapContext_Instrumentation {

}

package com.newrelic.fit.vaadin7;

import com.newrelic.api.agent.weaver.Weave;
import com.newrelic.api.agent.weaver.Weaver;
import com.newrelic.api.agent.Trace;
import com.newrelic.api.agent.weaver.MatchType;

import com.vaadin.server.Page;
import com.vaadin.ui.Button.ClickEvent;

//@Weave(originalName="com.vaadin.ui.Button$ClickListener", type=MatchType.Interface)
public class ButtonClick_Instrumentation {

	@Trace(dispatcher=true)
	public void buttonClick(ClickEvent event) {
		String caption = event.getButton().getCaption();
		Page.getCurrent().getJavaScript().execute("var myInteraction = newrelic.interaction().setName('" + caption + "').save();");
		
		Weaver.callOriginal();

		Page.getCurrent().getJavaScript().execute("myInteraction.end()");
	}
}

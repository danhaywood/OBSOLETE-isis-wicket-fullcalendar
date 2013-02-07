package com.danhaywood.isis.wicket.ui.components.collectioncontents.fullcalendar;

import java.io.Serializable;

import net.ftlines.wicket.fullcalendar.CalendarResponse;
import net.ftlines.wicket.fullcalendar.Config;
import net.ftlines.wicket.fullcalendar.FullCalendar;
import net.ftlines.wicket.fullcalendar.callback.ClickedEvent;
import net.ftlines.wicket.fullcalendar.callback.DroppedEvent;
import net.ftlines.wicket.fullcalendar.callback.ResizedEvent;
import net.ftlines.wicket.fullcalendar.callback.SelectedRange;
import net.ftlines.wicket.fullcalendar.callback.View;

import org.apache.wicket.RestartResponseException;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.markup.html.panel.FeedbackPanel;
import org.apache.wicket.request.mapper.parameter.PageParameters;

import org.apache.isis.core.metamodel.adapter.ObjectAdapter;
import org.apache.isis.core.metamodel.adapter.oid.RootOid;
import org.apache.isis.core.metamodel.adapter.oid.RootOidDefault;
import org.apache.isis.core.runtime.system.context.IsisContext;
import org.apache.isis.viewer.wicket.model.models.EntityModel;
import org.apache.isis.viewer.wicket.ui.pages.entity.EntityPage;

final class FullCalendarWithEventHandling extends FullCalendar {
    @SuppressWarnings("unused")
	private final FeedbackPanel feedback;
    private static final long serialVersionUID = 1L;

    FullCalendarWithEventHandling(String id, Config config, FeedbackPanel feedback) {
        super(id, config);
        this.feedback = feedback;
    }

    @Override
    protected void onEventClicked(ClickedEvent event,
            CalendarResponse response) {

        final String oidStr = (String) event.getEvent().getPayload();
        final RootOid oid = RootOidDefault.deString(oidStr, IsisContext.getOidMarshaller());
        final ObjectAdapter adapter = IsisContext.getPersistenceSession().getAdapterManager().adapterFor(oid);
        final PageParameters params = new EntityModel(adapter).asPageParameters();
        throw new RestartResponseException(EntityPage.class, params);
    }

}
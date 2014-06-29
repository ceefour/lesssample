package com.hendyirawan.lesssample;

import org.apache.wicket.markup.head.CssHeaderItem;
import org.apache.wicket.markup.head.IHeaderResponse;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.request.mapper.parameter.PageParameters;

import de.agilecoders.wicket.less.LessResourceReference;

public class HomePage extends WebPage {
	private static final long serialVersionUID = 1L;
	
	@Override
	public void renderHead(IHeaderResponse response) {
		super.renderHead(response);
		response.render(CssHeaderItem.forReference(new LessResourceReference(HomePage.class, "root-working.less")));
		response.render(CssHeaderItem.forReference(new LessResourceReference(HomePage.class, "root-notworking.less")));
		response.render(CssHeaderItem.forReference(new LessResourceReference(HomePage.class, "root-classpathrel.less")));
		response.render(CssHeaderItem.forReference(new LessResourceReference(HomePage.class, "root-classpathabs.less")));
	}

	public HomePage(final PageParameters parameters) {
		super(parameters);

		add(new Label("version", getApplication().getFrameworkSettings().getVersion()));

		// TODO Add your page's components here

    }
}

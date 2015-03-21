package org.gyt.localization.listresource;

import java.util.*;

//default US English version
public class ResBundle_en_US extends ListResourceBundle {
	public Object[][] getContents() {
		return contents;
	}

	static final Object[][] contents = { { "MovieName", "Avatar" },
			{ "GrossRevenue", (Long) 2782275172L }, // in US dollars
			{ "Year", (Integer) 2009 } };
}
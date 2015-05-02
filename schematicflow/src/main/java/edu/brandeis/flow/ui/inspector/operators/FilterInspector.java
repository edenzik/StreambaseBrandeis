package edu.brandeis.flow.ui.inspector.operators;

import edu.brandeis.flow.ui.inspector.FilterPropertyTab;
import edu.brandeis.flow.ui.inspector.Inspector;
import edu.brandeis.flow.ui.inspector.PropertyTab;
import edu.brandeis.flow.ui.operator.UIOperator;

public final class FilterInspector extends Inspector {
	public FilterInspector(UIOperator op) {
		super(op);
		PropertyTab properties = new FilterPropertyTab();
		this.tabs.setProperties(properties);
		this.tabs.setTabs();
		
	}

}

package com.ur.urcap.examples.nodeordering.impl.open;

import com.ur.urcap.api.contribution.ProgramNodeConfiguration;
import com.ur.urcap.api.contribution.ProgramNodeContribution;
import com.ur.urcap.api.contribution.ProgramNodeService;
import com.ur.urcap.api.contribution.ProgramNodeServiceConfigurable;
import com.ur.urcap.api.domain.URCapAPI;
import com.ur.urcap.api.domain.data.DataModel;

import java.io.InputStream;

public class OpenProgramNodeService implements ProgramNodeService, ProgramNodeServiceConfigurable {

	private final double DISPLAY_ORDER_ID = 1;

	@Override
	public String getId() {
		return "Open";
	}

	@Override
	public boolean isDeprecated() {
		return false;
	}

	@Override
	public boolean isChildrenAllowed() {
		return false;
	}

	@Override
	public String getTitle() {
		return "Open";
	}

	@Override
	public InputStream getHTML() {
		return this.getClass().getResourceAsStream("/com/ur/urcap/examples/nodeordering/impl/NodeOrderingProgramNode.html");
	}

	@Override
	public ProgramNodeContribution createNode(URCapAPI api, DataModel model) {
		return new OpenProgramNodeContribution(DISPLAY_ORDER_ID);
	}

	@Override
	public void configureContribution(ProgramNodeConfiguration programNodeConfiguration) {
		programNodeConfiguration.setDisplayOrderId(DISPLAY_ORDER_ID);
	}
}

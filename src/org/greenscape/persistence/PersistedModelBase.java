package org.greenscape.persistence;

import java.util.Date;

public class PersistedModelBase extends DocumentModelBase implements PersistedModel {

	private static final long serialVersionUID = 8837071132135265946L;

	public PersistedModelBase() {
		super();
	}

	@Override
	public Date getCreateDate() {
		return (Date) getProperty(CREATE_DATE);
	}

	@Override
	public Date getModifiedDate() {
		return (Date) getProperty(MODIFIED_DATE);
	}

	@Override
	public void setCreateDate(Date date) {
		setProperty(CREATE_DATE, date);
	}

	@Override
	public void setModifiedDate(Date date) {
		setProperty(MODIFIED_DATE, date);
	}
}

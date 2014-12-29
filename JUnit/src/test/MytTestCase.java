package test;

import java.util.Vector;

import junit.framework.TestCase;

public class MytTestCase extends TestCase {

	private Vector container;

	public MytTestCase() {
		// TODO Auto-generated constructor stub
	}

	public MytTestCase(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		container= new Vector();
	}

	@Override
	protected void tearDown() throws Exception {
		// TODO Auto-generated method stub
		super.tearDown();
	}

	public Vector getContainer() {
		return container;
	}

	public void setContainer(Vector container) {
		this.container = container;
	}

}

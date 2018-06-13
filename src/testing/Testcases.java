package testing;

import org.testng.AssertJUnit;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class Testcases extends Base {

	@Test(priority = 1)
	public void One() {
		AssertJUnit.fail();
	}

	@Test(priority = 2)
	public void Two() {

	}

	@Test(priority = 5, enabled = true)
	public void Five() {
		throw new SkipException("a");
	}

	@Test(priority = 3)
	public void Three() {
		AssertJUnit.fail();
	}

	@Test(priority = 4)
	public void Four() {
	}

	@Test(priority = 2)
	public void Six() {

	}

	@Test(priority = 5, enabled = true)
	public void Seven() {
	throw new SkipException("a");
	}

	@Test(priority = 3)
	public void Eight() {
		AssertJUnit.fail();
	}

	@Test(priority = 4)
	public void Nine() {
	}

}

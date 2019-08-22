package org.gradle;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.scratchframework.testscripts.TestBaseClass;
import com.scratchframework.utils.Log;

public class PersonTest extends TestBaseClass {

	@Test
	void webPageWithValidTitle() throws Exception {

		driver.get("https://www.google.com");
		assertEquals("Google", driver.getTitle().trim());
		Log.log("Done", driver);

	}

}

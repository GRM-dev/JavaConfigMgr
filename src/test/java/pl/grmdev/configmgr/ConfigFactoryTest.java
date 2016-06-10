package pl.grmdev.configmgr;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.fail;

import org.junit.Test;

import pl.grmdev.configmgr.exceptions.ConfigFactoryInitializationException;
import pl.grmdev.configmgr.factory.FileConfigFactorySettings;

public class ConfigFactoryTest {

	@Test
	public void testConfigFactoryCreateNewManager() {
		Config cfg;
		try {
			cfg = ConfigFactory.CreateNewConfigManager(new FileConfigFactorySettings());
			assertThat(cfg).isNotNull().isInstanceOf(ConfigImpl.class);
		}
		catch (ConfigFactoryInitializationException e) {
			fail(e.getMessage());
		}
		try {
			cfg = ConfigFactory.CreateNewConfigManager(null);
			fail("That line shouldn't execute!");
		}
		catch (ConfigFactoryInitializationException e) {}
	}

	@Test
	public void testCreateNewDefaultConfigManager() {
		Config config = ConfigFactory.CreateNewDefaultConfigManager();
		assertThat(config).isNotNull();
	}
	
}

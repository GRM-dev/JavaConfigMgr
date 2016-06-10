package pl.grmdev.configmgr;

import org.ini4j.Ini;

import pl.grmdev.configmgr.exceptions.ConfigFactoryInitializationException;
import pl.grmdev.configmgr.factory.ConfigFactorySettings;
import pl.grmdev.configmgr.factory.FileConfigFactorySettings;

public final class ConfigFactory {

	public static Config CreateNewDefaultConfigManager() {
		ConfigFactorySettings settings = new FileConfigFactorySettings();
		return new ConfigImpl(settings);
	}
	
	public static Config CreateNewConfigManager(ConfigFactorySettings settings) throws ConfigFactoryInitializationException {
		if (settings == null) { throw new ConfigFactoryInitializationException("Settings cannot be null! If wanna use default config settings use CreateNewDefaultConfigManager() method"); }
		return new ConfigImpl(settings);
	}
	
	public static Config CreateNewConfigManagerInIniFile(Ini ini, FileConfigFactorySettings settings) {
		ConfigImpl c = new ConfigImpl(settings);
		c.getFileSaveLocations().addFile(ini);
		return c;
	}
}

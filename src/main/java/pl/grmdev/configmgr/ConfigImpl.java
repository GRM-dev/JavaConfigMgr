package pl.grmdev.configmgr;

import pl.grmdev.configmgr.factory.ConfigFactorySettings;
import pl.grmdev.configmgr.storage.SaveLocations;

final class ConfigImpl implements Config {
	private SaveLocations saveLocations;
		
	ConfigImpl(ConfigFactorySettings settings) {
		saveLocations = new SaveLocations();
		
	}
	
	public SaveLocations getFileSaveLocations() {
		return saveLocations.getFiles();
	}
	
}

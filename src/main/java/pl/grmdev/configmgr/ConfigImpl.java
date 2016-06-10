package pl.grmdev.configmgr;

import java.util.HashMap;

import com.google.common.collect.HashMultimap;

import pl.grmdev.configmgr.factory.ConfigFactorySettings;
import pl.grmdev.configmgr.storage.FileSaveLocation;
import pl.grmdev.configmgr.storage.SaveLocation;
import pl.grmdev.configmgr.storage.SaveLocationType;

final class ConfigImpl implements Config {
	private HashMultimap<SaveLocationType, SaveLocation> storageLocations;
		
	ConfigImpl(ConfigFactorySettings settings) {
		storageLocations = HashMultimap.<SaveLocationType, SaveLocation> create();
		
	}
	
	public HashMap<String, FileSaveLocation> getFileSaveLocations() {
		
		return null;
	}
	
}

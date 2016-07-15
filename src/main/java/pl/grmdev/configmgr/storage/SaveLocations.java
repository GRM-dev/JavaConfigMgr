package pl.grmdev.configmgr.storage;

import com.google.common.collect.HashMultimap;

public class SaveLocations {
	private HashMultimap<SaveLocationType, SaveLocation> storageLocations;
	
	public SaveLocations() {
		storageLocations = HashMultimap.<SaveLocationType, SaveLocation> create();
	}
	
	public SaveLocations getFiles() {
		// TODO Auto-generated method stub
		return null;
	}
	
}

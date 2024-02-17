package composition;

import java.util.HashMap;
public class Folder {
	private String folderName;
	private HashMap<String, Folder> subFolderMap = new HashMap<String, Folder>();
	private HashMap<String, File> fileMap = new HashMap<String, File>();
	
	public Folder(String folderName) {
		this.folderName = folderName;
	}
	
	public String getFolderName() {
		return folderName;
	}
	
	public HashMap<String, Folder> getSubFolderMap(){
		return subFolderMap;
	}
	public HashMap<String, File> getFileMap(){
		return fileMap;
	}
	
	public void setFolderName(String updatedFolderName) {
		this.folderName = updatedFolderName;
	}
	public void setSubFolderMap(HashMap<String, Folder> updatedSubFolderMap) {
		this.subFolderMap = updatedSubFolderMap;
	}
	public void setFileMap(HashMap<String, File> updatedFileMap) {
		this.fileMap = updatedFileMap;
	}
	public void addSubFolder(Folder newFolder) {
		String key = handleDuplicates(newFolder.getFolderName(), this.subFolderMap);
		newFolder.setFolderName(key);
		subFolderMap.put(key, newFolder);	
	}
	private <K, V> String handleDuplicates(String key, HashMap<K, V> testMap) {
		int numOfDuplicates = 1;
		while(testMap.containsKey(key)) {
			key = key + "(" + numOfDuplicates + ")";
			numOfDuplicates++;
		}
		return key;	
	}
	public void addFile(File newFile) {
		String key = handleDuplicates(newFile.getFileName(), this.fileMap);
		fileMap.put(key, newFile);
	}
	public void printFolderHeirarchy() {
		System.out.println(this.folderName);
		
		
		this.subFolderMap.forEach((String, Folder) -> {
			
			printSubFolder(Folder);
		}
		
				);
		
	}
	public void printSubFolder(Folder subFolder) {
		System.out.print("   ");
		System.out.println(subFolder.getFolderName());
		subFolder.subFolderMap.forEach((String, Folder) -> {
			System.out.print("   ");
			printSubFolder(Folder);
		});
		
		printFiles(subFolder.getFileMap());
		
	}
	public void printFiles(HashMap<String, File> fileMap) {
		fileMap.forEach((String, File) -> {
			System.out.println("         " + File.getFileName());
		});
	}
	// removes from both maps, so user does not have to specify member type
	public void removeMember(String memberName) {
		Folder removedKey = this.subFolderMap.remove(memberName);
		if (removedKey == null) 
			this.fileMap.remove(memberName);
		
	}
	
	// ensures that members have the correct key in hashmap
	public <K, V> void verifyIntegrity(HashMap<K, V> testMap) {
		this.subFolderMap.forEach((String, Folder) -> {
			if (String != Folder.getFolderName()) {
				subFolderMap.put(Folder.getFolderName(), Folder);
				subFolderMap.remove(String);
			}
		});
		this.fileMap.forEach((String, Folder) -> {
			if (String != Folder.getFileName()) {
				fileMap.put(Folder.getFileName(), Folder);
				fileMap.remove(String);
			}
		});
		
	}
}

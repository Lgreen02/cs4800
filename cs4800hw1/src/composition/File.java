package composition;

public class File {
	private String fileName;
	
	public File(String fileName) {
		this.fileName = fileName;
	}
	
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String updatedFileName) {
		this.fileName = updatedFileName;
	}
}

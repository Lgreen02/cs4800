package composition;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Folder demo1 = new Folder("demo_1");
		Folder sourceFiles = new Folder("Source_Files");
		Folder phalcon = new Folder(".phalcon");
		Folder app = new Folder("app");
		Folder config = new Folder("config");
		Folder controllers = new Folder ("controllers");
		Folder library = new Folder("library");
		Folder migrations = new Folder("migration");
		Folder models = new Folder("models");
		Folder views = new Folder("views");
		Folder cache = new Folder("cache");
		Folder pub = new Folder("public");
		Folder includePath = new Folder("include_path");
		Folder remoteFiles = new Folder("remote_files");
		File htaccess = new File(".htaccess");
		File htrouter = new File(".htrouter.php");
		File index = new File("index.html");
		
		demo1.addSubFolder(sourceFiles);
		demo1.addSubFolder(includePath);
		demo1.addSubFolder(remoteFiles);
		
		sourceFiles.addSubFolder(phalcon);
		sourceFiles.addSubFolder(app);
		sourceFiles.addSubFolder(cache);
		sourceFiles.addSubFolder(pub);

		app.addSubFolder(config);
		app.addSubFolder(controllers);
		app.addSubFolder(library);
		app.addSubFolder(migrations);
		app.addSubFolder(models);
		app.addSubFolder(views);
		
		pub.addFile(htaccess);
		pub.addFile(htrouter);
		pub.addFile(index);
		demo1.printFolderHeirarchy();
		
		sourceFiles.removeMember("app");
		
		System.out.println("\n");
		demo1.printFolderHeirarchy();
		
		sourceFiles.removeMember("public");
		
		System.out.println("\n");
		demo1.printFolderHeirarchy();
		
		
		
	}

}

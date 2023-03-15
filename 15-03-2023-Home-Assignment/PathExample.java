package String;

public class PathExample {
 
	    public static void main(String[] args) {
	        String filePath = "C:\\IBM\\DB2\\PROGRAM\\DB2COPY1.EXE";
	        System.out.println("Original file path: " + filePath);

	        String[] folders = filePath.split("\\\\");
	        String drive = folders[0] + ":\\";
	        StringBuilder folderNames = new StringBuilder();
	        for (int i = 1; i < folders.length - 1; i++) {
	            folderNames.append(folders[i]).append(" || ");
	        }
	        String file = folders[folders.length - 1];

	        System.out.println("Drive: " + drive);
	        System.out.println("Folders: " + folderNames.toString().substring(0, folderNames.length() - 4));
	        System.out.println("File: " + file);
	    }
	}



/**
 * 
 */
package dataStruct;

/**
 * @author GGY
 *
 */
public class FileNode {
	
	String fileName;
	FileNode next;
	FileNode previous;

	/**
	 * 
	 */
	public FileNode(String fileName,FileNode next,FileNode previous) {
		// TODO Auto-generated constructor stub
		this.fileName = fileName;
		this.next = next;
		this.previous = previous;
	}

}

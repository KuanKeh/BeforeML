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
		this.fileName = fileName;
		this.next = next;
		this.previous = previous;
	}

}

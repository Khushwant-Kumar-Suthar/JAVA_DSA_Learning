/**@author Khushwant Kumar Suthar
 * @version 2.0
 * @since 2025
 *
 **/
// go tools and select generate javadoc and select specific folder for generating java document
package JAVA_DSA_Learning.JavaDocPack;

/**@author Khushwant Kumar Suthar
 * class for book
 */
public class Book {
    
    static int quntity = 10;
    String name ;

    /**
     *
     * @param name book name
     */
    public Book(String name){
        this.name = name ;
    }

    /**
     * Issue a Book to student
     * @param name this a book name
     * @param roll this is student roll number
     * @throws Exception if book not available
     */
    public void issue(String name , int roll) throws Exception{

    }

    /**
     *
     * @return name of book
     */
    public String getBooKName(){
        return name;
    }
}

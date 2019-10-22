import bluej.extensions.*;
import bluej.extensions.event.*;
import java.net.URL;
/**
 * 
 * TODO: Implement custom extension tool/s
 * 
 * Write a description of class ExtensionTool here.
 *
 * 
 * @author CodeBenders3250
 * @version version 1 (10.22.19)
 */

public class ExtensionTool extends Extension implements PackageListener  {
    /**
    * Constructor for objects of class ExtensionTool
    */
    public ExtensionTool()
    {
      
    }
    /*
     * When this method is called, the extension may start its work.
     */
    public void startup(BlueJ bluej)
    {
        
        // Listen for BlueJ events at the "package" level
        bluej.addPackageListener(this);
    }

    /*
     * A package has been opened. Print the name of the project it is part of.
     * System.out is redirected to the BlueJ debug log file.
     * The location of this file is given in the Help/About BlueJ dialog box.
     */
    public void packageOpened(PackageEvent ev)
    {
        try
        {
            System.out.println("Project " + ev.getPackage().getProject().getName() 
                               + " opened.");
        }
        catch (ExtensionException e)
        {
            System.out.println("Project closed by BlueJ");
        }
    } 
               
    /*
     * A package is closing.
     */
    public void packageClosing(PackageEvent ev)
    {
    } 
               
    /*
     * This method must decide if this Extension is compatible with the                
     * current release of the BlueJ Extensions API
     */
    public boolean isCompatible()
    { 
        return true; 
    }

    /*
     * Returns the version number of this extension
     */
    public String getVersion ()
    { 
        return ("2019.10"); 
    }

    /*
     * Returns the user-visible name of this extension
     */
    public String getName ()
    { 
        return ("<extension_name>"); 
    }

    public void terminate()
    {
        System.out.println ("<extension_name> terminates");
    }
               
    public String getDescription ()
    {
        return ("<extension_description>");
    }

    /*
     * Returns a URL where you can find info on this extension.
     * The real problem is making sure that the link will still be alive 
     * in three years...
     */
    public URL getURL ()
    {
        try
        {
            return new URL("<extension_url>");
        }
        catch (Exception e )
        {
            // The link is either dead or otherwise unreachable
            System.out.println ("<extension_name>: getURL: Exception="+e.getMessage());
            return null;
        }
    }
    public static void main(String[] args) {
       

    }

}

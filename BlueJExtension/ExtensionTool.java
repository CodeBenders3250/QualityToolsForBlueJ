import bluej.extensions.*;
import bluej.extensions.event.*;
import java.net.URL;
import bluej.extensions.editor.*;



import java.net.URL;
import javax.swing.*;
import java.awt.event.*;
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
     * Determine if extension works with current BlueJ Extensions API.
     * 
     */
    public boolean isCompatible()
    { 
        return true; 
    }
    
    /*
     * Return the extension version.
     */
    public String getVersion ()
    { 
        return ("20191103"); 
    }

    /*
     * Return the name of the extension to the user.
     */
    public String getName ()
    { 
        return ("Extension_CodeBenders3250"); 
    }
    /**
     * Close extension.
     */
    public void terminate()
    {
        System.out.println ("Extension_CodeBenders3250 terminates");
    }
    
    /**
     * Return description of what the extension does.
     */
    public String getDescription ()
    {
        return ("Extension_CodeBenders3250 adds CheckStyle functionality.");
    }

   /**
    * Return the URL of Github page containing additional info
    * on this extenions functionality.
    */
    public URL getURL ()
    {
        try
        {
            return new URL(
            "https://github.com/CodeBenders3250/QualityToolsForBlueJ");
        }
        catch (Exception e )
        {
            // Error message for URL link not working...
            System.out.println ("ExtensionTool: getURL: Exception = "+
                                e.getMessage());
            return null;
        }
    }

}
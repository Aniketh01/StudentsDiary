/**
 * @author 2017 Aniketh Girish anikethgireesh@gmail.com
 * 
 * Debugger class allows you to create debug messages and logs in order to 
 * keep a track of the debugging conditions as well as this helps the project manager 
 * to debug the whole project easier with debug messages rather than breakpoints.
 * 
 * Example of the usage: 
 * 
 *     if (Debugger.isEnabled()) {
    		Debugger.log("message here");
        }
 */

package org.amrita.u4cse16209.StudentsDiary;

public class Debugger{
    public static boolean isEnabled(){
        return true;
    }

    public static void log(Object o){
        System.out.println(o.toString());
    }
}
package edu.uiowa.cs.baberman.kcmjedit;



import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import org.gjt.sp.jedit.Buffer;
import org.gjt.sp.jedit.EBMessage;
import org.gjt.sp.jedit.EBPlugin;
import org.gjt.sp.jedit.Macros;
import org.gjt.sp.jedit.View;
import org.gjt.sp.jedit.gui.DockableWindowManager;
import org.gjt.sp.jedit.jEdit;
import org.gjt.sp.jedit.msg.BufferChanging;
import org.gjt.sp.jedit.msg.EditPaneUpdate;
import org.gjt.sp.jedit.msg.ViewUpdate;
import org.gjt.sp.jedit.textarea.JEditTextArea;
import org.gjt.sp.jedit.textarea.TextArea;

/**
 *
 * @author Benjamin Berman
 */
public class KCMjEditPlugin extends EBPlugin {

	public static String NAME = "KCMjEditPlugin";
	public static String AUTHOR = "Benjamin Berman";
	public static String VERSION = "0.0.1";
	public static String OPTION_PREFIX = "options.kcmjeditplugin.";
	private static KCMjEditPlugin INSTANCE;

	@Override
	public void start() {
		INSTANCE = this;
                
//                Macros.message(jEdit.getActiveView(),
//                        "KCMjEditPlugin start() method called");
	}
	
	@Override
	public void stop() {
//               Macros.message(jEdit.getActiveView(),
//                        "KCMjEditPlugin stop() method called");
	}

	public static KCMjEditPlugin getInstance() {
		return INSTANCE;
	}
	
//        public static void test() {
//            Macros.message(jEdit.getActiveView(),
//                    "KCMjEditPlugin test() method called");
//        }

}

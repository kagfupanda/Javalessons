import java.util.Scanner;

import com.google.cloud.translate.*;
import com.googlecode.objectify.impl.translate.Translator;
public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}
	
	private static String translateText(String text) {
		Translate translate = TranslateOptions.getDefaultInstance().getService();
		Translation translation = translate.translate(text);
		return translation.getTranslatedText();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                 Frame frame = new Frame();
                 frame.setVisible(true);
            }
      });
	}

}

package sid;
import com.google.cloud.translate.*;


public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Translate translate = TranslateOptions.getDefaultInstance().getService();

		Translation translation = translate.translate("¡Hola Mundo!");
		System.out.printf("Translated Text:\n\t%s\n", translation.getTranslatedText());
	}

}

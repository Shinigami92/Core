package examples.Android;
import com.jemge.targets.Android.JStart;

public class Start extends JStart {
	/* Start Class only for Android */
	public Start() {
		main(new AndroidExample()); // as such 'public static void main' on Desktop
	}
}
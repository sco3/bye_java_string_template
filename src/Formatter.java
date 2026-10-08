import static java.util.FormatProcessor.FMT;
import static java.lang.System.out;

public class Formatter {
	public static void main(String[] argv) {
		var a = Formatter.class;
		out.println (FMT."Hi %s\{a}");
		out.println ("Hi %s".formatted(a));

	}
}

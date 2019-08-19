package apim.github.tutorial;

import java.io.IOException;

import org.springframework.stereotype.Component;

@Component
public class InstrumentalistAnnot {

	public void sing() {
		System.out.println("--- Singing with instrument ---");
	}

	public Integer perform() {
		System.out.println("--- This is 75th performance ---");
		return new Integer(75);
	}

	public void play() throws IOException {
		System.out.println("--- Unable to play, throwing exception ---");
		throw new IOException("Instrument error");
	}

	public void conduct() {
		System.out.println("--- Conducting helpers ---");
	}

}

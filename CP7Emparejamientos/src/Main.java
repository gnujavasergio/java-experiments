import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> emparejamiento = new ArrayList<>();
		List<String> equipos = new ArrayList<>();
		equipos.add("Argentina");
		equipos.add("Bolivia");
		equipos.add("Chile");
		equipos.add("Peru");
		equipos.add("Brasil");
		equipos.add("Colombia");
		equipos.add("Ecuador");
		equipos.add("Uruguay");
		equipos.add("Paraguay");
		equipos.add("Venezuela");

		emparejarEquipos(equipos, emparejamiento);

		for (int i = 0; i < emparejamiento.size(); i += 2) {
			System.out.println(emparejamiento.get(i) + " - " + emparejamiento.get(i + 1));
		}
	}

	public static void emparejarEquipos(List<String> equipos, List<String> emparejamiento) {
		int index = 0;
		while (!equipos.isEmpty()) {
			index = (int) Math.round(Math.random() * (equipos.size() - 1));
			emparejamiento.add(equipos.get(index));
			equipos.remove(index);
		}
	}

}

import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;

public class ListaButtons {

	private List<JButton> buttons;
	
	public ListaButtons() {
		buttons = new ArrayList<>();
	}
	
	public boolean addButton(JButton btn) {
		return btn != null ? buttons.add(btn): false;
	}
}

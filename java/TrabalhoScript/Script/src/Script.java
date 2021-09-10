import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Script extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static JTextField av1;
	static JTextField av2;
	static JTextField av3;
	static JTextField av4;
	
	public static void main(String[] args) throws IOException {
		Path path = Paths.get(new File("").getAbsolutePath() +  "\\src\\scriptNota\\scriptNotas.txt");
		ScriptEngine graalEngine = new ScriptEngineManager().getEngineByName("Graal.js");
		JFrame janela = new JFrame("Nota");
	
		
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel container = new JPanel();
		container.setLayout(new BoxLayout(container,BoxLayout.Y_AXIS));
		janela.setLocationRelativeTo(null);
		
		container.add(new JLabel("AV1"));
		av1 = new JTextField();
		container.add(av1);
		
		container.add(new JLabel("AV2"));
		av2 = new JTextField();
		container.add(av2);
		
		
		JButton button = new JButton("Nota final");
		
		container.add(new JLabel("Nota Final"));
		av4 = new JTextField();
		av4.setEditable(false);;
		container.add(av4);
		button.addActionListener(e -> {
			try {
				BufferedReader reader = Files.newBufferedReader(path);
				graalEngine.put("av1", Float.parseFloat(av1.getText()));
				graalEngine.put("av2", Float.parseFloat(av2.getText()));
				av4.setText(graalEngine.eval(reader).toString());
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (ScriptException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		container.add(button);
		
		
		
		janela.add(container);
		janela.pack();
		janela.setVisible(true);

	}
	

}

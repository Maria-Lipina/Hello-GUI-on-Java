import javax.swing.*;
import java.util.regex.Pattern;

  /**
   * Интерфейс для общения с пользователем, а так же обработка входных и выходных данных
   */
public class JFrameUI extends JFrame {
private JButton btn = new JButton("Начать");

  public JFrameUI() {
    super("Two Sum"); // Заголовок формы
    this.setBounds(0, 0, 400, 200); // Положение и размеры формы
    this.setLocationRelativeTo(null); // *центр экрана
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // *реакция после закрытия
    this.getContentPane().add(btn);

    btn.addActionListener((e) -> {
      String userInput = 
      JOptionPane.showInputDialog("Введите несколько чисел через пробел");
      int inputTarget = 
        Integer.parseInt(
          JOptionPane.showInputDialog("Введите, для какого числа нужно найти индексы слагаемых в данном массиве:\n" + userInput)
          );
      int [] inputArray = parse (userInput);
      String result = parseBack(TwoSum.findSummonds(inputArray, inputTarget));
      JOptionPane.showMessageDialog(this, result);
    });

  }

  private static int [] parse(String userInput) {
    String [] parsed = Pattern.compile(" ").split(userInput);
    int [] inputArray = new int [parsed.length];
      for (int i = 0; i < inputArray.length; i++) {
          inputArray[i] = Integer.parseInt(parsed[i]);
      }
    return inputArray;
  }

  private static String parseBack(int[] logicResult) {
    return String.format("[%d, %d]", logicResult[0], logicResult[1]);
  }

}


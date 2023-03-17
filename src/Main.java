/*

Для начала сделайте следующее :
1)программу с окном чатбота, который отвечает на вписанные реплики по наличию ключевых слов
Например если вы пишите ему что-то содержащее "привет", он отвечает привет
И ещё несколько вариантов придумайте
2) условную галагу - сверху падают метеориты, снизу игрок, на клавиши влево вправо двигается, на пробел стреляет
Выстрелы уничтожают метеориты
3) мышкой кликаем по человечкам, потом по пространству экрана, они при этом двигаются
Двигаются по разному, реализовать несколько классов разных человечков, через наследование

 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    JPanel info_panel;
    JPanel items_panel;

    Main(){
        super("Title");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setSize(510, 300);
        setLayout(null);
        //setBackground(Color.gray);

        info_panel = new JPanel();
        info_panel.setLayout(null);
        info_panel.setBounds(0,50,510, 200);
        add(info_panel);


        JLabel logo = new JLabel(new ImageIcon("logo.png"));
        logo.setBounds( 50, 50, 350, 200);
        info_panel.add(logo);

        JTextArea dialog_frame = new JTextArea();
        dialog_frame.setText("OOO Baha Sells");
        dialog_frame.setBounds(20, 20, 460, 200);
        dialog_frame.setBackground(new Color(200, 200, 200));
        dialog_frame.setEditable(false);
        info_panel.add(dialog_frame);


        JButton button = new JButton("Click me");
        button.setBounds(420, 20, 60, 30);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                info_panel.setVisible(!info_panel.isVisible());
            }
        });

        add(button);

        info_panel.setVisible(false);

        items_panel = new JPanel();
        items_panel.setLayout(null);
        items_panel.setBounds(0,50,510, 200);
        add(items_panel);

        JTable table = new JTable(5, 10);
        table.setBounds(0, 0, 510, 200);
        items_panel.add(table);



        // JTextArea - область с текстом, то есть текстовое окно
        // JTextField - поле ввода текста, то есть текстовое поле


/*
        JTextField input_line = new JTextField();
        input_line.setBounds(20, 220, 400, 30);
        add(input_line);

        Controller controller = new Controller(input_line, dialog_frame, this);
        button.addActionListener(controller);
        input_line.addActionListener(controller);
*/
        setVisible(true);
    }

    public static void main(String [] args){
        Main app = new Main();


    }

}

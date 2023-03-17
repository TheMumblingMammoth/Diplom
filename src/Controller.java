import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Controller implements ActionListener {
    JTextField input_line;
    JTextArea output_area;
    JFrame frame;

    Controller(JTextField input_line, JTextArea output_area, JFrame frame){
        this.input_line = input_line;
        this.output_area = output_area;
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = input_line.getText();
        input_line.setText("");
        output_area.setText(output_area.getText() + "\n" +  command);
        String response;

        if(command.contains("Hello"))
            response = "Hi!";
        else
            if(command.contains("How are you"))
                response = "I'm fine";
            else
                response = "I don't understand";

        // Down 10

        if(command.startsWith("Down")){
            String[] args =  command.split(" ");
            if(args.length > 1){
                int d = 0;
                d = Integer.parseInt(args[1]);
                frame.setLocation(frame.getX(), frame.getY() + d);
            }
        }
/*
        switch (command){
            case "Hi":
            case "Hello":
                response = "Hi!";
                break;
            case "How are you?":
                response = "I'm fine";
                break;
            default:
                response = "I don't understand ☺!";
                break;
        }*/
        output_area.setText(output_area.getText() + "\n >>>" +  response);
    }

}

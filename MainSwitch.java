import javax.swing.*;
import java.awt.*;



public class MainSwitch extends JFrame{
    private Observable observable;
    private Controller controller;

    MainSwitch(Observable observable){
        this.observable = observable;
        setSize(400,350);
        setTitle("Switch");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);
        JButton conditionBtn = new JButton();
        conditionBtn.setText("ON");
        conditionBtn.setFont(new Font("",1,50));
        conditionBtn.setBounds(80,110,250,60);
        add(conditionBtn);

        conditionBtn.addActionListener(evt->{
            if (conditionBtn.getText().equals("ON")){
                conditionBtn.setText("OFF");
                observable.setCondition(true);

            }else{
                conditionBtn.setText("ON");
                observable.setCondition(false);
            }
        });

        JButton settingsButton = new JButton();
        settingsButton.setText("Settings");
        settingsButton.setFont(new Font("",1,20));
        settingsButton.setBounds(100,170,220,60);
        add(settingsButton);

        settingsButton.addActionListener(evt->{
            if(controller == null) {
                controller = new Controller(observable);
            }
            controller.setVisible(true);

        });
    }
}
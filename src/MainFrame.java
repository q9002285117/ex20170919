import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainFrame extends Frame {
    private Button eb=new Button("EXIT");
    public MainFrame(){
    init();
}
private void init(){
//    this.setLocation(100,200);
//    this.setSize(50,100);
    this.setBounds(100,200,350,200);
    this.setLayout(null);
    eb.setBounds(130,100,80,30);
    this.add(eb);
    this.addWindowListener(new WindowAdapter() {
        @Override
        public void windowClosing(WindowEvent windowEvent) {
            System.exit(0);
        }
    });
    eb.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            System.exit(0);
        }
    });
}
}

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainFrame extends Frame {
    private Button btnexit=new Button("EXIT");
    private Button btnadd=new Button("ADD");
    private Label lab=new Label("0");
    private int n=0;
    public MainFrame(){
    init();
}
private void init(){
//    this.setLocation(100,200);
//    this.setSize(50,100);
    this.setBounds(100,200,350,200);
    this.setLayout(null);
    btnexit.setBounds(130,100,80,30);
    btnadd.setBounds(130,70,80,30);
    lab.setBounds(160,130,80,30);
    btnexit.setBackground(new Color(252, 182, 255));
    this.add(btnexit);
    this.add(btnadd);
    this.add(lab);
    this.addWindowListener(new WindowAdapter() {
        @Override
        public void windowClosing(WindowEvent windowEvent) {
            System.exit(0);
        }
    });

    btnexit.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            System.exit(0);
        }
    });
    btnadd.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            n++;
            lab.setText(Integer.toString(n));
        }
    });
}
}

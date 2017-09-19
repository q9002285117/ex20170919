import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainFrame extends Frame {
public MainFrame(){
    init();
}
private void init(){
    this.setLocation(100,200);
    this.setSize(50,100);
    this.addWindowListener(new WindowAdapter() {
        @Override
        public void windowClosing(WindowEvent windowEvent) {
            System.exit(0);
        }
    });
}
}

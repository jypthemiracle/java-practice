import java.awt.*;

public class SimpleExample extends Frame {
  public SimpleExample(){
    Frame newFrame = new Frame();
    Button newButton = new Button("Button!");

    //Creating a label
    Label newLabel = new Label("UserId: ");

    //Adding label to the frame
    newFrame.add(newLabel);

    //Creating Text field to the frame
    TextField textfield = new TextField(10);
    newFrame.add(textfield);

    //setting button position on the screen
    newButton.setBounds(100, 100, 100, 100);

    //adding buttons to the frame
    newFrame.add(newButton);

    //setting frame width and height
    newFrame.setSize(500, 300);

    //setting the layout for the frame
    newFrame.setLayout(new FlowLayout());

    newFrame.setVisible(true);
  }

  public static void main(String[] args) {
    //creating the instance of frame
    SimpleExample myfirstawt = new SimpleExample();
  }
}

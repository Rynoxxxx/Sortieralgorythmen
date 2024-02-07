import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BubbleSortGUI {
    private JPanel BubbleSort;
    private JButton sortiereButton;

    List<Integer> bubbleSort;

    public BubbleSortGUI() {
        bubbleSort=new List<>();

        int x=0;
        while(x>10){
            bubbleSort.append((int) (Math.random()*10));
            x++;
        }
        sortiereButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!bubbleSort.isEmpty()) {
                    bubbleSort.toFirst();
                    while (bubbleSort.hasAccess()) {
                        System.out.println(bubbleSort.getContent());
                        bubbleSort.next();

                    }
                    System.out.println("SORTIEREN STARTET");
                    bubbleSort.toFirst();
                    int temp=0;
                    int remove=0;
                    while (bubbleSort.hasAccess()){
                        temp= bubbleSort.getContent();
                        bubbleSort.next();
                        if(temp> bubbleSort.getContent()&&bubbleSort.hasAccess()){
                            bubbleSort.next();
                        }
                        if(!bubbleSort.hasAccess()){
                            bubbleSort.append(temp);
                        }
                        if(temp< bubbleSort.getContent()&& bubbleSort.hasAccess()){

                        }

                    }
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("BubbleSortGUI");
        frame.setContentPane(new BubbleSortGUI().BubbleSort);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

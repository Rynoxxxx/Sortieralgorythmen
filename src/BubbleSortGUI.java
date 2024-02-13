import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BubbleSortGUI {
    private JPanel BubbleSort;
    private JButton sortiereButton;

    List<Integer> unsortiert;
    List<Integer> sortiert;
    int[] num ;

    public BubbleSortGUI() {

        sortiert=new List<>();
        unsortiert=new List<>();

        int length=10;

        for(int i=0; i<length;i++){
            unsortiert.append((int) (Math.random()*10));
        }
        unsortiert.toFirst();
        System.out.println("----------------");
        while(unsortiert.hasAccess()){
            System.out.println(unsortiert.getContent());
            unsortiert.next();
        }
        System.out.println("----------------");

        /*int[] num =new int[10];
        for (int i =0; i<num.length;i++){
            num[i]=((int) (Math.random()*10));

        }
        System.out.println("-------------------");
        for(int i=0;i<num.length;i++){
            System.out.println(num[i]);

        }

        System.out.println("-------------------");
        */
        sortiereButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {



                    unsortiert.toFirst();
                    while (unsortiert.hasAccess()){

                        int temp=unsortiert.getContent();
                        unsortiert.next();
                        if(unsortiert.getContent()<temp&&unsortiert.hasAccess()){
                            int temp2=unsortiert.getContent();
                            unsortiert.toFirst();
                            if(!unsortiert.getContent().equals(temp)){
                                unsortiert.next();
                            }
                            unsortiert.remove();
                            if (!unsortiert.getContent().equals(temp2)){
                                unsortiert.next();
                            }
                            unsortiert.next();
                            unsortiert.insert(temp);
                            unsortiert.toFirst();
                            if(!unsortiert.getContent().equals(temp)){
                                unsortiert.next();
                            }

                        }
                        return;
                    }
                System.out.println("----------------------");
                while(unsortiert.hasAccess()){
                    System.out.println(unsortiert.getContent());
                    unsortiert.next();
                }
                System.out.println("----------------------");


                /*boolean gewechselt=true;
                while(gewechselt) {
                    gewechselt=false;
                    for (int i = 0; i < num.length - 1; i++) { //letztes element im array muss nicht gecheckt werden
                        if (num[i] > num[i + 1]) {//größer als nächstes objekt
                            gewechselt=true;
                            int temp = num[i];
                            num[i] = num[i + 1];
                            num[i + 1] = temp;

                        }

                    }
                }
                System.out.println("-------------------");
                for(int i = 0; i<num.length;i++) {
                System.out.println(num[i]);
            }
                System.out.println("-------------------");
        */
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

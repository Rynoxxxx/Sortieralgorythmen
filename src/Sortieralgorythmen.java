
public class Sortieralgorythmen {
    List <Integer> unsortiert;
    List <Integer> sortiert;

    int[] num ;
    int x=0;
    public Sortieralgorythmen() {
        sortiert=new List<>();
        unsortiert=new List<>();

        for(int i=0; i<10;i++){
            unsortiert.append((int) (Math.random()*10));
        }
        unsortiert.toFirst();
        System.out.println("----------------");
        while(unsortiert.hasAccess()){
            System.out.println(unsortiert.getContent());
            unsortiert.next();
        }
        System.out.println("----------------");


    }

}

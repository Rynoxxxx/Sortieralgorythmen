
public class Sortieralgorythmen {
    List <Integer> insertionU;
    List <Integer> insertionS;
    List <Integer> selectionU;
    List <Integer> selectionS;
    int x=0;
    public Sortieralgorythmen() {
        insertionU=new List<>();
        insertionS=new List<>();
        selectionU=new List<>();
        selectionS=new List<>();

        while(x>10){
            insertionU.append((int) (Math.random()*10));
            selectionU.append((int) (Math.random()*10));
            x++;
        }
        insertionU.toFirst();
        selectionU.toFirst();
        while(insertionU.hasAccess()) {
            insertionS.append(insertionU.getContent());
            insertionU.next();
            if(insertionU.getContent()> insertionS.getContent()){
                insertionS.append(insertionU.getContent());
            }
            else insertionS.insert(insertionU.getContent());
          }

    }

}

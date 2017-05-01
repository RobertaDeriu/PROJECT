import java.util.ArrayList;

public class Node {

    static int ID = 0;
    Pinguino pinguino;
    ArrayList<Pinguino> adiacenti;

    Node(Pinguino newPinguino) {
        // Associa il nodo al pinguino e lo aggiunge al grafo
        this.ID += 1;
        this.pinguino = newPinguino;
        this.adiacenti = null;
    }

    Pinguino getPinguino(){
        return this.pinguino;
    }

    void aggiungiAdiacenti(Node adiacente) {

    }


}

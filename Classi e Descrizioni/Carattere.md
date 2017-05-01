# Node

## Descrizione:
    Il carattere possiede metodi che andranno implementati
    in maniera differente per ognuno dei 4 comportamenti:
        - Moderati (Maschi)
        - Avventurieri (Maschi)
        - Prudenti (Femmine)
        - Spregiudicate (Femmine)
    

        
## Metodi

1. #### public boolean cercaPartner( );
        Cerca un partner compatibile con le statistiche
        dell'oggetto corrente e associarlo come partner
        nel campo relativo dell'oggetto Pinguino
        Ritorna true se viene trovato un partner adatto
1. #### public void procrea( ):
        Seleziona le caratteristiche comuni dei suoi antenati
        e crea un pinguino con DNA simile ai genitori e agli antenati
1. #### public boolean corteggia(Pinguino partner)
        Corteggia il partner per aumentare le statistiche di felicità
        dei pinguini.
        Ritorna true se il partner è soddisfatto

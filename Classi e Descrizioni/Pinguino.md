# Pinguino

## Descrizione:
    Classe per definire le caratteristiche dell'elemento più tomico del progetto,
    il pinguino avrà caratteristiche e metodi che consentiranno alla classe stessa
    (che estenderà un thread) di interagire con altri oggetti dello stesso tipo.
    
## Campi:

1. #### Nome:
        Type[String] Etichetta dell'oggetto
1. #### Età:
        Type[int] Età dell'oggetto
1. #### Sesso:
        Type[int] Maschio o Femmina
1. #### Carattere:
        Type[ ? ] A seconda sel sesso:
        Maschio:
            Moderati
            Avventurieri
        Femmine:
            Prudenti
            Spregiudicate
1. #### Figli
        Type[ArrayList<Pinguino>] Collezione di figli di tipo Pinguino        
1. #### Felicità:
        Type[int] Specifica lo stato di felicità di un pinguino

#
        
## Metodi

1. #### public void procrea( ):
        Seleziona le caratteristiche comuni dei suoi antenati
        e crea un pinguino con DNA simile ai genitori e agli antenati
1. #### public void cercaPartner( );
        Cerca un partner compatibile con le statistiche
        dell'oggetto corrente e associarlo come partner
        nel campo relativo dell'oggetto Pinguino
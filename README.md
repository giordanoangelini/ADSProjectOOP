# ADSProjectOOP
L'applicazione nel repository permette, tramite REST API (GET), di ottenere i friends Twitter di un utente e di
analizzare le descrizioni dei singoli friend al fine di effettuare analisi del testo, dei link, degli hashtag e 
dei tag presenti nella descrizione del profilo dei vari utenti.
E' inoltre possibile effettuare delle statistiche su tali dati e applicare una serie di filtri.

Statistiche:
Numero di caratteri medio delle descrizioni
precentuale sul totale di utenti con descrizione 
presenza di link e percentuale sul totale
presenza di hashtag e percentuale sul totale
presenza di tag e percentuale sul totale
descrizione più lunga
descrizione più corta

Possibilità  di filtraggio:
descrizioni presenti o meno
numero minimo di caratteri
numero massimo di caratteri
numero di caratteri reintrante in un range dato 
presenza o meno di tag
presenza o meno di link
presenza o meno di hashtag

più nello specifico viene effettuato lo stream di un file JSON contenente tutti i friends tramite l'API 
"https://wd4hfxnxxa.execute-api.us-east-2.amazonaws.com/dev/api/1.1/friends/list.json?screen_name=efrontoni&count=100".
Come si può notare nella parte finale della stringa, vengono richiesti 100 friends dell'utente corrispondente allo screen_name di "efrontoni"



<img src = "ADSProjectOOP/UML/01)%20UseCase.png" width = 400>


## Eseguire richieste ##
Per eseguire le richieste GET si può installare un API testing (ad esempio Postman). La seguente tabella mostra le richieste possibili.

|    TIPO        |ROTTA                          |DESCRIZIONE                               |
|----------------|-------------------------------|-------------------------------------------|
|GET             |/metadata                      |restituisce i metadati dei friends Twitter |
|GET             |/friends                       |restituisce nome e descrizione dei friends Twitter|
|GET             |/stats                         |restituisce una statistica sulle descrizioni dei friends|
|GET             |/filter                        |restituisce i friends che rispettano il tipo di filtraggio|

In particolare le possibilità di filtraggio sono:
|ROTTA|PARAMETRO|DESCRIZIONE|
|-|-|-|
|/filter/description|---|restituisce i friends che presentano effettivamente la descrizione|
|/filter/link|---|restituisce i friends che hanno un link nella descrizione|
|/filter/hashtag|---|restituisce i friends che hanno un hashtag nella descrizione|
|/filter/tag|---|restituisce i friends che hanno un tag nella descrizione|
|/filter/word|word = _parola_specificata_|restituisce i friends che hanno la parola specificata nella descrizione|
|/filter/less|max = _valore_massimo_|restituisce i friends che hanno una descrizione con numero di caratteri minore del massimo specificato|
|/filter/more|min = _valore_minimo_|restituisce i friends che hanno una descrizione con numero di caratteri maggiore del minimo specificato|
|/filter/between|min = _valore_minimo_, max = _valore_massimo_|restituisce i friends che hanno una descrizione con numero di caratteri maggiore del minimo e minore del massimo specificati|

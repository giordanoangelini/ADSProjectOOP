# ADSProjectOOP

## Introduzione
L'applicazione nel repository permette, tramite REST API (GET), di ottenere i friends Twitter di un utente e di
analizzare le descrizioni dei singoli friend al fine di effettuare analisi del testo, dei link, degli hashtag e 
dei tag presenti nella descrizione del profilo dei vari utenti.
E' inoltre possibile effettuare delle statistiche su tali dati e applicare una serie di filtri.

* Statistiche:
  * Numero di caratteri medio delle descrizioni;
  * Precentuale sul totale di utenti con descrizione;
  * Presenza di link e percentuale sul totale;
  * Presenza di hashtag e percentuale sul totale;
  * Presenza di tag e percentuale sul totale;
  * Descrizione più lunga;
  * Descrizione più corta.

* Possibilità  di filtraggio ([specifiche](https://github.com/giordanoangelini/ADSProjectOOP/#eseguire-richieste)):
  * Descrizioni presenti o meno;
  * Numero minimo di caratteri;
  * Numero massimo di caratteri;
  * Numero di caratteri reintrante in un range dato;
  * Presenza o meno di tag;
  * Presenza o meno di link;
  * Presenza o meno di hashtag.

Più nello specifico viene effettuato lo stream di un file JSON contenente tutti i friends tramite l'API 
"https://wd4hfxnxxa.execute-api.us-east-2.amazonaws.com/dev/api/1.1/friends/list.json?screen_name=efrontoni&count=100".
Come si può notare nella parte finale della stringa, vengono richiesti 100 friends dell'utente corrispondente allo screen_name di "efrontoni". In seguito i dati di interesse vengono prelevati dal file e salvati in un database costituito da un Vector.

## Azioni possibili
Le azioni effettuabili dal client sono:

<img src = "ADSProjectOOP/UML/01)%20UseCase.png" width = 400>


## Eseguire richieste
Per eseguire le richieste GET si può installare un API testing (ad esempio Postman). La seguente tabella mostra le richieste possibili.

|    TIPO        |ROTTA                          |DESCRIZIONE                               |
|----------------|-------------------------------|-------------------------------------------|
|GET             |/metadata                      |restituisce i metadati dei friends Twitter |
|GET             |/friends                       |restituisce nome e descrizione dei friends Twitter|
|GET             |/stats                         |restituisce delle statistiche sulle descrizioni dei friends|
|GET             |/filter                        |restituisce i friends che rispettano il tipo di filtraggio|

In particolare le possibilità di filtraggio sono:
|ROTTA|PARAMETRO|DESCRIZIONE|
|-|-|-|
|/filter/description|---|restituisce i friends che hanno descrizione non vuota|
|/filter/notDescription|---|restituisce i friends che hanno descrizione vuota|
|/filter/link|---|restituisce i friends che hanno un link nella descrizione|
|/filter/hashtag|---|restituisce i friends che hanno un hashtag nella descrizione|
|/filter/tag|---|restituisce i friends che hanno un tag nella descrizione|
|/filter/word|word = _parola_data_|restituisce i friends che hanno la parola specificata nella descrizione|
|/filter/less|max = _valore_massimo_|restituisce i friends che hanno una descrizione con numero di caratteri minore del massimo specificato|
|/filter/more|min = _valore_minimo_|restituisce i friends che hanno una descrizione con numero di caratteri maggiore del minimo specificato|
|/filter/between|min = _valore_minimo_, max = _valore_massimo_|restituisce i friends che hanno una descrizione con numero di caratteri maggiore del minimo e minore del massimo specificati|

## UML
### Class Diagram

#### it.SpringBootAPI.ADSProjectOOP

<img src = "ADSProjectOOP/UML/02)%20ADSProjectOOP.png">

#### Application

<img src = "ADSProjectOOP/UML/10)%20Application.png" width = 400>

#### it.SpringBootAPI.ADSProjectOOP.controller

<img src = "ADSProjectOOP/UML/09)%20Controller.png" width = 400>

#### it.SpringBootAPI.ADSProjectOOP.fetch

<img src = "ADSProjectOOP/UML/03)%20FetchClass.png" width = 200>

#### it.SpringBootAPI.ADSProjectOOP.model

<img src = "ADSProjectOOP/UML/04)%20User%26FrontUser.png" width = 500>

#### it.SpringBootAPI.ADSProjectOOP.database

<img src = "ADSProjectOOP/UML/05)%20FrontDatabase%26Database.png" width = 500>

#### it.SpringBootAPI.ADSProjectOOP.util.stats

<img src = "ADSProjectOOP/UML/07)%20DescriptionStats.png" width = 400>

#### it.SpringBootAPI.ADSProjectOOP.util.filters

<img src = "ADSProjectOOP/UML/06)%20Filter.png">

#### it.SpringBootAPI.ADSProjectOOP.exceptions

<img src = "ADSProjectOOP/UML/08)%20Exception.png" width = 500>

### Sequence Diagram

## Note

### Software utilizzati
* [Eclipse](https://www.eclipse.org/) - ambiente di sviluppo integrato
* [Spring Boot](https://spring.io/projects/spring-boot) - framework per sviluppo applicazioni Java
* [Maven](https://maven.apache.org/) - strumento di gestione di progetti

### Autori
* Giordano Angelini: [Github](https://github.com/giordanoangelini)
* Cristian Di Silvestre: [Github](https://github.com/DiSilvestreCristian)

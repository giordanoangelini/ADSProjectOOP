# ADSProjectOOP

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

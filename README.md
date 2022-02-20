![banner2](https://user-images.githubusercontent.com/98795895/154868955-d0440bb6-72d7-4625-ae40-5be629a6af22.png)

![topo2](https://user-images.githubusercontent.com/98795895/154868980-edbe6910-dbf5-4925-a7ad-e32f2ee89d18.png)


#### Segue abaixo instruções para execução dos questionariois, no pacote br.com.geyson.desafio.principal tem uma class Main com o metodo static main, nesse metodo tem os exemplo de execução da questão



>Questão 01 Escadas:
>

```
new Escada().fazer(6);

Saida:
     *
    **
   ***
  ****
 *****
******
```

>Questão 02 Senha:
>

```
new Senha().validar("Ya3");

Saida:
Senha   : Ya3
Sugestão: Ya3#qb
Sua senha é fraca veja a sugestão para uma senha forte.
```

>Questão 03 Anagrama:
>

```
new Anagrama().busrcarAnagrama("ifailuhkqq");

Saida:
Anagramas : [i, i, q, q, ifa, fai]
Quantidade: 3
```

>Metodo Run:

```
public class Run {
    public static void main(String[] args) {
        new Anagrama().busrcarAnagrama("ifailuhkqq");
        new Senha().validar("Ya3");
        new Escada().fazer(6);
    }
}

Saidas:
----Tarfefa encontrar Anagramas
Anagramas : [i, i, q, q, ifa, fai]
Quantidade: 3
-------------------------------

----Tarefa de verificação senha
Senha   : Ya3
Sugestão: Ya3+dv
Sua senha é fraca veja a sugestão para uma senha forte.
-------------------------------

-------------Tarefa 01 - escada
     *
    **
   ***
  ****
 *****
******
-------------------------------

```

> Email: geysonfelipee@gmail.com


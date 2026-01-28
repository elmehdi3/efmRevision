//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
   var compteCourant=Compte("12334",2536)
    var compteCourant2=Compte("4321",79655)
    compteCourant.deposer(60000)
    var cp1=ComptePayant("987",87262)
    cp1.deposer(60000)
    cp1.Retirer(10000)
    fun Epargne.Afficher(){
        println("le solde et")
        println(this.solde)
    }
    var ce=Epargne("erttet",10000)
    ce.Retirer(1000)
    ce.deposer(1000)
    ce.calculInteret()
    ce.Afficher()


    }
open  class Compte(
    var code :String ,
    var solde :Int= 0) {
    open fun deposer (somme :Int){
        if (somme == null    ){
         println("Somme is null")
    }else{
            solde+=somme
    }}
    open fun Retirer(Somme:Int){
        if(Somme <= solde){
            solde-=Somme
        }
    }

    override fun toString(): String {
        return "le solde {solde} et lo code  "
    }
}